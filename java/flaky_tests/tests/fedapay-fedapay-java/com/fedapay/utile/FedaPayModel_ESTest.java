/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 12:40:08 GMT 2022
 */

package com.fedapay.utile;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fedapay.utile.FedaPayModel;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FedaPayModel_ESTest extends FedaPayModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FedaPayModel<String> fedaPayModel0 = new FedaPayModel<String>();
      fedaPayModel0.data = null;
      fedaPayModel0.data = "3[e6>+M%QdsGcA3";
      String string0 = fedaPayModel0.getData();
      assertEquals("3[e6>+M%QdsGcA3", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FedaPayModel<String> fedaPayModel0 = new FedaPayModel<String>("8&)w`g|q*5\"/Q", hashMap0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FedaPayModel<String> fedaPayModel0 = new FedaPayModel<String>();
      fedaPayModel0.setData("3[e6>+M%QdsGcA3");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FedaPayModel<String> fedaPayModel0 = new FedaPayModel<String>();
      String string0 = fedaPayModel0.getData();
      assertNull(string0);
  }
}
