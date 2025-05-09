/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 20:43:17 GMT 2022
 */

package com.hubspot.jinjava.lib.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.filter.RootFilter;
import com.hubspot.jinjava.objects.SafeString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RootFilter_ESTest extends RootFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RootFilter rootFilter0 = new RootFilter();
      Byte byte0 = new Byte((byte) (-120));
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        rootFilter0.filter((Object) byte0, (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.interpret.InvalidInputException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RootFilter rootFilter0 = new RootFilter();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        rootFilter0.filter((Object) "root", (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.interpret.InvalidInputException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RootFilter rootFilter0 = new RootFilter();
      String[] stringArray0 = new String[2];
      Object object0 = new Object();
      Object object1 = rootFilter0.filter(object0, (JinjavaInterpreter) null, stringArray0);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      RootFilter rootFilter0 = new RootFilter();
      Object object0 = rootFilter0.filter((Object) null, (JinjavaInterpreter) null, stringArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RootFilter rootFilter0 = new RootFilter();
      String[] stringArray0 = new String[2];
      Byte byte0 = new Byte((byte)0);
      // Undeclared exception!
      try { 
        rootFilter0.filter((Object) byte0, (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.interpret.InvalidInputException", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RootFilter rootFilter0 = new RootFilter();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        rootFilter0.filter((SafeString) null, (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/primitives/Doubles
         //
         verifyException("com.hubspot.jinjava.lib.filter.RootFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[1];
      RootFilter rootFilter0 = new RootFilter();
      Byte byte0 = new Byte((byte)12);
      Object object0 = rootFilter0.filter((Object) byte0, (JinjavaInterpreter) null, stringArray0);
      Object object1 = rootFilter0.filter(object0, (JinjavaInterpreter) null, stringArray0);
      assertEquals(1.8612097182041991, object1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RootFilter rootFilter0 = new RootFilter();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        rootFilter0.filter((Object) "3", (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // ch/obermuhlner/math/big/BigDecimalMath
         //
         verifyException("com.hubspot.jinjava.lib.filter.RootFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RootFilter rootFilter0 = new RootFilter();
      String string0 = rootFilter0.getName();
      assertEquals("root", string0);
  }
}
