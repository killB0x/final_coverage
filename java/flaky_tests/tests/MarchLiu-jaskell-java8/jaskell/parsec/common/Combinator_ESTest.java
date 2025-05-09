/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 11:48:29 GMT 2022
 */

package jaskell.parsec.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.parsec.common.Ahead;
import jaskell.parsec.common.Attempt;
import jaskell.parsec.common.Between;
import jaskell.parsec.common.Choice;
import jaskell.parsec.common.Combinator;
import jaskell.parsec.common.Find;
import jaskell.parsec.common.Many;
import jaskell.parsec.common.Many1;
import jaskell.parsec.common.ManyTill;
import jaskell.parsec.common.Ne;
import jaskell.parsec.common.Parsec;
import jaskell.parsec.common.Return;
import jaskell.parsec.common.SepBy;
import jaskell.parsec.common.Skip1;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Combinator_ESTest extends Combinator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parsec<Optional<Integer>, LinkedList<Integer>>[] parsecArray0 = (Parsec<Optional<Integer>, LinkedList<Integer>>[]) Array.newInstance(Parsec.class, 4);
      Between<Optional<Integer>, LinkedList<Integer>, LinkedList<Integer>, LinkedList<Integer>> between0 = new Between<Optional<Integer>, LinkedList<Integer>, LinkedList<Integer>, LinkedList<Integer>>((Parsec<Optional<Integer>, LinkedList<Integer>>) null, (Parsec<Optional<Integer>, LinkedList<Integer>>) null, (Parsec<Optional<Integer>, LinkedList<Integer>>) null);
      Attempt<Optional<Integer>, LinkedList<Integer>> attempt0 = Combinator.attempt((Parsec<Optional<Integer>, LinkedList<Integer>>) between0);
      parsecArray0[1] = (Parsec<Optional<Integer>, LinkedList<Integer>>) attempt0;
      Parsec<Optional<Integer>, LinkedList<Integer>> parsec0 = Combinator.between((Parsec<Optional<Integer>, LinkedList<Integer>>) null, parsecArray0[1], parsecArray0[0]);
      assertNotNull(parsec0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parsec<Optional<Integer>, LinkedList<Integer>>[] parsecArray0 = (Parsec<Optional<Integer>, LinkedList<Integer>>[]) Array.newInstance(Parsec.class, 4);
      Between<Optional<Integer>, LinkedList<Integer>, LinkedList<Integer>, LinkedList<Integer>> between0 = new Between<Optional<Integer>, LinkedList<Integer>, LinkedList<Integer>, LinkedList<Integer>>((Parsec<Optional<Integer>, LinkedList<Integer>>) null, (Parsec<Optional<Integer>, LinkedList<Integer>>) null, (Parsec<Optional<Integer>, LinkedList<Integer>>) null);
      Attempt<Optional<Integer>, LinkedList<Integer>> attempt0 = Combinator.attempt((Parsec<Optional<Integer>, LinkedList<Integer>>) between0);
      parsecArray0[0] = (Parsec<Optional<Integer>, LinkedList<Integer>>) attempt0;
      Parsec<Optional<Integer>, LinkedList<Integer>> parsec0 = Combinator.between((Parsec<Optional<Integer>, LinkedList<Integer>>) null, parsecArray0[1], parsecArray0[0]);
      assertNotNull(parsec0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", 0);
      Return<Integer, Integer> return0 = new Return<Integer, Integer>(integer0);
      Skip1<Integer, Integer> skip1_0 = Combinator.skip1((Parsec<Integer, Integer>) return0);
      Ne<Integer> ne0 = new Ne<Integer>(integer0);
      SepBy<Integer, Integer, Integer> sepBy0 = Combinator.sepBy((Parsec<Integer, Integer>) skip1_0, (Parsec<Integer, Integer>) ne0);
      assertNotNull(sepBy0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parsec<LinkedList<Integer>, Integer>[] parsecArray0 = (Parsec<LinkedList<Integer>, Integer>[]) Array.newInstance(Parsec.class, 5);
      Skip1<LinkedList<Integer>, Integer> skip1_0 = new Skip1<LinkedList<Integer>, Integer>(parsecArray0[0]);
      LinkedList<Parsec<LinkedList<Integer>, Integer>> linkedList0 = new LinkedList<Parsec<LinkedList<Integer>, Integer>>();
      Choice<LinkedList<Integer>, Integer> choice0 = new Choice<LinkedList<Integer>, Integer>(linkedList0);
      Attempt<LinkedList<Integer>, Integer> attempt0 = Combinator.attempt((Parsec<LinkedList<Integer>, Integer>) choice0);
      ManyTill<LinkedList<Integer>, Integer, Integer> manyTill0 = Combinator.manyTill((Parsec<LinkedList<Integer>, Integer>) attempt0, (Parsec<LinkedList<Integer>, Integer>) skip1_0);
      assertNotNull(manyTill0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Combinator.choice((Parsec<Throwable, Throwable>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Combinator combinator0 = new Combinator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Many<LinkedList<Parsec>, Throwable> many0 = Combinator.many((Parsec<LinkedList<Parsec>, Throwable>) null);
      assertNotNull(many0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Many1<LinkedList<Integer>, Integer> many1_0 = Combinator.many1((Parsec<LinkedList<Integer>, Integer>) null);
      assertNotNull(many1_0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parsec<Optional<Integer>, LinkedList<Integer>>[] parsecArray0 = (Parsec<Optional<Integer>, LinkedList<Integer>>[]) Array.newInstance(Parsec.class, 2);
      Choice<Optional<Integer>, LinkedList<Integer>> choice0 = Combinator.choice(parsecArray0);
      assertNotNull(choice0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ahead<Optional<Integer>, Optional<Throwable>> ahead0 = Combinator.ahead((Parsec<Optional<Integer>, Optional<Throwable>>) null);
      assertNotNull(ahead0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Find<Parsec<Integer, Throwable>, Throwable> find0 = Combinator.find((Parsec<Parsec<Integer, Throwable>, Throwable>) null);
      assertNotNull(find0);
  }
}
