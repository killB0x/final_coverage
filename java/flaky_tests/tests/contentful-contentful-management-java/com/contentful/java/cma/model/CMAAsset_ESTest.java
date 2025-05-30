/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:42:11 GMT 2022
 */

package com.contentful.java.cma.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.contentful.java.cma.model.CMAAsset;
import com.contentful.java.cma.model.CMAAssetFile;
import com.contentful.java.cma.model.CMALink;
import com.contentful.java.cma.model.CMASystem;
import com.contentful.java.cma.model.CMAVisibility;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CMAAsset_ESTest extends CMAAsset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      String string0 = cMAAsset_Fields0.toString(")");
      assertEquals("CMAAsset.Fields {description = null, file = null, title = null}", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      String string0 = cMAAsset_Fields0.toString();
      assertEquals("CMAAsset.Fields {description = null, file = null, title = null}", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      String string0 = cMAAsset_Fields0.getTitle((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      Integer integer0 = new Integer(0);
      CMAAsset cMAAsset1 = cMAAsset0.setVersion(integer0);
      Integer integer1 = cMAAsset1.getVersion();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      Integer integer0 = new Integer(488);
      CMAAsset cMAAsset1 = cMAAsset0.setVersion(integer0);
      Integer integer1 = cMAAsset1.getVersion();
      assertEquals(488, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      Integer integer0 = new Integer((-14));
      cMAAsset0.setVersion(integer0);
      Integer integer1 = cMAAsset0.getVersion();
      assertEquals((-14), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAVisibility cMAVisibility0 = CMAVisibility.publicVisibility;
      CMAAsset cMAAsset1 = cMAAsset0.setVisibility(cMAVisibility0);
      cMAAsset1.fields = null;
      CMAAsset.Fields cMAAsset_Fields0 = cMAAsset0.getFields();
      assertNull(cMAAsset_Fields0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMASystem cMASystem0 = new CMASystem();
      CMALink cMALink0 = new CMALink();
      CMALink cMALink1 = cMALink0.setSystem(cMASystem0);
      CMASystem cMASystem1 = cMASystem0.setSpace(cMALink1);
      CMAAsset cMAAsset1 = cMAAsset0.setSystem(cMASystem1);
      // Undeclared exception!
      cMAAsset1.toString();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAAsset cMAAsset1 = cMAAsset0.setSystem((CMASystem) null);
      Integer integer0 = new Integer((-1432));
      // Undeclared exception!
      try { 
        cMAAsset1.setVersion(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.CMAResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAAsset cMAAsset1 = cMAAsset0.setSystem((CMASystem) null);
      // Undeclared exception!
      try { 
        cMAAsset1.setSpaceId("?;qNTvBbYE[p7");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.CMAResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      cMAAsset0.system = null;
      // Undeclared exception!
      try { 
        cMAAsset0.setId("CMAAsset {");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.CMAResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAAsset cMAAsset1 = cMAAsset0.setSystem((CMASystem) null);
      // Undeclared exception!
      try { 
        cMAAsset1.setEnvironmentId("=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.CMAResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAAsset.Fields cMAAsset_Fields0 = cMAAsset0.getFields();
      assertNotNull(cMAAsset_Fields0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAssetFile cMAAssetFile0 = new CMAAssetFile();
      CMAAsset.Fields cMAAsset_Fields1 = cMAAsset_Fields0.setFile("", cMAAssetFile0);
      CMAAsset.Fields cMAAsset_Fields2 = cMAAsset_Fields1.setFile("", cMAAssetFile0);
      assertSame(cMAAsset_Fields2, cMAAsset_Fields0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAssetFile cMAAssetFile0 = new CMAAssetFile();
      cMAAsset_Fields0.setFile("<J)r$k&I+-QVP[n)(-", cMAAssetFile0);
      CMAAssetFile cMAAssetFile1 = cMAAsset_Fields0.getFile("&S?a iBH87jo{Fu@\"8");
      assertNull(cMAAssetFile1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAsset.Fields cMAAsset_Fields1 = cMAAsset_Fields0.setTitle("com.contentful.java.cma.model.CMASystem", "com.contentful.java.cma.model.CMASystem");
      CMAAsset.Fields cMAAsset_Fields2 = cMAAsset_Fields1.setTitle("com.contentful.java.cma.model.CMASystem", "com.contentful.java.cma.model.CMASystem");
      assertSame(cMAAsset_Fields2, cMAAsset_Fields0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAsset.Fields.Localized cMAAsset_Fields_Localized0 = cMAAsset_Fields0.new Localized("");
      cMAAsset_Fields_Localized0.setTitle(" }");
      String string0 = cMAAsset_Fields_Localized0.toString();
      assertEquals("Localized {locale = , description = null, file = null, title =  } }", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAsset.Fields cMAAsset_Fields1 = cMAAsset_Fields0.setDescription("com.contentful.java.cma.model.CMASystem", "com.contentful.java.cma.model.CMASystem");
      CMAAsset.Fields cMAAsset_Fields2 = cMAAsset_Fields1.setDescription(", url = ", "com.contentful.java.cma.model.CMASystem");
      assertSame(cMAAsset_Fields0, cMAAsset_Fields2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAsset.Fields cMAAsset_Fields1 = cMAAsset_Fields0.setDescription((String) null, "^v2D*zI?Yb");
      String string0 = cMAAsset_Fields1.getDescription(", description = ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAsset.Fields.Localized cMAAsset_Fields_Localized0 = cMAAsset_Fields0.localize("");
      CMAAsset.Fields.Localized cMAAsset_Fields_Localized1 = cMAAsset_Fields_Localized0.setTitle("T}ZtU5");
      assertSame(cMAAsset_Fields_Localized1, cMAAsset_Fields_Localized0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAssetFile cMAAssetFile0 = new CMAAssetFile();
      CMAAsset.Fields.Localized cMAAsset_Fields_Localized0 = cMAAsset_Fields0.localize("Environment");
      CMAAsset.Fields.Localized cMAAsset_Fields_Localized1 = cMAAsset_Fields_Localized0.setFile(cMAAssetFile0);
      assertSame(cMAAsset_Fields_Localized1, cMAAsset_Fields_Localized0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CMAAsset.Fields cMAAsset_Fields0 = new CMAAsset.Fields();
      CMAAsset.Fields.Localized cMAAsset_Fields_Localized0 = cMAAsset_Fields0.localize("");
      CMAAsset.Fields.Localized cMAAsset_Fields_Localized1 = cMAAsset_Fields_Localized0.setDescription("T}ZtU5");
      assertSame(cMAAsset_Fields_Localized0, cMAAsset_Fields_Localized1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAAsset cMAAsset1 = cMAAsset0.setSpaceId("^v2D*zI?Yb");
      assertSame(cMAAsset0, cMAAsset1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAAsset cMAAsset1 = cMAAsset0.setEnvironmentId(" }");
      assertFalse(cMAAsset1.isArchived());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAAsset cMAAsset1 = cMAAsset0.setId(" }");
      cMAAsset1.system = null;
      // Undeclared exception!
      try { 
        cMAAsset0.getVersion();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.CMAResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      Integer integer0 = cMAAsset0.getVersion();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      CMAAsset cMAAsset1 = cMAAsset0.setFields((CMAAsset.Fields) null);
      assertSame(cMAAsset1, cMAAsset0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CMAAsset cMAAsset0 = new CMAAsset();
      String string0 = cMAAsset0.toString();
      assertEquals("CMAAsset {CMAResource { system = CMASystem { type = Asset } }fields = CMAAsset.Fields {description = null, file = null, title = null}}", string0);
  }
}
