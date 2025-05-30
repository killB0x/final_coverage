/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 11:23:39 GMT 2022
 */

package org.immregistries.mqe.hl7util.parser.profile.generated;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.immregistries.mqe.hl7util.parser.profile.generated.DynamicDef;
import org.immregistries.mqe.hl7util.parser.profile.generated.Encodings;
import org.immregistries.mqe.hl7util.parser.profile.generated.HL7V2XConformanceProfile;
import org.immregistries.mqe.hl7util.parser.profile.generated.MetaData;
import org.immregistries.mqe.hl7util.parser.profile.generated.StaticDef;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HL7V2XConformanceProfile_ESTest extends HL7V2XConformanceProfile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      hL7V2XConformanceProfile0.setProfileType("K-ylBl;V,s");
      String string0 = hL7V2XConformanceProfile0.getProfileType();
      assertEquals("K-ylBl;V,s", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      MetaData metaData0 = new MetaData();
      hL7V2XConformanceProfile0.setMetaData(metaData0);
      MetaData metaData1 = hL7V2XConformanceProfile0.getMetaData();
      assertNull(metaData1.getDate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      hL7V2XConformanceProfile0.hl7Version = "org.immregistries.mqe.hl7util.parser.profile.generated.StaticDef";
      String string0 = hL7V2XConformanceProfile0.getHL7Version();
      assertEquals("org.immregistries.mqe.hl7util.parser.profile.generated.StaticDef", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      hL7V2XConformanceProfile0.setHL7Version("");
      String string0 = hL7V2XConformanceProfile0.getHL7Version();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      DynamicDef dynamicDef0 = new DynamicDef();
      hL7V2XConformanceProfile0.setDynamicDef(dynamicDef0);
      DynamicDef dynamicDef1 = hL7V2XConformanceProfile0.getDynamicDef();
      assertNull(dynamicDef1.getAppAck());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      hL7V2XConformanceProfile0.setProfileType("");
      String string0 = hL7V2XConformanceProfile0.getProfileType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      MetaData metaData0 = hL7V2XConformanceProfile0.getMetaData();
      assertNull(metaData0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      String string0 = hL7V2XConformanceProfile0.getHL7Version();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      StaticDef staticDef0 = hL7V2XConformanceProfile0.getHL7V2XStaticDef();
      assertNull(staticDef0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      DynamicDef dynamicDef0 = hL7V2XConformanceProfile0.getDynamicDef();
      assertNull(dynamicDef0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      Encodings encodings0 = new Encodings();
      hL7V2XConformanceProfile0.setEncodings(encodings0);
      Encodings encodings1 = hL7V2XConformanceProfile0.getEncodings();
      assertSame(encodings1, encodings0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      Encodings encodings0 = hL7V2XConformanceProfile0.getEncodings();
      assertNull(encodings0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      String string0 = hL7V2XConformanceProfile0.getProfileType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HL7V2XConformanceProfile hL7V2XConformanceProfile0 = new HL7V2XConformanceProfile();
      StaticDef staticDef0 = new StaticDef();
      hL7V2XConformanceProfile0.setHL7V2XStaticDef(staticDef0);
      StaticDef staticDef1 = hL7V2XConformanceProfile0.getHL7V2XStaticDef();
      assertSame(staticDef1, staticDef0);
  }
}
