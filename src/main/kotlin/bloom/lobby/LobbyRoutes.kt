package bloom.lobby

import bloom.core.context.ServerContext
import bloom.core.web.guard.OptionalAccountGuard
import bloom.core.web.guard.getAccountData
import bloom.kpop.Members
import bloom.lobby.view.model.LobbyModel
import bloom.lobby.view.response.ActivityResponse
import encore.fancam.Fancam
import encore.route.RouteHandler
import encore.route.guard
import encore.route.guard.NoAuthGuard
import encore.serialization.JSON
import encore.time.TimeCenter
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*
import java.text.SimpleDateFormat

/**
 * Routes for lobby, which is the root page `/`.
 */
class LobbyRoutes(private val serverContext: ServerContext) : RouteHandler {
    private val optionalAccountGuard = OptionalAccountGuard(serverContext)

    override fun Route.install() {
        get("/") {
            guard(call, optionalAccountGuard) {
                val systemTime = TimeCenter.now()
                val bias = Members.all.random()

                val data = LobbyModel(
                    account = call.attributes.getAccountData(),
                    time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(systemTime),
                    bias = bias,
                )

                call.respond(ThymeleafContent("lobby", mapOf("data" to data)))
            }
        }

        get("/activity") {
            guard(call, NoAuthGuard) {
                val afterTimestamp = call.queryParameters["after"]?.toLongOrNull() ?: run {
                    call.respond(HttpStatusCode.BadRequest)
                    return@guard
                }

                Fancam.debug { "Request to /activity" }



                val response = ActivityResponse(
                    serverContext.subunits.activityFeed.retrieve(15, afterTimestamp)
                )

                call.respond(JSON.encode(response))
            }
        }
    }
}
