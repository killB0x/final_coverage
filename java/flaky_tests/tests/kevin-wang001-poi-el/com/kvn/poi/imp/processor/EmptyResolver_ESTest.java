/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 12:43:13 GMT 2022
 */

package com.kvn.poi.imp.processor;

import org.junit.Test;
import static org.junit.Assert.*;
import com.kvn.poi.imp.processor.EmptyResolver;
import java.lang.reflect.Field;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmptyResolver_ESTest extends EmptyResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyResolver.SINGLE emptyResolver_SINGLE0 = new EmptyResolver.SINGLE();
      boolean boolean0 = emptyResolver_SINGLE0.INSTANCE.support((Field) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyResolver.SINGLE emptyResolver_SINGLE0 = new EmptyResolver.SINGLE();
      Object object0 = emptyResolver_SINGLE0.INSTANCE.process();
      assertNull(object0);
  }
}
