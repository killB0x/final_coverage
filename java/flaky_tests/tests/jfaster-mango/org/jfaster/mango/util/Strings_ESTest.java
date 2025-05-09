/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 23:08:49 GMT 2022
 */

package org.jfaster.mango.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.util.Strings;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Strings_ESTest extends Strings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Strings.getFullName("7rb B~", "7rb B~");
      assertEquals(":7rb B~.7rb B~", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Strings.firstLetterToUpperCase("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Strings.firstLetterToUpperCase((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.util.Strings", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Strings.firstLetterToLowerCase("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Strings.firstLetterToLowerCase((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.util.Strings", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = Strings.isNotEmpty("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = Strings.isEmpty("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = Strings.isEmpty("Klpz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Strings.isEmpty((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Strings.emptyToNull("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Strings.emptyToNull("^");
      assertEquals("^", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Strings.isNotEmpty("&}}LxxqA4nLEh/u");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Strings.getFullName("", "");
      assertEquals(":", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = Strings.underscoreName("p#B!OY'{;aTbv*Z");
      assertEquals("p#_b!_o_y'{;a_tbv*_z", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Strings.underscoreName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Strings.firstLetterToLowerCase(";$0t|VBI");
      assertEquals(";$0t|VBI", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Strings.firstLetterToUpperCase("23");
      assertEquals("23", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Strings strings0 = new Strings();
  }
}
