/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 02:00:08 GMT 2022
 */

package org.jfaster.mango.operator.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.binding.BindingParameter;
import org.jfaster.mango.binding.BindingParameterInvoker;
import org.jfaster.mango.binding.DefaultInvocationContext;
import org.jfaster.mango.binding.TransferableBindingParameterInvoker;
import org.jfaster.mango.operator.generator.ShardedTableGenerator;
import org.jfaster.mango.sharding.NotUseShardingStrategy;
import org.jfaster.mango.sharding.NotUseTableShardingStrategy;
import org.jfaster.mango.util.jdbc.JdbcType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ShardedTableGenerator_ESTest extends ShardedTableGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      JdbcType jdbcType0 = JdbcType.TINYINT;
      BindingParameter bindingParameter0 = new BindingParameter("", "", jdbcType0);
      TransferableBindingParameterInvoker transferableBindingParameterInvoker0 = TransferableBindingParameterInvoker.create(class0, bindingParameter0);
      NotUseTableShardingStrategy notUseTableShardingStrategy0 = new NotUseTableShardingStrategy();
      ShardedTableGenerator shardedTableGenerator0 = new ShardedTableGenerator("", transferableBindingParameterInvoker0, notUseTableShardingStrategy0);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      // Undeclared exception!
      try { 
        shardedTableGenerator0.getTable(defaultInvocationContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Parameter ':' not found, available root parameters are []
         //
         verifyException("org.jfaster.mango.binding.DefaultInvocationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JdbcType jdbcType0 = JdbcType.NCHAR;
      BindingParameter bindingParameter0 = new BindingParameter("", "", jdbcType0);
      TransferableBindingParameterInvoker transferableBindingParameterInvoker0 = TransferableBindingParameterInvoker.create((Type) null, bindingParameter0);
      NotUseShardingStrategy notUseShardingStrategy0 = new NotUseShardingStrategy();
      ShardedTableGenerator shardedTableGenerator0 = new ShardedTableGenerator("", transferableBindingParameterInvoker0, notUseShardingStrategy0);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.setBindingValue(transferableBindingParameterInvoker0, shardedTableGenerator0);
      // Undeclared exception!
      try { 
        shardedTableGenerator0.getTable(defaultInvocationContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // error, unreachable code
         //
         verifyException("org.jfaster.mango.sharding.NotUseShardingStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NotUseTableShardingStrategy notUseTableShardingStrategy0 = new NotUseTableShardingStrategy();
      ShardedTableGenerator shardedTableGenerator0 = new ShardedTableGenerator("SE?_vxy8fZ", (BindingParameterInvoker) null, notUseTableShardingStrategy0);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      // Undeclared exception!
      try { 
        shardedTableGenerator0.getTable(defaultInvocationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.binding.DefaultInvocationContext", e);
      }
  }
}
