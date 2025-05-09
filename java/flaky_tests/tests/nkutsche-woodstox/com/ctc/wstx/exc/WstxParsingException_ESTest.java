/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:49:58 GMT 2022
 */

package com.ctc.wstx.exc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ctc.wstx.exc.WstxParsingException;
import javax.xml.stream.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WstxParsingException_ESTest extends WstxParsingException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WstxParsingException wstxParsingException0 = null;
      try {
        wstxParsingException0 = new WstxParsingException("z<7B", (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.xml.stream.XMLStreamException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WstxParsingException wstxParsingException0 = new WstxParsingException((String) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Location location0 = mock(Location.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(location0).getColumnNumber();
      doReturn(0).when(location0).getLineNumber();
      WstxParsingException wstxParsingException0 = new WstxParsingException("\"$eT&X'", location0);
  }
}
