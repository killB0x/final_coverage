/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:21:54 GMT 2022
 */

package service.sunat.gob.pe.guiaremision;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import service.sunat.gob.pe.guiaremision.GetStatus;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GetStatus_ESTest extends GetStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetStatus getStatus0 = new GetStatus();
      getStatus0.ticket = "ZlJ/_-#Rp+t";
      String string0 = getStatus0.getTicket();
      assertEquals("ZlJ/_-#Rp+t", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetStatus getStatus0 = new GetStatus();
      getStatus0.setTicket("");
      String string0 = getStatus0.getTicket();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GetStatus getStatus0 = new GetStatus();
      String string0 = getStatus0.getTicket();
      assertNull(string0);
  }
}
