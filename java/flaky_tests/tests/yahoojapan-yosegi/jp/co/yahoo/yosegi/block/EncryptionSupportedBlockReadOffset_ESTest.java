/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:20:27 GMT 2022
 */

package jp.co.yahoo.yosegi.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.nio.BufferUnderflowException;
import jp.co.yahoo.yosegi.block.EncryptionSupportedBlockReadOffset;
import jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData;
import jp.co.yahoo.yosegi.encryptor.AesGcmEncryptorFactory;
import jp.co.yahoo.yosegi.keystore.KeyStore;
import jp.co.yahoo.yosegi.message.parser.json.JacksonNullParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncryptionSupportedBlockReadOffset_ESTest extends EncryptionSupportedBlockReadOffset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((-513), 0, (-513), byteArray0, false, "jp.co.yahoo.yosegi.block.EncryptionSupportedBlockReadOffset");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(encryptionSupportedBlockReadOffset0.buffer);
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      int int0 = encryptionSupportedBlockReadOffset0.read(pipedInputStream0, additionalAuthenticationData0, (KeyStore) null, aesGcmEncryptorFactory0);
      assertEquals((-513), encryptionSupportedBlockReadOffset0.bufferStart);
      assertEquals(0, int0);
      assertEquals(0, encryptionSupportedBlockReadOffset0.encryptBinaryLength);
      assertEquals((-513), encryptionSupportedBlockReadOffset0.streamStart);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset(1882, 1882, (-1239), byteArray0, false, "n");
      MockFile mockFile0 = new MockFile("jp.co.yahoo.yosegi.block.EncryptionSupportedBlockReadOffset");
      File file0 = MockFile.createTempFile("j8C3#! `<BF-", "n", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(encryptionSupportedBlockReadOffset0.buffer);
      KeyStore keyStore0 = new KeyStore();
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      int int0 = encryptionSupportedBlockReadOffset0.read(mockFileInputStream0, additionalAuthenticationData0, keyStore0, aesGcmEncryptorFactory0);
      assertEquals(1882, int0);
      assertEquals((-1239), encryptionSupportedBlockReadOffset0.bufferStart);
      assertEquals(1882, encryptionSupportedBlockReadOffset0.streamStart);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((-3205), (-3205), 191, byteArray0, false, "");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(encryptionSupportedBlockReadOffset0.buffer, encryptionSupportedBlockReadOffset0.buffer);
      assertFalse(encryptionSupportedBlockReadOffset0.isEncrypt);
      
      KeyStore keyStore0 = new KeyStore();
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      int int0 = encryptionSupportedBlockReadOffset0.read(pipedInputStream0, additionalAuthenticationData0, keyStore0, aesGcmEncryptorFactory0);
      assertEquals((-3205), int0);
      assertEquals(191, encryptionSupportedBlockReadOffset0.bufferStart);
      assertEquals((-3205), encryptionSupportedBlockReadOffset0.streamStart);
      assertEquals((-3205), encryptionSupportedBlockReadOffset0.encryptBinaryLength);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((-1837), 0, (-1810), byteArray0, true, "!BX]KT.@A,*33T^aC_>");
      int int0 = encryptionSupportedBlockReadOffset0.getEncryptBinaryLength();
      assertEquals(0, int0);
      assertEquals((-1837), encryptionSupportedBlockReadOffset0.streamStart);
      assertTrue(encryptionSupportedBlockReadOffset0.isEncrypt);
      assertEquals((-1810), encryptionSupportedBlockReadOffset0.bufferStart);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset(0, 514, 514, byteArray0, true, (String) null);
      int int0 = encryptionSupportedBlockReadOffset0.getEncryptBinaryLength();
      assertEquals(514, int0);
      assertTrue(encryptionSupportedBlockReadOffset0.isEncrypt);
      assertEquals(0, encryptionSupportedBlockReadOffset0.streamStart);
      assertEquals(514, encryptionSupportedBlockReadOffset0.bufferStart);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset(11, 0, (-166), byteArray0, true, "");
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(encryptionSupportedBlockReadOffset0.buffer);
      KeyStore keyStore0 = new KeyStore();
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      // Undeclared exception!
      try { 
        encryptionSupportedBlockReadOffset0.read((InputStream) null, additionalAuthenticationData0, keyStore0, aesGcmEncryptorFactory0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((-1284), (-1284), (-1284), byteArray0, true, "{us\"wbVXD)$A");
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(encryptionSupportedBlockReadOffset0.buffer, byteArray0);
      KeyStore keyStore0 = new KeyStore();
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      // Undeclared exception!
      try { 
        encryptionSupportedBlockReadOffset0.read((InputStream) null, additionalAuthenticationData0, keyStore0, aesGcmEncryptorFactory0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1284
         //
         verifyException("jp.co.yahoo.yosegi.block.EncryptionSupportedBlockReadOffset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      KeyStore keyStore0 = new KeyStore();
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((-1636), 8, (-1636), byteArray0, false, "");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      // Undeclared exception!
      try { 
        encryptionSupportedBlockReadOffset0.read(pipedInputStream0, additionalAuthenticationData0, keyStore0, aesGcmEncryptorFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((byte)3, (byte)8, (byte)16, byteArray0, true, (String) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      JacksonNullParser jacksonNullParser0 = new JacksonNullParser();
      KeyStore keyStore0 = KeyStore.createFromParser(jacksonNullParser0);
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      try { 
        encryptionSupportedBlockReadOffset0.read(byteArrayInputStream0, additionalAuthenticationData0, keyStore0, aesGcmEncryptorFactory0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // java.lang.IllegalArgumentException: Invalid buffer arguments
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AesGcmEncryptor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((-513), 0, (-513), byteArray0, false, "jp.co.yahoo.yosegi.block.EncryptionSupportedBlockReadOffset");
      // Undeclared exception!
      try { 
        encryptionSupportedBlockReadOffset0.compareTo((EncryptionSupportedBlockReadOffset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.block.EncryptionSupportedBlockReadOffset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0);
      KeyStore keyStore0 = new KeyStore();
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset(3228, 3228, 3228, byteArray0, false, "@Fu|");
      // Undeclared exception!
      try { 
        encryptionSupportedBlockReadOffset0.read((InputStream) null, additionalAuthenticationData0, keyStore0, aesGcmEncryptorFactory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.util.io.InputStreamUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset(3968, (byte)16, (-2388), byteArray0, true, ">J`/jQK@");
      KeyStore keyStore0 = new KeyStore();
      AesGcmEncryptorFactory aesGcmEncryptorFactory0 = new AesGcmEncryptorFactory();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-127), 14);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0);
      // Undeclared exception!
      try { 
        encryptionSupportedBlockReadOffset0.read(sequenceInputStream0, additionalAuthenticationData0, keyStore0, aesGcmEncryptorFactory0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((-1), (-1), (-3084), byteArray0, false, "\"TzF>rW-");
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset1 = new EncryptionSupportedBlockReadOffset(7, (-1), (-1), byteArray0, false, "\"TzF>rW-");
      int int0 = encryptionSupportedBlockReadOffset0.compareTo(encryptionSupportedBlockReadOffset1);
      assertEquals((-3084), encryptionSupportedBlockReadOffset0.bufferStart);
      assertFalse(encryptionSupportedBlockReadOffset1.isEncrypt);
      assertEquals((-1), encryptionSupportedBlockReadOffset1.encryptBinaryLength);
      assertEquals(7, encryptionSupportedBlockReadOffset1.streamStart);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset(1882, 1882, (-1239), byteArray0, false, "n");
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset1 = new EncryptionSupportedBlockReadOffset((byte)8, 3328, 2067, byteArray0, false, "n");
      int int0 = encryptionSupportedBlockReadOffset0.compareTo(encryptionSupportedBlockReadOffset1);
      assertEquals(2067, encryptionSupportedBlockReadOffset1.bufferStart);
      assertEquals(1, int0);
      assertFalse(encryptionSupportedBlockReadOffset1.isEncrypt);
      assertEquals(8, encryptionSupportedBlockReadOffset1.streamStart);
      assertEquals(3328, encryptionSupportedBlockReadOffset1.encryptBinaryLength);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset((-3205), (-3205), 191, byteArray0, false, "");
      int int0 = encryptionSupportedBlockReadOffset0.getEncryptBinaryLength();
      assertFalse(encryptionSupportedBlockReadOffset0.isEncrypt);
      assertEquals(191, encryptionSupportedBlockReadOffset0.bufferStart);
      assertEquals((-3205), encryptionSupportedBlockReadOffset0.streamStart);
      assertEquals((-3205), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      EncryptionSupportedBlockReadOffset encryptionSupportedBlockReadOffset0 = new EncryptionSupportedBlockReadOffset(3968, (byte)16, (-2388), byteArray0, true, ">J`/jQK@");
      int int0 = encryptionSupportedBlockReadOffset0.compareTo(encryptionSupportedBlockReadOffset0);
      assertEquals((-2388), encryptionSupportedBlockReadOffset0.bufferStart);
      assertEquals(16, encryptionSupportedBlockReadOffset0.encryptBinaryLength);
      assertEquals(0, int0);
      assertEquals(3968, encryptionSupportedBlockReadOffset0.streamStart);
      assertTrue(encryptionSupportedBlockReadOffset0.isEncrypt);
  }
}
