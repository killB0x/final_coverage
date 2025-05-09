/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 07:47:02 GMT 2022
 */

package com.github.lecogiteur.csvbang.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration;
import com.github.lecogiteur.csvbang.file.CsvFileContext;
import com.github.lecogiteur.csvbang.file.CsvFileWrapper;
import com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileReadyForWritingCsvFileState_ESTest extends FileReadyForWritingCsvFileState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState");
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      Object object0 = new Object();
      File file0 = MockFile.createTempFile("U`1qrw2", (String) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, csvFileWrapper0, csvFileWrapper0, object0);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, csvFileContext0);
      // Undeclared exception!
      try { 
        fileReadyForWritingCsvFileState0.write(csvFileContext0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("49kI");
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("49kI");
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, csvFileWrapper0, csvBangConfiguration0, mockFileOutputStream0);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, csvFileContext0);
      try { 
        fileReadyForWritingCsvFileState0.close(csvBangConfiguration0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // An error has occured when closed file
         //
         verifyException("com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("49kI");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("49kI");
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, (CsvFileContext) null);
      // Undeclared exception!
      try { 
        fileReadyForWritingCsvFileState0.close("49kI");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, (CsvFileWrapper) null, csvBangConfiguration0, (Object) null);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = null;
      try {
        fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState((CsvFileWrapper) null, csvBangConfiguration0, csvFileContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState");
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      Object object0 = new Object();
      File file0 = MockFile.createTempFile("U`1qrw2", (String) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, csvFileWrapper0, csvFileWrapper0, object0);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, csvFileContext0);
      fileReadyForWritingCsvFileState0.close(object0);
      fileReadyForWritingCsvFileState0.close((Object) null);
      assertTrue(fileReadyForWritingCsvFileState0.isOpen());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("Q)\"5iydSXABi=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Q)\"5iydSXABi=");
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, csvFileWrapper0, csvFileWrapper0, csvFileWrapper0);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, csvFileContext0);
      fileReadyForWritingCsvFileState0.close("Q)\"5iydSXABi=");
      try { 
        fileReadyForWritingCsvFileState0.write(csvBangConfiguration0, "\n");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // An error has occured [/home/user/Q)\"5iydSXABi=]: 
         //
         verifyException("com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("Q)\"5iydSXABi=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Q)\"5iydSXABi=");
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, csvFileWrapper0, csvFileWrapper0, csvFileWrapper0);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, csvFileContext0);
      fileReadyForWritingCsvFileState0.write(csvBangConfiguration0, "\n");
      assertTrue(fileReadyForWritingCsvFileState0.isOpen());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("3w9R_Zw(uChFk&_dv2");
      MockFile mockFile0 = new MockFile("~}Rl;pBWvv", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      Object object0 = new Object();
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, csvFileWrapper0, csvFileWrapper0, object0);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, csvFileContext0);
      fileReadyForWritingCsvFileState0.write(object0, "");
      assertTrue(fileReadyForWritingCsvFileState0.isOpen());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("3w9R_Zw(uChFk&_dv2");
      MockFile mockFile0 = new MockFile("~}Rl;pBWvv", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      Object object0 = new Object();
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, csvFileWrapper0, csvFileWrapper0, object0);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, csvFileContext0);
      boolean boolean0 = fileReadyForWritingCsvFileState0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CsvFileWrapper csvFileWrapper0 = new CsvFileWrapper("3w9R_Zw(uChFk&_dv2");
      MockFile mockFile0 = new MockFile("~}Rl;pBWvv", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      csvFileWrapper0.setOutputStream(mockFileOutputStream0);
      CsvBangConfiguration csvBangConfiguration0 = new CsvBangConfiguration();
      Object object0 = new Object();
      CsvFileContext csvFileContext0 = new CsvFileContext(csvBangConfiguration0, csvFileWrapper0, csvFileWrapper0, object0);
      FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState0 = new FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration0, csvFileContext0);
      fileReadyForWritingCsvFileState0.open((Object) null);
      assertTrue(fileReadyForWritingCsvFileState0.isOpen());
  }
}
