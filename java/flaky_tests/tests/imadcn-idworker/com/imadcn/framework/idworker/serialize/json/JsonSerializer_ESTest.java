/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:54:26 GMT 2022
 */

package com.imadcn.framework.idworker.serialize.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.imadcn.framework.idworker.serialize.json.FastJsonSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonSerializer_ESTest extends JsonSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FastJsonSerializer<Integer> fastJsonSerializer0 = new FastJsonSerializer<Integer>();
      // Undeclared exception!
      try { 
        fastJsonSerializer0.toJsonString("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/alibaba/fastjson/serializer/SerializerFeature
         //
         verifyException("com.imadcn.framework.idworker.serialize.json.FastJsonSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FastJsonSerializer<Object> fastJsonSerializer0 = new FastJsonSerializer<Object>();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        fastJsonSerializer0.parseObject("yyyy-MM-dd HH:mm:ss", class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/alibaba/fastjson/JSON
         //
         verifyException("com.imadcn.framework.idworker.serialize.json.FastJsonSerializer", e);
      }
  }
}
