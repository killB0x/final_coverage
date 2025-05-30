/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 02:54:56 GMT 2022
 */

package com.ajjpj.amapper.core.diff;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ajjpj.amapper.core.diff.ADiffElement;
import com.ajjpj.amapper.core.path.APath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ADiffElement_ESTest extends ADiffElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.attribute((APath) null, false, (Object) null, (Object) null);
      ADiffElement aDiffElement1 = ADiffElement.removed((APath) null, false, aDiffElement0);
      ADiffElement aDiffElement2 = ADiffElement.removed((APath) null, false, aDiffElement0);
      boolean boolean0 = aDiffElement1.equals(aDiffElement2);
      assertFalse(aDiffElement0.isDerived);
      assertTrue(boolean0);
      assertFalse(aDiffElement2.isDerived);
      assertFalse(aDiffElement2.equals((Object)aDiffElement0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      ADiffElement aDiffElement0 = ADiffElement.attribute((APath) null, true, (Object) null, object0);
      aDiffElement0.toString();
      assertTrue(aDiffElement0.isDerived);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.removed((APath) null, true, (Object) null);
      Object object0 = new Object();
      boolean boolean0 = aDiffElement0.equals(object0);
      assertTrue(aDiffElement0.isDerived);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      ADiffElement aDiffElement0 = ADiffElement.added((APath) null, true, object0);
      boolean boolean0 = aDiffElement0.equals((Object) null);
      assertFalse(boolean0);
      assertTrue(aDiffElement0.isDerived);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      ADiffElement aDiffElement0 = ADiffElement.added((APath) null, false, object0);
      aDiffElement0.hashCode();
      assertFalse(aDiffElement0.isDerived);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.removed((APath) null, false, (Object) null);
      ADiffElement aDiffElement1 = ADiffElement.attribute((APath) null, false, aDiffElement0, (Object) null);
      aDiffElement1.hashCode();
      assertFalse(aDiffElement1.isDerived);
      assertFalse(aDiffElement0.isDerived);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.added((APath) null, true, (Object) null);
      aDiffElement0.hashCode();
      assertTrue(aDiffElement0.isDerived);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.removed((APath) null, false, (Object) null);
      ADiffElement aDiffElement1 = ADiffElement.removed((APath) null, false, aDiffElement0);
      boolean boolean0 = aDiffElement0.equals(aDiffElement1);
      assertFalse(boolean0);
      assertFalse(aDiffElement1.isDerived);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ADiffElement aDiffElement0 = ADiffElement.attribute((APath) null, true, (Object) null, object0);
      ADiffElement aDiffElement1 = ADiffElement.added((APath) null, false, aDiffElement0);
      ADiffElement aDiffElement2 = ADiffElement.added((APath) null, false, aDiffElement0);
      boolean boolean0 = aDiffElement1.equals(aDiffElement2);
      assertFalse(aDiffElement2.equals((Object)aDiffElement0));
      assertFalse(aDiffElement2.isDerived);
      assertTrue(aDiffElement0.isDerived);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.added((APath) null, false, (Object) null);
      ADiffElement aDiffElement1 = ADiffElement.added((APath) null, false, aDiffElement0);
      boolean boolean0 = aDiffElement0.equals(aDiffElement1);
      assertFalse(aDiffElement1.isDerived);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.removed((APath) null, false, (Object) null);
      ADiffElement aDiffElement1 = ADiffElement.removed((APath) null, true, (Object) null);
      boolean boolean0 = aDiffElement0.equals(aDiffElement1);
      assertFalse(boolean0);
      assertFalse(aDiffElement0.isDerived);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      ADiffElement aDiffElement0 = ADiffElement.attribute((APath) null, true, (Object) null, object0);
      ADiffElement aDiffElement1 = ADiffElement.attribute((APath) null, false, (Object) null, object0);
      ADiffElement aDiffElement2 = ADiffElement.attribute((APath) null, false, aDiffElement0, aDiffElement0);
      boolean boolean0 = aDiffElement2.equals(aDiffElement1);
      assertTrue(aDiffElement0.isDerived);
      assertFalse(boolean0);
      assertFalse(aDiffElement1.equals((Object)aDiffElement0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.removed((APath) null, false, (Object) null);
      ADiffElement aDiffElement1 = ADiffElement.removed((APath) null, false, aDiffElement0);
      boolean boolean0 = aDiffElement1.equals(aDiffElement0);
      assertFalse(aDiffElement1.isDerived);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.removed((APath) null, false, (Object) null);
      boolean boolean0 = aDiffElement0.equals(aDiffElement0);
      assertFalse(aDiffElement0.isDerived);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.removed((APath) null, false, (Object) null);
      ADiffElement aDiffElement1 = ADiffElement.refChanged((APath) null, false, aDiffElement0.path, aDiffElement0);
      assertFalse(aDiffElement0.isDerived);
      assertFalse(aDiffElement1.isDerived);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ADiffElement aDiffElement0 = ADiffElement.removed((APath) null, false, (Object) null);
      ADiffElement aDiffElement1 = ADiffElement.attribute((APath) null, false, aDiffElement0, (Object) null);
      boolean boolean0 = aDiffElement0.equals(aDiffElement1);
      assertFalse(aDiffElement1.isDerived);
      assertFalse(boolean0);
      assertFalse(aDiffElement0.isDerived);
  }
}
