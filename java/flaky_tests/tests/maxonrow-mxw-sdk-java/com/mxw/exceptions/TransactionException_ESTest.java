/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 10:16:06 GMT 2022
 */

package com.mxw.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mxw.exceptions.TransactionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TransactionException_ESTest extends TransactionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransactionException transactionException0 = new TransactionException("\"4T!7Wv<w");
      TransactionException transactionException1 = new TransactionException("\"4T!7Wv<w", transactionException0);
      assertFalse(transactionException1.equals((Object)transactionException0));
  }
}
