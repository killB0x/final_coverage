/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 03:17:30 GMT 2022
 */

package de.unirostock.sems.xmlutils.ds.mappers;

import org.junit.Test;
import static org.junit.Assert.*;
import de.unirostock.sems.xmlutils.ds.mappers.MultiNodeMapper;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultiNodeMapper_ESTest extends MultiNodeMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiNodeMapper<Object> multiNodeMapper0 = new MultiNodeMapper<Object>();
      multiNodeMapper0.addNode("", "");
      List<Object> list0 = multiNodeMapper0.getNodes("");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiNodeMapper<Object> multiNodeMapper0 = new MultiNodeMapper<Object>();
      multiNodeMapper0.addNode("", "");
      String string0 = multiNodeMapper0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiNodeMapper<String> multiNodeMapper0 = new MultiNodeMapper<String>();
      multiNodeMapper0.rmNode(" ", " ");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiNodeMapper<Object> multiNodeMapper0 = new MultiNodeMapper<Object>();
      multiNodeMapper0.addNode("", "");
      multiNodeMapper0.rmNode("", "");
      List<Object> list0 = multiNodeMapper0.getNodes("");
      assertFalse(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiNodeMapper<Object> multiNodeMapper0 = new MultiNodeMapper<Object>();
      multiNodeMapper0.addNode("", "");
      multiNodeMapper0.addNode("", (Object) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultiNodeMapper<String> multiNodeMapper0 = new MultiNodeMapper<String>();
      Set<String> set0 = multiNodeMapper0.getIds();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MultiNodeMapper<Object> multiNodeMapper0 = new MultiNodeMapper<Object>();
      List<Object> list0 = multiNodeMapper0.getNodes("");
      assertNull(list0);
  }
}
