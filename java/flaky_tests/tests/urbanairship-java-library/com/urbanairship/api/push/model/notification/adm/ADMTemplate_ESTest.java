/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 18:49:02 GMT 2022
 */

package com.urbanairship.api.push.model.notification.adm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.urbanairship.api.push.model.notification.adm.ADMFields;
import com.urbanairship.api.push.model.notification.adm.ADMTemplate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ADMTemplate_ESTest extends ADMTemplate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ADMTemplate.Builder aDMTemplate_Builder0 = new ADMTemplate.Builder();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ADMTemplate.Builder aDMTemplate_Builder0 = ADMTemplate.newBuilder();
      aDMTemplate_Builder0.setTemplateId("}ULEez015&}K");
      // Undeclared exception!
      try { 
        aDMTemplate_Builder0.build();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.urbanairship.api.push.model.notification.adm.ADMTemplate$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ADMTemplate.Builder aDMTemplate_Builder0 = ADMTemplate.newBuilder();
      // Undeclared exception!
      try { 
        aDMTemplate_Builder0.build();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.urbanairship.api.push.model.notification.adm.ADMTemplate$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ADMTemplate.Builder aDMTemplate_Builder0 = ADMTemplate.newBuilder();
      ADMFields aDMFields0 = mock(ADMFields.class, new ViolatedAssumptionAnswer());
      aDMTemplate_Builder0.setFields(aDMFields0);
      aDMTemplate_Builder0.setTemplateId("}ULEez015&}K");
      // Undeclared exception!
      try { 
        aDMTemplate_Builder0.build();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.urbanairship.api.push.model.notification.adm.ADMTemplate$Builder", e);
      }
  }
}
