/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:36:36 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.future.item;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.future.item.FutureKlineItem;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FutureKlineItem_ESTest extends FutureKlineItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      futureKlineItem0.setVolume(213L);
      long long0 = futureKlineItem0.getVolume();
      assertEquals(213L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      futureKlineItem0.setVolume((-1068L));
      long long0 = futureKlineItem0.getVolume();
      assertEquals((-1068L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      futureKlineItem0.setTime((-4392L));
      long long0 = futureKlineItem0.getTime();
      assertEquals((-4392L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      futureKlineItem0.setSettlement(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getSettlement();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      futureKlineItem0.setSettlement(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getSettlement();
      assertEquals((byte)10, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal((-1075L));
      futureKlineItem0.setSettlement(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getSettlement();
      assertEquals((short) (-1075), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      futureKlineItem0.setOpenInterest(1L);
      long long0 = futureKlineItem0.getOpenInterest();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      futureKlineItem0.setOpenInterest((-2756L));
      long long0 = futureKlineItem0.getOpenInterest();
      assertEquals((-2756L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      futureKlineItem0.setOpen(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getOpen();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal((-1075L));
      futureKlineItem0.setOpen(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getOpen();
      assertEquals((short) (-1075), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      futureKlineItem0.setLow(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getLow();
      assertEquals((byte)1, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      futureKlineItem0.setLow(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getLow();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal((-254));
      futureKlineItem0.setLow(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getLow();
      assertEquals((byte)2, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      futureKlineItem0.setLastTime(2480L);
      long long0 = futureKlineItem0.getLastTime();
      assertEquals(2480L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      futureKlineItem0.setLastTime((-463L));
      long long0 = futureKlineItem0.getLastTime();
      assertEquals((-463L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      futureKlineItem0.setHigh(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getHigh();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      futureKlineItem0.setHigh(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getHigh();
      assertEquals((byte)1, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal((-302));
      futureKlineItem0.setHigh(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getHigh();
      assertEquals((short) (-302), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      futureKlineItem0.setClose(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getClose();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      futureKlineItem0.setClose(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getClose();
      assertEquals((short)10, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      futureKlineItem0.setClose(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getClose();
      assertEquals((byte) (-1), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = futureKlineItem0.getSettlement();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = futureKlineItem0.getHigh();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      futureKlineItem0.setTime(866L);
      long long0 = futureKlineItem0.getTime();
      assertEquals(866L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = futureKlineItem0.getClose();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal((-524.5434));
      futureKlineItem0.setLow(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getLow();
      assertEquals((byte) (-12), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      long long0 = futureKlineItem0.getTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      long long0 = futureKlineItem0.getVolume();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      String string0 = futureKlineItem0.toString();
      assertEquals("FutureKlineItem{time=0, lastTime=0, open=null, close=null, high=null, low=null, volume=0, openInterest=0, settlement=null}", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      long long0 = futureKlineItem0.getOpenInterest();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      long long0 = futureKlineItem0.getLastTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = futureKlineItem0.getOpen();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = futureKlineItem0.getLow();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FutureKlineItem futureKlineItem0 = new FutureKlineItem();
      BigDecimal bigDecimal0 = new BigDecimal(1331);
      futureKlineItem0.setOpen(bigDecimal0);
      BigDecimal bigDecimal1 = futureKlineItem0.getOpen();
      assertEquals((byte)51, bigDecimal1.byteValue());
  }
}
