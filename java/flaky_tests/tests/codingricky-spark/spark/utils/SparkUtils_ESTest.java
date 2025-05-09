/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 15:43:44 GMT 2022
 */

package spark.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import spark.utils.SparkUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparkUtils_ESTest extends SparkUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<String> list0 = SparkUtils.convertRouteToList("+/*paths");
      assertFalse(list0.contains("+/*paths"));
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = SparkUtils.isSplat("*");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = SparkUtils.isParam(":");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparkUtils.isSplat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparkUtils.isParam((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        SparkUtils.convertRouteToList((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.utils.SparkUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<String> list0 = SparkUtils.convertRouteToList("");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean boolean0 = SparkUtils.isParam("cK?2RO8$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      boolean boolean0 = SparkUtils.isSplat("}*m");
      assertFalse(boolean0);
  }
}
