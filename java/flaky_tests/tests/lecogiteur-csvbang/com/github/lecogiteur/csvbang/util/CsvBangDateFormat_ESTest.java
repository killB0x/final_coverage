/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 07:51:46 GMT 2022
 */

package com.github.lecogiteur.csvbang.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.lecogiteur.csvbang.util.CsvBangDateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CsvBangDateFormat_ESTest extends CsvBangDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat("", locale0);
      csvBangDateFormat0.set((SimpleDateFormat) null);
      SimpleDateFormat simpleDateFormat0 = csvBangDateFormat0.get();
      assertNull(simpleDateFormat0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat("", (Locale) null);
      SimpleDateFormat simpleDateFormat0 = csvBangDateFormat0.initialValue();
      simpleDateFormat0.setLenient(false);
      csvBangDateFormat0.set(simpleDateFormat0);
      SimpleDateFormat simpleDateFormat1 = csvBangDateFormat0.get();
      assertSame(simpleDateFormat1, simpleDateFormat0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat((String) null);
      // Undeclared exception!
      try { 
        csvBangDateFormat0.initialValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat("HoY=3");
      // Undeclared exception!
      try { 
        csvBangDateFormat0.initialValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat("X^V~H83P%DWXZ");
      // Undeclared exception!
      try { 
        csvBangDateFormat0.get();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'V'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat("", locale0);
      SimpleDateFormat simpleDateFormat0 = csvBangDateFormat0.initialValue();
      assertTrue(simpleDateFormat0.isLenient());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat((String) null);
      // Undeclared exception!
      try { 
        csvBangDateFormat0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat("", locale0);
      csvBangDateFormat0.remove();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CsvBangDateFormat csvBangDateFormat0 = new CsvBangDateFormat("", (Locale) null);
      SimpleDateFormat simpleDateFormat0 = csvBangDateFormat0.get();
      assertTrue(simpleDateFormat0.isLenient());
  }
}
