/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 02:31:06 GMT 2022
 */

package net.sf.sojo.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.sojo.core.IConverterExtension;
import net.sf.sojo.core.conversion.Iterateable2IterateableConversion;
import net.sf.sojo.core.conversion.IterateableMap2BeanConversion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IterableConversion_ESTest extends IterableConversion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IterateableMap2BeanConversion iterateableMap2BeanConversion0 = new IterateableMap2BeanConversion();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        iterateableMap2BeanConversion0.convert((Object) null, class0, (IConverterExtension) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't create a Bean from class: class java.lang.Integer
         //
         verifyException("net.sf.sojo.core.conversion.IterateableMap2BeanConversion", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Iterateable2IterateableConversion iterateable2IterateableConversion0 = new Iterateable2IterateableConversion();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        iterateable2IterateableConversion0.convert((Object) null, class0, (IConverterExtension) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.sojo.core.conversion.Iterateable2IterateableConversion", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Iterateable2IterateableConversion iterateable2IterateableConversion0 = new Iterateable2IterateableConversion();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        iterateable2IterateableConversion0.convert(iterateable2IterateableConversion0, class0, (IConverterExtension) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.sf.sojo.core.conversion.Iterateable2IterateableConversion cannot be cast to class java.util.Collection (net.sf.sojo.core.conversion.Iterateable2IterateableConversion is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @6e728e22; java.util.Collection is in module java.base of loader 'bootstrap')
         //
         verifyException("net.sf.sojo.core.conversion.Iterateable2IterateableConversion", e);
      }
  }
}
