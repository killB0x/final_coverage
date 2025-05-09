/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 21:41:50 GMT 2022
 */

package com.hubspot.jinjava.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.util.ForLoop;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ForLoop_ESTest extends ForLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 2);
      assertFalse(forLoop0.isLast());
      assertEquals(2, forLoop0.getLength());
      assertTrue(forLoop0.isFirst());
      assertEquals(2, forLoop0.getRevindex0());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(3, forLoop0.getRevcounter());
      assertEquals(0, forLoop0.getCounter());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true).when(iterator0).hasNext();
      doReturn((Object) null, object0).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0, 69);
      forLoop0.next();
      forLoop0.next();
      assertEquals(2, forLoop0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 69);
      boolean boolean0 = forLoop0.isLast();
      assertFalse(boolean0);
      assertEquals(69, forLoop0.getLength());
      assertEquals(70, forLoop0.getRevindex());
      assertTrue(forLoop0.isFirst());
      assertEquals(70, forLoop0.getRevcounter());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(0, forLoop0.getCounter());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, false).when(iterator0).hasNext();
      ForLoop forLoop0 = new ForLoop(iterator0, (-2650));
      ForLoop forLoop1 = new ForLoop(forLoop0);
      forLoop0.hasNext();
      forLoop1.hasNext();
      assertEquals(Integer.MIN_VALUE, forLoop1.getRevcounter());
      assertEquals(Integer.MIN_VALUE, forLoop1.getLength());
      assertEquals((-1), forLoop0.getIndex0());
      assertTrue(forLoop1.isFirst());
      assertEquals(0, forLoop1.getIndex());
      assertEquals((-2650), forLoop0.getLength());
      assertTrue(forLoop0.isLast());
      assertEquals(0, forLoop1.getCounter());
      assertFalse(forLoop1.isLast());
      assertTrue(forLoop0.isFirst());
      assertEquals((-2147483647), forLoop1.getRevindex());
      assertEquals(1, forLoop0.getRevindex0());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(0, forLoop0.getCounter());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(iterator0).hasNext();
      doReturn(integer0).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      forLoop0.next();
      int int0 = forLoop0.getRevindex0();
      assertEquals(0, forLoop0.getIndex0());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, true, true, false).when(iterator0).hasNext();
      doReturn((Object) null, (Object) null).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0);
      forLoop0.next();
      forLoop0.next();
      int int0 = forLoop0.getRevindex0();
      assertEquals(2, forLoop0.getCounter());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, true, true, false).when(iterator0).hasNext();
      doReturn((Object) null, (Object) null).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0);
      forLoop0.next();
      forLoop0.next();
      int int0 = forLoop0.getRevindex();
      assertEquals(1, forLoop0.getRevcounter());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      ForLoop forLoop1 = new ForLoop(forLoop0);
      int int0 = forLoop1.getRevindex();
      assertFalse(forLoop1.isLast());
      assertEquals((-2147483647), int0);
      assertTrue(forLoop0.isLast());
      assertEquals(0, forLoop1.getCounter());
      assertEquals(1, forLoop0.getLength());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(Integer.MIN_VALUE, forLoop1.getLength());
      assertEquals(Integer.MIN_VALUE, forLoop1.getRevcounter());
      assertEquals((-1), forLoop0.getIndex0());
      assertEquals(0, forLoop0.getCounter());
      assertTrue(forLoop0.isFirst());
      assertTrue(forLoop1.isFirst());
      assertEquals(0, forLoop1.getIndex());
      assertEquals(1, forLoop0.getRevindex0());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      ForLoop forLoop0 = new ForLoop(iterator0, (-2650));
      ForLoop forLoop1 = new ForLoop(forLoop0);
      int int0 = forLoop1.getRevcounter();
      assertEquals(0, forLoop1.getCounter());
      assertEquals((-2650), forLoop0.getLength());
      assertTrue(forLoop0.isFirst());
      assertEquals((-1), forLoop0.getIndex0());
      assertFalse(forLoop1.isLast());
      assertEquals(0, forLoop0.getCounter());
      assertTrue(forLoop1.isFirst());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(0, forLoop1.getIndex());
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals(1, forLoop0.getRevindex0());
      assertEquals(Integer.MIN_VALUE, forLoop1.getLength());
      assertEquals((-2147483647), forLoop1.getRevindex());
      assertTrue(forLoop0.isLast());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      ForLoop forLoop0 = new ForLoop(iterator0);
      int int0 = forLoop0.getLength();
      assertEquals(2, forLoop0.getRevcounter());
      assertTrue(forLoop0.isFirst());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(2, forLoop0.getRevindex());
      assertEquals(0, int0);
      assertTrue(forLoop0.isLast());
      assertEquals(0, forLoop0.getCounter());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      ForLoop forLoop1 = new ForLoop(forLoop0);
      int int0 = forLoop1.getLength();
      assertEquals(Integer.MIN_VALUE, forLoop1.getRevcounter());
      assertEquals(2, forLoop0.getRevindex());
      assertFalse(forLoop1.isLast());
      assertEquals(Integer.MIN_VALUE, int0);
      assertTrue(forLoop1.isFirst());
      assertTrue(forLoop0.isFirst());
      assertEquals(Integer.MIN_VALUE, forLoop1.getRevindex0());
      assertEquals(0, forLoop0.getCounter());
      assertEquals(0, forLoop1.getIndex());
      assertEquals(0, forLoop1.getCounter());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(1, forLoop0.getLength());
      assertTrue(forLoop0.isLast());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(iterator0).hasNext();
      doReturn(integer0).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      forLoop0.next();
      int int0 = forLoop0.getIndex0();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, true, true, false).when(iterator0).hasNext();
      doReturn((Object) null, (Object) null).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0);
      forLoop0.next();
      forLoop0.next();
      int int0 = forLoop0.getIndex0();
      assertEquals(1, forLoop0.getRevcounter());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0, 0);
      forLoop0.next();
      int int0 = forLoop0.getIndex();
      assertEquals(0, forLoop0.getIndex0());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(iterator0).hasNext();
      doReturn(integer0).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      forLoop0.next();
      Object[] objectArray0 = new Object[3];
      forLoop0.cycle(objectArray0);
      assertEquals(1, forLoop0.getIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) forLoop0;
      forLoop0.next();
      forLoop0.cycle(objectArray0);
      assertEquals(1, forLoop0.getIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop((Iterator<?>) null, 1);
      // Undeclared exception!
      try { 
        forLoop0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.util.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop((Iterator<?>) null, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        forLoop0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.util.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForLoop forLoop0 = new ForLoop((Iterator<?>) null, 842);
      // Undeclared exception!
      try { 
        forLoop0.cycle((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.util.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      ForLoop forLoop0 = new ForLoop(iterator0);
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        forLoop0.cycle(objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 4
         //
         verifyException("com.hubspot.jinjava.util.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForLoop forLoop0 = null;
      try {
        forLoop0 = new ForLoop((Iterator<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.util.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      int int0 = forLoop0.getIndex0();
      assertTrue(forLoop0.isFirst());
      assertTrue(forLoop0.isLast());
      assertEquals(0, forLoop0.getCounter());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals((-1), int0);
      assertEquals(1, forLoop0.getLength());
      assertEquals(1, forLoop0.getRevindex0());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      int int0 = forLoop0.getRevindex0();
      assertTrue(forLoop0.isLast());
      assertEquals(1, int0);
      assertTrue(forLoop0.isFirst());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(1, forLoop0.getLength());
      assertEquals(0, forLoop0.getCounter());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true, false).when(iterator0).hasNext();
      doReturn(integer0).when(iterator0).next();
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      ForLoop forLoop1 = new ForLoop(forLoop0);
      forLoop1.next();
      forLoop0.next();
      assertEquals(1, forLoop0.getCounter());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      String string0 = forLoop0.toString();
      assertTrue(forLoop0.isLast());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(1, forLoop0.getRevindex0());
      assertEquals("<ForLoop: 1>", string0);
      assertEquals(0, forLoop0.getCounter());
      assertTrue(forLoop0.isFirst());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      int int0 = forLoop0.getLength();
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(1, forLoop0.getRevindex0());
      assertEquals(1, int0);
      assertTrue(forLoop0.isLast());
      assertTrue(forLoop0.isFirst());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(0, forLoop0.getCounter());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, (-1));
      boolean boolean0 = forLoop0.isFirst();
      assertEquals(0, forLoop0.getIndex());
      assertTrue(forLoop0.isLast());
      assertEquals(0, forLoop0.getCounter());
      assertEquals((-1), forLoop0.getLength());
      assertTrue(boolean0);
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(2, forLoop0.getRevindex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 0);
      boolean boolean0 = forLoop0.isLast();
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(2, forLoop0.getRevindex());
      assertEquals(0, forLoop0.getLength());
      assertTrue(boolean0);
      assertEquals(0, forLoop0.getIndex());
      assertTrue(forLoop0.isFirst());
      assertEquals(0, forLoop0.getCounter());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, (-1));
      int int0 = forLoop0.getDepth();
      assertEquals((-1), forLoop0.getLength());
      assertTrue(forLoop0.isFirst());
      assertEquals(0, forLoop0.getCounter());
      assertTrue(forLoop0.isLast());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(1, int0);
      assertEquals((-1), forLoop0.getIndex0());
      assertEquals(2, forLoop0.getRevindex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 0);
      int int0 = forLoop0.getIndex();
      assertEquals(0, int0);
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(0, forLoop0.getLength());
      assertTrue(forLoop0.isFirst());
      assertEquals(0, forLoop0.getCounter());
      assertTrue(forLoop0.isLast());
      assertEquals(1, forLoop0.getRevindex0());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, (-2650));
      int int0 = forLoop0.getRevcounter();
      assertTrue(forLoop0.isFirst());
      assertTrue(forLoop0.isLast());
      assertEquals(0, forLoop0.getCounter());
      assertEquals(2, int0);
      assertEquals((-2650), forLoop0.getLength());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(1, forLoop0.getRevindex0());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      ForLoop forLoop0 = new ForLoop(iterator0);
      int int0 = forLoop0.getDepth0();
      assertEquals(0, forLoop0.getCounter());
      assertTrue(forLoop0.isFirst());
      assertTrue(forLoop0.isLast());
      assertEquals(2, forLoop0.getRevindex());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(0, int0);
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(0, forLoop0.getLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 0);
      // Undeclared exception!
      try { 
        forLoop0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.util.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      ForLoop forLoop0 = new ForLoop(iterator0);
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        forLoop0.cycle(objectArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.hubspot.jinjava.util.ForLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      ForLoop forLoop0 = new ForLoop(iterator0, 1);
      int int0 = forLoop0.getCounter();
      assertTrue(forLoop0.isFirst());
      assertEquals(1, forLoop0.getLength());
      assertEquals(0, forLoop0.getIndex());
      assertEquals(1, forLoop0.getRevindex0());
      assertEquals(2, forLoop0.getRevcounter());
      assertEquals(0, int0);
      assertTrue(forLoop0.isLast());
  }
}
