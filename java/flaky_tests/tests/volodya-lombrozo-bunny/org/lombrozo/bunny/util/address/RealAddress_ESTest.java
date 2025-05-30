/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 00:39:35 GMT 2022
 */

package org.lombrozo.bunny.util.address;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.lombrozo.bunny.util.address.RealAddress;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RealAddress_ESTest extends RealAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress((String) null, 0, (String) null);
      realAddress0.virtualHost();
      assertEquals(0, realAddress0.port());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress("", (-1), "");
      realAddress0.virtualHost();
      assertEquals((-1), realAddress0.port());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress((String) null, 0, (String) null);
      int int0 = realAddress0.port();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress("", (-858));
      int int0 = realAddress0.port();
      assertEquals("", realAddress0.host());
      assertEquals("/", realAddress0.virtualHost());
      assertEquals((-858), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress("[%87em.ol^U", 0);
      String string0 = realAddress0.host();
      assertEquals("[%87em.ol^U", string0);
      assertEquals(0, realAddress0.port());
      assertEquals("/", realAddress0.virtualHost());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress("");
      String string0 = realAddress0.host();
      assertEquals("/", realAddress0.virtualHost());
      assertEquals("", string0);
      assertEquals(5672, realAddress0.port());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress((String) null, 0, (String) null);
      realAddress0.host();
      assertEquals(0, realAddress0.port());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress("$^\"Fz", 1, "$^\"Fz");
      realAddress0.virtualHost();
      assertEquals(1, realAddress0.port());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RealAddress realAddress0 = new RealAddress("$^\"Fz", 1, "$^\"Fz");
      int int0 = realAddress0.port();
      assertEquals(1, int0);
  }
}
