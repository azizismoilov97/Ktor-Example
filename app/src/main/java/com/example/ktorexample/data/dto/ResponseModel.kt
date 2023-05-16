package com.example.ktorexample.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class ResponseModel(
    val title: String,
    val description: String,
    val image: String
)