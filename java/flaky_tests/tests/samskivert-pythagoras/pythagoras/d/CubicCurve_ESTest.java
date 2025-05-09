/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 05:36:26 GMT 2022
 */

package pythagoras.d;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.d.AffineTransform;
import pythagoras.d.CubicCurve;
import pythagoras.d.Dimension;
import pythagoras.d.ICubicCurve;
import pythagoras.d.Point;
import pythagoras.d.Rectangle;
import pythagoras.d.Vector;
import pythagoras.d.XY;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CubicCurve_ESTest extends CubicCurve_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(4.54608817467, (-438.751), (-438.751), 0.0, 0.0, (-438.751), 0.0, 0.0);
      Point point0 = cubicCurve0.ctrlP1();
      Point point1 = point0.mult(0.0);
      cubicCurve0.setCurve((XY) point0, (XY) point0, (XY) point1, (XY) point0);
      assertEquals((-438.751), cubicCurve0.x1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, (-3842.37407119185), 0.0, 0.0, 0.0, 0.0, (-3842.37407119185), 0.0);
      assertEquals((-3842.37407119185), cubicCurve0.x2, 0.01);
      
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(dimension0);
      Point point0 = rectangle0.location();
      Vector vector0 = new Vector(point0);
      cubicCurve0.setCurve((XY) vector0, (XY) point0, (XY) point0, (XY) vector0);
      assertEquals(0.0, cubicCurve0.ctrlY1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 0.0, 0.0, 2453.03856, 1.0, (-1070.9025800156567), (-2773.5381051798313), (-704.816));
      Vector vector0 = new Vector(815.944139010214, 1.0);
      XY[] xYArray0 = new XY[5];
      xYArray0[0] = (XY) vector0;
      xYArray0[1] = (XY) vector0;
      Point point0 = new Point(xYArray0[0]);
      xYArray0[2] = (XY) point0;
      xYArray0[3] = (XY) point0;
      cubicCurve0.setCurve(xYArray0, 0);
      assertEquals(1.0, cubicCurve0.y2, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 0.0, 0.0, 2453.03856, 1.0, (-1070.9025800156567), (-2773.5381051798313), (-704.816));
      Vector vector0 = new Vector(815.944139010214, 1.0);
      XY[] xYArray0 = new XY[5];
      xYArray0[0] = (XY) vector0;
      xYArray0[1] = (XY) vector0;
      Point point0 = new Point(xYArray0[0]);
      xYArray0[2] = (XY) point0;
      // Undeclared exception!
      try { 
        cubicCurve0.setCurve(xYArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.CubicCurve", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(1270.7873, 1270.7873, 1270.7873, 0.0, 0.0, 0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[9];
      cubicCurve0.setCurve(doubleArray0, 1);
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
      assertEquals(0.0, cubicCurve0.x1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      Point point0 = new Point();
      AffineTransform affineTransform0 = new AffineTransform(0.5, (-1270.6249412026), 562.48365016432, 0.0, (-1376.525573774197));
      Vector vector0 = affineTransform0.translation();
      cubicCurve0.setCurve((XY) point0, (XY) vector0, (XY) vector0, (XY) vector0);
      assertEquals((-1376.525573774197), cubicCurve0.y2, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      double double0 = cubicCurve0.y2();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(1270.7873, 1270.7873, 1270.7873, 0.0, 0.0, 0.0, 0.0, 0.0);
      cubicCurve0.setCurve(1774.8645, 9.999999747378752E-6, 0.0, 2476.1753219, 0.0, 0.0, 1.0, 1.0);
      double double0 = cubicCurve0.y2();
      assertEquals(1774.8645, cubicCurve0.x1, 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(4.54608817467, (-438.751), (-438.751), 0.0, 0.0, (-438.751), 0.0, 0.0);
      cubicCurve0.y2 = (-1041.141829214523);
      double double0 = cubicCurve0.y2();
      assertEquals((-1041.141829214523), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve((-4266.2737), 0.0, 0.0, 1792.7988306669808, 1792.7988306669808, (-2486.1608), 885.252, 885.252);
      double double0 = cubicCurve0.y1();
      assertEquals(1792.7988306669808, cubicCurve0.ctrly1, 0.01);
      assertEquals((-4266.2737), cubicCurve0.x1, 0.01);
      assertEquals((-2486.1608), cubicCurve0.ctrly2, 0.01);
      assertEquals(885.252, cubicCurve0.y2, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
      assertEquals(885.252, cubicCurve0.x2, 0.01);
      assertEquals(1792.7988306669808, cubicCurve0.ctrlx2, 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 1059.6895046204, 0.0, 0.0, 1.0, (-30.367376), (-23.69957), 1.0);
      double double0 = cubicCurve0.y1();
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
      assertEquals(1.0, cubicCurve0.ctrlx2, 0.01);
      assertEquals((-23.69957), cubicCurve0.x2, 0.01);
      assertEquals(1059.6895046204, double0, 0.01);
      assertEquals(1.0, cubicCurve0.y2, 0.01);
      assertEquals(0.0, cubicCurve0.x1, 0.01);
      assertEquals((-30.367376), cubicCurve0.ctrly2, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(4.54608817467, (-438.751), (-438.751), 0.0, 0.0, (-438.751), 0.0, 0.0);
      double double0 = cubicCurve0.y1();
      assertEquals(0.0, cubicCurve0.ctrly1, 0.01);
      assertEquals(0.0, cubicCurve0.x2, 0.01);
      assertEquals((-438.751), double0, 0.01);
      assertEquals(4.54608817467, cubicCurve0.x1, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlx2, 0.01);
      assertEquals(0.0, cubicCurve0.y2, 0.01);
      assertEquals((-438.751), cubicCurve0.ctrly2, 0.01);
      assertEquals((-438.751), cubicCurve0.ctrlx1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      double double0 = cubicCurve0.x2();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(500.2237558127141, 500.2237558127141, (-1369.5), 0.0, 500.2237558127141, 500.2237558127141, 1045.719797, (-1.0));
      double double0 = cubicCurve0.x2();
      assertEquals(500.2237558127141, cubicCurve0.ctrlx2, 0.01);
      assertEquals(500.2237558127141, cubicCurve0.ctrly2, 0.01);
      assertEquals((-1369.5), cubicCurve0.ctrlx1, 0.01);
      assertEquals(0.0, cubicCurve0.ctrly1, 0.01);
      assertEquals((-1.0), cubicCurve0.y2, 0.01);
      assertEquals(1045.719797, double0, 0.01);
      assertEquals(500.2237558127141, cubicCurve0.x1, 0.01);
      assertEquals(500.2237558127141, cubicCurve0.y1, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 0.0, 0.0, 2453.03856, 1.0, (-1070.9025800156567), (-2773.5381051798313), (-704.816));
      double double0 = cubicCurve0.x2();
      assertEquals(0.0, cubicCurve0.x1, 0.01);
      assertEquals(0.0, cubicCurve0.y1, 0.01);
      assertEquals((-704.816), cubicCurve0.y2, 0.01);
      assertEquals((-2773.5381051798313), double0, 0.01);
      assertEquals((-1070.9025800156567), cubicCurve0.ctrly2, 0.01);
      assertEquals(1.0, cubicCurve0.ctrlx2, 0.01);
      assertEquals(2453.03856, cubicCurve0.ctrly1, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      double double0 = cubicCurve0.x1();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(1313.0133, 1313.0133, (-5348.21379378), 0.0, 1313.0133, (-5348.21379378), (-1.0), (-1.0));
      double double0 = cubicCurve0.x1();
      assertEquals(1313.0133, double0, 0.01);
      assertEquals(0.0, cubicCurve0.ctrly1, 0.01);
      assertEquals((-1.0), cubicCurve0.x2, 0.01);
      assertEquals((-5348.21379378), cubicCurve0.ctrly2, 0.01);
      assertEquals((-5348.21379378), cubicCurve0.ctrlx1, 0.01);
      assertEquals(1313.0133, cubicCurve0.ctrlx2, 0.01);
      assertEquals((-1.0), cubicCurve0.y2, 0.01);
      assertEquals(1313.0133, cubicCurve0.y1, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve((-1649.4), (-1139.21265992), 5027.2003206168, (-1987.107591), (-67.1142939079), (-67.1142939079), (-67.1142939079), (-67.1142939079));
      double double0 = cubicCurve0.x1();
      assertEquals((-1987.107591), cubicCurve0.ctrly1, 0.01);
      assertEquals((-1139.21265992), cubicCurve0.y1, 0.01);
      assertEquals((-67.1142939079), cubicCurve0.ctrlx2, 0.01);
      assertEquals((-67.1142939079), cubicCurve0.ctrly2, 0.01);
      assertEquals(5027.2003206168, cubicCurve0.ctrlx1, 0.01);
      assertEquals((-67.1142939079), cubicCurve0.x2, 0.01);
      assertEquals((-67.1142939079), cubicCurve0.y2, 0.01);
      assertEquals((-1649.4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(171.86436, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0);
      double double0 = cubicCurve0.ctrlY2();
      assertEquals(1.0, cubicCurve0.ctrlx2, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, cubicCurve0.ctrly1, 0.01);
      assertEquals(1.0, cubicCurve0.y1, 0.01);
      assertEquals(171.86436, cubicCurve0.x1, 0.01);
      assertEquals(0.0, cubicCurve0.x2, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
      assertEquals(0.0, cubicCurve0.y2, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(4.54608817467, (-438.751), (-438.751), 0.0, 0.0, (-438.751), 0.0, 0.0);
      double double0 = cubicCurve0.ctrlY2();
      assertEquals((-438.751), cubicCurve0.y1, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlx2, 0.01);
      assertEquals(4.54608817467, cubicCurve0.x1, 0.01);
      assertEquals((-438.751), double0, 0.01);
      assertEquals(0.0, cubicCurve0.x2, 0.01);
      assertEquals(0.0, cubicCurve0.ctrly1, 0.01);
      assertEquals((-438.751), cubicCurve0.ctrlx1, 0.01);
      assertEquals(0.0, cubicCurve0.y2, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      double double0 = cubicCurve0.ctrlY1();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 204.58908462130998, 0.0, 204.58908462130998, 204.58908462130998, 204.58908462130998, 0.0, 0.0);
      double double0 = cubicCurve0.ctrlY1();
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
      assertEquals(0.0, cubicCurve0.y2, 0.01);
      assertEquals(0.0, cubicCurve0.x1, 0.01);
      assertEquals(204.58908462130998, cubicCurve0.ctrly2, 0.01);
      assertEquals(204.58908462130998, double0, 0.01);
      assertEquals(0.0, cubicCurve0.x2, 0.01);
      assertEquals(204.58908462130998, cubicCurve0.ctrlx2, 0.01);
      assertEquals(204.58908462130998, cubicCurve0.y1, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 211.538, 0.0, (-3394.391138254), 851.7359488249, 0.0, 0.0, 211.538);
      double double0 = cubicCurve0.ctrlY1();
      assertEquals(211.538, cubicCurve0.y1, 0.01);
      assertEquals(211.538, cubicCurve0.y2, 0.01);
      assertEquals(0.0, cubicCurve0.x1, 0.01);
      assertEquals((-3394.391138254), double0, 0.01);
      assertEquals(0.0, cubicCurve0.ctrly2, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
      assertEquals(0.0, cubicCurve0.x2, 0.01);
      assertEquals(851.7359488249, cubicCurve0.ctrlx2, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      double double0 = cubicCurve0.ctrlX2();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 0.0, 0.0, 2453.03856, 1.0, (-1070.9025800156567), (-2773.5381051798313), (-704.816));
      double double0 = cubicCurve0.ctrlX2();
      assertEquals(1.0, double0, 0.01);
      assertEquals((-2773.5381051798313), cubicCurve0.x2, 0.01);
      assertEquals((-1070.9025800156567), cubicCurve0.ctrly2, 0.01);
      assertEquals((-704.816), cubicCurve0.y2, 0.01);
      assertEquals(0.0, cubicCurve0.y1, 0.01);
      assertEquals(0.0, cubicCurve0.x1, 0.01);
      assertEquals(2453.03856, cubicCurve0.ctrly1, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve((-1.0), 2419.77058552804, 2419.77058552804, 4.0, (-1.0), (-4301.396449329471), 2419.77058552804, 2419.77058552804);
      double double0 = cubicCurve0.ctrlX2();
      assertEquals(2419.77058552804, cubicCurve0.x2, 0.01);
      assertEquals(2419.77058552804, cubicCurve0.y1, 0.01);
      assertEquals(2419.77058552804, cubicCurve0.y2, 0.01);
      assertEquals((-1.0), cubicCurve0.x1, 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals(2419.77058552804, cubicCurve0.ctrlx1, 0.01);
      assertEquals((-4301.396449329471), cubicCurve0.ctrly2, 0.01);
      assertEquals(4.0, cubicCurve0.ctrly1, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 0.0, 0.0, 2453.03856, 1.0, (-1070.9025800156567), (-2773.5381051798313), (-704.816));
      double double0 = cubicCurve0.ctrlX1();
      assertEquals((-704.816), cubicCurve0.y2, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-2773.5381051798313), cubicCurve0.x2, 0.01);
      assertEquals((-1070.9025800156567), cubicCurve0.ctrly2, 0.01);
      assertEquals(2453.03856, cubicCurve0.ctrly1, 0.01);
      assertEquals(1.0, cubicCurve0.ctrlx2, 0.01);
      assertEquals(0.0, cubicCurve0.x1, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 5312.0, 1669.935, 1.0, 560.3977, 0.0, 116.3957581490004, 116.3957581490004);
      double double0 = cubicCurve0.ctrlX1();
      assertEquals(0.0, cubicCurve0.ctrly2, 0.01);
      assertEquals(116.3957581490004, cubicCurve0.y2, 0.01);
      assertEquals(1.0, cubicCurve0.ctrly1, 0.01);
      assertEquals(560.3977, cubicCurve0.ctrlx2, 0.01);
      assertEquals(1669.935, double0, 0.01);
      assertEquals(5312.0, cubicCurve0.y1, 0.01);
      assertEquals(116.3957581490004, cubicCurve0.x2, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 0.0, 0.0, 2453.03856, 1.0, (-1070.9025800156567), (-2773.5381051798313), (-704.816));
      cubicCurve0.setCurve(1.0, (-556.9438435549), (-2773.5381051798313), 6.283185307179586, 10.0, (-1.0), 0.0, 0.0);
      double double0 = cubicCurve0.ctrlX1();
      assertEquals((-556.9438435549), cubicCurve0.y1, 0.01);
      assertEquals((-2773.5381051798313), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      // Undeclared exception!
      try { 
        cubicCurve0.setCurve((double[]) null, (-3694));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.CubicCurve", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      // Undeclared exception!
      try { 
        cubicCurve0.setCurve((ICubicCurve) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.CubicCurve", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(0.0, 5312.0, 1669.935, 1.0, 560.3977, 0.0, 116.3957581490004, 116.3957581490004);
      CubicCurve cubicCurve1 = cubicCurve0.clone();
      assertEquals(0.0, cubicCurve1.ctrly2, 0.01);
      assertEquals(560.3977, cubicCurve0.ctrlX2(), 0.01);
      assertEquals(5312.0, cubicCurve1.y1, 0.01);
      assertEquals(116.3957581490004, cubicCurve1.x2, 0.01);
      assertEquals(116.3957581490004, cubicCurve0.y2(), 0.01);
      assertEquals(1669.935, cubicCurve0.ctrlX1(), 0.01);
      assertEquals(0.0, cubicCurve1.x1, 0.01);
      assertEquals(1.0, cubicCurve0.ctrlY1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(171.86436, 1.0, 0.9060765563347504, 1.0, 1.0, 0.9060765563347504, 0.9060765563347504, 0.0);
      double double0 = cubicCurve0.ctrlY2();
      assertEquals(0.9060765563347504, double0, 0.01);
      assertEquals(0.9060765563347504, cubicCurve0.x2, 0.01);
      assertEquals(1.0, cubicCurve0.ctrlx2, 0.01);
      assertEquals(0.9060765563347504, cubicCurve0.ctrlx1, 0.01);
      assertEquals(171.86436, cubicCurve0.x1, 0.01);
      assertEquals(1.0, cubicCurve0.y1, 0.01);
      assertEquals(0.0, cubicCurve0.y2, 0.01);
      assertEquals(1.0, cubicCurve0.ctrly1, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      cubicCurve0.setCurve((ICubicCurve) cubicCurve0);
      assertEquals(0.0, cubicCurve0.ctrlx2, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlx1, 0.01);
      assertEquals(0.0, cubicCurve0.ctrly2, 0.01);
      assertEquals(0.0, cubicCurve0.ctrlY1(), 0.01);
      assertEquals(0.0, cubicCurve0.x2(), 0.01);
      assertEquals(0.0, cubicCurve0.x1, 0.01);
      assertEquals(0.0, cubicCurve0.y2, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve(171.86436, 1.0, 0.9060765563347504, 1.0, 1.0, 0.9060765563347504, 0.9060765563347504, 0.0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        cubicCurve0.setCurve(doubleArray0, 2050);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2050 out of bounds for length 6
         //
         verifyException("pythagoras.d.CubicCurve", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      // Undeclared exception!
      try { 
        cubicCurve0.setCurve((XY) null, (XY) null, (XY) null, (XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.CubicCurve", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CubicCurve cubicCurve0 = new CubicCurve();
      XY[] xYArray0 = new XY[0];
      // Undeclared exception!
      try { 
        cubicCurve0.setCurve(xYArray0, (-3364));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -3364 out of bounds for length 0
         //
         verifyException("pythagoras.d.CubicCurve", e);
      }
  }
}
