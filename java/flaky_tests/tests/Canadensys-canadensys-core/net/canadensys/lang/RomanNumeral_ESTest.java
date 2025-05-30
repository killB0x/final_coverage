/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 28 04:29:06 GMT 2022
 */

package net.canadensys.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.canadensys.lang.RomanNumeral;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RomanNumeral_ESTest extends RomanNumeral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral("i");
      assertEquals(1, RomanNumeral.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral(3999);
      assertEquals(1, RomanNumeral.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RomanNumeral romanNumeral0 = null;
      try {
        romanNumeral0 = new RomanNumeral((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.canadensys.lang.RomanNumeral", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RomanNumeral romanNumeral0 = null;
      try {
        romanNumeral0 = new RomanNumeral((-1351));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -1351
         //
         verifyException("net.canadensys.lang.RomanNumeral", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral("C");
      boolean boolean0 = romanNumeral0.equals("C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral("CD");
      RomanNumeral romanNumeral1 = new RomanNumeral("CD");
      // Undeclared exception!
      try { 
        romanNumeral1.equals(romanNumeral0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/builder/EqualsBuilder
         //
         verifyException("net.canadensys.lang.RomanNumeral", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral(1896);
      boolean boolean0 = romanNumeral0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(1896, romanNumeral0.toInt());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral(7);
      romanNumeral0.toRomanNumeral();
      String string0 = romanNumeral0.toRomanNumeral();
      assertEquals("VII", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RomanNumeral romanNumeral0 = null;
      try {
        romanNumeral0 = new RomanNumeral("xdP&VK");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // xdP&VK:X
         //
         verifyException("net.canadensys.lang.RomanNumeral", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral("CD");
      boolean boolean0 = romanNumeral0.equals(romanNumeral0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RomanNumeral romanNumeral0 = null;
      try {
        romanNumeral0 = new RomanNumeral(4264);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 4264
         //
         verifyException("net.canadensys.lang.RomanNumeral", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral(7);
      // Undeclared exception!
      try { 
        romanNumeral0.compareTo((RomanNumeral) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/builder/CompareToBuilder
         //
         verifyException("net.canadensys.lang.RomanNumeral", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RomanNumeral romanNumeral0 = new RomanNumeral(7);
      int int0 = romanNumeral0.toInt();
      assertEquals(7, int0);
  }
}
