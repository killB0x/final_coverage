/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 16:53:37 GMT 2022
 */

package org.addition.epanet.network.structures;

import org.junit.Test;
import static org.junit.Assert.*;
import org.addition.epanet.network.structures.Pattern;
import org.addition.epanet.network.structures.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Source_ESTest extends Source_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Source.Type source_Type0 = Source.Type.parse("FLOWPACED");
      assertEquals(Source.Type.FLOWPACED, source_Type0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Source source0 = new Source();
      Source.Type source_Type0 = Source.Type.SETPOINT;
      source0.setType(source_Type0);
      Source.Type source_Type1 = source0.getType();
      assertSame(source_Type1, source_Type0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Source source0 = new Source();
      source0.setC0(2542.5992);
      double double0 = source0.getC0();
      assertEquals(2542.5992, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Source.Type source_Type0 = Source.Type.parse("MASS");
      assertEquals(Source.Type.MASS, source_Type0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Source.Type.parse("org.addition.epanet.network.structures.Source");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Source source0 = new Source();
      source0.getType();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Source source0 = new Source();
      Pattern pattern0 = source0.getPattern();
      assertNull(pattern0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Source source0 = new Source();
      source0.setC0((-1427.10986685796));
      double double0 = source0.getC0();
      assertEquals((-1427.10986685796), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Source source0 = new Source();
      double double0 = source0.getC0();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Source source0 = new Source();
      Pattern pattern0 = new Pattern();
      source0.setPattern(pattern0);
      Pattern pattern1 = source0.getPattern();
      assertSame(pattern1, pattern0);
  }
}
