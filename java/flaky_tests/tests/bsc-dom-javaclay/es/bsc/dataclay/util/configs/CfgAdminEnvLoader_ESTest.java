/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 13:12:40 GMT 2022
 */

package es.bsc.dataclay.util.configs;

import org.junit.Test;
import static org.junit.Assert.*;
import es.bsc.dataclay.util.configs.CfgAdminEnvLoader;
import es.bsc.dataclay.util.management.accountmgr.Account;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CfgAdminEnvLoader_ESTest extends CfgAdminEnvLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Account account0 = CfgAdminEnvLoader.parseAdminUser();
      assertNull(account0);
  }
}
