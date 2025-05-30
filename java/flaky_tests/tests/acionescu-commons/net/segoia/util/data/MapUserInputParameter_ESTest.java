/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:22:22 GMT 2022
 */

package net.segoia.util.data;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import net.segoia.util.data.MapUserInputParameter;
import net.segoia.util.data.UserInputParameter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MapUserInputParameter_ESTest extends MapUserInputParameter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MapUserInputParameter mapUserInputParameter0 = new MapUserInputParameter();
      mapUserInputParameter0.setNestedInputParameters((List<UserInputParameter>) null);
      List<UserInputParameter> list0 = mapUserInputParameter0.getNestedInputParameters();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MapUserInputParameter mapUserInputParameter0 = new MapUserInputParameter();
      LinkedList<UserInputParameter> linkedList0 = new LinkedList<UserInputParameter>();
      linkedList0.add((UserInputParameter) mapUserInputParameter0);
      mapUserInputParameter0.setNestedInputParameters(linkedList0);
      List<UserInputParameter> list0 = mapUserInputParameter0.getNestedInputParameters();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MapUserInputParameter mapUserInputParameter0 = new MapUserInputParameter();
      List<UserInputParameter> list0 = mapUserInputParameter0.getNestedInputParameters();
      assertEquals(0, list0.size());
  }
}
