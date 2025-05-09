/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:23:36 GMT 2022
 */

package org.jfaster.mango.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.util.Primitives;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Primitives_ESTest extends Primitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Primitives.allPrimitiveTypes();
      Primitives.allPrimitiveTypes();
      Primitives.allWrapperTypes();
      Primitives.isWrapperType(class0);
      Class<Character> class1 = Primitives.unwrap(class0);
      Primitives.allPrimitiveTypes();
      Primitives.allWrapperTypes();
      Primitives.allWrapperTypes();
      Primitives.isWrapperType(class0);
      Class<Object> class2 = Object.class;
      Class<Object> class3 = Primitives.unwrap(class2);
      assertNotNull(class3);
      
      Primitives.allWrapperTypes();
      Class<Character> class4 = Character.class;
      Primitives.isWrapperType(class4);
      Primitives.wrap((Class<Object>) null);
      Primitives.allPrimitiveTypes();
      Primitives.allWrapperTypes();
      Primitives.allPrimitiveTypes();
      Class<Object> class5 = Object.class;
      Primitives.isWrapperType(class5);
      Primitives.allPrimitiveTypes();
      Primitives.unwrap((Class<Object>) null);
      boolean boolean0 = Primitives.isWrapperType(class1);
      assertFalse(boolean0);
      
      Class<Character> class6 = Character.class;
      boolean boolean1 = Primitives.isWrapperType(class6);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Class<Character> class1 = Primitives.unwrap(class0);
      assertTrue(class1.isPrimitive());
      
      Primitives.allPrimitiveTypes();
      Primitives.isWrapperType(class1);
      Primitives.allPrimitiveTypes();
      Primitives.allWrapperTypes();
      Primitives.isWrapperType(class0);
      Class<Character> class2 = Primitives.unwrap(class0);
      Primitives.allPrimitiveTypes();
      Primitives.allWrapperTypes();
      Primitives.allWrapperTypes();
      Primitives.isWrapperType(class0);
      Class<Object> class3 = Object.class;
      Primitives.unwrap(class3);
      Primitives.allWrapperTypes();
      Class<Character> class4 = Character.class;
      boolean boolean0 = Primitives.isWrapperType(class4);
      assertTrue(boolean0);
      
      Primitives.wrap((Class<Object>) null);
      Primitives.allWrapperTypes();
      Primitives.allPrimitiveTypes();
      Primitives.allWrapperTypes();
      Primitives.allPrimitiveTypes();
      Class<Object> class5 = Object.class;
      Primitives.isWrapperType(class5);
      Primitives.allPrimitiveTypes();
      Class<Object> class6 = Object.class;
      Class<Object> class7 = Primitives.unwrap(class6);
      assertNotNull(class7);
      
      boolean boolean1 = Primitives.isWrapperType(class2);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Class<Character> class1 = Primitives.unwrap(class0);
      Primitives.allWrapperTypes();
      Class<Object> class2 = Object.class;
      Primitives.isWrapperType(class2);
      Primitives.wrap(class1);
      Set<Class<?>> set0 = Primitives.allWrapperTypes();
      Primitives.unwrap(class2);
      Primitives.isWrapperType(class2);
      Primitives.allPrimitiveTypes();
      Primitives.isWrapperType(class1);
      Class<Object> class3 = Object.class;
      Primitives.isWrapperType(class3);
      Primitives.allPrimitiveTypes();
      Primitives.allWrapperTypes();
      Primitives.allWrapperTypes();
      Primitives.isWrapperType(class2);
      Set<Class<?>> set1 = Primitives.allPrimitiveTypes();
      assertFalse(set1.equals((Object)set0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Character> class1 = Primitives.wrap(class0);
      assertFalse(class1.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Primitives.unwrap(class0);
      assertFalse(class1.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Primitives.wrap(class0);
      assertEquals(1, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Set<Class<?>> set0 = Primitives.allWrapperTypes();
      assertFalse(set0.isEmpty());
      
      Class<Object> class0 = Object.class;
      Primitives.isWrapperType(class0);
      Primitives.allPrimitiveTypes();
      Primitives.isWrapperType(class0);
      Class<Character> class1 = Character.class;
      Primitives.isWrapperType(class1);
      Class<Object> class2 = Object.class;
      Primitives.wrap(class2);
      Primitives.allWrapperTypes();
      Primitives.unwrap(class0);
      Primitives.allPrimitiveTypes();
      Class<Character> class3 = Primitives.wrap(class1);
      assertFalse(class3.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Set<Class<?>> set0 = Primitives.allPrimitiveTypes();
      assertEquals(8, set0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = Primitives.isWrapperType(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Primitives.unwrap(class0);
      Class<Character> class1 = Character.class;
      Primitives.unwrap(class1);
      Primitives.allPrimitiveTypes();
      Primitives.isWrapperType(class0);
      Class<Object> class2 = Object.class;
      Class<Object> class3 = Primitives.unwrap(class2);
      assertSame(class3, class2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Character> class0 = Character.class;
      boolean boolean0 = Primitives.isWrapperType(class0);
      assertTrue(boolean0);
  }
}
