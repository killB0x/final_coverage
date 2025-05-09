/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:47:05 GMT 2022
 */

package net.named_data.jndn.encrypt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.named_data.jndn.encrypt.Sqlite3GroupManagerDb;
import net.named_data.jndn.encrypt.Sqlite3GroupManagerDbBase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Sqlite3GroupManagerDbBase_ESTest extends Sqlite3GroupManagerDbBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sqlite3GroupManagerDbBase.checkRenameSchedule((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.encrypt.Sqlite3GroupManagerDbBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sqlite3GroupManagerDbBase.checkAddSchedule((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.encrypt.Sqlite3GroupManagerDbBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      try { 
        Sqlite3GroupManagerDbBase.checkRenameSchedule("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // renameSchedule: The schedule newName cannot be empty
         //
         verifyException("net.named_data.jndn.encrypt.Sqlite3GroupManagerDbBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Sqlite3GroupManagerDbBase.checkRenameSchedule("OTHER_CODE");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      try { 
        Sqlite3GroupManagerDbBase.checkAddSchedule("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // addSchedule: The schedule name cannot be empty
         //
         verifyException("net.named_data.jndn.encrypt.Sqlite3GroupManagerDbBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Sqlite3GroupManagerDbBase.checkAddSchedule("DELETE FROM schedules WHERE schedule_id=?");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Sqlite3GroupManagerDb sqlite3GroupManagerDb0 = null;
      try {
        sqlite3GroupManagerDb0 = new Sqlite3GroupManagerDb("+B");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }
}
