/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 18:54:49 GMT 2022
 */

package io.github.wesleyone.qy.weixin.robot.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QyWeixinRobotKey_ESTest extends QyWeixinRobotKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey((String) null);
      String string0 = qyWeixinRobotKey0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey("");
      String string0 = qyWeixinRobotKey0.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey("");
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey0 = qyWeixinRobotKey0.decrement();
      assertNotNull(qyWeixinRobotKey_SelectKey0);
      assertEquals(0L, qyWeixinRobotKey_SelectKey0.getTimestamp());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey("m");
      // Undeclared exception!
      try { 
        qyWeixinRobotKey0.increment((QyWeixinRobotKey.SelectKey) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey((String) null);
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey0 = qyWeixinRobotKey0.decrement();
      long long0 = qyWeixinRobotKey_SelectKey0.getTimestamp();
      assertEquals(23206821L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey("-");
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey0 = qyWeixinRobotKey0.decrement();
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey1 = qyWeixinRobotKey0.decrement();
      assertNotNull(qyWeixinRobotKey_SelectKey1);
      
      int int0 = qyWeixinRobotKey0.increment(qyWeixinRobotKey_SelectKey0);
      assertEquals(1, int0);
      assertEquals(23206821L, qyWeixinRobotKey_SelectKey0.getTimestamp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey((String) null);
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey0 = qyWeixinRobotKey0.decrement();
      int int0 = qyWeixinRobotKey0.increment(qyWeixinRobotKey_SelectKey0);
      assertEquals(20, int0);
      
      int int1 = qyWeixinRobotKey0.increment(qyWeixinRobotKey_SelectKey0);
      assertEquals(20, int1);
      assertEquals(23206821L, qyWeixinRobotKey_SelectKey0.getTimestamp());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey((String) null);
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey0 = new QyWeixinRobotKey.SelectKey("kyN\"{4H`|dR5:HF\"", 2463L);
      int int0 = qyWeixinRobotKey0.increment(qyWeixinRobotKey_SelectKey0);
      assertEquals(0, int0);
      assertEquals(2463L, qyWeixinRobotKey_SelectKey0.getTimestamp());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey("-");
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      qyWeixinRobotKey0.decrement();
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey0 = qyWeixinRobotKey0.decrement();
      assertNull(qyWeixinRobotKey_SelectKey0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey("-");
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey0 = qyWeixinRobotKey0.decrement();
      String string0 = qyWeixinRobotKey_SelectKey0.toString();
      assertEquals("SelectKey[key='-', timestamp=23206821]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey((String) null);
      QyWeixinRobotKey.SelectKey qyWeixinRobotKey_SelectKey0 = qyWeixinRobotKey0.decrement();
      assertNotNull(qyWeixinRobotKey_SelectKey0);
      
      qyWeixinRobotKey_SelectKey0.getKey();
      assertEquals(23206821L, qyWeixinRobotKey_SelectKey0.getTimestamp());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QyWeixinRobotKey qyWeixinRobotKey0 = new QyWeixinRobotKey("-");
      String string0 = qyWeixinRobotKey0.getKey();
      assertEquals("-", string0);
  }
}
