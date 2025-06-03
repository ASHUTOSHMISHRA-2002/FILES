package com.mockito.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import net.bytebuddy.agent.ByteBuddyAgent;

import com.mockito.AddService;
import com.mockito.CalculatorNew;

@RunWith(MockitoJUnitRunner.class) // Enables Mockito for JUnit 4
public class CalculatorNewTest {

    @Mock
    private AddService addService; // Create mock instance of AddService

    @InjectMocks
    private CalculatorNew calculatorNew; // Injects the mock into CalculatorNew automatically

//    @Before
//    public void setUp() {
//        // Suppress Byte Buddy warnings dynamically
//        System.setProperty("jdk.instrument.traceUsage", "true");
//        System.setProperty("jdk.instrument.enableDynamicAgentLoading", "true");
//
//        // Install Byte Buddy Agent properly
//        ByteBuddyAgent.install();
//
//        // IMPORTANT: Do NOT call MockitoAnnotations.openMocks(this) because MockitoJUnitRunner already initializes mocks!
//    }

    @Test
    public void testPerformAddition() {
        // Debugging: Check if mocks are initialized properly
        System.out.println("CalculatorNew instance: " + calculatorNew);
        System.out.println("AddService instance: " + addService);

        // Mock behavior setup
        Mockito.when(addService.getAddition(10, 24)).thenReturn(34);

        // Additional Debugging
        System.out.println("Mocked Addition Result: " + addService.getAddition(10, 24));

        // Act
        int actual = calculatorNew.performAddition(10, 24);
        int expected = 34;

        // Assert
        assertEquals(expected, actual);
    }
}
