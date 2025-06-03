package com.mockito;
//
//public class CalculationService {
//	AdditionService additionService;
//
//	public CalculationService(AdditionService additionService) {
//		super();
//		this.additionService = additionService;
//	}
//	public int performAddition(int a,int b) {
//		return additionService.getAddition(a,b);
//	}
//}


public class CalculationService {
    private final AdditionService additionService;

    public CalculationService(AdditionService additionService) {
        this.additionService = additionService;
    }

    public int performAddition(int a, int b) {
        return additionService.getAddition(a, b);
    }
}
