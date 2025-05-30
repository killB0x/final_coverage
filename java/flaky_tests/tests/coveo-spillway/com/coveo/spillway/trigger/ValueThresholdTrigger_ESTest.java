/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 20:33:08 GMT 2022
 */

package com.coveo.spillway.trigger;

import org.junit.Test;
import static org.junit.Assert.*;
import com.coveo.spillway.limit.LimitDefinition;
import com.coveo.spillway.trigger.LimitTriggerCallback;
import com.coveo.spillway.trigger.ValueThresholdTrigger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ValueThresholdTrigger_ESTest extends ValueThresholdTrigger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LimitTriggerCallback limitTriggerCallback0 = LimitTriggerCallback.DO_NOTHING;
      ValueThresholdTrigger valueThresholdTrigger0 = new ValueThresholdTrigger((-1), limitTriggerCallback0);
      boolean boolean0 = valueThresholdTrigger0.triggered((Object) "LimitTrigger{limitValue=-1}", (-2751), (LimitDefinition) null);
      assertEquals((-1), valueThresholdTrigger0.getTriggerValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LimitTriggerCallback limitTriggerCallback0 = LimitTriggerCallback.DO_NOTHING;
      ValueThresholdTrigger valueThresholdTrigger0 = new ValueThresholdTrigger(0, limitTriggerCallback0);
      int int0 = valueThresholdTrigger0.getTriggerValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LimitTriggerCallback limitTriggerCallback0 = LimitTriggerCallback.DO_NOTHING;
      ValueThresholdTrigger valueThresholdTrigger0 = new ValueThresholdTrigger((-1), limitTriggerCallback0);
      int int0 = valueThresholdTrigger0.getTriggerValue();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LimitTriggerCallback limitTriggerCallback0 = LimitTriggerCallback.DO_NOTHING;
      ValueThresholdTrigger valueThresholdTrigger0 = new ValueThresholdTrigger((-1), limitTriggerCallback0);
      boolean boolean0 = valueThresholdTrigger0.triggered((Object) limitTriggerCallback0, 1362, (LimitDefinition) null);
      assertEquals((-1), valueThresholdTrigger0.getTriggerValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LimitTriggerCallback limitTriggerCallback0 = LimitTriggerCallback.DO_NOTHING;
      ValueThresholdTrigger valueThresholdTrigger0 = new ValueThresholdTrigger((-1), limitTriggerCallback0);
      boolean boolean0 = valueThresholdTrigger0.triggered((Object) limitTriggerCallback0, (-1), (LimitDefinition) null);
      assertFalse(boolean0);
      assertEquals((-1), valueThresholdTrigger0.getTriggerValue());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LimitTriggerCallback limitTriggerCallback0 = LimitTriggerCallback.DO_NOTHING;
      ValueThresholdTrigger valueThresholdTrigger0 = new ValueThresholdTrigger(1, limitTriggerCallback0);
      String string0 = valueThresholdTrigger0.toString();
      assertEquals("LimitTrigger{limitValue=1}", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LimitTriggerCallback limitTriggerCallback0 = LimitTriggerCallback.doNothing();
      ValueThresholdTrigger valueThresholdTrigger0 = new ValueThresholdTrigger(314, limitTriggerCallback0);
      int int0 = valueThresholdTrigger0.getTriggerValue();
      assertEquals(314, int0);
  }
}
