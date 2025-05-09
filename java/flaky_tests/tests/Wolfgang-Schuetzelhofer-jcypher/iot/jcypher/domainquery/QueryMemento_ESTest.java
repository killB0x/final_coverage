/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:01:05 GMT 2022
 */

package iot.jcypher.domainquery;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.domainquery.QueryMemento;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QueryMemento_ESTest extends QueryMemento_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento("^c,Gt;\":dz952\"dJbU'", "^c,Gt;\":dz952\"dJbU'");
      String string0 = queryMemento0.getQueryJava();
      assertEquals("^c,Gt;\":dz952\"dJbU'", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento("", "");
      String string0 = queryMemento0.getQueryJava();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento("h(evB'5#D,kq", (String) null);
      String string0 = queryMemento0.getQueryJSON();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento("0FB7b`", ":sbC_!a!e-~Pd0`$P");
      String string0 = queryMemento0.getQueryJSON();
      assertEquals(":sbC_!a!e-~Pd0`$P", string0);
      assertEquals("0FB7b`", queryMemento0.getQueryJava());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento("0FB7b`", ":sbC_!a!e-~Pd0`$P");
      queryMemento0.setDescription("0FB7b`");
      queryMemento0.getDescription();
      assertEquals(":sbC_!a!e-~Pd0`$P", queryMemento0.getQueryJSON());
      assertEquals("0FB7b`", queryMemento0.getQueryJava());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento("h(evB'5#D,kq", (String) null);
      queryMemento0.setDescription("");
      String string0 = queryMemento0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento("h(evB'5#D,kq", (String) null);
      String string0 = queryMemento0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento("", "");
      String string0 = queryMemento0.getQueryJSON();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      QueryMemento queryMemento0 = new QueryMemento((String) null, "");
      String string0 = queryMemento0.getQueryJava();
      assertNull(string0);
  }
}
