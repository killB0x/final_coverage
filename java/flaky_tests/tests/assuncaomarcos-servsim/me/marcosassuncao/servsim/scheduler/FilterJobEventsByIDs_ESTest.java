/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 00:33:39 GMT 2022
 */

package me.marcosassuncao.servsim.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import me.marcosassuncao.servsim.SimEvent;
import me.marcosassuncao.servsim.scheduler.FilterJobEventsByIDs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FilterJobEventsByIDs_ESTest extends FilterJobEventsByIDs_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilterJobEventsByIDs filterJobEventsByIDs0 = new FilterJobEventsByIDs();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      filterJobEventsByIDs0.setJobIDs(linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilterJobEventsByIDs filterJobEventsByIDs0 = new FilterJobEventsByIDs();
      // Undeclared exception!
      try { 
        filterJobEventsByIDs0.test((SimEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("me.marcosassuncao.servsim.scheduler.FilterJobEventsByIDs", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FilterJobEventsByIDs filterJobEventsByIDs0 = new FilterJobEventsByIDs();
      // Undeclared exception!
      try { 
        filterJobEventsByIDs0.setJobIDs((Collection<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FilterJobEventsByIDs filterJobEventsByIDs0 = new FilterJobEventsByIDs();
      filterJobEventsByIDs0.setJobID(0);
  }
}
