package com.eddev.application.controller

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.junit.jupiter.api.Test

@QuarkusTest
internal class RegistryControllerTest {

    @Test
    fun getPhylum() {
        RestAssured.given()
            .`when`().get("/registries/phylumns")
            .then()
            .statusCode(200)
    }
}