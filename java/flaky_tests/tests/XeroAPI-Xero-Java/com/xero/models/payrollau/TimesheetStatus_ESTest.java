/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 19:44:27 GMT 2022
 */

package com.xero.models.payrollau;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.payrollau.TimesheetStatus;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimesheetStatus_ESTest extends TimesheetStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimesheetStatus timesheetStatus0 = TimesheetStatus.fromValue("REJECTED");
      assertEquals(TimesheetStatus.REJECTED, timesheetStatus0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimesheetStatus[] timesheetStatusArray0 = TimesheetStatus.values();
      assertEquals(5, timesheetStatusArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimesheetStatus timesheetStatus0 = TimesheetStatus.valueOf("REQUESTED");
      assertEquals(TimesheetStatus.REQUESTED, timesheetStatus0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimesheetStatus timesheetStatus0 = TimesheetStatus.fromValue("REQUESTED");
      assertEquals(TimesheetStatus.REQUESTED, timesheetStatus0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimesheetStatus.fromValue("7}tNynFi8]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value '7}tNynFi8]'
         //
         verifyException("com.xero.models.payrollau.TimesheetStatus", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TimesheetStatus timesheetStatus0 = TimesheetStatus.REJECTED;
      String string0 = timesheetStatus0.getValue();
      assertEquals("REJECTED", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TimesheetStatus timesheetStatus0 = TimesheetStatus.REJECTED;
      String string0 = timesheetStatus0.toString();
      assertEquals("REJECTED", string0);
  }
}
