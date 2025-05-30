/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 14:59:24 GMT 2022
 */

package com.hanframework.kit.method;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hanframework.kit.method.MethodParameter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MethodParameter_ESTest extends MethodParameter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodParameter.forMethodOrConstructor((Object) null, 31);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given object [null] is neither a Method nor a Constructor
         //
         verifyException("com.hanframework.kit.method.MethodParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter((Constructor<?>) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Constructor must not be null
         //
         verifyException("com.hanframework.kit.asserts.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter((MethodParameter) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Original must not be null
         //
         verifyException("com.hanframework.kit.asserts.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter((Constructor<?>) null, (-2963), (-2963));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Constructor must not be null
         //
         verifyException("com.hanframework.kit.asserts.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter((Method) null, 1768);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must not be null
         //
         verifyException("com.hanframework.kit.asserts.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter((Method) null, 1742, 1742);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must not be null
         //
         verifyException("com.hanframework.kit.asserts.Assert", e);
      }
  }
}
