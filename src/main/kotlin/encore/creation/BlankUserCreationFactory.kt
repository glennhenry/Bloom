package encore.creation

import encore.utils.types.Report
import bloom.profile.model.Profile
import bloom.core.mongo.collection.UserAccount
import bloom.core.mongo.collection.UserId

class BlankUserCreationFactory: UserCreationFactory {
    override fun userId(isAdmin: Boolean): UserId {
        TODO("Not yet implemented")
    }

    override fun account(
        userId: UserId,
        username: String,
        password: String,
        email: String
    ): UserAccount {
        TODO("Not yet implemented")
    }

    override fun profile(
        userId: UserId,
        username: String
    ): Profile {
        TODO("Not yet implemented")
    }

    override fun updateServerObjects(
        account: UserAccount
    ): Report {
        TODO("Not yet implemented")
    }
}
