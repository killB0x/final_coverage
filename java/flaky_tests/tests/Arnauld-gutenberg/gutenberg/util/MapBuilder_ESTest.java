/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 19:19:49 GMT 2022
 */

package gutenberg.util;

import org.junit.Test;
import static org.junit.Assert.*;
import gutenberg.util.MapBuilder;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MapBuilder_ESTest extends MapBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MapBuilder<Integer, Integer> mapBuilder0 = new MapBuilder<Integer, Integer>();
      Integer integer0 = new Integer((-2699));
      Integer integer1 = new Integer(1228);
      MapBuilder<Integer, Integer> mapBuilder1 = mapBuilder0.with(integer0, integer1);
      assertSame(mapBuilder1, mapBuilder0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MapBuilder<Integer, Integer> mapBuilder0 = new MapBuilder<Integer, Integer>();
      Integer integer0 = new Integer((-2699));
      MapBuilder<Integer, Integer> mapBuilder1 = mapBuilder0.with(integer0, integer0);
      Map<Integer, Integer> map0 = mapBuilder1.map();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MapBuilder<Integer, Integer> mapBuilder0 = MapBuilder.mapBuilder();
      assertNotNull(mapBuilder0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MapBuilder<Integer, Integer> mapBuilder0 = new MapBuilder<Integer, Integer>();
      Map<Integer, Integer> map0 = mapBuilder0.map();
      assertEquals(0, map0.size());
  }
}
