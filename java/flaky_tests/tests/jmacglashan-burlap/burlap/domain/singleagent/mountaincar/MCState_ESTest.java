/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 02:34:38 GMT 2022
 */

package burlap.domain.singleagent.mountaincar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import burlap.domain.singleagent.mountaincar.MCState;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MCState_ESTest extends MCState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MCState mCState0 = new MCState(1087.2952917, (-1.0));
      MCState mCState1 = (MCState)mCState0.copy();
      assertEquals(1087.2952917, mCState1.x, 0.01);
      assertEquals(1087.2952917, mCState0.x, 0.01);
      assertEquals((-1.0), mCState0.v, 0.01);
      assertEquals((-1.0), mCState1.v, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MCState mCState0 = new MCState(0.0, 0.0);
      assertEquals(0.0, mCState0.v, 0.01);
      
      mCState0.v = (double) 1;
      Integer integer0 = new Integer(1);
      Object object0 = mCState0.get(integer0);
      assertEquals(1.0, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MCState mCState0 = new MCState(1087.2952917, (-1.0));
      Integer integer0 = new Integer(0);
      Object object0 = mCState0.get(integer0);
      assertEquals((-1.0), mCState0.v, 0.01);
      assertEquals(1087.2952917, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MCState mCState0 = new MCState();
      Integer integer0 = new Integer((-1709));
      // Undeclared exception!
      try { 
        mCState0.get(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown key -1709
         //
         verifyException("burlap.domain.singleagent.mountaincar.MCState", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MCState mCState0 = new MCState(1087.2952917, (-1.0));
      mCState0.toString();
      assertEquals((-1.0), mCState0.v, 0.01);
      assertEquals(1087.2952917, mCState0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MCState mCState0 = new MCState();
      Integer integer0 = new Integer(617);
      Integer integer1 = new Integer(617);
      // Undeclared exception!
      try { 
        mCState0.set(integer0, integer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown key 617
         //
         verifyException("burlap.domain.singleagent.mountaincar.MCState", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MCState mCState0 = new MCState();
      Integer integer0 = new Integer(1);
      MCState mCState1 = (MCState)mCState0.set(integer0, mCState0.v);
      assertEquals(0.0, mCState1.v, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MCState mCState0 = new MCState();
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        mCState0.set(integer0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown key -1
         //
         verifyException("burlap.domain.singleagent.mountaincar.MCState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MCState mCState0 = new MCState(1087.2952917, (-1.0));
      Integer integer0 = new Integer(0);
      MCState mCState1 = (MCState)mCState0.set(integer0, mCState0.x);
      assertEquals(1087.2952917, mCState1.x, 0.01);
      assertEquals((-1.0), mCState1.v, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MCState mCState0 = new MCState();
      // Undeclared exception!
      try { 
        mCState0.set("{\njava.lang.String@0000000002: {java.lang.Double@0000000003}\njava.lang.String@0000000004: {java.lang.Double@0000000005}\n}", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown key {
         // java.lang.String@0000000002: {java.lang.Double@0000000003}
         // java.lang.String@0000000004: {java.lang.Double@0000000005}
         // }
         //
         verifyException("burlap.domain.singleagent.mountaincar.MCState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MCState mCState0 = new MCState();
      List<Object> list0 = mCState0.variableKeys();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MCState mCState0 = new MCState();
      // Undeclared exception!
      try { 
        mCState0.get("{\njava.lang.String@0000000003: {java.lang.Double@0000000010}\njava.lang.String@0000000005: {java.lang.Double@0000000011}\n}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown key {
         // java.lang.String@0000000003: {java.lang.Double@0000000010}
         // java.lang.String@0000000005: {java.lang.Double@0000000011}
         // }
         //
         verifyException("burlap.domain.singleagent.mountaincar.MCState", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MCState mCState0 = new MCState();
      // Undeclared exception!
      try { 
        mCState0.get(mCState0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown key {
         // java.lang.String@0000000002: {java.lang.Double@0000000003}
         // java.lang.String@0000000004: {java.lang.Double@0000000005}
         // }
         //
         verifyException("burlap.domain.singleagent.mountaincar.MCState", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MCState mCState0 = new MCState();
      // Undeclared exception!
      try { 
        mCState0.set(mCState0, mCState0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown key {
         // java.lang.String@0000000002: {java.lang.Double@0000000003}
         // java.lang.String@0000000004: {java.lang.Double@0000000005}
         // }
         //
         verifyException("burlap.domain.singleagent.mountaincar.MCState", e);
      }
  }
}
