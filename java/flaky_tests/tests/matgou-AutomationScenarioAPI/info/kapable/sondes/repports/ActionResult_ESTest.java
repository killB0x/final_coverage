/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 04:31:45 GMT 2022
 */

package info.kapable.sondes.repports;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import info.kapable.sondes.repports.ActionResult;
import info.kapable.sondes.scenarios.ScenarioException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ActionResult_ESTest extends ActionResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      ScenarioException scenarioException0 = new ScenarioException("J:zp;%9-F7k<# eDv2");
      actionResult0.finishKO(scenarioException0);
      actionResult0.startTimeMillis = actionResult0.endTimeMillis;
      Long long0 = actionResult0.getDuration();
      actionResult0.startTimeMillis = long0;
      actionResult0.getDurationStr();
      assertEquals((short)3, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      ScenarioException scenarioException0 = new ScenarioException("info.kapable.sondes.scenarios.ScenarioException");
      actionResult0.finishKO(scenarioException0);
      boolean boolean0 = actionResult0.getOK();
      assertEquals((short)3, actionResult0.status);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      assertEquals((short)1, actionResult0.status);
      
      actionResult0.status = (short)0;
      short short0 = actionResult0.getStatus();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      actionResult0.status = (short) (-847);
      short short0 = actionResult0.getStatus();
      assertEquals((short) (-847), short0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      actionResult0.setErreur("info.kapable.sondes.scenarios.ScenarioException");
      actionResult0.getErreur();
      assertEquals((short)1, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      actionResult0.setErreur("");
      actionResult0.getErreur();
      assertEquals((short)1, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      ScenarioException scenarioException0 = new ScenarioException("info.kapable.sondes.scenarios.ScenarioException");
      actionResult0.finishKO(scenarioException0);
      actionResult0.getDurationStr();
      assertEquals((short)3, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      ScenarioException scenarioException0 = new ScenarioException("J:zp;%9-F7k<# eDv2");
      actionResult0.finishKO(scenarioException0);
      actionResult0.startTimeMillis = actionResult0.startTimeMillis;
      Long long0 = actionResult0.getDuration();
      actionResult0.startTimeMillis = long0;
      actionResult0.getDuration();
      assertEquals((short)3, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      actionResult0.setDescription((String) null);
      actionResult0.getDescription();
      assertEquals((short)1, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      actionResult0.setDescription("info.kapable.sondes.repports.ActionResult");
      actionResult0.getDescription();
      assertEquals((short)1, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      // Undeclared exception!
      try { 
        actionResult0.finishKO((ScenarioException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.kapable.sondes.repports.ActionResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      // Undeclared exception!
      try { 
        actionResult0.getDuration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.kapable.sondes.repports.ActionResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      boolean boolean0 = actionResult0.getOK();
      assertEquals((short)1, actionResult0.status);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      ScenarioException scenarioException0 = new ScenarioException("MPL8qYp{W!mL8\"'La1");
      actionResult0.finishKO(scenarioException0);
      Long long0 = actionResult0.getDuration();
      actionResult0.endTimeMillis = long0;
      actionResult0.getDuration();
      assertEquals((short)3, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      actionResult0.getErreur();
      assertEquals((short)1, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      short short0 = actionResult0.getStatus();
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      actionResult0.finishOK();
      boolean boolean0 = actionResult0.getOK();
      assertEquals((short)2, actionResult0.status);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      actionResult0.getDescription();
      assertEquals((short)1, actionResult0.status);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ActionResult actionResult0 = new ActionResult();
      // Undeclared exception!
      try { 
        actionResult0.getDurationStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.kapable.sondes.repports.ActionResult", e);
      }
  }
}
