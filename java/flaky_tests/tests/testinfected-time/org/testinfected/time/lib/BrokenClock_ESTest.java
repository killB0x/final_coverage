/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 06:28:00 GMT 2022
 */

package org.testinfected.time.lib;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.testinfected.time.Clock;
import org.testinfected.time.lib.BrokenClock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BrokenClock_ESTest extends BrokenClock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3880, 3880, 3880);
      Clock clock0 = BrokenClock.stoppedAt(mockDate0);
      Date date0 = clock0.now();
      assertEquals("Wed Dec 13 00:00:00 GMT 6113", date0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Clock clock0 = BrokenClock.stoppedAt((Date) null);
      Date date0 = clock0.now();
      assertNull(date0);
  }
}
