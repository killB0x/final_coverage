/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 15:54:11 GMT 2022
 */

package net.imglib2.loops;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.loops.ClassCopier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassCopier_ESTest extends ClassCopier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassCopier<Integer> classCopier0 = null;
      try {
        classCopier0 = new ClassCopier<Integer>(class0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // \"original\" must be a implementation of interface \"interfaceOfOriginal\"
         //
         verifyException("net.imglib2.loops.ClassCopier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      ClassCopier<Object> classCopier0 = null;
      try {
        classCopier0 = new ClassCopier<Object>(class0, class1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.loops.ClassCopier", e);
      }
  }
}
