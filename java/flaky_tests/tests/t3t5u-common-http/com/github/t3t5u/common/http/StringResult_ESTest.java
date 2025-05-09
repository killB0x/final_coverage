/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 13:49:22 GMT 2022
 */

package com.github.t3t5u.common.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.t3t5u.common.http.StringConfiguration;
import com.github.t3t5u.common.http.StringResult;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringResult_ESTest extends StringResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(httpURLConnection0).getErrorStream();
      StringConfiguration stringConfiguration0 = mock(StringConfiguration.class, new ViolatedAssumptionAnswer());
      doReturn((Charset) null).when(stringConfiguration0).getCharset();
      MockIOException mockIOException0 = new MockIOException();
      StringResult stringResult0 = null;
      try {
        stringResult0 = new StringResult(httpURLConnection0, stringConfiguration0, mockIOException0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/github/t3t5u/common/util/ExtraIOUtils
         //
         verifyException("com.github.t3t5u.common.http.StringResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringConfiguration stringConfiguration0 = mock(StringConfiguration.class, new ViolatedAssumptionAnswer());
      doReturn((Charset) null).when(stringConfiguration0).getCharset();
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(httpURLConnection0).getInputStream();
      StringResult stringResult0 = null;
      try {
        stringResult0 = new StringResult(httpURLConnection0, stringConfiguration0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/github/t3t5u/common/util/ExtraIOUtils
         //
         verifyException("com.github.t3t5u.common.http.StringResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringResult stringResult0 = null;
      try {
        stringResult0 = new StringResult((HttpURLConnection) null, (StringConfiguration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.t3t5u.common.http.StringResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringResult stringResult0 = null;
      try {
        stringResult0 = new StringResult((HttpURLConnection) null, (StringConfiguration) null, (IOException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.t3t5u.common.http.StringResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringResult stringResult0 = new StringResult((IOException) null);
      assertFalse(stringResult0.isTimeout());
  }
}
