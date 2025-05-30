/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 09:35:47 GMT 2022
 */

package net.openhft.chronicle.jlbh;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.LinkedList;
import net.openhft.chronicle.jlbh.ImmutableJLBHResult;
import net.openhft.chronicle.jlbh.ImmutableProbeResult;
import net.openhft.chronicle.jlbh.JLBHResult;
import net.openhft.chronicle.jlbh.ThreadSafeJLBHResultConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ThreadSafeJLBHResultConsumer_ESTest extends ThreadSafeJLBHResultConsumer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadSafeJLBHResultConsumer threadSafeJLBHResultConsumer0 = new ThreadSafeJLBHResultConsumer();
      LinkedList<double[]> linkedList0 = new LinkedList<double[]>();
      ImmutableProbeResult immutableProbeResult0 = new ImmutableProbeResult(linkedList0);
      HashMap<String, ImmutableProbeResult> hashMap0 = new HashMap<String, ImmutableProbeResult>();
      ImmutableJLBHResult immutableJLBHResult0 = new ImmutableJLBHResult(immutableProbeResult0, hashMap0);
      threadSafeJLBHResultConsumer0.accept((JLBHResult) immutableJLBHResult0);
      JLBHResult jLBHResult0 = threadSafeJLBHResultConsumer0.get();
      assertSame(jLBHResult0, immutableJLBHResult0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThreadSafeJLBHResultConsumer threadSafeJLBHResultConsumer0 = new ThreadSafeJLBHResultConsumer();
      JLBHResult jLBHResult0 = threadSafeJLBHResultConsumer0.get();
      assertNull(jLBHResult0);
  }
}
