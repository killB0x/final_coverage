/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:19:26 GMT 2022
 */

package iot.jcypher.query.api.modify;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.query.api.modify.CopyProperties;
import iot.jcypher.query.api.pattern.Property;
import iot.jcypher.query.ast.modify.ModifyExpression;
import iot.jcypher.query.ast.modify.PropertiesCopy;
import iot.jcypher.query.values.JcElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CopyProperties_ESTest extends CopyProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModifyExpression.ModifyAction modifyExpression_ModifyAction0 = ModifyExpression.ModifyAction.SET;
      ModifyExpression modifyExpression0 = new ModifyExpression(modifyExpression_ModifyAction0);
      CopyProperties<Property<ModifyExpression>> copyProperties0 = new CopyProperties<Property<ModifyExpression>>(modifyExpression0, (Property<ModifyExpression>) null);
      PropertiesCopy propertiesCopy0 = new PropertiesCopy();
      modifyExpression0.setPropertiesCopy(propertiesCopy0);
      Property<ModifyExpression> property0 = copyProperties0.to((JcElement) null);
      assertNull(property0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ModifyExpression.ModifyAction modifyExpression_ModifyAction0 = ModifyExpression.ModifyAction.SET;
      ModifyExpression modifyExpression0 = new ModifyExpression(modifyExpression_ModifyAction0);
      PropertiesCopy propertiesCopy0 = new PropertiesCopy();
      modifyExpression0.setPropertiesCopy(propertiesCopy0);
      Property<Object> property0 = (Property<Object>) mock(Property.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(property0).toString();
      CopyProperties<Property<Object>> copyProperties0 = new CopyProperties<Property<Object>>(modifyExpression0, property0);
      Property<Object> property1 = copyProperties0.to((JcElement) null);
      assertSame(property1, property0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ModifyExpression.ModifyAction modifyExpression_ModifyAction0 = ModifyExpression.ModifyAction.SET;
      ModifyExpression modifyExpression0 = new ModifyExpression(modifyExpression_ModifyAction0);
      CopyProperties<Property<ModifyExpression>> copyProperties0 = new CopyProperties<Property<ModifyExpression>>(modifyExpression0, (Property<ModifyExpression>) null);
      // Undeclared exception!
      try { 
        copyProperties0.to((JcElement) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.modify.CopyProperties", e);
      }
  }
}
