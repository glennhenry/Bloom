package bloom.profile.subunits

import bloom.core.mongo.collection.UserAccount
import bloom.profile.model.Profile
import kotlinx.serialization.Serializable

/**
 * Represent a summarized view of a user account and profile.
 *
 * This model is a small data typically used across the website
 * that doesn't include every fields of [UserAccount] and [Profile]
 *
 * @property userId References to [UserAccount].
 * @property username Username of the user.
 * @property displayName Display name of the user.
 * @property avatarUrl Directory path that points to the user's avatar image.
 */
@Serializable
data class UserSummary(
    val userId: String,
    val username: String,
    val displayName: String,
    val avatarUrl: String
)
