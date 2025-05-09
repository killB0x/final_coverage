/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:11:48 GMT 2022
 */

package jp.co.yahoo.yosegi.message.design;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import jp.co.yahoo.yosegi.message.design.ArrayContainerField;
import jp.co.yahoo.yosegi.message.design.BooleanField;
import jp.co.yahoo.yosegi.message.design.ByteField;
import jp.co.yahoo.yosegi.message.design.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IField_ESTest extends IField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanField booleanField0 = new BooleanField("W` ", (Properties) null);
      // Undeclared exception!
      try { 
        booleanField0.toJavaObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.message.design.IField", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Properties properties0 = new Properties(hashMap0);
      BooleanField booleanField0 = new BooleanField("`%M}UT9q %Xm,djI(J", properties0);
      ArrayContainerField arrayContainerField0 = new ArrayContainerField("`%M}UT9q %Xm,djI(J", booleanField0, properties0);
      // Undeclared exception!
      try { 
        arrayContainerField0.merge(booleanField0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // target is not ArrayContainerField.
         //
         verifyException("jp.co.yahoo.yosegi.message.design.ArrayContainerField", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Properties properties0 = new Properties();
      ByteField byteField0 = new ByteField("", properties0);
      byteField0.merge(byteField0);
      assertEquals("", byteField0.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanField booleanField0 = new BooleanField("");
      Map<Object, Object> map0 = booleanField0.toJavaObject();
      assertEquals(3, map0.size());
  }
}
