/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 09:00:50 GMT 2022
 */

package se.mockachino.assertion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import se.mockachino.Mockachino;
import se.mockachino.assertion.AssertThrows;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AssertThrows_ESTest extends AssertThrows_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      AssertThrows assertThrows0 = new AssertThrows(class0);
      // Undeclared exception!
      try { 
        assertThrows0.on((Object) assertThrows0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only interfaces can be mocked without cglib and asm installed
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      AssertThrows assertThrows0 = new AssertThrows(class0);
      // Undeclared exception!
      try { 
        assertThrows0.on((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.mockachino.assertion.AssertThrows", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      AssertThrows assertThrows0 = new AssertThrows(class0);
      Object object0 = assertThrows0.on((Object) class0);
      Object object1 = assertThrows0.on(object0);
      // Undeclared exception!
      try { 
        Mockachino.getData(object1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // argument null is not a mock object
         //
      }
  }
}
