/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 09:26:21 GMT 2022
 */

package com.ibanity.apis.client.products.xs2a.models.create;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibanity.apis.client.products.xs2a.models.create.SynchronizationCreationQuery;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SynchronizationCreationQuery_ESTest extends SynchronizationCreationQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery((String) null, "g`]]K.J(`CR#", "", boolean0, "", "cId", hashMap0);
      synchronizationCreationQuery0.hashCode();
      assertEquals("", synchronizationCreationQuery0.getCustomerIpAddress());
      assertEquals("", synchronizationCreationQuery0.getResourceType());
      assertEquals("cId", synchronizationCreationQuery0.getCustomerAccessToken());
      assertEquals("g`]]K.J(`CR#", synchronizationCreationQuery0.getResourceId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.resourceId("eiCNEqC");
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder1.build();
      synchronizationCreationQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.subtype("H0gyV0#moDkGEy");
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      String string0 = synchronizationCreationQuery0.getSubtype();
      assertEquals("H0gyV0#moDkGEy", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("", "", "", boolean0, "", "", (Map<String, String>) null);
      String string0 = synchronizationCreationQuery0.getSubtype();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      Map<String, String> map0 = synchronizationCreationQuery0.getAdditionalHeaders();
      assertNotNull(map0);
      
      SynchronizationCreationQuery synchronizationCreationQuery1 = new SynchronizationCreationQuery("eiCNEqC", "eiCNEqC", "eiCNEqC", boolean0, ")", ")", map0);
      String string0 = synchronizationCreationQuery1.getResourceType();
      assertEquals(")", synchronizationCreationQuery1.getCustomerAccessToken());
      assertEquals("eiCNEqC", synchronizationCreationQuery1.getResourceId());
      assertEquals("eiCNEqC", synchronizationCreationQuery1.getSubtype());
      assertEquals(")", synchronizationCreationQuery1.getCustomerIpAddress());
      assertEquals("eiCNEqC", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.resourceType("");
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      String string0 = synchronizationCreationQuery0.getResourceType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.resourceId("eiCNEqC");
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder1.build();
      String string0 = synchronizationCreationQuery0.getResourceId();
      assertEquals("eiCNEqC", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("", "", "!*l", boolean0, "", (String) null, hashMap0);
      String string0 = synchronizationCreationQuery0.getResourceId();
      assertEquals("", synchronizationCreationQuery0.getSubtype());
      assertEquals("", synchronizationCreationQuery0.getCustomerIpAddress());
      assertEquals("", string0);
      assertEquals("!*l", synchronizationCreationQuery0.getResourceType());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("@s$HVs4s#%9!I^r", "", "@s$HVs4s#%9!I^r", boolean0, "TM", "SO*>t^:\nldz|[.D\"", (Map<String, String>) null);
      synchronizationCreationQuery0.getCustomerOnline();
      assertEquals("@s$HVs4s#%9!I^r", synchronizationCreationQuery0.getSubtype());
      assertEquals("SO*>t^:\nldz|[.D\"", synchronizationCreationQuery0.getCustomerAccessToken());
      assertEquals("TM", synchronizationCreationQuery0.getCustomerIpAddress());
      assertEquals("@s$HVs4s#%9!I^r", synchronizationCreationQuery0.getResourceType());
      assertEquals("", synchronizationCreationQuery0.getResourceId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      Map<String, String> map0 = synchronizationCreationQuery0.getAdditionalHeaders();
      SynchronizationCreationQuery synchronizationCreationQuery1 = new SynchronizationCreationQuery((String) null, (String) null, (String) null, boolean0, (String) null, "pTu8!(k#vZ>?.VW", map0);
      Boolean boolean1 = synchronizationCreationQuery1.getCustomerOnline();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      Map<String, String> map0 = synchronizationCreationQuery0.getAdditionalHeaders();
      assertNotNull(map0);
      
      SynchronizationCreationQuery synchronizationCreationQuery1 = new SynchronizationCreationQuery("eiCNEqC", "eiCNEqC", "eiCNEqC", boolean0, ")", ")", map0);
      String string0 = synchronizationCreationQuery1.getCustomerIpAddress();
      assertEquals("eiCNEqC", synchronizationCreationQuery1.getSubtype());
      assertEquals(")", synchronizationCreationQuery1.getCustomerAccessToken());
      assertEquals("eiCNEqC", synchronizationCreationQuery1.getResourceId());
      assertEquals(")", string0);
      assertEquals("eiCNEqC", synchronizationCreationQuery1.getResourceType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("HS", "HS", "", boolean0, "", "", hashMap0);
      String string0 = synchronizationCreationQuery0.getCustomerIpAddress();
      assertEquals("", string0);
      assertEquals("", synchronizationCreationQuery0.getResourceType());
      assertEquals("HS", synchronizationCreationQuery0.getSubtype());
      assertEquals("HS", synchronizationCreationQuery0.getResourceId());
      assertEquals("", synchronizationCreationQuery0.getCustomerAccessToken());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      Map<String, String> map0 = synchronizationCreationQuery0.getAdditionalHeaders();
      assertNotNull(map0);
      
      SynchronizationCreationQuery synchronizationCreationQuery1 = new SynchronizationCreationQuery("eiCNEqC", "eiCNEqC", "eiCNEqC", boolean0, ")", ")", map0);
      String string0 = synchronizationCreationQuery1.getCustomerAccessToken();
      assertEquals(")", string0);
      assertEquals("eiCNEqC", synchronizationCreationQuery1.getResourceId());
      assertEquals(")", synchronizationCreationQuery1.getCustomerIpAddress());
      assertEquals("eiCNEqC", synchronizationCreationQuery1.getSubtype());
      assertEquals("eiCNEqC", synchronizationCreationQuery1.getResourceType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("HS", "HS", "", boolean0, "", "", hashMap0);
      String string0 = synchronizationCreationQuery0.getCustomerAccessToken();
      assertEquals("HS", synchronizationCreationQuery0.getSubtype());
      assertEquals("HS", synchronizationCreationQuery0.getResourceId());
      assertEquals("", synchronizationCreationQuery0.getCustomerIpAddress());
      assertEquals("", synchronizationCreationQuery0.getResourceType());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("", "", "", boolean0, "", "", (Map<String, String>) null);
      Map<String, String> map0 = synchronizationCreationQuery0.getAdditionalHeaders();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("", "", (String) null, boolean0, "3<-@0", (String) null, hashMap0);
      synchronizationCreationQuery0.getAdditionalHeaders();
      assertEquals("", synchronizationCreationQuery0.getSubtype());
      assertEquals("", synchronizationCreationQuery0.getResourceId());
      assertEquals("3<-@0", synchronizationCreationQuery0.getCustomerIpAddress());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put((String) null, "+'I.U{j?");
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.additionalHeaders(hashMap0);
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder1.build();
      Map<String, String> map0 = synchronizationCreationQuery0.getAdditionalHeaders();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("", "", "!*l", boolean0, "", (String) null, hashMap0);
      synchronizationCreationQuery0.canEqual(synchronizationCreationQuery0);
      assertEquals("", synchronizationCreationQuery0.getResourceId());
      assertEquals("", synchronizationCreationQuery0.getCustomerIpAddress());
      assertEquals("", synchronizationCreationQuery0.getSubtype());
      assertEquals("!*l", synchronizationCreationQuery0.getResourceType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      String string0 = synchronizationCreationQuery0.getCustomerAccessToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      String string0 = synchronizationCreationQuery0.getCustomerIpAddress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      String string0 = synchronizationCreationQuery0.getResourceId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      String string0 = synchronizationCreationQuery0.getSubtype();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      String string0 = synchronizationCreationQuery0.getResourceType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      Boolean boolean0 = synchronizationCreationQuery0.getCustomerOnline();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.additionalHeaders((Map<String, String>) null);
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.additionalHeaders((Map<String, String>) null);
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery1.equals(synchronizationCreationQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.customerAccessToken("I9oUt<q%");
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.customerAccessToken("}Y1_k18");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.customerAccessToken("(U\"xaLza9o7Sw\",gUq");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery1.equals(synchronizationCreationQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.customerIpAddress("");
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.customerIpAddress("");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.customerIpAddress("<1\"\"IX%Hp'<ADV");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery1.equals(synchronizationCreationQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.resourceType("i$J> Jn;e_");
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery1.equals(synchronizationCreationQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.resourceType("");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertFalse(boolean0);
      assertFalse(synchronizationCreationQuery1.equals((Object)synchronizationCreationQuery0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.resourceId("acwu)a;ZR`ge>5Q)F2^");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery1.equals(synchronizationCreationQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.resourceId("");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertFalse(boolean0);
      assertFalse(synchronizationCreationQuery1.equals((Object)synchronizationCreationQuery0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.subtype("");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery1.equals(synchronizationCreationQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.subtype("|QD(l=qTQ");
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertFalse(boolean0);
      assertFalse(synchronizationCreationQuery1.equals((Object)synchronizationCreationQuery0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("", "", "", boolean0, "", "", hashMap0);
      SynchronizationCreationQuery synchronizationCreationQuery1 = new SynchronizationCreationQuery("", "", "e'?Q=sq[C710Jl", boolean0, "", "", hashMap0);
      boolean boolean1 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertEquals("", synchronizationCreationQuery1.getResourceId());
      assertEquals("", synchronizationCreationQuery1.getCustomerIpAddress());
      assertEquals("", synchronizationCreationQuery1.getCustomerAccessToken());
      assertEquals("", synchronizationCreationQuery1.getSubtype());
      assertFalse(synchronizationCreationQuery1.equals((Object)synchronizationCreationQuery0));
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      Boolean boolean0 = Boolean.TRUE;
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.customerOnline(boolean0);
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean1 = synchronizationCreationQuery1.equals(synchronizationCreationQuery0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      Boolean boolean0 = Boolean.FALSE;
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.customerOnline(boolean0);
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean1 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertFalse(boolean1);
      assertFalse(synchronizationCreationQuery1.equals((Object)synchronizationCreationQuery0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      synchronizationCreationQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SynchronizationCreationQuery synchronizationCreationQuery0 = new SynchronizationCreationQuery("", "", "", boolean0, "", "", (Map<String, String>) null);
      synchronizationCreationQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      String string0 = synchronizationCreationQuery0.toString();
      assertEquals("SynchronizationCreationQuery(subtype=null, resourceId=null, resourceType=null, customerOnline=null, customerIpAddress=null, customerAccessToken=null, additionalHeaders={})", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = new SynchronizationCreationQuery.SynchronizationCreationQueryBuilder();
      synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.additionalHeaders((Map<String, String>) null);
      SynchronizationCreationQuery synchronizationCreationQuery0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      SynchronizationCreationQuery synchronizationCreationQuery1 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.build();
      boolean boolean0 = synchronizationCreationQuery0.equals(synchronizationCreationQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SynchronizationCreationQuery.SynchronizationCreationQueryBuilder synchronizationCreationQuery_SynchronizationCreationQueryBuilder0 = SynchronizationCreationQuery.builder();
      String string0 = synchronizationCreationQuery_SynchronizationCreationQueryBuilder0.toString();
      assertEquals("SynchronizationCreationQuery.SynchronizationCreationQueryBuilder(subtype=null, resourceId=null, resourceType=null, customerOnline=null, customerIpAddress=null, customerAccessToken=null, additionalHeaders$value=null)", string0);
  }
}
