/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 18:58:29 GMT 2022
 */

package iot.jcypher.domainquery.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.database.remote.RemoteDBAccess;
import iot.jcypher.domain.IDomainAccess;
import iot.jcypher.domain.IGenericDomainAccess;
import iot.jcypher.domain.internal.DomainAccess;
import iot.jcypher.domain.internal.DomainAccessSync;
import iot.jcypher.domainquery.internal.QueryRecorder;
import iot.jcypher.domainquery.internal.RecordedQuery;
import iot.jcypher.domainquery.internal.RecordedQueryPlayer;
import iot.jcypher.domainquery.internal.Settings;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RecordedQueryPlayer_ESTest extends RecordedQueryPlayer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.NEVER;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      recordedQuery0.addAssignment("q", "getClass", "q", linkedList0);
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer(false);
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      recordedQuery0.addAssignment("q", "getClass", "q", linkedList0);
      DomainAccess.GenericDomainAccess domainAccess_GenericDomainAccess0 = domainAccess0.new GenericDomainAccess();
      recordedQueryPlayer0.replayGenericQuery(recordedQuery0, domainAccess_GenericDomainAccess0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.NEVER;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      RecordedQuery.DOMatchRef recordedQuery_DOMatchRef0 = recordedQuery0.new DOMatchRef("q");
      linkedList0.add((RecordedQuery.Statement) recordedQuery_DOMatchRef0);
      recordedQuery0.addAssignment("q", "AS", "AS", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'iot/jcypher/domainquery/DomainQuery@0000000015.class' should be in target project, but could not be found!
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      recordedQuery0.addAssignment("TO_GENERIC", "TO_GENERIC", "TO_GENERIC", linkedList0);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      Object object0 = new Object();
      RecordedQuery.Literal recordedQuery_Literal0 = recordedQuery0.literal(object0);
      linkedList0.add((RecordedQuery.Statement) recordedQuery_Literal0);
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.NEVER;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "os", iDomainAccess_DomainLabelUse0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: java.lang.Object@0000000016
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      RecordedQuery.DOMatchRef recordedQuery_DOMatchRef0 = recordedQuery0.doMatchRef("q");
      linkedList0.add((RecordedQuery.Statement) recordedQuery_DOMatchRef0);
      recordedQuery0.addAssignment("q", "TO", "p;)>zl-p_Zfl}n+", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'iot/jcypher/domainquery/DomainQuery@0000000015.class' should be in target project, but could not be found!
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      Object object0 = new Object();
      RecordedQuery.Reference recordedQuery_Reference0 = recordedQuery0.new Reference(object0, "createMatch");
      linkedList0.add((RecordedQuery.Statement) recordedQuery_Reference0);
      recordedQuery0.addAssignment("createMatchFor", "createMatch", "hPt*lZSxgAnr", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: java.lang.Object@0000000016
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.NEVER;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "SELECT_FROM", iDomainAccess_DomainLabelUse0);
      QueryRecorder.blockRecording = null;
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      QueryRecorder.blockRecording = null;
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayGenericQuery(recordedQuery0, (IGenericDomainAccess) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      recordedQuery0.addAssignment("AS", "AS", "AS", linkedList0);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "AS", iDomainAccess_DomainLabelUse0);
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer(false);
      IGenericDomainAccess iGenericDomainAccess0 = domainAccess0.getGenericDomainAccess();
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayGenericQuery(recordedQuery0, iGenericDomainAccess0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.ALWAYS;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      RecordedQuery.DOMatchRef recordedQuery_DOMatchRef0 = recordedQuery0.new DOMatchRef("q");
      linkedList0.add((RecordedQuery.Statement) recordedQuery_DOMatchRef0);
      recordedQuery0.addAssignment("q", "createMatchFor", "createMatchFor", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.reflect.InvocationTargetException
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer(false);
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.ALWAYS;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      recordedQuery0.addAssignment("q", "INTERSECTION", "INTERSECTION", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.reflect.InvocationTargetException
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.ALWAYS;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      RecordedQuery.DOMatchRef recordedQuery_DOMatchRef0 = recordedQuery0.doMatchRef("q");
      linkedList0.add((RecordedQuery.Statement) recordedQuery_DOMatchRef0);
      recordedQuery0.addAssignment("q", "INTERSECTION", "INTERSECTION", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoSuchMethodException: iot.jcypher.domainquery.DomainQuery.INTERSECTION(iot.jcypher.domainquery.DomainQuery)
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.ALWAYS;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      RecordedQuery.DOMatchRef recordedQuery_DOMatchRef0 = recordedQuery0.doMatchRef("q");
      linkedList0.add((RecordedQuery.Statement) recordedQuery_DOMatchRef0);
      linkedList0.add((RecordedQuery.Statement) recordedQuery_DOMatchRef0);
      recordedQuery0.addAssignment("q", "createMatchFor", "createMatchFor", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'iot/jcypher/domainquery/DomainQuery@0000000015.class' should be in target project, but could not be found!
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      recordedQuery0.addAssignment("q", "createMatchFor", "createMatchFor", linkedList0);
      DomainAccess.GenericDomainAccess domainAccess_GenericDomainAccess0 = domainAccess0.new GenericDomainAccess();
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayGenericQuery(recordedQuery0, domainAccess_GenericDomainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoSuchMethodException: iot.jcypher.domainquery.GDomainQuery.createMatchFor()
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      recordedQuery0.addAssignment("AS", "AS", "AS", linkedList0);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "AS", iDomainAccess_DomainLabelUse0);
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer(true);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      recordedQuery0.addAssignment("TO_GENERIC", "TO_GENERIC", "TO_GENERIC", linkedList0);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer(true);
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.ALWAYS;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "TO_GENERIC", iDomainAccess_DomainLabelUse0);
      IGenericDomainAccess iGenericDomainAccess0 = domainAccess0.getGenericDomainAccess();
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayGenericQuery(recordedQuery0, iGenericDomainAccess0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.ALWAYS;
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "^-W#$Q8Anz|:hm6-Z", iDomainAccess_DomainLabelUse0);
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      recordedQuery0.addAssignment("^-W#$Q8Anz|:hm6-Z", "TO", "TO", linkedList0);
      IGenericDomainAccess iGenericDomainAccess0 = domainAccess0.getGenericDomainAccess();
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayGenericQuery(recordedQuery0, iGenericDomainAccess0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.NEVER;
      RecordedQuery recordedQuery0 = new RecordedQuery(false);
      recordedQuery0.addAssignment("createMatch", "createMatch", "createMatch", linkedList0);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "creatZMatch", iDomainAccess_DomainLabelUse0);
      DomainAccess.GenericDomainAccess domainAccess_GenericDomainAccess0 = domainAccess0.new GenericDomainAccess();
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayGenericQuery(recordedQuery0, domainAccess_GenericDomainAccess0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.NEVER;
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      linkedList0.add((RecordedQuery.Statement) null);
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "^-W#$Q8Anz|:hm6-Z", iDomainAccess_DomainLabelUse0);
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      recordedQuery0.addAssignment("^-W#$Q8Anz|:hm6-Z", "^-W#$Q8Anz|:hm6-Z", "^-W#$Q8Anz|:hm6-Z", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      RecordedQuery.DOMatchRef recordedQuery_DOMatchRef0 = recordedQuery0.doMatchRef("q");
      linkedList0.add((RecordedQuery.Statement) recordedQuery_DOMatchRef0);
      recordedQuery0.addInvocation("q", "wait", "wait", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoSuchMethodException: iot.jcypher.domainquery.DomainQuery.wait(iot.jcypher.domainquery.DomainQuery)
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer(true);
      Settings.TEST_MODE = true;
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      DomainAccessSync domainAccessSync0 = mock(DomainAccessSync.class, new ViolatedAssumptionAnswer());
      DomainAccessSync.GenericDomainAccessSync domainAccessSync_GenericDomainAccessSync0 = domainAccessSync0.new GenericDomainAccessSync();
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayGenericQuery(recordedQuery0, domainAccessSync_GenericDomainAccessSync0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.domain.internal.DomainAccessSync$GenericDomainAccessSync", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      Settings.TEST_MODE = true;
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "createMatchFor", iDomainAccess_DomainLabelUse0);
      IGenericDomainAccess iGenericDomainAccess0 = domainAccess0.getGenericDomainAccess();
      recordedQueryPlayer0.replayGenericQuery(recordedQuery0, iGenericDomainAccess0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      Settings.TEST_MODE = true;
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      LinkedList<RecordedQuery.Statement> linkedList0 = new LinkedList<RecordedQuery.Statement>();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      recordedQuery0.addAssignment("q", "createMatchFor", "createMatchFor", linkedList0);
      // Undeclared exception!
      try { 
        recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoSuchMethodException: iot.jcypher.domainquery.DomainQuery.createMatchFor()
         //
         verifyException("iot.jcypher.domainquery.internal.RecordedQueryPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer(true);
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      recordedQuery0.getCreateParameter("isZRi93b{LwF5Thq4j");
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.NEVER;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "TO_GENERIC", iDomainAccess_DomainLabelUse0);
      recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RecordedQueryPlayer recordedQueryPlayer0 = new RecordedQueryPlayer();
      RecordedQuery recordedQuery0 = new RecordedQuery(true);
      Settings.TEST_MODE = true;
      RemoteDBAccess remoteDBAccess0 = new RemoteDBAccess();
      IDomainAccess.DomainLabelUse iDomainAccess_DomainLabelUse0 = IDomainAccess.DomainLabelUse.AUTO;
      DomainAccess domainAccess0 = new DomainAccess(remoteDBAccess0, "q", iDomainAccess_DomainLabelUse0);
      recordedQueryPlayer0.replayQuery(recordedQuery0, domainAccess0);
  }
}
