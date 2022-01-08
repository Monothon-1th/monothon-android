package com.monothon.echofriendly.data.response

/**
 * Created by Yeji on 2022/01/08.
 */
data class ResponseData<T>(
    val status: Int,
    val data: T
)

data class UserResponse(
    val result: String = ""
)