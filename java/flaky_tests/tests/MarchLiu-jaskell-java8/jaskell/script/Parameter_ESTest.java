/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 11:08:16 GMT 2022
 */

package jaskell.script;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.script.Parameter;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Parameter_ESTest extends Parameter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("", object0, class0);
      Class<Object> class1 = parameter0.valueClass();
      assertEquals(1, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parameter<Integer> parameter0 = new Parameter<Integer>();
      parameter0.value((Integer) null);
      Integer integer0 = parameter0.value();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("", object0, class0);
      parameter0.value(object0);
      Object object1 = parameter0.value();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("NlTWcmXgxcGyE}", object0, class0);
      String string0 = parameter0.script();
      assertEquals("NlTWcmXgxcGyE}", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("", object0, class0);
      String string0 = parameter0.script();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>((String) null, (Object) null, class0);
      String string0 = parameter0.placeHolder();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("", object0, class0);
      String string0 = parameter0.placeHolder();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameter<Object> parameter0 = new Parameter<Object>();
      parameter0.order(2643);
      int int0 = parameter0.order();
      assertEquals(2643, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("8W", "8W", class0);
      parameter0.order((-18));
      int int0 = parameter0.order();
      assertEquals((-18), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("", object0, class0);
      Object object1 = parameter0.key();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(2643);
      Parameter<Object> parameter0 = new Parameter<Object>();
      parameter0.value((Object) integer0);
      boolean boolean0 = parameter0.confirmed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("", object0, class0);
      boolean boolean0 = parameter0.confirmed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parameter<Object> parameter0 = new Parameter<Object>();
      Object object0 = parameter0.key();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parameter<Integer> parameter0 = new Parameter<Integer>();
      String string0 = parameter0.script();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parameter<Integer> parameter0 = new Parameter<Integer>();
      // Undeclared exception!
      try { 
        parameter0.value();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.script.Parameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parameter<Object> parameter0 = new Parameter<Object>();
      int int0 = parameter0.order();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parameter<Integer> parameter0 = new Parameter<Integer>();
      Class<Integer> class0 = parameter0.valueClass();
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parameter<Object> parameter0 = new Parameter<Object>();
      List<Parameter<?>> list0 = parameter0.parameters();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("NlTWcmXgxcGyE}", object0, class0);
      String string0 = parameter0.placeHolder();
      assertEquals("NlTWcmXgxcGyE}", string0);
  }
}
