package com.epam.testexternalpart.core;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class NewTest {
  @Test
  public void f() {
	  SoftAssert soft = new SoftAssert();
	  soft.assertTrue(false, "a1");
	  assertTrue(true, "a2");
	  soft.assertEquals(1, 2, "a3");
	  soft.assertAll();

  }
}
