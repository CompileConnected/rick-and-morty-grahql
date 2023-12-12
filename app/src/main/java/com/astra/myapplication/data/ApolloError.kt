package com.astra.myapplication.data

import com.apollographql.apollo3.api.Error

data class ApolloError(val error: List<Error>): Exception()
