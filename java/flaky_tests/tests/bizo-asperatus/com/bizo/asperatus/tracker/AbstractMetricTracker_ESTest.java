/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 12:21:45 GMT 2022
 */

package com.bizo.asperatus.tracker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.bizo.asperatus.model.Dimension;
import com.bizo.asperatus.model.Unit;
import com.bizo.asperatus.tracker.impl.SystemOutTracker;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractMetricTracker_ESTest extends AbstractMetricTracker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemOutTracker systemOutTracker0 = new SystemOutTracker();
      systemOutTracker0.close();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemOutTracker systemOutTracker0 = new SystemOutTracker();
      // Undeclared exception!
      try { 
        systemOutTracker0.track("", (Number) null, (List<Dimension>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemOutTracker systemOutTracker0 = new SystemOutTracker();
      Unit unit0 = Unit.Gigabytes;
      // Undeclared exception!
      try { 
        systemOutTracker0.track("", (Number) null, unit0, (List<Dimension>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SystemOutTracker systemOutTracker0 = new SystemOutTracker();
      Byte byte0 = Byte.valueOf((byte) (-29));
      Unit unit0 = Unit.GigabytesSecond;
      LinkedList<Dimension> linkedList0 = new LinkedList<Dimension>();
      linkedList0.addLast((Dimension) null);
      // Undeclared exception!
      try { 
        systemOutTracker0.track((String) null, (Number) byte0, unit0, (List<Dimension>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.bizo.asperatus.tracker.AbstractMetricTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SystemOutTracker systemOutTracker0 = new SystemOutTracker();
      LinkedList<Dimension> linkedList0 = new LinkedList<Dimension>();
      Unit unit0 = Unit.Terabytes;
      // Undeclared exception!
      try { 
        systemOutTracker0.track((String) null, (Number) null, unit0, (List<Dimension>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.bizo.asperatus.tracker.AbstractMetricTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SystemOutTracker systemOutTracker0 = new SystemOutTracker();
      LinkedList<Dimension> linkedList0 = new LinkedList<Dimension>();
      linkedList0.add((Dimension) null);
      // Undeclared exception!
      try { 
        systemOutTracker0.track("+", (Number) null, (List<Dimension>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.bizo.asperatus.tracker.AbstractMetricTracker", e);
      }
  }
}
