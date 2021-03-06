package com.ipsoft.wordguess.data.datasource.remote

import com.ipsoft.wordguess.data.datasource.remote.entities.request.ValidateWordResponse
import com.ipsoft.wordguess.data.datasource.remote.entities.request.WordRequest
import com.ipsoft.wordguess.data.datasource.remote.entities.response.NearWordResponse
import com.ipsoft.wordguess.data.datasource.remote.entities.response.WordResponse
import retrofit2.Call
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteService
@Inject constructor(retrofit: Retrofit) : Api {
    private val api by lazy { retrofit.create(Api::class.java) }

    override fun getRandomWord(request: WordRequest): Call<WordResponse> =
        api.getRandomWord(request)


    override fun validateWord(url: String): Call<ValidateWordResponse> =
        api.validateWord(url)

    override fun nearWord(url: String): Call<NearWordResponse> =
        api.nearWord(url)

}