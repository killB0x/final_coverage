/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 05:20:51 GMT 2022
 */

package pythagoras.i;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pythagoras.i.Points;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Points_ESTest extends Points_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Points.pointToString((-1), 3684);
      assertEquals("-1+3684", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Points.pointToString(50625, (-1311));
      assertEquals("+50625-1311", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Points.manhattanDistance((-8), (-8), (-8), (-8));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Points.distanceSq(0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Points.distanceSq(5477477, 0, (-143), 1173);
      assertEquals((-319289527), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Points.distance(0, (-1), 0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Points.pointToString(0, 0);
      assertEquals("+0+0", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Points.distance(1173, 2134, 0, 1353);
      assertEquals(1409, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Points points0 = new Points();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Points.manhattanDistance((-2734), 1617, 1173, 1111);
      assertEquals(4413, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Points.distanceSq(2134, 0, 1173, 2134);
      assertEquals(5477477, int0);
  }
}
