package com.team.moblocation.core.data.repo

class UserRepo: IUserRepo {
    override fun getUser(): String {
        // Call actual api or database query to get the info
        return "Hello User"
    }
}

