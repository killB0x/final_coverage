/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 17:41:54 GMT 2022
 */

package io.rocketbase.mail.dto.webhook;

import org.junit.Test;
import static org.junit.Assert.*;
import io.rocketbase.mail.dto.webhook.WebhookRecordType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WebhookRecordType_ESTest extends WebhookRecordType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebhookRecordType[] webhookRecordTypeArray0 = WebhookRecordType.values();
      assertEquals(6, webhookRecordTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebhookRecordType webhookRecordType0 = WebhookRecordType.valueOf("BOUNCE");
      assertEquals(WebhookRecordType.BOUNCE, webhookRecordType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WebhookRecordType webhookRecordType0 = WebhookRecordType.CLICK;
      String string0 = webhookRecordType0.getValue();
      assertEquals("Click", string0);
  }
}
