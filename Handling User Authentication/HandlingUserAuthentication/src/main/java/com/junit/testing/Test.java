package com.junit.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

@DisplayName("Welcome Junit5 testing")

public class Test {
	//Setting expected values
	static int id=1;
	static String name="John";
	static String email="johney123@mail.com";
	static String password="Password123";
	
	@BeforeAll
	public static void  beforAll() {
		System.out.println("Testing Begins");
		System.out.println();
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("New testing");
	}
	
	
	@Nested
	class TestName{
		@org.junit.jupiter.api.Test
		public void notNull() {
			assertNotNull(Authentication.checkName());
		}
		@Nested
		class ValueMatch{
			@org.junit.jupiter.api.Test
			void nameMatch() {
			assertEquals(name,Authentication.checkName());
		}
		
	}}
	
	
	@Nested
	class TestId{
		@org.junit.jupiter.api.Test
		public void notNull() {
			assertNotNull(Authentication.chekId());
		}
		@Nested
		class ValueMatch{
			@org.junit.jupiter.api.Test
			void idMatch() {
			assertEquals(id,Authentication.chekId());
		}
		
	}}
	
	@Nested
	class TestEmail{
		@org.junit.jupiter.api.Test
		public void notNull() {
			assertNotNull(Authentication.checkEmail());
		}
		@Nested
		class ValueMatch{
			@org.junit.jupiter.api.Test
			void emailMatch() {
			assertEquals(email,Authentication.checkEmail());
		}
		
	}}
	
	
	@Nested
	class TestPassword{
		@org.junit.jupiter.api.Test
		public void notNull() {
			assertNotNull(Authentication.checkPassword());
		}
		@Nested
		class ValueMatch{
			@org.junit.jupiter.api.Test
			void passwordMatch() {
			assertEquals(password,Authentication.checkPassword());
		}
				
	}}
	
	
	@AfterEach
	public void afterEach() {
		System.out.println("This testing comlpeted");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println();
		System.out.println("All Testing Finished");
		
	}
			

}
