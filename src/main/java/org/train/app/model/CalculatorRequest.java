package org.train.app.model;

public class CalculatorRequest {
    private String operation;
    private int argumentLeft;
    private int argumentRight;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getArgumentLeft() {
        return argumentLeft;
    }

    public void setArgumentLeft(int argumentLeft) {
        this.argumentLeft = argumentLeft;
    }

    public int getArgumentRight() {
        return argumentRight;
    }

    public void setArgumentRight(int argumentRight) {
        this.argumentRight = argumentRight;
    }

    @Override
    public String toString() {
        return "CalculatorRequest{" +
                "argumentLeft=" + argumentLeft +
                ", operation='" + operation + '\'' +
                ", argumentRight=" + argumentRight +
                '}';
    }
}
