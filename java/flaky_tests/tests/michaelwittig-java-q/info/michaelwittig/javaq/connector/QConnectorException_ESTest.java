/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 20:58:40 GMT 2022
 */

package info.michaelwittig.javaq.connector;

import org.junit.Test;
import static org.junit.Assert.*;
import info.michaelwittig.javaq.connector.QConnectorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QConnectorException_ESTest extends QConnectorException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QConnectorException qConnectorException0 = new QConnectorException("h]xMaAF28zWREM", (Throwable) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QConnectorException qConnectorException0 = new QConnectorException("info.michaelwittig.javaq.connector.QConnectorException");
      String string0 = qConnectorException0.toString();
      assertEquals("QConnectorException: info.michaelwittig.javaq.connector.QConnectorException", string0);
  }
}
