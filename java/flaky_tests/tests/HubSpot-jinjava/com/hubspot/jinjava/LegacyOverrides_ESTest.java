/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:33:26 GMT 2022
 */

package com.hubspot.jinjava;

import org.junit.Test;
import static org.junit.Assert.*;
import com.hubspot.jinjava.LegacyOverrides;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LegacyOverrides_ESTest extends LegacyOverrides_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      legacyOverrides_Builder0.withWhitespaceRequiredWithinTokens(true);
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder0.build();
      boolean boolean0 = legacyOverrides0.isWhitespaceRequiredWithinTokens();
      assertFalse(legacyOverrides0.isUsePyishObjectMapper());
      assertTrue(boolean0);
      assertFalse(legacyOverrides0.isEvaluateMapKeys());
      assertFalse(legacyOverrides0.isIterateOverMapKeys());
      assertFalse(legacyOverrides0.isParseWhitespaceControlStrictly());
      assertFalse(legacyOverrides0.isUseNaturalOperatorPrecedence());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      legacyOverrides_Builder0.withUsePyishObjectMapper(true);
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder0.build();
      boolean boolean0 = legacyOverrides0.isUsePyishObjectMapper();
      assertFalse(legacyOverrides0.isIterateOverMapKeys());
      assertFalse(legacyOverrides0.isUseNaturalOperatorPrecedence());
      assertFalse(legacyOverrides0.isWhitespaceRequiredWithinTokens());
      assertFalse(legacyOverrides0.isParseWhitespaceControlStrictly());
      assertTrue(boolean0);
      assertFalse(legacyOverrides0.isEvaluateMapKeys());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      legacyOverrides_Builder0.withUseNaturalOperatorPrecedence(true);
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder0.build();
      boolean boolean0 = legacyOverrides0.isUseNaturalOperatorPrecedence();
      assertTrue(boolean0);
      assertFalse(legacyOverrides0.isParseWhitespaceControlStrictly());
      assertFalse(legacyOverrides0.isUsePyishObjectMapper());
      assertFalse(legacyOverrides0.isEvaluateMapKeys());
      assertFalse(legacyOverrides0.isIterateOverMapKeys());
      assertFalse(legacyOverrides0.isWhitespaceRequiredWithinTokens());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      legacyOverrides_Builder0.withParseWhitespaceControlStrictly(true);
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder0.build();
      boolean boolean0 = legacyOverrides0.isParseWhitespaceControlStrictly();
      assertFalse(legacyOverrides0.isEvaluateMapKeys());
      assertFalse(legacyOverrides0.isWhitespaceRequiredWithinTokens());
      assertFalse(legacyOverrides0.isIterateOverMapKeys());
      assertTrue(boolean0);
      assertFalse(legacyOverrides0.isUseNaturalOperatorPrecedence());
      assertFalse(legacyOverrides0.isUsePyishObjectMapper());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      LegacyOverrides.Builder legacyOverrides_Builder1 = legacyOverrides_Builder0.withIterateOverMapKeys(true);
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder1.build();
      boolean boolean0 = legacyOverrides0.isIterateOverMapKeys();
      assertFalse(legacyOverrides0.isEvaluateMapKeys());
      assertFalse(legacyOverrides0.isUseNaturalOperatorPrecedence());
      assertFalse(legacyOverrides0.isUsePyishObjectMapper());
      assertTrue(boolean0);
      assertFalse(legacyOverrides0.isParseWhitespaceControlStrictly());
      assertFalse(legacyOverrides0.isWhitespaceRequiredWithinTokens());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      legacyOverrides_Builder0.withEvaluateMapKeys(true);
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder0.build();
      boolean boolean0 = legacyOverrides0.isEvaluateMapKeys();
      assertFalse(legacyOverrides0.isParseWhitespaceControlStrictly());
      assertTrue(boolean0);
      assertFalse(legacyOverrides0.isUsePyishObjectMapper());
      assertFalse(legacyOverrides0.isUseNaturalOperatorPrecedence());
      assertFalse(legacyOverrides0.isIterateOverMapKeys());
      assertFalse(legacyOverrides0.isWhitespaceRequiredWithinTokens());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder0.build();
      LegacyOverrides.Builder.from(legacyOverrides0);
      assertFalse(legacyOverrides0.isEvaluateMapKeys());
      assertFalse(legacyOverrides0.isUseNaturalOperatorPrecedence());
      assertFalse(legacyOverrides0.isIterateOverMapKeys());
      assertFalse(legacyOverrides0.isUsePyishObjectMapper());
      assertFalse(legacyOverrides0.isParseWhitespaceControlStrictly());
      assertFalse(legacyOverrides0.isWhitespaceRequiredWithinTokens());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder0.build();
      boolean boolean0 = legacyOverrides0.isUsePyishObjectMapper();
      assertFalse(legacyOverrides0.isEvaluateMapKeys());
      assertFalse(legacyOverrides0.isParseWhitespaceControlStrictly());
      assertFalse(legacyOverrides0.isUseNaturalOperatorPrecedence());
      assertFalse(boolean0);
      assertFalse(legacyOverrides0.isWhitespaceRequiredWithinTokens());
      assertFalse(legacyOverrides0.isIterateOverMapKeys());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LegacyOverrides legacyOverrides0 = LegacyOverrides.NONE;
      boolean boolean0 = legacyOverrides0.isWhitespaceRequiredWithinTokens();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LegacyOverrides legacyOverrides0 = LegacyOverrides.NONE;
      boolean boolean0 = legacyOverrides0.isParseWhitespaceControlStrictly();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LegacyOverrides legacyOverrides0 = LegacyOverrides.NONE;
      boolean boolean0 = legacyOverrides0.isEvaluateMapKeys();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LegacyOverrides.Builder legacyOverrides_Builder0 = LegacyOverrides.newBuilder();
      LegacyOverrides legacyOverrides0 = legacyOverrides_Builder0.build();
      boolean boolean0 = legacyOverrides0.isIterateOverMapKeys();
      assertFalse(legacyOverrides0.isParseWhitespaceControlStrictly());
      assertFalse(legacyOverrides0.isWhitespaceRequiredWithinTokens());
      assertFalse(legacyOverrides0.isUsePyishObjectMapper());
      assertFalse(legacyOverrides0.isUseNaturalOperatorPrecedence());
      assertFalse(boolean0);
      assertFalse(legacyOverrides0.isEvaluateMapKeys());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LegacyOverrides legacyOverrides0 = LegacyOverrides.NONE;
      boolean boolean0 = legacyOverrides0.isUseNaturalOperatorPrecedence();
      assertFalse(boolean0);
  }
}
