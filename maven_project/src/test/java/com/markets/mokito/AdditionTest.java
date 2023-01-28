package com.markets.mokito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.RuntimeException;

import org.junit.jupiter.api.Test;

class AdditionTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
    
	@Test
	public void testAddition() {
	AdditionService service = mock(AdditionService.class);
		Addition obj = new Addition(service);
		
		when(service.addition(100, 200)).thenReturn(300);
		
		assertEquals(300,obj.addition(100, 200));
		
	}
	
//	@Test
//	public void testDoThrowAdd() {
//		AdditionService service = mock(AdditionService.class);
//		Addition obj = new Addition(service);
//		doThrow(new RuntimeException("Add op not implemented")).when(service).addition(10, 20);
//		
//		assertEquals(obj.addition(20, 10),30);
//	}
	
	
}
