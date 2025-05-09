/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 03:42:21 GMT 2022
 */

package com.github.hwywl.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.hwywl.model.Table;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Table_ESTest extends Table_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table table0 = table_TableBuilder0.build();
      String string0 = table0.getTableName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Table table0 = new Table("V`L`", "");
      assertEquals("V`L`", table0.getTableName());
      
      table0.setTableName("");
      String string0 = table0.getTableName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table table0 = table_TableBuilder0.build();
      String string0 = table0.getAlias();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table.TableBuilder table_TableBuilder1 = table_TableBuilder0.alias("V`L`");
      Table table0 = table_TableBuilder1.build();
      String string0 = table0.getAlias();
      assertEquals("V`L`", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Table table0 = new Table("V`L`", "");
      table0.canEqual(table0);
      assertEquals("", table0.getAlias());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Table table0 = new Table("Table(tableName=", "Table(tableName=");
      Object object0 = new Object();
      boolean boolean0 = table0.canEqual(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Table table0 = new Table("V`L`", "");
      String string0 = table0.getAlias();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Table table0 = new Table("V`L`", "");
      String string0 = table0.getTableName();
      assertNotNull(string0);
      assertEquals("V`L`", string0);
      assertEquals("", table0.getAlias());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table table0 = table_TableBuilder0.build();
      table_TableBuilder0.alias("o2\u0007_>\u0004+r2?5$sX&");
      Table table1 = table_TableBuilder0.build();
      boolean boolean0 = table1.equals(table0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table.TableBuilder table_TableBuilder1 = table_TableBuilder0.alias("V`L`");
      Table table0 = table_TableBuilder1.build();
      Table table1 = table_TableBuilder1.build();
      boolean boolean0 = table0.equals(table1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Table table0 = new Table("V`L`", "");
      assertEquals("V`L`", table0.getTableName());
      
      table0.setTableName("");
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table table1 = table_TableBuilder0.build();
      table1.tableName = "";
      boolean boolean0 = table1.equals(table0);
      assertEquals("", table0.getTableName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table table0 = table_TableBuilder0.build();
      Table table1 = new Table();
      boolean boolean0 = table1.equals(table0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Table table0 = new Table("V`L`", "");
      Table table1 = new Table();
      boolean boolean0 = table1.equals(table0);
      assertFalse(boolean0);
      assertEquals("V`L`", table0.getTableName());
      assertEquals("", table0.getAlias());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Table table0 = new Table();
      boolean boolean0 = table0.equals(table0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Table table0 = new Table();
      table0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Table table0 = new Table("V`L`", "");
      table0.hashCode();
      assertEquals("V`L`", table0.getTableName());
      assertEquals("", table0.getAlias());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table.TableBuilder table_TableBuilder1 = table_TableBuilder0.tableName("I\"$c");
      assertSame(table_TableBuilder0, table_TableBuilder1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      String string0 = table_TableBuilder0.toString();
      assertEquals("Table.TableBuilder(tableName=null, alias=null)", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = new Table.TableBuilder();
      Table table0 = table_TableBuilder0.build();
      Object object0 = new Object();
      boolean boolean0 = table0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Table.TableBuilder table_TableBuilder0 = Table.builder();
      assertNotNull(table_TableBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Table table0 = new Table("~M1#4", "~M1#4");
      Table table1 = new Table();
      boolean boolean0 = table0.equals(table1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Table table0 = new Table("V`L`", "");
      String string0 = table0.toString();
      assertEquals("Table(tableName=V`L`, alias=)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Table table0 = new Table();
      table0.setAlias("!cIcw3?m[}{t&Y>");
      assertNull(table0.getTableName());
  }
}
