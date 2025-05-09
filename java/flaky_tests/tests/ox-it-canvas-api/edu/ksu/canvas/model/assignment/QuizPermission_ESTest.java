/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 10:43:02 GMT 2022
 */

package edu.ksu.canvas.model.assignment;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ksu.canvas.model.assignment.QuizPermission;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuizPermission_ESTest extends QuizPermission_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuizPermission quizPermission0 = new QuizPermission();
      Boolean boolean0 = quizPermission0.canUpdate();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuizPermission quizPermission0 = new QuizPermission();
      Boolean boolean0 = quizPermission0.canManage();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuizPermission quizPermission0 = new QuizPermission();
      Boolean boolean0 = quizPermission0.canCreate();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuizPermission quizPermission0 = new QuizPermission();
      Boolean boolean0 = quizPermission0.canSubmit();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuizPermission quizPermission0 = new QuizPermission();
      Boolean boolean0 = quizPermission0.canRead();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QuizPermission quizPermission0 = new QuizPermission();
      Boolean boolean0 = quizPermission0.canReviewGrades();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QuizPermission quizPermission0 = new QuizPermission();
      Boolean boolean0 = quizPermission0.canReadStatistics();
      assertNull(boolean0);
  }
}
