/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 23:19:13 GMT 2022
 */

package info.michaelwittig.javaq.query;

import org.junit.Test;
import static org.junit.Assert.*;
import info.michaelwittig.javaq.query.PrimitiveResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrimitiveResult_ESTest extends PrimitiveResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      PrimitiveResult<Object> primitiveResult0 = new PrimitiveResult<Object>(object0);
      Object object1 = primitiveResult0.getPrimitive();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrimitiveResult<Object> primitiveResult0 = new PrimitiveResult<Object>((Object) null);
      Object object0 = primitiveResult0.getPrimitive();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrimitiveResult<Object> primitiveResult0 = new PrimitiveResult<Object>((Object) null);
      String string0 = primitiveResult0.toString();
      assertEquals("PrimitiveResult [primitive=null]", string0);
  }
}
