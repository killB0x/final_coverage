/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 08:22:03 GMT 2022
 */

package edu.cornell.lassp.houle.RngPack;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.cornell.lassp.houle.RngPack.Ranecu;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Ranecu_ESTest extends Ranecu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu(0L);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertNotNull(ranecu0);
      assertEquals(0L, ranecu0.getSeed());
      
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        ranecu0.raw(doubleArray0, 529);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("edu.cornell.lassp.houle.RngPack.Ranecu", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu(1L);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertNotNull(ranecu0);
      assertEquals(1L, ranecu0.getSeed());
      
      double[] doubleArray0 = new double[8];
      ranecu0.raw(doubleArray0);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertArrayEquals(new double[] {0.999981038519931, 0.2289399092087874, 0.020523229707628703, 0.128248761178343, 0.6959641099612566, 0.1709857755379111, 0.7507066670530025, 0.755316472710449}, doubleArray0, 0.01);
      assertEquals(8, doubleArray0.length);
      assertEquals(525453832L, ranecu0.getSeed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu();
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertNotNull(ranecu0);
      assertEquals(26510685690105L, ranecu0.getSeed());
      
      ranecu0.iseed2 = (-1375);
      assertEquals(26510685620840L, ranecu0.getSeed());
      
      ranecu0.iseed2 = 0;
      assertEquals(26510685622215L, ranecu0.getSeed());
      
      double double0 = ranecu0.powlaw(2447.79444, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(1060798574487311010L, ranecu0.getSeed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu(1L);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertNotNull(ranecu0);
      assertEquals(1L, ranecu0.getSeed());
      
      double double0 = ranecu0.raw();
      assertEquals(0.999981038519931, double0, 0.01);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(40692L, ranecu0.getSeed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      assertNotNull(mockDate0);
      
      Ranecu ranecu0 = new Ranecu(mockDate0);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertNotNull(ranecu0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", mockDate0.toString());
      assertEquals(839877416L, ranecu0.getSeed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      assertNotNull(mockDate0);
      
      Ranecu ranecu0 = new Ranecu(mockDate0);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertNotNull(ranecu0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", mockDate0.toString());
      assertEquals(0L, ranecu0.getSeed());
      
      long long0 = ranecu0.getSeed();
      assertEquals(0L, long0);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", mockDate0.toString());
      assertEquals(0L, ranecu0.getSeed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu();
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertNotNull(ranecu0);
      assertEquals(26510685690105L, ranecu0.getSeed());
      
      ranecu0.iseed1 = 0;
      assertEquals(67890L, ranecu0.getSeed());
      
      ranecu0.iseed1 = (-833);
      assertEquals((-1788853810061L), ranecu0.getSeed());
      
      long long0 = ranecu0.getSeed();
      assertEquals((-1788853810061L), long0);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals((-1788853810061L), ranecu0.getSeed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu();
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertNotNull(ranecu0);
      assertEquals(26510685690105L, ranecu0.getSeed());
      
      // Undeclared exception!
      try { 
        ranecu0.raw((double[]) null, 1007);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.cornell.lassp.houle.RngPack.Ranecu", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu(40014, 40014);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertEquals(12345, Ranecu.DEFSEED1);
      assertNotNull(ranecu0);
      assertEquals(85929410691072L, ranecu0.getSeed());
      
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        ranecu0.raw(doubleArray0, 40014);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("edu.cornell.lassp.houle.RngPack.Ranecu", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu(1, (-239));
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertNotNull(ranecu0);
      assertEquals(2147483408L, ranecu0.getSeed());
      
      double[] doubleArray0 = new double[2];
      ranecu0.raw(doubleArray0, (-1));
      assertEquals(12345, Ranecu.DEFSEED1);
      assertEquals(67890, Ranecu.DEFSEED2);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2, doubleArray0.length);
      assertEquals(2147483408L, ranecu0.getSeed());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu();
      double double0 = ranecu0.gaussian();
      assertEquals(3277462142728421190L, ranecu0.getSeed());
      assertEquals(0.04893885748317255, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu((-1848), (-1848));
      double double0 = ranecu0.raw();
      assertEquals(4452888284932923660L, ranecu0.getSeed());
      assertEquals(5.835239003204E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ranecu ranecu0 = null;
      try {
        ranecu0 = new Ranecu((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.cornell.lassp.houle.RngPack.Ranecu", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu();
      long long0 = ranecu0.getSeed();
      assertEquals(26510685690105L, long0);
  }
}
