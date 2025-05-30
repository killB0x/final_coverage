/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:43:15 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.quote.item;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.quote.item.TickPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TickPoint_ESTest extends TickPoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Long long0 = new Long(0L);
      tickPoint0.setVolume(long0);
      Long long1 = tickPoint0.getVolume();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Long long0 = new Long(283L);
      tickPoint0.setVolume(long0);
      Long long1 = tickPoint0.getVolume();
      assertEquals(283L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Long long0 = new Long((-1700L));
      tickPoint0.setVolume(long0);
      Long long1 = tickPoint0.getVolume();
      assertEquals((-1700L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      tickPoint0.setType("TickPoint{price=806.43641138, type='null', time=null, volume=null}");
      String string0 = tickPoint0.getType();
      assertEquals("TickPoint{price=806.43641138, type='null', time=null, volume=null}", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Long long0 = new Long(0L);
      tickPoint0.setTime(long0);
      Long long1 = tickPoint0.getTime();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Long long0 = new Long(283L);
      tickPoint0.setTime(long0);
      Long long1 = tickPoint0.getTime();
      assertEquals(283L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Long long0 = new Long((-815L));
      tickPoint0.setTime(long0);
      Long long1 = tickPoint0.getTime();
      assertEquals((-815L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Double double0 = new Double(0.0);
      tickPoint0.setPrice(double0);
      Double double1 = tickPoint0.getPrice();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Double double0 = new Double(1262.195);
      tickPoint0.setPrice(double0);
      Double double1 = tickPoint0.getPrice();
      assertEquals(1262.195, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Double double0 = Double.valueOf((-1237.873329389676));
      tickPoint0.setPrice(double0);
      Double double1 = tickPoint0.getPrice();
      assertEquals((-1237.873329389676), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      String string0 = tickPoint0.toString();
      assertEquals("TickPoint{price=null, type='null', time=null, volume=null}", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Long long0 = tickPoint0.getVolume();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      String string0 = tickPoint0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      tickPoint0.setType("");
      String string0 = tickPoint0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Double double0 = tickPoint0.getPrice();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TickPoint tickPoint0 = new TickPoint();
      Long long0 = tickPoint0.getTime();
      assertNull(long0);
  }
}
