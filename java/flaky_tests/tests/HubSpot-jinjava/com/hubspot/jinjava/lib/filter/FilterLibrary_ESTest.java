/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:14:36 GMT 2022
 */

package com.hubspot.jinjava.lib.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.lib.filter.BatchFilter;
import com.hubspot.jinjava.lib.filter.Filter;
import com.hubspot.jinjava.lib.filter.FilterLibrary;
import com.hubspot.jinjava.lib.filter.JoinFilter;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FilterLibrary_ESTest extends FilterLibrary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilterLibrary filterLibrary0 = new FilterLibrary(false, (Set<String>) null);
      BatchFilter batchFilter0 = new BatchFilter();
      filterLibrary0.register("", (Filter) batchFilter0);
      Filter filter0 = filterLibrary0.getFilter("");
      assertEquals("batch", filter0.getName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilterLibrary filterLibrary0 = new FilterLibrary(false, (Set<String>) null);
      // Undeclared exception!
      try { 
        filterLibrary0.addFilter((Filter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.lib.SimpleLibrary", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FilterLibrary filterLibrary0 = null;
      try {
        filterLibrary0 = new FilterLibrary(true, (Set<String>) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Strings
         //
         verifyException("com.hubspot.jinjava.lib.filter.AbstractFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FilterLibrary filterLibrary0 = new FilterLibrary(false, (Set<String>) null);
      // Undeclared exception!
      try { 
        filterLibrary0.registerDefaults();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Strings
         //
         verifyException("com.hubspot.jinjava.lib.filter.AbstractFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FilterLibrary filterLibrary0 = new FilterLibrary(false, (Set<String>) null);
      JoinFilter joinFilter0 = new JoinFilter();
      filterLibrary0.addFilter(joinFilter0);
      assertEquals("join", joinFilter0.getName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FilterLibrary filterLibrary0 = new FilterLibrary(false, (Set<String>) null);
      Filter filter0 = filterLibrary0.getFilter("");
      assertNull(filter0);
  }
}
