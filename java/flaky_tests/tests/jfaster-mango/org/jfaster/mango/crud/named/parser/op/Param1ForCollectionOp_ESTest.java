/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 00:03:55 GMT 2022
 */

package org.jfaster.mango.crud.named.parser.op;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.crud.named.parser.op.InOp;
import org.jfaster.mango.crud.named.parser.op.NotInOp;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Param1ForCollectionOp_ESTest extends Param1ForCollectionOp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotInOp notInOp0 = new NotInOp();
      String string0 = notInOp0.operator();
      assertEquals("not in", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InOp inOp0 = new InOp();
      String[] stringArray0 = new String[1];
      String string0 = inOp0.render("c", stringArray0);
      assertEquals("c in (null)", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NotInOp notInOp0 = new NotInOp();
      // Undeclared exception!
      try { 
        notInOp0.render("byGTHF,4'yBaB#Gj:", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params can't be null
         //
         verifyException("org.jfaster.mango.crud.named.parser.op.Param1ForCollectionOp", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InOp inOp0 = new InOp();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        inOp0.render("Ff4wygOQI1zjM}cfH", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length of params expected 1, but 2
         //
         verifyException("org.jfaster.mango.crud.named.parser.op.Param1ForCollectionOp", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InOp inOp0 = new InOp();
      int int0 = inOp0.paramCount();
      assertEquals(1, int0);
  }
}
