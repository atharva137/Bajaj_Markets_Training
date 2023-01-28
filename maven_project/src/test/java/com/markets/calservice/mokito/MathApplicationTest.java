package com.markets.calservice.mokito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

//@RunWith(MockitoJUnitRunner.class)

class MathApplicationTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

//	@InjectMocks
//    MathApplication obj = new MathApplication();
//	@Mock
//	CalService service ;
	CalService service;
	MathApplication obj;

	@BeforeEach
	public void init() {
		service = mock(CalService.class);
		obj = new MathApplication(service);
	}

	@Test
	public void testMath() {

		

		when(service.add(10.0, 20.0)).thenReturn(30.0);
		
		when(service.subtract(20.0, 10.0)).thenReturn(10.0);

		double actual = obj.addition(10.0, 20.0);
		double expected = 30.0;

		assertEquals(actual, expected);
		assertEquals(obj.addition(10.0,20.0), expected);
		assertEquals(obj.addition(10.0,20.0), expected);
//		assertEquals(obj.addition(10.0,20.0), expected);
//		assertEquals(obj.addition(10.0,20.0), expected);
		
		
		assertEquals(obj.subtract(20.0,10.0),10.0);
		
		;
		// Verify call to service to check weather its a same parameter or not
		verify(service,times(3)).add(10.0, 20.0);
		verify(service).subtract(20.0, 10.0);
		
		
	}

	// mock exception
	@Test
	public void testMultiplyException() {

		doThrow(new RuntimeException("multiply operation is not implemented")).when(service).multiply(10.0, 20.0);

		assertEquals(obj.multiply(10.0, 20.0), 300.00);
	}

	// inorder

	@Test
	
	public void testAddSubtract() {
		
		when(service.add(10.0,20.0)).thenReturn(30.0);
		
		when(service.subtract(20.0, 10.0)).thenReturn(10.0);
		
		
		assertEquals(obj.addition(10.0, 20.0),30.0);
		
		assertEquals(obj.subtract(20.0, 10.0),10.0);
		
		assertEquals(obj.addition(10.0, 20.0),30.0);
		
		assertEquals(obj.subtract(20.0, 10.0),10.0);
		
		
		
		InOrder inOrder = Mockito.inOrder(service);
		
		inOrder.verify(service,times(2)).add(10.0, 20.0);
		inOrder.verify(service,times(2)).subtract(20.0, 10.0);
		
		
     }
	
	// CAllBACKS
	@Test
	
	public void testDivisionCallBack() {
		
		when(service.division(10.0, 5.0)).thenAnswer(new Answer<Double>(){

			@Override
			public Double answer(InvocationOnMock invocation) throws Throwable {
				
				// TODO Auto-generated method stub
				
				Object [] args = invocation.getArguments();
				Object mock = invocation.getMock();
				System.out.println(mock);
				double num1 = (Double)args[0];
				double num2 = (Double) args[1];
				return num1/num2;
			}
			
		});
		
		
		assertEquals(obj.division(10.0, 5.0),2.0);
		
	}
	
	
	@Test
	
	public void testSubtractSpy() {
		service = spy(CalService.class);
		
		assertEquals(obj.subtract(5.0, 5.0),0.0);
	}

}
