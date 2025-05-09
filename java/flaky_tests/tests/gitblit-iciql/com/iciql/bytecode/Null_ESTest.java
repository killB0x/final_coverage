/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 11:40:37 GMT 2022
 */

package com.iciql.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iciql.Query;
import com.iciql.SQLStatement;
import com.iciql.bytecode.Null;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Null_ESTest extends Null_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Null null0 = Null.INSTANCE;
      SQLStatement sQLStatement0 = mock(SQLStatement.class, new ViolatedAssumptionAnswer());
      doReturn((SQLStatement) null).when(sQLStatement0).appendSQL(anyString());
      null0.appendSQL(sQLStatement0, (Query<Integer>) null);
      assertEquals("null", null0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Null null0 = Null.INSTANCE;
      String string0 = null0.toString();
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Null null0 = Null.INSTANCE;
      // Undeclared exception!
      try { 
        null0.appendSQL((SQLStatement) null, (Query<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.bytecode.Null", e);
      }
  }
}
