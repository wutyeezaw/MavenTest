package com.maven.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.maven.main.MavenApp;

public class MavenTest {

	MavenApp mavenapp;
	
	@Before
	public void setUp() throws Exception {
		 mavenapp = new MavenApp();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGreetMe() {
		assertEquals("Hello Maven", mavenapp.greetMe("Hello Maven"));
	}

	@Test
	public void testIsNullOrEmpty() {
		assertTrue(MavenApp.isNullOrEmpty(null));
	}

}
