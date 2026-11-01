package bloom.kpop.cafe.view.model

import bloom.core.web.common.AccountData

/**
 * Model for the `/cafe/{section}/write`, uses `writetopic.html`.
 *
 * @property account Optional [AccountData] of the user.
 * @property sectionName The name of where the topic is written to. Uses [SectionItem.name].
 */
data class WriteTopicModel(
    val account: AccountData?,
    val sectionName: String
)
