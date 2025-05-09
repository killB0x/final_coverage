/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 19:02:42 GMT 2022
 */

package org.moskito.javaagent.request.journey;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.moskito.javaagent.request.journey.JourneyRecord;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JourneyRecord_ESTest extends JourneyRecord_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JourneyRecord journeyRecord0 = new JourneyRecord("ygw&t");
      String string0 = journeyRecord0.getName();
      assertEquals("ygw&t", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JourneyRecord journeyRecord0 = new JourneyRecord("");
      String string0 = journeyRecord0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JourneyRecord journeyRecord0 = new JourneyRecord((String) null);
      String string0 = journeyRecord0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JourneyRecord journeyRecord0 = new JourneyRecord((String) null);
      String string0 = journeyRecord0.getUseCaseName();
      assertEquals("null-1", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JourneyRecord journeyRecord0 = new JourneyRecord((String) null);
      String string0 = journeyRecord0.toString();
      assertEquals("null - 0", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JourneyRecord journeyRecord0 = new JourneyRecord((String) null);
      int int0 = journeyRecord0.getRequestCount();
      assertEquals(1, int0);
  }
}
