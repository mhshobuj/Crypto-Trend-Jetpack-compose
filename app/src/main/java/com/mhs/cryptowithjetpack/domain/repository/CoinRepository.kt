package com.mhs.cryptowithjetpack.domain.repository

import CoinDetailDto
import com.mhs.cryptowithjetpack.data.remote.dto.CoinDto


interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}