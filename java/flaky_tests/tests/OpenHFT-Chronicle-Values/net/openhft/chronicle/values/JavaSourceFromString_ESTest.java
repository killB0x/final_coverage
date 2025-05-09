/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 10:55:01 GMT 2022
 */

package net.openhft.chronicle.values;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.openhft.chronicle.values.JavaSourceFromString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaSourceFromString_ESTest extends JavaSourceFromString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaSourceFromString javaSourceFromString0 = new JavaSourceFromString("", (String) null);
      CharSequence charSequence0 = javaSourceFromString0.getCharContent(false);
      assertNull(charSequence0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaSourceFromString javaSourceFromString0 = null;
      try {
        javaSourceFromString0 = new JavaSourceFromString((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.openhft.chronicle.values.JavaSourceFromString", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaSourceFromString javaSourceFromString0 = null;
      try {
        javaSourceFromString0 = new JavaSourceFromString("K`9!", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 11: string:///K`9!.java
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JavaSourceFromString javaSourceFromString0 = new JavaSourceFromString("6FVw0lJUG?Jn=/", "6FVw0lJUG?Jn=/");
      CharSequence charSequence0 = javaSourceFromString0.getCharContent(false);
      assertEquals("6FVw0lJUG?Jn=/", charSequence0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JavaSourceFromString javaSourceFromString0 = new JavaSourceFromString("", "");
      CharSequence charSequence0 = javaSourceFromString0.getCharContent(false);
      assertEquals("", charSequence0);
  }
}
