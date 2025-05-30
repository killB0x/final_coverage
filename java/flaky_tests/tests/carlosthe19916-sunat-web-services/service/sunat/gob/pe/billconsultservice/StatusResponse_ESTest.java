/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:23:48 GMT 2022
 */

package service.sunat.gob.pe.billconsultservice;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import service.sunat.gob.pe.billconsultservice.StatusResponse;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StatusResponse_ESTest extends StatusResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      statusResponse0.statusMessage = "X#VL#V0r|c)ED_&9SF";
      String string0 = statusResponse0.getStatusMessage();
      assertEquals("X#VL#V0r|c)ED_&9SF", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      statusResponse0.statusMessage = "";
      String string0 = statusResponse0.getStatusMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      statusResponse0.setStatusCode("ic;[#iD?*%B(ST)");
      String string0 = statusResponse0.getStatusCode();
      assertEquals("ic;[#iD?*%B(ST)", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      statusResponse0.setStatusCode("");
      String string0 = statusResponse0.getStatusCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      byte[] byteArray0 = new byte[1];
      statusResponse0.setContent(byteArray0);
      byte[] byteArray1 = statusResponse0.getContent();
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      byte[] byteArray0 = new byte[0];
      statusResponse0.content = byteArray0;
      byte[] byteArray1 = statusResponse0.getContent();
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      statusResponse0.setStatusMessage("$lh:vS|(l6#9x:");
      assertNull(statusResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      String string0 = statusResponse0.getStatusMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      byte[] byteArray0 = statusResponse0.getContent();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StatusResponse statusResponse0 = new StatusResponse();
      String string0 = statusResponse0.getStatusCode();
      assertNull(string0);
  }
}
