/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 18:31:05 GMT 2022
 */

package se.sawano.java.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.text.Collator;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import se.sawano.java.text.AlphanumericComparator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AlphanumericComparator_ESTest extends AlphanumericComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '6';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Locale locale0 = new Locale("", "5", "");
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator(locale0);
      int int0 = alphanumericComparator0.compare((CharSequence) charBuffer0, (CharSequence) "5");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator();
      int int0 = alphanumericComparator0.compare((CharSequence) "pK!71%v0Kl-", (CharSequence) "pK!71%v0Kl-");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator();
      int int0 = alphanumericComparator0.compare((CharSequence) "W~a7u9s#'", (CharSequence) "W~a7u9s#'");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator();
      CharBuffer charBuffer0 = CharBuffer.allocate(5600);
      // Undeclared exception!
      alphanumericComparator0.compare((CharSequence) charBuffer0, (CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator();
      // Undeclared exception!
      try { 
        alphanumericComparator0.compare((CharSequence) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator();
      CharBuffer charBuffer0 = CharBuffer.allocate(1937);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.put('s');
      // Undeclared exception!
      try { 
        alphanumericComparator0.compare((CharSequence) charBuffer1, (CharSequence) charBuffer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = null;
      try {
        alphanumericComparator0 = new AlphanumericComparator((Collator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator();
      char[] charArray0 = new char[2];
      charArray0[0] = '{';
      charArray0[1] = '6';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = alphanumericComparator0.compare((CharSequence) "{00", (CharSequence) charBuffer0);
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Collator collator0 = Collator.getInstance();
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator(collator0);
      int int0 = alphanumericComparator0.compare((CharSequence) ")K*qu5", (CharSequence) ")K*qu5");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator();
      int int0 = alphanumericComparator0.compare((CharSequence) "0Q", (CharSequence) "R");
      assertEquals((-34), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = new AlphanumericComparator();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "jKI2#D", 0, 0);
      int int0 = alphanumericComparator0.compare((CharSequence) "jKI2#D", (CharSequence) charBuffer0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AlphanumericComparator alphanumericComparator0 = null;
      try {
        alphanumericComparator0 = new AlphanumericComparator((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
