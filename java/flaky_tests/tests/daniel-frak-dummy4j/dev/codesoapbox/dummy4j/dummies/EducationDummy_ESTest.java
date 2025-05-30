/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:51:30 GMT 2022
 */

package dev.codesoapbox.dummy4j.dummies;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dev.codesoapbox.dummy4j.DefaultRandomService;
import dev.codesoapbox.dummy4j.Dummy4j;
import dev.codesoapbox.dummy4j.ExpressionResolver;
import dev.codesoapbox.dummy4j.dummies.EducationDummy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EducationDummy_ESTest extends EducationDummy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultRandomService defaultRandomService0 = new DefaultRandomService();
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      EducationDummy educationDummy0 = new EducationDummy(dummy4j0);
      // Undeclared exception!
      try { 
        educationDummy0.institution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.EducationDummy", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultRandomService defaultRandomService0 = new DefaultRandomService();
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      EducationDummy educationDummy0 = dummy4j0.education();
      // Undeclared exception!
      try { 
        educationDummy0.tertiaryInstitution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.EducationDummy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Long long0 = new Long(1813L);
      DefaultRandomService defaultRandomService0 = new DefaultRandomService(long0);
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      EducationDummy educationDummy0 = dummy4j0.education();
      // Undeclared exception!
      try { 
        educationDummy0.secondaryInstitution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.EducationDummy", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Long long0 = new Long(29L);
      DefaultRandomService defaultRandomService0 = new DefaultRandomService(long0);
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      EducationDummy educationDummy0 = new EducationDummy(dummy4j0);
      // Undeclared exception!
      try { 
        educationDummy0.primaryInstitution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.EducationDummy", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Long long0 = new Long(29L);
      DefaultRandomService defaultRandomService0 = new DefaultRandomService(long0);
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      EducationDummy educationDummy0 = new EducationDummy(dummy4j0);
      // Undeclared exception!
      try { 
        educationDummy0.major();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.EducationDummy", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultRandomService defaultRandomService0 = new DefaultRandomService();
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      EducationDummy educationDummy0 = new EducationDummy(dummy4j0);
      // Undeclared exception!
      try { 
        educationDummy0.degree();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.EducationDummy", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultRandomService defaultRandomService0 = new DefaultRandomService();
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      EducationDummy educationDummy0 = dummy4j0.education();
      // Undeclared exception!
      try { 
        educationDummy0.courseNumber();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.EducationDummy", e);
      }
  }
}
