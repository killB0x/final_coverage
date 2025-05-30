/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:41:42 GMT 2022
 */

package net.segoia.util.persistence;

import org.junit.Test;
import static org.junit.Assert.*;
import net.segoia.util.persistence.PersistentValueType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PersistentValueType_ESTest extends PersistentValueType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PersistentValueType[] persistentValueTypeArray0 = PersistentValueType.values();
      assertEquals(5, persistentValueTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PersistentValueType persistentValueType0 = PersistentValueType.valueOf("STRING");
      assertEquals(PersistentValueType.STRING, persistentValueType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PersistentValueType persistentValueType0 = PersistentValueType.valueOf("VALUES_SET");
      assertEquals(4L, persistentValueType0.getId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PersistentValueType persistentValueType0 = PersistentValueType.STRING;
      long long0 = persistentValueType0.getId();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PersistentValueType persistentValueType0 = PersistentValueType.LONG;
      long long0 = persistentValueType0.getId();
      assertEquals(1L, long0);
  }
}
