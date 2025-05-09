/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 11:40:40 GMT 2022
 */

package jaskell.parsec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.parsec.Ahead;
import jaskell.parsec.Between;
import jaskell.parsec.Choice;
import jaskell.parsec.Eof;
import jaskell.parsec.Eq;
import jaskell.parsec.Find;
import jaskell.parsec.Many1;
import jaskell.parsec.One;
import jaskell.parsec.Parsec;
import jaskell.parsec.ParsecException;
import jaskell.parsec.Return;
import jaskell.parsec.Skip;
import jaskell.parsec.State;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Many1_ESTest extends Many1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      One<LinkedList<Object>, Object, Object> one0 = new One<LinkedList<Object>, Object, Object>();
      Many1<LinkedList<Object>, LinkedList<Object>, Object, Object> many1_0 = new Many1<LinkedList<Object>, LinkedList<Object>, Object, Object>(one0);
      State<LinkedList<Object>, Object, Object> state0 = (State<LinkedList<Object>, Object, Object>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state0).begin();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state0).next();
      many1_0.parse(state0);
      Object object0 = new Object();
      Return<LinkedList<Object>, Object, Object, Object> return0 = new Return<LinkedList<Object>, Object, Object, Object>(object0);
      Many1<LinkedList<Object>, Object, Object, Object> many1_1 = new Many1<LinkedList<Object>, Object, Object, Object>(return0);
      State<LinkedList<Object>, Object, Object> state1 = (State<LinkedList<Object>, Object, Object>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(state1).begin();
      many1_1.parse(state1);
      Eq<Object, Object, Object> eq0 = new Eq<Object, Object, Object>(many1_1);
      Many1<Object, Object, Object, Object> many1_2 = new Many1<Object, Object, Object, Object>(eq0);
      State<Object, Object, Object> state2 = (State<Object, Object, Object>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state2).next();
      doReturn((ParsecException) null).when(state2).trap(anyString());
      // Undeclared exception!
      try { 
        many1_2.parse(state2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Eq", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Eof<Object, Object, LinkedList<Object>> eof0 = new Eof<Object, Object, LinkedList<Object>>();
      Many1<Object, Object, Object, LinkedList<Object>> many1_0 = new Many1<Object, Object, Object, LinkedList<Object>>(eof0);
      State<Object, Object, LinkedList<Object>> state0 = (State<Object, Object, LinkedList<Object>>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state0).next();
      doReturn((ParsecException) null).when(state0).trap(anyString());
      eof0.exec(state0);
      State<Object, Object, LinkedList<Object>> state1 = (State<Object, Object, LinkedList<Object>>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state1).next();
      doReturn((ParsecException) null).when(state1).trap(anyString());
      // Undeclared exception!
      try { 
        many1_0.parse(state1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Eof", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Eof<Object, Object, Object> eof0 = new Eof<Object, Object, Object>();
      LinkedList<Parsec<Object, LinkedList<Object>, Object, Object>> linkedList0 = new LinkedList<Parsec<Object, LinkedList<Object>, Object, Object>>();
      Choice<Object, LinkedList<Object>, Object, Object> choice0 = new Choice<Object, LinkedList<Object>, Object, Object>(linkedList0);
      Skip<Object, LinkedList<Object>, Object, Object> skip0 = new Skip<Object, LinkedList<Object>, Object, Object>(choice0);
      Find<Object, LinkedList<Object>, Object, Object> find0 = new Find<Object, LinkedList<Object>, Object, Object>(skip0);
      Between<Object, Object, Object, LinkedList<Object>, Object, Object> between0 = new Between<Object, Object, Object, LinkedList<Object>, Object, Object>(eof0, find0, eof0);
      Many1<Object, Object, Object, Object> many1_0 = new Many1<Object, Object, Object, Object>(between0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Ahead<LinkedList<Object>, Object, Object, LinkedList<Object>> ahead0 = new Ahead<LinkedList<Object>, Object, Object, LinkedList<Object>>((Parsec<LinkedList<Object>, Object, Object, LinkedList<Object>>) null);
      Many1<LinkedList<Object>, Object, Object, LinkedList<Object>> many1_0 = new Many1<LinkedList<Object>, Object, Object, LinkedList<Object>>(ahead0);
      State<LinkedList<Object>, Object, LinkedList<Object>> state0 = (State<LinkedList<Object>, Object, LinkedList<Object>>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state0).begin();
      // Undeclared exception!
      try { 
        many1_0.parse(state0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Ahead", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Many1<LinkedList<Object>, LinkedList<Object>, Object, Object> many1_0 = new Many1<LinkedList<Object>, LinkedList<Object>, Object, Object>((Parsec<LinkedList<Object>, LinkedList<Object>, Object, Object>) null);
      State<LinkedList<Object>, Object, Object> state0 = (State<LinkedList<Object>, Object, Object>) mock(State.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        many1_0.parse(state0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Many1", e);
      }
  }
}
