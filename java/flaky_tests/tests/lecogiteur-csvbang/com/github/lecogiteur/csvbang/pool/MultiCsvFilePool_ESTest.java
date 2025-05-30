/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 07:41:08 GMT 2022
 */

package com.github.lecogiteur.csvbang.pool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration;
import com.github.lecogiteur.csvbang.file.CsvFileContext;
import com.github.lecogiteur.csvbang.file.FileName;
import com.github.lecogiteur.csvbang.pool.MultiCsvFilePool;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultiCsvFilePool_ESTest extends MultiCsvFilePool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      FileName fileName0 = new FileName("No file available in pool for update. The maximum number files [%s] has been already created and are full.", (String) null);
      Object object0 = new Object();
      csvBangConfiguration0.maxFile = (long) '\\';
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, fileName0, object0, "No file available in pool for update. The maximum number files [%s] has been already created and are full.");
      csvBangConfiguration0.maxFileSize = (long) '#';
      CsvFileContext csvFileContext0 = multiCsvFilePool0.getFile((-1), (-1));
      CsvFileContext csvFileContext1 = multiCsvFilePool0.getFile('#', '#');
      assertSame(csvFileContext1, csvFileContext0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      FileName fileName0 = new FileName("yyyyMMdd", (String) null);
      Object object0 = new Object();
      csvBangConfiguration0.maxFile = (long) '\\';
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, fileName0, object0, "");
      csvBangConfiguration0.maxRecordByFile = (long) '#';
      CsvFileContext csvFileContext0 = multiCsvFilePool0.getFile(34, 34);
      CsvFileContext csvFileContext1 = multiCsvFilePool0.getFile(1, (-1));
      assertSame(csvFileContext1, csvFileContext0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      FileName fileName0 = new FileName("No file available in pool for update. The maximum number files [%s] has been already created and are full.", (String) null);
      Object object0 = new Object();
      csvBangConfiguration0.maxFile = (long) '\\';
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, fileName0, object0, "No file available in pool for update. The maximum number files [%s] has been already created and are full.");
      csvBangConfiguration0.maxFileSize = (long) '#';
      CsvFileContext csvFileContext0 = multiCsvFilePool0.getFile('#', '#');
      CsvFileContext csvFileContext1 = multiCsvFilePool0.getFile((-1), 0);
      assertSame(csvFileContext1, csvFileContext0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      FileName fileName0 = new FileName("yyyyMMdd", (String) null);
      Object object0 = new Object();
      csvBangConfiguration0.maxFile = (long) '\\';
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, fileName0, object0, "");
      csvBangConfiguration0.maxRecordByFile = (long) '#';
      CsvFileContext csvFileContext0 = multiCsvFilePool0.getFile(34, 34);
      CsvFileContext csvFileContext1 = multiCsvFilePool0.getFile(34, (-1));
      assertNotSame(csvFileContext1, csvFileContext0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, (FileName) null, csvBangConfiguration0, csvBangConfiguration0);
      try { 
        multiCsvFilePool0.getFile((-1), (-1));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No file available in pool for update. The maximum number files [-1] has been already created and are full.
         //
         verifyException("com.github.lecogiteur.csvbang.pool.MultiCsvFilePool", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      csvBangConfiguration0.maxFile = (long) '\\';
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, (FileName) null, csvBangConfiguration0, csvBangConfiguration0);
      // Undeclared exception!
      try { 
        multiCsvFilePool0.getFile((-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.lecogiteur.csvbang.pool.MultiCsvFilePool", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      Object object0 = new Object();
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, csvBangConfiguration0.fileName, object0, "No file available in pool for update. The maximum number files [%s] has been already created and are full.");
      Collection<CsvFileContext> collection0 = multiCsvFilePool0.getAllFiles();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, (FileName) null, csvBangConfiguration0, csvBangConfiguration0);
      multiCsvFilePool0.setCustomFooter(csvBangConfiguration0);
      assertFalse(csvBangConfiguration0.isDisplayHeader);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      MultiCsvFilePool multiCsvFilePool0 = new MultiCsvFilePool(csvBangConfiguration0, (FileName) null, csvBangConfiguration0, csvBangConfiguration0);
      multiCsvFilePool0.setCustomHeader(csvBangConfiguration0);
      assertEquals('#', csvBangConfiguration0.commentCharacter);
  }
}
