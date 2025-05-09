/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:42:12 GMT 2022
 */

package com.searchunify.sdk.dtos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SearchSessionByCaseUidRequest_ESTest extends SearchSessionByCaseUidRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = SearchSessionByCaseUidRequest.builder();
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.startDate("PUT");
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder2 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1.caseUID("PUT");
      searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder2.endDate("PUT");
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.build();
      String string0 = searchSessionByCaseUidRequest0.getStartDate();
      assertEquals("PUT", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = new SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder();
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.caseUID("GET");
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder2 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1.startDate("");
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder3 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder2.endDate("");
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder3.build();
      String string0 = searchSessionByCaseUidRequest0.getEndDate();
      assertEquals("GET", searchSessionByCaseUidRequest0.getCaseUID());
      assertEquals("", searchSessionByCaseUidRequest0.getStartDate());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = SearchSessionByCaseUidRequest.builder();
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.startDate("PUT");
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder2 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1.caseUID("PUT");
      searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder2.endDate("PUT");
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.build();
      String string0 = searchSessionByCaseUidRequest0.getCaseUID();
      assertEquals("PUT", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = SearchSessionByCaseUidRequest.builder();
      // Undeclared exception!
      try { 
        searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.caseUID((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // caseUID is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest$SearchSessionByCaseUidRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = SearchSessionByCaseUidRequest.builder();
      // Undeclared exception!
      try { 
        searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.endDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // endDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest$SearchSessionByCaseUidRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = SearchSessionByCaseUidRequest.builder();
      // Undeclared exception!
      try { 
        searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.startDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // startDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest$SearchSessionByCaseUidRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = new SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder();
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.endDate("GET");
      searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1.startDate("");
      // Undeclared exception!
      try { 
        searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder1.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // caseUID is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = null;
      try {
        searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("d", (String) null, "d");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // endDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("bDOmZ34@Ain=a", "bDOmZ34@Ain=a", "bDOmZ34@Ain=a");
      // Undeclared exception!
      try { 
        searchSessionByCaseUidRequest0.setStartDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // startDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("D$tz5M]:~F+\":s", "D$tz5M]:~F+\":s", "");
      assertEquals("D$tz5M]:~F+\":s", searchSessionByCaseUidRequest0.getStartDate());
      
      searchSessionByCaseUidRequest0.setStartDate("EX:y>wlR");
      assertEquals("", searchSessionByCaseUidRequest0.getCaseUID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("D$tz5M]:~F+\":s", "D$tz5M]:~F+\":s", "");
      // Undeclared exception!
      try { 
        searchSessionByCaseUidRequest0.setEndDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // endDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("ZKFsJ}!<~", "ZKFsJ}!<~", "ZKFsJ}!<~");
      searchSessionByCaseUidRequest0.setEndDate("ZKFsJ}!<~");
      assertEquals("ZKFsJ}!<~", searchSessionByCaseUidRequest0.getStartDate());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("E5^k]':ci", "E5^k]':ci", "E5^k]':ci");
      // Undeclared exception!
      try { 
        searchSessionByCaseUidRequest0.setCaseUID((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // caseUID is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("D$tz5M]:~F+\":s", "D$tz5M]:~F+\":s", "");
      assertEquals("", searchSessionByCaseUidRequest0.getCaseUID());
      
      searchSessionByCaseUidRequest0.setCaseUID("");
      assertEquals("D$tz5M]:~F+\":s", searchSessionByCaseUidRequest0.getEndDate());
      assertEquals("D$tz5M]:~F+\":s", searchSessionByCaseUidRequest0.getStartDate());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = SearchSessionByCaseUidRequest.builder();
      String string0 = searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.toString();
      assertEquals("SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder(startDate=null, endDate=null, caseUID=null)", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("", "", "");
      String string0 = searchSessionByCaseUidRequest0.getStartDate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("", "", "");
      String string0 = searchSessionByCaseUidRequest0.getCaseUID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SearchSessionByCaseUidRequest.SearchSessionByCaseUidRequestBuilder searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0 = SearchSessionByCaseUidRequest.builder();
      // Undeclared exception!
      try { 
        searchSessionByCaseUidRequest_SearchSessionByCaseUidRequestBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // startDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchSessionByCaseUidRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SearchSessionByCaseUidRequest searchSessionByCaseUidRequest0 = new SearchSessionByCaseUidRequest("'$pw[-_O", "'$pw[-_O", "'$pw[-_O");
      String string0 = searchSessionByCaseUidRequest0.getEndDate();
      assertEquals("'$pw[-_O", string0);
  }
}
