/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 20:34:49 GMT 2022
 */

package com.hubspot.jinjava.interpret;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.CallStack;
import com.hubspot.jinjava.interpret.TagCycleException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CallStack_ESTest extends CallStack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.pushWithoutCycleCheck("", 392, (-1937));
      int int0 = callStack0.getTopStartPosition();
      assertEquals((-1937), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.pushWithMaxDepth("", 4097, 4097, (-1));
      // Undeclared exception!
      try { 
        callStack0.push("", 1, (-175));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  tag cycle for ''
         //
         verifyException("com.hubspot.jinjava.interpret.TagCycleException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      // Undeclared exception!
      try { 
        callStack0.pushWithMaxDepth("uOzZf+(s", 0, 0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  tag cycle for 'uOzZf+(s'
         //
         verifyException("com.hubspot.jinjava.interpret.TagCycleException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      // Undeclared exception!
      try { 
        callStack0.pushWithMaxDepth("com.hubspot.jinjava.interpret.FromTagCycleException", 0, 609, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  tag cycle for 'com.hubspot.jinjava.interpret.FromTagCycleException'
         //
         verifyException("com.hubspot.jinjava.interpret.TagCycleException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.pushWithMaxDepth("com.hubspot.jinjava.interpret.CallStack", 2533, 1804, 1894);
      assertEquals(1894, callStack0.getTopStartPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      assertTrue(callStack0.isEmpty());
      
      callStack0.pushWithoutCycleCheck("com.hubspot.jinjava.interpret.IncludeTagCycleException", 0, 0);
      int int0 = callStack0.getTopStartPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      assertTrue(callStack0.isEmpty());
      
      callStack0.pushWithoutCycleCheck("@<1-0o|!2;rS^C3@#", 0, 0);
      int int0 = callStack0.getTopLineNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.push("s9 GyONFQt77~$_JY4i", 1711, 1303);
      int int0 = callStack0.getTopLineNumber();
      assertEquals(1303, callStack0.getTopStartPosition());
      assertEquals(1711, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.push((String) null, 374, 374);
      // Undeclared exception!
      try { 
        callStack0.peek();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      boolean boolean0 = callStack0.isEmpty();
      assertEquals((-1), callStack0.getTopStartPosition());
      assertEquals((-1), callStack0.getTopLineNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.pushWithoutCycleCheck("", (-1736), (-1736));
      callStack0.pushWithoutCycleCheck("", (-1736), (-1736));
      assertEquals((-1736), callStack0.getTopLineNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      CallStack callStack1 = new CallStack(callStack0, class0);
      callStack0.pushWithMaxDepth("", 1351, 1351, 1351);
      boolean boolean0 = callStack1.isEmpty();
      assertEquals(1351, callStack0.getTopStartPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      CallStack callStack1 = new CallStack(callStack0, class0);
      boolean boolean0 = callStack1.isEmpty();
      assertEquals((-1), callStack1.getTopLineNumber());
      assertEquals((-1), callStack1.getTopStartPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.pushWithMaxDepth("", 1351, 1351, 1351);
      boolean boolean0 = callStack0.isEmpty();
      assertEquals(1351, callStack0.getTopLineNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      CallStack callStack1 = new CallStack(callStack0, class0);
      int int0 = callStack1.getTopStartPosition();
      assertEquals((-1), callStack1.getTopLineNumber());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      int int0 = callStack0.getTopStartPosition();
      assertEquals((-1), int0);
      assertEquals((-1), callStack0.getTopLineNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.pushWithMaxDepth("", 1351, 1351, 1351);
      int int0 = callStack0.getTopStartPosition();
      assertEquals(1351, callStack0.getTopLineNumber());
      assertEquals(1351, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      CallStack callStack1 = new CallStack(callStack0, class0);
      int int0 = callStack1.getTopLineNumber();
      assertEquals((-1), callStack1.getTopStartPosition());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      int int0 = callStack0.getTopLineNumber();
      assertEquals((-1), callStack0.getTopStartPosition());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.push("82LNS!X[M?L", (-1928), (-1928));
      int int0 = callStack0.getTopLineNumber();
      assertEquals((-1928), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      CallStack callStack1 = new CallStack(callStack0, class0);
      callStack1.peek();
      assertEquals((-1), callStack1.getTopStartPosition());
      assertEquals((-1), callStack1.getTopLineNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.peek();
      assertEquals((-1), callStack0.getTopLineNumber());
      assertEquals((-1), callStack0.getTopStartPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      CallStack callStack1 = new CallStack(callStack0, class0);
      callStack1.pop();
      assertEquals((-1), callStack1.getTopLineNumber());
      assertEquals((-1), callStack1.getTopStartPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.pop();
      assertEquals((-1), callStack0.getTopLineNumber());
      assertEquals((-1), callStack0.getTopStartPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.pushWithoutCycleCheck((String) null, (-1063), (-1063));
      // Undeclared exception!
      try { 
        callStack0.pop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      // Undeclared exception!
      try { 
        callStack0.pushWithMaxDepth("-}!'oU", (-4032), (-4032), (-4032));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  tag cycle for '-}!'oU'
         //
         verifyException("com.hubspot.jinjava.interpret.TagCycleException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      callStack0.push((String) null, 1616, 1616);
      boolean boolean0 = callStack0.contains((String) null);
      assertEquals(1616, callStack0.getTopStartPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      boolean boolean0 = callStack0.contains("\"%dYYHR#S,Y}? Abd]x");
      assertEquals((-1), callStack0.getTopStartPosition());
      assertEquals((-1), callStack0.getTopLineNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<TagCycleException> class0 = TagCycleException.class;
      CallStack callStack0 = new CallStack((CallStack) null, class0);
      CallStack callStack1 = new CallStack(callStack0, class0);
      boolean boolean0 = callStack1.contains("\"%dYYHR#S,Y}? Abd]x");
      assertEquals((-1), callStack1.getTopLineNumber());
      assertFalse(boolean0);
      assertEquals((-1), callStack1.getTopStartPosition());
  }
}
