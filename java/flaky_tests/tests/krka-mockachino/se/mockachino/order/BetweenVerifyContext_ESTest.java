/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 09:00:10 GMT 2022
 */

package se.mockachino.order;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import se.mockachino.Invocation;
import se.mockachino.MethodCall;
import se.mockachino.order.BetweenVerifyContext;
import se.mockachino.order.MockPoint;
import se.mockachino.order.OrderingContext;
import se.mockachino.util.MockachinoMethod;
import se.mockachino.verifier.VerifyRangeStart;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BetweenVerifyContext_ESTest extends BetweenVerifyContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(0);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, (MockPoint) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext((MockPoint) null, (MockPoint) null);
      Object object0 = new Object();
      MockachinoMethod mockachinoMethod0 = MockachinoMethod.EQUALS;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) objectArray0;
      MethodCall methodCall0 = new MethodCall(mockachinoMethod0, objectArray0);
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[1];
      Invocation invocation0 = new Invocation(object0, methodCall0, (-295), stackTraceElementArray0);
      // Undeclared exception!
      try { 
        betweenVerifyContext0.getCalls(invocation0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(0);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, mockPoint0);
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[0];
      Invocation invocation0 = new Invocation(betweenVerifyContext0, (MethodCall) null, 0, stackTraceElementArray0);
      // Undeclared exception!
      try { 
        betweenVerifyContext0.getCalls(invocation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.mockachino.Invocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(1094);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, mockPoint0);
      VerifyRangeStart verifyRangeStart0 = betweenVerifyContext0.verifyExactly(1094);
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(1094);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, mockPoint0);
      VerifyRangeStart verifyRangeStart0 = betweenVerifyContext0.verifyRange(1094, (-1));
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(1094);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, mockPoint0);
      OrderingContext orderingContext0 = betweenVerifyContext0.newOrdering();
      assertNotNull(orderingContext0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(0);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, mockPoint0);
      VerifyRangeStart verifyRangeStart0 = betweenVerifyContext0.verifyAtMost(0);
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(1094);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, mockPoint0);
      VerifyRangeStart verifyRangeStart0 = betweenVerifyContext0.verifyOnce();
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(1094);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, mockPoint0);
      VerifyRangeStart verifyRangeStart0 = betweenVerifyContext0.verifyAtLeast(1);
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext((MockPoint) null, (MockPoint) null);
      // Undeclared exception!
      try { 
        betweenVerifyContext0.getCalls((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // mock can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(1094);
      BetweenVerifyContext betweenVerifyContext0 = new BetweenVerifyContext(mockPoint0, mockPoint0);
      VerifyRangeStart verifyRangeStart0 = betweenVerifyContext0.verifyNever();
      assertNotNull(verifyRangeStart0);
  }
}
