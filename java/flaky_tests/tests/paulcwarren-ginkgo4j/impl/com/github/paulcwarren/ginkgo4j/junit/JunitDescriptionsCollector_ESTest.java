/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 16:05:55 GMT 2022
 */

package impl.com.github.paulcwarren.ginkgo4j.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.paulcwarren.ginkgo4j.ExecutableBlock;
import impl.com.github.paulcwarren.ginkgo4j.junit.JunitDescriptionsCollector;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.Description;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JunitDescriptionsCollector_ESTest extends JunitDescriptionsCollector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Description description0 = Description.TEST_MECHANISM;
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector(description0);
      junitDescriptionsCollector0.context("", (ExecutableBlock) null, true);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector((Description) null);
      // Undeclared exception!
      try { 
        junitDescriptionsCollector0.describe("", (ExecutableBlock) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.com.github.paulcwarren.ginkgo4j.junit.JunitDescriptionsCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector((Description) null);
      // Undeclared exception!
      try { 
        junitDescriptionsCollector0.context("", (ExecutableBlock) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.com.github.paulcwarren.ginkgo4j.junit.JunitDescriptionsCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Description description0 = Description.TEST_MECHANISM;
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector(description0);
      junitDescriptionsCollector0.describe("", (ExecutableBlock) null, true);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector((Description) null);
      junitDescriptionsCollector0.beforeEach((ExecutableBlock) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Description description0 = Description.TEST_MECHANISM;
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector(description0);
      junitDescriptionsCollector0.afterEach((ExecutableBlock) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Description description0 = Description.TEST_MECHANISM;
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector(description0);
      Map<String, Description> map0 = junitDescriptionsCollector0.getDescriptions();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Description description0 = Description.EMPTY;
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector(description0);
      junitDescriptionsCollector0.test((Object) null);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector((Description) null);
      junitDescriptionsCollector0.justBeforeEach((ExecutableBlock) null);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Description description0 = Description.TEST_MECHANISM;
      JunitDescriptionsCollector junitDescriptionsCollector0 = new JunitDescriptionsCollector(description0);
      junitDescriptionsCollector0.it("`*C", (ExecutableBlock) null, true);
      Map<String, Description> map0 = junitDescriptionsCollector0.getDescriptions();
      assertFalse(map0.isEmpty());
  }
}
