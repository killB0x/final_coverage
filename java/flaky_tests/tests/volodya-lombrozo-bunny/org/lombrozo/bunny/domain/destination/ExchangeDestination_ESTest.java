/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 23:32:17 GMT 2022
 */

package org.lombrozo.bunny.domain.destination;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.lombrozo.bunny.connection.Connection;
import org.lombrozo.bunny.connection.TestConnection;
import org.lombrozo.bunny.domain.destination.ExchangeDestination;
import org.lombrozo.bunny.domain.exchange.DirectExchange;
import org.lombrozo.bunny.domain.exchange.Exchange;
import org.lombrozo.bunny.domain.exchange.ExchangeDescription;
import org.lombrozo.bunny.domain.exchange.FanoutExchange;
import org.lombrozo.bunny.domain.exchange.TopicExchange;
import org.lombrozo.bunny.message.Message;
import org.lombrozo.bunny.message.routing.RoutingKey;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExchangeDestination_ESTest extends ExchangeDestination_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestConnection testConnection0 = new TestConnection();
      DirectExchange directExchange0 = new DirectExchange(testConnection0, (String) null, (ExchangeDescription) null);
      ExchangeDestination exchangeDestination0 = new ExchangeDestination(directExchange0, (String) null);
      String string0 = exchangeDestination0.routingKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestConnection testConnection0 = new TestConnection();
      TopicExchange topicExchange0 = new TopicExchange(testConnection0, (String) null);
      ExchangeDestination exchangeDestination0 = new ExchangeDestination(topicExchange0);
      String string0 = exchangeDestination0.exchangeName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Exchange.Fake exchange_Fake0 = new Exchange.Fake();
      TopicExchange topicExchange0 = new TopicExchange(exchange_Fake0);
      ExchangeDestination exchangeDestination0 = new ExchangeDestination(topicExchange0);
      String string0 = exchangeDestination0.exchangeName();
      assertEquals("fake", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Connection.Fake connection_Fake0 = new Connection.Fake();
      DirectExchange directExchange0 = new DirectExchange(connection_Fake0, "");
      ExchangeDestination exchangeDestination0 = new ExchangeDestination(directExchange0, "");
      String string0 = exchangeDestination0.exchangeName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Connection.Fake connection_Fake0 = new Connection.Fake();
      DirectExchange directExchange0 = new DirectExchange(connection_Fake0, "");
      Message.Fake message_Fake0 = new Message.Fake();
      RoutingKey routingKey0 = message_Fake0.routingKey();
      ExchangeDestination exchangeDestination0 = new ExchangeDestination(directExchange0, routingKey0);
      String string0 = exchangeDestination0.routingKey();
      assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null);
      ExchangeDestination exchangeDestination1 = new ExchangeDestination((Exchange) null);
      boolean boolean0 = exchangeDestination0.equals(exchangeDestination1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FanoutExchange fanoutExchange0 = new FanoutExchange((Connection) null, (String) null);
      TopicExchange topicExchange0 = new TopicExchange(fanoutExchange0);
      ExchangeDestination exchangeDestination0 = new ExchangeDestination(fanoutExchange0);
      ExchangeDestination exchangeDestination1 = new ExchangeDestination(topicExchange0);
      boolean boolean0 = exchangeDestination0.equals(exchangeDestination1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null, "&31RVmh`O2]9k)ZDu");
      boolean boolean0 = exchangeDestination0.equals("&31RVmh`O2]9k)ZDu");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null);
      boolean boolean0 = exchangeDestination0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null, "&31RVmh`O2]9k)ZDu");
      boolean boolean0 = exchangeDestination0.equals(exchangeDestination0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null, "&31RVmh`O2]9k)ZDu");
      ExchangeDestination exchangeDestination1 = new ExchangeDestination((Exchange) null);
      boolean boolean0 = exchangeDestination0.equals(exchangeDestination1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null);
      String string0 = exchangeDestination0.routingKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null, "&31RVmh`O2]9k)ZDu");
      exchangeDestination0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null);
      String string0 = exchangeDestination0.toString();
      assertEquals("ExchangeDestination(exchange='null', routingKey='')", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TopicExchange topicExchange0 = new TopicExchange((Exchange) null);
      ExchangeDestination exchangeDestination0 = null;
      try {
        exchangeDestination0 = new ExchangeDestination(topicExchange0, (RoutingKey) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.lombrozo.bunny.domain.destination.ExchangeDestination", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExchangeDestination exchangeDestination0 = new ExchangeDestination((Exchange) null);
      // Undeclared exception!
      try { 
        exchangeDestination0.exchangeName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.lombrozo.bunny.domain.destination.ExchangeDestination", e);
      }
  }
}
