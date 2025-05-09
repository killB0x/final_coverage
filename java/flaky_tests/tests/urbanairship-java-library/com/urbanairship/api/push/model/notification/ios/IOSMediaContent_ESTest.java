/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 17:19:02 GMT 2022
 */

package com.urbanairship.api.push.model.notification.ios;

import org.junit.Test;
import static org.junit.Assert.*;
import com.urbanairship.api.push.model.notification.ios.IOSMediaContent;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IOSMediaContent_ESTest extends IOSMediaContent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      iOSMediaContent_Builder0.setBody("com.urbanairship.api.push.model.PushModelObject");
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      iOSMediaContent0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent.Builder iOSMediaContent_Builder1 = iOSMediaContent_Builder0.setTitle("X");
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder1.build();
      iOSMediaContent0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      iOSMediaContent_Builder0.setSubtitle("{ \"exception\" : \"");
      IOSMediaContent iOSMediaContent1 = iOSMediaContent_Builder0.build();
      boolean boolean0 = iOSMediaContent0.equals(iOSMediaContent1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      IOSMediaContent.Builder iOSMediaContent_Builder1 = iOSMediaContent_Builder0.setBody("%a9?t&S@ri<!<tE6Nf");
      IOSMediaContent iOSMediaContent1 = iOSMediaContent_Builder1.build();
      boolean boolean0 = iOSMediaContent0.equals(iOSMediaContent1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      iOSMediaContent_Builder0.setTitle("Vu8[");
      IOSMediaContent iOSMediaContent1 = iOSMediaContent_Builder0.build();
      boolean boolean0 = iOSMediaContent0.equals(iOSMediaContent1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      boolean boolean0 = iOSMediaContent0.equals("com.urbanairship.api.push.model.PushModelObject");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      boolean boolean0 = iOSMediaContent0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      boolean boolean0 = iOSMediaContent0.equals(iOSMediaContent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      IOSMediaContent iOSMediaContent1 = iOSMediaContent_Builder0.build();
      boolean boolean0 = iOSMediaContent0.equals(iOSMediaContent1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      Optional<String> optional0 = iOSMediaContent0.getSubtitle();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      Optional<String> optional0 = iOSMediaContent0.getBody();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      Optional<String> optional0 = iOSMediaContent0.getTitle();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IOSMediaContent.Builder iOSMediaContent_Builder0 = IOSMediaContent.newBuilder();
      IOSMediaContent iOSMediaContent0 = iOSMediaContent_Builder0.build();
      String string0 = iOSMediaContent0.toString();
      assertEquals("IOSMediaContent{title=Optional.empty, body=Optional.empty, subtitle=Optional.empty}", string0);
  }
}
