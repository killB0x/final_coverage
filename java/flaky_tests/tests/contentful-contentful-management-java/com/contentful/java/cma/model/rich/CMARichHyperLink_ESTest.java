/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:17:47 GMT 2022
 */

package com.contentful.java.cma.model.rich;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.contentful.java.cma.model.CMALink;
import com.contentful.java.cma.model.CMASystem;
import com.contentful.java.cma.model.CMAType;
import com.contentful.java.cma.model.rich.CMARichHyperLink;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CMARichHyperLink_ESTest extends CMARichHyperLink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink();
      cMARichHyperLink0.data = null;
      Object object0 = cMARichHyperLink0.getData();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CMALink cMALink0 = new CMALink();
      CMALink cMALink1 = cMALink0.setSystem((CMASystem) null);
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink(cMALink1);
      // Undeclared exception!
      try { 
        cMARichHyperLink0.getNodeType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.rich.CMARichHyperLink", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CMAType cMAType0 = CMAType.Webhook;
      CMALink cMALink0 = new CMALink(cMAType0);
      CMASystem cMASystem0 = new CMASystem();
      cMASystem0.setContentType(cMALink0);
      cMALink0.setSystem(cMASystem0);
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink(cMASystem0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      CMARichHyperLink cMARichHyperLink0 = null;
      try {
        cMARichHyperLink0 = new CMARichHyperLink(object0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Target java.lang.Object@7232676c of type 'java.lang.Object'is neither a String, nor a CMAAsset, nor a  CMAEntry.
         //
         verifyException("com.contentful.java.cma.model.rich.CMARichHyperLink", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CMAType cMAType0 = CMAType.Asset;
      CMALink cMALink0 = new CMALink(cMAType0);
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink(cMALink0);
      String string0 = cMARichHyperLink0.getNodeType();
      assertEquals("asset-hyperlink", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CMAType cMAType0 = CMAType.Entry;
      CMALink cMALink0 = new CMALink(cMAType0);
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink(cMALink0);
      String string0 = cMARichHyperLink0.getNodeType();
      assertEquals("entry-hyperlink", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink();
      String string0 = cMARichHyperLink0.getNodeType();
      assertEquals("hyperlink", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CMARichHyperLink cMARichHyperLink0 = null;
      try {
        cMARichHyperLink0 = new CMARichHyperLink((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.rich.CMARichHyperLink", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink("hyperlink");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink();
      HashMap hashMap0 = (HashMap)cMARichHyperLink0.getData();
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CMALink cMALink0 = new CMALink();
      CMARichHyperLink cMARichHyperLink0 = new CMARichHyperLink(cMALink0);
      String string0 = cMARichHyperLink0.getNodeType();
      assertEquals("hyperlink", string0);
  }
}
