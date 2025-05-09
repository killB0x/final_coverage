/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:33:33 GMT 2022
 */

package ch.hsr.geohash.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.hsr.geohash.WGS84Point;
import ch.hsr.geohash.util.VincentyGeodesy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VincentyGeodesy_ESTest extends VincentyGeodesy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point(0.0, 0.0);
      WGS84Point wGS84Point1 = VincentyGeodesy.moveInDirection(wGS84Point0, 360.0, 360.0);
      assertEquals(0.0032557301019291865, wGS84Point1.getLatitude(), 0.01);
      assertEquals(4.952536942882418E-18, wGS84Point1.getLongitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point(0.0, 0.0);
      WGS84Point wGS84Point1 = VincentyGeodesy.moveInDirection(wGS84Point0, 0.0, 0.0);
      assertTrue(wGS84Point1.equals((Object)wGS84Point0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        VincentyGeodesy.moveInDirection((WGS84Point) null, 1.0E-12, 0.0174532925199433);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.hsr.geohash.util.VincentyGeodesy", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point(0.0, 0.0);
      // Undeclared exception!
      try { 
        VincentyGeodesy.distanceInMeters((WGS84Point) null, wGS84Point0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.hsr.geohash.util.VincentyGeodesy", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point((-0.3954179453528465), 180.0);
      WGS84Point wGS84Point1 = new WGS84Point((-0.3954179453528465), (-0.3954179453528465));
      double double0 = VincentyGeodesy.distanceInMeters(wGS84Point0, wGS84Point1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point((-0.3954179453528465), 180.0);
      WGS84Point wGS84Point1 = new WGS84Point(0.020995935310670788, Double.NaN);
      double double0 = VincentyGeodesy.distanceInMeters(wGS84Point0, wGS84Point1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point((-0.3954179453528465), 180.0);
      double double0 = VincentyGeodesy.distanceInMeters(wGS84Point0, wGS84Point0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point(68.35793156623821, 68.35793156623821);
      // Undeclared exception!
      try { 
        VincentyGeodesy.moveInDirection(wGS84Point0, 68.35793156623821, 4.0408299984087055E13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The supplied coordinates (-20.225201202453576,-418352.8416427545) are out of range.
         //
         verifyException("ch.hsr.geohash.WGS84Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point(90.0, 179.99999999844022);
      WGS84Point wGS84Point1 = VincentyGeodesy.moveInDirection(wGS84Point0, 90.0, 90.0);
      assertEquals((-90.00000000311957), wGS84Point1.getLongitude(), 0.01);
      assertEquals((-89.99919422693343), wGS84Point1.getLatitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point(90.0, 0.0);
      // Undeclared exception!
      try { 
        VincentyGeodesy.moveInDirection(wGS84Point0, 1970.602126860638, 180.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // direction must be in (0,360)
         //
         verifyException("ch.hsr.geohash.util.VincentyGeodesy", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point(0.0174532925199433, 0.0174532925199433);
      WGS84Point wGS84Point1 = VincentyGeodesy.moveInDirection(wGS84Point0, 0.0174532925199433, 0.0174532925199433);
      double double0 = VincentyGeodesy.distanceInMeters(wGS84Point1, wGS84Point0);
      assertEquals(0.017453243259532934, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WGS84Point wGS84Point0 = new WGS84Point(1.0, 1.0);
      // Undeclared exception!
      try { 
        VincentyGeodesy.moveInDirection(wGS84Point0, (-367.0), 90.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // direction must be in (0,360)
         //
         verifyException("ch.hsr.geohash.util.VincentyGeodesy", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VincentyGeodesy vincentyGeodesy0 = new VincentyGeodesy();
      assertEquals(0.0174532925199433, VincentyGeodesy.degToRad, 0.01);
  }
}
