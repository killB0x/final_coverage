/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 13 18:51:00 GMT 2022
 */

package us.parr.lib.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.parr.lib.util.ObjectEqualityComparator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ObjectEqualityComparator_ESTest extends ObjectEqualityComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectEqualityComparator objectEqualityComparator0 = new ObjectEqualityComparator();
      Object object0 = new Object();
      boolean boolean0 = objectEqualityComparator0.equals(object0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectEqualityComparator objectEqualityComparator0 = new ObjectEqualityComparator();
      Object object0 = new Object();
      boolean boolean0 = objectEqualityComparator0.equals((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectEqualityComparator objectEqualityComparator0 = new ObjectEqualityComparator();
      boolean boolean0 = objectEqualityComparator0.equals((Object) null, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectEqualityComparator objectEqualityComparator0 = new ObjectEqualityComparator();
      objectEqualityComparator0.hashCode((Object) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectEqualityComparator objectEqualityComparator0 = new ObjectEqualityComparator();
      Object object0 = new Object();
      objectEqualityComparator0.hashCode(object0);
  }
}
