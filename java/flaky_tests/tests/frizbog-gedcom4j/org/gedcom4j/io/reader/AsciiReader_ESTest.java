/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 22:19:46 GMT 2022
 */

package org.gedcom4j.io.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.io.reader.AsciiReader;
import org.gedcom4j.parser.GedcomParser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AsciiReader_ESTest extends AsciiReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, byteArrayInputStream0);
      String string0 = asciiReader0.nextLine();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("\u0000\u0005\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, (InputStream) null);
      // Undeclared exception!
      try { 
        asciiReader0.nextLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gedcom4j.io.reader.AsciiReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 1528);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, sequenceInputStream0);
      // Undeclared exception!
      try { 
        asciiReader0.nextLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-12);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, byteArrayInputStream0);
      try { 
        asciiReader0.nextLine();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Extended characters not supported in ASCII: 0xf4
         //
         verifyException("org.gedcom4j.io.reader.AsciiReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, byteArrayInputStream0);
      String string0 = asciiReader0.nextLine();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)13;
      byteArray0[3] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, byteArrayInputStream0);
      asciiReader0.nextLine();
      String string0 = asciiReader0.nextLine();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, byteArrayInputStream0);
      asciiReader0.nextLine();
      AsciiReader asciiReader1 = new AsciiReader(gedcomParser0, byteArrayInputStream0);
      asciiReader1.nextLine();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, byteArrayInputStream0);
      asciiReader0.nextLine();
      asciiReader0.nextLine();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GedcomParser gedcomParser0 = new GedcomParser();
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      AsciiReader asciiReader0 = new AsciiReader(gedcomParser0, byteArrayInputStream0);
      asciiReader0.cleanUp();
  }
}
