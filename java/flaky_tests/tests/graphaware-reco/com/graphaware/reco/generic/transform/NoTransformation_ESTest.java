/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 03:45:53 GMT 2022
 */

package com.graphaware.reco.generic.transform;

import org.junit.Test;
import static org.junit.Assert.*;
import com.graphaware.reco.generic.config.Config;
import com.graphaware.reco.generic.config.SimpleConfig;
import com.graphaware.reco.generic.context.Context;
import com.graphaware.reco.generic.context.FilteringContext;
import com.graphaware.reco.generic.filter.Filter;
import com.graphaware.reco.generic.result.PartialScore;
import com.graphaware.reco.generic.transform.NoTransformation;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NoTransformation_ESTest extends NoTransformation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NoTransformation<Integer> noTransformation0 = NoTransformation.getInstance();
      NoTransformation<Object> noTransformation1 = NoTransformation.getInstance();
      SimpleConfig simpleConfig0 = (SimpleConfig)Config.UNLIMITED;
      LinkedList<Filter<Object, Object>> linkedList0 = new LinkedList<Filter<Object, Object>>();
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      FilteringContext<Object, Object> filteringContext0 = new FilteringContext<Object, Object>(noTransformation1, simpleConfig0, linkedList0, linkedHashSet0);
      PartialScore partialScore0 = noTransformation1.transform(noTransformation0, (PartialScore) null, filteringContext0);
      assertNull(partialScore0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NoTransformation<Object> noTransformation0 = NoTransformation.getInstance();
      Object object0 = new Object();
      PartialScore partialScore0 = new PartialScore();
      PartialScore partialScore1 = noTransformation0.transform(object0, partialScore0, (Context<?, ?>) null);
      assertSame(partialScore0, partialScore1);
  }
}
