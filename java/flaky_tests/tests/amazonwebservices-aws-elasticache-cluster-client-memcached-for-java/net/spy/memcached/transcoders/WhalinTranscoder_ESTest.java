/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 12:18:31 GMT 2022
 */

package net.spy.memcached.transcoders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import net.spy.memcached.CachedData;
import net.spy.memcached.transcoders.WhalinTranscoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WhalinTranscoder_ESTest extends WhalinTranscoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)49;
      Character character0 = whalinTranscoder0.decodeCharacter(byteArray0);
      assertEquals('1', (char)character0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[8];
      byteArray0[6] = (byte) (-54);
      Character character0 = whalinTranscoder0.decodeCharacter(byteArray0);
      assertEquals('\uCA00', (char)character0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      whalinTranscoder0.charset = "{Rl<XmM";
      // Undeclared exception!
      try { 
        whalinTranscoder0.encode("{Rl<XmM");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: {Rl<XmM
         //
         verifyException("net.spy.memcached.transcoders.BaseSerializingTranscoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      whalinTranscoder0.charset = null;
      StringBuffer stringBuffer0 = new StringBuffer(16384);
      // Undeclared exception!
      try { 
        whalinTranscoder0.encode(stringBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      // Undeclared exception!
      try { 
        whalinTranscoder0.encode((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Can't serialize null
         //
         verifyException("net.spy.memcached.transcoders.BaseSerializingTranscoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      // Undeclared exception!
      try { 
        whalinTranscoder0.encode(whalinTranscoder0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Non-serializable object
         //
         verifyException("net.spy.memcached.transcoders.BaseSerializingTranscoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      // Undeclared exception!
      try { 
        whalinTranscoder0.decodeCharacter((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.spy.memcached.transcoders.TranscoderUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      // Undeclared exception!
      try { 
        whalinTranscoder0.decodeBoolean((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.spy.memcached.transcoders.WhalinTranscoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      CachedData cachedData0 = whalinTranscoder0.encode("Wrong lenth for a boolean");
      WhalinTranscoder whalinTranscoder1 = new WhalinTranscoder();
      whalinTranscoder1.charset = "Wrong lenth for a boolean";
      // Undeclared exception!
      try { 
        whalinTranscoder1.decode(cachedData0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: Wrong lenth for a boolean
         //
         verifyException("net.spy.memcached.transcoders.BaseSerializingTranscoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      // Undeclared exception!
      try { 
        whalinTranscoder0.decode((CachedData) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.spy.memcached.transcoders.WhalinTranscoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[0];
      CachedData cachedData0 = new CachedData(8192, byteArray0, 4096);
      // Undeclared exception!
      try { 
        whalinTranscoder0.decode(cachedData0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Wrong length for a boolean
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = whalinTranscoder0.encodeBoolean(true);
      boolean boolean0 = whalinTranscoder0.decodeBoolean(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = whalinTranscoder0.decodeBoolean(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[1];
      CachedData cachedData0 = new CachedData(8192, byteArray0, 8192);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      MockDate mockDate0 = new MockDate((byte)49);
      byte[] byteArray0 = whalinTranscoder0.serialize(mockDate0);
      // Undeclared exception!
      try { 
        whalinTranscoder0.decodeBoolean(byteArray0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Wrong length for a boolean
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[2];
      CachedData cachedData0 = new CachedData(16384, byteArray0, 1402);
      whalinTranscoder0.compressionThreshold = (int) (byte) (-41);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      // Undeclared exception!
      try { 
        whalinTranscoder0.encode(object0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.zip.Deflater
         //
         verifyException("java.util.zip.GZIPOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      LocalDate localDate0 = MockLocalDate.now();
      CachedData cachedData0 = whalinTranscoder0.encode(localDate0);
      assertEquals(8, cachedData0.getFlags());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      CachedData cachedData0 = whalinTranscoder0.encode(16384);
      assertEquals(4, cachedData0.getFlags());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      CachedData cachedData0 = whalinTranscoder0.encode("{CachedData flags=1024 data=[-1, -1, -50, -63, 81, 14, 33, -32]}");
      assertEquals(32, cachedData0.getFlags());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = whalinTranscoder0.encodeBoolean(true);
      CachedData cachedData0 = new CachedData(8192, byteArray0, 8192);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      assertEquals(true, object0);
      
      CachedData cachedData1 = whalinTranscoder0.encode(object0);
      assertEquals(8192, cachedData1.getFlags());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[0];
      CachedData cachedData0 = new CachedData(4096, byteArray0, 4096);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      CachedData cachedData1 = whalinTranscoder0.encode(object0);
      assertEquals(4096, cachedData1.getFlags());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      StringBuilder stringBuilder0 = new StringBuilder(16384);
      CachedData cachedData0 = whalinTranscoder0.encode(stringBuilder0);
      whalinTranscoder0.decode(cachedData0);
      assertEquals(2048, cachedData0.getFlags());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      MockDate mockDate0 = new MockDate(0, 0, 0, (-56), 0, (-3731));
      CachedData cachedData0 = whalinTranscoder0.encode(mockDate0);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      assertTrue(object0.equals((Object)mockDate0));
      assertEquals(1024, cachedData0.getFlags());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[0];
      CachedData cachedData0 = new CachedData(512, byteArray0, 16384);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      CachedData cachedData1 = whalinTranscoder0.encode(object0);
      assertEquals(512, cachedData1.getFlags());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[1];
      CachedData cachedData0 = new CachedData(256, byteArray0, 16384);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      CachedData cachedData1 = whalinTranscoder0.encode(object0);
      assertEquals(256, cachedData1.getFlags());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[1];
      CachedData cachedData0 = new CachedData(128, byteArray0, 128);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      CachedData cachedData1 = whalinTranscoder0.encode(object0);
      assertEquals(128, cachedData1.getFlags());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      StringBuffer stringBuffer0 = new StringBuffer();
      CachedData cachedData0 = whalinTranscoder0.encode(stringBuffer0);
      whalinTranscoder0.decode(cachedData0);
      assertEquals(64, cachedData0.getFlags());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[2];
      CachedData cachedData0 = new CachedData(32, byteArray0, 16384);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      assertEquals("\u0000\u0000", object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[1];
      CachedData cachedData0 = new CachedData(16, byteArray0, 16);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      assertNotNull(object0);
      
      CachedData cachedData1 = whalinTranscoder0.encode(object0);
      assertEquals(16, cachedData1.getFlags());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[1];
      CachedData cachedData0 = new CachedData(1, byteArray0, 1);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      assertNotNull(object0);
      
      CachedData cachedData1 = whalinTranscoder0.encode(object0);
      assertEquals(1, cachedData1.getFlags());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = whalinTranscoder0.encodeBoolean(false);
      CachedData cachedData0 = new CachedData(1679, byteArray0, 408);
      whalinTranscoder0.decode(cachedData0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = new byte[4];
      CachedData cachedData0 = new CachedData((byte)38, byteArray0, (byte)18);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = whalinTranscoder0.encodeBoolean(false);
      CachedData cachedData0 = new CachedData(4, byteArray0, 1);
      Object object0 = whalinTranscoder0.decode(cachedData0);
      assertEquals(0, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      WhalinTranscoder whalinTranscoder0 = new WhalinTranscoder();
      byte[] byteArray0 = whalinTranscoder0.encodeBoolean(false);
      Character character0 = whalinTranscoder0.decodeCharacter(byteArray0);
      assertEquals('\u0000', (char)character0);
  }
}
