package org.train.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.train.app.model.CalculatorRequest;
import org.train.app.model.CalculatorResponse;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@AutoConfigureMockMvc
class CalculatorControllerTests {

    @Autowired
    WebTestClient webTestClient;

    @Test
    void contextLoads() {
        assertThat(webTestClient).isNotNull();
    }

    // 1 + 1 = 2
    @Test
    public void test1Plus1() {
        CalculatorRequest request = new CalculatorRequest();
        request.setArgumentLeft(1);
        request.setOperation("plus");
        request.setArgumentRight(1);

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(200);
        response.setAnswer(2);

        webTestClient.post()
                .uri("/api/v1/calculate")
                .bodyValue(request)
                .header("Content-Type", "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CalculatorResponse.class)
                .isEqualTo(response);
    }

    // 1 + 2 = 3
    @Test
    public void test1Plus2() {
        CalculatorRequest request = new CalculatorRequest();
        request.setArgumentLeft(1);
        request.setOperation("plus");
        request.setArgumentRight(2);

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(200);
        response.setAnswer(3);

        webTestClient.post()
                .uri("/api/v1/calculate")
                .bodyValue(request)
                .header("Content-Type", "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CalculatorResponse.class)
                .isEqualTo(response);
    }

    // 1 - 1 = 0
    @Test
    public void test1Minus1() {
        CalculatorRequest request = new CalculatorRequest();
        request.setArgumentLeft(1);
        request.setOperation("minus");
        request.setArgumentRight(1);

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(200);
        response.setAnswer(0);

        webTestClient.post()
                .uri("/api/v1/calculate")
                .bodyValue(request)
                .header("Content-Type", "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CalculatorResponse.class)
                .isEqualTo(response);
    }

    // 2 - 1 = 1
    @Test
    public void test2Minus1() {
        CalculatorRequest request = new CalculatorRequest();
        request.setArgumentLeft(2);
        request.setOperation("minus");
        request.setArgumentRight(1);

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(200);
        response.setAnswer(1);

        webTestClient.post()
                .uri("/api/v1/calculate")
                .bodyValue(request)
                .header("Content-Type", "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CalculatorResponse.class)
                .isEqualTo(response);
    }

    // 1 * 1 = 1
    @Test
    public void test1Multiply1() {
        CalculatorRequest request = new CalculatorRequest();
        request.setArgumentLeft(1);
        request.setOperation("multiply");
        request.setArgumentRight(1);

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(200);
        response.setAnswer(1);

        webTestClient.post()
                .uri("/api/v1/calculate")
                .bodyValue(request)
                .header("Content-Type", "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CalculatorResponse.class)
                .isEqualTo(response);
    }

    // 2 * 2 = 4
    @Test
    public void test1Multiply2() {
        CalculatorRequest request = new CalculatorRequest();
        request.setArgumentLeft(2);
        request.setOperation("multiply");
        request.setArgumentRight(2);

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(200);
        response.setAnswer(4);

        webTestClient.post()
                .uri("/api/v1/calculate")
                .bodyValue(request)
                .header("Content-Type", "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CalculatorResponse.class)
                .isEqualTo(response);
    }

    // 2 / 1 = 2
    @Test
    public void test2Multiply1() {
        CalculatorRequest request = new CalculatorRequest();
        request.setArgumentLeft(2);
        request.setOperation("divide");
        request.setArgumentRight(1);

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(200);
        response.setAnswer(2);

        webTestClient.post()
                .uri("/api/v1/calculate")
                .bodyValue(request)
                .header("Content-Type", "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CalculatorResponse.class)
                .isEqualTo(response);
    }

    /**
     * Делить на 0 нельзя
     * Должны получить статус = 500
     * <p>
     * 2 / 0 = ?
     */
    @Test
    public void test2Divide0() {
        CalculatorRequest request = new CalculatorRequest();
        request.setArgumentLeft(2);
        request.setOperation("divide");
        request.setArgumentRight(0);

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(500);

        webTestClient.post()
                .uri("/api/v1/calculate")
                .bodyValue(request)
                .header("Content-Type", "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(CalculatorResponse.class)
                .isEqualTo(response);
    }
}
