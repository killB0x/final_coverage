/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 23:57:22 GMT 2022
 */

package com.cronutils.descriptor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.cronutils.descriptor.DescriptionStrategy;
import com.cronutils.descriptor.DescriptionStrategyFactory;
import com.cronutils.model.field.definition.FieldDefinition;
import com.cronutils.model.field.expression.And;
import com.cronutils.model.field.expression.Between;
import com.cronutils.model.field.expression.Every;
import com.cronutils.model.field.expression.FieldExpression;
import com.cronutils.model.field.expression.On;
import com.cronutils.model.field.value.FieldValue;
import com.cronutils.model.field.value.IntegerFieldValue;
import com.cronutils.model.field.value.SpecialChar;
import com.cronutils.model.field.value.SpecialCharFieldValue;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DescriptionStrategyFactory_ESTest extends DescriptionStrategyFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2737);
      FieldValue<Every> fieldValue0 = (FieldValue<Every>) mock(FieldValue.class, new ViolatedAssumptionAnswer());
      Between between0 = new Between(fieldValue0, fieldValue0);
      And and0 = between0.and((FieldExpression) null);
      SpecialChar specialChar0 = SpecialChar.LW;
      SpecialCharFieldValue specialCharFieldValue0 = new SpecialCharFieldValue(specialChar0);
      On on0 = new On(integerFieldValue0, specialCharFieldValue0);
      DescriptionStrategy descriptionStrategy0 = DescriptionStrategyFactory.hhMMssInstance((ResourceBundle) null, and0, (FieldExpression) null, on0);
      assertNotNull(descriptionStrategy0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IntegerFieldValue integerFieldValue0 = new IntegerFieldValue(2737);
      Every every0 = new Every(integerFieldValue0);
      DescriptionStrategy descriptionStrategy0 = DescriptionStrategyFactory.monthsInstance((ResourceBundle) null, every0);
      assertNotNull(descriptionStrategy0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DescriptionStrategy descriptionStrategy0 = DescriptionStrategyFactory.monthsInstance((ResourceBundle) null, (FieldExpression) null);
      assertNotNull(descriptionStrategy0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      And and0 = new And();
      DescriptionStrategy descriptionStrategy0 = DescriptionStrategyFactory.daysOfWeekInstance((ResourceBundle) null, and0, (FieldDefinition) null);
      assertNotNull(descriptionStrategy0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FieldValue<Every> fieldValue0 = (FieldValue<Every>) mock(FieldValue.class, new ViolatedAssumptionAnswer());
      Between between0 = new Between(fieldValue0, fieldValue0);
      DescriptionStrategy descriptionStrategy0 = DescriptionStrategyFactory.daysOfMonthInstance((ResourceBundle) null, between0);
      assertNotNull(descriptionStrategy0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DescriptionStrategy descriptionStrategy0 = DescriptionStrategyFactory.plainInstance((ResourceBundle) null, (FieldExpression) null);
      assertNotNull(descriptionStrategy0);
  }
}
