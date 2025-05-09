/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 12:42:32 GMT 2022
 */

package com.kvn.poi.exp.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.kvn.poi.exp.domain.MutiRowModel;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MutiRowModel_ESTest extends MutiRowModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      mutiRowModel0.setListKey("X?QsL{9F");
      String string0 = mutiRowModel0.getListKey();
      assertEquals("X?QsL{9F", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      mutiRowModel0.setListKey("");
      String string0 = mutiRowModel0.getListKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Integer integer0 = new Integer(0);
      mutiRowModel0.setEnd(integer0);
      Integer integer1 = mutiRowModel0.getEnd();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Integer integer0 = new Integer(1);
      mutiRowModel0.setEnd(integer0);
      Integer integer1 = mutiRowModel0.getEnd();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      Integer integer0 = new Integer(2019);
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      hashMap0.put(integer0, hashMap1);
      mutiRowModel0.setCellMap(hashMap0);
      Map<Integer, Map<Integer, Object>> map0 = mutiRowModel0.getCellMap();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Integer integer0 = new Integer(0);
      mutiRowModel0.setBegin(integer0);
      Integer integer1 = mutiRowModel0.getBegin();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Integer integer0 = new Integer(1);
      mutiRowModel0.setBegin(integer0);
      Integer integer1 = mutiRowModel0.getBegin();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Integer integer0 = new Integer((-2454));
      mutiRowModel0.setBegin(integer0);
      Integer integer1 = mutiRowModel0.getBegin();
      assertEquals((-2454), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Map<Integer, Map<Integer, Object>> map0 = mutiRowModel0.getCellMap();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Integer integer0 = mutiRowModel0.getEnd();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Integer integer0 = new Integer((-566));
      mutiRowModel0.setEnd(integer0);
      Integer integer1 = mutiRowModel0.getEnd();
      assertEquals((-566), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      mutiRowModel0.setCellMap(hashMap0);
      Map<Integer, Map<Integer, Object>> map0 = mutiRowModel0.getCellMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      Integer integer0 = mutiRowModel0.getBegin();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutiRowModel mutiRowModel0 = new MutiRowModel();
      String string0 = mutiRowModel0.getListKey();
      assertNull(string0);
  }
}
