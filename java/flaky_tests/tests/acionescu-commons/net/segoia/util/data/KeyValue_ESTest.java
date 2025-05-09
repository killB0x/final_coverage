/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:29:30 GMT 2022
 */

package net.segoia.util.data;

import org.junit.Test;
import static org.junit.Assert.*;
import net.segoia.util.data.KeyValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KeyValue_ESTest extends KeyValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-1728));
      Integer integer1 = new Integer((-2934));
      KeyValue<Integer, Integer> keyValue0 = new KeyValue<Integer, Integer>(integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeyValue<Integer, Integer> keyValue0 = new KeyValue<Integer, Integer>();
      Integer integer0 = keyValue0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer((-1728));
      KeyValue<Integer, Integer> keyValue0 = new KeyValue<Integer, Integer>(integer0, integer0);
      keyValue0.setValue(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-1728));
      KeyValue<Integer, Integer> keyValue0 = new KeyValue<Integer, Integer>(integer0, integer0);
      keyValue0.setKey(integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KeyValue<Integer, Integer> keyValue0 = new KeyValue<Integer, Integer>();
      Integer integer0 = keyValue0.getKey();
      assertNull(integer0);
  }
}
