/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 23 03:32:30 GMT 2022
 */

package io.teknek.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.teknek.util.MapBuilder;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MapBuilder_ESTest extends MapBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Map map0 = MapBuilder.makeMap(objectArray0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        MapBuilder.makeMap((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.teknek.util.MapBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        MapBuilder.makeMap(objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 3
         //
         verifyException("io.teknek.util.MapBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Map map0 = MapBuilder.makeMap(objectArray0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MapBuilder mapBuilder0 = new MapBuilder();
  }
}
