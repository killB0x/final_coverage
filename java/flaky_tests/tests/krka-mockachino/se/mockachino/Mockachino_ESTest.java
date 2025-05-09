/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 08:13:34 GMT 2022
 */

package se.mockachino;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.googlecode.gentyref.TypeToken;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import se.mockachino.CallHandler;
import se.mockachino.MockData;
import se.mockachino.MockSettings;
import se.mockachino.Mockachino;
import se.mockachino.alias.SimpleAlias;
import se.mockachino.assertion.AssertThrows;
import se.mockachino.invocationhandler.CollectionsHandler;
import se.mockachino.invocationhandler.DeepMockHandler;
import se.mockachino.invocationhandler.PrimitiveInvocationHandler;
import se.mockachino.order.BetweenVerifyContext;
import se.mockachino.order.MockPoint;
import se.mockachino.order.OrderingContext;
import se.mockachino.stub.Stubber;
import se.mockachino.util.MockachinoMethod;
import se.mockachino.verifier.VerifyRangeStart;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Mockachino_ESTest extends Mockachino_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPoint mockPoint0 = new MockPoint(1);
      MockPoint mockPoint1 = new MockPoint(1);
      Mockachino.between(mockPoint0, mockPoint1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CollectionsHandler collectionsHandler0 = (CollectionsHandler)Mockachino.DEFAULT_VALUES;
      Mockachino.observeWith(collectionsHandler0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      MockSettings mockSettings0 = new MockSettings();
      // Undeclared exception!
      try { 
        Mockachino.mock(typeToken0, mockSettings0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only interfaces can be mocked without cglib and asm installed
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        Mockachino.mock(typeToken0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only interfaces can be mocked without cglib and asm installed
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockPoint mockPoint0 = Mockachino.BIG_BANG;
      // Undeclared exception!
      try { 
        Mockachino.getData((Object) mockPoint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // argument MockPoint[0] is not a mock object
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Mockachino.stubThrow(mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrimitiveInvocationHandler primitiveInvocationHandler0 = new PrimitiveInvocationHandler();
      Mockachino.stubAnswer(primitiveInvocationHandler0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MockSettings mockSettings0 = new MockSettings();
      Mockachino.spy((Object) class0, mockSettings0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DeepMockHandler deepMockHandler0 = (DeepMockHandler)Mockachino.DEEP_MOCK;
      Mockachino.observeWith(deepMockHandler0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.setupMocks((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // obj can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockachinoMethod mockachinoMethod0 = MockachinoMethod.HASHCODE;
      Class<?> class0 = mockachinoMethod0.getReturnType();
      MockSettings mockSettings0 = new MockSettings();
      // Undeclared exception!
      try { 
        Mockachino.mockType(class0, mockSettings0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.mockachino.proxy.ProxyUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = Mockachino.spy((Object) "@y&5]0/tE+HV5B");
      MockData<Object> mockData0 = Mockachino.getData(object0);
      Object object1 = Mockachino.awaitState(1818L, (Object) mockData0, (Object) "@y&5]0/tE+HV5B");
      // Undeclared exception!
      try { 
        Mockachino.getData(object1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.canMock((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.mockachino.proxy.ProxyUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.between((MockPoint) null, (MockPoint) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // start can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.before((MockPoint) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // end can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        Mockachino.awaitState(3066L, (Object) mockThrowable0, (Throwable) mockThrowable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only interfaces can be mocked without cglib and asm installed
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.awaitState(948L, (Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.mockachino.Mockachino", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.after((MockPoint) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // start can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Mockachino.setupMocks(mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Mockachino mockachino0 = new Mockachino();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPoint mockPoint0 = Mockachino.BIG_CRUNCH;
      Object object0 = Mockachino.spy((Object) " is not comparable with ");
      Object object1 = Mockachino.awaitState((-2L), (Object) mockPoint0, object0);
      MockData<Object> mockData0 = Mockachino.getData(object0);
      Object object2 = Mockachino.awaitState((-2L), (Object) mockData0, object1);
      // Undeclared exception!
      try { 
        Mockachino.getData(object2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // await state timed out. Got exception: null
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = Mockachino.spy((Object) "C:iY`^9T%,B}f/e");
      MockData<Object> mockData0 = Mockachino.getData(object0);
      Object object1 = Mockachino.awaitState(10L, (Object) mockData0, object0);
      Mockachino.getData(object1);
      assertEquals("Spy:String:10", mockData0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockPoint mockPoint0 = Mockachino.getCurrentPoint();
      Object[] objectArray0 = new Object[1];
      Stubber stubber0 = Mockachino.stubReturn((Object) mockPoint0, objectArray0);
      assertNotNull(stubber0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockPoint mockPoint0 = Mockachino.BIG_BANG;
      Stubber stubber0 = Mockachino.stubReturn((Object) mockPoint0, (Object[]) null);
      assertNotNull(stubber0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      // Undeclared exception!
      try { 
        Mockachino.mock(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only interfaces can be mocked without cglib and asm installed
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockPoint mockPoint0 = Mockachino.getCurrentPoint();
      BetweenVerifyContext betweenVerifyContext0 = Mockachino.before(mockPoint0);
      assertNotNull(betweenVerifyContext0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.observeWith((CallHandler) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // observer can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.stubAnswer((CallHandler) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // answer can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OrderingContext orderingContext0 = Mockachino.newOrdering();
      assertNotNull(orderingContext0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VerifyRangeStart verifyRangeStart0 = Mockachino.verifyNever();
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MockSettings mockSettings0 = new MockSettings();
      // Undeclared exception!
      try { 
        Mockachino.mock(class0, mockSettings0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only interfaces can be mocked without cglib and asm installed
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockPoint mockPoint0 = Mockachino.getCurrentPoint();
      BetweenVerifyContext betweenVerifyContext0 = Mockachino.after(mockPoint0);
      assertNotNull(betweenVerifyContext0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VerifyRangeStart verifyRangeStart0 = Mockachino.verifyAtLeast(0);
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VerifyRangeStart verifyRangeStart0 = Mockachino.verifyOnce();
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      AssertThrows assertThrows0 = Mockachino.assertThrows(class0);
      assertNotNull(assertThrows0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VerifyRangeStart verifyRangeStart0 = Mockachino.verifyRange((-1734), (-706));
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockPoint mockPoint0 = Mockachino.BIG_CRUNCH;
      // Undeclared exception!
      try { 
        Mockachino.spy((Object) mockPoint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only interfaces can be mocked without cglib and asm installed
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockSettings mockSettings0 = new MockSettings();
      // Undeclared exception!
      try { 
        Mockachino.mockType((Type) null, mockSettings0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // type can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockPoint mockPoint0 = Mockachino.getCurrentPoint();
      MockSettings mockSettings0 = new MockSettings();
      // Undeclared exception!
      try { 
        Mockachino.spy((Object) mockPoint0, mockSettings0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only interfaces can be mocked without cglib and asm installed
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      boolean boolean0 = Mockachino.canMock(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VerifyRangeStart verifyRangeStart0 = Mockachino.verifyAtMost(Integer.MAX_VALUE);
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VerifyRangeStart verifyRangeStart0 = Mockachino.verifyExactly(21);
      assertNotNull(verifyRangeStart0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Stubber stubber0 = Mockachino.stubReturn((Throwable) mockThrowable0);
      assertNotNull(stubber0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockachino.stubThrow((Throwable) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // exception can not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleAlias simpleAlias0 = Mockachino.newAlias();
      assertNotNull(simpleAlias0);
  }
}
