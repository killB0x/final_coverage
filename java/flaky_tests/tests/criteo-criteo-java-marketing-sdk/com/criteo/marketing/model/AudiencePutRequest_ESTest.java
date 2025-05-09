/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:26:37 GMT 2022
 */

package com.criteo.marketing.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.criteo.marketing.model.AudiencePutRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AudiencePutRequest_ESTest extends AudiencePutRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      audiencePutRequest0.name("b;osi_D2aJald:");
      String string0 = audiencePutRequest0.getName();
      assertEquals("b;osi_D2aJald:", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      audiencePutRequest0.setName("");
      String string0 = audiencePutRequest0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      audiencePutRequest0.description("null");
      String string0 = audiencePutRequest0.getDescription();
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      audiencePutRequest0.setDescription("");
      String string0 = audiencePutRequest0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      AudiencePutRequest audiencePutRequest1 = audiencePutRequest0.description("`@,");
      audiencePutRequest1.toString();
      assertEquals("`@,", audiencePutRequest1.getDescription());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      AudiencePutRequest audiencePutRequest1 = new AudiencePutRequest();
      assertTrue(audiencePutRequest1.equals((Object)audiencePutRequest0));
      
      AudiencePutRequest audiencePutRequest2 = audiencePutRequest1.name("CR#~zn~&,TDIYBW|S");
      boolean boolean0 = audiencePutRequest0.equals(audiencePutRequest2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      Object object0 = new Object();
      boolean boolean0 = audiencePutRequest0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      boolean boolean0 = audiencePutRequest0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      boolean boolean0 = audiencePutRequest0.equals(audiencePutRequest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      AudiencePutRequest audiencePutRequest1 = new AudiencePutRequest();
      boolean boolean0 = audiencePutRequest0.equals(audiencePutRequest1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      String string0 = audiencePutRequest0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      audiencePutRequest0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      AudiencePutRequest audiencePutRequest1 = audiencePutRequest0.description("`@,");
      AudiencePutRequest audiencePutRequest2 = new AudiencePutRequest();
      boolean boolean0 = audiencePutRequest1.equals(audiencePutRequest2);
      assertEquals("`@,", audiencePutRequest1.getDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AudiencePutRequest audiencePutRequest0 = new AudiencePutRequest();
      String string0 = audiencePutRequest0.getName();
      assertNull(string0);
  }
}
