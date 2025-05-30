/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 00:42:29 GMT 2022
 */

package me.marcosassuncao.servsim.profile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import me.marcosassuncao.servsim.profile.PartitionPredicate;
import me.marcosassuncao.servsim.profile.ResourcePartition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResourcePartition_ESTest extends ResourcePartition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PartitionPredicate partitionPredicate0 = mock(PartitionPredicate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(partitionPredicate0).toString();
      ResourcePartition resourcePartition0 = new ResourcePartition(861, 2992, partitionPredicate0);
      resourcePartition0.getPredicate();
      assertEquals(2992, resourcePartition0.getInitialNumResources());
      assertEquals(861, resourcePartition0.getPartitionId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResourcePartition resourcePartition0 = new ResourcePartition(1, 1, (PartitionPredicate) null);
      int int0 = resourcePartition0.getPartitionId();
      assertEquals(1, resourcePartition0.getInitialNumResources());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PartitionPredicate partitionPredicate0 = mock(PartitionPredicate.class, new ViolatedAssumptionAnswer());
      ResourcePartition resourcePartition0 = new ResourcePartition((-644), (-2424), partitionPredicate0);
      int int0 = resourcePartition0.getPartitionId();
      assertEquals((-644), int0);
      assertEquals((-2424), resourcePartition0.getInitialNumResources());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ResourcePartition resourcePartition0 = new ResourcePartition(0, 0, (PartitionPredicate) null);
      int int0 = resourcePartition0.getInitialNumResources();
      assertEquals(0, int0);
      assertEquals(0, resourcePartition0.getPartitionId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PartitionPredicate partitionPredicate0 = mock(PartitionPredicate.class, new ViolatedAssumptionAnswer());
      ResourcePartition resourcePartition0 = new ResourcePartition((-644), (-2424), partitionPredicate0);
      int int0 = resourcePartition0.getInitialNumResources();
      assertEquals((-2424), int0);
      assertEquals((-644), resourcePartition0.getPartitionId());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ResourcePartition resourcePartition0 = new ResourcePartition(0, 0, (PartitionPredicate) null);
      resourcePartition0.getPredicate();
      assertEquals(0, resourcePartition0.getInitialNumResources());
      assertEquals(0, resourcePartition0.getPartitionId());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ResourcePartition resourcePartition0 = new ResourcePartition(0, 0, (PartitionPredicate) null);
      int int0 = resourcePartition0.getPartitionId();
      assertEquals(0, int0);
      assertEquals(0, resourcePartition0.getInitialNumResources());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ResourcePartition resourcePartition0 = new ResourcePartition(1035, 1035, (PartitionPredicate) null);
      int int0 = resourcePartition0.getInitialNumResources();
      assertEquals(1035, int0);
      assertEquals(1035, resourcePartition0.getPartitionId());
  }
}
