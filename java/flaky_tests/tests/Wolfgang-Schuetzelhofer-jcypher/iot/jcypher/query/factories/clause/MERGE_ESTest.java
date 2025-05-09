/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:41:51 GMT 2022
 */

package iot.jcypher.query.factories.clause;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.query.api.pattern.Node;
import iot.jcypher.query.api.pattern.Relation;
import iot.jcypher.query.factories.clause.MERGE;
import iot.jcypher.query.values.JcNode;
import iot.jcypher.query.values.JcRelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MERGE_ESTest extends MERGE_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Node node0 = MERGE.node();
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Relation relation0 = MERGE.relation();
      assertNotNull(relation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JcRelation jcRelation0 = new JcRelation(".x0,bA]");
      Relation relation0 = MERGE.relation(jcRelation0);
      assertNotNull(relation0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JcNode jcNode0 = new JcNode("");
      Node node0 = MERGE.node(jcNode0);
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MERGE mERGE0 = new MERGE();
  }
}
