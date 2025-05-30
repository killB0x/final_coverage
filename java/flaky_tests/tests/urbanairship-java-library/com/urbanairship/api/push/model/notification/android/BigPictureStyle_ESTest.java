/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 18:28:06 GMT 2022
 */

package com.urbanairship.api.push.model.notification.android;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.urbanairship.api.push.model.notification.android.BigPictureStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BigPictureStyle_ESTest extends BigPictureStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigPictureStyle.Builder bigPictureStyle_Builder0 = new BigPictureStyle.Builder();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BigPictureStyle.Builder bigPictureStyle_Builder0 = BigPictureStyle.newBuilder();
      // Undeclared exception!
      try { 
        bigPictureStyle_Builder0.build();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.urbanairship.api.push.model.notification.android.BigPictureStyle$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BigPictureStyle.Builder bigPictureStyle_Builder0 = BigPictureStyle.newBuilder();
      BigPictureStyle.Builder bigPictureStyle_Builder1 = bigPictureStyle_Builder0.setTitle((String) null);
      assertSame(bigPictureStyle_Builder0, bigPictureStyle_Builder1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BigPictureStyle.Builder bigPictureStyle_Builder0 = BigPictureStyle.newBuilder();
      BigPictureStyle.Builder bigPictureStyle_Builder1 = bigPictureStyle_Builder0.setSummary("2s@|%]5Pfe");
      assertSame(bigPictureStyle_Builder1, bigPictureStyle_Builder0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BigPictureStyle.Builder bigPictureStyle_Builder0 = BigPictureStyle.newBuilder();
      BigPictureStyle.Builder bigPictureStyle_Builder1 = bigPictureStyle_Builder0.setContent((String) null);
      assertSame(bigPictureStyle_Builder1, bigPictureStyle_Builder0);
  }
}
