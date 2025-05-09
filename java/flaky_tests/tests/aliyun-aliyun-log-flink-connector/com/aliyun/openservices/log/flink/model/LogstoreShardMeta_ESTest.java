/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 22:07:24 GMT 2022
 */

package com.aliyun.openservices.log.flink.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aliyun.openservices.log.flink.model.LogstoreShardMeta;
import com.aliyun.openservices.log.flink.util.Consts;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LogstoreShardMeta_ESTest extends LogstoreShardMeta_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      logstoreShardMeta0.setShardId((-331));
      logstoreShardMeta0.hashCode();
      assertEquals((-331), logstoreShardMeta0.getShardId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      logstoreShardMeta0.setLogstore(", endCursor='");
      logstoreShardMeta0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      LogstoreShardMeta logstoreShardMeta1 = new LogstoreShardMeta("", (-421), "");
      boolean boolean0 = logstoreShardMeta0.equals(logstoreShardMeta1);
      assertFalse(boolean0);
      assertEquals((-421), logstoreShardMeta1.getShardId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("VK4Twr0\"6AmIpD", 0, "VK4Twr0\"6AmIpD");
      Consts.READWRITE_SHARD_STATUS = "begin_cursor";
      Consts.READWRITE_SHARD_STATUS = "VK4Twr0\"6AmIpD";
      logstoreShardMeta0.isReadWrite();
      assertEquals(0, logstoreShardMeta0.getShardId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("$|ZsDE*p:F'T", (-3044), "readonly");
      boolean boolean0 = logstoreShardMeta0.isReadOnly();
      assertEquals((-3044), logstoreShardMeta0.getShardId());
      assertTrue(boolean0);
      assertEquals("$|ZsDE*p:F'T", logstoreShardMeta0.getLogstore());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      String string0 = logstoreShardMeta0.getShardStatus();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      logstoreShardMeta0.setShardStatus("");
      String string0 = logstoreShardMeta0.getShardStatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("", 0, "+]7eK+)II2Q{f");
      logstoreShardMeta0.setShardId(3623);
      int int0 = logstoreShardMeta0.getShardId();
      assertEquals(3623, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("oX|g!k).z.e_J&", (-1722), "!DCe;AjnKbhd*>");
      int int0 = logstoreShardMeta0.getShardId();
      assertEquals("oX|g!k).z.e_J&", logstoreShardMeta0.getLogstore());
      assertEquals((-1722), int0);
      assertEquals("!DCe;AjnKbhd*>", logstoreShardMeta0.getShardStatus());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      String string0 = logstoreShardMeta0.getLogstore();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      logstoreShardMeta0.setLogstore("");
      String string0 = logstoreShardMeta0.getLogstore();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      logstoreShardMeta0.setEndCursor("com.aliyun.openservices.log.flink.model.LogstoreShardMeta");
      String string0 = logstoreShardMeta0.getEndCursor();
      assertEquals("com.aliyun.openservices.log.flink.model.LogstoreShardMeta", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("", 0, "+]7eK+)II2Q{f");
      logstoreShardMeta0.setEndCursor("");
      logstoreShardMeta0.getEndCursor();
      assertEquals("+]7eK+)II2Q{f", logstoreShardMeta0.getShardStatus());
      assertEquals("", logstoreShardMeta0.getLogstore());
      assertEquals(0, logstoreShardMeta0.getShardId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      Consts.READWRITE_SHARD_STATUS = null;
      // Undeclared exception!
      try { 
        logstoreShardMeta0.isReadWrite();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      Consts.READONLY_SHARD_STATUS = null;
      // Undeclared exception!
      try { 
        logstoreShardMeta0.isReadOnly();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("XN@kB11MyVZ70", 39, "XN@kB11MyVZ70");
      LogstoreShardMeta logstoreShardMeta1 = new LogstoreShardMeta(", shardId=", 39, "<^]LGHS");
      boolean boolean0 = logstoreShardMeta0.equals(logstoreShardMeta1);
      assertEquals(39, logstoreShardMeta1.getShardId());
      assertEquals(", shardId=", logstoreShardMeta1.getLogstore());
      assertFalse(boolean0);
      assertEquals("<^]LGHS", logstoreShardMeta1.getShardStatus());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("VK4Twr0\"6AmIpD", 0, "VK4Twr0\"6AmIpD");
      boolean boolean0 = logstoreShardMeta0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0, logstoreShardMeta0.getShardId());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      boolean boolean0 = logstoreShardMeta0.equals(logstoreShardMeta0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("VK4Twr0\"6AmIpD", 0, "VK4Twr0\"6AmIpD");
      Object object0 = new Object();
      boolean boolean0 = logstoreShardMeta0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0, logstoreShardMeta0.getShardId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      logstoreShardMeta0.setShardId((-331));
      LogstoreShardMeta logstoreShardMeta1 = new LogstoreShardMeta();
      boolean boolean0 = logstoreShardMeta0.equals(logstoreShardMeta1);
      assertEquals((-331), logstoreShardMeta0.getShardId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("VK4Twr0\"6AmIpD", 0, "VK4Twr0\"6AmIpD");
      logstoreShardMeta0.getLogstore();
      assertEquals(0, logstoreShardMeta0.getShardId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      boolean boolean0 = logstoreShardMeta0.isReadOnly();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("VK4Twr0\"6AmIpD", 0, "VK4Twr0\"6AmIpD");
      String string0 = logstoreShardMeta0.toString();
      assertEquals("LogstoreShardMeta{logstore='VK4Twr0\"6AmIpD', shardId=0, shardStatus='VK4Twr0\"6AmIpD', endCursor='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      boolean boolean0 = logstoreShardMeta0.isReadWrite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      String string0 = logstoreShardMeta0.getId();
      assertEquals("null$0", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta();
      String string0 = logstoreShardMeta0.getEndCursor();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("VK4Twr0\"6AmIpD", 0, "VK4Twr0\"6AmIpD");
      int int0 = logstoreShardMeta0.getShardId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LogstoreShardMeta logstoreShardMeta0 = new LogstoreShardMeta("@14(D](", 5236, "@14(D](");
      logstoreShardMeta0.getShardStatus();
      assertEquals(5236, logstoreShardMeta0.getShardId());
  }
}
