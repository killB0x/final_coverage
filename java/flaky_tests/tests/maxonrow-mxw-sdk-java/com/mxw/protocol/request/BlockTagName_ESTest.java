/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 09:25:54 GMT 2022
 */

package com.mxw.protocol.request;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mxw.protocol.request.BlockTagName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BlockTagName_ESTest extends BlockTagName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockTagName blockTagName0 = BlockTagName.fromString("LATEST");
      assertEquals(BlockTagName.LATEST, blockTagName0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BlockTagName[] blockTagNameArray0 = BlockTagName.values();
      assertEquals(3, blockTagNameArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BlockTagName blockTagName0 = BlockTagName.valueOf("EARLIEST");
      assertEquals(BlockTagName.EARLIEST, blockTagName0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BlockTagName blockTagName0 = BlockTagName.fromString("pending");
      assertEquals(BlockTagName.PENDING, blockTagName0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        BlockTagName.fromString(";vn>fvlzx>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.mxw.protocol.request.BlockTagName.;vn>fvlzx>
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        BlockTagName.fromString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BlockTagName blockTagName0 = BlockTagName.PENDING;
      String string0 = blockTagName0.getValue();
      assertEquals("pending", string0);
  }
}
