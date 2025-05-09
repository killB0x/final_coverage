/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 03:37:08 GMT 2022
 */

package io.joshworks.restclient.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.joshworks.restclient.http.ClientContainer;
import io.joshworks.restclient.http.RestClient;
import io.joshworks.restclient.http.utils.ClientStats;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClientContainer_ESTest extends ClientContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClientContainer.shutdown();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClientContainer.addClient((RestClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.joshworks.restclient.http.ClientContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Map<String, ClientStats> map0 = ClientContainer.stats();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClientContainer.removeClient((RestClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.joshworks.restclient.http.ClientContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = ClientContainer.size();
      assertEquals(0, int0);
  }
}
