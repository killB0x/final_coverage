/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 23:16:16 GMT 2022
 */

package org.gedcom4j.io.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.io.event.FileProgressEvent;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileProgressEvent_ESTest extends FileProgressEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, (-420), 75, true);
      boolean boolean0 = fileProgressEvent0.isComplete();
      assertEquals((-420), fileProgressEvent0.getLinesProcessed());
      assertTrue(boolean0);
      assertEquals(75, fileProgressEvent0.getBytesProcessed());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, 978, 978, true);
      int int0 = fileProgressEvent0.getLinesProcessed();
      assertEquals(978, int0);
      assertTrue(fileProgressEvent0.isComplete());
      assertEquals(978, fileProgressEvent0.getBytesProcessed());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, (-420), 75, true);
      int int0 = fileProgressEvent0.getLinesProcessed();
      assertTrue(fileProgressEvent0.isComplete());
      assertEquals(75, fileProgressEvent0.getBytesProcessed());
      assertEquals((-420), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, (-420), 75, true);
      int int0 = fileProgressEvent0.getBytesProcessed();
      assertEquals((-420), fileProgressEvent0.getLinesProcessed());
      assertEquals(75, int0);
      assertTrue(fileProgressEvent0.isComplete());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, (-13), (-13), false);
      int int0 = fileProgressEvent0.getBytesProcessed();
      assertFalse(fileProgressEvent0.isComplete());
      assertEquals((-13), int0);
      assertEquals((-13), fileProgressEvent0.getLinesProcessed());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileProgressEvent fileProgressEvent0 = null;
      try {
        fileProgressEvent0 = new FileProgressEvent((Object) null, 514, 514, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, 0, 0, false);
      int int0 = fileProgressEvent0.getBytesProcessed();
      assertFalse(fileProgressEvent0.isComplete());
      assertEquals(0, fileProgressEvent0.getLinesProcessed());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, 0, 0, false);
      String string0 = fileProgressEvent0.toString();
      assertEquals("FileProgressEvent [complete=false, linesProcessed=0, bytesProcessed=0]", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, 0, 0, false);
      boolean boolean0 = fileProgressEvent0.isComplete();
      assertFalse(boolean0);
      assertEquals(0, fileProgressEvent0.getLinesProcessed());
      assertEquals(0, fileProgressEvent0.getBytesProcessed());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Object object0 = new Object();
      FileProgressEvent fileProgressEvent0 = new FileProgressEvent(object0, 0, 0, false);
      int int0 = fileProgressEvent0.getLinesProcessed();
      assertEquals(0, int0);
      assertFalse(fileProgressEvent0.isComplete());
      assertEquals(0, fileProgressEvent0.getBytesProcessed());
  }
}
