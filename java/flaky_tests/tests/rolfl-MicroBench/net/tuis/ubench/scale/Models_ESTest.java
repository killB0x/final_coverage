/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 08:37:53 GMT 2022
 */

package net.tuis.ubench.scale;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.tuis.ubench.scale.MathModel;
import net.tuis.ubench.scale.Models;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Models_ESTest extends Models_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Models.createPolynom(4942);
      Models.createPolynom(4942);
      // Undeclared exception!
      Models.createPolynom(4942);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MathModel mathModel0 = Models.createPolynom(1);
      assertEquals("%f*n + %f", mathModel0.toString());
      assertEquals("O(n)", mathModel0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MathModel mathModel0 = Models.createPolynom(0);
      assertEquals("%f", mathModel0.toString());
      assertEquals("O(1)", mathModel0.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Models.createPolynom((-1058));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Degree must be positive
         //
         verifyException("net.tuis.ubench.scale.Models", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Models models0 = new Models();
  }
}
