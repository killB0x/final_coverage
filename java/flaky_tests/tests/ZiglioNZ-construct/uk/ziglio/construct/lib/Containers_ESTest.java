/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 22:19:41 GMT 2022
 */

package uk.ziglio.construct.lib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ziglio.construct.lib.Containers;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Containers_ESTest extends Containers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Containers.Container containers_Container1 = containers_Container0.clone();
      containers_Container0.update(containers_Container1);
      assertNotSame(containers_Container1, containers_Container0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Containers.Container containers_Container1 = containers_Container0.reverse();
      containers_Container1.update(containers_Container0);
      assertNotSame(containers_Container1, containers_Container0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      Integer integer0 = new Integer(3934);
      integerArray0[0] = integer0;
      Integer integer1 = new Integer(3934);
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Integer integer2 = containers_Container0.get(integer1, integerArray0[0]);
      assertNull(integer2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(1973);
      Integer integer2 = containers_Container0.get(integer0, integer1);
      assertNotNull(integer2);
      assertEquals(1973, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Object> list0 = Containers.ListContainer("");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Containers.ListContainer((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ziglio.construct.lib.Containers", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Containers.ListContainer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ziglio.construct.lib.Containers", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Object> list0 = Containers.ListContainer("uk.ziglio.construct.lib.Containers$Container");
      assertEquals(44, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      List<Object> list0 = Containers.ListContainer(objectArray0);
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      List<Object> list0 = Containers.ListContainer((Object[]) integerArray0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer[] integerArray0 = new Integer[8];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Containers.Container containers_Container1 = containers_Container0.reverse();
      assertNotSame(containers_Container1, containers_Container0);
      assertTrue(containers_Container1.equals((Object)containers_Container0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      boolean boolean0 = containers_Container0.equals(containers_Container0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      boolean boolean0 = containers_Container0.equals(integerArray0[1]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Integer>[] linkedListArray0 = (LinkedList<Integer>[]) Array.newInstance(LinkedList.class, 0);
      Containers.Container containers_Container0 = new Containers.Container(linkedListArray0);
      boolean boolean0 = containers_Container0.contains(containers_Container0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer[] integerArray0 = new Integer[7];
      Containers.Container containers_Container0 = null;
      try {
        containers_Container0 = new Containers.Container(integerArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // length of parameters is not an even number: 7
         //
         verifyException("uk.ziglio.construct.lib.Containers$Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Containers.ContainerError containers_ContainerError0 = new Containers.ContainerError("");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Containers.Container containers_Container1 = containers_Container0.reverse();
      Containers.Container containers_Container2 = containers_Container1.reverse();
      Map<Object, Object> map0 = containers_Container2.dict;
      Integer integer0 = new Integer(0);
      Object object0 = new Object();
      containers_Container2.set(integer0, object0);
      containers_Container1.dict = map0;
      boolean boolean0 = containers_Container1.contains(integer0);
      assertTrue(boolean0);
      assertNotSame(containers_Container1, containers_Container2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Integer integer0 = new Integer(0);
      Integer integer1 = containers_Container0.get(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      String string0 = containers_Container0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Class<Integer> class0 = Integer.class;
      Integer[] integerArray1 = containers_Container0.values(class0);
      assertEquals(1, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      containers_Container0.clear();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<Integer>[] linkedListArray0 = (LinkedList<Integer>[]) Array.newInstance(LinkedList.class, 0);
      Containers.Container containers_Container0 = new Containers.Container(linkedListArray0);
      containers_Container0.del(containers_Container0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Containers containers0 = new Containers();
  }
}
