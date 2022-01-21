package com.ipsoft.wordguess.domain.usecases

import com.ipsoft.wordguess.data.entities.request.WordRequest
import com.ipsoft.wordguess.data.entities.response.WordResponse
import com.ipsoft.wordguess.domain.repository.Repository
import com.ipsoft.wordguess.domain.usecases.RandomWordUseCase.Params
import javax.inject.Inject

class RandomWordUseCase
@Inject constructor(private val repository: Repository) :
    UseCase<WordResponse, Params>() {

    override suspend fun run(params: Params) = repository.getRandomWord(params.wordRequest)

    data class Params(val wordRequest: WordRequest)

}