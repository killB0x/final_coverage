/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 05:35:24 GMT 2022
 */

package pythagoras.d;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.d.Point;
import pythagoras.d.Vector;
import pythagoras.d.XY;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Point_ESTest extends Point_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Point point0 = new Point();
      double double0 = point0.y();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtract((-387.01259), (-387.01259), point0);
      point1.rotateLocal((-537.6024932785839));
      double double0 = point0.y();
      assertEquals((-210.7382269208749), point0.y, 0.01);
      assertEquals((-210.7382269208749), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Point point0 = new Point(0.0, 715.457);
      double double0 = point0.x();
      assertEquals(715.457, point0.y, 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Point point0 = new Point(2865.175228, 0.0);
      double double0 = point0.x();
      assertEquals(0.0, point0.y, 0.01);
      assertEquals(2865.175228, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point point0 = new Point((-1990.0), (-1990.0));
      double double0 = point0.x();
      assertEquals((-1990.0), double0, 0.01);
      assertEquals((-1990.0), point0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Point point0 = new Point();
      point0.subtractLocal((-1.0), 1.0);
      assertEquals(1.0, point0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Point point0 = new Point((-1990.0), (-1990.0));
      point0.set((XY) point0);
      assertEquals((-1990.0), point0.x, 0.01);
      assertEquals((-1990.0), point0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Point point0 = new Point((-734.0984159918237), 0.0);
      Point point1 = point0.subtractLocal((-4137.5441), 0.0);
      point0.set((XY) point1);
      assertEquals(3403.4456840081766, point0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point point0 = new Point(0.0, 715.457);
      point0.subtractLocal(3095.326, (-4149.721241));
      point0.set((XY) point0);
      assertEquals((-3095.326), point0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point point0 = new Point();
      point0.set(0.0, (-357.14715288959));
      assertEquals((-357.14715288959), point0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector vector0 = new Vector();
      Point point0 = new Point(vector0);
      point0.set(298.7, 316.94611128);
      assertEquals(298.7, point0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Point point0 = new Point(0.0, 715.457);
      point0.mult((-1308.484466759), point0);
      point0.rotateLocal((-2642.0));
      assertEquals(933213.3533096425, point0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtract((-387.01259), (-387.01259), point0);
      point1.rotateLocal((-537.6024932785839));
      point1.multLocal((-715637.6936479607));
      assertEquals(1.5081221867711547E8, point1.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtract((-387.01259), (-387.01259), point0);
      Point point2 = point1.rotateLocal((-537.6024932785839));
      point1.rotateLocal((-387.01259));
      Point point3 = point2.multLocal(1.0);
      assertEquals((-109.51036586786466), point3.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Point point0 = new Point(0.0, 715.457);
      point0.addLocal(0.0, (-1.0));
      assertEquals(714.457, point0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point point0 = new Point();
      point0.addLocal(1675.463633, 0.0);
      assertEquals(1675.463633, point0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.set((XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point point0 = null;
      try {
        point0 = new Point((XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.set((-428.52083933605), 0.0);
      point1.multLocal(6157700.017369637);
      assertEquals((-2.638702779822847E9), point1.x(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Point point0 = new Point();
      point0.addLocal((-244.6211913407), (-1249.3696274356207));
      assertEquals((-1249.3696274356207), point0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtractLocal((-428.52083933605), (-428.52083933605));
      double double0 = point1.y();
      assertEquals(428.52083933605, point0.y, 0.01);
      assertEquals(428.52083933605, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector vector0 = new Vector();
      Point point0 = new Point(vector0);
      point0.set((XY) point0);
      assertEquals(0.0, point0.x, 0.01);
      assertEquals(0.0, point0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector vector0 = new Vector();
      Point point0 = new Point(vector0);
      point0.multLocal(316.94611128);
      assertEquals(0.0, point0.x(), 0.01);
      assertEquals(0.0, point0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.rotateLocal(0.0);
      assertEquals(0.0, point1.y(), 0.01);
      assertEquals(0.0, point1.x, 0.01);
  }
}
