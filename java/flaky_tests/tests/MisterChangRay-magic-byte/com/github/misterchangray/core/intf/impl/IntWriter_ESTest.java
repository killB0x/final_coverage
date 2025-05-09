/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 16:37:36 GMT 2022
 */

package com.github.misterchangray.core.intf.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.misterchangray.core.clazz.FieldMetaInfo;
import com.github.misterchangray.core.intf.impl.IntWriter;
import com.github.misterchangray.core.util.DynamicByteBuffer;
import java.nio.BufferOverflowException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IntWriter_ESTest extends IntWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldMetaInfo fieldMetaInfo0 = new FieldMetaInfo();
      IntWriter intWriter0 = new IntWriter(fieldMetaInfo0);
      Integer integer0 = new Integer((-5));
      Integer integer1 = new Integer(1);
      // Undeclared exception!
      try { 
        intWriter0.writeToObject(integer0, integer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.misterchangray.core.intf.impl.IntWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate();
      FieldMetaInfo fieldMetaInfo0 = new FieldMetaInfo();
      IntWriter intWriter0 = new IntWriter(fieldMetaInfo0);
      intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) null, (Object) fieldMetaInfo0);
      assertEquals(0, fieldMetaInfo0.getDefaultVal());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FieldMetaInfo fieldMetaInfo0 = new FieldMetaInfo();
      IntWriter intWriter0 = new IntWriter(fieldMetaInfo0);
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate(1);
      Integer integer0 = new Integer(1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) integer0, object0, 1);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IntWriter intWriter0 = new IntWriter((FieldMetaInfo) null);
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate();
      Integer integer0 = new Integer((-31));
      // Undeclared exception!
      try { 
        intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) integer0, (Object) integer0, (-31));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IntWriter intWriter0 = new IntWriter((FieldMetaInfo) null);
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate(22);
      // Undeclared exception!
      try { 
        intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) dynamicByteBuffer0, (Object) dynamicByteBuffer0, 22);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.github.misterchangray.core.util.DynamicByteBuffer cannot be cast to class java.lang.Integer (com.github.misterchangray.core.util.DynamicByteBuffer is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @7d475389; java.lang.Integer is in module java.base of loader 'bootstrap')
         //
         verifyException("com.github.misterchangray.core.intf.impl.IntWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FieldMetaInfo fieldMetaInfo0 = new FieldMetaInfo();
      IntWriter intWriter0 = new IntWriter(fieldMetaInfo0);
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate(1);
      // Undeclared exception!
      try { 
        intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) null, (Object) fieldMetaInfo0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FieldMetaInfo fieldMetaInfo0 = new FieldMetaInfo();
      IntWriter intWriter0 = new IntWriter(fieldMetaInfo0);
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate();
      // Undeclared exception!
      try { 
        intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) fieldMetaInfo0, (Object) dynamicByteBuffer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.github.misterchangray.core.clazz.FieldMetaInfo cannot be cast to class java.lang.Integer (com.github.misterchangray.core.clazz.FieldMetaInfo is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @7d475389; java.lang.Integer is in module java.base of loader 'bootstrap')
         //
         verifyException("com.github.misterchangray.core.intf.impl.IntWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IntWriter intWriter0 = new IntWriter((FieldMetaInfo) null);
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate();
      // Undeclared exception!
      try { 
        intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) null, (Object) null, (-70));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.misterchangray.core.intf.impl.IntWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FieldMetaInfo fieldMetaInfo0 = new FieldMetaInfo();
      IntWriter intWriter0 = new IntWriter(fieldMetaInfo0);
      Integer integer0 = new Integer((-5));
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate();
      intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) integer0, (Object) null, 1880);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      IntWriter intWriter0 = new IntWriter((FieldMetaInfo) null);
      DynamicByteBuffer dynamicByteBuffer0 = DynamicByteBuffer.allocate();
      // Undeclared exception!
      try { 
        intWriter0.writeToBuffer(dynamicByteBuffer0, (Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.misterchangray.core.intf.impl.IntWriter", e);
      }
  }
}
