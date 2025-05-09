/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 04:08:03 GMT 2022
 */

package org.projectodd.sockjs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.projectodd.sockjs.EventSourceReceiver;
import org.projectodd.sockjs.JsonpReceiver;
import org.projectodd.sockjs.ResponseReceiver;
import org.projectodd.sockjs.SockJsRequest;
import org.projectodd.sockjs.SockJsResponse;
import org.projectodd.sockjs.SockJsServer;
import org.projectodd.sockjs.XhrPollingReceiver;
import org.projectodd.sockjs.XhrStreamingReceiver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResponseReceiver_ESTest extends ResponseReceiver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SockJsServer.Options sockJsServer_Options0 = new SockJsServer.Options();
      sockJsServer_Options0.responseLimit = 0;
      SockJsResponse sockJsResponse0 = mock(SockJsResponse.class, new ViolatedAssumptionAnswer());
      SockJsRequest sockJsRequest0 = mock(SockJsRequest.class, new ViolatedAssumptionAnswer());
      ResponseReceiver responseReceiver0 = new ResponseReceiver(sockJsRequest0, sockJsResponse0, sockJsServer_Options0);
      boolean boolean0 = responseReceiver0.doSendFrame("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SockJsServer.Options sockJsServer_Options0 = new SockJsServer.Options();
      JsonpReceiver jsonpReceiver0 = new JsonpReceiver((SockJsRequest) null, (SockJsResponse) null, sockJsServer_Options0, "http://cdn.sockjs.org/sockjs-0.3.min.js");
      // Undeclared exception!
      try { 
        jsonpReceiver0.doSendFrame((String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.projectodd.sockjs.Utils
         //
         verifyException("org.projectodd.sockjs.JsonpReceiver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SockJsRequest sockJsRequest0 = mock(SockJsRequest.class, new ViolatedAssumptionAnswer());
      SockJsResponse sockJsResponse0 = mock(SockJsResponse.class, new ViolatedAssumptionAnswer());
      SockJsServer.Options sockJsServer_Options0 = new SockJsServer.Options();
      XhrPollingReceiver xhrPollingReceiver0 = new XhrPollingReceiver(sockJsRequest0, sockJsResponse0, sockJsServer_Options0);
      boolean boolean0 = xhrPollingReceiver0.doSendFrame((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SockJsRequest sockJsRequest0 = mock(SockJsRequest.class, new ViolatedAssumptionAnswer());
      SockJsServer.Options sockJsServer_Options0 = new SockJsServer.Options();
      SockJsResponse sockJsResponse0 = mock(SockJsResponse.class, new ViolatedAssumptionAnswer());
      XhrPollingReceiver xhrPollingReceiver0 = new XhrPollingReceiver(sockJsRequest0, sockJsResponse0, sockJsServer_Options0);
      xhrPollingReceiver0.maxResponseSize = (-1);
      boolean boolean0 = xhrPollingReceiver0.doSendFrame((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SockJsRequest sockJsRequest0 = mock(SockJsRequest.class, new ViolatedAssumptionAnswer());
      SockJsResponse sockJsResponse0 = mock(SockJsResponse.class, new ViolatedAssumptionAnswer());
      SockJsServer.Options sockJsServer_Options0 = new SockJsServer.Options();
      ResponseReceiver responseReceiver0 = new ResponseReceiver(sockJsRequest0, sockJsResponse0, sockJsServer_Options0);
      boolean boolean0 = responseReceiver0.doSendFrame("http://cdn.sockjs.org/sockjs-0.3.min.js");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SockJsRequest sockJsRequest0 = mock(SockJsRequest.class, new ViolatedAssumptionAnswer());
      SockJsResponse sockJsResponse0 = mock(SockJsResponse.class, new ViolatedAssumptionAnswer());
      SockJsServer sockJsServer0 = new SockJsServer();
      EventSourceReceiver eventSourceReceiver0 = new EventSourceReceiver(sockJsRequest0, sockJsResponse0, sockJsServer0.options);
      eventSourceReceiver0.checkAlive();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SockJsServer.Options sockJsServer_Options0 = new SockJsServer.Options();
      XhrStreamingReceiver xhrStreamingReceiver0 = new XhrStreamingReceiver((SockJsRequest) null, (SockJsResponse) null, sockJsServer_Options0);
      // Undeclared exception!
      try { 
        xhrStreamingReceiver0.doSendFrame("http://cdn.sockjs.org/sockjs-0.3.min.js");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.projectodd.sockjs.ResponseReceiver", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SockJsServer.Options sockJsServer_Options0 = new SockJsServer.Options();
      EventSourceReceiver eventSourceReceiver0 = new EventSourceReceiver((SockJsRequest) null, (SockJsResponse) null, sockJsServer_Options0);
      // Undeclared exception!
      try { 
        eventSourceReceiver0.checkAlive();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.projectodd.sockjs.ResponseReceiver", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SockJsServer.Options sockJsServer_Options0 = new SockJsServer.Options();
      XhrPollingReceiver xhrPollingReceiver0 = new XhrPollingReceiver((SockJsRequest) null, (SockJsResponse) null, sockJsServer_Options0);
      xhrPollingReceiver0.didClose();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ResponseReceiver responseReceiver0 = null;
      try {
        responseReceiver0 = new ResponseReceiver((SockJsRequest) null, (SockJsResponse) null, (SockJsServer.Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.projectodd.sockjs.ResponseReceiver", e);
      }
  }
}
