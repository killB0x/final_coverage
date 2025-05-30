/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:07:25 GMT 2022
 */

package iot.jcypher.query.ast.start;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.query.ast.start.IndexOrId;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IndexOrId_ESTest extends IndexOrId_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndexOrId indexOrId0 = new IndexOrId("OPTIONAL_MATCH");
      String string0 = indexOrId0.getIndexName();
      assertEquals("OPTIONAL_MATCH", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IndexOrId indexOrId0 = new IndexOrId((String) null);
      List<Long> list0 = indexOrId0.getIds();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long[] longArray0 = new long[5];
      IndexOrId indexOrId0 = new IndexOrId(longArray0);
      List<Long> list0 = indexOrId0.getIds();
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndexOrId indexOrId0 = null;
      try {
        indexOrId0 = new IndexOrId((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.ast.start.IndexOrId", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      long[] longArray0 = new long[0];
      IndexOrId indexOrId0 = new IndexOrId(longArray0);
      List<Long> list0 = indexOrId0.getIds();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IndexOrId indexOrId0 = new IndexOrId("");
      String string0 = indexOrId0.getIndexName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      long[] longArray0 = new long[3];
      IndexOrId indexOrId0 = new IndexOrId(longArray0);
      String string0 = indexOrId0.getIndexName();
      assertNull(string0);
  }
}
