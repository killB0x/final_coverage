/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:36:41 GMT 2022
 */

package io.muserver.handlers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.muserver.handlers.AsyncFileProvider;
import io.muserver.handlers.DirectoryLister;
import io.muserver.handlers.ResourceProvider;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DirectoryLister_ESTest extends DirectoryLister_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("EH5$vPtFm$[*");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0);
      Path path0 = mockFile0.toPath();
      AsyncFileProvider asyncFileProvider0 = new AsyncFileProvider(path0, "EH5$vPtFm$[*");
      DirectoryLister directoryLister0 = new DirectoryLister(mockFileWriter0, asyncFileProvider0, "EH5$vPtFm$[*", "0Q}T+#pQ/", ":DkhE}4{!2UOQWp", (DateTimeFormatter) null);
      try { 
        directoryLister0.render();
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      AsyncFileProvider asyncFileProvider0 = new AsyncFileProvider(path0, "");
      DirectoryLister directoryLister0 = new DirectoryLister(stringWriter0, asyncFileProvider0, "", "", "", (DateTimeFormatter) null);
      // Undeclared exception!
      try { 
        directoryLister0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.muserver.handlers.DirectoryLister", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.BASIC_ISO_DATE;
      DirectoryLister directoryLister0 = new DirectoryLister(pipedWriter0, (ResourceProvider) null, "RKt", "RKt", "RKt", dateTimeFormatter0);
      try { 
        directoryLister0.render();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ISO_INSTANT;
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      AsyncFileProvider asyncFileProvider0 = new AsyncFileProvider(path0, "");
      DirectoryLister directoryLister0 = new DirectoryLister(stringWriter0, asyncFileProvider0, "", "", "", dateTimeFormatter0);
      directoryLister0.render();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ISO_DATE;
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      AsyncFileProvider asyncFileProvider0 = new AsyncFileProvider(path0, "");
      DirectoryLister directoryLister0 = new DirectoryLister(stringWriter0, asyncFileProvider0, "", "", "", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        directoryLister0.render();
        fail("Expecting exception: UnsupportedTemporalTypeException");
      
      } catch(UnsupportedTemporalTypeException e) {
         //
         // Unsupported field: Year
         //
         verifyException("java.time.Instant", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ISO_ZONED_DATE_TIME;
      DirectoryLister directoryLister0 = new DirectoryLister(stringWriter0, (ResourceProvider) null, "", "", "", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        directoryLister0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.muserver.handlers.DirectoryLister", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ISO_LOCAL_DATE;
      DirectoryLister directoryLister0 = new DirectoryLister(stringWriter0, (ResourceProvider) null, "Y[=)%O:Ki*,", "Y[=)%O:Ki*,", "Y[=)%O:Ki*,", dateTimeFormatter0);
      // Undeclared exception!
      try { 
        directoryLister0.render();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URLDecoder: Illegal hex characters in escape (%) pattern - Error at index 0 in: \"O:\"
         //
         verifyException("java.net.URLDecoder", e);
      }
  }
}
