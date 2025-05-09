/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:56:21 GMT 2022
 */

package jp.co.yahoo.yosegi.spread.column.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.Set;
import jp.co.yahoo.yosegi.spread.column.filter.FilterType;
import jp.co.yahoo.yosegi.spread.column.filter.StringDictionaryFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringDictionaryFilter_ESTest extends StringDictionaryFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("jp.co.yahoo.yosegi.spread.column.filter.StringDictionaryFilter");
      StringDictionaryFilter stringDictionaryFilter0 = new StringDictionaryFilter(linkedHashSet0);
      Set<String> set0 = stringDictionaryFilter0.getDictionary();
      assertTrue(set0.contains("jp.co.yahoo.yosegi.spread.column.filter.StringDictionaryFilter"));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringDictionaryFilter stringDictionaryFilter0 = null;
      try {
        stringDictionaryFilter0 = new StringDictionaryFilter((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      StringDictionaryFilter stringDictionaryFilter0 = new StringDictionaryFilter(linkedHashSet0);
      Set<String> set0 = stringDictionaryFilter0.getDictionary();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      StringDictionaryFilter stringDictionaryFilter0 = new StringDictionaryFilter(linkedHashSet0);
      FilterType filterType0 = stringDictionaryFilter0.getFilterType();
      assertEquals(FilterType.STRING_DICTIONARY, filterType0);
  }
}
