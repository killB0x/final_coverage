/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 23:03:38 GMT 2022
 */

package ch.digitalfondue.stampo.processor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.digitalfondue.stampo.processor.AlphaNumericStringComparator;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AlphaNumericStringComparator_ESTest extends AlphaNumericStringComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.US;
      AlphaNumericStringComparator alphaNumericStringComparator0 = new AlphaNumericStringComparator(locale0);
      int int0 = alphaNumericStringComparator0.compare("rfc{yqPI.uh0sRU1)", "E#mE>%dW5pU2IH2");
      assertEquals(45, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      AlphaNumericStringComparator alphaNumericStringComparator0 = new AlphaNumericStringComparator(locale0);
      // Undeclared exception!
      try { 
        alphaNumericStringComparator0.compare((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AlphaNumericStringComparator alphaNumericStringComparator0 = null;
      try {
        alphaNumericStringComparator0 = new AlphaNumericStringComparator((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.DecimalFormatSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      AlphaNumericStringComparator alphaNumericStringComparator0 = new AlphaNumericStringComparator(locale0);
      int int0 = alphaNumericStringComparator0.compare("L2i](|*2_,&slR;", "L");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      AlphaNumericStringComparator alphaNumericStringComparator0 = new AlphaNumericStringComparator(locale0);
      int int0 = alphaNumericStringComparator0.compare("9", "9P");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      AlphaNumericStringComparator alphaNumericStringComparator0 = new AlphaNumericStringComparator(locale0);
      int int0 = alphaNumericStringComparator0.compare(",&~6d/PoUD&B(A9", "Rz2&");
      assertEquals((-38), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale locale0 = new Locale(";'B\"<y_9", ";'B\"<y_9");
      AlphaNumericStringComparator alphaNumericStringComparator0 = new AlphaNumericStringComparator(locale0);
      int int0 = alphaNumericStringComparator0.compare(";'B\"<y_9", ";'B\"<y_9");
      assertEquals(0, int0);
  }
}
