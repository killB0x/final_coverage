/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 08:49:13 GMT 2022
 */

package se.mockachino.matchers.matcher;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import se.mockachino.matchers.matcher.IdentityMatcher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IdentityMatcher_ESTest extends IdentityMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      IdentityMatcher<Integer> identityMatcher0 = new IdentityMatcher<Integer>(integer0);
      Class<Integer> class0 = identityMatcher0.getType();
      assertEquals(17, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IdentityMatcher<Integer> identityMatcher0 = new IdentityMatcher<Integer>((Integer) null);
      Class<Integer> class0 = identityMatcher0.getType();
      assertEquals(1, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IdentityMatcher<Integer> identityMatcher0 = new IdentityMatcher<Integer>((Integer) null);
      boolean boolean0 = identityMatcher0.matches((Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IdentityMatcher<Integer> identityMatcher0 = new IdentityMatcher<Integer>((Integer) null);
      Integer integer0 = new Integer(0);
      boolean boolean0 = identityMatcher0.matches(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IdentityMatcher<Integer> identityMatcher0 = new IdentityMatcher<Integer>((Integer) null);
      String string0 = identityMatcher0.asString();
      assertEquals("null", string0);
  }
}
