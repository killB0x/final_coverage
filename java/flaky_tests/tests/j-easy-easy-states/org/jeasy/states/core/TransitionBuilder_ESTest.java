/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 20:05:10 GMT 2022
 */

package org.jeasy.states.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jeasy.states.api.Event;
import org.jeasy.states.api.EventHandler;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.TransitionBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TransitionBuilder_ESTest extends TransitionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransitionBuilder transitionBuilder0 = new TransitionBuilder();
      Class<Event> class0 = Event.class;
      TransitionBuilder transitionBuilder1 = transitionBuilder0.eventType(class0);
      assertSame(transitionBuilder0, transitionBuilder1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TransitionBuilder transitionBuilder0 = new TransitionBuilder();
      State state0 = new State("");
      TransitionBuilder transitionBuilder1 = transitionBuilder0.targetState(state0);
      assertSame(transitionBuilder0, transitionBuilder1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TransitionBuilder transitionBuilder0 = new TransitionBuilder();
      Transition transition0 = transitionBuilder0.build();
      assertEquals("transition", transition0.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TransitionBuilder transitionBuilder0 = new TransitionBuilder();
      State state0 = new State("");
      TransitionBuilder transitionBuilder1 = transitionBuilder0.sourceState(state0);
      assertSame(transitionBuilder0, transitionBuilder1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TransitionBuilder transitionBuilder0 = new TransitionBuilder();
      EventHandler<Event> eventHandler0 = (EventHandler<Event>) mock(EventHandler.class, new ViolatedAssumptionAnswer());
      TransitionBuilder transitionBuilder1 = transitionBuilder0.eventHandler(eventHandler0);
      assertSame(transitionBuilder1, transitionBuilder0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TransitionBuilder transitionBuilder0 = new TransitionBuilder();
      TransitionBuilder transitionBuilder1 = transitionBuilder0.name("");
      assertSame(transitionBuilder1, transitionBuilder0);
  }
}
