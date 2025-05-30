/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 08:43:12 GMT 2022
 */

package io.unlaunch.event;

import org.junit.Test;
import static org.junit.Assert.*;
import io.unlaunch.event.Impression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Impression_ESTest extends Impression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Impression impression0 = new Impression((String) null, (String) null, (String) null, true, "OE{");
      impression0.getVariationKey();
      assertEquals("active", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Impression impression0 = new Impression("", "", "", false, "");
      impression0.getVariationKey();
      assertEquals("inactive", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Impression impression0 = new Impression("", (String) null, "error getting machine name", false, (String) null);
      String string0 = impression0.getUserId();
      assertEquals("inactive", impression0.getFlagStatus());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Impression impression0 = new Impression("", "", "", false, "");
      impression0.getUserId();
      assertEquals("inactive", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Impression impression0 = new Impression((String) null, "error getting ma7hine name", "error getting ma7hine name", false, "");
      impression0.getFlagKey();
      assertEquals("", impression0.getEvaluationReason());
      assertEquals("error getting ma7hine name", impression0.getUserId());
      assertEquals("inactive", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Impression impression0 = new Impression("", (String) null, "error getting machine name", false, (String) null);
      impression0.getFlagKey();
      assertEquals("inactive", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Impression impression0 = new Impression("@&^%=wcpq-F_", "@&^%=wcpq-F_", "@&^%=wcpq-F_", false, (String) null);
      String string0 = impression0.getEvaluationReason();
      assertEquals("inactive", impression0.getFlagStatus());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Impression impression0 = new Impression("", "", "", false, "");
      impression0.getEvaluationReason();
      assertEquals("inactive", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Impression impression0 = new Impression("g{P*e]<.3`y?Ix?Jf0", "c#", "io.unlaunch.event.Event", true, "error getting machine name");
      String string0 = impression0.getEvaluationReason();
      assertEquals("c#", impression0.getUserId());
      assertEquals("active", impression0.getFlagStatus());
      assertEquals("error getting machine name", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Impression impression0 = new Impression(", e={ud'", ", e={ud'", ", e={ud'", false, ", e={ud'");
      impression0.getVariationKey();
      assertEquals("inactive", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Impression impression0 = new Impression("error getting machine name", "error getting machine name", "error getting machine name", true, "5");
      impression0.getFlagKey();
      assertEquals("error getting machine name", impression0.getUserId());
      assertEquals("5", impression0.getEvaluationReason());
      assertEquals("active", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Impression impression0 = new Impression(", Key=d", ", Key=d", ", Key=d", false, ", Key=d");
      impression0.getUserId();
      assertEquals("inactive", impression0.getFlagStatus());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Impression impression0 = new Impression(", Key=d", ", Key=d", ", Key=d", false, ", Key=d");
      String string0 = impression0.getFlagStatus();
      assertEquals("inactive", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Impression impression0 = new Impression("error getting machine name", "error getting machine name", "error getting machine name", true, "5");
      impression0.getMachineName();
      assertEquals("active", impression0.getFlagStatus());
      assertEquals("error getting machine name", impression0.getUserId());
      assertEquals("5", impression0.getEvaluationReason());
  }
}
