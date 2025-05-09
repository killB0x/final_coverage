/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 03:25:28 GMT 2022
 */

package io.configrd.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.configrd.core.util.URITraverse;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class URITraverse_ESTest extends URITraverse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URITraverse uRITraverse0 = new URITraverse(uRI0);
      String string0 = uRITraverse0.at(0);
      assertEquals("ftp://foo.bar/", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URITraverse uRITraverse0 = null;
      try {
        uRITraverse0 = new URITraverse((URI) null, "X\"eN-oX}8-I~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URITraverse uRITraverse0 = null;
      try {
        uRITraverse0 = new URITraverse((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URITraverse uRITraverse0 = new URITraverse(uRI0, "<[9");
      assertTrue(uRITraverse0.hasNextUp());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URITraverse uRITraverse0 = new URITraverse(uRI0);
      // Undeclared exception!
      try { 
        uRITraverse0.at((-1370));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -1370
         //
         verifyException("java.util.Arrays", e);
      }
  }
}
