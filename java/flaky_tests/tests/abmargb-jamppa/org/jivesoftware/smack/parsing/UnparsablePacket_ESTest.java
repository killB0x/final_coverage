/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 22:24:40 GMT 2022
 */

package org.jivesoftware.smack.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.jivesoftware.smack.parsing.UnparsablePacket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnparsablePacket_ESTest extends UnparsablePacket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnparsablePacket unparsablePacket0 = new UnparsablePacket("<waayiam&cYW[VH4HSY", (Exception) null);
      Exception exception0 = unparsablePacket0.getParsingException();
      assertNull(exception0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnparsablePacket unparsablePacket0 = new UnparsablePacket("<waayiam&cYW[VH4HSY", (Exception) null);
      String string0 = unparsablePacket0.getContent();
      assertEquals("<waayiam&cYW[VH4HSY", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockException mockException0 = new MockException("", (Throwable) null);
      UnparsablePacket unparsablePacket0 = new UnparsablePacket("", mockException0);
      String string0 = unparsablePacket0.getContent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockException mockException0 = new MockException((String) null);
      UnparsablePacket unparsablePacket0 = new UnparsablePacket((String) null, mockException0);
      String string0 = unparsablePacket0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockException mockException0 = new MockException((String) null);
      UnparsablePacket unparsablePacket0 = new UnparsablePacket((String) null, mockException0);
      Exception exception0 = unparsablePacket0.getParsingException();
      assertSame(mockException0, exception0);
  }
}
