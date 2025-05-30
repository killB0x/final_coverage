/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 19:47:59 GMT 2022
 */

package com.alipay.sofa.common.profile.enumeration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alipay.sofa.common.profile.diagnostic.Profiler;
import com.alipay.sofa.common.profile.enumeration.Enum;
import com.alipay.sofa.common.profile.enumeration.EnumUtil;
import java.util.Iterator;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EnumUtil_ESTest extends EnumUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Map map0 = EnumUtil.getEnumMap(class0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Class class1 = EnumUtil.getUnderlyingClass(class0);
      assertEquals(17, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Enum.EnumType enum_EnumType0 = EnumUtil.getEnumType(class0);
      assertNotNull(enum_EnumType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Iterator iterator0 = EnumUtil.getEnumIterator(class0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Map map0 = EnumUtil.getEnumEntryMap(class0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Map map0 = EnumUtil.getEnumEntryMap(class0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Enum enum0 = EnumUtil.getEnumByValue((Class) class0, (Number) null);
      assertNull(enum0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Enum enum0 = EnumUtil.getEnumByValue(class0, 0L);
      assertNull(enum0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.isValueDefined((Class) null, (Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EnumUtil.isValueDefined(class0, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.Object\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.isNameDefined((Class) null, "g");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EnumUtil.isNameDefined(class0, "U-0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.Object\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.getUnderlyingClass((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EnumUtil.getEnumType(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.Object\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.getEnumMap((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.getEnumIterator((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.getEnumEntryMap((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.getEnumByValue((Class) null, (Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.getEnumByValue((Class) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EnumUtil.getEnumByValue(class0, (-928));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.Object\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.getEnumByName((Class) null, "UQbUF");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        EnumUtil.getEnumByName(class0, "+---");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.String\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumUtil.getEnumType((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The Enum class must not be null
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Enum enum0 = EnumUtil.getEnumByValue(class0, (-3223));
      assertNull(enum0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      Enum enum0 = EnumUtil.getEnumByName(class0, "+---");
      assertNull(enum0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      boolean boolean0 = EnumUtil.isValueDefined(class0, (Number) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Profiler.MessageLevel> class0 = Profiler.MessageLevel.class;
      boolean boolean0 = EnumUtil.isNameDefined(class0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EnumUtil.getEnumMap(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.Object\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EnumUtil.getEnumByValue(class0, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.Object\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EnumUtil.getUnderlyingClass(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.Object\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        EnumUtil.getEnumByValue(class0, 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.String\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EnumUtil enumUtil0 = new EnumUtil();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EnumUtil.getEnumIterator(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class \"java.lang.Object\" is not a subclass of Enum
         //
         verifyException("com.alipay.sofa.common.profile.enumeration.EnumUtil", e);
      }
  }
}
