/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:24:19 GMT 2022
 */

package com.mongodb.atlas.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mongodb.atlas.model.Database;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Database_ESTest extends Database_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Database database0 = new Database();
      String string0 = database0.getDatabaseName();
      assertNull(string0);
  }
}
