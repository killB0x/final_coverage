/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 14:23:19 GMT 2022
 */

package es.bsc.dataclay.api;

import org.junit.Test;
import static org.junit.Assert.*;
import es.bsc.dataclay.api.DataClayException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DataClayException_ESTest extends DataClayException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataClayException dataClayException0 = new DataClayException("|.teU[_yWkv");
      DataClayException dataClayException1 = new DataClayException(dataClayException0);
      assertFalse(dataClayException1.equals((Object)dataClayException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataClayException dataClayException0 = new DataClayException();
  }
}
