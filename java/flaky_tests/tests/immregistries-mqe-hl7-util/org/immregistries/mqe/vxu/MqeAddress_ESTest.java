/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 10:49:58 GMT 2022
 */

package org.immregistries.mqe.vxu;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.immregistries.mqe.vxu.MqeAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MqeAddress_ESTest extends MqeAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet2("(");
      mqeAddress0.hashCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet("\"f.");
      mqeAddress0.hashCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStateCode("|k%jh:bJ,?0kwtS>kW7");
      mqeAddress0.hashCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCity("9i:$");
      mqeAddress0.hashCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCleansingAttempted(true);
      boolean boolean0 = mqeAddress0.isCleansingAttempted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setZip((String) null);
      mqeAddress0.getZip();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setZip("BYaO_CEXw?A7So");
      mqeAddress0.getZip();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setTypeCode((String) null);
      mqeAddress0.getTypeCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setTypeCode(";DVMc");
      mqeAddress0.getTypeCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setTypeCode((String) null);
      mqeAddress0.getType();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setTypeCode("=g'");
      mqeAddress0.getType();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet2((String) null);
      mqeAddress0.getStreet2();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet2(", lattitude=");
      mqeAddress0.getStreet2();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet((String) null);
      mqeAddress0.getStreet();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet("\"f.");
      mqeAddress0.getStreet();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStateCode((String) null);
      mqeAddress0.getStateCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStateCode("?C#o}cWvTP");
      mqeAddress0.getStateCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setLongitude(2817.81542);
      double double0 = mqeAddress0.getLongitude();
      assertEquals(2817.81542, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setLongitude((-1892.7052));
      double double0 = mqeAddress0.getLongitude();
      assertEquals((-1892.7052), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setLatitude(815.8126);
      double double0 = mqeAddress0.getLattitude();
      assertEquals(815.8126, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setLatitude((-1.0));
      double double0 = mqeAddress0.getLattitude();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCountyParishCode((String) null);
      mqeAddress0.getCountyParishCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCountyParishCode(", clean=");
      mqeAddress0.getCountyParishCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCountryCode((String) null);
      mqeAddress0.getCountryCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCountryCode("=LZ,n8}>UBvk-");
      mqeAddress0.getCountryCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCleansingResultCode("IW`,");
      mqeAddress0.getCleansingResultCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCleansingResultCode("");
      mqeAddress0.getCleansingResultCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCity((String) null);
      mqeAddress0.getCity();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCity("CYF@CEM");
      mqeAddress0.getCity();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MqeAddress mqeAddress0 = null;
      try {
        mqeAddress0 = new MqeAddress((MqeAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.immregistries.mqe.vxu.MqeAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      assertTrue(mqeAddress1.equals((Object)mqeAddress0));
      
      mqeAddress0.setStreet("MqeAddress{street='', street2='', city='', stateCode='', zip='OD#R\"2;y=fkDaA70_oh', country='', countyParish='', type='null', cleansingResultCode='null', lattitude=0.0, longitude=0.0, clean=false, cleansingAttempted=true}");
      boolean boolean0 = mqeAddress1.equals(mqeAddress0);
      assertFalse(mqeAddress1.equals((Object)mqeAddress0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet((String) null);
      MqeAddress mqeAddress1 = new MqeAddress();
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertFalse(mqeAddress1.isClean());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      assertTrue(mqeAddress1.equals((Object)mqeAddress0));
      
      mqeAddress1.setStateCode((String) null);
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      assertTrue(mqeAddress1.equals((Object)mqeAddress0));
      
      mqeAddress0.setCity(":87K`2X");
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertFalse(mqeAddress1.equals((Object)mqeAddress0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      mqeAddress1.setCity((String) null);
      boolean boolean0 = mqeAddress1.equals(mqeAddress0);
      assertFalse(mqeAddress1.equals((Object)mqeAddress0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getStateCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      assertTrue(mqeAddress1.equals((Object)mqeAddress0));
      
      mqeAddress0.setStreet2("y8(LGIK1I=$hs0mK");
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet2((String) null);
      MqeAddress mqeAddress1 = new MqeAddress();
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertFalse(mqeAddress1.isClean());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet2((String) null);
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertTrue(boolean0);
      assertFalse(mqeAddress1.isClean());
      assertEquals(0.0, mqeAddress1.getLattitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet(")eONW&");
      boolean boolean0 = mqeAddress0.isEmpty();
      assertFalse(mqeAddress0.isClean());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet((String) null);
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      boolean boolean0 = mqeAddress1.equals(mqeAddress0);
      assertTrue(boolean0);
      assertEquals(0.0, mqeAddress1.getLattitude(), 0.01);
      assertFalse(mqeAddress1.isClean());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      mqeAddress0.setStateCode((String) null);
      assertFalse(mqeAddress0.equals((Object)mqeAddress1));
      
      mqeAddress1.setStateCode((String) null);
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertTrue(mqeAddress0.equals((Object)mqeAddress1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCity((String) null);
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertTrue(boolean0);
      assertEquals(0.0, mqeAddress1.getLattitude(), 0.01);
      assertFalse(mqeAddress1.isClean());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      Object object0 = new Object();
      boolean boolean0 = mqeAddress0.equals(object0);
      assertFalse(boolean0);
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      boolean boolean0 = mqeAddress0.equals((Object) null);
      assertFalse(mqeAddress0.isClean());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      boolean boolean0 = mqeAddress0.equals(mqeAddress0);
      assertTrue(boolean0);
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      double double0 = mqeAddress0.getLongitude();
      assertEquals(0.0, double0, 0.01);
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getStreet2();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      double double0 = mqeAddress0.getLattitude();
      assertEquals(0.0, double0, 0.01);
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getCountryCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      boolean boolean0 = mqeAddress0.isEmpty();
      assertTrue(boolean0);
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      String string0 = mqeAddress0.toString();
      assertEquals("MqeAddress{street='', street2='', city='', stateCode='', zip='', country='', countyParish='', type='', cleansingResultCode='null', lattitude=0.0, longitude=0.0, clean=false, cleansingAttempted=false}", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      boolean boolean0 = mqeAddress0.isClean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.isCleansingAttempted();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getTypeCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getStreet();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getCountyParishCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet((String) null);
      mqeAddress0.hashCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getType();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getCity();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      assertFalse(mqeAddress0.isClean());
      
      mqeAddress0.setClean(true);
      boolean boolean0 = mqeAddress0.isClean();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      MqeAddress mqeAddress1 = new MqeAddress(mqeAddress0);
      assertTrue(mqeAddress1.equals((Object)mqeAddress0));
      
      mqeAddress0.setStateCode((String) null);
      boolean boolean0 = mqeAddress0.equals(mqeAddress1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStreet2((String) null);
      mqeAddress0.hashCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getZip();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setCity((String) null);
      mqeAddress0.hashCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.setStateCode((String) null);
      mqeAddress0.hashCode();
      assertFalse(mqeAddress0.isClean());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MqeAddress mqeAddress0 = new MqeAddress();
      mqeAddress0.getCleansingResultCode();
      assertFalse(mqeAddress0.isClean());
  }
}
