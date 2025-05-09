/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 08:18:22 GMT 2022
 */

package com.galdosinc.glib.gml.schema;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.galdosinc.glib.gml.schema.DomSchemaErrorHandler;
import javax.xml.parsers.FactoryConfigurationError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DomSchemaErrorHandler_ESTest extends DomSchemaErrorHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DomSchemaErrorHandler domSchemaErrorHandler0 = new DomSchemaErrorHandler();
      assertFalse(domSchemaErrorHandler0.hasErrors());
      
      domSchemaErrorHandler0.error("", "GswGggMa", "");
      assertTrue(domSchemaErrorHandler0.hasErrors());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DomSchemaErrorHandler domSchemaErrorHandler0 = new DomSchemaErrorHandler();
      assertFalse(domSchemaErrorHandler0.hasErrors());
      
      domSchemaErrorHandler0.error("http://www.w3.org/2000/xmlns/", "http://www.w3.org/2000/xmlns/", "");
      boolean boolean0 = domSchemaErrorHandler0.hasErrors();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DomSchemaErrorHandler domSchemaErrorHandler0 = new DomSchemaErrorHandler();
      // Undeclared exception!
      try { 
        domSchemaErrorHandler0.toDomDocument();
        fail("Expecting exception: FactoryConfigurationError");
      
      } catch(FactoryConfigurationError e) {
         //
         // Provider org.apache.xerces.jaxp.DocumentBuilderFactoryImpl not found
         //
         verifyException("javax.xml.parsers.FactoryFinder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DomSchemaErrorHandler domSchemaErrorHandler0 = new DomSchemaErrorHandler();
      // Undeclared exception!
      try { 
        domSchemaErrorHandler0.error((String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.galdosinc.glib.xml.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DomSchemaErrorHandler domSchemaErrorHandler0 = new DomSchemaErrorHandler();
      assertFalse(domSchemaErrorHandler0.hasErrors());
      
      domSchemaErrorHandler0.error("", "", "");
      domSchemaErrorHandler0.error("", "", "");
      assertTrue(domSchemaErrorHandler0.hasErrors());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DomSchemaErrorHandler domSchemaErrorHandler0 = new DomSchemaErrorHandler();
      // Undeclared exception!
      try { 
        domSchemaErrorHandler0.toDomElement();
        fail("Expecting exception: FactoryConfigurationError");
      
      } catch(FactoryConfigurationError e) {
         //
         // Provider org.apache.xerces.jaxp.DocumentBuilderFactoryImpl not found
         //
         verifyException("javax.xml.parsers.FactoryFinder", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DomSchemaErrorHandler domSchemaErrorHandler0 = new DomSchemaErrorHandler();
      assertFalse(domSchemaErrorHandler0.hasErrors());
      
      domSchemaErrorHandler0.error("");
      assertTrue(domSchemaErrorHandler0.hasErrors());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DomSchemaErrorHandler domSchemaErrorHandler0 = new DomSchemaErrorHandler();
      boolean boolean0 = domSchemaErrorHandler0.hasErrors();
      assertFalse(boolean0);
  }
}
