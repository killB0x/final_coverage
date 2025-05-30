/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 10:55:15 GMT 2022
 */

package org.immregistries.mqe.hl7util.parser.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.immregistries.mqe.hl7util.parser.model.HL7MessagePart;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HL7MessagePart_ESTest extends HL7MessagePart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart(39, (String) null);
      boolean boolean0 = hL7MessagePart1.equals(hL7MessagePart0);
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart1.getSegmentSeq());
      assertEquals(39, hL7MessagePart1.getSegmentIndex());
      assertEquals((-1), hL7MessagePart1.getFieldRepetition());
      assertFalse(boolean0);
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertFalse(hL7MessagePart0.equals((Object)hL7MessagePart1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      
      hL7MessagePart0.setFieldRepetition(1);
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart(125, "", (-1));
      boolean boolean0 = hL7MessagePart0.equals(hL7MessagePart1);
      assertEquals(1, hL7MessagePart0.getFieldRepetition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      hL7MessagePart0.setValue("p[ Sr9&9m1*?R1+m^");
      hL7MessagePart0.getValue();
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub");
      hL7MessagePart0.setValue("");
      hL7MessagePart0.getValue();
      assertEquals(39, hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(0, (String) null, 0);
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      
      hL7MessagePart0.setSegmentSeq(0);
      int int0 = hL7MessagePart0.getSegmentSeq();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      hL7MessagePart0.setSegmentSeq(125);
      int int0 = hL7MessagePart0.getSegmentSeq();
      assertEquals(125, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(0, ", locationCd='", 0);
      int int0 = hL7MessagePart0.getSegmentIndex();
      assertEquals(0, int0);
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals(", locationCd='-0", hL7MessagePart0.getLocationCd());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub", 39);
      int int0 = hL7MessagePart0.getSegmentIndex();
      assertEquals("8qC&zub-39", hL7MessagePart0.getLocationCd());
      assertEquals(39, int0);
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      hL7MessagePart0.setLocationCd(", valueTx='");
      hL7MessagePart0.getLocationCd();
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      hL7MessagePart0.setLocationCd("");
      hL7MessagePart0.getLocationCd();
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      
      hL7MessagePart0.setFieldRepetition(0);
      int int0 = hL7MessagePart0.getFieldRepetition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub", 39);
      hL7MessagePart0.setValue("8qC&zub");
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart(39, "8qC&zub-39");
      assertFalse(hL7MessagePart1.equals((Object)hL7MessagePart0));
      
      hL7MessagePart1.setValue("8qC&zub");
      boolean boolean0 = hL7MessagePart0.equals(hL7MessagePart1);
      assertTrue(hL7MessagePart1.equals((Object)hL7MessagePart0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart();
      assertTrue(hL7MessagePart1.equals((Object)hL7MessagePart0));
      
      hL7MessagePart1.setValue(",AM(H!=5z");
      boolean boolean0 = hL7MessagePart0.equals(hL7MessagePart1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub", 39);
      hL7MessagePart0.setValue("8qC&zub");
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart(39, "8qC&zub-39");
      boolean boolean0 = hL7MessagePart0.equals(hL7MessagePart1);
      assertEquals((-1), hL7MessagePart1.getSegmentSeq());
      assertEquals(39, hL7MessagePart1.getSegmentIndex());
      assertEquals((-1), hL7MessagePart1.getFieldRepetition());
      assertFalse(boolean0);
      assertEquals("8qC&zub-39", hL7MessagePart0.getLocationCd());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart((-2065), "8e+^De:yI-kTYt");
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart((-210), "8e+^De:yI-kTYt");
      boolean boolean0 = hL7MessagePart0.equals(hL7MessagePart1);
      assertEquals((-210), hL7MessagePart1.getSegmentIndex());
      assertFalse(hL7MessagePart1.equals((Object)hL7MessagePart0));
      assertFalse(boolean0);
      assertEquals((-1), hL7MessagePart1.getSegmentSeq());
      assertEquals((-1), hL7MessagePart1.getFieldRepetition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart();
      boolean boolean0 = hL7MessagePart1.equals(hL7MessagePart0);
      assertEquals((-1), hL7MessagePart1.getSegmentSeq());
      assertEquals((-1), hL7MessagePart1.getFieldRepetition());
      assertTrue(boolean0);
      assertEquals((-1), hL7MessagePart1.getSegmentIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub");
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart();
      boolean boolean0 = hL7MessagePart1.equals(hL7MessagePart0);
      assertEquals((-1), hL7MessagePart1.getSegmentIndex());
      assertEquals((-1), hL7MessagePart1.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart1.getFieldRepetition());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertFalse(boolean0);
      assertEquals(39, hL7MessagePart0.getSegmentIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      hL7MessagePart0.setFieldRepetition((-1012));
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart();
      boolean boolean0 = hL7MessagePart0.equals(hL7MessagePart1);
      assertEquals((-1012), hL7MessagePart0.getFieldRepetition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart((-1), "}7`\"%jh,*mcg]s5");
      Object object0 = new Object();
      boolean boolean0 = hL7MessagePart0.equals(object0);
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertFalse(boolean0);
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      boolean boolean0 = hL7MessagePart0.equals((Object) null);
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart((-1), "}7`\"%jh,*mcg]s5");
      boolean boolean0 = hL7MessagePart0.equals(hL7MessagePart0);
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub");
      HL7MessagePart hL7MessagePart1 = new HL7MessagePart(39, "8qC&zub", 39);
      boolean boolean0 = hL7MessagePart0.equals(hL7MessagePart1);
      assertEquals("8qC&zub-39", hL7MessagePart1.getLocationCd());
      assertEquals((-1), hL7MessagePart1.getSegmentSeq());
      assertEquals((-1), hL7MessagePart1.getFieldRepetition());
      assertEquals(39, hL7MessagePart1.getSegmentIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      hL7MessagePart0.hashCode();
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub");
      hL7MessagePart0.hashCode();
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals(39, hL7MessagePart0.getSegmentIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart((-1), "}7`\"%jh,*mcg]s5");
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      
      hL7MessagePart0.setFieldRepetition(1);
      int int0 = hL7MessagePart0.getFieldRepetition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub");
      hL7MessagePart0.getValue();
      assertEquals(39, hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub");
      hL7MessagePart0.setValue("8qC&zub");
      hL7MessagePart0.hashCode();
      assertEquals(39, hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart((-1), "}7`\"%jh,*mcg]s5");
      int int0 = hL7MessagePart0.getFieldRepetition();
      assertEquals((-1), int0);
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart((-1), "}7`\"%jh,*mcg]s5");
      int int0 = hL7MessagePart0.getSegmentIndex();
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals((-1), int0);
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub");
      hL7MessagePart0.setSegmentIndex(39);
      assertEquals(39, hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(1, "h.!F;`LtRE*ZU");
      int int0 = hL7MessagePart0.getSegmentSeq();
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals(1, hL7MessagePart0.getSegmentIndex());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart();
      hL7MessagePart0.getLocationCd();
      assertEquals((-1), hL7MessagePart0.getFieldRepetition());
      assertEquals((-1), hL7MessagePart0.getSegmentSeq());
      assertEquals((-1), hL7MessagePart0.getSegmentIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HL7MessagePart hL7MessagePart0 = new HL7MessagePart(39, "8qC&zub");
      String string0 = hL7MessagePart0.toString();
      assertEquals("HL7MessagePart{segmentIdx=39, segmentSeq=-1, fieldRepetitionNbr=-1, valueTx='null', locationCd='8qC&zub'}", string0);
  }
}
