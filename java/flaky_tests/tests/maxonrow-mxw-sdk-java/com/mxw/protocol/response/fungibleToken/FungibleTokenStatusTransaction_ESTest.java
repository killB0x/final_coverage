/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 10:09:30 GMT 2022
 */

package com.mxw.protocol.response.fungibleToken;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload;
import com.mxw.protocol.response.fungibleToken.FungibleTokenStatusTransaction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FungibleTokenStatusTransaction_ESTest extends FungibleTokenStatusTransaction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FungibleTokenStatusPayload fungibleTokenStatusPayload0 = new FungibleTokenStatusPayload();
      FungibleTokenStatusTransaction fungibleTokenStatusTransaction0 = new FungibleTokenStatusTransaction(fungibleTokenStatusPayload0);
  }
}
