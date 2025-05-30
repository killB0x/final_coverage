/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 08:17:26 GMT 2022
 */

package com.occamlab.te.parsers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.occamlab.te.parsers.HeadersParser;
import java.net.URLConnection;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HeadersParser_ESTest extends HeadersParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("headers");
      try { 
        HeadersParser.parse((URLConnection) null, iIOMetadataNode0, mockPrintWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.occamlab.te.parsers.HeadersParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URLConnection uRLConnection0 = mock(URLConnection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(uRLConnection0).getHeaderField(anyInt());
      doReturn((String) null).when(uRLConnection0).getHeaderFieldKey(anyInt());
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">kp");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      Document document0 = HeadersParser.parse(uRLConnection0, iIOMetadataNode0, mockPrintWriter0);
      assertNotNull(document0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URLConnection uRLConnection0 = mock(URLConnection.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null).when(uRLConnection0).getHeaderField(anyInt());
      doReturn((String) null, (String) null).when(uRLConnection0).getHeaderFieldKey(anyInt());
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Q");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("mb,");
      Document document0 = HeadersParser.parse(uRLConnection0, iIOMetadataNode0, mockPrintWriter0);
      assertNotNull(document0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URLConnection uRLConnection0 = mock(URLConnection.class, new ViolatedAssumptionAnswer());
      doReturn("_6x}^b!gpkZ", (String) null).when(uRLConnection0).getHeaderField(anyInt());
      doReturn("'DPKwyceYs+pni", (String) null).when(uRLConnection0).getHeaderFieldKey(anyInt());
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("XFI-v0QfdOeZ2");
      Document document0 = HeadersParser.parse(uRLConnection0, iIOMetadataNode0, mockPrintWriter0);
      assertNotNull(document0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HeadersParser headersParser0 = new HeadersParser();
  }
}
