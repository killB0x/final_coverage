/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 17:47:41 GMT 2022
 */

package com.urbanairship.api.experiments.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.urbanairship.api.experiments.model.Variant;
import com.urbanairship.api.experiments.model.VariantPushPayload;
import com.urbanairship.api.schedule.model.Schedule;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Variant_ESTest extends Variant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Variant.Builder variant_Builder0 = new Variant.Builder();
      Integer integer0 = new Integer(1999);
      Variant.Builder variant_Builder1 = variant_Builder0.setWeight(integer0);
      assertSame(variant_Builder0, variant_Builder1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Variant.Builder variant_Builder0 = Variant.newBuilder();
      Variant.Builder variant_Builder1 = variant_Builder0.setPushPayload((VariantPushPayload) null);
      assertSame(variant_Builder0, variant_Builder1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Variant.Builder variant_Builder0 = Variant.newBuilder();
      Variant.Builder variant_Builder1 = variant_Builder0.setName("Tm(FOYZQdo");
      assertSame(variant_Builder1, variant_Builder0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Variant.Builder variant_Builder0 = new Variant.Builder();
      // Undeclared exception!
      try { 
        variant_Builder0.build();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.urbanairship.api.experiments.model.Variant$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Variant.Builder variant_Builder0 = new Variant.Builder();
      Variant.Builder variant_Builder1 = variant_Builder0.setSchedule((Schedule) null);
      assertSame(variant_Builder1, variant_Builder0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Variant.Builder variant_Builder0 = Variant.newBuilder();
      Variant.Builder variant_Builder1 = variant_Builder0.setDescription("");
      assertSame(variant_Builder0, variant_Builder1);
  }
}
