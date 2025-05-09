/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 05:42:17 GMT 2022
 */

package pythagoras.f;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.f.Dimension;
import pythagoras.f.IDimension;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Dimension_ESTest extends Dimension_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Dimension dimension0 = new Dimension();
      Dimension dimension1 = new Dimension(dimension0);
      assertEquals(0.0F, dimension0.height(), 0.01F);
      assertEquals(0.0F, dimension0.width(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Dimension dimension0 = new Dimension();
      float float0 = dimension0.width();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, dimension0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Dimension dimension0 = new Dimension(3398.4F, 3398.4F);
      float float0 = dimension0.width();
      assertEquals(3398.4F, float0, 0.01F);
      assertEquals(3398.4F, dimension0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Dimension dimension0 = new Dimension((-914.0F), (-3973.259F));
      float float0 = dimension0.width();
      assertEquals((-914.0F), float0, 0.01F);
      assertEquals((-3973.259F), dimension0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Dimension dimension0 = new Dimension();
      float float0 = dimension0.height();
      assertEquals(0.0F, dimension0.width, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Dimension dimension0 = new Dimension(0.0F, 507.2161F);
      float float0 = dimension0.height();
      assertEquals(507.2161F, float0, 0.01F);
      assertEquals(0.0F, dimension0.width, 0.01F);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Dimension dimension0 = new Dimension(0.0F, 507.2161F);
      dimension0.setSize(1577.713F, (-1.0F));
      float float0 = dimension0.height();
      assertEquals((-1.0F), dimension0.height, 0.01F);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Dimension dimension0 = new Dimension();
      // Undeclared exception!
      try { 
        dimension0.setSize((IDimension) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.Dimension", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Dimension dimension0 = new Dimension();
      dimension0.setSize((IDimension) dimension0);
      assertEquals(0.0F, dimension0.width(), 0.01F);
      assertEquals(0.0F, dimension0.height(), 0.01F);
  }
}
