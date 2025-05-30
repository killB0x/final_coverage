/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 19:37:27 GMT 2022
 */

package com.pyramidacceptors.ptalk.api.event;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pyramidacceptors.ptalk.api.BillNames;
import com.pyramidacceptors.ptalk.api.event.EscrowedEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EscrowedEvent_ESTest extends EscrowedEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BillNames billNames0 = BillNames.Bill7;
      EscrowedEvent escrowedEvent0 = new EscrowedEvent(billNames0, "Generic", billNames0);
      BillNames billNames1 = escrowedEvent0.getBillName();
      EscrowedEvent escrowedEvent1 = null;
      try {
        escrowedEvent1 = new EscrowedEvent((Object) null, "Generic", billNames1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EscrowedEvent escrowedEvent0 = new EscrowedEvent("!Ju$.LS$f#fZ", "!Ju$.LS$f#fZ", (BillNames) null);
      escrowedEvent0.getBillName();
  }
}
