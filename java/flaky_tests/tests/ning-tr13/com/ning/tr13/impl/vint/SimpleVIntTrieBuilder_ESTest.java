/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 10:18:18 GMT 2022
 */

package com.ning.tr13.impl.vint;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ning.tr13.KeyValueSource;
import com.ning.tr13.build.ClosedTrieNodeFactory;
import com.ning.tr13.build.OpenTrieNode;
import com.ning.tr13.impl.vint.SimpleVIntTrieBuilder;
import java.io.FileNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleVIntTrieBuilder_ESTest extends SimpleVIntTrieBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        SimpleVIntTrieBuilder.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("USAGE: java ... [input-file] [output-file]");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "F(;Hg<9D2");
      stringArray0[0] = "USAGE: java ... [input-file] [output-file]";
      try { 
        SimpleVIntTrieBuilder.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeyValueSource<Long> keyValueSource0 = (KeyValueSource<Long>) mock(KeyValueSource.class, new ViolatedAssumptionAnswer());
      SimpleVIntTrieBuilder simpleVIntTrieBuilder0 = new SimpleVIntTrieBuilder(keyValueSource0, true);
      Long long0 = Long.valueOf((long) 1);
      OpenTrieNode<Long> openTrieNode0 = simpleVIntTrieBuilder0.constructOpenNode((byte)0, long0);
      assertEquals((byte)0, openTrieNode0.getNodeByte());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleVIntTrieBuilder simpleVIntTrieBuilder0 = new SimpleVIntTrieBuilder((KeyValueSource<Long>) null);
      Long long0 = new Long(0L);
      OpenTrieNode<Long> openTrieNode0 = simpleVIntTrieBuilder0.constructOpenNode((byte) (-13), long0);
      assertEquals((byte) (-13), openTrieNode0.getNodeByte());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "USAGE: java ... [input-file] [output-file]";
      try { 
        SimpleVIntTrieBuilder.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        SimpleVIntTrieBuilder.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      KeyValueSource<Long> keyValueSource0 = (KeyValueSource<Long>) mock(KeyValueSource.class, new ViolatedAssumptionAnswer());
      SimpleVIntTrieBuilder simpleVIntTrieBuilder0 = new SimpleVIntTrieBuilder(keyValueSource0, false);
      OpenTrieNode<Long> openTrieNode0 = simpleVIntTrieBuilder0.constructOpenNode((byte)42, (Long) null);
      assertEquals((byte)42, openTrieNode0.getNodeByte());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimpleVIntTrieBuilder simpleVIntTrieBuilder0 = new SimpleVIntTrieBuilder((KeyValueSource<Long>) null);
      ClosedTrieNodeFactory<Long> closedTrieNodeFactory0 = simpleVIntTrieBuilder0.closedTrieNodeFactory();
      assertNotNull(closedTrieNodeFactory0);
  }
}
