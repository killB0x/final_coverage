/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:01:14 GMT 2022
 */

package jp.co.yahoo.yosegi.spread.column.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import jp.co.yahoo.yosegi.spread.column.filter.FilterType;
import jp.co.yahoo.yosegi.spread.column.filter.RegexpMatchStringFilter;
import jp.co.yahoo.yosegi.spread.column.filter.StringFilterType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RegexpMatchStringFilter_ESTest extends RegexpMatchStringFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegexpMatchStringFilter regexpMatchStringFilter0 = new RegexpMatchStringFilter((String) null);
      String string0 = regexpMatchStringFilter0.getSearchString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegexpMatchStringFilter regexpMatchStringFilter0 = new RegexpMatchStringFilter("");
      String string0 = regexpMatchStringFilter0.getSearchString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegexpMatchStringFilter regexpMatchStringFilter0 = new RegexpMatchStringFilter((String) null);
      StringFilterType stringFilterType0 = regexpMatchStringFilter0.getStringFilterType();
      assertEquals(StringFilterType.REGEXP, stringFilterType0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegexpMatchStringFilter regexpMatchStringFilter0 = new RegexpMatchStringFilter((String) null);
      FilterType filterType0 = regexpMatchStringFilter0.getFilterType();
      assertEquals(FilterType.STRING, filterType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegexpMatchStringFilter regexpMatchStringFilter0 = new RegexpMatchStringFilter("'~YYNfT<9<kTa*={J");
      String string0 = regexpMatchStringFilter0.getSearchString();
      assertEquals("'~YYNfT<9<kTa*={J", string0);
  }
}
