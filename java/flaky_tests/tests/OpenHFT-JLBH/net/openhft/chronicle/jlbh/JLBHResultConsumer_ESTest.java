/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 09:34:56 GMT 2022
 */

package net.openhft.chronicle.jlbh;

import org.junit.Test;
import static org.junit.Assert.*;
import net.openhft.chronicle.jlbh.JLBHResultConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JLBHResultConsumer_ESTest extends JLBHResultConsumer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JLBHResultConsumer jLBHResultConsumer0 = JLBHResultConsumer.newThreadSafeInstance();
      assertNotNull(jLBHResultConsumer0);
  }
}
