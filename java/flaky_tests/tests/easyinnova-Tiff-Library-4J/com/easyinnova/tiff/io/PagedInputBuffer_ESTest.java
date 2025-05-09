/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:09:43 GMT 2022
 */

package com.easyinnova.tiff.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.easyinnova.tiff.io.PagedInputBuffer;
import com.easyinnova.tiff.io.TiffInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PagedInputBuffer_ESTest extends PagedInputBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PagedInputBuffer pagedInputBuffer0 = new PagedInputBuffer((TiffInputStream) null);
      // Undeclared exception!
      try { 
        pagedInputBuffer0.seek(479L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.InputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PagedInputBuffer pagedInputBuffer0 = new PagedInputBuffer((TiffInputStream) null);
      // Undeclared exception!
      try { 
        pagedInputBuffer0.read(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.InputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PagedInputBuffer pagedInputBuffer0 = new PagedInputBuffer((TiffInputStream) null);
      // Undeclared exception!
      try { 
        pagedInputBuffer0.readByte(2147483647L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.InputBuffer", e);
      }
  }
}
