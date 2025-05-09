/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 00:46:05 GMT 2022
 */

package me.marcosassuncao.servsim.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import me.marcosassuncao.servsim.job.Job;
import me.marcosassuncao.servsim.scheduler.OrderBySubmissionTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrderBySubmissionTime_ESTest extends OrderBySubmissionTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrderBySubmissionTime orderBySubmissionTime0 = new OrderBySubmissionTime();
      Job job0 = new Job(2572L);
      Job job1 = new Job(0L);
      int int0 = orderBySubmissionTime0.compare(job0, job1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OrderBySubmissionTime orderBySubmissionTime0 = new OrderBySubmissionTime();
      Job job0 = new Job(3648L);
      // Undeclared exception!
      try { 
        orderBySubmissionTime0.compare((Job) null, job0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("me.marcosassuncao.servsim.scheduler.OrderBySubmissionTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OrderBySubmissionTime orderBySubmissionTime0 = new OrderBySubmissionTime();
      String string0 = orderBySubmissionTime0.toString();
      assertEquals("OrderBySubmissionTime", string0);
  }
}
