/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 05:05:05 GMT 2022
 */

package pythagoras.f;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.f.Point;
import pythagoras.f.Vector;
import pythagoras.f.XY;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractPoint_ESTest extends AbstractPoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Point point0 = new Point();
      point0.subtract((-1124.0F), (-1124.0F), point0);
      point0.hashCode();
      assertEquals(1124.0F, point0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = new Point((-1635.1095F), (-901.0F));
      boolean boolean0 = point1.equals(point0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtract((XY) point0, point0);
      assertEquals(0.0F, point1.y, 0.01F);
      assertEquals(0.0F, point1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtract(0.0F, 0.0F, point0);
      assertEquals(0.0F, point1.y, 0.01F);
      assertEquals(0.0F, point1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point point0 = new Point((-901.0F), 0.0F);
      Point point1 = point0.subtract((-3.4028235E38F), 1664.6F);
      assertEquals(3.4028235E38F, point1.x, 0.01F);
      assertEquals((-1664.6F), point1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtract((-62.246887F), (-62.246887F));
      assertEquals(62.246887F, point1.x, 0.01F);
      assertEquals(62.246887F, point1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtract((-1124.0F), (-1124.0F), point0);
      Point point2 = point0.rotate((-3087.733F));
      point2.subtract((XY) point0, point0);
      point0.rotate(10.0F, point1);
      assertEquals((-50.05652F), point1.x, 0.01F);
      assertEquals((-50.05652F), point0.x(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.rotate((-1.0F), point0);
      assertEquals(0.0F, point1.x, 0.01F);
      assertEquals(0.0F, point1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point point0 = new Point();
      Vector vector0 = new Vector(0.0F, 0.0F);
      Point point1 = new Point(vector0);
      Point point2 = point0.subtract((-1124.0F), (-1124.0F), point1);
      point2.subtract((XY) point0, point0);
      point0.rotate(10.0F, point2);
      assertEquals(1124.0F, point0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point point0 = new Point(0.0F, 0.0F);
      point0.subtractLocal(0.0F, 996.7F);
      point0.rotate(1869.4F);
      assertEquals((-996.7F), point0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Point point0 = new Point((-2231.113F), 1.0F);
      Point point1 = point0.rotate(1668.12F);
      assertEquals((-147.48532F), point1.y, 0.01F);
      assertEquals(2226.2332F, point1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector vector0 = new Vector(1.0F, 1.0F);
      Point point0 = new Point(vector0);
      Point point1 = point0.addLocal(1.0F, (-2132.632F));
      point1.mult((-2132.632F), point0);
      assertEquals(4545987.0F, point1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.mult(0.0F, point0);
      assertEquals(0.0F, point1.x, 0.01F);
      assertEquals(0.0F, point1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point point0 = new Point((-901.0F), 0.0F);
      point0.mult((-2697.6804F), point0);
      assertEquals(2430610.0F, point0.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.subtract((-1124.0F), (-1124.0F), point0);
      Point point2 = point0.rotate((-3087.733F));
      point2.mult(846.77875F, point1);
      assertEquals((-1272195.8F), point1.y, 0.01F);
      assertEquals((-439642.72F), point0.x(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point point0 = new Point((-2073.212F), 0.0F);
      Point point1 = point0.subtract(1109.6274F, 1109.6274F, point0);
      Point point2 = point1.mult(175.9867F);
      assertEquals((-1109.6274F), point0.y, 0.01F);
      assertEquals((-195279.67F), point2.y(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Point point0 = new Point((-2231.113F), 1.0F);
      Point point1 = point0.mult(0.0F);
      assertEquals(0.0F, point1.y, 0.01F);
      assertEquals(-0.0F, point1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point point0 = new Point();
      float float0 = point0.distanceSq((-3087.733F), 1051.1239F);
      assertEquals(1.0638956E7F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point point0 = new Point(0.0F, 0.0F);
      float float0 = point0.distance((XY) point0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Point point0 = new Point(0.0F, 0.0F);
      Point point1 = point0.subtract(996.7F, (-1153.0842F));
      float float0 = point0.distance((XY) point1);
      assertEquals(1524.1438F, float0, 0.01F);
      assertEquals(1153.0842F, point1.y, 0.01F);
      assertEquals((-996.7F), point1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector vector0 = new Vector(1.0F, 1.0F);
      Point point0 = new Point(vector0);
      float float0 = point0.distance((-2132.632F), 0.0F);
      assertEquals(2133.6323F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Point point0 = new Point();
      float float0 = point0.direction(point0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point point0 = new Point(0.0F, 0.0F);
      Point point1 = new Point((-1.0F), 145.90015F);
      float float0 = point0.direction(point1);
      assertEquals(1.5776502F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Point point0 = new Point(2091.634F, 1.0F);
      Point point1 = point0.add(2091.634F, 1.0F);
      Vector vector0 = new Vector(point0);
      float float0 = point1.direction(vector0);
      assertEquals((-3.1411145F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector vector0 = new Vector(1.0F, 1.0F);
      Point point0 = new Point(vector0);
      Point point1 = point0.addLocal(1.0F, (-2132.632F));
      point1.clone();
      assertEquals(2.0F, point0.x, 0.01F);
      assertEquals((-2131.632F), point0.y(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector vector0 = new Vector(1.0F, 1.0F);
      Point point0 = new Point(vector0);
      Point point1 = point0.clone();
      assertNotSame(point0, point1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Point point0 = new Point((-2231.113F), 1.0F);
      Point point1 = point0.clone();
      point1.rotate((-1876.8766F), point0);
      float float0 = point1.distanceSq((XY) point0);
      assertEquals(496.85208F, point0.x, 0.01F);
      assertEquals(1.2177149E7F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector vector0 = new Vector(1.0F, 1.0F);
      Point point0 = new Point(vector0);
      Point point1 = point0.addLocal(1.0F, (-2132.632F));
      point1.add((XY) vector0, point1);
      assertEquals((-2130.632F), point1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Point point0 = new Point((-1.0F), (-1.0F));
      Vector vector0 = new Vector((-1.0F), 1559.733F);
      point0.add((XY) vector0, point0);
      assertEquals(1558.733F, point0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Point point0 = new Point();
      point0.add(1037.4F, 0.0F, point0);
      assertEquals(1037.4F, point0.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector vector0 = new Vector(1.0F, 1.0F);
      Point point0 = new Point(vector0);
      point0.addLocal(1.0F, (-2132.632F));
      point0.add(1.0F, 0.0F);
      assertEquals((-2131.632F), point0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.add(0.0F, 0.0F);
      assertTrue(point1.equals((Object)point0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.add((-4192.702F), -0.0F);
      assertEquals(0.0F, point1.y, 0.01F);
      assertEquals((-4192.702F), point1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.subtract(0.0F, 0.0F, (Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Point point0 = new Point(2675.845F, 2675.845F);
      // Undeclared exception!
      try { 
        point0.mult(2675.845F, (Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.distanceSq((XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.add((XY) point0, (Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.add(0.0F, 0.0F, (Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = new Point();
      point0.add(0.0F, 587.15F, point1);
      boolean boolean0 = point0.equals(point1);
      assertEquals(587.15F, point1.y, 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = new Point(point0);
      point0.add((-519.19434F), (-519.19434F), point1);
      boolean boolean0 = point0.equals(point1);
      assertEquals((-519.19434F), point1.x, 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Point point0 = new Point();
      Object object0 = new Object();
      boolean boolean0 = point0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Point point0 = new Point();
      boolean boolean0 = point0.equals(point0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = new Point(point0);
      boolean boolean0 = point1.equals(point0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.distance((XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Point point0 = new Point();
      Vector vector0 = new Vector(0.0F, 0.0F);
      Point point1 = point0.add((XY) vector0, point0);
      assertEquals(0.0F, point1.x, 0.01F);
      assertEquals(0.0F, point1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Point point0 = new Point();
      String string0 = point0.toString();
      assertEquals("+0.0+0.0", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.rotate(2678.0125F);
      assertEquals(0.0F, point1.x, 0.01F);
      assertTrue(point1.equals((Object)point0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.rotate(2644.184F, (Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.direction((XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Point point0 = new Point();
      float float0 = point0.distanceSq((XY) point0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Point point0 = new Point();
      Point point1 = point0.clone();
      assertEquals(0.0F, point1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Point point0 = new Point(2678.0F, 2678.0F);
      Point point1 = point0.mult(2678.0F);
      assertEquals(7171684.0F, point1.x, 0.01F);
      assertEquals(7171684.0F, point1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Point point0 = new Point();
      // Undeclared exception!
      try { 
        point0.subtract((XY) null, point0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Point point0 = new Point(2678.0F, 2678.0F);
      Point point1 = point0.subtract(2678.0F, 2678.0F);
      assertEquals(0.0F, point1.y, 0.01F);
      assertEquals(0.0F, point1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Point point0 = new Point();
      float float0 = point0.distanceSq(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Point point0 = new Point(2678.0F, 2678.0F);
      float float0 = point0.distance(2678.0F, 2678.0F);
      assertEquals(0.0F, float0, 0.01F);
  }
}
