/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:05:33 GMT 2022
 */

package jaskell.parsec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.parsec.Ahead;
import jaskell.parsec.Between;
import jaskell.parsec.Choice;
import jaskell.parsec.Find;
import jaskell.parsec.Many;
import jaskell.parsec.NoneOf;
import jaskell.parsec.One;
import jaskell.parsec.OneOf;
import jaskell.parsec.Parsec;
import jaskell.parsec.ParsecException;
import jaskell.parsec.SepBy;
import jaskell.parsec.SimpleState;
import jaskell.parsec.Skip1;
import jaskell.parsec.State;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Skip1_ESTest extends Skip1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Parsec<Integer, Integer, Integer, Integer>> linkedList0 = new LinkedList<Parsec<Integer, Integer, Integer, Integer>>();
      Choice<Integer, Integer, Integer, Integer> choice0 = new Choice<Integer, Integer, Integer, Integer>(linkedList0);
      Skip1<Integer, Integer, Integer, Integer> skip1_0 = new Skip1<Integer, Integer, Integer, Integer>(choice0);
      Parsec<Integer, Integer, Integer, Integer> parsec0 = skip1_0.then((Parsec<Integer, Integer, Integer, Integer>) choice0);
      Parsec<Integer, Integer, Integer, Integer>[] parsecArray0 = (Parsec<Integer, Integer, Integer, Integer>[]) Array.newInstance(Parsec.class, 9);
      parsecArray0[0] = parsec0;
      SimpleState<Integer> simpleState0 = new SimpleState<Integer>((List<Integer>) null);
      try { 
        skip1_0.parse(simpleState0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Choice Error : All parsec parser failed.
         //
         verifyException("jaskell.parsec.SimpleState", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ahead<Integer, Integer, Integer, Integer> ahead0 = new Ahead<Integer, Integer, Integer, Integer>((Parsec<Integer, Integer, Integer, Integer>) null);
      Skip1<Integer, Integer, Integer, Integer> skip1_0 = new Skip1<Integer, Integer, Integer, Integer>(ahead0);
      SimpleState<Integer> simpleState0 = new SimpleState<Integer>((List<Integer>) null);
      // Undeclared exception!
      try { 
        skip1_0.parse(simpleState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Ahead", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      NoneOf<Integer, Integer, Integer> noneOf0 = new NoneOf<Integer, Integer, Integer>(linkedHashSet0);
      Skip1<Integer, Integer, Integer, Integer> skip1_0 = new Skip1<Integer, Integer, Integer, Integer>(noneOf0);
      Find<Integer, Integer, Integer, Integer> find0 = new Find<Integer, Integer, Integer, Integer>(noneOf0);
      Many<Integer, Integer, Integer, Integer> many0 = new Many<Integer, Integer, Integer, Integer>(find0);
      State<Integer, Integer, Integer> state0 = (State<Integer, Integer, Integer>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state0).begin();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state0).next();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state0).status();
      List<Integer> list0 = many0.parse(state0);
      SimpleState<Integer> simpleState0 = new SimpleState<Integer>(list0);
      skip1_0.parse(simpleState0);
      State<Integer, Integer, Integer> state1 = (State<Integer, Integer, Integer>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state1).begin();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state1).next();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state1).status();
      List<Integer> list1 = many0.parse(state1);
      SimpleState<Integer> simpleState1 = new SimpleState<Integer>(list1);
      noneOf0.exec(simpleState1);
      SimpleState<Integer> simpleState2 = new SimpleState<Integer>((List<Integer>) null);
      // Undeclared exception!
      try { 
        skip1_0.parse(simpleState2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.SimpleState", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      int int0 = 2891;
      Integer integer0 = new Integer(2891);
      linkedHashSet0.add(integer0);
      OneOf<Integer, Integer, Integer> oneOf0 = new OneOf<Integer, Integer, Integer>(linkedHashSet0);
      Skip1<Integer, Integer, Integer, Integer> skip1_0 = new Skip1<Integer, Integer, Integer, Integer>(oneOf0);
      SimpleState<Integer> simpleState0 = new SimpleState<Integer>((List<Integer>) null);
      oneOf0.exec(simpleState0);
      State<Integer, Integer, Integer> state0 = null;
      oneOf0.exec((State<Integer, Integer, Integer>) null);
      SepBy<Integer, Integer, Integer, Integer, Integer> sepBy0 = new SepBy<Integer, Integer, Integer, Integer, Integer>(skip1_0, oneOf0);
      State<Integer, Integer, Integer> state1 = (State<Integer, Integer, Integer>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state1).begin();
      doReturn((Object) null).when(state1).next();
      doReturn((ParsecException) null).when(state1).trap(anyString());
      // Undeclared exception!
      try { 
        sepBy0.parse(state1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.OneOf", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Ahead<Integer, Integer, Integer, Integer> ahead0 = new Ahead<Integer, Integer, Integer, Integer>((Parsec<Integer, Integer, Integer, Integer>) null);
      Skip1<Integer, Integer, Integer, Integer> skip1_0 = new Skip1<Integer, Integer, Integer, Integer>(ahead0);
      // Undeclared exception!
      try { 
        skip1_0.parse((State<Integer, Integer, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Ahead", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Skip1<Integer, Integer, Integer, Integer> skip1_0 = new Skip1<Integer, Integer, Integer, Integer>((Parsec<Integer, Integer, Integer, Integer>) null);
      Many<Integer, Integer, Integer, Integer> many0 = new Many<Integer, Integer, Integer, Integer>((Parsec<Integer, Integer, Integer, Integer>) null);
      State<Integer, Integer, Integer> state0 = (State<Integer, Integer, Integer>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state0).begin();
      List<Integer> list0 = many0.parse(state0);
      SimpleState<Integer> simpleState0 = new SimpleState<Integer>(list0);
      try { 
        simpleState0.next();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.SimpleState", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      One<Integer, Integer, Integer> one0 = new One<Integer, Integer, Integer>();
      Skip1<Integer, Integer, Integer, Integer> skip1_0 = new Skip1<Integer, Integer, Integer, Integer>(one0);
  }
}
