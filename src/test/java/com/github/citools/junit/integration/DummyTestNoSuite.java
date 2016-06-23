package com.github.citools.junit.integration;

import static org.junit.Assert.*;

import org.junit.Test;

public class DummyTestNoSuite {

	@Test
	public void testTrue() {
		assertTrue(true);
	}
	
	@Test
	public void testFalse() {
		assertFalse(false);
	}

}
