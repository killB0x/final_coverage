/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 01:02:26 GMT 2022
 */

package org.jfaster.mango.transaction.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.jfaster.mango.transaction.exception.CannotCreateTransactionException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TransactionException_ESTest extends TransactionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CannotCreateTransactionException cannotCreateTransactionException0 = new CannotCreateTransactionException("org.jfaster.mango.transaction.exception.TransactionException");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      CannotCreateTransactionException cannotCreateTransactionException0 = new CannotCreateTransactionException("kL)6fF|j)w$A7Nz", mockThrowable0);
  }
}
