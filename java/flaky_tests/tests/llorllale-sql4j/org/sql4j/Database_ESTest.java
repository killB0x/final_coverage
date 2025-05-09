/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 19:37:49 GMT 2022
 */

package org.sql4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sql4j.Database;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Database_ESTest extends Database_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Database[] databaseArray0 = Database.values();
      assertEquals(1, databaseArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Database database0 = Database.valueOf("ORACLE");
      assertEquals(Database.ORACLE, database0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Database database0 = Database.ORACLE;
      // Undeclared exception!
      try { 
        database0.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.Database", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Database database0 = Database.ORACLE;
      String string0 = database0.getProductName();
      assertEquals("oracle", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Database database0 = Database.ORACLE;
      Database database1 = database0.parse("ORACLE");
      assertEquals("oracle", database1.getProductName());
  }
}
