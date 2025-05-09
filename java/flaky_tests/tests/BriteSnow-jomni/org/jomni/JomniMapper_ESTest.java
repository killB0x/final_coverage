/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 02:10:58 GMT 2022
 */

package org.jomni;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jomni.ClassInfo;
import org.jomni.ConverterRegistry;
import org.jomni.JomniMapper;
import org.jomni.Omni;
import org.jomni.PropInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JomniMapper_ESTest extends JomniMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      HashMap<ClassInfo, ClassInfo> hashMap0 = new HashMap<ClassInfo, ClassInfo>();
      hashMap0.put((ClassInfo) null, (ClassInfo) null);
      Map<String, Object> map0 = jomniMapper0.asMap(hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      // Undeclared exception!
      try { 
        jomniMapper0.getClassInfo((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Class<ClassInfo> class0 = ClassInfo.class;
      ClassInfo classInfo0 = jomniMapper0.getClassInfo(class0);
      Class<PropInfo> class1 = PropInfo.class;
      ClassInfo classInfo1 = new ClassInfo(class1);
      Map<String, PropInfo> map0 = classInfo1.propInfoByPropName;
      classInfo0.propInfoByPropName = map0;
      // Undeclared exception!
      try { 
        jomniMapper0.asMap(classInfo0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error while calling read method getReadMethod for property readMethod on object org.jomni.ClassInfo@49
         // java.lang.IllegalArgumentException: java.lang.ClassCastException@5824e0ec
         //
         verifyException("org.jomni.ClassInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Class<ClassInfo> class0 = ClassInfo.class;
      ClassInfo classInfo0 = jomniMapper0.getClassInfo(class0);
      classInfo0.propInfoByPropName = null;
      // Undeclared exception!
      try { 
        jomniMapper0.asMap(classInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jomni.ClassInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      // Undeclared exception!
      try { 
        jomniMapper0.as((Supplier<ClassInfo>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jomni.JomniMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      HashMap<ArrayList<ClassInfo>, ClassInfo> hashMap0 = new HashMap<ArrayList<ClassInfo>, ClassInfo>();
      // Undeclared exception!
      try { 
        jomniMapper0.as((Class<Object>) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jomni.JomniMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JomniMapper jomniMapper0 = null;
      try {
        jomniMapper0 = new JomniMapper((ConverterRegistry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jomni.JomniMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Class<ClassInfo> class0 = ClassInfo.class;
      ClassInfo classInfo0 = new ClassInfo(class0);
      jomniMapper0.omni(classInfo0);
      ClassInfo classInfo1 = jomniMapper0.getClassInfo(class0);
      assertFalse(classInfo1.equals((Object)classInfo0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Class<ClassInfo> class0 = ClassInfo.class;
      ArrayList<ClassInfo> arrayList0 = new ArrayList<ClassInfo>();
      // Undeclared exception!
      try { 
        jomniMapper0.as(class0, arrayList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.InstantiationException: org.jomni.ClassInfo
         //
         verifyException("org.jomni.JomniMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Class<ClassInfo> class0 = ClassInfo.class;
      ClassInfo classInfo0 = jomniMapper0.as(class0, (HashMap<ArrayList<ClassInfo>, ClassInfo>) null);
      assertNull(classInfo0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Class<Object> class0 = Object.class;
      Class<ClassInfo> class1 = ClassInfo.class;
      ClassInfo classInfo0 = new ClassInfo(class1);
      Object object0 = jomniMapper0.as(class0, classInfo0);
      assertSame(object0, classInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Map<String, Object> map0 = jomniMapper0.asMap(converterRegistry0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Map<String, Object> map0 = jomniMapper0.asMap((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Supplier<ClassInfo> supplier0 = (Supplier<ClassInfo>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Omni<ClassInfo> omni0 = jomniMapper0.as(supplier0);
      assertNotNull(omni0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConverterRegistry converterRegistry0 = new ConverterRegistry();
      JomniMapper jomniMapper0 = new JomniMapper(converterRegistry0);
      Class<PropInfo> class0 = PropInfo.class;
      Function<ArrayList<ClassInfo>, PropInfo> function0 = jomniMapper0.as(class0);
      assertNotNull(function0);
  }
}
