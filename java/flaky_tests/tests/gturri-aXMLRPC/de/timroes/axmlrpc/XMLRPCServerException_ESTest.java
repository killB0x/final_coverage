/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 09:32:17 GMT 2022
 */

package de.timroes.axmlrpc;

import org.junit.Test;
import static org.junit.Assert.*;
import de.timroes.axmlrpc.XMLRPCServerException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XMLRPCServerException_ESTest extends XMLRPCServerException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLRPCServerException xMLRPCServerException0 = new XMLRPCServerException("^hs(m$+KCLaf", 0);
      int int0 = xMLRPCServerException0.getErrorNr();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMLRPCServerException xMLRPCServerException0 = new XMLRPCServerException("T$$q/", 1103);
      int int0 = xMLRPCServerException0.getErrorNr();
      assertEquals(1103, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMLRPCServerException xMLRPCServerException0 = new XMLRPCServerException("de.timroes.axmlrpc.XMLRPCException", (-660));
      int int0 = xMLRPCServerException0.getErrorNr();
      assertEquals((-660), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XMLRPCServerException xMLRPCServerException0 = new XMLRPCServerException("de.timroes.axmlrpc.XMLRPCException", 0);
      String string0 = xMLRPCServerException0.getMessage();
      assertEquals("de.timroes.axmlrpc.XMLRPCException [0]", string0);
  }
}
