package bloom.core.web.utils

import bloom.core.web.common.Action
import bloom.core.web.common.ErrorModel
import bloom.core.web.guard.getAccountData
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.thymeleaf.*

/**
 * Respond with an error page of BadRequest (400).
 */
suspend fun ApplicationCall.badRequest() {
    val data = ErrorModel(
        account = attributes.getAccountData(),
        title = "Bad request",
        heading = "Bad request",
        message = "",
        action = Action("/", "Back to lobby")
    )
    respond(HttpStatusCode.BadRequest, ThymeleafContent("error", mapOf("data" to data)))
}

/**
 * Respond with an error page of InternalServerError (500).
 */
suspend fun ApplicationCall.serverError(reason: String = "Internal server error") {
    respond(HttpStatusCode.InternalServerError, mapOf("reason" to reason))
}
