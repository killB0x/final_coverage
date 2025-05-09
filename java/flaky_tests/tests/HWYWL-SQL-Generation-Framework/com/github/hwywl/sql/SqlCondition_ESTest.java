/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 03:36:53 GMT 2022
 */

package com.github.hwywl.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.hwywl.sql.SqlCondition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SqlCondition_ESTest extends SqlCondition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("", "`", "sIqYyN(7z", (String) null);
      sqlCondition0.hashCode();
      assertEquals("sIqYyN(7z", sqlCondition0.getField());
      assertEquals("`", sqlCondition0.getRelationOperator());
      assertEquals("", sqlCondition0.getLogicalOperator());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition(", value=", "", "", "");
      SqlCondition sqlCondition1 = new SqlCondition(", value=", "", "", "");
      boolean boolean0 = sqlCondition0.equals(sqlCondition1);
      assertEquals("", sqlCondition1.getRelationOperator());
      assertTrue(boolean0);
      assertEquals(", value=", sqlCondition1.getLogicalOperator());
      assertEquals("", sqlCondition1.getField());
      assertEquals("", sqlCondition1.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, "", (String) null, (String) null);
      SqlCondition sqlCondition1 = new SqlCondition((String) null, "", "", "");
      boolean boolean0 = sqlCondition0.equals(sqlCondition1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("v]", (String) null, (String) null, "v]");
      String string0 = sqlCondition0.getValue();
      assertEquals("v]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition(", value=", ", value=", "", "");
      String string0 = sqlCondition0.getValue();
      assertEquals("", string0);
      assertEquals(", value=", sqlCondition0.getLogicalOperator());
      assertEquals("", sqlCondition0.getField());
      assertEquals(", value=", sqlCondition0.getRelationOperator());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("", "`", "sIqYyN(7z", (String) null);
      String string0 = sqlCondition0.getRelationOperator();
      assertEquals("`", string0);
      assertEquals("sIqYyN(7z", sqlCondition0.getField());
      assertEquals("", sqlCondition0.getLogicalOperator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("SqlCondition(logicalOperator=", "SqlCondition(logicalOperator=", "e\":g.xeCYph>g", "e\":g.xeCYph>g");
      assertEquals("SqlCondition(logicalOperator=", sqlCondition0.getRelationOperator());
      
      sqlCondition0.setRelationOperator("");
      sqlCondition0.getRelationOperator();
      assertEquals("e\":g.xeCYph>g", sqlCondition0.getField());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, "}", (String) null, (String) null);
      String string0 = sqlCondition0.getLogicalOperator();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("", "`", "sIqYyN(7z", (String) null);
      assertEquals("", sqlCondition0.getLogicalOperator());
      
      sqlCondition0.setLogicalOperator("sIqYyN(7z");
      sqlCondition0.getLogicalOperator();
      assertEquals("`", sqlCondition0.getRelationOperator());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, (String) null, "5%P_|,", (String) null);
      sqlCondition0.setField((String) null);
      String string0 = sqlCondition0.getField();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("", ", field=", ", field=", "");
      assertEquals(", field=", sqlCondition0.getField());
      
      sqlCondition0.setField("");
      sqlCondition0.getField();
      assertEquals("", sqlCondition0.getLogicalOperator());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("ox>0KJ~,%ss\"7%%2XrH", "", "", "W^\"Hw");
      sqlCondition0.canEqual(sqlCondition0);
      assertEquals("W^\"Hw", sqlCondition0.getValue());
      assertEquals("", sqlCondition0.getRelationOperator());
      assertEquals("", sqlCondition0.getField());
      assertEquals("ox>0KJ~,%ss\"7%%2XrH", sqlCondition0.getLogicalOperator());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("", "`", "sIqYyN(7z", (String) null);
      sqlCondition0.canEqual("sIqYyN(7z");
      assertEquals("sIqYyN(7z", sqlCondition0.getField());
      assertEquals("", sqlCondition0.getLogicalOperator());
      assertEquals("`", sqlCondition0.getRelationOperator());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("", "`", "sIqYyN(7z", (String) null);
      String string0 = sqlCondition0.getLogicalOperator();
      assertEquals("`", sqlCondition0.getRelationOperator());
      assertNotNull(string0);
      assertEquals("sIqYyN(7z", sqlCondition0.getField());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, (String) null, (String) null, ", relationOperator=");
      String string0 = sqlCondition0.getRelationOperator();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("Ojr{@:lRdn", "E\"zmzB][\"&:", "E\"zmzB][\"&:", "Ojr{@:lRdn");
      String string0 = sqlCondition0.getField();
      assertEquals("E\"zmzB][\"&:", string0);
      assertEquals("Ojr{@:lRdn", sqlCondition0.getValue());
      assertEquals("Ojr{@:lRdn", sqlCondition0.getLogicalOperator());
      assertEquals("E\"zmzB][\"&:", sqlCondition0.getRelationOperator());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, (String) null, (String) null, (String) null);
      String string0 = sqlCondition0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("3S", "3S", "3S", "3S");
      SqlCondition sqlCondition1 = new SqlCondition("3S", "3S", "3S", (String) null);
      boolean boolean0 = sqlCondition0.equals(sqlCondition1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, (String) null, (String) null, (String) null);
      SqlCondition sqlCondition1 = new SqlCondition((String) null, (String) null, (String) null, "0p7y");
      boolean boolean0 = sqlCondition0.equals(sqlCondition1);
      assertFalse(sqlCondition1.equals((Object)sqlCondition0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("3S", "3S", "3S", "3S");
      SqlCondition sqlCondition1 = new SqlCondition("3S", "3S", "{S.m>LE\"[", "3S");
      boolean boolean0 = sqlCondition1.equals(sqlCondition0);
      assertEquals("3S", sqlCondition1.getRelationOperator());
      assertFalse(sqlCondition0.equals((Object)sqlCondition1));
      assertEquals("3S", sqlCondition1.getLogicalOperator());
      assertEquals("3S", sqlCondition1.getValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("3:=$,e", "3:=$,e", "3:=$,e", "3:=$,e");
      SqlCondition sqlCondition1 = new SqlCondition("3:=$,e", "3-JKGN_-ItMy%3a}[q", "3:=$,e", "3:=$,e");
      boolean boolean0 = sqlCondition1.equals(sqlCondition0);
      assertEquals("3:=$,e", sqlCondition1.getValue());
      assertFalse(sqlCondition0.equals((Object)sqlCondition1));
      assertEquals("3:=$,e", sqlCondition1.getField());
      assertFalse(boolean0);
      assertEquals("3:=$,e", sqlCondition1.getLogicalOperator());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, (String) null, (String) null, (String) null);
      SqlCondition sqlCondition1 = new SqlCondition((String) null, "7E{G~?r~", (String) null, (String) null);
      boolean boolean0 = sqlCondition0.equals(sqlCondition1);
      assertFalse(boolean0);
      assertFalse(sqlCondition1.equals((Object)sqlCondition0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("^('#[jQD(wL", "^('#[jQD(wL", "^('#[jQD(wL", "^('#[jQD(wL");
      SqlCondition sqlCondition1 = new SqlCondition("SqlCondition(logicalOperator=^('#[jQD(wL, relationOperator=^('#[jQD(wL, field=^('#[jQD(wL, value=^('#[jQD(wL)", "SqlCondition(logicalOperator=^('#[jQD(wL, relationOperator=^('#[jQD(wL, field=^('#[jQD(wL, value=^('#[jQD(wL)", "^('#[jQD(wL", "SqlCondition(logicalOperator=^('#[jQD(wL, relationOperator=^('#[jQD(wL, field=^('#[jQD(wL, value=^('#[jQD(wL)");
      boolean boolean0 = sqlCondition0.equals(sqlCondition1);
      assertFalse(boolean0);
      assertEquals("^('#[jQD(wL", sqlCondition1.getField());
      assertEquals("SqlCondition(logicalOperator=^('#[jQD(wL, relationOperator=^('#[jQD(wL, field=^('#[jQD(wL, value=^('#[jQD(wL)", sqlCondition1.getRelationOperator());
      assertEquals("SqlCondition(logicalOperator=^('#[jQD(wL, relationOperator=^('#[jQD(wL, field=^('#[jQD(wL, value=^('#[jQD(wL)", sqlCondition1.getLogicalOperator());
      assertEquals("SqlCondition(logicalOperator=^('#[jQD(wL, relationOperator=^('#[jQD(wL, field=^('#[jQD(wL, value=^('#[jQD(wL)", sqlCondition1.getValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, "", "", "");
      SqlCondition sqlCondition1 = new SqlCondition("", "", "", "");
      boolean boolean0 = sqlCondition0.equals(sqlCondition1);
      assertFalse(boolean0);
      assertFalse(sqlCondition1.equals((Object)sqlCondition0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, (String) null, (String) null, (String) null);
      SqlCondition sqlCondition1 = new SqlCondition((String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = sqlCondition0.equals(sqlCondition1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = sqlCondition0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("5Bl[_gsUih_kCWk@}S", "5Bl[_gsUih_kCWk@}S", "5Bl[_gsUih_kCWk@}S", "5Bl[_gsUih_kCWk@}S");
      boolean boolean0 = sqlCondition0.equals(sqlCondition0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition((String) null, (String) null, (String) null, ", relationOperator=");
      sqlCondition0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("Li3|h\"uiAf9CiE9wc", "Li3|h\"uiAf9CiE9wc", "Li3|h\"uiAf9CiE9wc", "Li3|h\"uiAf9CiE9wc");
      sqlCondition0.setValue((String) null);
      assertEquals("Li3|h\"uiAf9CiE9wc", sqlCondition0.getField());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SqlCondition sqlCondition0 = new SqlCondition("^('#[jQD(wL", "^('#[jQD(wL", "^('#[jQD(wL", "^('#[jQD(wL");
      String string0 = sqlCondition0.toString();
      assertEquals("SqlCondition(logicalOperator=^('#[jQD(wL, relationOperator=^('#[jQD(wL, field=^('#[jQD(wL, value=^('#[jQD(wL)", string0);
  }
}
