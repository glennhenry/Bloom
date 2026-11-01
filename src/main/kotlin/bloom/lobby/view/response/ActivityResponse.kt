package bloom.lobby.view.response

import bloom.lobby.activityFeed.ActivityFeedData
import kotlinx.serialization.Serializable

/**
 * Response model for the '/activity' route.
 * @property activities A list of activities data.
 */
@Serializable
data class ActivityResponse(
    val activities: List<ActivityFeedData>
)
