/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 20:51:04 GMT 2022
 */

package com.github.uuidcode.builder.html;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.uuidcode.builder.html.Span;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Span_ESTest extends Span_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Span span0 = Span.of();
      assertTrue(span0.getRequiresEndTag());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Span span0 = new Span();
      assertTrue(span0.getRequiresEndTag());
  }
}
