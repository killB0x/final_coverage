/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 05:30:33 GMT 2022
 */

package pythagoras.d;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.d.Dimension;
import pythagoras.d.IPoint;
import pythagoras.d.IRectangle;
import pythagoras.d.Line;
import pythagoras.d.Point;
import pythagoras.d.Rectangle;
import pythagoras.d.Rectangles;
import pythagoras.d.Vector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Rectangles_ESTest extends Rectangles_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0.0, (-2107.962669218652), (-1260.41043), (-2107.962669218652));
      Point point0 = new Point(0.0, 0.0);
      Point point1 = Rectangles.closestInteriorPoint((IRectangle) rectangle0, (IPoint) point0, point0);
      Dimension dimension0 = new Dimension((-4215.925338437304), (-2107.962669218652));
      Rectangle rectangle1 = new Rectangle(point1, dimension0);
      Rectangles.union(rectangle1, rectangle1, rectangle0);
      assertEquals((-4215.925338437304), rectangle0.y, 0.01);
      assertTrue(rectangle0.equals((Object)rectangle1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Dimension dimension0 = new Dimension((-271.478), 1978.9281704455093);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Point point0 = new Point(1.0, (-271.478));
      Rectangle rectangle1 = new Rectangle(point0, dimension0);
      Rectangles.union(rectangle1, rectangle0, rectangle1);
      assertEquals(2250.4061704455094, rectangle1.height, 0.01);
      assertEquals((-270.478), rectangle1.width(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Point point0 = new Point(246.0, 1.0);
      Rectangle rectangle0 = new Rectangle(point0);
      Rectangles.intersect(rectangle0, rectangle0, rectangle0);
      assertEquals(0.0, rectangle0.height, 0.01);
      assertEquals(246.0, rectangle0.x, 0.01);
      assertEquals(1.0, rectangle0.y, 0.01);
      assertEquals(0.0, rectangle0.width, 0.01);
      assertEquals(0.0, rectangle0.width(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Dimension dimension0 = new Dimension((-271.478), 1978.9281704455093);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Point point0 = new Point(1.0, (-271.478));
      Rectangle rectangle1 = new Rectangle(point0, dimension0);
      Rectangles.intersect(rectangle0, rectangle1, rectangle0);
      assertEquals(1.0, rectangle0.x, 0.01);
      assertEquals((-272.478), rectangle0.width(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Line line0 = new Line(1.0, 1.0, 1559.71044, (-271.478));
      Dimension dimension0 = new Dimension((-271.478), 1978.9281704455093);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Point point0 = new Point(1.0, (-271.478));
      line0.bounds(rectangle0);
      double double0 = Rectangles.pointRectDistanceSq(rectangle0, point0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Line line0 = new Line(1.0, 1.0, 1559.71044, (-271.478));
      Dimension dimension0 = new Dimension((-271.478), 1978.9281704455093);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Point point0 = new Point(1.0, (-271.478));
      Rectangle rectangle1 = line0.bounds(rectangle0);
      double double0 = Rectangles.pointRectDistance(rectangle1, point0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dimension dimension0 = new Dimension((-271.478), 1978.9281704455093);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Point point0 = new Point(1.0, (-271.478));
      double double0 = Rectangles.pointRectDistance(rectangle0, point0);
      assertEquals(384.6356262334523, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Line line0 = new Line();
      Rectangle rectangle0 = line0.bounds();
      rectangle0.setSize(0.0, (-750.40732319524));
      Point point0 = rectangle0.min();
      Point point1 = Rectangles.closestInteriorPoint((IRectangle) rectangle0, (IPoint) point0, point0);
      assertSame(point0, point1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dimension dimension0 = new Dimension((-271.478), 1978.9281704455093);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Point point0 = new Point(1.0, (-271.478));
      Point point1 = Rectangles.closestInteriorPoint((IRectangle) rectangle0, (IPoint) point0);
      Point point2 = Rectangles.closestInteriorPoint((IRectangle) rectangle0, (IPoint) point1, point1);
      assertEquals(0.0, point2.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector vector0 = new Vector(2200.1757329952, 2.0);
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(vector0, dimension0);
      Point point0 = rectangle0.min();
      Point point1 = Rectangles.closestInteriorPoint((IRectangle) rectangle0, (IPoint) point0, point0);
      assertEquals(2.0, point1.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Line line0 = new Line();
      Rectangle rectangle0 = line0.bounds();
      rectangle0.setSize(0.0, (-750.40732319524));
      Point point0 = rectangle0.min();
      Point point1 = Rectangles.closestInteriorPoint((IRectangle) rectangle0, (IPoint) point0);
      assertEquals((-750.40732319524), point1.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector vector0 = new Vector(2200.1757329952, 2.0);
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(vector0, dimension0);
      Point point0 = rectangle0.min();
      Point point1 = Rectangles.closestInteriorPoint((IRectangle) rectangle0, (IPoint) point0);
      assertEquals(2200.1757329952, point1.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      // Undeclared exception!
      try { 
        Rectangles.union(rectangle0, (IRectangle) null, rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Rectangles", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      // Undeclared exception!
      try { 
        Rectangles.pointRectDistanceSq(rectangle0, (IPoint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Rectangles", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      // Undeclared exception!
      try { 
        Rectangles.intersect((IRectangle) null, (IRectangle) null, rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Rectangles", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        Rectangles.closestInteriorPoint((IRectangle) null, (IPoint) point0, point0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Rectangles", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Dimension dimension0 = new Dimension((-271.478), 1978.9281704455093);
      Rectangle rectangle0 = new Rectangle(dimension0);
      Point point0 = new Point(1.0, (-271.478));
      double double0 = Rectangles.pointRectDistanceSq(rectangle0, point0);
      assertEquals(147944.564968, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rectangles rectangles0 = new Rectangles();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      // Undeclared exception!
      try { 
        Rectangles.pointRectDistance(rectangle0, (IPoint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Rectangles", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Rectangles.closestInteriorPoint((IRectangle) null, (IPoint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Rectangles", e);
      }
  }
}
