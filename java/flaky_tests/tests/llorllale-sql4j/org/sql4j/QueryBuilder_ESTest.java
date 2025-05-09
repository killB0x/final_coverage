/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 19:34:29 GMT 2022
 */

package org.sql4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sql4j.CreateTable;
import org.sql4j.Delete;
import org.sql4j.Insert;
import org.sql4j.QueryBuilder;
import org.sql4j.Select;
import org.sql4j.Update;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QueryBuilder_ESTest extends QueryBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      QueryBuilder queryBuilder0 = new QueryBuilder(connection0);
      CreateTable createTable0 = queryBuilder0.createTable("AdNGH8Ydj[X");
      assertNotNull(createTable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      QueryBuilder queryBuilder0 = new QueryBuilder(connection0);
      Select select0 = queryBuilder0.select();
      assertNotNull(select0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      QueryBuilder queryBuilder0 = new QueryBuilder(connection0);
      Delete delete0 = queryBuilder0.deleteFrom("AdNGH8Ydj[X");
      assertEquals("DELETE FROM AdNGH8Ydj[X\n", delete0.toPreparedSqlString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      QueryBuilder queryBuilder0 = new QueryBuilder(connection0);
      Insert insert0 = queryBuilder0.insertInto(" VALUES (");
      assertNotNull(insert0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QueryBuilder queryBuilder0 = new QueryBuilder((Connection) null);
      Update update0 = queryBuilder0.update("");
      assertNotNull(update0);
  }
}
