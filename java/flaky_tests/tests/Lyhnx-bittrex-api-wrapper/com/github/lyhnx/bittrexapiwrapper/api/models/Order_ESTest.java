/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 02:27:29 GMT 2022
 */

package com.github.lyhnx.bittrexapiwrapper.api.models;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.lyhnx.bittrexapiwrapper.api.models.Order;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Order_ESTest extends Order_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Order order0 = new Order();
      order0.setType("I~Sb.OB*Vr");
      String string0 = order0.getType();
      assertEquals("I~Sb.OB*Vr", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Order order0 = new Order();
      order0.setType("");
      String string0 = order0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Order order0 = new Order();
      order0.setSentinel("ahRpzb0");
      String string0 = order0.getSentinel();
      assertEquals("ahRpzb0", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Order order0 = new Order();
      order0.setSentinel("");
      String string0 = order0.getSentinel();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Order order0 = new Order();
      order0.setReserved(71.95142845546);
      double double0 = order0.getReserved();
      assertEquals(71.95142845546, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Order order0 = new Order();
      order0.setReserved((-297.24376074625));
      double double0 = order0.getReserved();
      assertEquals((-297.24376074625), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Order order0 = new Order();
      order0.setReserveRemaining(338.44732141);
      double double0 = order0.getReserveRemaining();
      assertEquals(338.44732141, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Order order0 = new Order();
      order0.setReserveRemaining((-737.7874068842));
      double double0 = order0.getReserveRemaining();
      assertEquals((-737.7874068842), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Order order0 = new Order();
      order0.setQuantityRemaining(1110.3054364189106);
      double double0 = order0.getQuantityRemaining();
      assertEquals(1110.3054364189106, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Order order0 = new Order();
      order0.setQuantityRemaining((-345.4747419247417));
      double double0 = order0.getQuantityRemaining();
      assertEquals((-345.4747419247417), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Order order0 = new Order();
      order0.setQuantity(1791.497270135);
      double double0 = order0.getQuantity();
      assertEquals(1791.497270135, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Order order0 = new Order();
      order0.setQuantity((-1500.8714730699705));
      double double0 = order0.getQuantity();
      assertEquals((-1500.8714730699705), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Order order0 = new Order();
      order0.setPricePerUnit(1.0);
      double double0 = order0.getPricePerUnit();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Order order0 = new Order();
      order0.setPrice(2302.9761);
      double double0 = order0.getPrice();
      assertEquals(2302.9761, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Order order0 = new Order();
      order0.setPrice((-112.0));
      double double0 = order0.getPrice();
      assertEquals((-112.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Order order0 = new Order();
      Random.setNextRandom(2192);
      UUID uUID0 = MockUUID.randomUUID();
      order0.setOrderUUID(uUID0);
      UUID uUID1 = order0.getOrderUUID();
      assertEquals("90080000-9108-4000-9208-000093080000", uUID1.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      UUID uUID0 = MockUUID.fromString("");
      order0.setOrderUUID(uUID0);
      UUID uUID1 = order0.getOrderUUID();
      assertEquals((-9079256848728588288L), uUID1.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Order order0 = new Order();
      order0.setExchange("NRPPVu<-(\"");
      String string0 = order0.getExchange();
      assertEquals("NRPPVu<-(\"", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Order order0 = new Order();
      order0.setExchange("");
      String string0 = order0.getExchange();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
      order0.setConditionTarget("'kn$hsd9+X+M%");
      String string0 = order0.getConditionTarget();
      assertEquals("'kn$hsd9+X+M%", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Order order0 = new Order();
      order0.setCondition("-$\"o\"f.K(,b%:9YZL?");
      String string0 = order0.getCondition();
      assertEquals("-$\"o\"f.K(,b%:9YZL?", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Order order0 = new Order();
      order0.setCondition("");
      String string0 = order0.getCondition();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Order order0 = new Order();
      order0.setComissionReserved(78.59239049);
      double double0 = order0.getComissionReserved();
      assertEquals(78.59239049, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Order order0 = new Order();
      order0.setComissionReserved((-2974.817835));
      double double0 = order0.getComissionReserved();
      assertEquals((-2974.817835), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      order0.setComissionReserveRemaining((-1.0));
      double double0 = order0.getComissionReserveRemaining();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Order order0 = new Order();
      order0.setComissionPaid(1152.0072);
      double double0 = order0.getComissionPaid();
      assertEquals(1152.0072, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Order order0 = new Order();
      order0.setComissionPaid((-345.4747419247417));
      double double0 = order0.getComissionPaid();
      assertEquals((-345.4747419247417), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Order order0 = new Order();
      MockDate mockDate0 = new MockDate();
      order0.setClosed(mockDate0);
      Date date0 = order0.getClosed();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Random.setNextRandom((-1498));
      Order order0 = new Order();
      UUID uUID0 = MockUUID.randomUUID();
      order0.setAccountId(uUID0);
      UUID uUID1 = order0.getAccountId();
      assertSame(uUID1, uUID0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Order order0 = new Order();
      order0.setOpen(true);
      boolean boolean0 = order0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getQuantity();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Order order0 = new Order();
      UUID uUID0 = order0.getOrderUUID();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getReserveRemaining();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getReserved();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Order order0 = new Order();
      order0.setConditional(true);
      boolean boolean0 = order0.isConditional();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Order order0 = new Order();
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      order0.setOpened(date0);
      Date date1 = order0.getOpened();
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date1.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Order order0 = new Order();
      UUID uUID0 = order0.getAccountId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getComissionPaid();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getComissionReserved();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Order order0 = new Order();
      UUID uUID0 = MockUUID.randomUUID();
      order0.setAccountId(uUID0);
      UUID uUID1 = order0.getAccountId();
      assertEquals((-9079256848728588288L), uUID1.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getSentinel();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Order order0 = new Order();
      boolean boolean0 = order0.isOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Order order0 = new Order();
      order0.setComissionReserveRemaining(334.2);
      double double0 = order0.getComissionReserveRemaining();
      assertEquals(334.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getPricePerUnit();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Order order0 = new Order();
      Date date0 = order0.getClosed();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Order order0 = new Order();
      order0.setCancelInitiated(true);
      boolean boolean0 = order0.isCancelInitiated();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getComissionReserveRemaining();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getConditionTarget();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Order order0 = new Order();
      boolean boolean0 = order0.isConditional();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Order order0 = new Order();
      Date date0 = order0.getOpened();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Order order0 = new Order();
      boolean boolean0 = order0.isCancelInitiated();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getExchange();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getQuantityRemaining();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Order order0 = new Order();
      double double0 = order0.getPrice();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Order order0 = new Order();
      order0.setPricePerUnit((-2234.4354228));
      double double0 = order0.getPricePerUnit();
      assertEquals((-2234.4354228), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getCondition();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Order order0 = new Order();
      order0.setConditionTarget("");
      String string0 = order0.getConditionTarget();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.toString();
      assertEquals("Order [accountId=null, orderUUID=null, exchange=null, type=null, condition=null, conditionTarget=null, sentinel=null, quantity=0.0, quantityRemaining=0.0, reserved=0.0, reserveRemaining=0.0, comissionReserved=0.0, comissionReserveRemaining=0.0, comissionPaid=0.0, price=0.0, pricePerUnit=0.0, opened=null, timestamp=null, open=false, cancelInitiated=false, conditional=false]", string0);
  }
}
