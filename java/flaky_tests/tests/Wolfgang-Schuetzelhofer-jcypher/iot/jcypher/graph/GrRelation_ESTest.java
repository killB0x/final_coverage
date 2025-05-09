/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:18:11 GMT 2022
 */

package iot.jcypher.graph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.graph.GrRelation;
import iot.jcypher.graph.internal.GrId;
import iot.jcypher.query.result.util.ResultHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GrRelation_ESTest extends GrRelation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GrId grId0 = new GrId((-1L));
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, grId0, grId0, grId0, (-1298));
      // Undeclared exception!
      try { 
        grRelation0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.graph.GrRelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GrId grId0 = new GrId(1L);
      GrId grId1 = new GrId(1L);
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, grId1, grId0, grId0, "xbf,47 yAQU94b]kxb>");
      assertEquals(1L, grRelation0.getId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GrId grId0 = new GrId((-1L));
      GrId grId1 = new GrId(1656L);
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, grId0, grId1, grId0, "5edPN{N p2");
      assertEquals((-1L), grRelation0.getId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GrId grId0 = new GrId(0L);
      GrId grId1 = new GrId(0);
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, grId0, grId1, grId0, 3);
      assertEquals(0L, grRelation0.getId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GrId grId0 = new GrId(0L);
      GrId grId1 = new GrId(0L);
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, grId0, grId0, grId1, (-10));
      assertEquals(0L, grRelation0.getId());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GrId grId0 = new GrId(1756L);
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, grId0, grId0, grId0, "");
      String string0 = grRelation0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, (GrId) null, (GrId) null, (GrId) null, "o3|4n&F[VK");
      String string0 = grRelation0.getType();
      assertEquals("o3|4n&F[VK", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, (GrId) null, (GrId) null, (GrId) null, "Authorization");
      // Undeclared exception!
      try { 
        grRelation0.getEndNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.graph.GrRelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GrId grId0 = new GrId(1L);
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, grId0, grId0, grId0, 0);
      grRelation0.setToSynchronized();
      assertEquals(1L, grRelation0.getId());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GrRelation grRelation0 = new GrRelation((ResultHandler) null, (GrId) null, (GrId) null, (GrId) null, "o3|4n&F[VK");
      // Undeclared exception!
      try { 
        grRelation0.getStartNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.graph.GrRelation", e);
      }
  }
}
