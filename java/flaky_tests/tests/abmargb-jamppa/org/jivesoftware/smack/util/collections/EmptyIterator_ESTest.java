/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 22:20:58 GMT 2022
 */

package org.jivesoftware.smack.util.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jivesoftware.smack.util.collections.EmptyIterator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmptyIterator_ESTest extends EmptyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyIterator<Object> emptyIterator0 = new EmptyIterator<Object>();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Iterator<Integer> iterator0 = EmptyIterator.getInstance();
      assertNotNull(iterator0);
  }
}
