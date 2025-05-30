/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 18:35:15 GMT 2022
 */

package com.urbanairship.api.channel.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.urbanairship.api.channel.model.ChannelUninstallResponse;
import com.urbanairship.api.common.model.ErrorDetails;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChannelUninstallResponse_ESTest extends ChannelUninstallResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder1 = channelUninstallResponse_Builder0.setOk(true);
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder1.build();
      boolean boolean0 = channelUninstallResponse0.isOk();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = new ChannelUninstallResponse.Builder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      ChannelUninstallResponse channelUninstallResponse1 = channelUninstallResponse_Builder0.build();
      // Undeclared exception!
      try { 
        channelUninstallResponse0.equals(channelUninstallResponse1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Objects
         //
         verifyException("com.urbanairship.api.channel.model.ChannelUninstallResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      boolean boolean0 = channelUninstallResponse0.equals(channelUninstallResponse_Builder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = new ChannelUninstallResponse.Builder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      boolean boolean0 = channelUninstallResponse0.equals(channelUninstallResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      boolean boolean0 = channelUninstallResponse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder1 = channelUninstallResponse_Builder0.setError("");
      assertSame(channelUninstallResponse_Builder1, channelUninstallResponse_Builder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ErrorDetails errorDetails0 = new ErrorDetails("]<GufKpupq", "[*8q-&BJ/XAfh=,U");
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder1 = channelUninstallResponse_Builder0.setErrorDetails(errorDetails0);
      assertSame(channelUninstallResponse_Builder0, channelUninstallResponse_Builder1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      boolean boolean0 = channelUninstallResponse0.isOk();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      Optional<ErrorDetails> optional0 = channelUninstallResponse0.getErrorDetails();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = new ChannelUninstallResponse.Builder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      Optional<String> optional0 = channelUninstallResponse0.getError();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      // Undeclared exception!
      try { 
        channelUninstallResponse0.hashCode();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Objects
         //
         verifyException("com.urbanairship.api.channel.model.ChannelUninstallResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChannelUninstallResponse.Builder channelUninstallResponse_Builder0 = ChannelUninstallResponse.newBuilder();
      ChannelUninstallResponse channelUninstallResponse0 = channelUninstallResponse_Builder0.build();
      String string0 = channelUninstallResponse0.toString();
      assertEquals("ChannelUninstallResponse{ok=false, error='Optional.empty, errorDetails=Optional.empty}", string0);
  }
}
