/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 03:22:10 GMT 2022
 */

package org.dnal.api.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.dnal.api.bean.DNALLoader;
import org.dnal.api.bean.FieldConverter;
import org.dnal.api.impl.CompilerImpl;
import org.dnal.core.DValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DNALLoader_ESTest extends DNALLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      dNALLoader0.initCompiler();
      dNALLoader0.dumpErrors();
      assertTrue(dNALLoader0.isCloneMainDataSet());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      dNALLoader0.initCompiler();
      // Undeclared exception!
      try { 
        dNALLoader0.dump();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      assertTrue(dNALLoader0.isCloneMainDataSet());
      
      dNALLoader0.setCloneMainDataSet(false);
      boolean boolean0 = dNALLoader0.isCloneMainDataSet();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      dNALLoader0.initCompiler();
      dNALLoader0.getErrorTracker();
      assertTrue(dNALLoader0.isCloneMainDataSet());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.dumpAsDNAL();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      CompilerImpl compilerImpl0 = new CompilerImpl();
      dNALLoader0.compiler = compilerImpl0;
      // Undeclared exception!
      try { 
        dNALLoader0.loadTypeDefinitionFromString((String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/dnal/api/impl/SourceCompiler
         //
         verifyException("org.dnal.api.impl.CompilerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.doBeginNewDataSet(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      try { 
        dNALLoader0.createFromBean((String) null, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null passed to createFromBean()
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.createFromBean("{'Y)Xb<;Ncm<", "{'Y)Xb<;Ncm<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.ReflectionBeanLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.doBeginNewDataSet(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      dNALLoader0.setFieldConverter((FieldConverter) null);
      assertTrue(dNALLoader0.isCloneMainDataSet());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      dNALLoader0.getFieldConverter();
      assertTrue(dNALLoader0.isCloneMainDataSet());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      boolean boolean0 = dNALLoader0.isCloneMainDataSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      dNALLoader0.initCompiler();
      // Undeclared exception!
      try { 
        dNALLoader0.loadTypeDefinition("k`l},yHdj");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/dnal/api/impl/SourceCompiler
         //
         verifyException("org.dnal.api.impl.CompilerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.getErrorTracker();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.addTopLevelValue("", (DValue) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      dNALLoader0.setCloneMainDataSet(false);
      // Undeclared exception!
      try { 
        dNALLoader0.doBeginNewDataSet(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.beginNewDataSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.commit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      dNALLoader0.getDataSet();
      assertTrue(dNALLoader0.isCloneMainDataSet());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DNALLoader dNALLoader0 = new DNALLoader();
      // Undeclared exception!
      try { 
        dNALLoader0.dumpErrors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.bean.DNALLoader", e);
      }
  }
}
