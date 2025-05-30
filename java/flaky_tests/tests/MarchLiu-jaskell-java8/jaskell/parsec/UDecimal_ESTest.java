/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 11:23:39 GMT 2022
 */

package jaskell.parsec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.parsec.Binder;
import jaskell.parsec.Many;
import jaskell.parsec.Parsec;
import jaskell.parsec.ParsecException;
import jaskell.parsec.SimpleState;
import jaskell.parsec.State;
import jaskell.parsec.UDecimal;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UDecimal_ESTest extends UDecimal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UDecimal<Character, Character> uDecimal0 = new UDecimal<Character, Character>();
      Character character0 = Character.valueOf('F');
      LinkedList<Character> linkedList0 = new LinkedList<Character>();
      SimpleState<Character> simpleState0 = new SimpleState<Character>(linkedList0);
      ParsecException parsecException0 = simpleState0.trap("R;`8Gpu}Zv^_H");
      State<Character, Character, Character> state0 = (State<Character, Character, Character>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn(character0).when(state0).next();
      doReturn(parsecException0).when(state0).trap(anyString());
      try { 
        uDecimal0.parse(state0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // R;`8Gpu}Zv^_H
         //
         verifyException("jaskell.parsec.SimpleState", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UDecimal<Character, Character> uDecimal0 = new UDecimal<Character, Character>();
      // Undeclared exception!
      try { 
        uDecimal0.parse((State<Character, Character, Character>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Digit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UDecimal<Character, Character> uDecimal0 = new UDecimal<Character, Character>();
      Binder<Character, String, Character, Character, Character> binder0 = (Binder<Character, String, Character, Character, Character>) mock(Binder.class, new ViolatedAssumptionAnswer());
      Parsec<Character, Character, Character, Character> parsec0 = uDecimal0.bind(binder0);
      Many<Character, Character, Character, Character> many0 = new Many<Character, Character, Character, Character>(parsec0);
      State<Character, Character, Character> state0 = (State<Character, Character, Character>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state0).begin();
      doReturn((Object) null).when(state0).next();
      many0.parse(state0);
      State<Character, Character, Character> state1 = (State<Character, Character, Character>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state1).next();
      // Undeclared exception!
      try { 
        uDecimal0.parse(state1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.Digit", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UDecimal<Character, Character> uDecimal0 = new UDecimal<Character, Character>();
      Character character0 = Character.valueOf('0');
      State<Character, Character, Character> state0 = (State<Character, Character, Character>) mock(State.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(state0).begin();
      doReturn(character0, (Object) null, (Object) null).when(state0).next();
      doReturn((Object) null).when(state0).status();
      String string0 = uDecimal0.parse(state0);
      assertEquals("0", string0);
  }
}
