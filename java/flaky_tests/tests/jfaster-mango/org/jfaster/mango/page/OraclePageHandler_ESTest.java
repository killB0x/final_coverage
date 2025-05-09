/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 00:49:28 GMT 2022
 */

package org.jfaster.mango.page;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.binding.BoundSql;
import org.jfaster.mango.page.Direction;
import org.jfaster.mango.page.OraclePageHandler;
import org.jfaster.mango.page.Page;
import org.jfaster.mango.page.Sort;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OraclePageHandler_ESTest extends OraclePageHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OraclePageHandler oraclePageHandler0 = new OraclePageHandler();
      StringBuilder stringBuilder0 = new StringBuilder();
      BoundSql boundSql0 = new BoundSql(stringBuilder0);
      Direction direction0 = Direction.DESC;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "org.jfaster.mango.page.OraclePageHandler";
      stringArray0[1] = "org.jfaster.mango.page.OraclePageHandler";
      stringArray0[2] = "org.jfaster.mango.page.OraclePageHandler";
      stringArray0[3] = "org.jfaster.mango.page.OraclePageHandler";
      stringArray0[4] = "org.jfaster.mango.page.OraclePageHandler";
      stringArray0[5] = "org.jfaster.mango.page.OraclePageHandler";
      Page page0 = Page.of(0, 79, direction0, stringArray0);
      oraclePageHandler0.handlePage(boundSql0, page0);
      assertEquals("SELECT * FROM ( SELECT B.* , ROWNUM RN FROM () B WHERE ROWNUM <= 79 ) WHERE RN > 0", boundSql0.getSql());
      assertEquals("SELECT * FROM ( SELECT B.* , ROWNUM RN FROM () B WHERE ROWNUM <= 79 ) WHERE RN > 0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OraclePageHandler oraclePageHandler0 = new OraclePageHandler();
      StringBuilder stringBuilder0 = new StringBuilder("Acl");
      BoundSql boundSql0 = new BoundSql(stringBuilder0);
      oraclePageHandler0.handleCount(boundSql0);
      assertEquals("SELECT COUNT(1) FROM (Acl) aliasForPage", boundSql0.getSql());
      assertEquals("SELECT COUNT(1) FROM (Acl) aliasForPage", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OraclePageHandler oraclePageHandler0 = new OraclePageHandler();
      Direction direction0 = Direction.ASC;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "hHMKNW";
      stringArray0[1] = "0RTM`u*[e";
      stringArray0[2] = "AHT;E}Dj";
      Page page0 = Page.of(3132, 3132, direction0, stringArray0);
      // Undeclared exception!
      try { 
        oraclePageHandler0.handlePage((BoundSql) null, page0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.page.OraclePageHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OraclePageHandler oraclePageHandler0 = new OraclePageHandler();
      // Undeclared exception!
      try { 
        oraclePageHandler0.handleCount((BoundSql) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.page.OraclePageHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OraclePageHandler oraclePageHandler0 = new OraclePageHandler();
      StringBuilder stringBuilder0 = new StringBuilder("Acl");
      BoundSql boundSql0 = new BoundSql(stringBuilder0);
      Direction direction0 = Direction.ASC;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "m;l}b";
      Sort sort0 = Sort.by(direction0, stringArray0);
      oraclePageHandler0.handleSort(boundSql0, sort0);
  }
}
