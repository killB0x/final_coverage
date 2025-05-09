/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:59:06 GMT 2022
 */

package com.hubspot.jinjava.interpret;

import org.junit.Test;
import static org.junit.Assert.*;
import com.hubspot.jinjava.interpret.CollectionTooBigException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CollectionTooBigException_ESTest extends CollectionTooBigException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CollectionTooBigException collectionTooBigException0 = new CollectionTooBigException(0, (-1));
      int int0 = collectionTooBigException0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CollectionTooBigException collectionTooBigException0 = new CollectionTooBigException((-1), 0);
      int int0 = collectionTooBigException0.getSize();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollectionTooBigException collectionTooBigException0 = new CollectionTooBigException((-1), 0);
      int int0 = collectionTooBigException0.getMaxSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CollectionTooBigException collectionTooBigException0 = new CollectionTooBigException(4711, 1);
      int int0 = collectionTooBigException0.getMaxSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CollectionTooBigException collectionTooBigException0 = new CollectionTooBigException(4711, 1);
      String string0 = collectionTooBigException0.getMessage();
      assertEquals("Collection of size 4711 is greater than the maximum size of 1", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CollectionTooBigException collectionTooBigException0 = new CollectionTooBigException(4711, 1);
      int int0 = collectionTooBigException0.getSize();
      assertEquals(4711, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CollectionTooBigException collectionTooBigException0 = new CollectionTooBigException((-1098), (-1098));
      int int0 = collectionTooBigException0.getMaxSize();
      assertEquals((-1098), int0);
  }
}
