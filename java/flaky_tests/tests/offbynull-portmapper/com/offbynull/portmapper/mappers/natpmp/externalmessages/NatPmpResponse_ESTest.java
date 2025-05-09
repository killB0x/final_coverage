/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 04:37:22 GMT 2022
 */

package com.offbynull.portmapper.mappers.natpmp.externalmessages;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.offbynull.portmapper.mappers.natpmp.externalmessages.ExternalAddressNatPmpResponse;
import com.offbynull.portmapper.mappers.natpmp.externalmessages.TcpMappingNatPmpResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NatPmpResponse_ESTest extends NatPmpResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ExternalAddressNatPmpResponse externalAddressNatPmpResponse0 = null;
      try {
        externalAddressNatPmpResponse0 = new ExternalAddressNatPmpResponse(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("com.offbynull.portmapper.mappers.natpmp.externalmessages.NatPmpResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TcpMappingNatPmpResponse tcpMappingNatPmpResponse0 = null;
      try {
        tcpMappingNatPmpResponse0 = new TcpMappingNatPmpResponse(0, 0, 0, 0, 0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("com.offbynull.portmapper.mappers.natpmp.externalmessages.NatPmpResponse", e);
      }
  }
}
