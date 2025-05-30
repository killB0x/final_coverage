/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 01:58:44 GMT 2022
 */

package ch.awae.netcode.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.awae.netcode.internal.ObjectStreams;
import java.net.Socket;
import java.net.SocketException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ObjectStreams_ESTest extends ObjectStreams_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      ObjectStreams objectStreams0 = null;
      try {
        objectStreams0 = new ObjectStreams(mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(Throwable e) {
         //
         // Socket is not connected
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectStreams objectStreams0 = null;
      try {
        objectStreams0 = new ObjectStreams((Socket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.awae.netcode.internal.ObjectStreams", e);
      }
  }
}
