package com.markets.powermokikto;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Base64;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.PowerMockUtils;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.spi.PowerMockTestListener;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.tests.utils.impl.PowerMockTestNotifierImpl;
@RunWith(PowerMockRunner.class)  
@PrepareForTest(fullyQualifiedNames="com.markets.powermokikto.Utility")  
public class UtilityTest  extends PowerMockUtils{

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	
//	public UtilityTest(PowerMockTestListener[] powerMockTestListeners) {
//		super(powerMockTestListeners);
//		// TODO Auto-generated constructor stub
//	}

	@Test
	
	public void testStaticGetConnection(){
		String call = "Hello Everyone";
		String callexpectation = "Hi student";
		
		PowerMockito.mockStatic(Utility.class);
		
		PowerMockito.when(Utility.getConnection(call)).thenReturn(callexpectation);
		
		String actual = Utility.getConnection(call);
		
		assertEquals(callexpectation,actual);
		
	}
	

}
