/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 21:57:28 GMT 2022
 */

package org.openhim.mediator.engine.messages;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.openhim.mediator.engine.messages.PutPropertyInCoreResponse;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PutPropertyInCoreResponse_ESTest extends PutPropertyInCoreResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PutPropertyInCoreResponse putPropertyInCoreResponse0 = new PutPropertyInCoreResponse((String) null, (String) null);
      String string0 = putPropertyInCoreResponse0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PutPropertyInCoreResponse putPropertyInCoreResponse0 = new PutPropertyInCoreResponse("6ZQ", "6ZQ");
      String string0 = putPropertyInCoreResponse0.getValue();
      assertEquals("6ZQ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PutPropertyInCoreResponse putPropertyInCoreResponse0 = new PutPropertyInCoreResponse((String) null, (String) null);
      String string0 = putPropertyInCoreResponse0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PutPropertyInCoreResponse putPropertyInCoreResponse0 = new PutPropertyInCoreResponse("", "");
      String string0 = putPropertyInCoreResponse0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PutPropertyInCoreResponse putPropertyInCoreResponse0 = new PutPropertyInCoreResponse("", "");
      String string0 = putPropertyInCoreResponse0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PutPropertyInCoreResponse putPropertyInCoreResponse0 = new PutPropertyInCoreResponse(" Q?-5t-!HgU87Yd", "nB]NhWQBgI");
      String string0 = putPropertyInCoreResponse0.getName();
      assertEquals("nB]NhWQBgI", putPropertyInCoreResponse0.getValue());
      assertEquals(" Q?-5t-!HgU87Yd", string0);
  }
}
