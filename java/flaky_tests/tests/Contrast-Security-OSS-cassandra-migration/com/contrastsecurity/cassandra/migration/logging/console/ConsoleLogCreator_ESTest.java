/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 22:25:10 GMT 2022
 */

package com.contrastsecurity.cassandra.migration.logging.console;

import org.junit.Test;
import static org.junit.Assert.*;
import com.contrastsecurity.cassandra.migration.logging.Log;
import com.contrastsecurity.cassandra.migration.logging.console.ConsoleLog;
import com.contrastsecurity.cassandra.migration.logging.console.ConsoleLogCreator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConsoleLogCreator_ESTest extends ConsoleLogCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConsoleLog.Level consoleLog_Level0 = ConsoleLog.Level.WARN;
      ConsoleLogCreator consoleLogCreator0 = new ConsoleLogCreator(consoleLog_Level0);
      Class<Object> class0 = Object.class;
      Log log0 = consoleLogCreator0.createLogger(class0);
      assertNotNull(log0);
  }
}
