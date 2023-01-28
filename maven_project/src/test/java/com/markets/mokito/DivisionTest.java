package com.markets.mokito;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

class DivisionTest {


//	@Mock
//	private DivisionService service;
//	@InjectMocks
//	private Division obj = new Division();
//	

	
	@Test
	
	public void testDivision() {
		DivisionService service = mock(DivisionService.class);
		Division obj = new Division(service);
		
		when(service.division(10, 5)).thenReturn(2);
		
		assertEquals(2,obj.division(10, 5));
		
		
	}
	
	

}

