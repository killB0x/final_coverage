/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:42:05 GMT 2022
 */

package jp.co.yahoo.yosegi.spread.column;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import jp.co.yahoo.yosegi.spread.Spread;
import jp.co.yahoo.yosegi.spread.column.ICell;
import jp.co.yahoo.yosegi.spread.column.SpreadColumn;
import jp.co.yahoo.yosegi.spread.column.SpreadLink;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SpreadLink_ESTest extends SpreadLink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Spread spread0 = new Spread();
      SpreadLink spreadLink0 = new SpreadLink(spread0, 676);
      Map<String, ICell> map0 = (Map<String, ICell>)spreadLink0.getLine();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SpreadColumn spreadColumn0 = new SpreadColumn(",t|SVgbWm+$n3(5GLG3");
      Spread spread0 = new Spread(spreadColumn0);
      spread0.addColumn(spreadColumn0);
      SpreadLink spreadLink0 = new SpreadLink(spread0, 1);
      boolean boolean0 = spreadLink0.containsColumn(",t|SVgbWm+$n3(5GLG3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SpreadLink spreadLink0 = new SpreadLink((Spread) null, 0);
      // Undeclared exception!
      try { 
        spreadLink0.getLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.spread.column.SpreadLink", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SpreadLink spreadLink0 = new SpreadLink((Spread) null, 0);
      // Undeclared exception!
      try { 
        spreadLink0.containsColumn("GrM~A#%^X");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.spread.column.SpreadLink", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SpreadColumn spreadColumn0 = new SpreadColumn(",t|SVgbWm+$n3(5GLG3");
      Spread spread0 = new Spread(spreadColumn0);
      spread0.addColumn(spreadColumn0);
      SpreadLink spreadLink0 = new SpreadLink(spread0, 1);
      spreadLink0.getLine();
      Map<String, ICell> map0 = (Map<String, ICell>)spreadLink0.getLine();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SpreadColumn spreadColumn0 = new SpreadColumn(",t|SVgbWm+$n3(5GLG3");
      Spread spread0 = new Spread(spreadColumn0);
      SpreadLink spreadLink0 = new SpreadLink(spread0, 1);
      boolean boolean0 = spreadLink0.containsColumn("GrM~A#%^X");
      assertFalse(boolean0);
  }
}
