/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 00:19:44 GMT 2022
 */

package me.marcosassuncao.servsim.job;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import me.marcosassuncao.servsim.job.Job;
import me.marcosassuncao.servsim.job.JobResumeOverhead;
import me.marcosassuncao.servsim.job.WorkUnit;
import me.marcosassuncao.servsim.profile.RangeList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Job_ESTest extends Job_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Job job0 = new Job(1446, 1446, 1446);
      boolean boolean0 = job0.metDeadline();
      assertEquals((-1), job0.getUserId());
      assertEquals(1446L, job0.getRemainingWork());
      assertFalse(job0.isPreemptable());
      assertTrue(boolean0);
      assertEquals((-1), job0.getReservationId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Job job0 = new Job((-439L));
      // Undeclared exception!
      try { 
        job0.setUserId(0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Job job0 = new Job((-1L));
      // Undeclared exception!
      try { 
        job0.setReservationId(0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Job job0 = new Job(701L, 0L, 316);
      long long0 = job0.getRemainingWork();
      assertFalse(job0.isPreemptable());
      assertFalse(job0.hasReserved());
      assertEquals(0L, job0.getDeadlineDuration());
      assertEquals(701L, long0);
      assertEquals((-1), job0.getUserId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Job job0 = new Job((-1483L), (-1483L), (-265));
      long long0 = job0.getRemainingWork();
      assertEquals((-1), job0.getUserId());
      assertEquals((-1483L), long0);
      assertFalse(job0.hasReserved());
      assertEquals((-1483L), job0.getDeadlineDuration());
      assertFalse(job0.isPreemptable());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Job job0 = new Job(701L, 0L, 316);
      long long0 = job0.getDeadlineDuration();
      assertFalse(job0.isPreemptable());
      assertEquals(0L, long0);
      assertEquals((-1), job0.getReservationId());
      assertEquals((-1), job0.getUserId());
      assertEquals(701L, job0.getRemainingWork());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Job job0 = new Job((-1L), 790L, 7);
      long long0 = job0.getDeadlineDuration();
      assertEquals(790L, long0);
      assertFalse(job0.isPreemptable());
      assertEquals((-1), job0.getReservationId());
      assertEquals((-1L), job0.getRemainingWork());
      assertEquals((-1), job0.getUserId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Job job0 = new Job(2513L);
      // Undeclared exception!
      try { 
        job0.setStatus((WorkUnit.Status) null, 2513L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("me.marcosassuncao.servsim.job.DefaultWorkUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Job job0 = new Job(2513L);
      // Undeclared exception!
      try { 
        job0.getCurrentActivity();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Job job0 = new Job(33L);
      WorkUnit.Status workUnit_Status0 = WorkUnit.Status.PAUSED;
      boolean boolean0 = job0.setStatus(workUnit_Status0, 33L);
      assertEquals(33L, job0.getRemainingWork());
      assertFalse(job0.hasReserved());
      assertEquals((-1), job0.getUserId());
      assertEquals((-1L), job0.getDeadlineDuration());
      assertFalse(job0.isPreemptable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Job job0 = new Job(0L, 0L, 316);
      WorkUnit.Status workUnit_Status0 = WorkUnit.Status.ENQUEUED;
      boolean boolean0 = job0.setStatus(workUnit_Status0, (-1012L));
      assertEquals(WorkUnit.Status.ENQUEUED, job0.getStatus());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Job job0 = new Job(2513L);
      job0.getResourceRanges();
      assertEquals(2513L, job0.getRemainingWork());
      assertFalse(job0.isPreemptable());
      assertEquals((-1), job0.getReservationId());
      assertEquals((-1), job0.getUserId());
      assertEquals((-1L), job0.getDeadlineDuration());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Job job0 = new Job(2513L);
      // Undeclared exception!
      try { 
        job0.setResourceRanges((RangeList) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Job job0 = new Job(0L, 0L, 316);
      boolean boolean0 = job0.metDeadline();
      assertTrue(boolean0);
      assertEquals((-1), job0.getUserId());
      assertEquals(0L, job0.getRemainingWork());
      assertFalse(job0.isPreemptable());
      assertEquals((-1), job0.getReservationId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Job job0 = new Job((-26L));
      boolean boolean0 = job0.metDeadline();
      assertFalse(boolean0);
      assertFalse(job0.isPreemptable());
      assertEquals((-26L), job0.getRemainingWork());
      assertEquals((-1), job0.getUserId());
      assertEquals((-1L), job0.getDeadlineDuration());
      assertEquals((-1), job0.getReservationId());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Job job0 = new Job(61);
      // Undeclared exception!
      try { 
        job0.setUserId(61);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Job job0 = new Job(701L, 0L, 316);
      // Undeclared exception!
      try { 
        job0.setUserId((-1));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Job job0 = new Job(2513L);
      boolean boolean0 = job0.hasReserved();
      assertEquals(2513L, job0.getRemainingWork());
      assertFalse(boolean0);
      assertFalse(job0.isPreemptable());
      assertEquals((-1), job0.getUserId());
      assertEquals((-1L), job0.getDeadlineDuration());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Job job0 = new Job(86);
      // Undeclared exception!
      try { 
        job0.setReservationId(86);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Job job0 = new Job((-1252), (-1252), (-1252));
      // Undeclared exception!
      try { 
        job0.setReservationId((-1252));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Job.Builder job_Builder0 = new Job.Builder();
      Job.Builder job_Builder1 = job_Builder0.setDuration(519);
      assertSame(job_Builder1, job_Builder0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Job.Builder job_Builder0 = new Job.Builder();
      Job.Builder job_Builder1 = job_Builder0.setDeadline((-1066));
      assertSame(job_Builder0, job_Builder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Job.Builder job_Builder0 = new Job.Builder();
      // Undeclared exception!
      try { 
        job_Builder0.build();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.DefaultWorkUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Job.Builder job_Builder0 = new Job.Builder();
      Job.Builder job_Builder1 = job_Builder0.setPriority((-1066));
      assertSame(job_Builder0, job_Builder1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Job.Builder job_Builder0 = new Job.Builder();
      Job.Builder job_Builder1 = job_Builder0.setNumberResources(86);
      assertSame(job_Builder0, job_Builder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Job job0 = new Job(2513L);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      job0.forEach(consumer0);
      assertEquals((-1), job0.getUserId());
      assertEquals(2513L, job0.getRemainingWork());
      assertFalse(job0.isPreemptable());
      assertEquals((-1L), job0.getDeadlineDuration());
      assertEquals((-1), job0.getReservationId());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Job job0 = new Job(2513L);
      int int0 = job0.getUserId();
      assertEquals((-1L), job0.getDeadlineDuration());
      assertEquals((-1), int0);
      assertEquals(2513L, job0.getRemainingWork());
      assertFalse(job0.isPreemptable());
      assertFalse(job0.hasReserved());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Job job0 = new Job((-1027L));
      job0.iterator();
      assertEquals((-1), job0.getUserId());
      assertFalse(job0.hasReserved());
      assertEquals((-1L), job0.getDeadlineDuration());
      assertEquals((-1027L), job0.getRemainingWork());
      assertFalse(job0.isPreemptable());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Job job0 = new Job(1081L);
      job0.getNumActivities();
      assertEquals((-1L), job0.getDeadlineDuration());
      assertEquals((-1), job0.getUserId());
      assertEquals(1081L, job0.getRemainingWork());
      assertFalse(job0.isPreemptable());
      assertEquals((-1), job0.getReservationId());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Job job0 = new Job(0L, 0L, 316);
      long long0 = job0.getRemainingWork();
      assertEquals((-1), job0.getUserId());
      assertEquals(0L, job0.getDeadlineDuration());
      assertEquals(0L, long0);
      assertFalse(job0.isPreemptable());
      assertEquals((-1), job0.getReservationId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Job job0 = new Job(0L);
      // Undeclared exception!
      try { 
        job0.toString();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/MoreObjects
         //
         verifyException("me.marcosassuncao.servsim.job.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Job job0 = new Job((-1098L));
      job0.setDeadlineDuration((-1098L));
      assertEquals((-1098L), job0.getDeadlineDuration());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Job job0 = new Job((-281L), (-281L), (-1356));
      long long0 = job0.getDeadlineDuration();
      assertEquals((-281L), job0.getRemainingWork());
      assertEquals((-281L), long0);
      assertEquals((-1), job0.getUserId());
      assertFalse(job0.isPreemptable());
      assertEquals((-1), job0.getReservationId());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Job job0 = new Job(701L, 0L, 316);
      int int0 = job0.getReservationId();
      assertFalse(job0.isPreemptable());
      assertEquals((-1), int0);
      assertEquals((-1), job0.getUserId());
      assertEquals(701L, job0.getRemainingWork());
      assertEquals(0L, job0.getDeadlineDuration());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Job job0 = new Job(1081L);
      boolean boolean0 = job0.isPreemptable();
      assertEquals((-1), job0.getUserId());
      assertEquals(1081L, job0.getRemainingWork());
      assertFalse(job0.hasReserved());
      assertFalse(boolean0);
      assertEquals((-1L), job0.getDeadlineDuration());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Job.setResumeOverhead((JobResumeOverhead) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Job job0 = null;
      try {
        job0 = new Job((-1248), (-1248));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("me.marcosassuncao.servsim.job.DefaultWorkUnit", e);
      }
  }
}
