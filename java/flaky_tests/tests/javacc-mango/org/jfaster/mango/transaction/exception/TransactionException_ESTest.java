/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 15:49:58 GMT 2022
 */

package org.jfaster.mango.transaction.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.transaction.exception.CannotCreateTransactionException;
import org.jfaster.mango.transaction.exception.IllegalTransactionStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TransactionException_ESTest extends TransactionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IllegalTransactionStateException illegalTransactionStateException0 = new IllegalTransactionStateException("Ur>,k5>+xxylKDL");
      CannotCreateTransactionException cannotCreateTransactionException0 = new CannotCreateTransactionException("Ur>,k5>+xxylKDL", illegalTransactionStateException0);
  }
}
