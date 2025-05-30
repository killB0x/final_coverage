/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 04:58:46 GMT 2022
 */

package pythagoras.f;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.f.AffineTransform;
import pythagoras.f.Arc;
import pythagoras.f.Dimension;
import pythagoras.f.IArc;
import pythagoras.f.IDimension;
import pythagoras.f.IRectangle;
import pythagoras.f.Line;
import pythagoras.f.Point;
import pythagoras.f.Rectangle;
import pythagoras.f.Vector;
import pythagoras.f.XY;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Arc_ESTest extends Arc_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Arc arc0 = new Arc();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(dimension0);
      Arc arc1 = new Arc(rectangle0, 2.0F, (-3.4028235E38F), 2);
      arc0.setArc((IArc) arc1);
      arc0.setFrame(1.0E-5F, 1.0E-5F, 1.0E-5F, 1.0E-5F);
      assertEquals(2.0F, arc0.start, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Arc arc0 = new Arc();
      Vector vector0 = new Vector((-1.0F), (-668.0F));
      Rectangle rectangle0 = new Rectangle(vector0);
      Point point0 = rectangle0.location();
      arc0.setAngles((XY) point0, (XY) vector0);
      assertEquals(90.08576F, arc0.start, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Arc arc0 = new Arc((-1.0F), (-200.08632F), (-1.0F), 0.0F, 93.01757F, 0.0F, 0);
      Point point0 = new Point();
      arc0.setAngleStart((XY) point0);
      assertEquals(270.42953F, arc0.start, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Arc arc0 = new Arc();
      Point point0 = arc0.min();
      point0.subtractLocal(2.0F, 0.0F);
      Point point1 = new Point(0.0F, 0.0F);
      arc0.setArcByTangent(point1, point1, point0, 3.4028235E38F);
      assertEquals(Float.POSITIVE_INFINITY, arc0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Arc arc0 = new Arc();
      Rectangle rectangle0 = new Rectangle(0.0F, (-2366.586F), (-1.0F), 360.0F);
      // Undeclared exception!
      try { 
        arc0.setArc((IRectangle) rectangle0, (-1.0F), (-1.0F), 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: 10
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Arc arc0 = new Arc(2);
      Vector vector0 = new Vector(1.0F, 0.0F);
      Dimension dimension0 = new Dimension(1.0F, (-1774.042F));
      // Undeclared exception!
      try { 
        arc0.setArc((XY) vector0, (IDimension) dimension0, (float) 2, (-3949.1028F), 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: 8
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Arc arc0 = new Arc(994.39685F, 1080.447F, 90.0F, 1080.447F, 90.0F, 994.39685F, 0);
      Point point0 = arc0.startPoint();
      Dimension dimension0 = new Dimension();
      arc0.setArc((XY) point0, (IDimension) dimension0, 1080.447F, 0.0F, 0);
      assertEquals(1080.447F, arc0.start, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Arc arc0 = new Arc((-1.0F), (-200.08632F), (-1.0F), 0.0F, 93.01757F, 0.0F, 0);
      Arc arc1 = arc0.clone();
      assertEquals(93.01757F, arc0.angleStart(), 0.01F);
      assertEquals(0.0F, arc0.angleExtent(), 0.01F);
      assertEquals((-200.08632F), arc0.y(), 0.01F);
      assertEquals((-1.0F), arc0.width(), 0.01F);
      assertEquals(0, arc1.arcType());
      assertEquals(0.0F, arc0.height(), 0.01F);
      assertEquals((-1.0F), arc1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Arc arc0 = new Arc();
      arc0.setArcByCenter(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0);
      assertEquals(0.0F, arc0.width, 0.01F);
      assertEquals(0.0F, arc0.y, 0.01F);
      assertEquals(0.0F, arc0.start, 0.01F);
      assertEquals(0, arc0.arcType());
      assertEquals(0.0F, arc0.extent, 0.01F);
      assertEquals(0.0F, arc0.x, 0.01F);
      assertEquals(0.0F, arc0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arc arc0 = new Arc();
      arc0.setArc(90.0F, 90.0F, 90.0F, 90.0F, (-2561.0F), 90.0F, 1);
      assertEquals(90.0F, arc0.extent, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Arc arc0 = new Arc();
      Point point0 = new Point(1342.2368F, 1342.2368F);
      Line line0 = new Line(point0, point0);
      Rectangle rectangle0 = line0.bounds();
      arc0.setArc((IRectangle) rectangle0, 0.0F, 2.0F, 0);
      assertEquals(1342.2368F, arc0.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Line line0 = new Line((-1.0F), (-1.0F), 0.0F, (-1.0F));
      Rectangle rectangle0 = line0.bounds();
      Arc arc0 = new Arc(rectangle0, (-1.0F), 0.0F, 0);
      assertEquals(0, arc0.arcType());
      assertEquals((-1.0F), arc0.start, 0.01F);
      assertEquals((-1.0F), arc0.y, 0.01F);
      assertEquals((-1.0F), arc0.x, 0.01F);
      assertEquals(0.0F, arc0.height, 0.01F);
      assertEquals(0.0F, arc0.extent, 0.01F);
      assertEquals(1.0F, arc0.width, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Arc arc0 = new Arc(0);
      float float0 = arc0.y();
      assertEquals(0, arc0.arcType());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Arc arc0 = new Arc();
      arc0.setFrame(1.0E-5F, 1.0E-5F, 1.0E-5F, 1.0E-5F);
      float float0 = arc0.y();
      assertEquals(1.0E-5F, arc0.width, 0.01F);
      assertEquals(1.0E-5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Arc arc0 = new Arc((-1587.6852F), (-1587.6852F), (-1587.6852F), (-1587.6852F), (-1587.6852F), 2.0F, 0);
      float float0 = arc0.y();
      assertEquals((-1587.6852F), float0, 0.01F);
      assertEquals((-1587.6852F), arc0.height, 0.01F);
      assertEquals((-1587.6852F), arc0.x, 0.01F);
      assertEquals((-1587.6852F), arc0.width, 0.01F);
      assertEquals((-1587.6852F), arc0.start, 0.01F);
      assertEquals(2.0F, arc0.extent, 0.01F);
      assertEquals(0, arc0.arcType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Arc arc0 = new Arc();
      float float0 = arc0.x();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, arc0.arcType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Arc arc0 = new Arc((-1587.6852F), (-1587.6852F), (-1587.6852F), (-1587.6852F), (-1587.6852F), 2.0F, 0);
      float float0 = arc0.x();
      assertEquals((-1587.6852F), arc0.width, 0.01F);
      assertEquals((-1587.6852F), arc0.start, 0.01F);
      assertEquals((-1587.6852F), float0, 0.01F);
      assertEquals(0, arc0.arcType());
      assertEquals((-1587.6852F), arc0.y, 0.01F);
      assertEquals(2.0F, arc0.extent, 0.01F);
      assertEquals((-1587.6852F), arc0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Arc arc0 = new Arc();
      float float0 = arc0.width();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, arc0.arcType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Arc arc0 = new Arc(1.5707964F, 1.5707964F, 1108.1531F, 1108.1531F, 1.5707964F, 1108.1531F, 0);
      float float0 = arc0.width();
      assertEquals(1.5707964F, arc0.start, 0.01F);
      assertEquals(1108.1531F, arc0.extent, 0.01F);
      assertEquals(1108.1531F, arc0.height, 0.01F);
      assertEquals(1108.1531F, float0, 0.01F);
      assertEquals(1.5707964F, arc0.x, 0.01F);
      assertEquals(1.5707964F, arc0.y, 0.01F);
      assertEquals(0, arc0.arcType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Arc arc0 = new Arc((-1587.6852F), (-1587.6852F), (-1587.6852F), (-1587.6852F), (-1587.6852F), 2.0F, 0);
      float float0 = arc0.width();
      assertEquals((-1587.6852F), float0, 0.01F);
      assertEquals((-1587.6852F), arc0.y, 0.01F);
      assertEquals((-1587.6852F), arc0.start, 0.01F);
      assertEquals((-1587.6852F), arc0.height, 0.01F);
      assertEquals(0, arc0.arcType());
      assertEquals((-1587.6852F), arc0.x, 0.01F);
      assertEquals(2.0F, arc0.extent, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Arc arc0 = new Arc(0);
      float float0 = arc0.height();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, arc0.arcType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Arc arc0 = new Arc(0);
      AffineTransform affineTransform0 = new AffineTransform((-1542.7075F), 199.1194F, (-1.0F), 0.0F, 0, (-333.52078F));
      Vector vector0 = affineTransform0.scale();
      Dimension dimension0 = new Dimension(0.0F, 4);
      arc0.setArc((XY) vector0, (IDimension) dimension0, 0.0F, (float) 0, 0);
      float float0 = arc0.height();
      assertEquals(1555.5048F, arc0.x, 0.01F);
      assertEquals(4.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Arc arc0 = new Arc();
      Point point0 = arc0.min();
      arc0.setArcByTangent(point0, point0, point0, (-2.0F));
      float float0 = arc0.height();
      assertEquals((-4.0F), arc0.height, 0.01F);
      assertEquals((-4.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Arc arc0 = new Arc();
      int int0 = arc0.arcType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Arc arc0 = new Arc();
      float float0 = arc0.angleStart();
      assertEquals(0, arc0.arcType());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Arc arc0 = new Arc();
      Point point0 = arc0.min();
      Point point1 = point0.subtractLocal(0.2572987F, 0.0F);
      arc0.setAngleStart((XY) point1);
      float float0 = arc0.angleStart();
      assertEquals(180.0F, arc0.start, 0.01F);
      assertEquals(180.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Arc arc0 = new Arc(0.0F, 0.0F, 360.0F, (-1741.186F), (-103.667404F), 1.0E-5F, 2);
      float float0 = arc0.angleStart();
      assertEquals(0.0F, arc0.y, 0.01F);
      assertEquals((-103.667404F), float0, 0.01F);
      assertEquals((-1741.186F), arc0.height, 0.01F);
      assertEquals(360.0F, arc0.width, 0.01F);
      assertEquals(2, arc0.arcType());
      assertEquals(1.0E-5F, arc0.extent, 0.01F);
      assertEquals(0.0F, arc0.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Arc arc0 = new Arc();
      float float0 = arc0.angleExtent();
      assertEquals(0, arc0.arcType());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc arc0 = new Arc();
      Point point0 = new Point(0.0F, 0.0F);
      arc0.setAngles((XY) point0, (XY) point0);
      float float0 = arc0.angleExtent();
      assertEquals(360.0F, arc0.extent, 0.01F);
      assertEquals(360.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Arc arc0 = new Arc();
      arc0.extent = (-3.4028235E38F);
      float float0 = arc0.angleExtent();
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Arc arc0 = new Arc();
      Point point0 = arc0.endPoint();
      // Undeclared exception!
      try { 
        arc0.setArcByTangent(point0, point0, (XY) null, 47.373825F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Arc arc0 = new Arc();
      Rectangle rectangle0 = arc0.bounds();
      // Undeclared exception!
      try { 
        arc0.setArc((IRectangle) rectangle0, 0.0F, 0.0F, (-522756765));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: -522756765
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Arc arc0 = new Arc();
      // Undeclared exception!
      try { 
        arc0.setArc((IArc) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      Arc arc0 = null;
      try {
        arc0 = new Arc(rectangle0, 0.0F, 0.0F, (-663));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: -663
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Arc arc0 = null;
      try {
        arc0 = new Arc(3809);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: 3809
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Arc arc0 = new Arc(994.39685F, 1080.447F, 90.0F, 1080.447F, 90.0F, 994.39685F, 0);
      arc0.setAngles(90.0F, 2614.71F, 1.0F, (float) 0);
      assertEquals(226.31592F, arc0.start, 0.01F);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Arc arc0 = new Arc();
      // Undeclared exception!
      try { 
        arc0.setArcType(9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: 9
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Arc arc0 = new Arc(0);
      arc0.setArcType(0);
      assertEquals(0, arc0.arcType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Arc arc0 = new Arc();
      arc0.setAngleExtent((-1056.9154F));
      assertEquals((-1056.9154F), arc0.extent, 0.01F);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Arc arc0 = new Arc();
      // Undeclared exception!
      try { 
        arc0.setArc(1.9764633F, 1.9764633F, 1.9764633F, 1.9764633F, 1.9764633F, 1.9764633F, (-1361));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: -1361
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Arc arc0 = new Arc((-1587.6852F), (-1587.6852F), (-1587.6852F), (-1587.6852F), (-1587.6852F), 2.0F, 0);
      arc0.setAngleStart((-1587.6852F));
      assertEquals((-1587.6852F), arc0.start, 0.01F);
      assertEquals((-1587.6852F), arc0.height, 0.01F);
      assertEquals((-1587.6852F), arc0.x, 0.01F);
      assertEquals(2.0F, arc0.extent, 0.01F);
      assertEquals((-1587.6852F), arc0.y, 0.01F);
      assertEquals(0, arc0.arcType());
      assertEquals((-1587.6852F), arc0.width, 0.01F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Arc arc0 = new Arc();
      AffineTransform affineTransform0 = new AffineTransform(0.0F, 0.0F, 981.8F, (-90.044846F), (-90.044846F), (-90.044846F));
      Vector vector0 = affineTransform0.translation();
      Point point0 = arc0.min();
      point0.subtractLocal(0.2572987F, (-2060.0F));
      Point point1 = arc0.startPoint();
      arc0.setArcByTangent(point0, vector0, point1, 1.5707964F);
      assertEquals(3.1415927F, arc0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Arc arc0 = new Arc();
      assertEquals(0, arc0.arcType());
      
      arc0.setArcType(2);
      assertEquals(2, arc0.arcType());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Arc arc0 = new Arc();
      assertEquals(0, arc0.arcType());
      
      arc0.setArcType(1);
      int int0 = arc0.arcType();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Arc arc0 = new Arc();
      arc0.setFrame(1.0E-5F, 1.0E-5F, 1.0E-5F, 1.0E-5F);
      float float0 = arc0.x();
      assertEquals(1.0E-5F, arc0.width, 0.01F);
      assertEquals(1.0E-5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Arc arc0 = new Arc();
      Dimension dimension0 = new Dimension();
      // Undeclared exception!
      try { 
        arc0.setArc((XY) null, (IDimension) dimension0, 0.0F, 0.0F, (-2277));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Arc arc0 = new Arc();
      // Undeclared exception!
      try { 
        arc0.setAngles((XY) null, (XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Arc arc0 = null;
      try {
        arc0 = new Arc((IRectangle) null, 1523.9F, 1523.9F, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Arc arc0 = null;
      try {
        arc0 = new Arc(0.09772742F, 0.09772742F, 0.09772742F, 0.09772742F, 0.09772742F, 0.09772742F, 308);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: 308
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Arc arc0 = new Arc();
      // Undeclared exception!
      try { 
        arc0.setArcByCenter(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, (-871));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Arc type: -871
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Arc arc0 = new Arc();
      // Undeclared exception!
      try { 
        arc0.setAngleStart((XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Arc arc0 = new Arc();
      // Undeclared exception!
      try { 
        arc0.setArc((IRectangle) null, 4.712389F, 4.712389F, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.Arc", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Arc arc0 = new Arc();
      arc0.setAngles(35.189453F, 35.189453F, 35.189453F, 1.5707964F);
      assertEquals(315.0F, arc0.start, 0.01F);
  }
}
