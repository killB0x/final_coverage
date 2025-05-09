/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:57:52 GMT 2022
 */

package jp.co.yahoo.yosegi.util;

import org.junit.Test;
import static org.junit.Assert.*;
import jp.co.yahoo.yosegi.util.DetermineMinMax;
import jp.co.yahoo.yosegi.util.DetermineMinMaxFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DetermineMinMaxFactory_ESTest extends DetermineMinMaxFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DetermineMinMax<String> determineMinMax0 = DetermineMinMaxFactory.createString();
      assertNotNull(determineMinMax0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DetermineMinMax<Float> determineMinMax0 = DetermineMinMaxFactory.createFloat();
      assertNotNull(determineMinMax0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DetermineMinMax<Integer> determineMinMax0 = DetermineMinMaxFactory.createInt();
      assertNotNull(determineMinMax0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DetermineMinMax<Long> determineMinMax0 = DetermineMinMaxFactory.createLong();
      assertNotNull(determineMinMax0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DetermineMinMax<Double> determineMinMax0 = DetermineMinMaxFactory.createDouble();
      assertNotNull(determineMinMax0);
  }
}
