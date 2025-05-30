/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 09:25:54 GMT 2022
 */

package io.github.rcarlosdasilva.kits.net.ua;

import org.junit.Test;
import static org.junit.Assert.*;
import io.github.rcarlosdasilva.kits.net.ua.SafariUtils;
import io.github.rcarlosdasilva.kits.net.ua.Version;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SafariUtils_ESTest extends SafariUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SafariUtils safariUtils0 = new SafariUtils();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Map<String, Version> map0 = SafariUtils.getWebKitToSafariVersion();
      assertEquals(80, map0.size());
  }
}
