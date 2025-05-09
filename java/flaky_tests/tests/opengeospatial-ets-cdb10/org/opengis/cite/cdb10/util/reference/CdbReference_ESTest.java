/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:30:40 GMT 2022
 */

package org.opengis.cite.cdb10.util.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.opengis.cite.cdb10.util.reference.CdbReference;
import org.opengis.cite.cdb10.util.reference.ComponentSelectorValidator;
import org.opengis.cite.cdb10.util.reference.DatasetsValidator;
import org.opengis.cite.cdb10.util.reference.DisCountryCodesValidator;
import org.opengis.cite.cdb10.util.reference.FeatureDataDictionaryValidator;
import org.opengis.cite.cdb10.util.reference.MovingModelCodesValidator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CdbReference_ESTest extends CdbReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CdbReference cdbReference0 = new CdbReference();
      DisCountryCodesValidator disCountryCodesValidator0 = cdbReference0.buildDisCountryCodesValidator();
      assertNotNull(disCountryCodesValidator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CdbReference cdbReference0 = new CdbReference();
      ComponentSelectorValidator componentSelectorValidator0 = cdbReference0.buildComponentSelectorValidator();
      assertNotNull(componentSelectorValidator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CdbReference cdbReference0 = new CdbReference();
      MovingModelCodesValidator movingModelCodesValidator0 = cdbReference0.buildMovingModelCodesValidator();
      assertNotNull(movingModelCodesValidator0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CdbReference cdbReference0 = new CdbReference();
      FeatureDataDictionaryValidator featureDataDictionaryValidator0 = cdbReference0.buildFeatureDataDictionaryValidator();
      assertNotNull(featureDataDictionaryValidator0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CdbReference cdbReference0 = new CdbReference();
      DatasetsValidator datasetsValidator0 = cdbReference0.buildDatasetsValidator();
      assertNotNull(datasetsValidator0);
  }
}
