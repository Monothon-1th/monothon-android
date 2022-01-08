package com.monothon.echofriendly.network

import com.monothon.echofriendly.data.Challenge
import com.monothon.echofriendly.data.User
import com.monothon.echofriendly.data.request.JoinRequest
import com.monothon.echofriendly.data.response.ResponseSimpleData
import com.monothon.echofriendly.data.response.ResponseResultData
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * Created by Yeji on 2022/01/08.
 */
interface RetrofitService {
    @GET("/api/challenge/all")
    suspend fun getChallengeList(): Response<ResponseResultData<List<Challenge>>>

    @POST("/api/auth/login")
    suspend fun getUserId(
        @Body user: User
    ): Response<ResponseResultData<Int>>

    @GET("/api/challenge/args?")
    suspend fun getChallenge(
        @Query("id") challengeId: Int
    ): Response<ResponseSimpleData<Challenge>>

    @POST("/api/participate/create")
    suspend fun joinChallenge(
        @Body response: JoinRequest
    ): Response<Unit>
}