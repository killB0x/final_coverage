/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 15:34:54 GMT 2022
 */

package top.banner.lib.curl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import top.banner.lib.curl.Options;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Options_ESTest extends Options_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Options.Builder options_Builder0 = new Options.Builder();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Options.Builder options_Builder0 = Options.builder();
      options_Builder0.insecure();
      Options options0 = options_Builder0.build();
      List<String> list0 = options0.list();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Options.Builder options_Builder0 = Options.builder();
      Options.Builder options_Builder1 = options_Builder0.compressed();
      assertSame(options_Builder1, options_Builder0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Options.Builder options_Builder0 = Options.builder();
      Options.Builder options_Builder1 = options_Builder0.location();
      assertSame(options_Builder1, options_Builder0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Options.Builder options_Builder0 = Options.builder();
      Options.Builder options_Builder1 = options_Builder0.retry((-1));
      assertSame(options_Builder1, options_Builder0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Options.Builder options_Builder0 = Options.builder();
      Options.Builder options_Builder1 = options_Builder0.connectTimeout((-1));
      assertSame(options_Builder1, options_Builder0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Options.Builder options_Builder0 = Options.builder();
      Options.Builder options_Builder1 = options_Builder0.maxTime((-1));
      assertSame(options_Builder0, options_Builder1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Options.Builder options_Builder0 = Options.builder();
      Options options0 = options_Builder0.build();
      List<String> list0 = options0.list();
      assertEquals(0, list0.size());
  }
}
