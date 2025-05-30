/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 19:14:00 GMT 2022
 */

package com.github.echisan.wbp4j.interceptor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.echisan.wbp4j.UploadAttributes;
import com.github.echisan.wbp4j.WbpUploadResponse;
import com.github.echisan.wbp4j.interceptor.InitUploadAttributesInterceptor;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InitUploadAttributesInterceptor_ESTest extends InitUploadAttributesInterceptor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      InitUploadAttributesInterceptor initUploadAttributesInterceptor0 = new InitUploadAttributesInterceptor(hashMap0);
      UploadAttributes uploadAttributes0 = new UploadAttributes();
      boolean boolean0 = initUploadAttributesInterceptor0.processBefore(uploadAttributes0);
      assertEquals("http://picupload.service.weibo.com/interface/pic_upload.php?ori=1&mime=image%2Fjpeg&data=base64&url=0&markpos=1&logo=&nick=0&marks=1&app=miniblog", uploadAttributes0.getUrl());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      InitUploadAttributesInterceptor initUploadAttributesInterceptor0 = new InitUploadAttributesInterceptor(hashMap0);
      WbpUploadResponse wbpUploadResponse0 = new WbpUploadResponse();
      initUploadAttributesInterceptor0.processAfter(wbpUploadResponse0);
      assertNull(wbpUploadResponse0.getResult());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InitUploadAttributesInterceptor initUploadAttributesInterceptor0 = new InitUploadAttributesInterceptor();
      // Undeclared exception!
      try { 
        initUploadAttributesInterceptor0.processBefore((UploadAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.echisan.wbp4j.interceptor.InitUploadAttributesInterceptor", e);
      }
  }
}
