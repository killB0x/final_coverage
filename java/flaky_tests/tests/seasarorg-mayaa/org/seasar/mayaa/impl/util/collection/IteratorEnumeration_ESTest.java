/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 02:06:41 GMT 2022
 */

package org.seasar.mayaa.impl.util.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Enumeration;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.seasar.mayaa.impl.util.collection.EnumerationIterator;
import org.seasar.mayaa.impl.util.collection.IteratorEnumeration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IteratorEnumeration_ESTest extends IteratorEnumeration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enumeration<Integer> enumeration0 = IteratorEnumeration.getInstance((Iterator<Integer>) null);
      Iterator<Integer> iterator0 = EnumerationIterator.getInstance(enumeration0);
      Enumeration<Integer> enumeration1 = IteratorEnumeration.getInstance(iterator0);
      assertSame(enumeration0, enumeration1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Iterator<EnumerationIterator<Object>> iterator0 = EnumerationIterator.getInstance((Enumeration<EnumerationIterator<Object>>) null);
      Enumeration<EnumerationIterator<Object>> enumeration0 = IteratorEnumeration.getInstance(iterator0);
      Iterator<EnumerationIterator<Object>> iterator1 = EnumerationIterator.getInstance(enumeration0);
      assertSame(iterator0, iterator1);
  }
}
