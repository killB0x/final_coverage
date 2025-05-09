/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 09:04:06 GMT 2022
 */

package se.mockachino.order;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import se.mockachino.Invocation;
import se.mockachino.order.MockPoint;
import se.mockachino.order.MockPointIterable;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MockPointIterable_ESTest extends MockPointIterable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Invocation> arrayList0 = new ArrayList<Invocation>();
      MockPoint mockPoint0 = new MockPoint(3059);
      MockPoint mockPoint1 = new MockPoint(3059);
      MockPointIterable mockPointIterable0 = new MockPointIterable(arrayList0, mockPoint1, mockPoint0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<Invocation> stack0 = new Stack<Invocation>();
      MockPointIterable mockPointIterable0 = new MockPointIterable(stack0, (MockPoint) null, (MockPoint) null);
      Iterator<Invocation> iterator0 = mockPointIterable0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockPointIterable mockPointIterable0 = new MockPointIterable((Iterable<Invocation>) null, (MockPoint) null, (MockPoint) null);
      // Undeclared exception!
      try { 
        mockPointIterable0.iterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.mockachino.order.MockPointIterable", e);
      }
  }
}
