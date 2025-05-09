/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:58:00 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.quote.item;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.quote.item.HistoryTimelineItem;
import com.tigerbrokers.stock.openapi.client.https.domain.quote.item.TimelinePoint;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HistoryTimelineItem_ESTest extends HistoryTimelineItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HistoryTimelineItem historyTimelineItem0 = new HistoryTimelineItem();
      historyTimelineItem0.setSymbol("");
      String string0 = historyTimelineItem0.getSymbol();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HistoryTimelineItem historyTimelineItem0 = new HistoryTimelineItem();
      LinkedList<TimelinePoint> linkedList0 = new LinkedList<TimelinePoint>();
      TimelinePoint timelinePoint0 = new TimelinePoint();
      linkedList0.add(timelinePoint0);
      historyTimelineItem0.setItems(linkedList0);
      List<TimelinePoint> list0 = historyTimelineItem0.getItems();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HistoryTimelineItem historyTimelineItem0 = new HistoryTimelineItem();
      historyTimelineItem0.setSymbol("j?VU\"kuYg4l@:$S");
      String string0 = historyTimelineItem0.getSymbol();
      assertEquals("j?VU\"kuYg4l@:$S", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HistoryTimelineItem historyTimelineItem0 = new HistoryTimelineItem();
      String string0 = historyTimelineItem0.toString();
      assertEquals("TimelineItem{symbol='null', items=null}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HistoryTimelineItem historyTimelineItem0 = new HistoryTimelineItem();
      LinkedList<TimelinePoint> linkedList0 = new LinkedList<TimelinePoint>();
      historyTimelineItem0.setItems(linkedList0);
      List<TimelinePoint> list0 = historyTimelineItem0.getItems();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HistoryTimelineItem historyTimelineItem0 = new HistoryTimelineItem();
      String string0 = historyTimelineItem0.getSymbol();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HistoryTimelineItem historyTimelineItem0 = new HistoryTimelineItem();
      List<TimelinePoint> list0 = historyTimelineItem0.getItems();
      assertNull(list0);
  }
}
