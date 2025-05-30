/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:30:46 GMT 2022
 */

package iot.jcypher.domainquery.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.database.remote.RemoteDBAccess;
import iot.jcypher.domain.IDomainAccess;
import iot.jcypher.domain.internal.DomainAccess;
import iot.jcypher.domainquery.AbstractDomainQuery;
import iot.jcypher.domainquery.DomainQuery;
import iot.jcypher.domainquery.api.DomainObjectMatch;
import iot.jcypher.domainquery.ast.SelectExpression;
import iot.jcypher.domainquery.ast.TraversalExpression;
import iot.jcypher.domainquery.internal.QueryExecutor;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TraversalExpression_ESTest extends TraversalExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TraversalExpression traversalExpression0 = new TraversalExpression((DomainObjectMatch<?>) null, (QueryExecutor) null);
      QueryExecutor queryExecutor0 = traversalExpression0.getQueryExecutor();
      assertNull(queryExecutor0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TraversalExpression traversalExpression0 = new TraversalExpression((DomainObjectMatch<?>) null, (QueryExecutor) null);
      traversalExpression0.step(")", 0);
      List<TraversalExpression.Step> list0 = traversalExpression0.getSteps();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TraversalExpression traversalExpression0 = new TraversalExpression((DomainObjectMatch<?>) null, (QueryExecutor) null);
      DomainObjectMatch<?> domainObjectMatch0 = traversalExpression0.getEnd();
      assertNull(domainObjectMatch0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TraversalExpression traversalExpression0 = new TraversalExpression((DomainObjectMatch<?>) null, (QueryExecutor) null);
      // Undeclared exception!
      try { 
        traversalExpression0.setEnd((DomainObjectMatch<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domainquery.api.APIAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TraversalExpression traversalExpression0 = new TraversalExpression((DomainObjectMatch<?>) null, (QueryExecutor) null);
      DomainObjectMatch<?> domainObjectMatch0 = traversalExpression0.getStart();
      assertNull(domainObjectMatch0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      Class<Object> class0 = Object.class;
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.NEVER;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "", iDomainAccess_DomainLabelUse0);
      DomainQuery domainQuery0 = new DomainQuery(domainAccess0);
      AbstractDomainQuery.IntAccess abstractDomainQuery_IntAccess0 = domainQuery0.new IntAccess();
      SelectExpression<Object> selectExpression0 = new SelectExpression<Object>(class0, (DomainObjectMatch<?>) null, abstractDomainQuery_IntAccess0, true);
      QueryExecutor queryExecutor0 = selectExpression0.getQueryExecutor();
      TraversalExpression traversalExpression0 = new TraversalExpression((DomainObjectMatch<?>) null, queryExecutor0);
      traversalExpression0.getQueryExecutor();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TraversalExpression traversalExpression0 = new TraversalExpression((DomainObjectMatch<?>) null, (QueryExecutor) null);
      List<TraversalExpression.Step> list0 = traversalExpression0.getSteps();
      assertEquals(0, list0.size());
  }
}
