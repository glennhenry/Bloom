package bloom.kpop.cafe.topic

import bloom.core.mongo.collection.UserAccount
import kotlinx.serialization.Serializable

/**
 * Representation of cafe's topic in the database.
 *
 * @property topicId Unique identifier of the topic.
 * @property sectionId Identifier of the section this topic belongs to. References [Section.id].
 * @property title The title of the topic.
 * @property authorId Identifier of the user who posted this topic. References [UserAccount.userId].
 * @property content The content of the topic.
 * @property likes The amount of likes the topic has.
 * @property replies The amount of replies the topic has.
 * @property postedDate Epoch millis of when the topic was posted.
 * @property latestPost The latest post of this topic.
 */
@Serializable
data class Topic(
    val topicId: String,
    val sectionId: String,
    val title: String,
    val authorId: String,
    val content: String,
    val likes: Int,
    val replies: Int,
    val postedDate: Long,
    val latestPost: LatestPostInfo?,
)
