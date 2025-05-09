/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 18:13:06 GMT 2022
 */

package com.lassekoskela.maven.timeline;

import org.junit.Test;
import static org.junit.Assert.*;
import com.lassekoskela.maven.timeline.TimelineExportException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimelineExportException_ESTest extends TimelineExportException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("isax0[;vg");
      TimelineExportException timelineExportException0 = new TimelineExportException(mockThrowable0);
      TimelineExportException timelineExportException1 = new TimelineExportException("nOo ", timelineExportException0);
      assertFalse(timelineExportException1.equals((Object)timelineExportException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimelineExportException timelineExportException0 = new TimelineExportException("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimelineExportException timelineExportException0 = new TimelineExportException();
      TimelineExportException timelineExportException1 = new TimelineExportException(timelineExportException0);
      assertFalse(timelineExportException1.equals((Object)timelineExportException0));
  }
}
