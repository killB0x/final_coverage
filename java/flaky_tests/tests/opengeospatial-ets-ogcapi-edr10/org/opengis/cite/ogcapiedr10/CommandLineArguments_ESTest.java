/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 11:01:02 GMT 2022
 */

package org.opengis.cite.ogcapiedr10;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.opengis.cite.ogcapiedr10.CommandLineArguments;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CommandLineArguments_ESTest extends CommandLineArguments_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CommandLineArguments commandLineArguments0 = new CommandLineArguments();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("test-run-props.xml");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "user.home");
      File file0 = commandLineArguments0.getPropertiesFile();
      assertFalse(commandLineArguments0.doDeleteSubjectOnFinish());
      assertTrue(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CommandLineArguments commandLineArguments0 = new CommandLineArguments();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("test-run-props.xml");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = commandLineArguments0.getPropertiesFile();
      assertFalse(commandLineArguments0.doDeleteSubjectOnFinish());
      assertEquals("test-run-props.xml", file0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CommandLineArguments commandLineArguments0 = new CommandLineArguments();
      String string0 = commandLineArguments0.getOutputDir();
      assertFalse(commandLineArguments0.doDeleteSubjectOnFinish());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CommandLineArguments commandLineArguments0 = new CommandLineArguments();
      File file0 = commandLineArguments0.getPropertiesFile();
      assertEquals(0L, file0.lastModified());
      assertFalse(commandLineArguments0.doDeleteSubjectOnFinish());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CommandLineArguments commandLineArguments0 = new CommandLineArguments();
      boolean boolean0 = commandLineArguments0.doDeleteSubjectOnFinish();
      assertFalse(boolean0);
  }
}
