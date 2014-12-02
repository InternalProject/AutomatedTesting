package com.epam.testexternalpart.core;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import static org.testng.Assert.*;
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
