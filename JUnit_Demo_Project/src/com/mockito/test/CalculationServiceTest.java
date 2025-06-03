package com.mockito.test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//
//import com.mockito.AdditionService;
//import com.mockito.CalculationService;
//
//
//class CalculationServiceTest {
//
//	@Mock
//	AdditionService additionService;
//	
//	@InjectMocks
//	CalculationService calculationService; 
//	
//	@Test
//	void testPerformAddition() {
//		int actual = calculationService.performAddition(10, 24);
//		int expected = 34;
//		assertEquals(expected, actual);
//	}
//
//}



import static org.junit.Assert.assertEquals; // Use JUnit 4 assertion inside JUnit 5
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith; // Use JUnit 5 extension
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import net.bytebuddy.agent.ByteBuddyAgent;

import com.mockito.AdditionService;
import com.mockito.CalculationService;

//@ExtendWith(MockitoExtension.class) // JUnit 5 setup for Mockito
public class CalculationServiceTest {

    @Mock
    private AdditionService additionService;

    @InjectMocks
    private CalculationService calculationService;

    @Before
    public void setUp() {
        ByteBuddyAgent.install(); // Ensures Byte Buddy Agent is installed properly
        MockitoAnnotations.openMocks(this); // Initialize Mockito Mocks (JUnit 5 compatible)
    }

    @Test
    public void testPerformAddition() {
        // Define mock behavior
        Mockito.when(additionService.getAddition(10, 24)).thenReturn(34);

        // Act
        int actual = calculationService.performAddition(10, 24);
        int expected = 34;

        // Assert
        assertEquals(expected, actual);
    }
}
