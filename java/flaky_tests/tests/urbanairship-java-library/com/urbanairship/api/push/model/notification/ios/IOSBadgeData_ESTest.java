/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 17:32:00 GMT 2022
 */

package com.urbanairship.api.push.model.notification.ios;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.urbanairship.api.push.model.notification.ios.IOSBadgeData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IOSBadgeData_ESTest extends IOSBadgeData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IOSBadgeData.Type iOSBadgeData_Type0 = IOSBadgeData.Type.get("AUTO");
      assertEquals(IOSBadgeData.Type.AUTO, iOSBadgeData_Type0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IOSBadgeData.Type.get("5w&CZ2vFNUUVyL");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IOSBadgeData.Builder iOSBadgeData_Builder0 = IOSBadgeData.newBuilder();
      IOSBadgeData.Type iOSBadgeData_Type0 = IOSBadgeData.Type.get("DECREMENT");
      assertEquals(IOSBadgeData.Type.DECREMENT, iOSBadgeData_Type0);
      
      iOSBadgeData_Builder0.setType(iOSBadgeData_Type0);
      assertEquals("decrement", iOSBadgeData_Type0.getIdentifier());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IOSBadgeData.Builder iOSBadgeData_Builder0 = IOSBadgeData.newBuilder();
      IOSBadgeData.Builder iOSBadgeData_Builder1 = iOSBadgeData_Builder0.setValue(0);
      assertSame(iOSBadgeData_Builder0, iOSBadgeData_Builder1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IOSBadgeData.Builder iOSBadgeData_Builder0 = IOSBadgeData.newBuilder();
      // Undeclared exception!
      try { 
        iOSBadgeData_Builder0.build();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.urbanairship.api.push.model.notification.ios.IOSBadgeData$Builder", e);
      }
  }
}
