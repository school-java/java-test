package org.train.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.train.app.model.CalculatorRequest;
import org.train.app.model.CalculatorResponse;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class CalculatorController {
    private final static Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService appService) {
        this.calculatorService = appService;
    }

    @PostMapping("/calculate")
    public Mono<CalculatorResponse> calculate(@RequestBody CalculatorRequest request) {
        return null;
    }
}
