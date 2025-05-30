/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:09:23 GMT 2022
 */

package iot.jcypher.query.factories.xpression;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.query.api.collection.CWhere;
import iot.jcypher.query.api.collection.InCollection;
import iot.jcypher.query.factories.xpression.I;
import iot.jcypher.query.values.JcNumber;
import iot.jcypher.query.values.JcValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class I_ESTest extends I_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JcValue jcValue0 = new JcValue("iot.jcypher.query.factories.xpression.I");
      JcNumber jcNumber0 = jcValue0.asNumber();
      InCollection<CWhere> inCollection0 = I.forSingle(jcNumber0);
      assertNotNull(inCollection0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      I i0 = new I();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JcValue jcValue0 = new JcValue("iot.jcypher.query.factories.xpression.I");
      JcNumber jcNumber0 = jcValue0.asNumber();
      InCollection<CWhere> inCollection0 = I.forAll(jcNumber0);
      assertNotNull(inCollection0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JcValue jcValue0 = new JcValue("iot.jcypher.query.factories.xpression.I");
      InCollection<CWhere> inCollection0 = I.forNone(jcValue0);
      assertNotNull(inCollection0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InCollection<CWhere> inCollection0 = I.forAny((JcValue) null);
      assertNotNull(inCollection0);
  }
}
