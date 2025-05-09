/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 19:35:51 GMT 2022
 */

package org.sql4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sql4j.AndOr;
import org.sql4j.Condition;
import org.sql4j.Database;
import org.sql4j.DmlSql;
import org.sql4j.SqlBuilder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AndOr_ESTest extends AndOr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      List<Object> list0 = andOr0.getParameters();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      sqlBuilder0.newLine();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      String string0 = andOr0.toSqlString();
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      String string0 = andOr0.toSqlString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      sqlBuilder0.appendLine("<FmPE469EJe*%yCI");
      AndOr andOr0 = new AndOr(sqlBuilder0);
      String string0 = andOr0.toPreparedSqlString();
      assertEquals("<FmPE469EJe*%yCI\n", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Database database0 = Database.ORACLE;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      SqlBuilder sqlBuilder0 = new SqlBuilder(database0, connection0);
      AndOr andOr0 = new AndOr(sqlBuilder0);
      AndOr andOr1 = andOr0.or((DmlSql) andOr0);
      assertEquals("OR ( OR (  )", andOr1.toPreparedSqlString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Database database0 = Database.ORACLE;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      SqlBuilder sqlBuilder0 = new SqlBuilder(database0, connection0);
      AndOr andOr0 = new AndOr(sqlBuilder0);
      Condition.FinalizedCondition condition_FinalizedCondition0 = mock(Condition.FinalizedCondition.class, new ViolatedAssumptionAnswer());
      doReturn(sqlBuilder0, (SqlBuilder) null).when(condition_FinalizedCondition0).getContext();
      // Undeclared exception!
      try { 
        andOr0.or(condition_FinalizedCondition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Database database0 = Database.ORACLE;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      SqlBuilder sqlBuilder0 = new SqlBuilder(database0, connection0);
      AndOr andOr0 = new AndOr(sqlBuilder0);
      Condition.FinalizedCondition condition_FinalizedCondition0 = mock(Condition.FinalizedCondition.class, new ViolatedAssumptionAnswer());
      doReturn(sqlBuilder0, (SqlBuilder) null).when(condition_FinalizedCondition0).getContext();
      // Undeclared exception!
      try { 
        andOr0.and(condition_FinalizedCondition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      sqlBuilder0.appendLine("Dolp|?j#:2cjV:*ZL0e");
      AndOr andOr0 = new AndOr(sqlBuilder0);
      // Undeclared exception!
      try { 
        andOr0.toSqlString();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AndOr andOr0 = new AndOr((SqlBuilder) null);
      // Undeclared exception!
      try { 
        andOr0.toPreparedSqlString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      // Undeclared exception!
      try { 
        andOr0.orderBy((String[]) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.sql4j.OrderBy", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      // Undeclared exception!
      try { 
        andOr0.or((Condition.GroupCondition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      // Undeclared exception!
      try { 
        andOr0.groupBy((String[]) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.sql4j.GroupBy", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AndOr andOr0 = new AndOr((SqlBuilder) null);
      // Undeclared exception!
      try { 
        andOr0.and((Condition.GroupCondition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      String string0 = andOr0.toPreparedSqlString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AndOr andOr0 = new AndOr((SqlBuilder) null);
      // Undeclared exception!
      try { 
        andOr0.toSqlString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AndOr andOr0 = new AndOr((SqlBuilder) null);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        andOr0.groupBy(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.GroupBy", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      SqlBuilder sqlBuilder1 = sqlBuilder0.newLine();
      Condition.FinalizedCondition condition_FinalizedCondition0 = mock(Condition.FinalizedCondition.class, new ViolatedAssumptionAnswer());
      AndOr andOr1 = new AndOr(sqlBuilder0);
      sqlBuilder0.getParameters();
      Condition.FinalizedCondition condition_FinalizedCondition1 = mock(Condition.FinalizedCondition.class, new ViolatedAssumptionAnswer());
      doReturn(sqlBuilder1, (SqlBuilder) null).when(condition_FinalizedCondition1).getContext();
      // Undeclared exception!
      try { 
        Condition.GroupCondition.group(condition_FinalizedCondition1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.Condition$GroupCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      AndOr andOr1 = andOr0.and((DmlSql) andOr0);
      assertEquals("AND ( AND (  )", andOr1.toPreparedSqlString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AndOr andOr0 = new AndOr((SqlBuilder) null);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        andOr0.orderBy(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.OrderBy", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AndOr andOr0 = new AndOr((SqlBuilder) null);
      // Undeclared exception!
      try { 
        andOr0.getParameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AndOr andOr0 = new AndOr((SqlBuilder) null);
      // Undeclared exception!
      try { 
        andOr0.and((DmlSql) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SqlBuilder sqlBuilder0 = new SqlBuilder();
      AndOr andOr0 = new AndOr(sqlBuilder0);
      // Undeclared exception!
      try { 
        andOr0.or((DmlSql) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sql4j.AndOr", e);
      }
  }
}
