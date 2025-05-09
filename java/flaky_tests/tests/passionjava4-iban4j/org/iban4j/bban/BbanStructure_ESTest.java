/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 13 20:46:37 GMT 2022
 */

package org.iban4j.bban;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.iban4j.CountryCode;
import org.iban4j.bban.BbanStructure;
import org.iban4j.bban.BbanStructureEntry;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BbanStructure_ESTest extends BbanStructure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CountryCode countryCode0 = CountryCode.IN;
      BbanStructure bbanStructure0 = BbanStructure.forCountry(countryCode0);
      assertNull(bbanStructure0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CountryCode countryCode0 = CountryCode.XK;
      BbanStructure bbanStructure0 = BbanStructure.forCountry(countryCode0);
      int int0 = bbanStructure0.getBbanLength();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CountryCode countryCode0 = CountryCode.XK;
      BbanStructure bbanStructure0 = BbanStructure.forCountry(countryCode0);
      List<BbanStructureEntry> list0 = bbanStructure0.getEntries();
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List<CountryCode> list0 = BbanStructure.supportedCountries();
      assertEquals(78, list0.size());
  }
}
