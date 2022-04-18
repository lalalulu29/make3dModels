package ru.kirill98.make3dModels.controllers;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import ru.kirill98.make3dModels.Make3dModelsApplication;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LogsControllerTest {
    private static ConfigurableApplicationContext springApplication;
    @BeforeAll
    public static void setup() {
        springApplication = SpringApplication.run(Make3dModelsApplication.class);
    }

    @Test
    void getNedAuthCodeWhenTryingGetLogs() throws IOException {
        HttpUriRequest request = new HttpGet( "http://localhost:8899/log/get_all_logs/" );
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_UNAUTHORIZED);
    }
    @AfterAll
    public static void stop() {
        springApplication.stop();
    }
}
