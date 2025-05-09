/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 20:26:16 GMT 2022
 */

package net.corpwar.lib.corpnet.master;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.UUID;
import net.corpwar.lib.corpnet.Connection;
import net.corpwar.lib.corpnet.Message;
import net.corpwar.lib.corpnet.NetworkSendType;
import net.corpwar.lib.corpnet.Server;
import net.corpwar.lib.corpnet.master.MasterServer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MasterServer_ESTest extends MasterServer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer("qK${Q t42MPnlnUTp6", (-947), 767);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer();
      MasterServer.NATTestServer masterServer_NATTestServer0 = masterServer0.new NATTestServer();
      Message message0 = new Message();
      byte[] byteArray0 = new byte[5];
      message0.setData(byteArray0);
      masterServer_NATTestServer0.receivedMessage(message0);
      assertNull(message0.getNetworkSendType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer();
      masterServer0.startMasterServer(false);
      Server server0 = masterServer0.getMasterServer();
      assertTrue(server0.isKeepAlive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer("", (-77), (-77));
      // Undeclared exception!
      try { 
        masterServer0.startMasterServer(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer();
      Message message0 = new Message();
      // Undeclared exception!
      try { 
        masterServer0.receivedMessage(message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.corpwar.lib.corpnet.master.MasterServer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer();
      NetworkSendType networkSendType0 = NetworkSendType.PEER_DATA;
      Message message0 = new Message();
      byte[] byteArray0 = new byte[0];
      message0.setData(byteArray0);
      message0.setNetworkSendType(networkSendType0);
      // Undeclared exception!
      try { 
        masterServer0.receivedMessage(message0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer("S]-BAAd(u#/8% PHj9", 0, 0);
      UUID uUID0 = MockUUID.randomUUID();
      masterServer0.disconnected(uUID0);
      assertEquals(16793600L, uUID0.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer();
      NetworkSendType networkSendType0 = NetworkSendType.PEER_DATA;
      Message message0 = new Message();
      message0.setNetworkSendType(networkSendType0);
      // Undeclared exception!
      try { 
        masterServer0.receivedMessage(message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer("S]-BAAd(u#/8% PHj9", 0, 0);
      Message message0 = new Message();
      NetworkSendType networkSendType0 = NetworkSendType.ACK;
      message0.setNetworkSendType(networkSendType0);
      masterServer0.receivedMessage(message0);
      assertEquals(NetworkSendType.ACK, message0.getNetworkSendType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer("S]-BAAd(u#/8% PHj9", 0, 0);
      masterServer0.startMasterServer(true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer("S]-BAAd(u#/8% PHj9", 0, 0);
      Connection connection0 = new Connection();
      MasterServer.NATTestServer masterServer_NATTestServer0 = masterServer0.new NATTestServer();
      masterServer_NATTestServer0.connected(connection0);
      assertEquals(0, connection0.getPort());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer("S]-BAAd(u#/8% PHj9", 0, 0);
      Connection connection0 = new Connection();
      masterServer0.connected(connection0);
      assertEquals(0L, connection0.getLastRecived());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer();
      MasterServer.NATTestServer masterServer_NATTestServer0 = masterServer0.new NATTestServer();
      UUID uUID0 = MockUUID.fromString("No test nat server up");
      masterServer_NATTestServer0.disconnected(uUID0);
      assertEquals(16793600L, uUID0.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MasterServer masterServer0 = new MasterServer("S]-BAAd(u#/8% PHj9", 0, 0);
      Server server0 = masterServer0.getMasterServer();
      assertNull(server0);
  }
}
