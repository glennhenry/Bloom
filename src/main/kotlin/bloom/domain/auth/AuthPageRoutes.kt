package bloom.domain.auth

import encore.route.RouteHandler
import encore.route.handle
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*
import bloom.context.ServerContext
import bloom.routes.common.BasicModel
import bloom.routes.guard.MustNotHaveAccountGuard
import bloom.routes.guard.OptionalAccountGuard
import bloom.routes.guard.getAccountData

/**
 * The routes for authentication pages. For authentication API: [AuthApiRoutes].
 *
 * - `/register`
 * - `/login`
 * - `/logout`
 */
class AuthPageRoutes(serverContext: ServerContext) : RouteHandler {
    private val optionalAccountGuard = OptionalAccountGuard(serverContext)
    private val mustNotHaveAccountGuard = MustNotHaveAccountGuard(serverContext, serverContext.subunits.websiteSession)

    override fun Route.install() {
        get("/register") {
            handle(call, mustNotHaveAccountGuard) {
                call.respond(
                    ThymeleafContent(
                        "register",
                        mapOf("data" to BasicModel(null))
                    )
                )
            }
        }

        get("/login") {
            handle(call, mustNotHaveAccountGuard) {
                call.respond(
                    ThymeleafContent(
                        "login",
                        mapOf("data" to BasicModel(null))
                    )
                )
            }
        }

        get("/logout") {
            handle(call, optionalAccountGuard) {
                call.respond(
                    ThymeleafContent(
                        "logout", mapOf(
                            "data" to BasicModel(
                                account = call.attributes.getAccountData(),
                            )
                        )
                    )
                )
            }
        }
    }
}
