/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:39:15 GMT 2022
 */

package net.named_data.jndn.encrypt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.named_data.jndn.encrypt.Sqlite3ProducerDb;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Sqlite3ProducerDb_ESTest extends Sqlite3ProducerDb_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sqlite3ProducerDb sqlite3ProducerDb0 = null;
      try {
        sqlite3ProducerDb0 = new Sqlite3ProducerDb("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }
}
