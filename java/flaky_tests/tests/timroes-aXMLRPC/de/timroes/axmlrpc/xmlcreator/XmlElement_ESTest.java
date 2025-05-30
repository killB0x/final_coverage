/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 23:26:14 GMT 2022
 */

package de.timroes.axmlrpc.xmlcreator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.timroes.axmlrpc.xmlcreator.XmlElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlElement_ESTest extends XmlElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      XmlElement xmlElement1 = new XmlElement(" ");
      xmlElement1.addChildren((XmlElement) null);
      xmlElement0.setContent("");
      xmlElement0.toString();
      xmlElement1.addChildren((XmlElement) null);
      // Undeclared exception!
      try { 
        xmlElement1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.timroes.axmlrpc.xmlcreator.XmlElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      XmlElement xmlElement1 = new XmlElement("");
      xmlElement0.addChildren(xmlElement1);
      xmlElement1.addChildren(xmlElement0);
      // Undeclared exception!
      try { 
        xmlElement1.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      XmlElement xmlElement1 = new XmlElement("");
      xmlElement0.addChildren(xmlElement1);
      xmlElement0.setContent("");
      String string0 = xmlElement0.toString();
      assertEquals("\n<>\n</>\n</>\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("@  -DvO&2&X");
      XmlElement xmlElement1 = new XmlElement("@  -DvO&2&X");
      xmlElement0.setContent("</");
      xmlElement1.toString();
      xmlElement0.addChildren(xmlElement1);
      xmlElement0.setContent("@  -DvO&2&X");
      xmlElement0.addChildren(xmlElement1);
      xmlElement0.setContent("");
      xmlElement0.addChildren(xmlElement1);
      xmlElement0.toString();
      xmlElement0.addChildren(xmlElement1);
      xmlElement1.addChildren(xmlElement0);
      xmlElement0.addChildren(xmlElement1);
      xmlElement0.addChildren(xmlElement1);
      xmlElement1.setContent("@  -DvO&2&X");
      xmlElement1.toString();
      xmlElement1.toString();
      xmlElement0.setContent("</");
      xmlElement0.addChildren(xmlElement1);
      xmlElement1.setContent("\n<@  -DvO&2&X>@  -DvO&2&X</@  -DvO&2&X>\n");
      xmlElement1.setContent("\n<@  -DvO&2&X>@  -DvO&2&X</@  -DvO&2&X>\n");
      xmlElement0.setContent("");
      xmlElement1.addChildren(xmlElement0);
      xmlElement1.toString();
      xmlElement1.addChildren(xmlElement0);
      xmlElement0.setContent((String) null);
      xmlElement0.toString();
      xmlElement1.addChildren(xmlElement0);
      assertFalse(xmlElement1.equals((Object)xmlElement0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("l*Is>2");
      XmlElement xmlElement1 = new XmlElement("l*Is>2");
      xmlElement0.addChildren(xmlElement1);
      String string0 = xmlElement0.toString();
      assertEquals("\n<l*Is>2>\n<l*Is>2/>\n</l*Is>2>\n", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement((String) null);
      String string0 = xmlElement0.toString();
      assertEquals("\n<null/>\n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("I156#9lkM-|x5");
      XmlElement xmlElement1 = new XmlElement("I156#9lkM-|x5");
      xmlElement0.addChildren(xmlElement1);
      assertFalse(xmlElement1.equals((Object)xmlElement0));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(">\n");
      xmlElement0.setContent("de.timroes.axmlrpc.xmlcreator.XmlElement");
      XmlElement xmlElement1 = new XmlElement(">\n");
      xmlElement0.setContent(">\n");
      xmlElement1.addChildren(xmlElement0);
      xmlElement1.toString();
      xmlElement1.toString();
      xmlElement1.toString();
      xmlElement1.toString();
      xmlElement0.toString();
      xmlElement1.addChildren(xmlElement0);
      xmlElement1.setContent("\n<");
      xmlElement0.addChildren(xmlElement1);
      xmlElement1.toString();
      xmlElement0.toString();
      xmlElement0.setContent("\n<>\n>>\n</>\n>\n");
      xmlElement0.setContent("R!?U_4j/");
      xmlElement0.addChildren(xmlElement1);
      xmlElement0.toString();
      xmlElement0.toString();
      xmlElement0.toString();
      xmlElement1.addChildren(xmlElement0);
      xmlElement0.addChildren(xmlElement1);
      assertFalse(xmlElement0.equals((Object)xmlElement1));
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("g");
      xmlElement0.setContent("g");
      String string0 = xmlElement0.toString();
      assertEquals("\n<g>g</g>\n", string0);
  }
}
