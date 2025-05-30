/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:18:51 GMT 2022
 */

package com.mongodb.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mongodb.model.Namespace;
import com.mongodb.model.OplogOpType;
import com.mongodb.model.OplogSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OplogSummary_ESTest extends OplogSummary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Namespace namespace0 = new Namespace("", "");
      OplogSummary oplogSummary0 = new OplogSummary(namespace0, "", (OplogOpType) null);
      Namespace namespace1 = oplogSummary0.getNs();
      assertSame(namespace1, namespace0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OplogSummary oplogSummary0 = new OplogSummary((Namespace) null, (Object) null, (OplogOpType) null);
      String string0 = oplogSummary0.toString();
      assertEquals("OplogSummary [id=null, ns=null, opType=null]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Namespace namespace0 = new Namespace((String) null, (String) null);
      Object object0 = new Object();
      OplogSummary oplogSummary0 = new OplogSummary(namespace0, object0, (OplogOpType) null);
      oplogSummary0.getOpType();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OplogSummary oplogSummary0 = new OplogSummary((Namespace) null, (Object) null, (OplogOpType) null);
      Object object0 = oplogSummary0.getId();
      oplogSummary0.setId(object0);
      assertNull(oplogSummary0.getOpType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Namespace namespace0 = new Namespace((String) null, (String) null);
      Object object0 = new Object();
      OplogSummary oplogSummary0 = new OplogSummary(namespace0, object0, (OplogOpType) null);
      oplogSummary0.setOpType((OplogOpType) null);
      assertNull(oplogSummary0.getOpType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OplogSummary oplogSummary0 = new OplogSummary((Namespace) null, (Object) null, (OplogOpType) null);
      oplogSummary0.setNs((Namespace) null);
      assertNull(oplogSummary0.getOpType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OplogSummary oplogSummary0 = new OplogSummary((Namespace) null, (Object) null, (OplogOpType) null);
      Namespace namespace0 = oplogSummary0.getNs();
      assertNull(namespace0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Object object0 = new Object();
      OplogSummary oplogSummary0 = new OplogSummary((Namespace) null, object0, (OplogOpType) null);
      Object object1 = oplogSummary0.getId();
      assertSame(object0, object1);
  }
}
