/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 03:40:07 GMT 2022
 */

package com.contentful.java.cda.rich;

import org.junit.Test;
import static org.junit.Assert.*;
import com.contentful.java.cda.rich.CDARichList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CDARichList_ESTest extends CDARichList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CDARichList cDARichList0 = new CDARichList((CharSequence) null);
      CharSequence charSequence0 = cDARichList0.getDecoration();
      assertNull(charSequence0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CDARichList cDARichList0 = new CDARichList("");
      CharSequence charSequence0 = cDARichList0.getDecoration();
      assertEquals("", charSequence0);
  }
}
