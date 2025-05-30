/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 23:20:48 GMT 2022
 */

package io.muserver.handlers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.muserver.Method;
import io.muserver.MuRequest;
import io.muserver.MuResponse;
import io.muserver.handlers.CORSHandler;
import io.muserver.rest.CORSConfig;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CORSHandler_ESTest extends CORSHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CORSConfig cORSConfig0 = mock(CORSConfig.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(cORSConfig0).writeHeaders(any(io.muserver.MuRequest.class) , any(io.muserver.MuResponse.class) , anySet());
      LinkedHashSet<Method> linkedHashSet0 = new LinkedHashSet<Method>();
      CORSHandler cORSHandler0 = new CORSHandler(cORSConfig0, linkedHashSet0);
      MuRequest muRequest0 = mock(MuRequest.class, new ViolatedAssumptionAnswer());
      MuResponse muResponse0 = mock(MuResponse.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = cORSHandler0.handle(muRequest0, muResponse0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedHashSet<Method> linkedHashSet0 = new LinkedHashSet<Method>();
      CORSHandler cORSHandler0 = new CORSHandler((CORSConfig) null, linkedHashSet0);
      MuRequest muRequest0 = mock(MuRequest.class, new ViolatedAssumptionAnswer());
      MuResponse muResponse0 = mock(MuResponse.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        cORSHandler0.handle(muRequest0, muResponse0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.muserver.handlers.CORSHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<Method> linkedHashSet0 = new LinkedHashSet<Method>();
      CORSHandler cORSHandler0 = new CORSHandler((CORSConfig) null, linkedHashSet0);
      String string0 = cORSHandler0.toString();
      assertEquals("CORSHandler{corsConfig=null, allowedMethods=[]}", string0);
  }
}
