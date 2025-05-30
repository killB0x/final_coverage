/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:30:43 GMT 2022
 */

package net.named_data.jndn.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import net.named_data.jndn.util.Blob;
import net.named_data.jndn.util.SignedBlob;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SignedBlob_ESTest extends SignedBlob_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(5311);
      SignedBlob signedBlob0 = new SignedBlob(byteBuffer0, false, 311, 0);
      assertFalse(signedBlob0.isNull());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SignedBlob signedBlob0 = new SignedBlob();
      SignedBlob signedBlob1 = new SignedBlob(signedBlob0, (-2214), 0);
      assertTrue(signedBlob1.isNull());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SignedBlob signedBlob0 = new SignedBlob(byteArray0, false, 0, 1);
      int int0 = signedBlob0.signedSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SignedBlob signedBlob0 = null;
      try {
        signedBlob0 = new SignedBlob((byte[]) null, false, (byte) (-20), (byte) (-20));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SignedBlob signedBlob0 = null;
      try {
        signedBlob0 = new SignedBlob((SignedBlob) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.util.SignedBlob", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Blob blob0 = new Blob("3]]o0Jfj");
      SignedBlob signedBlob0 = null;
      try {
        signedBlob0 = new SignedBlob(blob0, (-2481), (-2481));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // newPosition < 0: (-2481 < 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(225);
      byteBuffer0.getChar();
      SignedBlob signedBlob0 = null;
      try {
        signedBlob0 = new SignedBlob(byteBuffer0, false, 225, 225);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // newPosition > limit: (225 > 223)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SignedBlob signedBlob0 = new SignedBlob(byteArray0, false, 0, 1);
      ByteBuffer byteBuffer0 = signedBlob0.signedBuf();
      assertEquals(1, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SignedBlob signedBlob0 = new SignedBlob();
      ByteBuffer byteBuffer0 = signedBlob0.signedBuf();
      assertNull(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SignedBlob signedBlob0 = new SignedBlob();
      int int0 = signedBlob0.signedSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SignedBlob signedBlob0 = new SignedBlob();
      SignedBlob signedBlob1 = new SignedBlob(signedBlob0);
      assertTrue(signedBlob1.isNull());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SignedBlob signedBlob0 = null;
      try {
        signedBlob0 = new SignedBlob(byteArray0, false, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // newPosition > limit: (1 > 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }
}
