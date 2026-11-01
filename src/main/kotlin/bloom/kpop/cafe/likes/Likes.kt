package bloom.kpop.cafe.likes

import bloom.core.mongo.collection.UserId
import kotlinx.serialization.Serializable

/**
 * Represent a like relationship between a user with a cafe post
 * which could either be a topic or reply.
 *
 * @property userId The [UserId] liking the post.
 * @property postId Unique identifier of the liked post.
 *                  References [Topic.topicId] or [Reply.replyId].
 * @property castedAt Timestamp of when the like was casted.
 */
@Serializable
data class Likes(
    val userId: UserId,
    val postId: String,
    val castedAt: Long
)
