/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 09:03:25 GMT 2022
 */

package it.unitn.disi.smatch.data.trees;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import it.unitn.disi.smatch.data.trees.StartIterator;
import java.util.Iterator;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StartIterator_ESTest extends StartIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-1630));
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      StartIterator<Integer> startIterator0 = new StartIterator<Integer>(integer0, iterator0);
      startIterator0.next();
      boolean boolean0 = startIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      StartIterator<Object> startIterator0 = new StartIterator<Object>(object0, (Iterator<Object>) null);
      startIterator0.next();
      // Undeclared exception!
      try { 
        startIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.unitn.disi.smatch.data.trees.StartIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      StartIterator<Object> startIterator0 = new StartIterator<Object>(object0, (Iterator<Object>) null);
      startIterator0.next();
      // Undeclared exception!
      try { 
        startIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.unitn.disi.smatch.data.trees.StartIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-563));
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      StartIterator<Integer> startIterator0 = new StartIterator<Integer>(integer0, iterator0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      startIterator0.forEachRemaining(consumer0);
      Integer integer1 = startIterator0.next();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer((-1628));
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      StartIterator<Integer> startIterator0 = new StartIterator<Integer>(integer0, iterator0);
      Integer integer1 = startIterator0.next();
      assertNotNull(integer1);
      
      boolean boolean0 = startIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StartIterator<Object> startIterator0 = null;
      try {
        startIterator0 = new StartIterator<Object>((Object) null, (Iterator<Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // argument is null
         //
         verifyException("it.unitn.disi.smatch.data.trees.StartIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = new Object();
      StartIterator<Object> startIterator0 = new StartIterator<Object>(object0, (Iterator<Object>) null);
      // Undeclared exception!
      try { 
        startIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("it.unitn.disi.smatch.data.trees.StartIterator", e);
      }
  }
}
