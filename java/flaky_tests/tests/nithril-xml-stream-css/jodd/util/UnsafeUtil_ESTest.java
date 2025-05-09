/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 09:42:55 GMT 2022
 */

package jodd.util;

import org.junit.Test;
import static org.junit.Assert.*;
import jodd.util.UnsafeUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnsafeUtil_ESTest extends UnsafeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = UnsafeUtil.getChars("");
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = UnsafeUtil.getChars((String) null);
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = UnsafeUtil.getChars("%L 9v\"");
      assertArrayEquals(new char[] {'%', 'L', ' ', '9', 'v', '\"'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnsafeUtil unsafeUtil0 = new UnsafeUtil();
      assertFalse(unsafeUtil0.hasUnsafe());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      boolean boolean0 = UnsafeUtil.hasUnsafe();
      assertFalse(boolean0);
  }
}
