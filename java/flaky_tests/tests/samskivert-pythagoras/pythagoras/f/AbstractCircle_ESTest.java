/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 04:50:02 GMT 2022
 */

package pythagoras.f;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.f.Circle;
import pythagoras.f.ICircle;
import pythagoras.f.Point;
import pythagoras.f.Vector;
import pythagoras.f.XY;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractCircle_ESTest extends AbstractCircle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Circle circle0 = new Circle((-1.0F), (-1.0F), (-1.0F));
      circle0.y = 1.0F;
      circle0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = new Circle(0.0F, 0.0F, 1.0E-5F);
      boolean boolean0 = circle0.equals(circle1);
      assertFalse(boolean0);
      assertFalse(circle1.equals((Object)circle0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Circle circle0 = new Circle(0.0F, (-538.4F), 1009.796F);
      Circle circle1 = new Circle();
      boolean boolean0 = circle0.equals(circle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = circle0.clone();
      circle0.offset(794.5758F, 57.295776F, circle0);
      boolean boolean0 = circle1.equals(circle0);
      assertEquals(57.295776F, circle0.y, 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Circle circle0 = new Circle();
      boolean boolean0 = circle0.contains((-1293.0951F), 0.0F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector vector0 = new Vector();
      Circle circle0 = new Circle(vector0, (-2707.144F));
      boolean boolean0 = circle0.contains(0.0F, (-1.0F));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Circle circle0 = new Circle((-2241.8494F), 0.0F, 0.0F);
      boolean boolean0 = circle0.contains((-2241.8494F), 0.0F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Circle circle0 = new Circle();
      Vector vector0 = new Vector(0.0F, 73.9F);
      boolean boolean0 = circle0.contains((XY) vector0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Circle circle0 = new Circle();
      circle0.y = 1.0F;
      Circle circle1 = new Circle();
      boolean boolean0 = circle0.intersects(circle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Circle circle0 = new Circle();
      circle0.offset(0.0F, (-1.0F), circle0);
      assertEquals((-1.0F), circle0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = circle0.set(0.0F, 737.28F, 737.28F);
      circle1.offset(794.5758F, 57.295776F, circle0);
      assertEquals(794.5758F, circle1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Circle circle0 = new Circle((-171.34073F), (-171.34073F), 0.0F);
      circle0.set(0.0F, 0.0F, (-2815.54F));
      circle0.offset((-1.0F), 0.0F, circle0);
      assertEquals(0.0F, circle0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = circle0.offset(1.0E-5F, (-1.0F));
      assertEquals(1.0E-5F, circle1.x, 0.01F);
      assertEquals((-1.0F), circle1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Circle circle0 = new Circle();
      circle0.set(0.0F, (-538.4F), 1923.191F);
      Circle circle1 = circle0.offset((-2135.5F), (-4683.057F));
      assertEquals((-5221.457F), circle1.y, 0.01F);
      assertEquals((-2135.5F), circle1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Circle circle0 = new Circle((-1.0F), (-1.0F), (-1.0F));
      Circle circle1 = circle0.offset((-1.0F), 254.0839F);
      assertEquals(253.0839F, circle1.y, 0.01F);
      assertEquals((-2.0F), circle1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Circle circle0 = new Circle((-2063.933F), (-2063.933F), 0.0F);
      Circle circle1 = circle0.clone();
      assertEquals((-2063.933F), circle1.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = circle0.set(0.0F, 0.0F, 0.0F);
      circle1.x = 1.0F;
      Circle circle2 = circle1.clone();
      assertTrue(circle2.equals((Object)circle1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = circle0.offset((-1001.0F), 2195.139F);
      Circle circle2 = circle1.clone();
      assertEquals((-1001.0F), circle2.x, 0.01F);
      assertEquals(2195.139F, circle2.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector vector0 = new Vector();
      Circle circle0 = new Circle(vector0, 452.89F);
      Circle circle1 = circle0.clone();
      assertTrue(circle1.equals((Object)circle0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector vector0 = new Vector();
      Circle circle0 = new Circle(vector0, (-2707.144F));
      Circle circle1 = circle0.clone();
      assertEquals(0.0F, circle1.x(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Circle circle0 = new Circle();
      // Undeclared exception!
      try { 
        circle0.intersects((ICircle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractCircle", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Circle circle0 = new Circle();
      // Undeclared exception!
      try { 
        circle0.contains((XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractCircle", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = new Circle(0.0F, 6.2831855F, 0.0F);
      boolean boolean0 = circle1.equals(circle0);
      assertFalse(boolean0);
      assertFalse(circle0.equals((Object)circle1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Circle circle0 = new Circle();
      Point point0 = new Point(0.0F, 0.0F);
      Circle circle1 = new Circle(point0, (-754.0F));
      boolean boolean0 = circle0.equals(circle1);
      assertFalse(boolean0);
      assertFalse(circle1.equals((Object)circle0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = circle0.clone();
      circle1.offset(794.5758F, 57.295776F, circle1);
      boolean boolean0 = circle1.equals(circle0);
      assertEquals(794.5758F, circle1.x, 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Circle circle0 = new Circle();
      Object object0 = new Object();
      boolean boolean0 = circle0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Circle circle0 = new Circle();
      boolean boolean0 = circle0.equals(circle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Point point0 = new Point(0.0F, 0.0F);
      Circle circle0 = new Circle(point0, (-754.0F));
      boolean boolean0 = circle0.contains((XY) point0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Point point0 = new Point();
      Circle circle0 = new Circle(0.0F, 0.0F, 0.0F);
      boolean boolean0 = circle0.contains((XY) point0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = new Circle(0.0F, 0.0F, 1.0E-5F);
      boolean boolean0 = circle0.intersects(circle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Circle circle0 = new Circle();
      boolean boolean0 = circle0.intersects(circle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = circle0.clone();
      boolean boolean0 = circle0.equals(circle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Circle circle0 = new Circle();
      // Undeclared exception!
      try { 
        circle0.offset(0.0F, 0.0F, (Circle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.f.AbstractCircle", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Circle circle0 = new Circle();
      Circle circle1 = circle0.offset(0.0F, 0.0F);
      assertTrue(circle1.equals((Object)circle0));
  }
}
