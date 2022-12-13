package org.train.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.train.app.model.CalculatorRequest;
import org.train.app.model.CalculatorResponse;

@Component
public class CalculatorService {
    private final static Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public CalculatorResponse calculate(CalculatorRequest request) {
        CalculatorResponse response = new CalculatorResponse();
        response.setStatus(200);
        response.setAnswer(2);
        return response;
    }
}
