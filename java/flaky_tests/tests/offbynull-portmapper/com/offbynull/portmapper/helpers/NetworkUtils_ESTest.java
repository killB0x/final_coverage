/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 04:53:48 GMT 2022
 */

package com.offbynull.portmapper.helpers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.offbynull.portmapper.helpers.NetworkUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NetworkUtils_ESTest extends NetworkUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      // Undeclared exception!
      try { 
        NetworkUtils.convertAddressToIpv6Bytes(inetAddress0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("com.offbynull.portmapper.helpers.NetworkUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)NetworkUtils.ZERO_IPV6;
      String string0 = NetworkUtils.toIpv6AddressString(inet4Address0);
      assertEquals("::ffff:c82a:2a00", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = NetworkUtils.toSocketAddress("6!rzI[ex]na/_$~kg:", 0);
      assertEquals(0, inetSocketAddress0.getPort());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InetAddress inetAddress0 = NetworkUtils.toAddress("");
      assertFalse(inetAddress0.isAnyLocalAddress());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InetAddress inetAddress0 = NetworkUtils.toAddress("0.0.0.0");
      assertFalse(inetAddress0.isLoopbackAddress());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      InetAddress inetAddress0 = NetworkUtils.convertBytesToAddress(byteArray0, 0, 4);
      assertEquals("1.0.0.0", inetAddress0.getHostAddress());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      byte[] byteArray0 = MockInetAddress.getAddress(inetAddress0);
      InetAddress inetAddress1 = NetworkUtils.convertBytesToAddress(byteArray0);
      assertTrue(inetAddress1.isSiteLocalAddress());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-18);
      InetAddress inetAddress0 = NetworkUtils.convertBytesToAddress(byteArray0);
      assertTrue(inetAddress0.isMulticastAddress());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)NetworkUtils.ZERO_IPV4;
      byte[] byteArray0 = MockInetAddress.getAddress(inet4Address0);
      InetAddress inetAddress0 = NetworkUtils.convertBytesToAddress(byteArray0);
      assertNotSame(inetAddress0, inet4Address0);
      assertTrue(inetAddress0.isAnyLocalAddress());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      byte[] byteArray0 = MockInetAddress.getAddress(inetAddress0);
      InetAddress inetAddress1 = NetworkUtils.convertBytesToAddress(byteArray0);
      assertEquals("/127.0.0.1", inetAddress1.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        NetworkUtils.toSocketAddress("", (-6078));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-6078
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        NetworkUtils.convertBytesToAddress((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        NetworkUtils.convertBytesToAddress((byte[]) null, (-1759), (-1759));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1759 > -3518
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        NetworkUtils.convertBytesToAddress(byteArray0, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.net.UnknownHostException: Not IPv4: [0]
         //
         verifyException("com.offbynull.portmapper.helpers.NetworkUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NetworkUtils.convertBytesToAddress(byteArray0, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // arraycopy: length -1 is negative
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NetworkUtils.convertBytesToAddress(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.net.UnknownHostException: Not IPv4: []
         //
         verifyException("com.offbynull.portmapper.helpers.NetworkUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        NetworkUtils.toIpv6AddressString((InetAddress) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.offbynull.portmapper.helpers.NetworkUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      String string0 = NetworkUtils.toIpv6AddressString(inetAddress0);
      assertEquals("::ffff:7f00:1", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getByName("::");
      String string0 = NetworkUtils.toIpv6AddressString(inetAddress0);
      assertEquals("0:0:0:0:0:0:0:0", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      InetAddress inetAddress0 = NetworkUtils.convertBytesToAddress(byteArray0, 0, 4);
      assertTrue(inetAddress0.isAnyLocalAddress());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        NetworkUtils.convertBytesToAddress((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.offbynull.portmapper.helpers.NetworkUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InetSocketAddress inetSocketAddress0 = NetworkUtils.toSocketAddress((String) null, 1);
      assertEquals("/127.0.0.1:1", inetSocketAddress0.toString());
  }
}
