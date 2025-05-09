/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:32:34 GMT 2022
 */

package com.criteo.marketing.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.criteo.marketing.model.InstallmentAmount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InstallmentAmount_ESTest extends InstallmentAmount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      InstallmentAmount installmentAmount1 = installmentAmount0.value("R_'<");
      String string0 = installmentAmount1.getValue();
      assertEquals("R_'<", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      installmentAmount0.setValue("");
      String string0 = installmentAmount0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      installmentAmount0.currency("'-\"(|'%2|!-V,:U+)");
      String string0 = installmentAmount0.getCurrency();
      assertEquals("'-\"(|'%2|!-V,:U+)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      installmentAmount0.setCurrency("");
      String string0 = installmentAmount0.getCurrency();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      installmentAmount0.setValue("null");
      installmentAmount0.toString();
      assertEquals("null", installmentAmount0.getValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      InstallmentAmount installmentAmount1 = new InstallmentAmount();
      assertTrue(installmentAmount1.equals((Object)installmentAmount0));
      
      InstallmentAmount installmentAmount2 = installmentAmount1.currency("currency");
      boolean boolean0 = installmentAmount0.equals(installmentAmount2);
      assertFalse(installmentAmount1.equals((Object)installmentAmount0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      boolean boolean0 = installmentAmount0.equals(",PTriE:s&rq`X&]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      boolean boolean0 = installmentAmount0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      boolean boolean0 = installmentAmount0.equals(installmentAmount0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      InstallmentAmount installmentAmount1 = new InstallmentAmount();
      boolean boolean0 = installmentAmount0.equals(installmentAmount1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      installmentAmount0.setValue("null");
      InstallmentAmount installmentAmount1 = new InstallmentAmount();
      boolean boolean0 = installmentAmount0.equals(installmentAmount1);
      assertFalse(boolean0);
      assertEquals("null", installmentAmount0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      String string0 = installmentAmount0.getCurrency();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      installmentAmount0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InstallmentAmount installmentAmount0 = new InstallmentAmount();
      String string0 = installmentAmount0.getValue();
      assertNull(string0);
  }
}
