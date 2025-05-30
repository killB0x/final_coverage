/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:40:17 GMT 2022
 */

package jp.co.yahoo.yosegi.util;

import org.junit.Test;
import static org.junit.Assert.*;
import jp.co.yahoo.yosegi.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Pair_ESTest extends Pair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Pair pair0 = new Pair();
      pair0.set("", "jp.co.yahoo.yosegi.util.Pair");
      String string0 = pair0.getPair2("");
      assertNotNull(string0);
      assertEquals("jp.co.yahoo.yosegi.util.Pair", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pair pair0 = new Pair();
      pair0.set("", "");
      String string0 = pair0.getPair2("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pair pair0 = new Pair();
      pair0.set("jp.co.yahoo.yosegi.util.Pair", (String) null);
      String string0 = pair0.getPair1((String) null);
      assertEquals("jp.co.yahoo.yosegi.util.Pair", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pair pair0 = new Pair();
      pair0.set("", "R;W>");
      String string0 = pair0.getPair1("R;W>");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Pair pair0 = new Pair();
      String string0 = pair0.getPair2("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Pair pair0 = new Pair();
      String string0 = pair0.getPair1("jp.co.yahoo.yosegi.util.Pair");
      assertNull(string0);
  }
}
