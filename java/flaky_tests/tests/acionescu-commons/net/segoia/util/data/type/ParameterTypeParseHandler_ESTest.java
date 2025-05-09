/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:28:27 GMT 2022
 */

package net.segoia.util.data.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.segoia.util.data.type.ParameterType;
import net.segoia.util.data.type.ParameterTypeParseHandler;
import net.segoia.util.parser.event.AssociationEvent;
import net.segoia.util.parser.event.GroupEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ParameterTypeParseHandler_ESTest extends ParameterTypeParseHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParameterTypeParseHandler parameterTypeParseHandler0 = new ParameterTypeParseHandler();
      GroupEvent groupEvent0 = new GroupEvent();
      ParameterType parameterType0 = new ParameterType();
      groupEvent0.setPrefixValue(parameterType0);
      Object object0 = parameterTypeParseHandler0.handleGroupEvent(groupEvent0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParameterTypeParseHandler parameterTypeParseHandler0 = new ParameterTypeParseHandler();
      Object object0 = parameterTypeParseHandler0.handleEmptyString("Context");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParameterTypeParseHandler parameterTypeParseHandler0 = new ParameterTypeParseHandler();
      ParameterType parameterType0 = (ParameterType)parameterTypeParseHandler0.handleEmptyString("wplat");
      assertEquals("wplat", parameterType0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParameterTypeParseHandler parameterTypeParseHandler0 = new ParameterTypeParseHandler();
      AssociationEvent associationEvent0 = new AssociationEvent();
      associationEvent0.setPrefixValue("?*mH/G");
      Object object0 = parameterTypeParseHandler0.handleAssociationEvent(associationEvent0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParameterTypeParseHandler parameterTypeParseHandler0 = new ParameterTypeParseHandler();
      GroupEvent groupEvent0 = new GroupEvent();
      // Undeclared exception!
      try { 
        parameterTypeParseHandler0.handleGroupEvent(groupEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ParameterTypeParseHandler parameterTypeParseHandler0 = new ParameterTypeParseHandler();
      AssociationEvent associationEvent0 = new AssociationEvent();
      // Undeclared exception!
      try { 
        parameterTypeParseHandler0.handleAssociationEvent(associationEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ParameterTypeParseHandler parameterTypeParseHandler0 = new ParameterTypeParseHandler();
      AssociationEvent associationEvent0 = new AssociationEvent();
      Object object0 = new Object();
      associationEvent0.setPrefixValue(object0);
      associationEvent0.setPostfixValue(parameterTypeParseHandler0);
      // Undeclared exception!
      try { 
        parameterTypeParseHandler0.handleAssociationEvent(associationEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.segoia.util.data.type.ParameterTypeParseHandler cannot be cast to class net.segoia.util.data.type.ParameterType (net.segoia.util.data.type.ParameterTypeParseHandler and net.segoia.util.data.type.ParameterType are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @143fbf7a)
         //
         verifyException("net.segoia.util.data.type.ParameterTypeParseHandler", e);
      }
  }
}
