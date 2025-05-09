/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 05:57:58 GMT 2022
 */

package xyz.luan.console.parser.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import xyz.luan.console.parser.actions.ActionRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ActionRef_ESTest extends ActionRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionRef actionRef0 = null;
      try {
        actionRef0 = new ActionRef("4ouXoj32 p");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionRef actionRef0 = new ActionRef((String) null, (String) null);
      String string0 = actionRef0.getController();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActionRef actionRef0 = new ActionRef("#Ou[uBt^$|f4g8", "#Ou[uBt^$|f4g8");
      String string0 = actionRef0.getController();
      assertEquals("#Ou[uBt^$|f4g8", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ActionRef actionRef0 = new ActionRef("", (String) null);
      String string0 = actionRef0.getAction();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ActionRef actionRef0 = new ActionRef("d &h", "");
      String string0 = actionRef0.getAction();
      assertEquals("", string0);
      assertEquals("d &h", actionRef0.getController());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ActionRef actionRef0 = null;
      try {
        actionRef0 = new ActionRef((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("xyz.luan.console.parser.actions.ActionRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ActionRef actionRef0 = null;
      try {
        actionRef0 = new ActionRef("\":`e:)");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ActionRef actionRef0 = new ActionRef("V/:Yy*");
      assertEquals("Yy*", actionRef0.getAction());
      assertEquals("V/", actionRef0.getController());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ActionRef actionRef0 = new ActionRef("", (String) null);
      String string0 = actionRef0.getController();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ActionRef actionRef0 = new ActionRef("+n6~dGj8", "+n6~dGj8");
      String string0 = actionRef0.getAction();
      assertEquals("+n6~dGj8", string0);
  }
}
