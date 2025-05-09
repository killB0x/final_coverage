/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 19:18:46 GMT 2022
 */

package com.github.echisan.wbp4j.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.echisan.wbp4j.entity.UploadResp;
import com.github.echisan.wbp4j.entity.upload.Data;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UploadResp_ESTest extends UploadResp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UploadResp uploadResp0 = new UploadResp();
      Data data0 = new Data();
      uploadResp0.setData(data0);
      Data data1 = uploadResp0.getData();
      assertEquals(0, data1.getCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UploadResp uploadResp0 = new UploadResp();
      Data data0 = new Data();
      data0.setCount(125);
      uploadResp0.setData(data0);
      Data data1 = uploadResp0.getData();
      assertNull(data1.getData());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UploadResp uploadResp0 = new UploadResp();
      uploadResp0.setCode("");
      String string0 = uploadResp0.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UploadResp uploadResp0 = new UploadResp();
      String string0 = uploadResp0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UploadResp uploadResp0 = new UploadResp();
      String string0 = uploadResp0.toString();
      assertEquals("UploadResp{code='null', data=null}", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UploadResp uploadResp0 = new UploadResp();
      Data data0 = new Data();
      uploadResp0.setData(data0);
      data0.setCount((-936));
      Data data1 = uploadResp0.getData();
      assertSame(data1, data0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UploadResp uploadResp0 = new UploadResp();
      Data data0 = uploadResp0.getData();
      assertNull(data0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UploadResp uploadResp0 = new UploadResp();
      uploadResp0.setCode("QZ/H");
      String string0 = uploadResp0.getCode();
      assertEquals("QZ/H", string0);
  }
}
