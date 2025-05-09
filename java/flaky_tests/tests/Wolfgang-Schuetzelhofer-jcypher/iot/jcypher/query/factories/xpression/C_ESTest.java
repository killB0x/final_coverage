/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:29:00 GMT 2022
 */

package iot.jcypher.query.factories.xpression;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.query.api.IClause;
import iot.jcypher.query.api.collection.CFrom;
import iot.jcypher.query.api.collection.CTerminal;
import iot.jcypher.query.api.collection.CWhere;
import iot.jcypher.query.api.collection.CollectFrom;
import iot.jcypher.query.api.collection.Collection;
import iot.jcypher.query.api.collection.EXProperty;
import iot.jcypher.query.api.collection.ExtractExpression;
import iot.jcypher.query.api.collection.ReduceTo;
import iot.jcypher.query.factories.xpression.C;
import iot.jcypher.query.values.JcCollection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class C_ESTest extends C_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EXProperty<CollectFrom> eXProperty0 = C.COLLECT();
      assertNotNull(eXProperty0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExtractExpression extractExpression0 = C.EXTRACT();
      assertNotNull(extractExpression0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CTerminal cTerminal0 = C.TAIL((JcCollection) null);
      assertNotNull(cTerminal0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      C c0 = new C();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IClause[] iClauseArray0 = new IClause[0];
      CTerminal cTerminal0 = C.CREATE(iClauseArray0);
      assertNotNull(cTerminal0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CFrom<CWhere> cFrom0 = C.FILTER();
      assertNotNull(cFrom0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Collection collection0 = C.TAIL();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CFrom<ReduceTo> cFrom0 = C.REDUCE();
      assertNotNull(cFrom0);
  }
}
