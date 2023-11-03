package com.mhs.cryptowithjetpack.data.remote.dto

import Stats

data class LinksExtended(
    val stats: Stats,
    val type: String,
    val url: String
)