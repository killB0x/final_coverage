/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:38:49 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.future.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.future.model.FutureContractByExchCodeModel;
import com.tigerbrokers.stock.openapi.client.struct.enums.Language;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FutureContractByExchCodeModel_ESTest extends FutureContractByExchCodeModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FutureContractByExchCodeModel futureContractByExchCodeModel0 = new FutureContractByExchCodeModel("g2WUCo=O`G&`V-C%X$O");
      String string0 = futureContractByExchCodeModel0.getExchangeCode();
      assertEquals("g2WUCo=O`G&`V-C%X$O", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FutureContractByExchCodeModel futureContractByExchCodeModel0 = new FutureContractByExchCodeModel("g2WUCo=O`G&`V-C%X$O");
      futureContractByExchCodeModel0.setExchangeCode("");
      String string0 = futureContractByExchCodeModel0.getExchangeCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FutureContractByExchCodeModel futureContractByExchCodeModel0 = new FutureContractByExchCodeModel("g2WUCo=O`G&`V-C%X$O");
      futureContractByExchCodeModel0.getLang();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FutureContractByExchCodeModel futureContractByExchCodeModel0 = new FutureContractByExchCodeModel();
      Language language0 = Language.zh_TW;
      futureContractByExchCodeModel0.setLang(language0);
      assertEquals(Language.zh_TW, futureContractByExchCodeModel0.getLang());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Language language0 = Language.zh_TW;
      FutureContractByExchCodeModel futureContractByExchCodeModel0 = new FutureContractByExchCodeModel(",%6@?l9lHI?", language0);
      Language language1 = futureContractByExchCodeModel0.getLang();
      assertSame(language0, language1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FutureContractByExchCodeModel futureContractByExchCodeModel0 = new FutureContractByExchCodeModel();
      String string0 = futureContractByExchCodeModel0.getExchangeCode();
      assertNull(string0);
  }
}
