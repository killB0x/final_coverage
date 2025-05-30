/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 03:20:16 GMT 2022
 */

package de.unirostock.sems.xmlutils.ds.mappers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.unirostock.sems.xmlutils.ds.mappers.NodeMapper;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NodeMapper_ESTest extends NodeMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NodeMapper<Object> nodeMapper0 = new NodeMapper<Object>();
      nodeMapper0.putNode("", "");
      Object object0 = nodeMapper0.getNode("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NodeMapper<Object> nodeMapper0 = new NodeMapper<Object>();
      nodeMapper0.putNode((String) null, (Object) null);
      // Undeclared exception!
      try { 
        nodeMapper0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NodeMapper<Object> nodeMapper0 = new NodeMapper<Object>();
      String string0 = nodeMapper0.toString();
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NodeMapper<Object> nodeMapper0 = new NodeMapper<Object>();
      nodeMapper0.rmNode("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NodeMapper<Object> nodeMapper0 = new NodeMapper<Object>();
      Object object0 = nodeMapper0.getNode("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NodeMapper<Object> nodeMapper0 = new NodeMapper<Object>();
      Set<String> set0 = nodeMapper0.getIds();
      assertTrue(set0.isEmpty());
  }
}
