/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 10:11:11 GMT 2022
 */

package com.ning.tr13.build;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ning.tr13.KeyValueSource;
import com.ning.tr13.TrieConstants;
import com.ning.tr13.build.SimpleTrieBuilder;
import com.ning.tr13.build.TrieNode;
import com.ning.tr13.impl.bytes.SimpleBytesTrieBuilder;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleTrieBuilder_ESTest extends SimpleTrieBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = SimpleTrieBuilder.sizeDesc(2000000L);
      assertEquals("2.0MB", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = SimpleTrieBuilder.sizeDesc(2000L);
      assertEquals("2.0kB", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeyValueSource<byte[]> keyValueSource0 = (KeyValueSource<byte[]>) mock(KeyValueSource.class, new ViolatedAssumptionAnswer());
      SimpleBytesTrieBuilder simpleBytesTrieBuilder0 = new SimpleBytesTrieBuilder(keyValueSource0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(": id '");
      // Undeclared exception!
      try { 
        simpleBytesTrieBuilder0.buildAndWrite(mockFileOutputStream0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ning.tr13.impl.bytes.BytesNodeFactory$SimpleLeaf", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleBytesTrieBuilder simpleBytesTrieBuilder0 = new SimpleBytesTrieBuilder((KeyValueSource<byte[]>) null);
      SimpleTrieBuilder<byte[]> simpleTrieBuilder0 = simpleBytesTrieBuilder0.setReorderEntries(true);
      assertEquals(6, TrieConstants.FIRST_BYTE_BITS_FOR_LEAVES);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleBytesTrieBuilder simpleBytesTrieBuilder0 = new SimpleBytesTrieBuilder((KeyValueSource<byte[]>) null);
      // Undeclared exception!
      try { 
        simpleBytesTrieBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ning.tr13.build.SimpleTrieBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KeyValueSource<byte[]> keyValueSource0 = (KeyValueSource<byte[]>) mock(KeyValueSource.class, new ViolatedAssumptionAnswer());
      SimpleBytesTrieBuilder simpleBytesTrieBuilder0 = new SimpleBytesTrieBuilder(keyValueSource0);
      TrieNode<byte[]> trieNode0 = simpleBytesTrieBuilder0.build();
      assertNotNull(trieNode0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = SimpleTrieBuilder.sizeDesc(2000026L);
      assertEquals("2.0MB", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = SimpleTrieBuilder.sizeDesc((-395L));
      assertEquals("-395", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      KeyValueSource<byte[]> keyValueSource0 = (KeyValueSource<byte[]>) mock(KeyValueSource.class, new ViolatedAssumptionAnswer());
      SimpleBytesTrieBuilder simpleBytesTrieBuilder0 = new SimpleBytesTrieBuilder(keyValueSource0, false);
      // Undeclared exception!
      try { 
        simpleBytesTrieBuilder0.buildAndWrite((OutputStream) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ning.tr13.impl.bytes.BytesNodeFactory$SimpleLeaf", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      KeyValueSource<byte[]> keyValueSource0 = (KeyValueSource<byte[]>) mock(KeyValueSource.class, new ViolatedAssumptionAnswer());
      SimpleBytesTrieBuilder simpleBytesTrieBuilder0 = new SimpleBytesTrieBuilder(keyValueSource0, true);
      // Undeclared exception!
      try { 
        simpleBytesTrieBuilder0.buildAndWrite((OutputStream) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ning.tr13.impl.bytes.BytesNodeFactory$SimpleLeaf", e);
      }
  }
}
