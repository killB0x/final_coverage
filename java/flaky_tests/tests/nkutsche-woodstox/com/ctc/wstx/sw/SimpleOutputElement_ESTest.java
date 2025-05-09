/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:28:20 GMT 2022
 */

package com.ctc.wstx.sw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ctc.wstx.dom.DOMOutputElement;
import com.ctc.wstx.sr.CompactNsContext;
import com.ctc.wstx.sw.OutputElementBase;
import com.ctc.wstx.sw.SimpleOutputElement;
import com.ctc.wstx.util.EmptyNamespaceContext;
import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.Location;
import javax.xml.stream.XMLStreamException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleOutputElement_ESTest extends SimpleOutputElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("!'", "!'");
      SimpleOutputElement.AttrName simpleOutputElement_AttrName1 = new SimpleOutputElement.AttrName("!'", "^YBY");
      int int0 = simpleOutputElement_AttrName0.compareTo(simpleOutputElement_AttrName1);
      assertEquals((-61), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("", "zRB6ex?2~u.dNn$+");
      int int0 = simpleOutputElement_AttrName0.compareTo(simpleOutputElement_AttrName0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("Xon", "Xon");
      SimpleOutputElement.AttrName simpleOutputElement_AttrName1 = new SimpleOutputElement.AttrName("^YBY", "^YBY");
      int int0 = simpleOutputElement_AttrName0.compareTo(simpleOutputElement_AttrName1);
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName(">'}%Our&+YJf[", "%i|~yhw_");
      String string0 = simpleOutputElement_AttrName0.toString();
      assertEquals("{>'}%Our&+YJf[} %i|~yhw_", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("", ".qmJg9mGW?IkO%]");
      String string0 = simpleOutputElement_AttrName0.toString();
      assertEquals(".qmJg9mGW?IkO%]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("", "");
      SimpleOutputElement.AttrName simpleOutputElement_AttrName1 = new SimpleOutputElement.AttrName("a", "");
      boolean boolean0 = simpleOutputElement_AttrName0.equals(simpleOutputElement_AttrName1);
      assertFalse(boolean0);
      assertFalse(simpleOutputElement_AttrName1.equals((Object)simpleOutputElement_AttrName0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      DOMOutputElement dOMOutputElement0 = DOMOutputElement.createRoot((Node) null);
      dOMOutputElement0.setDefaultNsUri("7#apf4");
      simpleOutputElement0.setRootNsContext(dOMOutputElement0);
      assertEquals("7#apf4", simpleOutputElement0.getDefaultNsUri());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.setPrefix("), original problem: ");
      String string0 = simpleOutputElement0.getNameDesc();
      assertEquals("), original problem: :", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.addToPool((SimpleOutputElement) null);
      assertTrue(simpleOutputElement0.isRoot());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild("", "+(!P_j~[./C$c9N(", "com.ctc.wstx.sw.SimpleOutputElement$AttrName");
      simpleOutputElement1.reuseAsChild(simpleOutputElement0, "", "ILTJia6-@Q|", "]Nb9F\"6");
      assertEquals("ILTJia6-@Q|", simpleOutputElement1.getLocalName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.addToPool(simpleOutputElement0);
      assertFalse(simpleOutputElement0.isRoot());
      
      simpleOutputElement0.reuseAsChild(simpleOutputElement0, "6d= D?O4!:[+*f", "", "; ");
      assertEquals("6d= D?O4!:[+*f", simpleOutputElement0.getPrefix());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = SimpleOutputElement.createRoot();
      simpleOutputElement0.reuseAsChild(simpleOutputElement1, "");
      simpleOutputElement0.reuseAsChild(simpleOutputElement1, "-nwc(4MiuhSjdArWwJI");
      assertFalse(simpleOutputElement0.isRoot());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.mParent = simpleOutputElement0;
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.mParent.reuseAsChild(simpleOutputElement0, "");
      assertEquals("", simpleOutputElement1.getNamespaceURI());
      assertEquals("", simpleOutputElement1.getDefaultNsUri());
      assertEquals("", simpleOutputElement1.getLocalName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.mPrefix = "+(!P_j~[./C$c9N(";
      String string0 = simpleOutputElement0.getPrefix();
      assertNotNull(string0);
      assertEquals("+(!P_j~[./C$c9N(", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild("", "", "7");
      String string0 = simpleOutputElement1.getPrefix();
      assertFalse(simpleOutputElement1.isRoot());
      assertEquals("", string0);
      assertEquals("7", simpleOutputElement1.getNamespaceURI());
      assertEquals("", simpleOutputElement1.getLocalName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild("", "+(!P_j~[./C$c9N(", "com.ctc.wstx.sw.SimpleOutputElement$AttrName");
      SimpleOutputElement simpleOutputElement2 = simpleOutputElement1.getParent();
      assertEquals("com.ctc.wstx.sw.SimpleOutputElement$AttrName", simpleOutputElement1.getNamespaceURI());
      assertNotNull(simpleOutputElement2);
      assertEquals("+(!P_j~[./C$c9N(", simpleOutputElement1.getLocalName());
      assertEquals("", simpleOutputElement1.getPrefix());
      assertEquals("", simpleOutputElement2.getLocalName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild("com.ctc.wstx.sw.SimpleOutputElement$AttrName", "Illegal namespace index ", "Duplicate attribute write for attribute '");
      SimpleOutputElement simpleOutputElement2 = simpleOutputElement1.createChild("Illegal namespace index ");
      SimpleOutputElement simpleOutputElement3 = simpleOutputElement2.getParent();
      assertEquals("", simpleOutputElement2.getNamespaceURI());
      assertNotNull(simpleOutputElement3);
      assertEquals("Duplicate attribute write for attribute '", simpleOutputElement3.getNamespaceURI());
      assertEquals("com.ctc.wstx.sw.SimpleOutputElement$AttrName", simpleOutputElement3.getPrefix());
      assertEquals("Illegal namespace index ", simpleOutputElement3.getLocalName());
      assertEquals("Illegal namespace index ", simpleOutputElement2.getLocalName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.reuseAsChild(simpleOutputElement0, "q;", ":", ":");
      simpleOutputElement0.getNamespaceURI();
      assertFalse(simpleOutputElement0.isRoot());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild((String) null, (String) null, "");
      String string0 = simpleOutputElement1.getNamespaceURI();
      assertFalse(simpleOutputElement1.isRoot());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild("Duplicate attribute write for attribute '", "Duplicate attribute write for attribute '", "6d= D?O4!:[+*f");
      simpleOutputElement1.getName();
      assertFalse(simpleOutputElement1.isRoot());
      assertEquals("Duplicate attribute write for attribute '", simpleOutputElement1.getLocalName());
      assertEquals("Duplicate attribute write for attribute '", simpleOutputElement1.getPrefix());
      assertEquals("6d= D?O4!:[+*f", simpleOutputElement1.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild((String) null, (String) null, (String) null);
      String string0 = simpleOutputElement1.getLocalName();
      assertFalse(simpleOutputElement1.isRoot());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      // Undeclared exception!
      try { 
        simpleOutputElement0.setRootNsContext((NamespaceContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ctc.wstx.sw.SimpleOutputElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      String[] stringArray0 = new String[1];
      CompactNsContext compactNsContext0 = new CompactNsContext((Location) null, stringArray0, 2, 2);
      // Undeclared exception!
      try { 
        simpleOutputElement0.setRootNsContext(compactNsContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("com.ctc.wstx.sr.CompactNsContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      // Undeclared exception!
      try { 
        simpleOutputElement0.reuseAsChild((SimpleOutputElement) null, "MSs", "MSs", "MSs");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ctc.wstx.sw.OutputElementBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      // Undeclared exception!
      try { 
        simpleOutputElement0.reuseAsChild((SimpleOutputElement) null, "LbN5u/O@Bndt>ZSH");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ctc.wstx.sw.OutputElementBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName((String) null, "'");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("{", "zRB6ex?2~u.dNn$+");
      SimpleOutputElement.AttrName simpleOutputElement_AttrName1 = new SimpleOutputElement.AttrName("Duplicate attribute write for attribute '", "'); has to be the default '");
      int int0 = simpleOutputElement_AttrName0.compareTo(simpleOutputElement_AttrName1);
      assertEquals(55, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("", "");
      SimpleOutputElement.AttrName simpleOutputElement_AttrName1 = new SimpleOutputElement.AttrName("", "");
      boolean boolean0 = simpleOutputElement_AttrName1.equals(simpleOutputElement_AttrName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("O", "O");
      SimpleOutputElement.AttrName simpleOutputElement_AttrName1 = new SimpleOutputElement.AttrName("O", "T_MzO+)P|iSF^BY(X");
      boolean boolean0 = simpleOutputElement_AttrName1.equals(simpleOutputElement_AttrName0);
      assertFalse(boolean0);
      assertFalse(simpleOutputElement_AttrName0.equals((Object)simpleOutputElement_AttrName1));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName(">'}%Our&+YJf[", "%i|~yhw_");
      boolean boolean0 = simpleOutputElement_AttrName0.equals("{>'}%Our&+YJf[} %i|~yhw_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleOutputElement.AttrName simpleOutputElement_AttrName0 = new SimpleOutputElement.AttrName("{", "{");
      boolean boolean0 = simpleOutputElement_AttrName0.equals(simpleOutputElement_AttrName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      // Undeclared exception!
      try { 
        simpleOutputElement0.checkAttrWrite((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ctc.wstx.sw.SimpleOutputElement$AttrName", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.setDefaultNsUri("x,:!z+P4h");
      simpleOutputElement0.setRootNsContext(simpleOutputElement0);
      assertEquals("x,:!z+P4h", simpleOutputElement0.getDefaultNsUri());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.setRootNsContext(simpleOutputElement0);
      assertEquals(2, OutputElementBase.PREFIX_MISBOUND);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      EmptyNamespaceContext emptyNamespaceContext0 = EmptyNamespaceContext.getInstance();
      simpleOutputElement0.setRootNsContext(emptyNamespaceContext0);
      assertEquals(0, OutputElementBase.PREFIX_UNBOUND);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.checkAttrWrite("{a/lUn,i<810R", "{a/lUn,i<810R");
      try { 
        simpleOutputElement0.checkAttrWrite("{a/lUn,i<810R", "{a/lUn,i<810R");
        fail("Expecting exception: XMLStreamException");
      
      } catch(XMLStreamException e) {
         //
         // Duplicate attribute write for attribute '{{a/lUn,i<810R} {a/lUn,i<810R'
         //
         verifyException("com.ctc.wstx.sw.SimpleOutputElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild((String) null, (String) null, "M");
      String string0 = simpleOutputElement1.getNameDesc();
      assertFalse(simpleOutputElement1.isRoot());
      assertEquals("M", simpleOutputElement1.getNamespaceURI());
      assertEquals("#error", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild("qP;0", "qP;0", (String) null);
      String string0 = simpleOutputElement1.getNameDesc();
      assertEquals("qP;0:qP;0", string0);
      assertFalse(simpleOutputElement1.isRoot());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      String string0 = simpleOutputElement0.getNameDesc();
      assertEquals("#error", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      boolean boolean0 = simpleOutputElement0.isRoot();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.addPrefix("I/=U;zNVr(", "I/=U;zNVr(");
      simpleOutputElement0.reuseAsChild(simpleOutputElement0, "/K7", "/K7", "/K7");
      assertFalse(simpleOutputElement0.isRoot());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.checkAttrWrite("{com.ctc.wstx.sw.SimpleOutputElement$AttrName} com.ctc.wstx.sw.SimpleOutputElement$AttrName", "");
      assertNull(simpleOutputElement0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      // Undeclared exception!
      try { 
        simpleOutputElement0.getName();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // prefix cannot be \"null\" when creating a QName
         //
         verifyException("javax.xml.namespace.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.reuseAsChild(simpleOutputElement0, "com.ctc.wstx.sw.SimpleOutputElement$AttrName", "\"OOr$1*[|vy", "WAvDo'");
      simpleOutputElement0.getLocalName();
      assertFalse(simpleOutputElement0.isRoot());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      String string0 = simpleOutputElement0.getLocalName();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      String string0 = simpleOutputElement0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.getParent();
      assertNull(simpleOutputElement1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      String string0 = simpleOutputElement0.getPrefix();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      SimpleOutputElement simpleOutputElement1 = simpleOutputElement0.createChild("", "com.ctc.wstx.util.DataUtil", "7");
      String string0 = simpleOutputElement1.getNameDesc();
      assertEquals("7", simpleOutputElement1.getNamespaceURI());
      assertFalse(simpleOutputElement1.isRoot());
      assertEquals("com.ctc.wstx.util.DataUtil", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimpleOutputElement simpleOutputElement0 = SimpleOutputElement.createRoot();
      simpleOutputElement0.addToPool(simpleOutputElement0);
      boolean boolean0 = simpleOutputElement0.isRoot();
      assertFalse(boolean0);
  }
}
