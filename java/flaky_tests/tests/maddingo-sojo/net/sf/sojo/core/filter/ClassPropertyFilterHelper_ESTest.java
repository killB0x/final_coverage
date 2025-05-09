/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 02:08:08 GMT 2022
 */

package net.sf.sojo.core.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.sojo.core.filter.ClassPropertyFilter;
import net.sf.sojo.core.filter.ClassPropertyFilterHandler;
import net.sf.sojo.core.filter.ClassPropertyFilterHandlerImpl;
import net.sf.sojo.core.filter.ClassPropertyFilterHelper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassPropertyFilterHelper_ESTest extends ClassPropertyFilterHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassPropertyFilter classPropertyFilter0 = new ClassPropertyFilter(class0);
      String string0 = ClassPropertyFilterHelper.validateClassPropertyFilter(classPropertyFilter0);
      assertEquals("class java.lang.Object is not a valid class name", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      ClassPropertyFilter classPropertyFilter0 = new ClassPropertyFilter();
      ClassPropertyFilterHandlerImpl classPropertyFilterHandlerImpl0 = new ClassPropertyFilterHandlerImpl(classPropertyFilter0);
      // Undeclared exception!
      try { 
        ClassPropertyFilterHelper.isPropertyToFiltering(classPropertyFilterHandlerImpl0, class0, classPropertyFilterHandlerImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.sojo.core.filter.ClassPropertyFilterHandlerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ClassPropertyFilterHelper.createClassPropertyFilterByClass(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.sojo.core.reflect.ReflectionMethodHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<String> class0 = String.class;
      ClassPropertyFilter classPropertyFilter0 = ClassPropertyFilterHelper.createClassPropertyFilterByClass(class0);
      classPropertyFilter0.addProperty("6u.4[1(Y(j@l;)MMM");
      String string0 = ClassPropertyFilterHelper.validateClassPropertyFilter(classPropertyFilter0);
      assertEquals("6u.4[1(Y(j@l;)MMM is not a valid property name", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = ClassPropertyFilterHelper.validateClassPropertyFilter((ClassPropertyFilter) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      ClassPropertyFilter classPropertyFilter0 = ClassPropertyFilterHelper.createClassPropertyFilterByClass(class0);
      String string0 = ClassPropertyFilterHelper.validateClassPropertyFilter(classPropertyFilter0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassPropertyFilterHandlerImpl classPropertyFilterHandlerImpl0 = new ClassPropertyFilterHandlerImpl();
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassPropertyFilterHelper.isPropertyToFiltering(classPropertyFilterHandlerImpl0, class0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String> class0 = String.class;
      ClassPropertyFilter classPropertyFilter0 = new ClassPropertyFilter(class0);
      ClassPropertyFilterHandlerImpl classPropertyFilterHandlerImpl0 = new ClassPropertyFilterHandlerImpl(classPropertyFilter0);
      boolean boolean0 = ClassPropertyFilterHelper.isPropertyToFiltering(classPropertyFilterHandlerImpl0, class0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      ClassPropertyFilter classPropertyFilter0 = new ClassPropertyFilter(class0);
      ClassPropertyFilterHandlerImpl classPropertyFilterHandlerImpl0 = new ClassPropertyFilterHandlerImpl(classPropertyFilter0);
      Object object0 = new Object();
      boolean boolean0 = ClassPropertyFilterHelper.isPropertyToFiltering(classPropertyFilterHandlerImpl0, class0, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      boolean boolean0 = ClassPropertyFilterHelper.isPropertyToFiltering((ClassPropertyFilterHandler) null, class0, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassPropertyFilterHelper classPropertyFilterHelper0 = new ClassPropertyFilterHelper();
  }
}
