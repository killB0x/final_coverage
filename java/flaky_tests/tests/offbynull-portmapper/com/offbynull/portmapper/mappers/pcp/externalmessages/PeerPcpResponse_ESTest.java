/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 04:13:03 GMT 2022
 */

package com.offbynull.portmapper.mappers.pcp.externalmessages;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.offbynull.portmapper.mappers.pcp.externalmessages.PeerPcpResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PeerPcpResponse_ESTest extends PeerPcpResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PeerPcpResponse peerPcpResponse0 = null;
      try {
        peerPcpResponse0 = new PeerPcpResponse(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("com.offbynull.portmapper.mappers.pcp.externalmessages.PcpResponse", e);
      }
  }
}
