/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 15:57:07 GMT 2022
 */

package org.sqlite.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sqlite.SQLiteConnection;
import org.sqlite.core.CoreStatement;
import org.sqlite.jdbc4.JDBC4ResultSet;
import org.sqlite.jdbc4.JDBC4Statement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CoreResultSet_ESTest extends CoreResultSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      jDBC4ResultSet0.closeStmt = true;
      // Undeclared exception!
      try { 
        jDBC4ResultSet0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDBC4Statement jDBC4Statement0 = new JDBC4Statement((SQLiteConnection) null);
      assertFalse(jDBC4Statement0.isPoolable());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      boolean boolean0 = jDBC4ResultSet0.isOpen();
      assertTrue(jDBC4ResultSet0.isAfterLast());
      assertFalse(jDBC4ResultSet0.isFirst());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      String[] stringArray0 = new String[0];
      jDBC4ResultSet0.colsMeta = stringArray0;
      try { 
        jDBC4ResultSet0.checkMeta();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // column 1 out of bounds [1,0]
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      // Undeclared exception!
      try { 
        jDBC4ResultSet0.checkMeta();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // SQLite JDBC: inconsistent internal state
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      String[] stringArray0 = new String[6];
      jDBC4ResultSet0.colsMeta = stringArray0;
      int int0 = jDBC4ResultSet0.checkCol(3);
      assertEquals(2, int0);
      assertFalse(jDBC4ResultSet0.isFirst());
      assertTrue(jDBC4ResultSet0.isAfterLast());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      // Undeclared exception!
      try { 
        jDBC4ResultSet0.checkCol(388);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // SQLite JDBC: inconsistent internal state
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      String[] stringArray0 = new String[5];
      jDBC4ResultSet0.colsMeta = stringArray0;
      try { 
        jDBC4ResultSet0.checkCol(28);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // column 28 out of bounds [1,5]
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      String[] stringArray0 = new String[6];
      jDBC4ResultSet0.colsMeta = stringArray0;
      try { 
        jDBC4ResultSet0.checkCol((-572));
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // column -572 out of bounds [1,6]
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      String[] stringArray0 = new String[1];
      jDBC4ResultSet0.colsMeta = stringArray0;
      // Undeclared exception!
      try { 
        jDBC4ResultSet0.checkMeta();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      jDBC4ResultSet0.open = true;
      // Undeclared exception!
      try { 
        jDBC4ResultSet0.getDate(1003);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // SQLite JDBC: inconsistent internal state
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDBC4ResultSet jDBC4ResultSet0 = new JDBC4ResultSet((CoreStatement) null);
      try { 
        jDBC4ResultSet0.getDate(1003);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // ResultSet closed
         //
         verifyException("org.sqlite.core.CoreResultSet", e);
      }
  }
}
