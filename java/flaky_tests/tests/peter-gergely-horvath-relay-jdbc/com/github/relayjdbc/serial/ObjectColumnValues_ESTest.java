/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 16:37:59 GMT 2022
 */

package com.github.relayjdbc.serial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.relayjdbc.serial.ObjectColumnValues;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ObjectColumnValues_ESTest extends ObjectColumnValues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, objectArray0);
      objectColumnValues0.setObject(1, (Object) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, objectArray0);
      objectColumnValues0.setIsNull(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, objectArray0);
      Object object0 = objectColumnValues0.getObject(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<ObjectColumnValues> class0 = ObjectColumnValues.class;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) class0;
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, objectArray0);
      Class class1 = (Class)objectColumnValues0.getObject(0);
      assertFalse(class1.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, 1);
      // Undeclared exception!
      try { 
        objectColumnValues0.isNull(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("com.github.relayjdbc.serial.ObjectColumnValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, 3042);
      // Undeclared exception!
      try { 
        objectColumnValues0.getObject(3042);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3042 out of bounds for length 3042
         //
         verifyException("com.github.relayjdbc.serial.ObjectColumnValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ObjectColumnValues objectColumnValues0 = null;
      try {
        objectColumnValues0 = new ObjectColumnValues(class0, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("com.github.relayjdbc.serial.ObjectColumnValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<ObjectColumnValues> class0 = ObjectColumnValues.class;
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, 0);
      // Undeclared exception!
      try { 
        objectColumnValues0.setObject(0, class0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, 1);
      // Undeclared exception!
      try { 
        objectColumnValues0.setObject(1, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("com.github.relayjdbc.serial.ObjectColumnValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues((Class) null, 62);
      // Undeclared exception!
      try { 
        objectColumnValues0.setObject(62, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.serial.ObjectColumnValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, objectArray0);
      boolean boolean0 = objectColumnValues0.isNull(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) class0;
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, objectArray0);
      boolean boolean0 = objectColumnValues0.isNull(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[0];
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, objectArray0);
      // Undeclared exception!
      try { 
        objectColumnValues0.setIsNull(1649);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1649 out of bounds for length 0
         //
         verifyException("com.github.relayjdbc.serial.ObjectColumnValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      ObjectColumnValues objectColumnValues0 = new ObjectColumnValues(class0, objectArray0);
      Object object0 = objectColumnValues0.getValues();
      assertSame(objectArray0, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ObjectColumnValues objectColumnValues0 = null;
      try {
        objectColumnValues0 = new ObjectColumnValues(class0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.serial.ObjectColumnValues", e);
      }
  }
}
