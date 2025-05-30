/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 23:50:01 GMT 2022
 */

package com.cronutils.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.cronutils.utils.Preconditions;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Preconditions_ESTest extends Preconditions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        Preconditions.checkArgument(false, (String) null, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null [null, null, null, null, null]
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        Preconditions.checkNotNull((Integer) null, (Object) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // []
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = Preconditions.checkNotNull(integer0, (Object) null);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Preconditions.checkPositive(0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList linkedList1 = (LinkedList)Preconditions.checkNotNull((Object) linkedList0);
      assertEquals(0, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Preconditions.checkState(false, "n2,KGU", (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Preconditions.checkArgument(false, "", (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Preconditions.checkArgument(false, "%s", objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(0, object0);
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      Collection<Object> collection0 = Preconditions.checkNotNullNorEmpty((Collection<Object>) linkedList0, (Object) listIterator0);
      assertFalse(collection0.contains(0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        Preconditions.checkNotNullNorEmpty((LinkedList<Integer>) null, (Object) integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // 0
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      // Undeclared exception!
      try { 
        Preconditions.checkNotNullNorEmpty((Collection<Object>) linkedList0, (Object) listIterator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.util.LinkedList$ListItr@19ddc325
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Preconditions.checkNotNullNorEmpty("", (Object) "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Preconditions.checkNotNullNorEmpty((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = Preconditions.checkNotNullNorEmpty("s,d(=zF>\"+vh'[kP", (Object) "s,d(=zF>\"+vh'[kP");
      assertEquals("s,d(=zF>\"+vh'[kP", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = Preconditions.checkNotNull(object0, object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Preconditions.checkNotNull((LinkedList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        Preconditions.checkState(false, "%s", objectArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // null [null, null, null, null, null]
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Preconditions.checkState(true, "mm!0o;", objectArray0);
      assertEquals(6, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        Preconditions.checkArgument(false, "1%s", objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1null [null, null, null, null]
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Preconditions.checkArgument(true, "_kEQn*+WZFRkM*x", objectArray0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Preconditions.checkPositive((-1), object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Object@197b462f
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Preconditions.checkPositive(1549, (Object) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Preconditions.checkArgument(false, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Preconditions.checkArgument(true, (Object) null);
  }
}
