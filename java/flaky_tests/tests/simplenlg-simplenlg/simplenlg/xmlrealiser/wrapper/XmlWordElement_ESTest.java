/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 03:17:39 GMT 2022
 */

package simplenlg.xmlrealiser.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplenlg.xmlrealiser.wrapper.XmlInflection;
import simplenlg.xmlrealiser.wrapper.XmlLexicalCategory;
import simplenlg.xmlrealiser.wrapper.XmlWordElement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlWordElement_ESTest extends XmlWordElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.canned = null;
      Boolean boolean0 = Boolean.FALSE;
      xmlWordElement0.canned = boolean0;
      xmlWordElement0.setCanned((Boolean) null);
      assertNull(xmlWordElement0.isPROPER());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.canned = null;
      Boolean boolean0 = Boolean.FALSE;
      xmlWordElement0.canned = boolean0;
      xmlWordElement0.setCanned(xmlWordElement0.canned);
      assertNull(xmlWordElement0.getBase());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      Boolean boolean0 = Boolean.TRUE;
      xmlWordElement0.setPROPER(boolean0);
      Boolean boolean1 = xmlWordElement0.isPROPER();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      Boolean boolean0 = Boolean.FALSE;
      xmlWordElement0.proper = boolean0;
      Boolean boolean1 = xmlWordElement0.isPROPER();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      Boolean boolean0 = Boolean.TRUE;
      xmlWordElement0.setEXPLETIVESUBJECT(boolean0);
      Boolean boolean1 = xmlWordElement0.isEXPLETIVESUBJECT();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.canned = null;
      Boolean boolean0 = Boolean.FALSE;
      xmlWordElement0.canned = boolean0;
      xmlWordElement0.expletivesubject = xmlWordElement0.canned;
      Boolean boolean1 = xmlWordElement0.isEXPLETIVESUBJECT();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.canned = null;
      Boolean boolean0 = Boolean.TRUE;
      xmlWordElement0.canned = boolean0;
      Boolean boolean1 = xmlWordElement0.isCanned();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.canned = null;
      Boolean boolean0 = Boolean.FALSE;
      xmlWordElement0.canned = boolean0;
      Boolean boolean1 = xmlWordElement0.isCanned();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      XmlInflection xmlInflection0 = XmlInflection.IRREGULAR;
      xmlWordElement0.var = xmlInflection0;
      XmlInflection xmlInflection1 = xmlWordElement0.getVar();
      assertEquals(XmlInflection.IRREGULAR, xmlInflection1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.id = "*BW,,^#i~rwL1";
      xmlWordElement0.id = "";
      String string0 = xmlWordElement0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.setBase("(f^NA>P");
      String string0 = xmlWordElement0.getBase();
      assertEquals("(f^NA>P", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.base = "";
      String string0 = xmlWordElement0.getBase();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      String string0 = xmlWordElement0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      XmlInflection xmlInflection0 = XmlInflection.IRREGULAR;
      xmlWordElement0.setVar(xmlInflection0);
      assertNull(xmlWordElement0.isCanned());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      Boolean boolean0 = xmlWordElement0.isPROPER();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.setId("simplenlg.xmlrealiser.wrapper.XmlWordElement");
      assertNull(xmlWordElement0.getVar());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      Boolean boolean0 = xmlWordElement0.isCanned();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.getVar();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      String string0 = xmlWordElement0.getBase();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      Boolean boolean0 = xmlWordElement0.isEXPLETIVESUBJECT();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      XmlLexicalCategory xmlLexicalCategory0 = XmlLexicalCategory.DETERMINER;
      xmlWordElement0.setCat(xmlLexicalCategory0);
      XmlLexicalCategory xmlLexicalCategory1 = xmlWordElement0.getCat();
      assertSame(xmlLexicalCategory1, xmlLexicalCategory0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlWordElement xmlWordElement0 = new XmlWordElement();
      xmlWordElement0.getCat();
  }
}
