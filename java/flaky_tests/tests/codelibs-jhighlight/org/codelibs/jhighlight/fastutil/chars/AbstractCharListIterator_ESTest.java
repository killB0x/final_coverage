/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 03:32:02 GMT 2022
 */

package org.codelibs.jhighlight.fastutil.chars;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.codelibs.jhighlight.fastutil.chars.CharIterators;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractCharListIterator_ESTest extends AbstractCharListIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharIterators.EmptyIterator charIterators_EmptyIterator0 = new CharIterators.EmptyIterator();
      // Undeclared exception!
      try { 
        charIterators_EmptyIterator0.set((Character) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractCharListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharIterators.EmptyIterator charIterators_EmptyIterator0 = new CharIterators.EmptyIterator();
      // Undeclared exception!
      try { 
        charIterators_EmptyIterator0.add((Character) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractCharListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharIterators.EmptyIterator charIterators_EmptyIterator0 = new CharIterators.EmptyIterator();
      Character character0 = Character.valueOf('K');
      // Undeclared exception!
      try { 
        charIterators_EmptyIterator0.add(character0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractCharListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharIterators.EmptyIterator charIterators_EmptyIterator0 = new CharIterators.EmptyIterator();
      Character character0 = Character.valueOf('v');
      // Undeclared exception!
      try { 
        charIterators_EmptyIterator0.set(character0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractCharListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharIterators.EmptyIterator charIterators_EmptyIterator0 = new CharIterators.EmptyIterator();
      // Undeclared exception!
      try { 
        charIterators_EmptyIterator0.set(':');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractCharListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CharIterators.EmptyIterator charIterators_EmptyIterator0 = new CharIterators.EmptyIterator();
      // Undeclared exception!
      try { 
        charIterators_EmptyIterator0.add('@');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractCharListIterator", e);
      }
  }
}
