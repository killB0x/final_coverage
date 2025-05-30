/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 22:34:13 GMT 2022
 */

package uk.ziglio.construct.protocols.layer4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ziglio.construct.protocols.layer4.tcp2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class tcp2_ESTest extends tcp2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      tcp2 tcp2_0 = new tcp2();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        tcp2.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error constructing field uk.ziglio.construct.protocols.layer4.tcp2$tcp_header$HeaderBits uk.ziglio.construct.protocols.layer4.tcp2$tcp_header.hbits\r
         // java.lang.reflect.InvocationTargetException
         //
         verifyException("uk.ziglio.construct.core.Struct", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      tcp2.tcp_header.HeaderBits tcp2_tcp_header_HeaderBits0 = null;
      try {
        tcp2_tcp_header_HeaderBits0 = new tcp2.tcp_header.HeaderBits();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error constructing field uk.ziglio.construct.Macros$Padding uk.ziglio.construct.protocols.layer4.tcp2$tcp_header$HeaderBits.padding\r
         // java.lang.reflect.InvocationTargetException
         //
         verifyException("uk.ziglio.construct.core.Struct", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      tcp2.tcp_header tcp2_tcp_header0 = null;
      try {
        tcp2_tcp_header0 = new tcp2.tcp_header();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error constructing field uk.ziglio.construct.protocols.layer4.tcp2$tcp_header$HeaderBits uk.ziglio.construct.protocols.layer4.tcp2$tcp_header.hbits\r
         // java.lang.reflect.InvocationTargetException
         //
         verifyException("uk.ziglio.construct.core.Struct", e);
      }
  }
}
