/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 08:50:51 GMT 2022
 */

package se.mockachino.matchers.matcher;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import se.mockachino.matchers.matcher.RegexpMatcher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RegexpMatcher_ESTest extends RegexpMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegexpMatcher regexpMatcher0 = null;
      try {
        regexpMatcher0 = new RegexpMatcher("d/\")_,|");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 2
         // d/\")_,|
         //   ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegexpMatcher regexpMatcher0 = null;
      try {
        regexpMatcher0 = new RegexpMatcher((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegexpMatcher regexpMatcher0 = new RegexpMatcher("h 5>aKy=+_$l#zNA&K@");
      boolean boolean0 = regexpMatcher0.matches((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegexpMatcher regexpMatcher0 = new RegexpMatcher("se.mockachino.matchers.matcher.BasicMatcher");
      boolean boolean0 = regexpMatcher0.matches("se.mockachino.matchers.matcher.BasicMatcher");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegexpMatcher regexpMatcher0 = new RegexpMatcher("se.mockachino.matchers.matcher.BasicMatcher");
      Class<String> class0 = regexpMatcher0.getType();
      assertFalse(class0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegexpMatcher regexpMatcher0 = new RegexpMatcher("se.mockachino.matchers.matcher.RegexpMatcher");
      String string0 = regexpMatcher0.asString();
      assertEquals("regexp(\"se.mockachino.matchers.matcher.RegexpMatcher\")", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegexpMatcher regexpMatcher0 = new RegexpMatcher((Pattern) null);
      // Undeclared exception!
      try { 
        regexpMatcher0.matches("<C)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.mockachino.matchers.matcher.RegexpMatcher", e);
      }
  }
}
