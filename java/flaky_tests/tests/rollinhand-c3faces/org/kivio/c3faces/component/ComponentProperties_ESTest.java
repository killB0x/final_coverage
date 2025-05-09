/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 20:17:11 GMT 2022
 */

package org.kivio.c3faces.component;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.kivio.c3faces.component.ComponentProperties;
import org.kivio.c3faces.listener.ChangeListener;
import org.kivio.c3faces.listener.PropertyModifier;
import org.kivio.c3faces.script.ArrayBlock;
import org.kivio.c3faces.script.CommaValueBlock;
import org.kivio.c3faces.script.ObjectBlock;
import org.kivio.c3faces.script.Property;
import org.kivio.c3faces.script.modifier.Resize;
import org.kivio.c3faces.script.property.Data;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ComponentProperties_ESTest extends ComponentProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = new Data();
      componentProperties0.addProperty(data0);
      Property property0 = componentProperties0.getProperty("data");
      assertEquals("data", property0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = new Data();
      boolean boolean0 = componentProperties0.addProperty(data0);
      assertTrue(boolean0);
      
      List<Property> list0 = componentProperties0.getProperties();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = new Data();
      componentProperties0.addProperty(data0);
      Data data1 = componentProperties0.getComponentData();
      assertEquals("}", data1.getSuffix());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = new Data();
      componentProperties0.addProperty(data0);
      data0.setSelection(false);
      Data data1 = componentProperties0.getComponentData();
      assertEquals("}", data1.getSuffix());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = new Data();
      Resize resize0 = new Resize();
      resize0.addModifier(resize0);
      data0.addListener(resize0);
      componentProperties0.addProperty(data0);
      // Undeclared exception!
      try { 
        componentProperties0.resetListeners();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      ObjectBlock objectBlock0 = new ObjectBlock((List<ChangeListener>) null);
      componentProperties0.addProperty(objectBlock0);
      // Undeclared exception!
      try { 
        componentProperties0.resetListeners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kivio.c3faces.component.ComponentProperties", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      ObjectBlock objectBlock0 = new ObjectBlock((List<ChangeListener>) null);
      componentProperties0.addProperty(objectBlock0);
      // Undeclared exception!
      try { 
        componentProperties0.getPropertyModifiers();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kivio.c3faces.component.ComponentProperties", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      ArrayBlock arrayBlock0 = new ArrayBlock();
      arrayBlock0.setName("data");
      componentProperties0.addProperty(arrayBlock0);
      // Undeclared exception!
      try { 
        componentProperties0.getComponentData();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.kivio.c3faces.script.ArrayBlock cannot be cast to class org.kivio.c3faces.script.property.Data (org.kivio.c3faces.script.ArrayBlock and org.kivio.c3faces.script.property.Data are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @35ad39a8)
         //
         verifyException("org.kivio.c3faces.component.ComponentProperties", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      // Undeclared exception!
      try { 
        componentProperties0.addProperty((Data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kivio.c3faces.component.ComponentProperties", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      ObjectBlock objectBlock0 = new ObjectBlock("data", "data");
      componentProperties0.addProperty(objectBlock0);
      Data data0 = new Data();
      // Undeclared exception!
      try { 
        componentProperties0.addProperty(data0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.kivio.c3faces.script.ObjectBlock cannot be cast to class org.kivio.c3faces.script.property.Data (org.kivio.c3faces.script.ObjectBlock and org.kivio.c3faces.script.property.Data are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @35ad39a8)
         //
         verifyException("org.kivio.c3faces.component.ComponentProperties", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      // Undeclared exception!
      try { 
        componentProperties0.addProperty((Property) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kivio.c3faces.component.ComponentProperties", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      LinkedList<Property> linkedList0 = new LinkedList<Property>();
      linkedList0.add((Property) null);
      // Undeclared exception!
      try { 
        componentProperties0.addProperties(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kivio.c3faces.component.ComponentProperties", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Property property0 = componentProperties0.getProperty("data");
      assertNull(property0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      CommaValueBlock commaValueBlock0 = new CommaValueBlock("\"M*;o", "\"M*;o", true, true);
      commaValueBlock0.addListener((ChangeListener) null);
      componentProperties0.addProperty(commaValueBlock0);
      componentProperties0.resetListeners();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = new Data();
      componentProperties0.addProperty(data0);
      List<ChangeListener> list0 = data0.getListeners();
      data0.addListeners(list0);
      assertEquals(2, list0.size());
      
      List<PropertyModifier> list1 = componentProperties0.getPropertyModifiers();
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      CommaValueBlock commaValueBlock0 = new CommaValueBlock("\"M*;o", "\"M*;o", true, true);
      commaValueBlock0.addListener((ChangeListener) null);
      boolean boolean0 = componentProperties0.addProperty(commaValueBlock0);
      assertTrue(boolean0);
      
      List<PropertyModifier> list0 = componentProperties0.getPropertyModifiers();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      LinkedHashSet<Property> linkedHashSet0 = new LinkedHashSet<Property>();
      Data data0 = new Data();
      linkedHashSet0.add(data0);
      componentProperties0.addProperties(linkedHashSet0);
      assertEquals(1, linkedHashSet0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      componentProperties0.addProperties((Collection<Property>) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      List<Property> list0 = componentProperties0.getProperties();
      componentProperties0.addProperties(list0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = new Data();
      boolean boolean0 = componentProperties0.addProperty(data0);
      assertTrue(boolean0);
      
      Data data1 = new Data();
      boolean boolean1 = componentProperties0.addProperty(data1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = new Data();
      boolean boolean0 = componentProperties0.addProperty(data0);
      assertTrue(boolean0);
      
      boolean boolean1 = componentProperties0.addProperty(data0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      ObjectBlock objectBlock0 = new ObjectBlock("org.kivio.c3faces.script.modifier.XGridRemove", "org.kivio.c3faces.script.modifier.XGridRemove");
      boolean boolean0 = componentProperties0.addProperty(objectBlock0);
      assertTrue(boolean0);
      
      boolean boolean1 = componentProperties0.addProperty(objectBlock0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      componentProperties0.clearProperties();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ComponentProperties componentProperties0 = new ComponentProperties();
      Data data0 = componentProperties0.getComponentData();
      assertNull(data0);
  }
}
