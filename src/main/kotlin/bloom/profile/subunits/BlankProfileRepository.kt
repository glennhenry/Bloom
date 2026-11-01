package bloom.profile.subunits

import bloom.core.mongo.collection.UserId
import bloom.profile.model.FanProfileSummary
import bloom.profile.model.OverviewSummary
import bloom.profile.model.Profile

class BlankProfileRepository: ProfileRepository {
    override suspend fun insert(profile: Profile): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun getProfile(userId: UserId): Result<Profile> {
        TODO("Not yet implemented")
    }

    override suspend fun getProfileOverview(userId: UserId): Result<OverviewSummary> {
        TODO("Not yet implemented")
    }

    override suspend fun getFanProfile(userId: UserId): Result<FanProfileSummary> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserSummary(userId: UserId): Result<UserSummary> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserSummaries(userIds: List<UserId>): Result<Map<UserId, UserSummary>> {
        TODO("Not yet implemented")
    }
}
