/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 03:14:23 GMT 2022
 */

package org.jiucai.appframework.base.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiucai.appframework.base.util.SqlUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SqlUtil_ESTest extends SqlUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = SqlUtil.getPageSize();
      assertEquals(10L, (long)long0);
      
      Long long1 = new Long(0L);
      Long long2 = SqlUtil.getPageCount(long1, long0);
      assertEquals(0L, (long)long2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Long long0 = SqlUtil.getPageSize();
      assertEquals(10L, (long)long0);
      
      Long long1 = new Long((-471L));
      Long long2 = SqlUtil.getPageCount(long1, long0);
      assertEquals((-46L), (long)long2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Long long0 = new Long(1L);
      Long long1 = new Long(0L);
      Long long2 = SqlUtil.getPage(long1, long0);
      assertEquals(0L, (long)long2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Long long0 = new Long(2763L);
      Long long1 = SqlUtil.getPage(long0, long0);
      assertEquals(1L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long long0 = new Long(2763L);
      Long long1 = SqlUtil.getPageCount(long0, long0);
      assertEquals(1L, (long)long1);
      
      Long long2 = new Long((-3472L));
      Long long3 = SqlUtil.getPage(long2, long1);
      assertEquals((-3472L), (long)long3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        SqlUtil.getPageCount((Long) null, (Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiucai.appframework.base.util.SqlUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        SqlUtil.getPageCount(long0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jiucai.appframework.base.util.SqlUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        SqlUtil.getPage(long0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jiucai.appframework.base.util.SqlUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Long long0 = new Long(2763L);
      Long long1 = new Long((-3472L));
      Long long2 = SqlUtil.getPageCount(long0, long1);
      assertEquals(1L, (long)long2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        SqlUtil.getPage((Long) null, (Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiucai.appframework.base.util.SqlUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SqlUtil sqlUtil0 = new SqlUtil();
      assertEquals(10L, (long)sqlUtil0.getPageSize());
  }
}
