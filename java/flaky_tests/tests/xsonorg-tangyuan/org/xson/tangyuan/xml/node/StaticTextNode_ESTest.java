/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:19:05 GMT 2022
 */

package org.xson.tangyuan.xml.node;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xson.tangyuan.executor.ServiceContext;
import org.xson.tangyuan.ognl.vars.VariableVo;
import org.xson.tangyuan.sharding.ShardingArgVo;
import org.xson.tangyuan.xml.node.StaticTextNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StaticTextNode_ESTest extends StaticTextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StaticTextNode staticTextNode0 = new StaticTextNode("}");
      LinkedList<ShardingArgVo> linkedList0 = new LinkedList<ShardingArgVo>();
      LinkedList<VariableVo> linkedList1 = new LinkedList<VariableVo>();
      staticTextNode0.staticVarList = (List<VariableVo>) linkedList1;
      staticTextNode0.shardingArgList = (List<ShardingArgVo>) linkedList0;
      // Undeclared exception!
      try { 
        staticTextNode0.execute((ServiceContext) null, linkedList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.xml.node.StaticTextNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StaticTextNode staticTextNode0 = new StaticTextNode("");
      staticTextNode0.parsedText = "{}";
      LinkedList<ShardingArgVo> linkedList0 = new LinkedList<ShardingArgVo>();
      staticTextNode0.shardingArgList = (List<ShardingArgVo>) linkedList0;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        staticTextNode0.execute((ServiceContext) null, object0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StaticTextNode staticTextNode0 = new StaticTextNode("}");
      LinkedList<VariableVo> linkedList0 = new LinkedList<VariableVo>();
      staticTextNode0.staticVarList = (List<VariableVo>) linkedList0;
      // Undeclared exception!
      try { 
        staticTextNode0.execute((ServiceContext) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.xml.node.StaticTextNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StaticTextNode staticTextNode0 = new StaticTextNode("/");
      // Undeclared exception!
      try { 
        staticTextNode0.execute((ServiceContext) null, "/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.xml.node.StaticTextNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StaticTextNode staticTextNode0 = new StaticTextNode("}");
      LinkedList<ShardingArgVo> linkedList0 = new LinkedList<ShardingArgVo>();
      LinkedList<VariableVo> linkedList1 = new LinkedList<VariableVo>();
      staticTextNode0.shardingArgList = (List<ShardingArgVo>) linkedList0;
      // Undeclared exception!
      try { 
        staticTextNode0.execute((ServiceContext) null, linkedList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.xml.node.StaticTextNode", e);
      }
  }
}
