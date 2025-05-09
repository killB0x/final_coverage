/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:27:21 GMT 2022
 */

package com.searchunify.sdk.dtos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GetAllDocumentInContentSourceRequest_ESTest extends GetAllDocumentInContentSourceRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest(")", "", "^");
      String string0 = getAllDocumentInContentSourceRequest0.getObjectId();
      assertEquals("^", getAllDocumentInContentSourceRequest0.getDocumentId());
      assertEquals(")", getAllDocumentInContentSourceRequest0.getContentSourceId());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0 = GetAllDocumentInContentSourceRequest.builder();
      getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.documentId("documentId is marked non-null but is null");
      getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.objectId("P8");
      getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.contentSourceId("P8");
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.build();
      String string0 = getAllDocumentInContentSourceRequest0.getDocumentId();
      assertEquals("P8", getAllDocumentInContentSourceRequest0.getObjectId());
      assertEquals("P8", getAllDocumentInContentSourceRequest0.getContentSourceId());
      assertEquals("documentId is marked non-null but is null", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("", "", "");
      String string0 = getAllDocumentInContentSourceRequest0.getContentSourceId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0 = GetAllDocumentInContentSourceRequest.builder();
      // Undeclared exception!
      try { 
        getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.documentId((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // documentId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest$GetAllDocumentInContentSourceRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0 = new GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder();
      // Undeclared exception!
      try { 
        getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.objectId((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // objectId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest$GetAllDocumentInContentSourceRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0 = GetAllDocumentInContentSourceRequest.builder();
      // Undeclared exception!
      try { 
        getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.contentSourceId((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // contentSourceId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest$GetAllDocumentInContentSourceRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = null;
      try {
        getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("Lx", "Lx", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // documentId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = null;
      try {
        getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("i7~]", (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // objectId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0 = GetAllDocumentInContentSourceRequest.builder();
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder1 = getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.contentSourceId("");
      getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.documentId("GET");
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder2 = getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder1.objectId("");
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder2.build();
      // Undeclared exception!
      try { 
        getAllDocumentInContentSourceRequest0.setDocumentId((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // documentId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest(")", "", "^");
      assertEquals("^", getAllDocumentInContentSourceRequest0.getDocumentId());
      
      getAllDocumentInContentSourceRequest0.setDocumentId("");
      assertEquals("", getAllDocumentInContentSourceRequest0.getObjectId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("zv(o}X7", "zv(o}X7", "zv(o}X7");
      // Undeclared exception!
      try { 
        getAllDocumentInContentSourceRequest0.setContentSourceId((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // contentSourceId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest(")", "", "^");
      assertEquals(")", getAllDocumentInContentSourceRequest0.getContentSourceId());
      
      getAllDocumentInContentSourceRequest0.setContentSourceId("POST");
      assertEquals("", getAllDocumentInContentSourceRequest0.getObjectId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("Lx4GN{%||*P7KK", "Lx4GN{%||*P7KK", "Lx4GN{%||*P7KK");
      // Undeclared exception!
      try { 
        getAllDocumentInContentSourceRequest0.setObjectId((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // objectId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("com.searchunify.sdk.dtos.SearchUnifyRequest", "com.searchunify.sdk.dtos.SearchUnifyRequest", "com.searchunify.sdk.dtos.SearchUnifyRequest");
      getAllDocumentInContentSourceRequest0.setObjectId("com.searchunify.sdk.dtos.SearchUnifyRequest");
      assertEquals("com.searchunify.sdk.dtos.SearchUnifyRequest", getAllDocumentInContentSourceRequest0.getDocumentId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0 = GetAllDocumentInContentSourceRequest.builder();
      String string0 = getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.toString();
      assertEquals("GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder(contentSourceId=null, objectId=null, documentId=null)", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("GET", "GET", "GET");
      String string0 = getAllDocumentInContentSourceRequest0.getContentSourceId();
      assertEquals("GET", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("", "", "");
      String string0 = getAllDocumentInContentSourceRequest0.getDocumentId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GetAllDocumentInContentSourceRequest getAllDocumentInContentSourceRequest0 = new GetAllDocumentInContentSourceRequest("u'D,~>0WE<$AH", "u'D,~>0WE<$AH", "u'D,~>0WE<$AH");
      String string0 = getAllDocumentInContentSourceRequest0.getObjectId();
      assertEquals("u'D,~>0WE<$AH", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GetAllDocumentInContentSourceRequest.GetAllDocumentInContentSourceRequestBuilder getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0 = GetAllDocumentInContentSourceRequest.builder();
      // Undeclared exception!
      try { 
        getAllDocumentInContentSourceRequest_GetAllDocumentInContentSourceRequestBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // contentSourceId is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.GetAllDocumentInContentSourceRequest", e);
      }
  }
}
