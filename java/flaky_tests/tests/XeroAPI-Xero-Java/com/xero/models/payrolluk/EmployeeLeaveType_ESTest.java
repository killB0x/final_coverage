/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 14:02:35 GMT 2022
 */

package com.xero.models.payrolluk;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.payrolluk.EmployeeLeaveType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmployeeLeaveType_ESTest extends EmployeeLeaveType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmployeeLeaveType.ScheduleOfAccrualEnum employeeLeaveType_ScheduleOfAccrualEnum0 = EmployeeLeaveType.ScheduleOfAccrualEnum.fromValue("BeginningOfCalendarYear");
      assertEquals(EmployeeLeaveType.ScheduleOfAccrualEnum.BEGINNINGOFCALENDARYEAR, employeeLeaveType_ScheduleOfAccrualEnum0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmployeeLeaveType.ScheduleOfAccrualEnum employeeLeaveType_ScheduleOfAccrualEnum0 = EmployeeLeaveType.ScheduleOfAccrualEnum.fromValue("OnAnniversaryDate");
      assertEquals(EmployeeLeaveType.ScheduleOfAccrualEnum.ONANNIVERSARYDATE, employeeLeaveType_ScheduleOfAccrualEnum0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmployeeLeaveType.ScheduleOfAccrualEnum.fromValue("BeginningOCalendarYe_r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'BeginningOCalendarYe_r'
         //
         verifyException("com.xero.models.payrolluk.EmployeeLeaveType$ScheduleOfAccrualEnum", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmployeeLeaveType employeeLeaveType0 = null;
      try {
        employeeLeaveType0 = new EmployeeLeaveType();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.payrolluk.EmployeeLeaveType", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmployeeLeaveType.ScheduleOfAccrualEnum employeeLeaveType_ScheduleOfAccrualEnum0 = EmployeeLeaveType.ScheduleOfAccrualEnum.ONANNIVERSARYDATE;
      String string0 = employeeLeaveType_ScheduleOfAccrualEnum0.getValue();
      assertEquals("OnAnniversaryDate", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmployeeLeaveType.ScheduleOfAccrualEnum employeeLeaveType_ScheduleOfAccrualEnum0 = EmployeeLeaveType.ScheduleOfAccrualEnum.ONANNIVERSARYDATE;
      String string0 = employeeLeaveType_ScheduleOfAccrualEnum0.toString();
      assertEquals("OnAnniversaryDate", string0);
  }
}
