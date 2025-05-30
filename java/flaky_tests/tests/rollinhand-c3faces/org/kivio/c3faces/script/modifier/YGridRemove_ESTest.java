/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 20:49:10 GMT 2022
 */

package org.kivio.c3faces.script.modifier;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.kivio.c3faces.listener.change.Change;
import org.kivio.c3faces.script.Property;
import org.kivio.c3faces.script.modifier.YGridRemove;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class YGridRemove_ESTest extends YGridRemove_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YGridRemove yGridRemove0 = new YGridRemove();
      Boolean boolean0 = Boolean.TRUE;
      Change<Object> change0 = new Change<Object>("yGridRemove", boolean0);
      yGridRemove0.onChange(change0);
      boolean boolean1 = yGridRemove0.isMethod();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YGridRemove yGridRemove0 = new YGridRemove();
      boolean boolean0 = yGridRemove0.isMethod();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YGridRemove yGridRemove0 = new YGridRemove();
      String string0 = yGridRemove0.getMethodName();
      assertEquals("remove", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      YGridRemove yGridRemove0 = new YGridRemove();
      Property property0 = yGridRemove0.getModificationProperty();
      assertEquals("", property0.getPrefix());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      YGridRemove yGridRemove0 = new YGridRemove();
      List<String> list0 = yGridRemove0.getFields();
      assertFalse(list0.isEmpty());
  }
}
