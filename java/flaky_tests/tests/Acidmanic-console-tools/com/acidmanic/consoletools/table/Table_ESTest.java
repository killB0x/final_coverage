/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 09:17:26 GMT 2022
 */

package com.acidmanic.consoletools.table;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.acidmanic.consoletools.drawing.AsciiBorder;
import com.acidmanic.consoletools.drawing.Padding;
import com.acidmanic.consoletools.table.CellScanner;
import com.acidmanic.consoletools.table.Row;
import com.acidmanic.consoletools.table.Table;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Table_ESTest extends Table_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Table table0 = new Table();
      AsciiBorder asciiBorder0 = new AsciiBorder("", "9/y76D", "9/y76D", "9/y76D", "9/y76D", "", "", "lhW<gb*Qo,OQ", "9/y76D", "9/y76D", "com.acidmanic.consoletools.drawing.Clip", "d5}>l1k>sej2ciAi!", "d5}>l1k>sej2ciAi!");
      table0.setBorder(asciiBorder0);
      String string0 = table0.render();
      assertEquals("9/\n l\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Table table0 = new Table();
      Padding padding0 = new Padding(3275);
      table0.setMargins(padding0);
      // Undeclared exception!
      table0.render();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Table table0 = new Table();
      table0.setContent(table0);
      // Undeclared exception!
      try { 
        table0.render();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Table table0 = new Table();
      AsciiBorder asciiBorder0 = new AsciiBorder();
      table0.setBorder(asciiBorder0);
      // Undeclared exception!
      try { 
        table0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.acidmanic.consoletools.string.StringExtensions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Table table0 = new Table();
      table0.setHeight((-3348));
      // Undeclared exception!
      try { 
        table0.render();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -3348
         //
         verifyException("com.acidmanic.consoletools.rendering.BufferedStringRenderingContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Table table0 = new Table();
      ArrayList<Row> arrayList0 = table0.getRows();
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Table table0 = new Table();
      CellScanner cellScanner0 = mock(CellScanner.class, new ViolatedAssumptionAnswer());
      table0.scanAllCells(cellScanner0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Table table0 = new Table();
      Padding padding0 = new Padding(0);
      table0.setCellsPadding(padding0);
      assertEquals(0, padding0.getTop());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Table table0 = new Table();
      AsciiBorder asciiBorder0 = new AsciiBorder();
      table0.setCellsBorders(asciiBorder0);
      assertNull(asciiBorder0.getLeftJointed());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Table table0 = new Table();
      String string0 = table0.render();
      assertEquals("", string0);
  }
}
