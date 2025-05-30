/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 00:01:44 GMT 2022
 */

package executionChains.chainExecutors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import executionChains.Chain;
import executionChains.ChainFunction;
import executionChains.ChainNode;
import executionChains.SimpleChainNode;
import executionChains.chainExecutors.DefaultOrderedExecutor;
import executionChains.chainExecutors.LoopExecutor;
import executionChains.chainExecutors.LoopUntilExecutor;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultOrderedExecutor_ESTest extends DefaultOrderedExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chain<ChainNode<Object>> chain0 = (Chain<ChainNode<Object>>) mock(Chain.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(chain0).getNodes();
      ChainFunction<Object> chainFunction0 = (ChainFunction<Object>) mock(ChainFunction.class, new ViolatedAssumptionAnswer());
      SimpleChainNode<Object> simpleChainNode0 = new SimpleChainNode<Object>(chainFunction0);
      DefaultOrderedExecutor<ChainNode<Object>> defaultOrderedExecutor0 = null;
      try {
        defaultOrderedExecutor0 = new DefaultOrderedExecutor<ChainNode<Object>>(chain0, simpleChainNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("executionChains.chainExecutors.ChainExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<ChainNode<Object>> linkedList0 = new LinkedList<ChainNode<Object>>();
      Chain<SimpleChainNode<Object>> chain0 = (Chain<SimpleChainNode<Object>>) mock(Chain.class, new ViolatedAssumptionAnswer());
      Chain<ChainNode<Object>> chain1 = (Chain<ChainNode<Object>>) mock(Chain.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(chain1).getNodes();
      ChainFunction<Object> chainFunction0 = (ChainFunction<Object>) mock(ChainFunction.class, new ViolatedAssumptionAnswer());
      SimpleChainNode<Object> simpleChainNode0 = new SimpleChainNode<Object>(chainFunction0);
      DefaultOrderedExecutor<ChainNode<Object>> defaultOrderedExecutor0 = null;
      try {
        defaultOrderedExecutor0 = new DefaultOrderedExecutor<ChainNode<Object>>(chain1, simpleChainNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("executionChains.chainExecutors.ChainExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Chain<Integer> chain0 = (Chain<Integer>) mock(Chain.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(chain0).getNodes();
      DefaultOrderedExecutor<Integer> defaultOrderedExecutor0 = null;
      try {
        defaultOrderedExecutor0 = new DefaultOrderedExecutor<Integer>(chain0, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("executionChains.chainExecutors.ChainExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Chain<SimpleChainNode<Object>> chain0 = (Chain<SimpleChainNode<Object>>) mock(Chain.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(chain0).getNodes();
      ChainFunction<Object> chainFunction0 = (ChainFunction<Object>) mock(ChainFunction.class, new ViolatedAssumptionAnswer());
      SimpleChainNode<Object> simpleChainNode0 = new SimpleChainNode<Object>(chainFunction0);
      LoopExecutor<SimpleChainNode<Object>> loopExecutor0 = null;
      try {
        loopExecutor0 = new LoopExecutor<SimpleChainNode<Object>>(chain0, simpleChainNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("executionChains.chainExecutors.ChainExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<ChainNode<Object>> linkedList0 = new LinkedList<ChainNode<Object>>();
      Chain<SimpleChainNode<Object>> chain0 = (Chain<SimpleChainNode<Object>>) mock(Chain.class, new ViolatedAssumptionAnswer());
      SimpleChainNode<Object> simpleChainNode0 = new SimpleChainNode<Object>((ChainFunction<Object>) null);
      Chain<SimpleChainNode<Integer>> chain1 = (Chain<SimpleChainNode<Integer>>) mock(Chain.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(chain1).getNodes();
      ChainFunction<Integer> chainFunction0 = (ChainFunction<Integer>) mock(ChainFunction.class, new ViolatedAssumptionAnswer());
      SimpleChainNode<Integer> simpleChainNode1 = new SimpleChainNode<Integer>(chainFunction0);
      LoopUntilExecutor<SimpleChainNode<Integer>> loopUntilExecutor0 = null;
      try {
        loopUntilExecutor0 = new LoopUntilExecutor<SimpleChainNode<Integer>>(chain1, (Predicate<SimpleChainNode<Integer>>) null, simpleChainNode1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("executionChains.chainExecutors.ChainExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Chain<Integer> chain0 = (Chain<Integer>) mock(Chain.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(chain0).getNodes();
      Integer integer0 = new Integer(1327);
      DefaultOrderedExecutor<Integer> defaultOrderedExecutor0 = null;
      try {
        defaultOrderedExecutor0 = new DefaultOrderedExecutor<Integer>(chain0, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("executionChains.chainExecutors.ChainExecutor", e);
      }
  }
}
