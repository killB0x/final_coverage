/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 16:52:35 GMT 2022
 */

package org.addition.epanet.network.structures;

import org.junit.Test;
import static org.junit.Assert.*;
import org.addition.epanet.network.Network;
import org.addition.epanet.network.PropertiesMap;
import org.addition.epanet.network.structures.Control;
import org.addition.epanet.network.structures.Link;
import org.addition.epanet.network.structures.Node;
import org.addition.epanet.network.structures.Pump;
import org.addition.epanet.network.structures.Tank;
import org.addition.epanet.network.structures.Valve;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Control_ESTest extends Control_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Control control0 = new Control();
      Control.ControlType control_ControlType0 = Control.ControlType.TIMEOFDAY;
      control0.setType(control_ControlType0);
      Control.ControlType control_ControlType1 = control0.getType();
      assertEquals(Control.ControlType.TIMEOFDAY, control_ControlType1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Control control0 = new Control();
      control0.setTime(1800L);
      long long0 = control0.getTime();
      assertEquals(1800L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Control control0 = new Control();
      control0.setTime((-2169L));
      long long0 = control0.getTime();
      assertEquals((-2169L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Control control0 = new Control();
      Link.StatType link_StatType0 = Link.StatType.XFCV;
      control0.setStatus(link_StatType0);
      Link.StatType link_StatType1 = control0.getStatus();
      assertEquals(Link.StatType.XFCV, link_StatType1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Control control0 = new Control();
      control0.setSetting(3175.5859872378);
      double double0 = control0.getSetting();
      assertEquals(3175.5859872378, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Control control0 = new Control();
      control0.setSetting((-673.61));
      double double0 = control0.getSetting();
      assertEquals((-673.61), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Control control0 = new Control();
      Node node0 = new Node();
      node0.setReportFlag(true);
      control0.setNode(node0);
      Node node1 = control0.getNode();
      assertTrue(node1.isRptFlag());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Control control0 = new Control();
      Node node0 = new Node();
      node0.setKe(4.727);
      control0.setNode(node0);
      Node node1 = control0.getNode();
      assertFalse(node1.isRptFlag());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Control control0 = new Control();
      Node node0 = new Node();
      node0.setKe((-1798.58594));
      control0.setNode(node0);
      Node node1 = control0.getNode();
      assertEquals((-1798.58594), node1.getKe(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Control control0 = new Control();
      Node node0 = new Node();
      node0.setInitDemand(28.317);
      control0.setNode(node0);
      Node node1 = control0.getNode();
      assertFalse(node1.isRptFlag());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Control control0 = new Control();
      Node node0 = new Node();
      node0.setInitDemand((-1.0));
      control0.setNode(node0);
      Node node1 = control0.getNode();
      assertEquals(0.0, node1.getElevation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Control control0 = new Control();
      Node node0 = new Node();
      node0.setElevation(3111.9675044);
      control0.setNode(node0);
      Node node1 = control0.getNode();
      assertFalse(node1.isRptFlag());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Control control0 = new Control();
      Tank tank0 = new Tank();
      control0.setNode(tank0);
      tank0.setElevation((-1922.81769926));
      Node node0 = control0.getNode();
      assertEquals(0.0, node0.getInitDemand(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Control control0 = new Control();
      Link link0 = new Link();
      link0.setReportFlag(true);
      control0.setLink(link0);
      Link link1 = control0.getLink();
      assertTrue(link1.isRptFlag());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Control control0 = new Control();
      Link link0 = new Link();
      control0.setLink(link0);
      link0.setRoughness(4102.473972379841);
      Link link1 = control0.getLink();
      assertFalse(link1.isRptFlag());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Control control0 = new Control();
      Valve valve0 = new Valve();
      valve0.setRoughness((-2893.884607667));
      control0.setLink(valve0);
      Link link0 = control0.getLink();
      assertEquals("", link0.getComment());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Control control0 = new Control();
      Link link0 = new Link();
      link0.setLenght(1745.703);
      control0.setLink(link0);
      Link link1 = control0.getLink();
      assertEquals(0.0, link1.getKm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Control control0 = new Control();
      PropertiesMap.UnitsType propertiesMap_UnitsType0 = PropertiesMap.UnitsType.SI;
      Link link0 = new Link();
      link0.setNULenght(propertiesMap_UnitsType0, (-820.4284283));
      control0.setLink(link0);
      Link link1 = control0.getLink();
      assertNull(link1.getId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Control control0 = new Control();
      Pump pump0 = new Pump();
      pump0.setKw(1566.50693716073);
      control0.setLink(pump0);
      Link link0 = control0.getLink();
      assertEquals("", link0.getComment());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Control control0 = new Control();
      Pump pump0 = new Pump();
      pump0.setKm((-1131.67331679236));
      control0.setLink(pump0);
      Pump pump1 = (Pump)control0.getLink();
      assertEquals(0.0, pump1.getHmax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Control control0 = new Control();
      Pump pump0 = new Pump();
      pump0.setKb((-1131.67331679236));
      control0.setLink(pump0);
      Pump pump1 = (Pump)control0.getLink();
      assertEquals(0.0, pump1.getN(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Control control0 = new Control();
      Link link0 = new Link();
      Network network0 = new Network();
      link0.setDiameterAndUpdate(0.0, network0);
      control0.setLink(link0);
      Link link1 = control0.getLink();
      assertSame(link1, link0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Control control0 = new Control();
      Pump pump0 = new Pump();
      pump0.setFlowResistance((-1.0));
      control0.setLink(pump0);
      Link link0 = control0.getLink();
      assertEquals("", link0.getComment());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Control control0 = new Control();
      Valve valve0 = new Valve();
      valve0.setDiameter(1.0E8);
      control0.setLink(valve0);
      Link link0 = control0.getLink();
      assertEquals(1.0E8, link0.getDiameter(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Control control0 = new Control();
      Pump pump0 = new Pump();
      pump0.setDiameter((-1.0));
      control0.setLink(pump0);
      Link link0 = control0.getLink();
      assertNull(link0.getId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Control control0 = new Control();
      control0.setGrade(740.28144);
      double double0 = control0.getGrade();
      assertEquals(740.28144, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Control control0 = new Control();
      control0.setGrade((-2330.568229636));
      double double0 = control0.getGrade();
      assertEquals((-2330.568229636), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Control control0 = new Control();
      double double0 = control0.getSetting();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Control control0 = new Control();
      control0.getType();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Control control0 = new Control();
      long long0 = control0.getTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Control control0 = new Control();
      control0.getStatus();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Control control0 = new Control();
      double double0 = control0.getGrade();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Control control0 = new Control();
      Node node0 = control0.getNode();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Control control0 = new Control();
      Link link0 = control0.getLink();
      assertNull(link0);
  }
}
