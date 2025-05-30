/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 22:17:58 GMT 2022
 */

package org.jivesoftware.smack.util.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.AbstractMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jivesoftware.smack.util.collections.DefaultMapEntry;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractKeyValue_ESTest extends AbstractKeyValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultMapEntry<Integer, Integer> defaultMapEntry0 = new DefaultMapEntry<Integer, Integer>((Integer) null, (Integer) null);
      Integer integer0 = new Integer((-1));
      defaultMapEntry0.value = integer0;
      String string0 = defaultMapEntry0.toString();
      assertEquals("null=-1", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(87);
      DefaultMapEntry<Integer, Integer> defaultMapEntry0 = new DefaultMapEntry<Integer, Integer>(integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>((Integer) null, (Integer) null);
      DefaultMapEntry<Integer, Integer> defaultMapEntry0 = new DefaultMapEntry<Integer, Integer>(abstractMap_SimpleEntry0);
      Integer integer0 = defaultMapEntry0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>((Integer) null, (Integer) null);
      DefaultMapEntry<Integer, Integer> defaultMapEntry0 = new DefaultMapEntry<Integer, Integer>(abstractMap_SimpleEntry0);
      Integer integer0 = defaultMapEntry0.getKey();
      assertNull(integer0);
  }
}
