/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:35:51 GMT 2022
 */

package com.searchunify.sdk.dtos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.searchunify.sdk.dtos.SearchQueryHistogramRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SearchQueryHistogramRequest_ESTest extends SearchQueryHistogramRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0 = SearchQueryHistogramRequest.builder();
      Integer integer0 = new Integer(0);
      searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.count(integer0);
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder1 = searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.endDate(")M^");
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder2 = searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder1.startDate("");
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder2.build();
      assertEquals("", searchQueryHistogramRequest0.getStartDate());
      assertEquals(")M^", searchQueryHistogramRequest0.getEndDate());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer((-1110));
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("rOvxbHypB=c", "rOvxbHypB=c", "4~3avAbP", integer0);
      String string0 = searchQueryHistogramRequest0.getStartDate();
      assertEquals("rOvxbHypB=c", searchQueryHistogramRequest0.getEndDate());
      assertEquals("4~3avAbP", searchQueryHistogramRequest0.getSearchClientId());
      assertEquals("rOvxbHypB=c", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-34));
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest(")", "y&n}C:", (String) null, integer0);
      String string0 = searchQueryHistogramRequest0.getSearchClientId();
      assertNull(string0);
      assertEquals("y&n}C:", searchQueryHistogramRequest0.getEndDate());
      assertEquals(")", searchQueryHistogramRequest0.getStartDate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer((-1110));
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("rOvxbHypB=c", "rOvxbHypB=c", "4~3avAbP", integer0);
      String string0 = searchQueryHistogramRequest0.getSearchClientId();
      assertEquals("rOvxbHypB=c", searchQueryHistogramRequest0.getEndDate());
      assertEquals("rOvxbHypB=c", searchQueryHistogramRequest0.getStartDate());
      assertEquals("4~3avAbP", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-1110));
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("rOvxbHypB=c", "rOvxbHypB=c", "4~3avAbP", integer0);
      String string0 = searchQueryHistogramRequest0.getEndDate();
      assertEquals("rOvxbHypB=c", string0);
      assertEquals("4~3avAbP", searchQueryHistogramRequest0.getSearchClientId());
      assertEquals("rOvxbHypB=c", searchQueryHistogramRequest0.getStartDate());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(4140);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("APIJ", "", "", integer0);
      searchQueryHistogramRequest0.getCount();
      assertEquals("", searchQueryHistogramRequest0.getSearchClientId());
      assertEquals("APIJ", searchQueryHistogramRequest0.getStartDate());
      assertEquals("", searchQueryHistogramRequest0.getEndDate());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer((-2570));
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("", "", "|vM:5R", integer0);
      searchQueryHistogramRequest0.getCount();
      assertEquals("", searchQueryHistogramRequest0.getStartDate());
      assertEquals("", searchQueryHistogramRequest0.getEndDate());
      assertEquals("|vM:5R", searchQueryHistogramRequest0.getSearchClientId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0 = SearchQueryHistogramRequest.builder();
      // Undeclared exception!
      try { 
        searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.startDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // startDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest$SearchQueryHistogramRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0 = SearchQueryHistogramRequest.builder();
      // Undeclared exception!
      try { 
        searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.endDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // endDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest$SearchQueryHistogramRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0 = SearchQueryHistogramRequest.builder();
      // Undeclared exception!
      try { 
        searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.count((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // count is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest$SearchQueryHistogramRequestBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = null;
      try {
        searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("'~Bkvr", "'~Bkvr", "'~Bkvr", (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // count is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0 = new SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder();
      searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.startDate("com.searchunify.sdk.dtos.SearchQueryHistogramRequest$SearchQueryHistogramRequestBuilder");
      // Undeclared exception!
      try { 
        searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // endDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(2);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest(")P(}#Q", ")P(}#Q", ")P(}#Q", integer0);
      // Undeclared exception!
      try { 
        searchQueryHistogramRequest0.setStartDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // startDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(4140);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("APIJ", "", "", integer0);
      assertEquals("APIJ", searchQueryHistogramRequest0.getStartDate());
      
      searchQueryHistogramRequest0.setStartDate("");
      assertEquals("", searchQueryHistogramRequest0.getEndDate());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer((-1110));
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("rOvxbHypB=c", "rOvxbHypB=c", "4~3avAbP", integer0);
      // Undeclared exception!
      try { 
        searchQueryHistogramRequest0.setCount((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // count is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(4140);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("APIJ", "", "", integer0);
      searchQueryHistogramRequest0.setCount(integer0);
      assertEquals("", searchQueryHistogramRequest0.getSearchClientId());
      assertEquals("", searchQueryHistogramRequest0.getEndDate());
      assertEquals("APIJ", searchQueryHistogramRequest0.getStartDate());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = Integer.getInteger("com.searchunify.sdk.dtos.SearchQueryHistogramRequest", 0);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("$9\")O*[Teh&9mx#I%r", "iMcoe$^:Xe,", "iMcoe$^:Xe,", integer0);
      // Undeclared exception!
      try { 
        searchQueryHistogramRequest0.setEndDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // endDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(4140);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("APIJ", "", "", integer0);
      assertEquals("", searchQueryHistogramRequest0.getEndDate());
      
      searchQueryHistogramRequest0.setEndDate("");
      assertEquals("APIJ", searchQueryHistogramRequest0.getStartDate());
      assertEquals("", searchQueryHistogramRequest0.getSearchClientId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0 = new SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder();
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder1 = searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.searchClientId((String) null);
      assertSame(searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder1, searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0 = SearchQueryHistogramRequest.builder();
      // Undeclared exception!
      try { 
        searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // startDate is marked non-null but is null
         //
         verifyException("com.searchunify.sdk.dtos.SearchQueryHistogramRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0 = SearchQueryHistogramRequest.builder();
      String string0 = searchQueryHistogramRequest_SearchQueryHistogramRequestBuilder0.toString();
      assertEquals("SearchQueryHistogramRequest.SearchQueryHistogramRequestBuilder(startDate=null, endDate=null, searchClientId=null, count=null)", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(4140);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("APIJ", "", "", integer0);
      String string0 = searchQueryHistogramRequest0.getSearchClientId();
      assertEquals("", string0);
      assertEquals("", searchQueryHistogramRequest0.getEndDate());
      assertEquals("APIJ", searchQueryHistogramRequest0.getStartDate());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(1480);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("Ru:iN9EzU:Z", "Ru:iN9EzU:Z", "Ru:iN9EzU:Z", integer0);
      searchQueryHistogramRequest0.setSearchClientId("Ru:iN9EzU:Z");
      assertNull(searchQueryHistogramRequest0.getContext());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = new Integer(0);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("startDate is marked non-null but is null", "startDate is marked non-null but is null", "startDate is marked non-null but is null", integer0);
      Integer integer1 = searchQueryHistogramRequest0.getCount();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(0);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("", "", "", integer0);
      String string0 = searchQueryHistogramRequest0.getEndDate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer(1967);
      SearchQueryHistogramRequest searchQueryHistogramRequest0 = new SearchQueryHistogramRequest("", "", "", integer0);
      String string0 = searchQueryHistogramRequest0.getStartDate();
      assertEquals("", string0);
  }
}
