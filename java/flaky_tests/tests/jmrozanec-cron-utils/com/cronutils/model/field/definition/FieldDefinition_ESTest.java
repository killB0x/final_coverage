/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 00:11:56 GMT 2022
 */

package com.cronutils.model.field.definition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.cronutils.model.field.CronFieldName;
import com.cronutils.model.field.constraint.FieldConstraints;
import com.cronutils.model.field.definition.FieldDefinition;
import com.cronutils.model.field.value.SpecialChar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FieldDefinition_ESTest extends FieldDefinition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_YEAR;
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1, (-1), true);
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0, true);
      boolean boolean0 = fieldDefinition0.isOptional();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.SECOND;
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-581), 0, false);
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0, false);
      fieldDefinition0.getFieldName();
      assertFalse(fieldDefinition0.isOptional());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 1, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0);
      fieldDefinition0.getConstraints();
      assertFalse(fieldDefinition0.isOptional());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_YEAR;
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), 0, true);
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0, true);
      fieldDefinition0.getConstraints();
      assertTrue(fieldDefinition0.isOptional());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_YEAR;
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), (-1), true);
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0, true);
      fieldDefinition0.getConstraints();
      assertTrue(fieldDefinition0.isOptional());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_WEEK;
      FieldDefinition fieldDefinition0 = null;
      try {
        fieldDefinition0 = new FieldDefinition(cronFieldName0, (FieldConstraints) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // FieldConstraints must not be null
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.MINUTE;
      FieldDefinition fieldDefinition0 = null;
      try {
        fieldDefinition0 = new FieldDefinition(cronFieldName0, (FieldConstraints) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // FieldConstraints must not be null
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1, 1, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_WEEK;
      FieldConstraints fieldConstraints1 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 16, 16, false);
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints1, false);
      FieldDefinition fieldDefinition1 = new FieldDefinition(cronFieldName0, fieldConstraints0, false);
      boolean boolean0 = fieldDefinition0.equals(fieldDefinition1);
      assertFalse(boolean0);
      assertFalse(fieldDefinition1.isOptional());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 1, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0);
      CronFieldName cronFieldName1 = CronFieldName.MINUTE;
      FieldDefinition fieldDefinition1 = new FieldDefinition(cronFieldName1, fieldConstraints0, false);
      boolean boolean0 = fieldDefinition0.equals(fieldDefinition1);
      assertFalse(fieldDefinition1.isOptional());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_YEAR;
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), (-1), true);
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0, true);
      CronFieldName cronFieldName1 = fieldDefinition0.getFieldName();
      FieldDefinition fieldDefinition1 = new FieldDefinition(cronFieldName1, fieldConstraints0, false);
      FieldDefinition fieldDefinition2 = new FieldDefinition(cronFieldName1, fieldConstraints0, false);
      boolean boolean0 = fieldDefinition2.equals(fieldDefinition1);
      assertFalse(fieldDefinition2.equals((Object)fieldDefinition0));
      assertFalse(fieldDefinition2.isOptional());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1, 1, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_WEEK;
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0);
      boolean boolean0 = fieldDefinition0.equals((Object) null);
      assertFalse(fieldDefinition0.isOptional());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1, 1, false);
      CronFieldName cronFieldName0 = CronFieldName.HOUR;
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0);
      boolean boolean0 = fieldDefinition0.equals(fieldDefinition0);
      assertTrue(boolean0);
      assertFalse(fieldDefinition0.isOptional());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_YEAR;
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), (-1), true);
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0, true);
      boolean boolean0 = fieldDefinition0.equals(cronFieldName0);
      assertTrue(fieldDefinition0.isOptional());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_YEAR;
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), (-1), true);
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0, true);
      CronFieldName cronFieldName1 = fieldDefinition0.getFieldName();
      FieldDefinition fieldDefinition1 = new FieldDefinition(cronFieldName1, fieldConstraints0, false);
      boolean boolean0 = fieldDefinition0.equals(fieldDefinition1);
      assertFalse(fieldDefinition1.isOptional());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1, 1, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0);
      fieldDefinition0.getConstraints();
      assertFalse(fieldDefinition0.isOptional());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 1, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0);
      fieldDefinition0.hashCode();
      assertFalse(fieldDefinition0.isOptional());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<FieldDefinition> comparator0 = FieldDefinition.createFieldDefinitionComparator();
      assertNotNull(comparator0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 0, 1, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      FieldDefinition fieldDefinition0 = new FieldDefinition(cronFieldName0, fieldConstraints0);
      boolean boolean0 = fieldDefinition0.isOptional();
      assertFalse(boolean0);
  }
}
