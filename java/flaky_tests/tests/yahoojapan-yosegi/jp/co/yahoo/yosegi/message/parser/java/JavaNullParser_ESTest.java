/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:09:48 GMT 2022
 */

package jp.co.yahoo.yosegi.message.parser.java;

import org.junit.Test;
import static org.junit.Assert.*;
import jp.co.yahoo.yosegi.message.objects.PrimitiveObject;
import jp.co.yahoo.yosegi.message.parser.IParser;
import jp.co.yahoo.yosegi.message.parser.java.JavaNullParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaNullParser_ESTest extends JavaNullParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      IParser iParser0 = javaNullParser0.getParser("");
      assertFalse(iParser0.isMap());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      PrimitiveObject primitiveObject0 = javaNullParser0.get(3667);
      assertNull(primitiveObject0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      boolean boolean0 = javaNullParser0.isMap();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      PrimitiveObject primitiveObject0 = javaNullParser0.get("");
      assertNull(primitiveObject0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      boolean boolean0 = javaNullParser0.hasParser("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      boolean boolean0 = javaNullParser0.isArray();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      boolean boolean0 = javaNullParser0.hasParser(911);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      boolean boolean0 = javaNullParser0.isStruct();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      int int0 = javaNullParser0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      Object object0 = javaNullParser0.toJavaObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      String[] stringArray0 = javaNullParser0.getAllKey();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      IParser iParser0 = javaNullParser0.getParser(0);
      assertFalse(iParser0.isMap());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JavaNullParser javaNullParser0 = new JavaNullParser();
      boolean boolean0 = javaNullParser0.containsKey("jp.co.yahoo.yosegi.message.parser.java.JavaNullParser");
      assertFalse(boolean0);
  }
}
