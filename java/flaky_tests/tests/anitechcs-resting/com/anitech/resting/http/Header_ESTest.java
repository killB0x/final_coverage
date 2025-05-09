/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 09:56:04 GMT 2022
 */

package com.anitech.resting.http;

import org.junit.Test;
import static org.junit.Assert.*;
import com.anitech.resting.http.Header;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Header_ESTest extends Header_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Header header0 = new Header((String) null, (String) null);
      String string0 = header0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Header header0 = new Header("o`H", "o`H");
      String string0 = header0.getValue();
      assertEquals("o`H", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Header header0 = new Header((String) null, "");
      String string0 = header0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Header header0 = new Header("", "");
      String string0 = header0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Header header0 = new Header((String) null, "");
      Object object0 = header0.clone();
      assertNotSame(header0, object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Header header0 = new Header((String) null, "");
      String string0 = header0.toString();
      assertEquals("Name: null, Value: ", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Header header0 = new Header((String) null, "");
      String string0 = header0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Header header0 = new Header("`", "`");
      String string0 = header0.getName();
      assertEquals("`", string0);
  }
}
