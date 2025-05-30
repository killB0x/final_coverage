/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 03:11:05 GMT 2022
 */

package simplenlg.xmlrealiser.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplenlg.xmlrealiser.wrapper.NLGSpec;
import simplenlg.xmlrealiser.wrapper.RecordSet;
import simplenlg.xmlrealiser.wrapper.RequestType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NLGSpec_ESTest extends NLGSpec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NLGSpec nLGSpec0 = new NLGSpec();
      RequestType requestType0 = new RequestType();
      nLGSpec0.request = requestType0;
      RequestType requestType1 = nLGSpec0.getRequest();
      assertSame(requestType1, requestType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NLGSpec nLGSpec0 = new NLGSpec();
      RecordSet recordSet0 = new RecordSet();
      nLGSpec0.setRecording(recordSet0);
      RecordSet recordSet1 = nLGSpec0.getRecording();
      assertSame(recordSet1, recordSet0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NLGSpec nLGSpec0 = new NLGSpec();
      RequestType requestType0 = new RequestType();
      nLGSpec0.setRequest(requestType0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NLGSpec nLGSpec0 = new NLGSpec();
      RequestType requestType0 = nLGSpec0.getRequest();
      assertNull(requestType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NLGSpec nLGSpec0 = new NLGSpec();
      RecordSet recordSet0 = nLGSpec0.getRecording();
      nLGSpec0.setRecording(recordSet0);
  }
}
