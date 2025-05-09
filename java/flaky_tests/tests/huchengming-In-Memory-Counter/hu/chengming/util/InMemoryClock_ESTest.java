/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 15:13:41 GMT 2022
 */

package hu.chengming.util;

import org.junit.Test;
import static org.junit.Assert.*;
import hu.chengming.util.InMemoryClock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InMemoryClock_ESTest extends InMemoryClock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InMemoryClock inMemoryClock0 = InMemoryClock.getInstance();
      long long0 = inMemoryClock0.currentTimestamp();
      assertEquals(1392409281L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InMemoryClock inMemoryClock0 = InMemoryClock.getInstance();
      long long0 = inMemoryClock0.currentTimeMillis();
      assertEquals(1392409281320L, long0);
  }
}
