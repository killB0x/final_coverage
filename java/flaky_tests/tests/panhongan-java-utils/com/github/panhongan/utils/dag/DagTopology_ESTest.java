/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 09:32:59 GMT 2022
 */

package com.github.panhongan.utils.dag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.panhongan.utils.dag.DagTopology;
import com.github.panhongan.utils.dag.Vertex;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DagTopology_ESTest extends DagTopology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DagTopology dagTopology0 = new DagTopology();
      Vertex vertex0 = new Vertex("");
      Vertex vertex1 = Vertex.copy(vertex0);
      // Undeclared exception!
      try { 
        dagTopology0.addEdge(vertex1, vertex0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("com.github.panhongan.utils.dag.DagTopology", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DagTopology dagTopology0 = new DagTopology();
      LinkedList<List<Vertex>> linkedList0 = new LinkedList<List<Vertex>>();
      // Undeclared exception!
      try { 
        dagTopology0.traverse(linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections4/CollectionUtils
         //
         verifyException("com.github.panhongan.utils.dag.DagTopology", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DagTopology dagTopology0 = new DagTopology();
      String string0 = dagTopology0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DagTopology dagTopology0 = new DagTopology();
      Vertex vertex0 = new Vertex("");
      // Undeclared exception!
      try { 
        dagTopology0.addEdge(vertex0, (Vertex) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // vertex is null
         //
         verifyException("com.github.panhongan.utils.dag.DagTopology", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DagTopology dagTopology0 = new DagTopology();
      // Undeclared exception!
      try { 
        dagTopology0.addEdge((Vertex) null, (Vertex) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // vertex is null
         //
         verifyException("com.github.panhongan.utils.dag.DagTopology", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DagTopology dagTopology0 = new DagTopology();
      List<Vertex> list0 = dagTopology0.getVertexList();
      assertEquals(0, list0.size());
  }
}
