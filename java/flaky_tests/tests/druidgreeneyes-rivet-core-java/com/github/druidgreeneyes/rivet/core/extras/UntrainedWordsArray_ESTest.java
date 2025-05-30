/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 10:36:55 GMT 2022
 */

package com.github.druidgreeneyes.rivet.core.extras;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.druidgreeneyes.rivet.core.extras.UntrainedWordsArray;
import com.github.druidgreeneyes.rivet.core.labels.ArrayRIV;
import com.github.druidgreeneyes.rivet.core.labels.RIV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UntrainedWordsArray_ESTest extends UntrainedWordsArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayRIV[] arrayRIVArray0 = new ArrayRIV[3];
      ArrayRIV arrayRIV0 = ArrayRIV.empty((-2059));
      arrayRIVArray0[0] = arrayRIV0;
      arrayRIVArray0[1] = arrayRIV0;
      arrayRIVArray0[2] = arrayRIV0;
      UntrainedWordsArray.sumArrayRIVs(arrayRIVArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        UntrainedWordsArray.tokenizeText((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.druidgreeneyes.rivet.core.extras.UntrainedWordsArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        UntrainedWordsArray.sumArrayRIVs((ArrayRIV[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        UntrainedWordsArray.rivettizeText((String) null, 0, 754);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.druidgreeneyes.rivet.core.extras.UntrainedWordsArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        UntrainedWordsArray.rivettizeText("}uuY(%vk'bwo", 2, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("com.github.druidgreeneyes.rivet.core.labels.RIVs", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "r8?c4!^f=T";
      // Undeclared exception!
      try { 
        UntrainedWordsArray.rivWords(stringArray0, (-598), (-133));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be greater than origin
         //
         verifyException("java.util.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "com.github.druidgreeneyes.rivet.core.labels.MapRIV";
      // Undeclared exception!
      try { 
        UntrainedWordsArray.rivWords(stringArray0, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("com.github.druidgreeneyes.rivet.core.labels.RIVs", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        UntrainedWordsArray.rivAndSumWords((String[]) null, 1726, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = UntrainedWordsArray.tokenizeText("+?O<(,C$");
      // Undeclared exception!
      try { 
        UntrainedWordsArray.rivAndSumWords(stringArray0, (-2958), (-2958));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be greater than origin
         //
         verifyException("java.util.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[0];
      RIV rIV0 = UntrainedWordsArray.rivAndSumWords(stringArray0, 0, (-1006));
      assertEquals(0, rIV0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        UntrainedWordsArray.rivWords(stringArray0, (-3245), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.druidgreeneyes.rivet.core.labels.RIVs", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      RIV[] rIVArray0 = UntrainedWordsArray.rivWords(stringArray0, (-365), (-365));
      assertEquals(0, rIVArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        UntrainedWordsArray.rivettizeText("573LCKU/D@tm=EZ&CA", (-598), (-404));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be greater than origin
         //
         verifyException("java.util.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayRIV[] arrayRIVArray0 = new ArrayRIV[0];
      // Undeclared exception!
      try { 
        UntrainedWordsArray.sumArrayRIVs(arrayRIVArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.github.druidgreeneyes.rivet.core.extras.UntrainedWordsArray", e);
      }
  }
}
