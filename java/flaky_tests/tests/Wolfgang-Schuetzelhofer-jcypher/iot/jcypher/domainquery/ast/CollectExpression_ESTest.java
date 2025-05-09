/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:01:47 GMT 2022
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
import iot.jcypher.domainquery.GDomainQuery;
import iot.jcypher.domainquery.api.DomainObjectMatch;
import iot.jcypher.domainquery.ast.CollectExpression;
import iot.jcypher.query.values.JcNode;
import iot.jcypher.query.values.JcProperty;
import iot.jcypher.query.values.JcRelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CollectExpression_ESTest extends CollectExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JcRelation jcRelation0 = new JcRelation("kew1DG<Xf");
      JcNode jcNode0 = jcRelation0.endNode();
      JcProperty jcProperty0 = jcNode0.property("start");
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "start", iDomainAccess_DomainLabelUse0);
      DomainQuery domainQuery0 = new DomainQuery(domainAccess0);
      AbstractDomainQuery.IntAccess abstractDomainQuery_IntAccess0 = domainQuery0.new IntAccess();
      CollectExpression collectExpression0 = new CollectExpression(jcProperty0, abstractDomainQuery_IntAccess0);
      collectExpression0.getQueryExecutor();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GDomainQuery gDomainQuery0 = new GDomainQuery((IDomainAccess) null);
      AbstractDomainQuery.IntAccess abstractDomainQuery_IntAccess0 = gDomainQuery0.new IntAccess();
      CollectExpression collectExpression0 = new CollectExpression((JcProperty) null, abstractDomainQuery_IntAccess0);
      JcProperty jcProperty0 = collectExpression0.getAttribute();
      assertNull(jcProperty0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JcRelation jcRelation0 = new JcRelation("kew1DG<Xf");
      JcNode jcNode0 = jcRelation0.endNode();
      JcProperty jcProperty0 = jcNode0.property("start");
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "start", iDomainAccess_DomainLabelUse0);
      DomainQuery domainQuery0 = new DomainQuery(domainAccess0);
      AbstractDomainQuery.IntAccess abstractDomainQuery_IntAccess0 = domainQuery0.new IntAccess();
      CollectExpression collectExpression0 = new CollectExpression(jcProperty0, abstractDomainQuery_IntAccess0);
      collectExpression0.setEnd((DomainObjectMatch<?>) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JcRelation jcRelation0 = new JcRelation("kew1DG<Xf");
      JcNode jcNode0 = jcRelation0.endNode();
      JcProperty jcProperty0 = jcNode0.property("start");
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "start", iDomainAccess_DomainLabelUse0);
      DomainQuery domainQuery0 = new DomainQuery(domainAccess0);
      AbstractDomainQuery.IntAccess abstractDomainQuery_IntAccess0 = domainQuery0.new IntAccess();
      CollectExpression collectExpression0 = new CollectExpression(jcProperty0, abstractDomainQuery_IntAccess0);
      collectExpression0.getStartDOM();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JcRelation jcRelation0 = new JcRelation("kew1DG<Xf");
      JcNode jcNode0 = jcRelation0.endNode();
      JcProperty jcProperty0 = jcNode0.property("start");
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "start", iDomainAccess_DomainLabelUse0);
      DomainQuery domainQuery0 = new DomainQuery(domainAccess0);
      AbstractDomainQuery.IntAccess abstractDomainQuery_IntAccess0 = domainQuery0.new IntAccess();
      CollectExpression collectExpression0 = new CollectExpression(jcProperty0, abstractDomainQuery_IntAccess0);
      collectExpression0.getAttribute();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CollectExpression collectExpression0 = new CollectExpression((JcProperty) null, (AbstractDomainQuery.IntAccess) null);
      // Undeclared exception!
      try { 
        collectExpression0.getQueryExecutor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domainquery.ast.CollectExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CollectExpression collectExpression0 = new CollectExpression((JcProperty) null, (AbstractDomainQuery.IntAccess) null);
      DomainObjectMatch<?> domainObjectMatch0 = collectExpression0.getEnd();
      assertNull(domainObjectMatch0);
  }
}
