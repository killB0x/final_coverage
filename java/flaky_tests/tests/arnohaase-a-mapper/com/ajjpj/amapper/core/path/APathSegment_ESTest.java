/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 03:04:02 GMT 2022
 */

package com.ajjpj.amapper.core.path;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ajjpj.amapper.core.path.AParameterizedPathSegment;
import com.ajjpj.amapper.core.path.APathSegment;
import com.ajjpj.amapper.core.path.ASimplePathSegment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class APathSegment_ESTest extends APathSegment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AParameterizedPathSegment aParameterizedPathSegment0 = APathSegment.parameterized("com.ajjpj.amapper.core.path.ASimplePathSegment", 0, (Object) null);
      assertEquals(0, aParameterizedPathSegment0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AParameterizedPathSegment aParameterizedPathSegment0 = APathSegment.parameterized("com.ajjpj.amapper.core.path.APathSegment", (-1), (Object) "s");
      assertEquals((-1), aParameterizedPathSegment0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASimplePathSegment aSimplePathSegment0 = APathSegment.simple((String) null);
      AParameterizedPathSegment aParameterizedPathSegment0 = APathSegment.parameterized((String) null, (Object) aSimplePathSegment0);
      aParameterizedPathSegment0.getName();
      assertEquals((-1), aParameterizedPathSegment0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AParameterizedPathSegment aParameterizedPathSegment0 = APathSegment.parameterized("z|Yh*Orq0P", 375, (Object) "z|Yh*Orq0P");
      aParameterizedPathSegment0.getName();
      assertEquals(375, aParameterizedPathSegment0.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      AParameterizedPathSegment aParameterizedPathSegment0 = APathSegment.parameterized("", 3003, object0);
      aParameterizedPathSegment0.getName();
      assertEquals(3003, aParameterizedPathSegment0.getIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASimplePathSegment aSimplePathSegment0 = new ASimplePathSegment("com.ajjpj.amapper.core.path.ASimplePathSegment");
      aSimplePathSegment0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AParameterizedPathSegment aParameterizedPathSegment0 = APathSegment.parameterized((String) null, (Object) "");
      aParameterizedPathSegment0.hashCode();
      assertEquals((-1), aParameterizedPathSegment0.getIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASimplePathSegment aSimplePathSegment0 = APathSegment.simple((String) null);
      ASimplePathSegment aSimplePathSegment1 = APathSegment.simple("Qq.uZ");
      boolean boolean0 = aSimplePathSegment0.equals(aSimplePathSegment1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      AParameterizedPathSegment aParameterizedPathSegment0 = APathSegment.parameterized("", 3003, object0);
      AParameterizedPathSegment aParameterizedPathSegment1 = APathSegment.parameterized("", object0);
      aParameterizedPathSegment1.equals(aParameterizedPathSegment0);
      assertEquals((-1), aParameterizedPathSegment1.getIndex());
      assertEquals(3003, aParameterizedPathSegment0.getIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASimplePathSegment aSimplePathSegment0 = APathSegment.simple((String) null);
      ASimplePathSegment aSimplePathSegment1 = new ASimplePathSegment((String) null);
      boolean boolean0 = aSimplePathSegment1.equals(aSimplePathSegment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASimplePathSegment aSimplePathSegment0 = APathSegment.simple("j^7QekRQ_N`@U");
      boolean boolean0 = aSimplePathSegment0.equals("j^7QekRQ_N`@U");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASimplePathSegment aSimplePathSegment0 = APathSegment.simple((String) null);
      boolean boolean0 = aSimplePathSegment0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASimplePathSegment aSimplePathSegment0 = APathSegment.simple("");
      boolean boolean0 = aSimplePathSegment0.equals(aSimplePathSegment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASimplePathSegment aSimplePathSegment0 = APathSegment.simple("V6~w*B");
      ASimplePathSegment aSimplePathSegment1 = APathSegment.simple("com.ajjpj.amapper.core.path.ASimplePathSegment");
      boolean boolean0 = aSimplePathSegment0.equals(aSimplePathSegment1);
      assertFalse(boolean0);
  }
}
