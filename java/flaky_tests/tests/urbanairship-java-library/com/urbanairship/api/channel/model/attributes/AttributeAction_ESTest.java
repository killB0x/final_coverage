/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 19:24:10 GMT 2022
 */

package com.urbanairship.api.channel.model.attributes;

import org.junit.Test;
import static org.junit.Assert.*;
import com.urbanairship.api.channel.model.attributes.AttributeAction;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AttributeAction_ESTest extends AttributeAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Optional<AttributeAction> optional0 = AttributeAction.find("set");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AttributeAction[] attributeActionArray0 = AttributeAction.values();
      assertEquals(2, attributeActionArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AttributeAction attributeAction0 = AttributeAction.valueOf("SET");
      assertEquals(AttributeAction.SET, attributeAction0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AttributeAction attributeAction0 = AttributeAction.REMOVE;
      String string0 = attributeAction0.getIdentifier();
      assertEquals("remove", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Optional<AttributeAction> optional0 = AttributeAction.find("remove");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Optional<AttributeAction> optional0 = AttributeAction.find("");
      assertNotNull(optional0);
  }
}
