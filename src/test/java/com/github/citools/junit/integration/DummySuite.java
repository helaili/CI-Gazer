package com.github.citools.junit.integration;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DummyTest.class, DummyTestTwo.class })
public class DummySuite {

}
