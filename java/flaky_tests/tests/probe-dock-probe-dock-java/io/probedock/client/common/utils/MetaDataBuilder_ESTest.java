/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 04:53:58 GMT 2022
 */

package io.probedock.client.common.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.probedock.client.common.utils.MetaDataBuilder;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MetaDataBuilder_ESTest extends MetaDataBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MetaDataBuilder metaDataBuilder0 = new MetaDataBuilder();
      metaDataBuilder0.add("", "");
      Map<String, String> map0 = metaDataBuilder0.toMetaData();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MetaDataBuilder metaDataBuilder0 = new MetaDataBuilder();
      MetaDataBuilder metaDataBuilder1 = metaDataBuilder0.add(metaDataBuilder0);
      assertSame(metaDataBuilder1, metaDataBuilder0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MetaDataBuilder metaDataBuilder0 = new MetaDataBuilder();
      Map<String, String> map0 = metaDataBuilder0.toMetaData();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MetaDataBuilder metaDataBuilder0 = new MetaDataBuilder();
      MetaDataBuilder metaDataBuilder1 = metaDataBuilder0.add("ZBP(.mM]>[k", "");
      assertSame(metaDataBuilder1, metaDataBuilder0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MetaDataBuilder metaDataBuilder0 = new MetaDataBuilder();
      // Undeclared exception!
      try { 
        metaDataBuilder0.add((MetaDataBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.probedock.client.common.utils.MetaDataBuilder", e);
      }
  }
}
