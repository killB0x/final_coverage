/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 13:21:32 GMT 2022
 */

package net.pushover.client;

import org.junit.Test;
import static org.junit.Assert.*;
import net.pushover.client.MessagePriority;
import net.pushover.client.PushoverMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PushoverMessage_ESTest extends PushoverMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      pushoverMessage_Builder0.setUserId("PzM");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getUserId();
      assertEquals("PzM", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken("~HQ3`4");
      PushoverMessage.Builder pushoverMessage_Builder1 = pushoverMessage_Builder0.setUserId("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder1.build();
      String string0 = pushoverMessage0.getUserId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      pushoverMessage_Builder0.setUrl("MV.ec");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getUrl();
      assertEquals("MV.ec", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken("");
      pushoverMessage_Builder0.setUrl("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      pushoverMessage_Builder0.setTitleForURL("net.pushover.client.MessagePriority");
      String string0 = pushoverMessage0.getTitleForURL();
      assertEquals("net.pushover.client.MessagePriority", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken("net.pushover.client.PushoverMessage");
      pushoverMessage_Builder0.setTitle("net.pushover.client.PushoverMessage");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getTitle();
      assertEquals("net.pushover.client.PushoverMessage", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      pushoverMessage_Builder0.setTitle("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      Long long0 = new Long(0L);
      pushoverMessage_Builder0.setTimestamp(long0);
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      Long long1 = pushoverMessage0.getTimestamp();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken((String) null);
      Long long0 = new Long(1281L);
      pushoverMessage_Builder0.setTimestamp(long0);
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      Long long1 = pushoverMessage0.getTimestamp();
      assertEquals(1281L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      Long long0 = new Long((-2L));
      pushoverMessage_Builder0.setTimestamp(long0);
      Long long1 = pushoverMessage0.getTimestamp();
      assertEquals((-2L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken("NORMAL");
      PushoverMessage.Builder pushoverMessage_Builder1 = pushoverMessage_Builder0.setSound("net.pushover.client.PushoverMessage$Builder");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder1.build();
      String string0 = pushoverMessage0.getSound();
      assertEquals("net.pushover.client.PushoverMessage$Builder", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      MessagePriority messagePriority0 = MessagePriority.HIGH;
      pushoverMessage_Builder0.setPriority(messagePriority0);
      MessagePriority messagePriority1 = pushoverMessage0.getPriority();
      assertEquals(1, messagePriority1.getPriority());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      pushoverMessage_Builder0.setMessage("");
      String string0 = pushoverMessage0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      pushoverMessage_Builder0.setHtmlMessage("net.pushover.client.PushoverMessage");
      String string0 = pushoverMessage0.getHtmlMessage();
      assertEquals("net.pushover.client.PushoverMessage", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken("");
      pushoverMessage_Builder0.setHtmlMessage("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getHtmlMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      pushoverMessage_Builder0.setDevice("net.pushover.client.MessagePriority");
      String string0 = pushoverMessage0.getDevice();
      assertEquals("net.pushover.client.MessagePriority", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken("");
      PushoverMessage.Builder pushoverMessage_Builder1 = pushoverMessage_Builder0.setDevice("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder1.build();
      String string0 = pushoverMessage0.getDevice();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage.Builder pushoverMessage_Builder1 = pushoverMessage_Builder0.setApiToken("'Q >s>[$|i");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder1.build();
      String string0 = pushoverMessage0.getApiToken();
      assertEquals("'Q >s>[$|i", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage.Builder pushoverMessage_Builder1 = pushoverMessage_Builder0.setApiToken("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder1.build();
      String string0 = pushoverMessage0.getApiToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      MessagePriority messagePriority0 = pushoverMessage0.getPriority();
      assertEquals("0", messagePriority0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getUserId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getHtmlMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getApiToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getSound();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = PushoverMessage.builderWithApiToken("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getDevice();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      Long long0 = pushoverMessage0.getTimestamp();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      MessagePriority messagePriority0 = MessagePriority.QUIET;
      pushoverMessage_Builder0.setPriority(messagePriority0);
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      MessagePriority messagePriority1 = pushoverMessage0.getPriority();
      assertEquals((-1), messagePriority1.getPriority());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      pushoverMessage_Builder0.setSound("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getSound();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      pushoverMessage_Builder0.setMessage(".s(7{x2qPyp#w3");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getMessage();
      assertEquals(".s(7{x2qPyp#w3", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder0.build();
      String string0 = pushoverMessage0.getTitleForURL();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PushoverMessage.Builder pushoverMessage_Builder0 = new PushoverMessage.Builder();
      PushoverMessage.Builder pushoverMessage_Builder1 = pushoverMessage_Builder0.setTitleForURL("");
      PushoverMessage pushoverMessage0 = pushoverMessage_Builder1.build();
      String string0 = pushoverMessage0.getTitleForURL();
      assertEquals("", string0);
  }
}
