package org.train.app.model;

import java.util.Objects;

public class CalculatorResponse {
    private int status;
    private Integer answer;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorResponse response = (CalculatorResponse) o;
        return status == response.status && Objects.equals(answer, response.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, answer);
    }

    @Override
    public String toString() {
        return "CalculatorResponse{" +
                "status=" + status +
                ", answer=" + answer +
                '}';
    }
}
