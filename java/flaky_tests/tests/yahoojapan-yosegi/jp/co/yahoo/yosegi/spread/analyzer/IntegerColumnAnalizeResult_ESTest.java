/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:46:44 GMT 2022
 */

package jp.co.yahoo.yosegi.spread.analyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import jp.co.yahoo.yosegi.spread.analyzer.IntegerColumnAnalizeResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IntegerColumnAnalizeResult_ESTest extends IntegerColumnAnalizeResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("z:J<}nY\"", (-4351), false, (-4351), 0, (-4351), 0, 0, (-273), 0);
      boolean boolean0 = integerColumnAnalizeResult0.maybeSorted();
      assertEquals((-4351), integerColumnAnalizeResult0.getUniqCount());
      assertFalse(boolean0);
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertEquals(0, integerColumnAnalizeResult0.getMin());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(0, integerColumnAnalizeResult0.getMax());
      assertEquals((-4352), integerColumnAnalizeResult0.getRowEnd());
      assertEquals((-273), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-4351), integerColumnAnalizeResult0.getNullCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("$aMemLGlg=]~f?(|H", 0, false, 0, 0, 0, 0, 0, 0, 0);
      int int0 = integerColumnAnalizeResult0.getUniqCount();
      assertEquals(0, integerColumnAnalizeResult0.getNullCount());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(0, integerColumnAnalizeResult0.getMax());
      assertEquals(0, integerColumnAnalizeResult0.getMin());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1), integerColumnAnalizeResult0.getRowEnd());
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("s=u|;t|8h=(<", 0, false, (-557), 0, 296, 296, (-1459), 296, 1);
      int int0 = integerColumnAnalizeResult0.getUniqCount();
      assertEquals(296, integerColumnAnalizeResult0.getMin());
      assertEquals((-557), integerColumnAnalizeResult0.getNullCount());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(296, int0);
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertEquals((-1459), integerColumnAnalizeResult0.getMax());
      assertEquals(1, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1), integerColumnAnalizeResult0.getRowEnd());
      assertEquals(296, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("UNION", 1, true, 2351, 2351, 2351, 2351, 464, 1, 0);
      int int0 = integerColumnAnalizeResult0.getRowEnd();
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(464, integerColumnAnalizeResult0.getMax());
      assertEquals(0, int0);
      assertEquals(2351, integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(9404, integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals(1, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(2351, integerColumnAnalizeResult0.getUniqCount());
      assertEquals(2351, integerColumnAnalizeResult0.getMin());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("", 8, true, 0, 0, 8, (-1), 1502, 462, 462);
      int int0 = integerColumnAnalizeResult0.getRowEnd();
      assertEquals(462, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1), integerColumnAnalizeResult0.getMin());
      assertEquals(1502, integerColumnAnalizeResult0.getMax());
      assertEquals(462, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(7, int0);
      assertEquals(0, integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals(0, integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(8, integerColumnAnalizeResult0.getUniqCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("T(D8}|Y1p\"(>xY6", (-399), false, (-399), 0, (-399), 1029, (-930), 1029, 2725);
      int int0 = integerColumnAnalizeResult0.getRowCount();
      assertEquals(1029, integerColumnAnalizeResult0.getMin());
      assertEquals(2725, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-930), integerColumnAnalizeResult0.getMax());
      assertEquals((-399), integerColumnAnalizeResult0.getUniqCount());
      assertEquals(1029, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-400), integerColumnAnalizeResult0.getRowEnd());
      assertEquals(0, int0);
      assertEquals((-399), integerColumnAnalizeResult0.getNullCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("p;b?0AR&ajuClzV", 0, true, 0, 1588, 1588, 0, 2876, 1588, 0);
      int int0 = integerColumnAnalizeResult0.getRowCount();
      assertEquals(1588, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(1588, int0);
      assertEquals(1588, integerColumnAnalizeResult0.getUniqCount());
      assertEquals(0, integerColumnAnalizeResult0.getMin());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(2876, integerColumnAnalizeResult0.getMax());
      assertEquals(0, integerColumnAnalizeResult0.getColumnSize());
      assertEquals(0, integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("z:J<}nY\"", (-4351), false, (-4351), 0, (-4351), 0, 0, (-273), 0);
      int int0 = integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength();
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(0, int0);
      assertEquals((-273), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-4351), integerColumnAnalizeResult0.getNullCount());
      assertEquals((-4351), integerColumnAnalizeResult0.getColumnSize());
      assertEquals(0, integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals(0, integerColumnAnalizeResult0.getMax());
      assertEquals(0, integerColumnAnalizeResult0.getMin());
      assertEquals((-4351), integerColumnAnalizeResult0.getUniqCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("T(D8}|Y1p\"(>xY6", (-399), false, (-399), 0, (-399), 1029, (-930), 1029, 2725);
      int int0 = integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength();
      assertEquals((-930), integerColumnAnalizeResult0.getMax());
      assertEquals(1029, integerColumnAnalizeResult0.getMin());
      assertEquals((-399), integerColumnAnalizeResult0.getUniqCount());
      assertEquals(1029, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-399), integerColumnAnalizeResult0.getNullCount());
      assertEquals(2725, int0);
      assertEquals((-399), integerColumnAnalizeResult0.getColumnSize());
      assertEquals(0, integerColumnAnalizeResult0.getLogicalDataSize());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("T(D8}|Y1p\"(>xY6", (-399), false, (-399), 0, (-399), 1029, (-930), 1029, 2725);
      int int0 = integerColumnAnalizeResult0.getNullIgnoreRleGroupCount();
      assertEquals(1029, integerColumnAnalizeResult0.getMin());
      assertEquals(2725, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(1029, int0);
      assertEquals((-930), integerColumnAnalizeResult0.getMax());
      assertEquals((-399), integerColumnAnalizeResult0.getUniqCount());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertEquals((-400), integerColumnAnalizeResult0.getRowEnd());
      assertEquals((-399), integerColumnAnalizeResult0.getNullCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("z:J<}nY\"", (-4351), false, (-4351), 0, (-4351), 0, 0, (-273), 0);
      int int0 = integerColumnAnalizeResult0.getNullIgnoreRleGroupCount();
      assertEquals(0, integerColumnAnalizeResult0.getMax());
      assertEquals((-4351), integerColumnAnalizeResult0.getNullCount());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-4352), integerColumnAnalizeResult0.getRowEnd());
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertEquals((-4351), integerColumnAnalizeResult0.getUniqCount());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-273), int0);
      assertEquals(0, integerColumnAnalizeResult0.getMin());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("", 8, true, 0, 0, 8, (-1), 1502, 462, 462);
      int int0 = integerColumnAnalizeResult0.getNullCount();
      assertEquals(462, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(8, integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-1), integerColumnAnalizeResult0.getMin());
      assertEquals(1502, integerColumnAnalizeResult0.getMax());
      assertEquals(7, integerColumnAnalizeResult0.getRowEnd());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(462, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("^~3mW5P", 0, true, 1660, 1660, 0, (-642), 1660, 0, 0);
      int int0 = integerColumnAnalizeResult0.getNullCount();
      assertEquals(1660, int0);
      assertEquals(0, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(6640, integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals((-642), integerColumnAnalizeResult0.getMin());
      assertEquals((-1), integerColumnAnalizeResult0.getRowEnd());
      assertEquals(1660, integerColumnAnalizeResult0.getMax());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(0, integerColumnAnalizeResult0.getUniqCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("%{FKwB?8@@eBC#}EJ", (-1552), true, 0, (-1552), 0, 0, 0, 0, (-1552));
      int int0 = integerColumnAnalizeResult0.getMin();
      assertEquals((-1552), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(0, integerColumnAnalizeResult0.getMax());
      assertEquals(0, integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(0, int0);
      assertEquals((-1552), integerColumnAnalizeResult0.getColumnSize());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(0, integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-1552), integerColumnAnalizeResult0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("tq|T", (-1904), true, (-1904), (-1904), (-1904), (-1904), (-1904), (-1904), (-1904));
      int int0 = integerColumnAnalizeResult0.getMin();
      assertEquals((-1904), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1904), integerColumnAnalizeResult0.getMax());
      assertEquals((-1904), integerColumnAnalizeResult0.getRowCount());
      assertEquals((-1904), integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-1904), int0);
      assertEquals((-1904), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-1904), integerColumnAnalizeResult0.getColumnSize());
      assertEquals((-1904), integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("^~3mW5P", 0, true, 1660, 1660, 0, (-642), 1660, 0, 0);
      int int0 = integerColumnAnalizeResult0.getMax();
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(1660, integerColumnAnalizeResult0.getNullCount());
      assertEquals((-642), integerColumnAnalizeResult0.getMin());
      assertEquals(0, integerColumnAnalizeResult0.getUniqCount());
      assertEquals(1660, integerColumnAnalizeResult0.getRowCount());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(0, integerColumnAnalizeResult0.getColumnSize());
      assertEquals(1660, int0);
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("tq|T", (-1900), true, (-1900), (-1900), (-1900), (-1900), (-1900), (-1900), (-1900));
      int int0 = integerColumnAnalizeResult0.getMax();
      assertEquals((-1900), integerColumnAnalizeResult0.getRowCount());
      assertEquals((-1900), integerColumnAnalizeResult0.getColumnSize());
      assertEquals((-1900), integerColumnAnalizeResult0.getNullCount());
      assertEquals((-1900), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-1900), int0);
      assertEquals((-1900), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1900), integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-1900), integerColumnAnalizeResult0.getMin());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("z:J<}nY\"", (-4351), false, (-4351), 0, (-4351), 0, 0, (-273), 0);
      int int0 = integerColumnAnalizeResult0.getLogicalDataSize();
      assertEquals(0, int0);
      assertEquals(0, integerColumnAnalizeResult0.getMin());
      assertEquals(0, integerColumnAnalizeResult0.getMax());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-273), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-4351), integerColumnAnalizeResult0.getNullCount());
      assertEquals((-4351), integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-4351), integerColumnAnalizeResult0.getColumnSize());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("^~3mW5P", 0, true, 1660, 1660, 0, (-642), 1660, 0, 0);
      int int0 = integerColumnAnalizeResult0.getLogicalDataSize();
      assertEquals(1660, integerColumnAnalizeResult0.getNullCount());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(6640, int0);
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-642), integerColumnAnalizeResult0.getMin());
      assertEquals((-1), integerColumnAnalizeResult0.getRowEnd());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(0, integerColumnAnalizeResult0.getUniqCount());
      assertEquals(1660, integerColumnAnalizeResult0.getMax());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("s=u|;t|8h=(<", 0, false, (-557), 0, 296, 296, (-1459), 296, 1);
      int int0 = integerColumnAnalizeResult0.getColumnSize();
      assertEquals((-1459), integerColumnAnalizeResult0.getMax());
      assertEquals(296, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(0, int0);
      assertEquals(1, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(296, integerColumnAnalizeResult0.getUniqCount());
      assertEquals(0, integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals(296, integerColumnAnalizeResult0.getMin());
      assertEquals((-557), integerColumnAnalizeResult0.getNullCount());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("0Ssshnk.K{*ZU?EZ&", 565, false, 565, 565, 2103, 533, 533, 565, 3);
      int int0 = integerColumnAnalizeResult0.getColumnSize();
      assertEquals(3, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(2103, integerColumnAnalizeResult0.getUniqCount());
      assertEquals(533, integerColumnAnalizeResult0.getMin());
      assertEquals(2260, integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals(565, int0);
      assertEquals(565, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(533, integerColumnAnalizeResult0.getMax());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(565, integerColumnAnalizeResult0.getNullCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult((String) null, 1000, true, 1000, 1000, (-1309), 1000, (-1309), 1, 1000);
      integerColumnAnalizeResult0.getColumnName();
      assertEquals((-1309), integerColumnAnalizeResult0.getMax());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-1309), integerColumnAnalizeResult0.getUniqCount());
      assertEquals(1000, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(4000, integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals(1, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(1000, integerColumnAnalizeResult0.getMin());
      assertEquals(999, integerColumnAnalizeResult0.getRowEnd());
      assertEquals(1000, integerColumnAnalizeResult0.getNullCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("", 8, true, 0, 0, 8, (-1), 1502, 462, 462);
      integerColumnAnalizeResult0.getColumnName();
      assertEquals(0, integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(462, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(8, integerColumnAnalizeResult0.getColumnSize());
      assertEquals(462, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertEquals(1502, integerColumnAnalizeResult0.getMax());
      assertEquals((-1), integerColumnAnalizeResult0.getMin());
      assertEquals(8, integerColumnAnalizeResult0.getUniqCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("T(D8}|Y1p\"(>xY6", (-399), false, (-399), 0, (-399), 1029, (-930), 1029, 2725);
      integerColumnAnalizeResult0.getColumnName();
      assertEquals(1029, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-399), integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-930), integerColumnAnalizeResult0.getMax());
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertEquals(2725, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-400), integerColumnAnalizeResult0.getRowEnd());
      assertEquals((-399), integerColumnAnalizeResult0.getNullCount());
      assertEquals(1029, integerColumnAnalizeResult0.getMin());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("T(D8}|Y1p\"(>xY6", (-399), false, (-399), 0, (-399), 1029, (-930), 1029, 2725);
      int int0 = integerColumnAnalizeResult0.getNullCount();
      assertEquals((-930), integerColumnAnalizeResult0.getMax());
      assertEquals(1029, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-399), integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-399), int0);
      assertEquals(0, integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals((-399), integerColumnAnalizeResult0.getColumnSize());
      assertEquals(2725, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(1029, integerColumnAnalizeResult0.getMin());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult((String) null, 1000, true, 1000, 1000, (-1309), 1000, (-1309), 1, 1000);
      boolean boolean0 = integerColumnAnalizeResult0.maybeSorted();
      assertEquals(1000, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(1000, integerColumnAnalizeResult0.getMin());
      assertTrue(boolean0);
      assertEquals(1, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-1309), integerColumnAnalizeResult0.getMax());
      assertEquals(1000, integerColumnAnalizeResult0.getNullCount());
      assertEquals(1000, integerColumnAnalizeResult0.getRowCount());
      assertEquals(1000, integerColumnAnalizeResult0.getColumnSize());
      assertEquals((-1309), integerColumnAnalizeResult0.getUniqCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("%{FKwB?8@@eBC#}EJ", (-1552), true, 0, (-1552), 0, 0, 0, 0, (-1552));
      int int0 = integerColumnAnalizeResult0.getMax();
      assertEquals(0, integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-6208), integerColumnAnalizeResult0.getLogicalDataSize());
      assertEquals((-1552), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(0, integerColumnAnalizeResult0.getMin());
      assertEquals(0, int0);
      assertEquals(0, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(0, integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-1552), integerColumnAnalizeResult0.getColumnSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("T(D8}|Y1p\"(>xY6", (-399), false, (-399), 0, (-399), 1029, (-930), 1029, 2725);
      int int0 = integerColumnAnalizeResult0.getMin();
      assertEquals(1029, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-399), integerColumnAnalizeResult0.getUniqCount());
      assertEquals(0, integerColumnAnalizeResult0.getLogicalDataSize());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(1029, int0);
      assertEquals((-399), integerColumnAnalizeResult0.getNullCount());
      assertEquals((-930), integerColumnAnalizeResult0.getMax());
      assertEquals(2725, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-400), integerColumnAnalizeResult0.getRowEnd());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("tq|T", (-1904), true, (-1904), (-1904), (-1904), (-1904), (-1904), (-1904), (-1904));
      int int0 = integerColumnAnalizeResult0.getLogicalDataSize();
      assertEquals((-1904), integerColumnAnalizeResult0.getMax());
      assertEquals((-7616), int0);
      assertEquals((-1904), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-1904), integerColumnAnalizeResult0.getNullCount());
      assertEquals((-1905), integerColumnAnalizeResult0.getRowEnd());
      assertEquals((-1904), integerColumnAnalizeResult0.getMin());
      assertEquals((-1904), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1904), integerColumnAnalizeResult0.getUniqCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("T(D8}|Y1p\"(>xY6", (-399), false, (-399), 0, (-399), 1029, (-930), 1029, 2725);
      int int0 = integerColumnAnalizeResult0.getUniqCount();
      assertEquals((-399), integerColumnAnalizeResult0.getNullCount());
      assertEquals(2725, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(1029, integerColumnAnalizeResult0.getMin());
      assertFalse(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-400), integerColumnAnalizeResult0.getRowEnd());
      assertEquals((-399), int0);
      assertEquals(0, integerColumnAnalizeResult0.getRowCount());
      assertEquals(1029, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-930), integerColumnAnalizeResult0.getMax());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("%{FKwB?8@@eBC#}EJ", (-1552), true, 0, (-1552), 0, 0, 0, 0, (-1552));
      int int0 = integerColumnAnalizeResult0.getNullIgnoreRleGroupCount();
      assertEquals(0, integerColumnAnalizeResult0.getMax());
      assertEquals((-1552), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(0, integerColumnAnalizeResult0.getMin());
      assertEquals(0, int0);
      assertEquals((-1552), integerColumnAnalizeResult0.getRowCount());
      assertEquals(0, integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-1553), integerColumnAnalizeResult0.getRowEnd());
      assertEquals(0, integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("%{FKwB?8@@eBC#}EJ", (-1552), true, 0, (-1552), 0, 0, 0, 0, (-1552));
      int int0 = integerColumnAnalizeResult0.getRowCount();
      assertEquals((-1552), int0);
      assertEquals(0, integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-1553), integerColumnAnalizeResult0.getRowEnd());
      assertEquals(0, integerColumnAnalizeResult0.getMax());
      assertEquals(0, integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-1552), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(0, integerColumnAnalizeResult0.getMin());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("UNION", 1, true, 2351, 2351, 2351, 2351, 464, 1, 0);
      int int0 = integerColumnAnalizeResult0.getRowStart();
      assertEquals(2351, integerColumnAnalizeResult0.getUniqCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals(0, int0);
      assertEquals(2351, integerColumnAnalizeResult0.getRowCount());
      assertEquals(1, integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals(464, integerColumnAnalizeResult0.getMax());
      assertEquals(0, integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals(2351, integerColumnAnalizeResult0.getMin());
      assertEquals(2351, integerColumnAnalizeResult0.getNullCount());
      assertEquals(0, integerColumnAnalizeResult0.getRowEnd());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("f", (-1890), true, (-1890), (-1890), (-1890), (-1890), (-1890), (-1890), (-1890));
      integerColumnAnalizeResult0.getColumnType();
      assertEquals((-1890), integerColumnAnalizeResult0.getMin());
      assertEquals((-1890), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1890), integerColumnAnalizeResult0.getRowCount());
      assertEquals((-1890), integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-1890), integerColumnAnalizeResult0.getColumnSize());
      assertEquals((-1890), integerColumnAnalizeResult0.getMax());
      assertEquals((-1890), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-1890), integerColumnAnalizeResult0.getNullCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("f", (-1890), true, (-1890), (-1890), (-1890), (-1890), (-1890), (-1890), (-1890));
      int int0 = integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength();
      assertEquals((-1890), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
      assertEquals((-1890), integerColumnAnalizeResult0.getNullCount());
      assertEquals((-1890), int0);
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-1891), integerColumnAnalizeResult0.getRowEnd());
      assertEquals((-1890), integerColumnAnalizeResult0.getRowCount());
      assertEquals((-1890), integerColumnAnalizeResult0.getMax());
      assertEquals((-1890), integerColumnAnalizeResult0.getMin());
      assertEquals((-1890), integerColumnAnalizeResult0.getUniqCount());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("f", (-1890), true, (-1890), (-1890), (-1890), (-1890), (-1890), (-1890), (-1890));
      int int0 = integerColumnAnalizeResult0.getColumnSize();
      assertEquals((-1890), integerColumnAnalizeResult0.getUniqCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-1890), integerColumnAnalizeResult0.getNullCount());
      assertEquals((-1890), integerColumnAnalizeResult0.getMin());
      assertEquals((-1890), int0);
      assertEquals((-1890), integerColumnAnalizeResult0.getMax());
      assertEquals((-1890), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1890), integerColumnAnalizeResult0.getRowCount());
      assertEquals((-1890), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("tq|T", (-1904), true, (-1904), (-1904), (-1904), (-1904), (-1904), (-1904), (-1904));
      int int0 = integerColumnAnalizeResult0.getRowEnd();
      assertEquals((-1905), int0);
      assertEquals((-1904), integerColumnAnalizeResult0.getNullCount());
      assertTrue(integerColumnAnalizeResult0.maybeSorted());
      assertEquals((-1904), integerColumnAnalizeResult0.getMin());
      assertEquals((-1904), integerColumnAnalizeResult0.getNullIgonoreRleMaxRowGroupLength());
      assertEquals((-1904), integerColumnAnalizeResult0.getUniqCount());
      assertEquals((-1904), integerColumnAnalizeResult0.getMax());
      assertEquals((-1904), integerColumnAnalizeResult0.getRowCount());
      assertEquals((-1904), integerColumnAnalizeResult0.getNullIgnoreRleGroupCount());
  }
}
