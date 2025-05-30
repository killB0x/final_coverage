/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:54:39 GMT 2022
 */

package com.ctc.wstx.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ctc.wstx.util.EmptyNamespaceContext;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.events.Namespace;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmptyNamespaceContext_ESTest extends EmptyNamespaceContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyNamespaceContext emptyNamespaceContext0 = EmptyNamespaceContext.sInstance;
      Iterator<String> iterator0 = emptyNamespaceContext0.doGetPrefixes((String) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyNamespaceContext emptyNamespaceContext0 = EmptyNamespaceContext.sInstance;
      StringWriter stringWriter0 = new StringWriter(0);
      emptyNamespaceContext0.outputNamespaceDeclarations((Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyNamespaceContext emptyNamespaceContext0 = EmptyNamespaceContext.sInstance;
      String string0 = emptyNamespaceContext0.doGetNamespaceURI("http://www.w3.org/XML/1998/namespace");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmptyNamespaceContext emptyNamespaceContext0 = EmptyNamespaceContext.getInstance();
      String string0 = emptyNamespaceContext0.doGetPrefix("Element <{0}> has no attribute \"{1}\"");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmptyNamespaceContext emptyNamespaceContext0 = EmptyNamespaceContext.sInstance;
      emptyNamespaceContext0.outputNamespaceDeclarations((XMLStreamWriter) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmptyNamespaceContext emptyNamespaceContext0 = EmptyNamespaceContext.sInstance;
      Iterator<Namespace> iterator0 = emptyNamespaceContext0.getNamespaces();
      assertNotNull(iterator0);
  }
}
