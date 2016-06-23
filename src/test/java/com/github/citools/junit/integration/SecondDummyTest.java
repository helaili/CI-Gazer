package com.github.citools.junit.integration;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class SecondDummyTest {

	@Test
	public void testTrue() {
		assertTrue(true);
	}
	
	@Test
	public void testFalse() {
		assertFalse(false);
	}

	
}
