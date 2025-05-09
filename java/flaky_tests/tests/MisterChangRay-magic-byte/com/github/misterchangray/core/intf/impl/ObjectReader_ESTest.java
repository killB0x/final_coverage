/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 16:44:21 GMT 2022
 */

package com.github.misterchangray.core.intf.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.misterchangray.core.clazz.FieldMetaInfo;
import com.github.misterchangray.core.intf.impl.ObjectReader;
import com.github.misterchangray.core.util.DynamicByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ObjectReader_ESTest extends ObjectReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldMetaInfo fieldMetaInfo0 = new FieldMetaInfo();
      ObjectReader objectReader0 = new ObjectReader(fieldMetaInfo0);
      // Undeclared exception!
      try { 
        objectReader0.readFormObject(fieldMetaInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.misterchangray.core.intf.impl.ObjectReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectReader objectReader0 = new ObjectReader((FieldMetaInfo) null);
      // Undeclared exception!
      try { 
        objectReader0.readFormBuffer((DynamicByteBuffer) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.misterchangray.core.intf.impl.ObjectReader", e);
      }
  }
}
