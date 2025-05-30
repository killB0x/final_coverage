/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 05:28:19 GMT 2022
 */

package au.com.anthonybruno.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import au.com.anthonybruno.utils.Lazy;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Lazy_ESTest extends Lazy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Supplier<Integer> supplier0 = (Supplier<Integer>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Lazy<Integer> lazy0 = new Lazy<Integer>(supplier0);
      Integer integer0 = lazy0.get();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Supplier<Integer> supplier0 = (Supplier<Integer>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Lazy<Integer> lazy0 = new Lazy<Integer>(supplier0);
      Supplier<Object> supplier1 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier1).get();
      Lazy<Object> lazy1 = new Lazy<Object>(supplier1);
      Object object0 = lazy1.get();
      //  // Unstable assertion: assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(1968);
      Supplier<Integer> supplier0 = (Supplier<Integer>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(supplier0).get();
      Lazy<Integer> lazy0 = new Lazy<Integer>(supplier0);
      lazy0.get();
      Integer integer1 = lazy0.get();
      assertEquals(1968, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Lazy<Object> lazy0 = new Lazy<Object>((Supplier<Object>) null);
      // Undeclared exception!
      try { 
        lazy0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("au.com.anthonybruno.utils.Lazy", e);
      }
  }
}
