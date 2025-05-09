/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 19:38:22 GMT 2022
 */

package com.zoi7.mysql.util.generate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zoi7.mysql.util.generate.SqlHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SqlHelper_ESTest extends SqlHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("y J(lFi/#=PJ'0", "", "y J(lFi/#=PJ'0", "1gn dCey");
      assertEquals("y J(lFi/#=PJ'0", sqlHelper0.getUsername());
      
      sqlHelper0.setUsername((String) null);
      sqlHelper0.getUsername();
      assertEquals("y J(lFi/#=PJ'0", sqlHelper0.getUrl());
      assertEquals("1gn dCey", sqlHelper0.getPassword());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("}*Fn|~vIhH,KGZ", "}*Fn|~vIhH,KGZ", "}*Fn|~vIhH,KGZ", "}*Fn|~vIhH,KGZ");
      String string0 = sqlHelper0.getUsername();
      assertEquals("}*Fn|~vIhH,KGZ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("=4S", "-----------Connection closed now-----------", (String) null, "ZYr#ca[9AXNYqWu5Mh");
      String string0 = sqlHelper0.getUrl();
      assertEquals("ZYr#ca[9AXNYqWu5Mh", sqlHelper0.getPassword());
      assertNotNull(string0);
      assertEquals("=4S", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("", "", "", "");
      String string0 = sqlHelper0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("", "", "", (String) null);
      String string0 = sqlHelper0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("@", "@", "@", "@");
      String string0 = sqlHelper0.getPassword();
      assertEquals("@", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("", "", "", "");
      List<Object> list0 = sqlHelper0.get("", "");
      assertFalse(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper((String) null, (String) null, (String) null, (String) null);
      // Undeclared exception!
      try { 
        sqlHelper0.getStatement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("}*Fn|vIhH,KGZ", "}*Fn|vIhH,KGZ", "}*Fn|vIhH,KGZ", "}*Fn|vIhH,KGZ");
      try { 
        sqlHelper0.getStatement();
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper((String) null, (String) null, (String) null, (String) null);
      // Undeclared exception!
      try { 
        sqlHelper0.getConnection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("@", "@", "@", "@");
      try { 
        sqlHelper0.getConnection();
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("@", "@", "@", "@");
      sqlHelper0.closeStatement((Statement) null);
      assertEquals("@", sqlHelper0.getUsername());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("com.zoi7.mysql.util.generate.SqlHelper", "com.zoi7.mysql.util.generate.SqlHelper", "com.zoi7.mysql.util.generate.SqlHelper", "com.zoi7.mysql.util.generate.SqlHelper");
      try { 
        sqlHelper0.getStatement();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // No suitable driver found for com.zoi7.mysql.util.generate.SqlHelper
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("@", "@", "@", "@");
      sqlHelper0.closeConnection((Connection) null);
      assertEquals("@", sqlHelper0.getPassword());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("com.zoi7.mysql.util.generate.SqlHelper", "com.zoi7.mysql.util.generate.SqlHelper", "com.zoi7.mysql.util.generate.SqlHelper", "com.zoi7.mysql.util.generate.SqlHelper");
      try { 
        sqlHelper0.getConnection();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // No suitable driver found for com.zoi7.mysql.util.generate.SqlHelper
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("", "", "", "");
      sqlHelper0.setUrl("");
      assertEquals("", sqlHelper0.getUsername());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper("}*Fn|vIhH,KGZ", "", "", "");
      String string0 = sqlHelper0.getUsername();
      assertEquals("}*Fn|vIhH,KGZ", sqlHelper0.getUrl());
      assertEquals("", string0);
      assertEquals("", sqlHelper0.getPassword());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper((String) null, (String) null, "", "");
      String string0 = sqlHelper0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper((String) null, (String) null, (String) null, (String) null);
      sqlHelper0.setPassword((String) null);
      assertNull(sqlHelper0.getUsername());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper((String) null, (String) null, "", "");
      String string0 = sqlHelper0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SqlHelper sqlHelper0 = new SqlHelper((String) null, (String) null, (String) null, (String) null);
      // Undeclared exception!
      try { 
        sqlHelper0.get((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
