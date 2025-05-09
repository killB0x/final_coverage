/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 10:02:23 GMT 2022
 */

package com.mxw.protocol.request.messages.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mxw.protocol.request.messages.builder.KycWhiteListBuilder;
import com.mxw.protocol.response.PublicKey;
import com.mxw.protocol.response.TransactionValue;
import com.mxw.protocol.response.kyc.KycData;
import com.mxw.protocol.response.kyc.KycWhitelist;
import com.mxw.protocol.response.kyc.KycWhitelistModel;
import com.mxw.protocol.response.kyc.KycWhitelistPayload;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KycWhiteListBuilder_ESTest extends KycWhiteListBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KycWhitelistModel kycWhitelistModel0 = new KycWhitelistModel((String) null, "#_wsfKNArEE2ITA5", (BigInteger) null);
      PublicKey publicKey0 = new PublicKey("I3;i7RMk*Ss", (String) null);
      KycWhitelistPayload kycWhitelistPayload0 = new KycWhitelistPayload(kycWhitelistModel0, publicKey0, (String) null);
      KycData kycData0 = new KycData(kycWhitelistPayload0);
      KycWhitelist kycWhitelist0 = new KycWhitelist(kycData0, "com.mxw.protocol.response.TransactionValue");
      KycWhiteListBuilder kycWhiteListBuilder0 = new KycWhiteListBuilder(kycWhitelist0);
      TransactionValue transactionValue0 = kycWhiteListBuilder0.build();
      assertEquals("", transactionValue0.getMemo());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KycWhitelistModel kycWhitelistModel0 = new KycWhitelistModel((String) null, "#_wsfKNArEE2ITA5", (BigInteger) null);
      PublicKey publicKey0 = new PublicKey("I3;i7RMk*Ss", (String) null);
      KycWhitelistPayload kycWhitelistPayload0 = new KycWhitelistPayload(kycWhitelistModel0, publicKey0, (String) null);
      KycData kycData0 = new KycData(kycWhitelistPayload0);
      KycWhitelist kycWhitelist0 = new KycWhitelist(kycData0, "com.mxw.protocol.response.TransactionValue");
      KycWhiteListBuilder kycWhiteListBuilder0 = new KycWhiteListBuilder(kycWhitelist0);
      String string0 = kycWhiteListBuilder0.getRoute();
      assertEquals("kyc", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KycWhiteListBuilder kycWhiteListBuilder0 = new KycWhiteListBuilder((KycWhitelist) null);
      String string0 = kycWhiteListBuilder0.getTransactionType();
      assertEquals("kyc-whitelist", string0);
  }
}
