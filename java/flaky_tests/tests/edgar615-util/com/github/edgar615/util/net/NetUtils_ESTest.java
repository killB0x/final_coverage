/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 14:22:50 GMT 2022
 */

package com.github.edgar615.util.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.edgar615.util.net.NetUtils;
import java.net.InetAddress;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NetUtils_ESTest extends NetUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      // Undeclared exception!
      try { 
        NetUtils.getMac(inetAddress0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.edgar615.util.net.NetUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InetAddress inetAddress0 = NetUtils.getFirstInetAddress();
      assertNotNull(inetAddress0);
      
      String string0 = NetUtils.getMac(inetAddress0);
      assertEquals("002A002A002A", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<InetAddress> list0 = NetUtils.getInetAddress("Evo_en0");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List<InetAddress> list0 = NetUtils.getInetAddress();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      List<InetAddress> list0 = NetUtils.getInetAddress("Evo_lo0");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = NetUtils.getMac();
      assertNotNull(string0);
      assertEquals("002A002A002A", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = NetUtils.getIpv4();
      assertEquals("192.168.1.42", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = NetUtils.getIpV4("192.168.1.42");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String string0 = NetUtils.getIpV4("Evo_en0");
      assertEquals("192.168.1.42", string0);
      assertNotNull(string0);
  }
}
