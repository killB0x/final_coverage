/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 23:59:19 GMT 2022
 */

package com.cronutils.model.time.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.cronutils.model.field.CronField;
import com.cronutils.model.field.CronFieldName;
import com.cronutils.model.field.constraint.FieldConstraints;
import com.cronutils.model.field.expression.Between;
import com.cronutils.model.field.expression.FieldExpression;
import com.cronutils.model.field.expression.On;
import com.cronutils.model.field.value.FieldValue;
import com.cronutils.model.field.value.IntegerFieldValue;
import com.cronutils.model.field.value.SpecialChar;
import com.cronutils.model.time.generator.BetweenFieldValueGenerator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BetweenFieldValueGenerator_ESTest extends BetweenFieldValueGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue((-1121));
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1121), (-1121), false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.generateCandidates((-1121), (-1121));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      IntegerFieldValue integerFieldValue1 = new IntegerFieldValue((-36));
      Between between0 = new Between(integerFieldValue1, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>(522);
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, 2020, true);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_YEAR;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.generateCandidatesNotIncludingIntervalExtremes(1372, (-36));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-2149), 2020, true);
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.matchesFieldExpressionClass(between0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 1071, 0, true);
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      On on0 = new On(integerFieldValue0);
      betweenFieldValueGenerator0.matchesFieldExpressionClass(on0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(0);
      BetweenFieldValueGenerator.map(integerFieldValue0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      BetweenFieldValueGenerator.map(integerFieldValue0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue((-1));
      BetweenFieldValueGenerator.map(integerFieldValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      IntegerFieldValue integerFieldValue1 = new IntegerFieldValue((-1));
      Between between0 = new Between(integerFieldValue1, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, 2020, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.isMatch((-1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-2149), 2020, true);
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.isMatch(4380);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      IntegerFieldValue integerFieldValue1 = new IntegerFieldValue((-1));
      Between between0 = new Between(integerFieldValue1, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_YEAR;
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-1), 2020, false);
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.generatePreviousValue(1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue((-1));
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, 2020, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.generatePreviousValue(1980);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      IntegerFieldValue integerFieldValue1 = new IntegerFieldValue((-1));
      Between between0 = new Between(integerFieldValue1, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, 2020, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.generateNextValue((-1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue((-245));
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-3493), (-176), true);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.generateNextValue((-3493));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        BetweenFieldValueGenerator.map((FieldValue<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Non integer values at intervals are not fully supported yet.
         //
         verifyException("com.cronutils.model.time.generator.BetweenFieldValueGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.HOUR;
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>(2020);
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, 2020, true);
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      // Undeclared exception!
      betweenFieldValueGenerator0.generatePreviousValue(2147475092);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, Integer.MIN_VALUE, true);
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      // Undeclared exception!
      betweenFieldValueGenerator0.generateNextValue(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      CronFieldName cronFieldName0 = CronFieldName.HOUR;
      Between between0 = new Between((FieldValue<?>) null, (FieldValue<?>) null);
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2009, 2009, false);
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      // Undeclared exception!
      try { 
        betweenFieldValueGenerator0.generateNextValue(673);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Non integer values at intervals are not fully supported yet.
         //
         verifyException("com.cronutils.model.time.generator.BetweenFieldValueGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = null;
      try {
        betweenFieldValueGenerator0 = new BetweenFieldValueGenerator((CronField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // CronField must not be null
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CronFieldName cronFieldName0 = CronFieldName.YEAR;
      FieldExpression fieldExpression0 = FieldExpression.questionMark();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2, 2, false);
      CronField cronField0 = new CronField(cronFieldName0, fieldExpression0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = null;
      try {
        betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // FieldExpression does not match required class
         //
         verifyException("com.cronutils.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, (-36), true);
      CronFieldName cronFieldName0 = CronFieldName.SECOND;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      try { 
        betweenFieldValueGenerator0.generateNextValue(2020);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.cronutils.model.time.generator.BetweenFieldValueGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue((-15));
      Between between0 = new Between(integerFieldValue0, (FieldValue<?>) null);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, (-956), 1498, true);
      CronFieldName cronFieldName0 = CronFieldName.MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      // Undeclared exception!
      try { 
        betweenFieldValueGenerator0.generateCandidatesNotIncludingIntervalExtremes(1498, 1498);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Non integer values at intervals are not fully supported yet.
         //
         verifyException("com.cronutils.model.time.generator.BetweenFieldValueGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2009);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2009, 2009, false);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.generateCandidates(1287, 1287);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      IntegerFieldValue integerFieldValue1 = new IntegerFieldValue((-1));
      Between between0 = new Between(integerFieldValue1, integerFieldValue0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>(1540);
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap1, hashMap0, linkedHashSet0, 1989, 2020, true);
      CronFieldName cronFieldName0 = CronFieldName.MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      betweenFieldValueGenerator0.generateCandidates(1989, 2246);
      betweenFieldValueGenerator0.generateCandidatesNotIncludingIntervalExtremes((-3396), 1541);
      betweenFieldValueGenerator0.generateCandidatesNotIncludingIntervalExtremes((-3396), 1414);
      // Undeclared exception!
      betweenFieldValueGenerator0.generateCandidatesNotIncludingIntervalExtremes((-3396), 2028);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, (-36), true);
      CronFieldName cronFieldName0 = CronFieldName.SECOND;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      List<Integer> list0 = betweenFieldValueGenerator0.generateCandidatesNotIncludingIntervalExtremes(2043, 1284);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, 2020, true);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      try { 
        betweenFieldValueGenerator0.generatePreviousValue((-2387));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.cronutils.model.time.generator.BetweenFieldValueGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, 2020, false);
      CronFieldName cronFieldName0 = CronFieldName.MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      int int0 = betweenFieldValueGenerator0.generatePreviousValue(2889);
      assertEquals(2020, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2020);
      Between between0 = new Between(integerFieldValue0, integerFieldValue0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      LinkedHashSet<SpecialChar> linkedHashSet0 = new LinkedHashSet<SpecialChar>();
      FieldConstraints fieldConstraints0 = new FieldConstraints(hashMap0, hashMap1, linkedHashSet0, 2020, 2020, true);
      CronFieldName cronFieldName0 = CronFieldName.DAY_OF_MONTH;
      CronField cronField0 = new CronField(cronFieldName0, between0, fieldConstraints0);
      BetweenFieldValueGenerator betweenFieldValueGenerator0 = new BetweenFieldValueGenerator(cronField0);
      int int0 = betweenFieldValueGenerator0.generateNextValue((-2387));
      assertEquals(2020, int0);
  }
}
