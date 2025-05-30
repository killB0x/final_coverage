/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 04:45:50 GMT 2022
 */

package pythagoras.d;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.d.AbstractEllipse;
import pythagoras.d.AffineTransform;
import pythagoras.d.Dimension;
import pythagoras.d.Ellipse;
import pythagoras.d.IRectangle;
import pythagoras.d.IdentityTransform;
import pythagoras.d.PathIterator;
import pythagoras.d.Point;
import pythagoras.d.Rectangle;
import pythagoras.d.Transform;
import pythagoras.d.Vector;
import pythagoras.d.XY;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractEllipse_ESTest extends AbstractEllipse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      IdentityTransform identityTransform0 = new IdentityTransform();
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, identityTransform0);
      double[] doubleArray0 = new double[3];
      abstractEllipse_Iterator0.next();
      // Undeclared exception!
      try { 
        abstractEllipse_Iterator0.currentSegment(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 3
         //
         verifyException("pythagoras.d.AbstractEllipse$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      IdentityTransform identityTransform0 = new IdentityTransform();
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, identityTransform0);
      abstractEllipse_Iterator0.next();
      abstractEllipse_Iterator0.next();
      // Undeclared exception!
      try { 
        abstractEllipse_Iterator0.currentSegment((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.AbstractEllipse$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      Point point0 = ellipse0.center();
      Point point1 = point0.add((double) 4, 3.0477927903323835E70);
      ellipse0.setFrameFromCenter((XY) point1, (XY) point0);
      boolean boolean0 = ellipse0.intersects((-1.0), 1.0, 477.2707, 3.0477927903323835E70);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      ellipse0.setFrame((-2038.244196465), 0.0, 0.25, 314.38);
      boolean boolean0 = ellipse0.intersects(0.5, 2640.7026549, 991.878218216474, 0.5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      ellipse0.setFrame((double) 4, 20.431705767081212, 1.0, 0.5403023058681398);
      boolean boolean0 = ellipse0.intersects(1.0, (-757.0), 0.5403023058681398, 20.431705767081212);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse((-3.4028234663852886E38), 1.1011410426382766, 177.172, 176.54336930073785);
      boolean boolean0 = ellipse0.intersects((-3.4028234663852886E38), (-3.4028234663852886E38), 7.761888892980924E7, 0.6286306992621462);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      ellipse0.setFrame((double) 4, 20.431705767081212, 1.0, 0.5403023058681398);
      boolean boolean0 = ellipse0.intersects((-757.0), 0.5403023058681398, 2502.5072106997, 1252.821);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      ellipse0.setFrameFromDiagonal(0.5, (-4076.48839293), 2.0, 0.0);
      boolean boolean0 = ellipse0.intersects(0.0, 2640.7026549, 991.878218216474, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 2.0, 2.0, 1.0);
      boolean boolean0 = ellipse0.intersects(2.0, 0.0, 0.0, (-602.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      ellipse0.setFrameFromDiagonal(1.0, (-1610.75), 2.0, 0.0);
      boolean boolean0 = ellipse0.contains((-1.0), (-1.0), 2106.6, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      Vector vector0 = new Vector();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(vector0, dimension0);
      boolean boolean0 = ellipse0.contains((IRectangle) rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 2.0, 2.0, 1.0);
      ellipse0.setFrame(9.999999747378752E-6, 0.25, (-602.0), 101.212655);
      PathIterator pathIterator0 = ellipse0.pathIterator((Transform) null);
      assertTrue(pathIterator0.isDone());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      IdentityTransform identityTransform0 = new IdentityTransform();
      PathIterator pathIterator0 = ellipse0.pathIterator((Transform) identityTransform0);
      assertFalse(pathIterator0.isDone());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      Ellipse ellipse1 = ellipse0.clone();
      assertEquals(0.0, ellipse1.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse((-1.0), (-2720.08), (-1.0), (-2720.08));
      Ellipse ellipse1 = ellipse0.clone();
      assertEquals((-1.0), ellipse1.x(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.57, 1.57, 1.57, 1.57);
      ellipse0.setFrameFromCenter(1.8177029607441755E-9, 3.4446552189818807, 3.4446552189818807, 1344.138);
      boolean boolean0 = ellipse0.contains(1.57, 302.152335197578);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, (Transform) null);
      double[] doubleArray0 = new double[14];
      int int0 = abstractEllipse_Iterator0.currentSegment(doubleArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      AffineTransform affineTransform0 = new AffineTransform((-21.143303896968387), 1.0, 1.0, 1.0, 1.0);
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, affineTransform0);
      double[] doubleArray0 = new double[6];
      abstractEllipse_Iterator0.next();
      int int0 = abstractEllipse_Iterator0.currentSegment(doubleArray0);
      assertEquals(3, int0);
      assertArrayEquals(new double[] {9.752644220049671, 3.642595794779213, 16.292701043230892, 3.5751768920404148, 19.447289730744984, 3.342811088948124}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AffineTransform affineTransform0 = new AffineTransform((-2487.0), (-2487.0), (-1.0), 4440111.541284423, (-2487.0));
      Ellipse ellipse0 = new Ellipse();
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, affineTransform0);
      abstractEllipse_Iterator0.next();
      abstractEllipse_Iterator0.next();
      abstractEllipse_Iterator0.next();
      abstractEllipse_Iterator0.next();
      abstractEllipse_Iterator0.next();
      assertFalse(abstractEllipse_Iterator0.isDone());
      
      double[] doubleArray0 = new double[21];
      int int0 = abstractEllipse_Iterator0.currentSegment(doubleArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      AffineTransform affineTransform0 = new AffineTransform((-21.143303896968387), 1.0, 1.0, 1.0, 1.0);
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, affineTransform0);
      assertFalse(abstractEllipse_Iterator0.isDone());
      
      double[] doubleArray0 = new double[6];
      int int0 = abstractEllipse_Iterator0.currentSegment(doubleArray0);
      assertArrayEquals(new double[] {4.839663430006251, 3.493395428418003, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      AffineTransform affineTransform0 = new AffineTransform(1.0, 1.0, 1.0, 1.0, 1.0);
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, affineTransform0);
      boolean boolean0 = abstractEllipse_Iterator0.isDone();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AffineTransform affineTransform0 = new AffineTransform();
      Ellipse ellipse0 = new Ellipse(0.0, 1.0, 1.0, (-1111.4969999999998));
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, affineTransform0);
      assertTrue(abstractEllipse_Iterator0.isDone());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse((-42.85463625093926), (-42.85463625093926), (-42.85463625093926), (-42.85463625093926));
      AffineTransform affineTransform0 = new AffineTransform((-42.85463625093926), (-42.85463625093926), (-42.85463625093926), (-42.85463625093926), (-42.85463625093926));
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, affineTransform0);
      // Undeclared exception!
      try { 
        abstractEllipse_Iterator0.currentSegment((double[]) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // Iterator out of bounds
         //
         verifyException("pythagoras.d.AbstractEllipse$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      boolean boolean0 = ellipse0.intersects(3502.7139, 1.5, 1.0, 1406.332919957422);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.685975220264999, 1.685975220264999, 1.685975220264999, 1.685975220264999);
      boolean boolean0 = ellipse0.intersects((-0.19375968790078565), (-0.19375968790078565), 1.685975220264999, (-0.19375968790078565));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      boolean boolean0 = ellipse0.intersects(1.0, 176.54336930073785, (-1883.40247603767), 2252.808229961001);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      boolean boolean0 = ellipse0.intersects(1.5707963267948966, 2602.32, 6.6528210215861194E7, 2092.7383392172387);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1573.31246461126, 28.078877666382336, 1573.31246461126, 28.078877666382336);
      ellipse0.setFrameFromCenter(28.078877666382336, (-2202.539560158293), (-3.4028234663852886E38), 7.78099346776938E7);
      boolean boolean0 = ellipse0.contains(1.0, 1573.31246461126, 3.141592653589793, 2859.115430796076);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(0.6666666865, 0.6666666865, 0.6666666865, 0.6666666865);
      boolean boolean0 = ellipse0.contains(1.0, 1.0, 0.18803093015184513, 0.6666666865);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.57, 1.57, 1.57, 1.57);
      ellipse0.setFrameFromCenter(1.8177029607441755E-9, 3.4446552189818807, 3.4446552189818807, 1344.138);
      boolean boolean0 = ellipse0.contains(1.57, 1.57, 3.4446552189818807, 2905.053851);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      ellipse0.setFrameFromCenter((-3.6206374758015887), 3.6206374758015887, 3.6206374758015887, 7.241274951603177);
      boolean boolean0 = ellipse0.contains(0.49087402082521137, 0.49087402082521137, 0.49087402082521137, 0.49087402082521137);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(13.98750403536, 13.98750403536, 13.98750403536, 13.98750403536);
      boolean boolean0 = ellipse0.contains(13.98750403536, (-1290.0), 13.98750403536, (-1290.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(13.98750403536, 13.98750403536, 13.98750403536, 13.98750403536);
      boolean boolean0 = ellipse0.contains(13.98750403536, 13.98750403536, (-310.3), (-310.3));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      boolean boolean0 = ellipse0.contains(0.6666666865348816, 0.6666666865348816, 0.0, 0.6666666865348816);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      boolean boolean0 = ellipse0.contains(1.0, 1.5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      boolean boolean0 = ellipse0.contains(199.7, 280.6280590805767);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse(1.0, 1.0, 1.0, 1.0);
      Ellipse ellipse1 = ellipse0.clone();
      assertEquals(1.0, ellipse1.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse ellipse0 = new Ellipse();
      IdentityTransform identityTransform0 = new IdentityTransform();
      AbstractEllipse.Iterator abstractEllipse_Iterator0 = new AbstractEllipse.Iterator(ellipse0, identityTransform0);
      int int0 = abstractEllipse_Iterator0.windingRule();
      assertFalse(abstractEllipse_Iterator0.isDone());
      assertEquals(1, int0);
  }
}
