package com.man;

import static org.junit.Assert.*;

import org.junit.Test;

import com.DAO.CalculatorImplementation;

public class Man {

	

		@Test
		public void test() {
			CalculatorImplementation ci=new CalculatorImplementation();
			int output=ci.add(4, 5);
			assertEquals(9, output);
		}
		
		@Test
		public void test1() {
			CalculatorImplementation ci=new CalculatorImplementation();
			int output=ci.sub(8, 5);
			assertEquals(3, output);
		}
		
		@Test
		public void test2() {
			CalculatorImplementation ci=new CalculatorImplementation();
			int output=ci.mul(4, 5);
			assertEquals(20, output);
		}
		@Test
		public void test3() {
			CalculatorImplementation ci=new CalculatorImplementation();
			int output=ci.div(5, 5);
			assertEquals(1, output);
		}


	}

