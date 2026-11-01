package bloom.kpop.cafe.reply

import bloom.core.mongo.collection.UserAccount
import kotlinx.serialization.Serializable

/**
 * Representation of cafe's topic reply in the database.
 *
 * @property replyId Unique identifier of the reply.
 * @property topicId Identifier of the topic this reply belongs to. References [Topic.topicId].
 * @property authorId Identifier of the user who posted this reply. References [UserAccount.userId].
 * @property content The content of the reply.
 * @property likes The amount of likes the topic has.
 * @property postedDate Epoch millis of when the reply was posted.
 * @property comments [Comment]s for this reply.
 */
@Serializable
data class Reply(
    val replyId: String,
    val topicId: String,
    val authorId: String,
    val content: String,
    val likes: Int,
    val postedDate: Long,
    val comments: List<Comment>
)
