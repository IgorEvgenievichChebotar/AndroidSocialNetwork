package ru.rutmiit.androidsocialnetwork.repos

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.URLProtocol
import io.ktor.http.contentType
import io.ktor.http.path
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import ru.rutmiit.androidsocialnetwork.data.Character
import kotlin.time.Duration.Companion.seconds

class CharacterRepositoryImpl : CharacterRepository {
    private val baseUrl = "anapioficeandfire.com"

    private val json = Json {
        isLenient = true
        ignoreUnknownKeys = true
    }

    private val client: HttpClient by lazy {
        HttpClient(engine = OkHttp.create()) {
            install(ContentNegotiation) { json(json) }

            install(HttpTimeout) {
                connectTimeoutMillis = 20.seconds.inWholeMilliseconds
                requestTimeoutMillis = 60.seconds.inWholeMilliseconds
                socketTimeoutMillis = 20.seconds.inWholeMilliseconds
            }

            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.ALL
            }
        }
    }

    override suspend fun getCharacters(): List<Character> {
        return try {
            client.get {
                url {
                    host = baseUrl
                    protocol = URLProtocol.HTTPS
                    contentType(ContentType.Application.Json)
                    path("api/characters")
                    parameters.append("page", "29")
                    parameters.append("pageSize", "50")
                }
            }.let { response ->
                Log.d("Response:", response.body())
                response.body()
            }
        } catch (exception: Exception) {
            Log.e("Error occurred: ", exception.message.toString())
            listOf()
        }
    }
}