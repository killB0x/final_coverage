/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 07:52:42 GMT 2022
 */

package com.github.lecogiteur.csvbang.pool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration;
import com.github.lecogiteur.csvbang.file.CsvFileContext;
import com.github.lecogiteur.csvbang.file.FileName;
import com.github.lecogiteur.csvbang.pool.SimpleCsvFilePool;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleCsvFilePool_ESTest extends SimpleCsvFilePool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      SimpleCsvFilePool simpleCsvFilePool0 = null;
      try {
        simpleCsvFilePool0 = new SimpleCsvFilePool(csvBangConfiguration0, (FileName) null, csvBangConfiguration0, csvBangConfiguration0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.lecogiteur.csvbang.pool.SimpleCsvFilePool", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      csvBangConfiguration0.init();
      SimpleCsvFilePool simpleCsvFilePool0 = new SimpleCsvFilePool(csvBangConfiguration0, csvBangConfiguration0.fileName, csvBangConfiguration0, csvBangConfiguration0);
      Collection<CsvFileContext> collection0 = simpleCsvFilePool0.getAllFiles();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      FileName fileName0 = new FileName(",", "");
      SimpleCsvFilePool simpleCsvFilePool0 = new SimpleCsvFilePool(csvBangConfiguration0, fileName0, csvBangConfiguration0, csvBangConfiguration0);
      simpleCsvFilePool0.setCustomHeader(fileName0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      csvBangConfiguration0.init();
      SimpleCsvFilePool simpleCsvFilePool0 = new SimpleCsvFilePool(csvBangConfiguration0, csvBangConfiguration0.fileName, csvBangConfiguration0, csvBangConfiguration0);
      simpleCsvFilePool0.setCustomFooter(csvBangConfiguration0);
      assertFalse(csvBangConfiguration0.isDisplayHeader);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      FileName fileName0 = new FileName("yyyyMMdd", "\n");
      Object object0 = new Object();
      SimpleCsvFilePool simpleCsvFilePool0 = new SimpleCsvFilePool(csvBangConfiguration0, fileName0, object0, csvBangConfiguration0);
      CsvFileContext csvFileContext0 = simpleCsvFilePool0.getFile((-1), (-1));
      assertFalse(csvFileContext0.isOpen());
  }
}
