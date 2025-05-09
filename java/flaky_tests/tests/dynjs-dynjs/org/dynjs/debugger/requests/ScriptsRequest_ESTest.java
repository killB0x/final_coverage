/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 22:11:07 GMT 2022
 */

package org.dynjs.debugger.requests;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dynjs.debugger.requests.ScriptsRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ScriptsRequest_ESTest extends ScriptsRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScriptsRequest scriptsRequest0 = new ScriptsRequest();
      int[] intArray0 = new int[7];
      scriptsRequest0.setIds(intArray0);
      int[] intArray1 = scriptsRequest0.getIds();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScriptsRequest scriptsRequest0 = new ScriptsRequest();
      int[] intArray0 = new int[0];
      scriptsRequest0.setIds(intArray0);
      int[] intArray1 = scriptsRequest0.getIds();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScriptsRequest scriptsRequest0 = new ScriptsRequest();
      scriptsRequest0.setTypes((-439));
      assertEquals(0, scriptsRequest0.getTypes());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScriptsRequest scriptsRequest0 = new ScriptsRequest();
      boolean boolean0 = scriptsRequest0.isIncludeSource();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ScriptsRequest scriptsRequest0 = new ScriptsRequest();
      scriptsRequest0.setIncludeSource(true);
      boolean boolean0 = scriptsRequest0.isIncludeSource();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ScriptsRequest scriptsRequest0 = new ScriptsRequest();
      int[] intArray0 = scriptsRequest0.getIds();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ScriptsRequest scriptsRequest0 = new ScriptsRequest();
      int int0 = scriptsRequest0.getTypes();
      assertEquals(0, int0);
  }
}
