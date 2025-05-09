/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 20:16:31 GMT 2022
 */

package com.alipay.sofa.common.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alipay.sofa.common.log.SpaceInfo;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SpaceInfo_ESTest extends SpaceInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpaceInfo spaceInfo0 = new SpaceInfo();
      // Undeclared exception!
      try { 
        spaceInfo0.setProperty("Unsupported change logger level in ", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SpaceInfo spaceInfo0 = new SpaceInfo();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      hashMap0.put((Integer) null, (Integer) null);
      // Undeclared exception!
      try { 
        spaceInfo0.putAll(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SpaceInfo spaceInfo0 = new SpaceInfo();
      SpaceInfo spaceInfo1 = spaceInfo0.setProperty("com.alipay.sofa.common.log.LogSpace", "com.alipay.sofa.common.log.LogSpace");
      assertSame(spaceInfo1, spaceInfo0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SpaceInfo spaceInfo0 = new SpaceInfo();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      SpaceInfo spaceInfo1 = spaceInfo0.putAll(hashMap0);
      assertSame(spaceInfo1, spaceInfo0);
  }
}
