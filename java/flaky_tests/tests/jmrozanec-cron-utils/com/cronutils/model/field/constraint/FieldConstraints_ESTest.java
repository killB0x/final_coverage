/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 23:55:46 GMT 2022
 */

package com.cronutils.model.field.constraint;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.cronutils.model.field.constraint.FieldConstraints;
import com.cronutils.model.field.value.SpecialChar;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FieldConstraints_ESTest extends FieldConstraints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 822, 1741, false);
      boolean boolean0 = fieldConstraints0.isPeriodInRange(822);
      assertEquals(1741, fieldConstraints0.getEndRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertTrue(boolean0);
      assertEquals(822, fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 546, (-871), false);
      boolean boolean0 = fieldConstraints0.isPeriodInRange(0);
      assertEquals((-871), fieldConstraints0.getEndRange());
      assertEquals(546, fieldConstraints0.getStartRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-169), 0, false);
      boolean boolean0 = fieldConstraints0.isInRange((-1));
      assertTrue(boolean0);
      assertEquals((-169), fieldConstraints0.getStartRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(0, fieldConstraints0.getEndRange());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), 4, true);
      boolean boolean0 = fieldConstraints0.isStrictRange();
      assertEquals((-1), fieldConstraints0.getStartRange());
      assertTrue(boolean0);
      assertEquals(4, fieldConstraints0.getEndRange());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-169), 0, false);
      Integer integer0 = new Integer(0);
      hashMap0.put("%!>ZoP`", integer0);
      Integer integer1 = fieldConstraints0.getStringMappingValue("%!>ZoP`");
      assertNotNull(integer1);
      assertEquals(0, fieldConstraints0.getEndRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals((-169), fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>(2, 2);
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      Integer integer0 = new Integer(2);
      hashMap0.put("", integer0);
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2, 2, true);
      Integer integer1 = fieldConstraints0.getStringMappingValue("");
      assertNotNull(integer1);
      assertEquals(2, fieldConstraints0.getStartRange());
      assertTrue(fieldConstraints0.isStrictRange());
      assertEquals(2, fieldConstraints0.getEndRange());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      Integer integer0 = new Integer((-169));
      hashMap0.put(",G)mYD+|Ag(_C", integer0);
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1372), 1133, true);
      Integer integer1 = fieldConstraints0.getStringMappingValue(",G)mYD+|Ag(_C");
      assertTrue(fieldConstraints0.isStrictRange());
      assertEquals(1133, fieldConstraints0.getEndRange());
      assertEquals((-1372), fieldConstraints0.getStartRange());
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 0, false);
      int int0 = fieldConstraints0.getStartRange();
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(0, int0);
      assertEquals(0, fieldConstraints0.getEndRange());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 4, 0, false);
      int int0 = fieldConstraints0.getStartRange();
      assertEquals(0, fieldConstraints0.getEndRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 0, false);
      Integer integer0 = new Integer(779);
      Integer integer1 = new Integer(0);
      hashMap1.put(integer0, integer1);
      Integer integer2 = fieldConstraints0.getIntMappingValue(integer0);
      assertNotNull(integer2);
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(0, fieldConstraints0.getStartRange());
      assertEquals(0, fieldConstraints0.getEndRange());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 1775, true);
      Integer integer0 = new Integer(1775);
      hashMap1.put(integer0, integer0);
      Integer integer1 = fieldConstraints0.getIntMappingValue(integer0);
      assertEquals(0, fieldConstraints0.getStartRange());
      assertEquals(1775, fieldConstraints0.getEndRange());
      assertNotNull(integer1);
      assertTrue(fieldConstraints0.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer((-2222));
      hashMap1.put(integer0, integer0);
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-2267), (-3111), true);
      Integer integer1 = fieldConstraints0.getIntMappingValue(integer0);
      assertNotNull(integer1);
      assertTrue(fieldConstraints0.isStrictRange());
      assertEquals((-3111), fieldConstraints0.getEndRange());
      assertEquals((-2267), fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 4, 4, false);
      int int0 = fieldConstraints0.getEndRange();
      assertEquals(4, fieldConstraints0.getStartRange());
      assertEquals(4, int0);
      assertFalse(fieldConstraints0.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1170, (-3970), false);
      int int0 = fieldConstraints0.getEndRange();
      assertEquals(1170, fieldConstraints0.getStartRange());
      assertEquals((-3970), int0);
      assertFalse(fieldConstraints0.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = null;
      try {
        fieldConstraints0 = new FieldConstraints(hashMap0, (Map<Integer, Integer>) null, linkedHashSet0, 93, 93, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Integer mapping must not be null
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1170, 1170, true);
      FieldConstraints fieldConstraints1 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1170, 1170, true);
      boolean boolean0 = fieldConstraints0.equals(fieldConstraints1);
      assertTrue(fieldConstraints1.isStrictRange());
      assertEquals(1170, fieldConstraints1.getEndRange());
      assertTrue(boolean0);
      assertEquals(1170, fieldConstraints1.getStartRange());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 843, 843, false);
      FieldConstraints fieldConstraints1 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-2110), 843, false);
      boolean boolean0 = fieldConstraints0.equals(fieldConstraints1);
      assertEquals(843, fieldConstraints1.getEndRange());
      assertFalse(boolean0);
      assertEquals((-2110), fieldConstraints1.getStartRange());
      assertFalse(fieldConstraints1.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 511, (-3331), false);
      SpecialChar specialChar0 = SpecialChar.L;
      LinkedHashSet<SpecialChar> linkedHashSet1 = new LinkedHashSet<SpecialChar>();
      linkedHashSet1.add(specialChar0);
      FieldConstraints fieldConstraints1 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet1, 47, (-2677), false);
      boolean boolean0 = fieldConstraints1.equals(fieldConstraints0);
      assertEquals(47, fieldConstraints1.getStartRange());
      assertFalse(boolean0);
      assertEquals((-2677), fieldConstraints1.getEndRange());
      assertFalse(fieldConstraints1.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 843, 843, true);
      HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(843);
      hashMap1.put(integer0, (Integer) null);
      FieldConstraints fieldConstraints1 = new FieldConstraints(hashMap0, hashMap2, linkedHashSet0, (-2110), 843, true);
      boolean boolean0 = fieldConstraints0.equals(fieldConstraints1);
      assertEquals((-2110), fieldConstraints1.getStartRange());
      assertEquals(843, fieldConstraints1.getEndRange());
      assertTrue(fieldConstraints1.isStrictRange());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 3, 843, true);
      HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
      Integer integer0 = new Integer(3);
      hashMap2.put("Jo", integer0);
      FieldConstraints fieldConstraints1 = new FieldConstraints(hashMap2, hashMap1, linkedHashSet0, 3, 2490, true);
      boolean boolean0 = fieldConstraints0.equals(fieldConstraints1);
      assertEquals(2490, fieldConstraints1.getEndRange());
      assertFalse(boolean0);
      assertEquals(3, fieldConstraints1.getStartRange());
      assertTrue(fieldConstraints1.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap1, hashMap0, linkedHashSet0, 838, 838, true);
      FieldConstraints fieldConstraints1 = new FieldConstraints(hashMap1, hashMap0, linkedHashSet0, 838, 93, true);
      boolean boolean0 = fieldConstraints1.equals(fieldConstraints0);
      assertTrue(fieldConstraints1.isStrictRange());
      assertFalse(boolean0);
      assertEquals(838, fieldConstraints0.getEndRange());
      assertEquals(838, fieldConstraints1.getStartRange());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 0, true);
      FieldConstraints fieldConstraints1 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 0, false);
      boolean boolean0 = fieldConstraints0.equals(fieldConstraints1);
      assertEquals(0, fieldConstraints1.getEndRange());
      assertFalse(fieldConstraints1.isStrictRange());
      assertEquals(0, fieldConstraints1.getStartRange());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      SpecialChar specialChar0 = SpecialChar.L;
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), (-1), false);
      boolean boolean0 = fieldConstraints0.equals(specialChar0);
      assertFalse(boolean0);
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals((-1), fieldConstraints0.getEndRange());
      assertEquals((-1), fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 843, 843, false);
      boolean boolean0 = fieldConstraints0.equals(fieldConstraints0);
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(843, fieldConstraints0.getStartRange());
      assertEquals(843, fieldConstraints0.getEndRange());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 4, 4, false);
      boolean boolean0 = fieldConstraints0.equals((Object) null);
      assertEquals(4, fieldConstraints0.getEndRange());
      assertFalse(boolean0);
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(4, fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), 2278, false);
      boolean boolean0 = fieldConstraints0.isPeriodInRange(2278);
      assertEquals((-1), fieldConstraints0.getStartRange());
      assertEquals(2278, fieldConstraints0.getEndRange());
      assertTrue(boolean0);
      assertFalse(fieldConstraints0.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), (-1), false);
      boolean boolean0 = fieldConstraints0.isPeriodInRange(1);
      assertFalse(boolean0);
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals((-1), fieldConstraints0.getStartRange());
      assertEquals((-1), fieldConstraints0.getEndRange());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 4, 4, false);
      boolean boolean0 = fieldConstraints0.isPeriodInRange(4);
      assertEquals(4, fieldConstraints0.getEndRange());
      assertFalse(boolean0);
      assertEquals(4, fieldConstraints0.getStartRange());
      assertFalse(fieldConstraints0.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 4, 4, false);
      boolean boolean0 = fieldConstraints0.isPeriodInRange((-1));
      assertEquals(4, fieldConstraints0.getStartRange());
      assertEquals(4, fieldConstraints0.getEndRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-559), (-559), false);
      boolean boolean0 = fieldConstraints0.isInRange((-559));
      assertTrue(boolean0);
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals((-559), fieldConstraints0.getEndRange());
      assertEquals((-559), fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 4, 4, false);
      boolean boolean0 = fieldConstraints0.isInRange(1741);
      assertEquals(4, fieldConstraints0.getEndRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(4, fieldConstraints0.getStartRange());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1170, (-3970), false);
      boolean boolean0 = fieldConstraints0.isInRange(4);
      assertEquals(1170, fieldConstraints0.getStartRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertFalse(boolean0);
      assertEquals((-3970), fieldConstraints0.getEndRange());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1372), 1133, true);
      fieldConstraints0.getStringMappingValue(",G)mYD+|Ag(_C");
      assertTrue(fieldConstraints0.isStrictRange());
      assertEquals(1133, fieldConstraints0.getEndRange());
      assertEquals((-1372), fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), (-1), false);
      int int0 = fieldConstraints0.getStartRange();
      assertEquals((-1), int0);
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals((-1), fieldConstraints0.getEndRange());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 4, 4, false);
      boolean boolean0 = fieldConstraints0.isStrictRange();
      assertFalse(boolean0);
      assertEquals(4, fieldConstraints0.getEndRange());
      assertEquals(4, fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-2267), (-3111), true);
      fieldConstraints0.hashCode();
      assertEquals((-2267), fieldConstraints0.getStartRange());
      assertEquals((-3111), fieldConstraints0.getEndRange());
      assertTrue(fieldConstraints0.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-2267), (-3111), true);
      fieldConstraints0.getSpecialChars();
      assertEquals((-2267), fieldConstraints0.getStartRange());
      assertEquals((-3111), fieldConstraints0.getEndRange());
      assertTrue(fieldConstraints0.isStrictRange());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 0, false);
      Integer integer0 = new Integer(779);
      fieldConstraints0.getIntMappingValue(integer0);
      assertEquals(0, fieldConstraints0.getEndRange());
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(0, fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-169), 0, false);
      int int0 = fieldConstraints0.getEndRange();
      assertFalse(fieldConstraints0.isStrictRange());
      assertEquals(0, int0);
      assertEquals((-169), fieldConstraints0.getStartRange());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 0, false);
      fieldConstraints0.getStringMappingKeySet();
      assertEquals(0, fieldConstraints0.getStartRange());
      assertEquals(0, fieldConstraints0.getEndRange());
      assertFalse(fieldConstraints0.isStrictRange());
  }
}
