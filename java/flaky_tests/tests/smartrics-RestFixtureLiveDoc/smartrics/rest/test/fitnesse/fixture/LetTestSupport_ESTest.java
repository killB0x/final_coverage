/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 22:17:29 GMT 2022
 */

package smartrics.rest.test.fitnesse.fixture;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import smartrics.rest.test.fitnesse.fixture.LetTestSupport;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LetTestSupport_ESTest extends LetTestSupport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LetTestSupport letTestSupport0 = new LetTestSupport();
      letTestSupport0.assign("gVNY>iq Hn");
      String string0 = letTestSupport0.value();
      assertEquals("gVNY>iq Hn", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LetTestSupport letTestSupport0 = new LetTestSupport();
      letTestSupport0.assign("");
      String string0 = letTestSupport0.value();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LetTestSupport letTestSupport0 = new LetTestSupport();
      String string0 = letTestSupport0.value();
      assertNull(string0);
  }
}
