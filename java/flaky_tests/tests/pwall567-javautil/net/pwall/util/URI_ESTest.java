/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 15:57:37 GMT 2022
 */

package net.pwall.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.pwall.util.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class URI_ESTest extends URI_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = URI.escape("^ch1y|JoK^X]~wIWZa");
      assertEquals("%5Ech1y%7CJoK%5EX%5D~wIWZa", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = URI.escape("Attempt to instantiate URI class");
      assertEquals("Attempt+to+instantiate+URI+class", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = URI.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = URI.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        URI.unescape("d@m#1%G@sAvd*^G");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.pwall.util.Strings", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        URI.unescape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.pwall.util.Strings", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        URI.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.pwall.util.Strings", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = URI.isUnreserved(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = URI.isUnreserved(82);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = URI.isUnreserved(95);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = URI.isUnreserved(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = URI.isUnreserved(45);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = URI.isUnreserved(126);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = URI.isUnreserved(1774);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = URI.escape("#7/qK12j|@$_e4%");
      assertEquals("%237%2FqK12j%7C%40%24_e4%25", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = URI.isUnreserved(46);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = URI.escape("voPn74F?s&w@9-8>>");
      assertEquals("voPn74F%3Fs%26w%409%7F-8%3E%3E", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        URI.unescape("zF7%C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI %xx sequence invalid
         //
         verifyException("net.pwall.util.URI$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = URI.unescape("Or7^}?@LA+kp;");
      assertEquals("Or7^}?@LA kp;", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = URI.unescape("qmt;%C3");
      assertEquals("qmt;\u00C3", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = URI.escape("qmt;\u00C3");
      assertEquals("qmt%3B%C3%83", string0);
  }
}
