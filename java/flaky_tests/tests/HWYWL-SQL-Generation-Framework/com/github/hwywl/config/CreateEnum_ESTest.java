/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 03:45:18 GMT 2022
 */

package com.github.hwywl.config;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.hwywl.config.CreateEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CreateEnum_ESTest extends CreateEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CreateEnum createEnum0 = CreateEnum.fromMessage("JSON\u89E3\u6790\u9519\u8BEF!");
      assertEquals(CreateEnum.JSON_ANALYSIS_ERROR, createEnum0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CreateEnum createEnum0 = CreateEnum.UNKNOWN_ERROR;
      Integer integer0 = createEnum0.getCode();
      CreateEnum createEnum1 = CreateEnum.fromCode(integer0);
      assertEquals(CreateEnum.UNKNOWN_ERROR, createEnum1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CreateEnum[] createEnumArray0 = CreateEnum.values();
      assertEquals(3, createEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CreateEnum createEnum0 = CreateEnum.valueOf("JOIN_CONDITION_ERROR");
      assertEquals(CreateEnum.JOIN_CONDITION_ERROR, createEnum0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CreateEnum createEnum0 = CreateEnum.fromMessage("\u672A\u77E5\u7684\u9519\u8BEF!");
      assertEquals(CreateEnum.UNKNOWN_ERROR, createEnum0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CreateEnum.fromMessage("Hb");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer((-1979031931));
      CreateEnum.fromCode(integer0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CreateEnum createEnum0 = CreateEnum.JOIN_CONDITION_ERROR;
      Integer integer0 = createEnum0.getCode();
      CreateEnum createEnum1 = CreateEnum.fromCode(integer0);
      assertEquals(CreateEnum.JOIN_CONDITION_ERROR, createEnum1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CreateEnum createEnum0 = CreateEnum.JOIN_CONDITION_ERROR;
      String string0 = createEnum0.getMessage();
      assertEquals("\u8FDE\u63A5\u6761\u4EF6\u4E0D\u80FD\u4E3A\u7A7A!", string0);
  }
}
