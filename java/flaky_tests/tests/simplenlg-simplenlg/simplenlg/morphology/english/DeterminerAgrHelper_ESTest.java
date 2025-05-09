/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 02:39:43 GMT 2022
 */

package simplenlg.morphology.english;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplenlg.morphology.english.DeterminerAgrHelper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DeterminerAgrHelper_ESTest extends DeterminerAgrHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = DeterminerAgrHelper.checkEndsWithIndefiniteArticle("EF d`Fhw}E ^pm3", "simplenlg.morphology.english.DeterminerAgrHelper");
      assertEquals("EF d`Fhw}E ^pm3", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        DeterminerAgrHelper.requiresAn((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("simplenlg.morphology.english.DeterminerAgrHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DeterminerAgrHelper.checkEndsWithIndefiniteArticle((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("simplenlg.morphology.english.DeterminerAgrHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DeterminerAgrHelper.checkEndsWithIndefiniteArticle(" ", " ");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 0
         //
         verifyException("simplenlg.morphology.english.DeterminerAgrHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = DeterminerAgrHelper.requiresAn("7:`o=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DeterminerAgrHelper.checkEndsWithIndefiniteArticle("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = DeterminerAgrHelper.requiresAn("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = DeterminerAgrHelper.requiresAn("8489");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = DeterminerAgrHelper.requiresAn("110");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = DeterminerAgrHelper.checkEndsWithIndefiniteArticle("a", "8>");
      assertEquals("an", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = DeterminerAgrHelper.requiresAn("18C");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = DeterminerAgrHelper.requiresAn("11*0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = DeterminerAgrHelper.checkEndsWithIndefiniteArticle("a", "6,|c%<)}");
      assertEquals("a", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = DeterminerAgrHelper.checkEndsWithIndefiniteArticle("a", "80");
      assertEquals("an", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = DeterminerAgrHelper.requiresAn("py57rlm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DeterminerAgrHelper determinerAgrHelper0 = new DeterminerAgrHelper();
  }
}
