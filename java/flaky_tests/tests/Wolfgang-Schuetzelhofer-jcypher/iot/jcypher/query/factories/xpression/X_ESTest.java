/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:07:28 GMT 2022
 */

package iot.jcypher.query.factories.xpression;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.query.api.pattern.Node;
import iot.jcypher.query.api.pattern.Path;
import iot.jcypher.query.api.pattern.Relation;
import iot.jcypher.query.factories.xpression.X;
import iot.jcypher.query.values.JcNode;
import iot.jcypher.query.values.JcPath;
import iot.jcypher.query.values.JcRelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class X_ESTest extends X_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JcRelation jcRelation0 = new JcRelation("iot.jcypher.query.values.JcNumber");
      JcNode jcNode0 = jcRelation0.endNode();
      Node node0 = X.node(jcNode0);
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JcRelation jcRelation0 = new JcRelation("iot.jcypher.query.values.JcNumber");
      Relation relation0 = X.relation(jcRelation0);
      assertNotNull(relation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Relation relation0 = X.relation();
      assertNotNull(relation0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JcPath jcPath0 = new JcPath((String) null);
      Path path0 = X.shortestPath(jcPath0);
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Node node0 = X.node();
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JcPath jcPath0 = new JcPath((String) null);
      Path path0 = X.path(jcPath0);
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JcPath jcPath0 = new JcPath((String) null);
      Path path0 = X.allShortestPaths(jcPath0);
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      X x0 = new X();
  }
}
