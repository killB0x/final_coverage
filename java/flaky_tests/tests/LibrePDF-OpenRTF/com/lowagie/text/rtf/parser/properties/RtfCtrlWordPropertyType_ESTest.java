/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 07:29:51 GMT 2022
 */

package com.lowagie.text.rtf.parser.properties;

import org.junit.Test;
import static org.junit.Assert.*;
import com.lowagie.text.rtf.parser.properties.RtfCtrlWordPropertyType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RtfCtrlWordPropertyType_ESTest extends RtfCtrlWordPropertyType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RtfCtrlWordPropertyType rtfCtrlWordPropertyType0 = new RtfCtrlWordPropertyType();
      assertEquals((-1), RtfCtrlWordPropertyType.UNIDENTIFIED);
  }
}
