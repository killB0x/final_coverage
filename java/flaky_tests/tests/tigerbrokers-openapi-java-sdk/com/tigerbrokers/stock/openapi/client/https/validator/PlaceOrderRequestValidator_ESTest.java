/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 03:26:14 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.tigerbrokers.stock.openapi.client.https.domain.trade.model.TradeOrderModel;
import com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator;
import com.tigerbrokers.stock.openapi.client.struct.enums.ActionType;
import com.tigerbrokers.stock.openapi.client.struct.enums.AttachType;
import com.tigerbrokers.stock.openapi.client.struct.enums.Currency;
import com.tigerbrokers.stock.openapi.client.struct.enums.OrderType;
import com.tigerbrokers.stock.openapi.client.struct.enums.SecType;
import com.tigerbrokers.stock.openapi.client.struct.enums.TimeInForce;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PlaceOrderRequestValidator_ESTest extends PlaceOrderRequestValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{e");
      tradeOrderModel0.setAccount("<[B(;{e");
      OrderType orderType0 = OrderType.TRAIL;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(0);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.OPT;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10102:client biz param error(total_quantity is incorrect)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      // Undeclared exception!
      try { 
        placeOrderRequestValidator0.validate((TradeOrderModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{");
      AttachType attachType0 = AttachType.LOSS;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setAccount("<[B(;{");
      OrderType orderType0 = OrderType.TRAIL;
      TimeInForce timeInForce0 = TimeInForce.GTC;
      tradeOrderModel0.setStopLossTif(timeInForce0);
      Double double0 = new Double((-1819.362539));
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.SELL;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(1386);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      Double double1 = new Double(364.34238667);
      tradeOrderModel0.setStopLossPrice(double0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      tradeOrderModel0.setStopLossLimitPrice(double1);
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertEquals(ActionType.SELL, tradeOrderModel0.getAction());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{");
      Currency currency0 = Currency.CNH;
      AttachType attachType0 = AttachType.LOSS;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setCurrency(currency0);
      tradeOrderModel0.setAccount("<[B(;{");
      ActionType actionType0 = ActionType.BUY;
      OrderType orderType0 = OrderType.TRAIL;
      TimeInForce timeInForce0 = TimeInForce.DAY;
      tradeOrderModel0.setStopLossTif(timeInForce0);
      Double double0 = new Double((-384.301893));
      tradeOrderModel0.setStopLossLimitPrice(double0);
      tradeOrderModel0.setOrderType(orderType0);
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(1386);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.CASH;
      tradeOrderModel0.setSecType(secType0);
      Double double1 = new Double(0.0);
      tradeOrderModel0.setStopLossPrice(double1);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertEquals(0.0, tradeOrderModel0.getStopLossPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{");
      Currency currency0 = Currency.CNH;
      AttachType attachType0 = AttachType.LOSS;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setCurrency(currency0);
      tradeOrderModel0.setAccount("<[B(;{");
      ActionType actionType0 = ActionType.BUY;
      OrderType orderType0 = OrderType.TRAIL;
      TimeInForce timeInForce0 = TimeInForce.DAY;
      tradeOrderModel0.setStopLossTif(timeInForce0);
      Double double0 = new Double((-384.301893));
      tradeOrderModel0.setStopLossLimitPrice(double0);
      tradeOrderModel0.setOrderType(orderType0);
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(1386);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.CASH;
      tradeOrderModel0.setSecType(secType0);
      tradeOrderModel0.setStopLossPrice(double0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10102:client biz param error(stop_loss_limit_price is incorrect)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{");
      AttachType attachType0 = AttachType.LOSS;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setAccount("<[B(;{");
      OrderType orderType0 = OrderType.TRAIL;
      TimeInForce timeInForce0 = TimeInForce.GTC;
      tradeOrderModel0.setStopLossTif(timeInForce0);
      Double double0 = new Double((-1819.362539));
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.SELL;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(1386);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      tradeOrderModel0.setStopLossPrice(double0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      tradeOrderModel0.setStopLossLimitPrice(double0);
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10102:client biz param error(stop_loss_limit_price is incorrect)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{");
      AttachType attachType0 = AttachType.LOSS;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setAccount("<[B(;{");
      OrderType orderType0 = OrderType.TRAIL;
      TimeInForce timeInForce0 = TimeInForce.GTC;
      tradeOrderModel0.setStopLossTif(timeInForce0);
      Double double0 = new Double((-1819.362539));
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.SELL;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(1386);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      tradeOrderModel0.setStopLossPrice(double0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertNull(tradeOrderModel0.getTrailingPercent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("lq`o bn/");
      AttachType attachType0 = AttachType.LOSS;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setAccount("<[B(;{");
      ActionType actionType0 = ActionType.SELL;
      OrderType orderType0 = OrderType.MKT;
      tradeOrderModel0.setOrderType(orderType0);
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(1386);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.STK;
      tradeOrderModel0.setSecType(secType0);
      Double double0 = new Double(1386);
      tradeOrderModel0.setStopLossPrice(double0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(stop_loss_tif is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("^ob/].f~vt");
      AttachType attachType0 = AttachType.LOSS;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setAccount("^ob/].f~vt");
      OrderType orderType0 = OrderType.MKT;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.SELL;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = Integer.valueOf(1705);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.CASH;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(stop_loss_price is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[UH*{");
      Double double0 = new Double((-1646.3123693));
      AttachType attachType0 = AttachType.BRACKETS;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setProfitTakerPrice(double0);
      tradeOrderModel0.setAccount("<[UH*{");
      OrderType orderType0 = OrderType.TRAIL;
      tradeOrderModel0.setOrderType(orderType0);
      TimeInForce timeInForce0 = TimeInForce.GTC;
      tradeOrderModel0.setProfitTakerTif(timeInForce0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = Integer.valueOf(4113);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.STK;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(stop_loss_price is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[UH*{");
      AttachType attachType0 = AttachType.PROFIT;
      tradeOrderModel0.setAttachType(attachType0);
      Double double0 = new Double((-1646.3123693));
      tradeOrderModel0.setProfitTakerPrice(double0);
      tradeOrderModel0.setAccount("<[UH*{");
      OrderType orderType0 = OrderType.TRAIL;
      tradeOrderModel0.setOrderType(orderType0);
      TimeInForce timeInForce0 = TimeInForce.GTC;
      tradeOrderModel0.setProfitTakerTif(timeInForce0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = Integer.valueOf(4113);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.STK;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertNull(tradeOrderModel0.getCurrency());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[UH*{");
      AttachType attachType0 = AttachType.PROFIT;
      tradeOrderModel0.setAttachType(attachType0);
      Double double0 = new Double((-1646.3123693));
      tradeOrderModel0.setProfitTakerPrice(double0);
      tradeOrderModel0.setAccount("<[UH*{");
      OrderType orderType0 = OrderType.TRAIL;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = Integer.valueOf(4113);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.STK;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(profit_taker_tif is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[UH*{");
      AttachType attachType0 = AttachType.PROFIT;
      tradeOrderModel0.setAttachType(attachType0);
      tradeOrderModel0.setAccount("<[UH*{");
      OrderType orderType0 = OrderType.TRAIL;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = Integer.valueOf(4113);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.STK;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(profit_taker_price is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[U(H{");
      Currency currency0 = Currency.HKD;
      tradeOrderModel0.setCurrency(currency0);
      tradeOrderModel0.setAccount("<[U(H{");
      OrderType orderType0 = OrderType.TRAIL;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      tradeOrderModel0.setLocalSymbol("<[U(H{");
      Integer integer0 = new Integer(13);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.IOPT;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10102:client biz param error(local_symbol is incorrect)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[U(H{");
      Currency currency0 = Currency.HKD;
      tradeOrderModel0.setCurrency(currency0);
      tradeOrderModel0.setAccount("<[U(H{");
      OrderType orderType0 = OrderType.MKT;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      tradeOrderModel0.setLocalSymbol("00000");
      Integer integer0 = new Integer(1);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.IOPT;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertNull(tradeOrderModel0.getTrailingPercent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{");
      Currency currency0 = Currency.HKD;
      tradeOrderModel0.setCurrency(currency0);
      tradeOrderModel0.setAccount(".");
      ActionType actionType0 = ActionType.SELL;
      OrderType orderType0 = OrderType.MKT;
      tradeOrderModel0.setOrderType(orderType0);
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = Integer.getInteger("Tqv!/zY`Hcrg*", 1);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertNull(tradeOrderModel0.getTrailingPercent());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[L(H{");
      Currency currency0 = Currency.HKD;
      tradeOrderModel0.setCurrency(currency0);
      tradeOrderModel0.setAccount("<[L(H{");
      OrderType orderType0 = OrderType.MKT;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.SELL;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(10);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.WAR;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertNull(tradeOrderModel0.getTimeInForce());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[U(H{");
      tradeOrderModel0.setAccount("<[U(H{");
      OrderType orderType0 = OrderType.MKT;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(13);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.CASH;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(currency is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{e");
      tradeOrderModel0.setAccount("<[B(;{e");
      OrderType orderType0 = OrderType.STP;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.SELL;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = Integer.getInteger("<[B(;{e", 4113);
      Double double0 = new Double(4113);
      tradeOrderModel0.setAuxPrice(double0);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FUT;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertNull(tradeOrderModel0.getExchange());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("lq`o bn/");
      Double double0 = new Double(3385.764859786);
      tradeOrderModel0.setLimitPrice(double0);
      tradeOrderModel0.setAccount("<[B(;{");
      OrderType orderType0 = OrderType.STP_LMT;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(10);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(aux_price is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[({");
      tradeOrderModel0.setAccount("<[({");
      OrderType orderType0 = OrderType.LMT;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(1825);
      Double double0 = new Double(1825);
      tradeOrderModel0.setLimitPrice(double0);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      placeOrderRequestValidator0.validate(tradeOrderModel0);
      assertNull(tradeOrderModel0.getId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("lq`o bn/");
      tradeOrderModel0.setAccount("<[B(;{");
      OrderType orderType0 = OrderType.STP_LMT;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = new Integer(10);
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(limit_price is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[B(;{e");
      tradeOrderModel0.setAccount("<[B(;{e");
      OrderType orderType0 = OrderType.STP;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      Integer integer0 = Integer.getInteger("<[B(;{e", (-543));
      tradeOrderModel0.setTotalQuantity(integer0);
      SecType secType0 = SecType.FUT;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10102:client biz param error(total_quantity is incorrect)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[({");
      tradeOrderModel0.setAccount("<[({");
      OrderType orderType0 = OrderType.LMT;
      tradeOrderModel0.setOrderType(orderType0);
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(total_quantity is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[({");
      tradeOrderModel0.setAccount("<[({");
      ActionType actionType0 = ActionType.BUY;
      tradeOrderModel0.setAction(actionType0);
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(order_type is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[({");
      tradeOrderModel0.setAccount("<[({");
      SecType secType0 = SecType.FOP;
      tradeOrderModel0.setSecType(secType0);
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(action is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setSymbol("<[({");
      tradeOrderModel0.setAccount("<[({");
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(sec_type is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      tradeOrderModel0.setAccount("<[({");
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(symbol is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PlaceOrderRequestValidator placeOrderRequestValidator0 = new PlaceOrderRequestValidator();
      TradeOrderModel tradeOrderModel0 = new TradeOrderModel();
      try { 
        placeOrderRequestValidator0.validate(tradeOrderModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(account is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.PlaceOrderRequestValidator", e);
      }
  }
}
