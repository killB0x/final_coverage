/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 04:50:08 GMT 2022
 */

package heros.fieldsens.structs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import heros.fieldsens.AccessPath;
import heros.fieldsens.Resolver;
import heros.fieldsens.structs.WrappedFact;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WrappedFact_ESTest extends WrappedFact_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WrappedFact<Integer, Integer, Integer, WrappedFact<Integer, Integer, Integer, Integer>> wrappedFact0 = null;
      try {
        wrappedFact0 = new WrappedFact<Integer, Integer, Integer, WrappedFact<Integer, Integer, Integer, Integer>>((Integer) null, (AccessPath<Integer>) null, (Resolver<Integer, Integer, Integer, WrappedFact<Integer, Integer, Integer, Integer>>) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-6));
      WrappedFact<Integer, Integer, Integer, WrappedFact<Integer, Integer, Integer, Integer>> wrappedFact0 = null;
      try {
        wrappedFact0 = new WrappedFact<Integer, Integer, Integer, WrappedFact<Integer, Integer, Integer, Integer>>(integer0, (AccessPath<Integer>) null, (Resolver<Integer, Integer, Integer, WrappedFact<Integer, Integer, Integer, Integer>>) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
