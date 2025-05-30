/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:31:41 GMT 2022
 */

package jaskell.parsec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.parsec.Ahead;
import jaskell.parsec.Choice;
import jaskell.parsec.OneOf;
import jaskell.parsec.Option;
import jaskell.parsec.Parsec;
import jaskell.parsec.ParsecException;
import jaskell.parsec.Return;
import jaskell.parsec.SimpleState;
import jaskell.parsec.Skip;
import jaskell.parsec.Skip1;
import jaskell.parsec.State;
import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(10);
      Return<Throwable, Integer, Throwable, Integer> return0 = new Return<Throwable, Integer, Throwable, Integer>(integer0);
      Ahead<Throwable, Integer, Throwable, Integer> ahead0 = new Ahead<Throwable, Integer, Throwable, Integer>(return0);
      Option<Throwable, Integer, Throwable, Integer> option0 = new Option<Throwable, Integer, Throwable, Integer>(ahead0);
      State<Throwable, Throwable, Integer> state0 = (State<Throwable, Throwable, Integer>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(state0).begin();
      Optional<Integer> optional0 = option0.parse(state0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedHashSet<Optional<Integer>> linkedHashSet0 = new LinkedHashSet<Optional<Integer>>();
      OneOf<Optional<Integer>, Throwable, Integer> oneOf0 = new OneOf<Optional<Integer>, Throwable, Integer>(linkedHashSet0);
      Ahead<Optional<Integer>, Optional<Integer>, Throwable, Integer> ahead0 = new Ahead<Optional<Integer>, Optional<Integer>, Throwable, Integer>(oneOf0);
      Option<Optional<Integer>, Optional<Integer>, Throwable, Integer> option0 = new Option<Optional<Integer>, Optional<Integer>, Throwable, Integer>(ahead0);
      State<Optional<Integer>, Throwable, Integer> state0 = (State<Optional<Integer>, Throwable, Integer>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(state0).begin();
      doReturn((Object) null).when(state0).next();
      doReturn((ParsecException) null).when(state0).trap(anyString());
      Optional<Optional<Integer>> optional0 = option0.parse(state0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Parsec<Optional<Throwable>, Integer, Integer, Integer>[] parsecArray0 = (Parsec<Optional<Throwable>, Integer, Integer, Integer>[]) Array.newInstance(Parsec.class, 1);
      Choice<Optional<Throwable>, Integer, Integer, Integer> choice0 = new Choice<Optional<Throwable>, Integer, Integer, Integer>(parsecArray0);
      Skip<Optional<Throwable>, Integer, Integer, Integer> skip0 = new Skip<Optional<Throwable>, Integer, Integer, Integer>(choice0);
      Skip1<Optional<Throwable>, Integer, Integer, Integer> skip1_0 = new Skip1<Optional<Throwable>, Integer, Integer, Integer>(skip0);
      Ahead<Optional<Throwable>, Integer, Integer, Integer> ahead0 = new Ahead<Optional<Throwable>, Integer, Integer, Integer>(skip1_0);
      parsecArray0[0] = (Parsec<Optional<Throwable>, Integer, Integer, Integer>) ahead0;
      Option<Optional<Throwable>, Integer, Integer, Integer> option0 = new Option<Optional<Throwable>, Integer, Integer, Integer>(skip0);
      LinkedList<Optional<Throwable>> linkedList0 = new LinkedList<Optional<Throwable>>();
      SimpleState<Optional<Throwable>> simpleState0 = new SimpleState<Optional<Throwable>>(linkedList0);
      // Undeclared exception!
      try { 
        option0.parse(simpleState0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option<Throwable, Integer, Throwable, Integer> option0 = new Option<Throwable, Integer, Throwable, Integer>((Parsec<Throwable, Integer, Throwable, Integer>) null);
      // Undeclared exception!
      try { 
        option0.parse((State<Throwable, Throwable, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Option", e);
      }
  }
}
