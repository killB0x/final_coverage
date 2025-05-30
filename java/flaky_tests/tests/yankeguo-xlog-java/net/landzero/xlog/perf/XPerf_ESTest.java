/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 18:57:16 GMT 2022
 */

package net.landzero.xlog.perf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.landzero.xlog.XLogCommitter;
import net.landzero.xlog.perf.XPerf;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XPerf_ESTest extends XPerf_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      XLogCommitter xLogCommitter0 = XPerf.create("", objectArray0);
      assertNotNull(xLogCommitter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XPerf xPerf0 = new XPerf();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        XPerf.create("1Sup0", (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }
}
