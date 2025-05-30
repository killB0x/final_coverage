/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 23:38:16 GMT 2022
 */

package org.jfaster.mango.invoker.transfer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfaster.mango.invoker.transfer.StringListToStringTransfer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringListToStringTransfer_ESTest extends StringListToStringTransfer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringListToStringTransfer stringListToStringTransfer0 = new StringListToStringTransfer();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerFirst((String) null);
      // Undeclared exception!
      try { 
        stringListToStringTransfer0.propertyToColumn((List<String>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.util.Joiner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringListToStringTransfer stringListToStringTransfer0 = new StringListToStringTransfer();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      List<String> list0 = stringListToStringTransfer0.columnToProperty((String) null, type0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringListToStringTransfer stringListToStringTransfer0 = new StringListToStringTransfer();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      List<String> list0 = stringListToStringTransfer0.columnToProperty("YB|Cq'rzrO0nX(Kf2)'", type0);
      String string0 = stringListToStringTransfer0.propertyToColumn(list0);
      assertNotNull(string0);
      assertEquals("YB|Cq'rzrO0nX(Kf2)'", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringListToStringTransfer stringListToStringTransfer0 = new StringListToStringTransfer();
      String string0 = stringListToStringTransfer0.propertyToColumn((List<String>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringListToStringTransfer stringListToStringTransfer0 = new StringListToStringTransfer();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      List<String> list0 = stringListToStringTransfer0.columnToProperty("", type0);
      String string0 = stringListToStringTransfer0.propertyToColumn(list0);
      assertFalse(list0.contains(""));
      assertNotNull(string0);
      assertTrue(list0.isEmpty());
  }
}
