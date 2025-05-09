/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:54:46 GMT 2022
 */

package io.muserver.openapi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.muserver.openapi.HeaderObject;
import io.muserver.openapi.LinkObject;
import io.muserver.openapi.MediaTypeObject;
import io.muserver.openapi.ResponseObject;
import io.muserver.openapi.ResponsesObject;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResponsesObject_ESTest extends ResponsesObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, ResponseObject> hashMap0 = new HashMap<String, ResponseObject>();
      hashMap0.put("#dw=`Jq;0@pulU!^#U{", (ResponseObject) null);
      ResponsesObject responsesObject0 = new ResponsesObject((ResponseObject) null, hashMap0);
      hashMap0.remove((Object) "#dw=`Jq;0@pulU!^#U{");
      Map<String, ResponseObject> map0 = responsesObject0.httpStatusCodes();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, MediaTypeObject> hashMap0 = new HashMap<String, MediaTypeObject>();
      HashMap<String, LinkObject> hashMap1 = new HashMap<String, LinkObject>();
      ResponseObject responseObject0 = new ResponseObject("wRaIG", (Map<String, HeaderObject>) null, hashMap0, hashMap1);
      HashMap<String, ResponseObject> hashMap2 = new HashMap<String, ResponseObject>();
      hashMap2.put("wRaIG", responseObject0);
      ResponsesObject responsesObject0 = new ResponsesObject(responseObject0, hashMap2);
      ResponseObject responseObject1 = responsesObject0.defaultValue();
      assertSame(responseObject0, responseObject1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, ResponseObject> hashMap0 = new HashMap<String, ResponseObject>();
      hashMap0.put("", (ResponseObject) null);
      ResponsesObject responsesObject0 = new ResponsesObject((ResponseObject) null, hashMap0);
      // Undeclared exception!
      try { 
        responsesObject0.writeJson((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.muserver.openapi.ResponsesObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, ResponseObject> hashMap0 = new HashMap<String, ResponseObject>();
      hashMap0.put("", (ResponseObject) null);
      ResponsesObject responsesObject0 = new ResponsesObject((ResponseObject) null, hashMap0);
      StringWriter stringWriter0 = new StringWriter();
      responsesObject0.writeJson(stringWriter0);
      assertEquals("{}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, ResponseObject> hashMap0 = new HashMap<String, ResponseObject>();
      ResponsesObject responsesObject0 = null;
      try {
        responsesObject0 = new ResponsesObject((ResponseObject) null, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'httpStatusCodes' must contain at least one value
         //
         verifyException("io.muserver.openapi.ResponsesObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<String, ResponseObject> hashMap0 = new HashMap<String, ResponseObject>();
      hashMap0.put("D~'E:+jIzoc1PO!", (ResponseObject) null);
      ResponsesObject responsesObject0 = new ResponsesObject((ResponseObject) null, hashMap0);
      ResponseObject responseObject0 = responsesObject0.defaultValue();
      assertNull(responseObject0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HashMap<String, ResponseObject> hashMap0 = new HashMap<String, ResponseObject>();
      hashMap0.put("#dw=`Jq;0@pulU!^#U{", (ResponseObject) null);
      ResponsesObject responsesObject0 = new ResponsesObject((ResponseObject) null, hashMap0);
      Map<String, ResponseObject> map0 = responsesObject0.httpStatusCodes();
      assertEquals(1, map0.size());
  }
}
