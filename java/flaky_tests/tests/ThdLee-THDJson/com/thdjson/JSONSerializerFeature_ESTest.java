/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 15:47:35 GMT 2022
 */

package com.thdjson;

import org.junit.Test;
import static org.junit.Assert.*;
import com.thdjson.JSONSerializerFeature;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JSONSerializerFeature_ESTest extends JSONSerializerFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSONSerializerFeature[] jSONSerializerFeatureArray0 = JSONSerializerFeature.values();
      assertEquals(2, jSONSerializerFeatureArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSONSerializerFeature jSONSerializerFeature0 = JSONSerializerFeature.valueOf("CaseInsensitive");
      assertEquals(JSONSerializerFeature.CaseInsensitive, jSONSerializerFeature0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSONSerializerFeature jSONSerializerFeature0 = JSONSerializerFeature.AllowNonPublic;
      int int0 = jSONSerializerFeature0.getMask();
      assertEquals(2, int0);
  }
}
