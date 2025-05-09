/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 04:55:36 GMT 2022
 */

package pythagoras.d;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.d.IVector;
import pythagoras.d.MathUtil;
import pythagoras.d.Vector;
import pythagoras.d.Vectors;
import pythagoras.d.XY;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Vectors_ESTest extends Vectors_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Vectors.vectorToString(1416.5, 3561.106);
      assertEquals("+1416.5+3561.106", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Vectors.isEpsilonZero(1.0, 1.0, 1.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Vectors.isZero(0.0, Double.NaN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = Vectors.isZero((-1690.9298), (-1690.9298));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = Vectors.lengthSq(3033.358547, 0.0);
      assertEquals(9201264.07465795, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector vector0 = new Vector();
      Vectors.transform(0.0, 0.0, -0.0, (-4492.909125627458), (-4492.909125627458), vector0);
      assertEquals(-0.0, vector0.x, 0.01);
      assertEquals(-0.0, vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector vector0 = Vectors.fromPolar(0.0, 0.0);
      Vectors.transform(0.0, 2456.621, Double.NaN, 4824.51, (-1.0), vector0);
      assertEquals(Double.NaN, vector0.x, 0.01);
      assertEquals(6403658.920489699, vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector vector0 = Vectors.fromPolar((-1.0), (-347.7));
      Vectors.transform((-1.0), (-892.5734911763714), 892.573491221, 9.999999747378752E-6, 9.999999747378752E-6, vector0);
      assertEquals((-0.008925734785834392), vector0.y, 0.01);
      assertEquals((-884.6066170058582), vector0.x(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector vector0 = (Vector)Vectors.UNIT_X;
      assertEquals(0.0, vector0.x, 0.01);
      
      Vectors.transform(4.402209088602984E9, 610.5959438925651, 3033.358547, 1707.1594, 0.0, 4223.21, vector0);
      assertEquals(4.402209088602984E9, vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector vector0 = new Vector();
      Vector vector1 = Vectors.transform(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, vector0);
      assertEquals(0.0, vector1.y, 0.01);
      assertEquals(0.0, vector1.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector vector0 = new Vector(3489.19795826177, (-2175));
      Vectors.transform((-2520.1682467), (double) (-2175), (-1.0), 278.61, (-2520.1682467), 3489.19795826177, vector0);
      assertEquals(1.4274731837434284E7, vector0.x, 0.01);
      assertEquals((-3.4485163589354473E8), vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector vector0 = Vectors.fromPolar(0.0, 0.0);
      Vectors.transform(0.0, 2866.2, Double.NaN, 0.0, 0.0, 0.0, 0.0, vector0);
      assertEquals(Double.NaN, vector0.x, 0.01);
      assertEquals(0.0, vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector vector0 = (Vector)Vectors.UNIT_X;
      assertEquals(1.0, vector0.x, 0.01);
      
      Vectors.transform(3033.358547, 0.0, 0.0, 0.0, 1707.1594, 0.0, 9.999999747378752E-6, vector0);
      assertEquals(9.999999747378752E-6, vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector vector0 = (Vector)Vectors.MAX_VALUE;
      assertEquals(3.4028234663852886E38, vector0.x, 0.01);
      
      Vectors.transform(3.834391083367674E76, 1.5920224234766225E77, 3.834391083367674E76, 3.834391083367674E76, 1.5920224234766225E77, 1.5920224234766225E77, 1.5920224234766225E77, vector0);
      assertEquals(6.216002882799521E153, vector0.x(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vectors vectors0 = new Vectors();
      Vector vector0 = new Vector(vectors0.ZERO);
      Vectors.transform(2131.7, (-945.772), (-1.0), (-984.4273), 0.0, (-3312.12816), 0.0, vector0);
      assertEquals(931043.7763756, vector0.y, 0.01);
      assertEquals((-5443.82816), vector0.x(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vectors vectors0 = new Vectors();
      Vector vector0 = new Vector(vectors0.ZERO);
      Vectors.transform(493.0, 1659.9549884135506, 0.0, (-2239.95916), 0.0, 0.0, 1.5707963267948966, (-2239.95916), vector0);
      assertEquals(1.5707963267948966, vector0.x, 0.01);
      assertEquals((-2239.95916), vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector vector0 = new Vector();
      Vectors.transform(6.283185307179586, 0.0, 1002.470553428, 6.283185307179586, 1002.470553428, 0.0, 0.0, (-2051.15424), vector0);
      assertEquals(37524.7969043019, vector0.y, 0.01);
      assertEquals(37524.7969043019, vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector vector0 = new Vector();
      Vectors.transform(1002.470553428, 0.0, (-2051.15424), 0.0, 0.0, (-3337.967026676422), (-2051.15424), 0.0, vector0);
      assertEquals(6.86359827023338E9, vector0.x, 0.01);
      assertEquals(6.86359827023338E9, vector0.x(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector vector0 = new Vector(3368.963431638635, (-1.0));
      Vectors.transform(1661.45, (-2176.825650789), 6.283185307179586, 6.283185307179586, 0.0, (-2176.825650789), 0.0, 0.0, vector0);
      assertEquals((-2.2724314477717012E7), vector0.x, 0.01);
      assertEquals(2.977331286026677E7, vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = Vectors.lengthSq(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = Vectors.length(0.0, 3561.106);
      assertEquals(3561.106, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = Vectors.isEpsilonZero(-0.0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector vector0 = new Vector((-1040.8777627623), 1.0);
      Vectors.inverseTransform((-292.0402), 0.0, 2515.23693207, 2515.23693207, 0.0, vector0);
      assertEquals((-0.11610842552302045), vector0.x, 0.01);
      assertEquals(0.0, vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector vector0 = Vectors.fromPolar(1303.078731197, (-2755.2397080642));
      Vectors.inverseTransform(Double.NaN, Double.NaN, (-183.0), Double.NaN, -0.0, vector0);
      Vectors.from(vector0, vector0);
      assertEquals(Double.NaN, vector0.x, 0.01);
      assertEquals(Double.NaN, vector0.x(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector vector0 = Vectors.fromPolar(0.0, 0.0);
      Vector vector1 = Vectors.inverseTransform(2866.2, 0.0, 0.0, 1.0, 2866.2, vector0);
      Vectors.from(vector1, vector1);
      assertEquals(Double.POSITIVE_INFINITY, vector0.x, 0.01);
      assertEquals((-2510.7837996527282), vector0.y(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector vector0 = (Vector)Vectors.MIN_VALUE;
      Vector vector1 = Vectors.from(vector0, vector0);
      Vector vector2 = Vectors.from(vector1, vector0);
      assertEquals(0.0, vector1.y, 0.01);
      assertEquals(0.0, vector1.x, 0.01);
      assertTrue(vector2.equals((Object)vector0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector vector0 = (Vector)Vectors.UNIT_X;
      boolean boolean0 = Vectors.epsilonEquals((IVector) vector0, (IVector) vector0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MathUtil.TO_STRING_DECIMAL_PLACES = 2147013143;
      // Undeclared exception!
      Vectors.vectorToString(2147013143, 2147013143);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.transform(4280.9, 4280.9, 4280.9, 4280.9, 4280.9, 4280.9, (Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.inverseTransform((-1267.9932499553738), (-1267.9932499553738), (-1267.9932499553738), (-1267.9932499553738), (-1267.9932499553738), (Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.from((XY) null, (XY) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vectors vectors0 = new Vectors();
      // Undeclared exception!
      try { 
        Vectors.epsilonEquals((IVector) null, vectors0.ZERO, 493.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vectors vectors0 = new Vectors();
      // Undeclared exception!
      try { 
        Vectors.epsilonEquals(vectors0.UNIT_X, (IVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = Vectors.isEpsilonZero(1625.892, 6668922.555516552, 1.5707963267948966);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector vector0 = Vectors.fromPolar(0.0, (-2326.1398478));
      Vectors.transform(3673.945809968, 0.0, 661.9908364196, 0.0, 0.0, (-2326.1398478), vector0);
      assertEquals((-5.657447663680457E9), vector0.x, 0.01);
      assertEquals((-5.657447663680457E9), vector0.x(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector vector0 = new Vector();
      boolean boolean0 = Vectors.epsilonEquals((IVector) vector0, (IVector) vector0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector vector0 = Vectors.fromPolar(0.0, (-2326.1398478));
      boolean boolean0 = Vectors.epsilonEquals((IVector) vector0, (IVector) vector0, (-0.0069818458803619365));
      assertEquals(0.0, vector0.x, 0.01);
      assertEquals(-0.0, vector0.y, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Vectors.isEpsilonZero(0.0, (-1592.70931), 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = Vectors.isZero(0.0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = Vectors.isZero(0.0, 1.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = Vectors.isZero(1.0, 1.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vectors vectors0 = new Vectors();
      boolean boolean0 = Vectors.epsilonEquals(vectors0.ZERO, vectors0.UNIT_Y);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.transform((-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double double0 = Vectors.length(0.0, -0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.transform((-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (-448.149111213704), (Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector vector0 = Vectors.fromPolar((-5214.40062894779), (-5214.40062894779));
      assertEquals((-4172.537395948325), vector0.x, 0.01);
      assertEquals((-3127.2840610638304), vector0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        Vectors.transform(0.0, 0.0, 0.0, 0.0, 0.0, (Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("pythagoras.d.Vectors", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = Vectors.isEpsilonZero(3.834391083367674E76, 1.5920224234766225E77);
      assertFalse(boolean0);
  }
}
