/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 05:39:43 GMT 2022
 */

package pythagoras.d;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.d.Ellipse;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Ellipse_ESTest extends Ellipse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(0.0, 173.1, 0.0, 0.0);
      double double0 = ellipse0.y();
      assertEquals(173.1, double0, 0.01);
      assertEquals(0.0, ellipse0.width, 0.01);
      assertEquals(0.0, ellipse0.x, 0.01);
      assertEquals(0.0, ellipse0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(447.7629279306, (-1.0), 447.7629279306, 447.7629279306);
      double double0 = ellipse0.y();
      assertEquals(447.7629279306, ellipse0.width, 0.01);
      assertEquals(447.7629279306, ellipse0.height, 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals(447.7629279306, ellipse0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse((-1.0), (-1.0), 0.0, (-1.0));
      double double0 = ellipse0.x();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), ellipse0.y, 0.01);
      assertEquals(0.0, ellipse0.width, 0.01);
      assertEquals((-1.0), ellipse0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(0.0, 173.1, 0.0, 0.0);
      double double0 = ellipse0.width();
      assertEquals(173.1, ellipse0.y, 0.01);
      assertEquals(0.0, ellipse0.x, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, ellipse0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(447.7629279306, (-1.0), 447.7629279306, 447.7629279306);
      double double0 = ellipse0.width();
      assertEquals(447.7629279306, double0, 0.01);
      assertEquals((-1.0), ellipse0.y, 0.01);
      assertEquals(447.7629279306, ellipse0.x, 0.01);
      assertEquals(447.7629279306, ellipse0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(0.0, 0.0, (-1097.5505155), 0.0);
      ellipse0.setFrameFromCenter((-2645.3725705299), (-1.0), 0.0, (-1097.5505155));
      double double0 = ellipse0.height();
      assertEquals((-5290.7451410598), ellipse0.x, 0.01);
      assertEquals(2193.101031, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(447.7629279306, (-1.0), 447.7629279306, 447.7629279306);
      ellipse0.setFrame(447.7629279306, (-2795.257243), 447.7629279306, (-1.0));
      double double0 = ellipse0.height();
      assertEquals((-2795.257243), ellipse0.y, 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(0.0, 0.0, (-1097.5505155), 0.0);
      double double0 = ellipse0.y();
      assertEquals(0.0, ellipse0.height, 0.01);
      assertEquals((-1097.5505155), ellipse0.width, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, ellipse0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(0.0, 0.0, (-1097.5505155), 0.0);
      double double0 = ellipse0.x();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, ellipse0.y, 0.01);
      assertEquals(0.0, ellipse0.height, 0.01);
      assertEquals((-1097.5505155), ellipse0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(0.0, 0.0, (-1097.5505155), 0.0);
      double double0 = ellipse0.width();
      assertEquals((-1097.5505155), double0, 0.01);
      assertEquals(0.0, ellipse0.height, 0.01);
      assertEquals(0.0, ellipse0.y, 0.01);
      assertEquals(0.0, ellipse0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(0.0, 0.0, (-1097.5505155), 0.0);
      double double0 = ellipse0.height();
      assertEquals(0.0, ellipse0.y, 0.01);
      assertEquals(0.0, ellipse0.x, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1097.5505155), ellipse0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      ellipse0.setFrame(845.5448873823, 0.0, 0.0, 0.0);
      double double0 = ellipse0.x();
      assertEquals(845.5448873823, ellipse0.x, 0.01);
      assertEquals(845.5448873823, double0, 0.01);
  }
}
