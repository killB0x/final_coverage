/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 17:14:08 GMT 2022
 */

package com.xero.models.payrolluk;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.payrolluk.EmployeeStatutoryLeaveBalance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmployeeStatutoryLeaveBalance_ESTest extends EmployeeStatutoryLeaveBalance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmployeeStatutoryLeaveBalance.LeaveTypeEnum employeeStatutoryLeaveBalance_LeaveTypeEnum0 = EmployeeStatutoryLeaveBalance.LeaveTypeEnum.fromValue("Paternity");
      assertEquals(EmployeeStatutoryLeaveBalance.LeaveTypeEnum.PATERNITY, employeeStatutoryLeaveBalance_LeaveTypeEnum0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmployeeStatutoryLeaveBalance.LeaveTypeEnum employeeStatutoryLeaveBalance_LeaveTypeEnum0 = EmployeeStatutoryLeaveBalance.LeaveTypeEnum.MATERNITY;
      String string0 = employeeStatutoryLeaveBalance_LeaveTypeEnum0.toString();
      assertEquals("Maternity", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmployeeStatutoryLeaveBalance.UnitsEnum employeeStatutoryLeaveBalance_UnitsEnum0 = EmployeeStatutoryLeaveBalance.UnitsEnum.fromValue("Hours");
      assertEquals("Hours", employeeStatutoryLeaveBalance_UnitsEnum0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmployeeStatutoryLeaveBalance.UnitsEnum.fromValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value ''
         //
         verifyException("com.xero.models.payrolluk.EmployeeStatutoryLeaveBalance$UnitsEnum", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmployeeStatutoryLeaveBalance.LeaveTypeEnum employeeStatutoryLeaveBalance_LeaveTypeEnum0 = EmployeeStatutoryLeaveBalance.LeaveTypeEnum.fromValue("Sick");
      assertEquals(EmployeeStatutoryLeaveBalance.LeaveTypeEnum.SICK, employeeStatutoryLeaveBalance_LeaveTypeEnum0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmployeeStatutoryLeaveBalance.LeaveTypeEnum.fromValue("Wrong date format");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'Wrong date format'
         //
         verifyException("com.xero.models.payrolluk.EmployeeStatutoryLeaveBalance$LeaveTypeEnum", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmployeeStatutoryLeaveBalance.LeaveTypeEnum employeeStatutoryLeaveBalance_LeaveTypeEnum0 = EmployeeStatutoryLeaveBalance.LeaveTypeEnum.MATERNITY;
      String string0 = employeeStatutoryLeaveBalance_LeaveTypeEnum0.getValue();
      assertEquals("Maternity", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EmployeeStatutoryLeaveBalance employeeStatutoryLeaveBalance0 = null;
      try {
        employeeStatutoryLeaveBalance0 = new EmployeeStatutoryLeaveBalance();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.payrolluk.EmployeeStatutoryLeaveBalance", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      EmployeeStatutoryLeaveBalance.UnitsEnum employeeStatutoryLeaveBalance_UnitsEnum0 = EmployeeStatutoryLeaveBalance.UnitsEnum.HOURS;
      String string0 = employeeStatutoryLeaveBalance_UnitsEnum0.toString();
      assertEquals("Hours", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      EmployeeStatutoryLeaveBalance.UnitsEnum employeeStatutoryLeaveBalance_UnitsEnum0 = EmployeeStatutoryLeaveBalance.UnitsEnum.HOURS;
      String string0 = employeeStatutoryLeaveBalance_UnitsEnum0.getValue();
      assertEquals("Hours", string0);
  }
}
