package com.mockito;

public class CalculatorNew {
    private final AddService addService;

    public CalculatorNew(AddService addService) {
        this.addService = addService;
    }

    public int performAddition(int a, int b) {
        return addService.getAddition(a, b);
    }
}
