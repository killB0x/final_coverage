/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 22:42:56 GMT 2022
 */

package com.hubspot.jinjava.interpret;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.FatalTemplateErrorsException;
import com.hubspot.jinjava.interpret.InterpretException;
import com.hubspot.jinjava.interpret.TemplateError;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FatalTemplateErrorsException_ESTest extends FatalTemplateErrorsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<TemplateError> linkedList0 = new LinkedList<TemplateError>();
      TemplateError.ErrorType templateError_ErrorType0 = TemplateError.ErrorType.FATAL;
      TemplateError.ErrorReason templateError_ErrorReason0 = TemplateError.ErrorReason.OVER_LIMIT;
      TemplateError.ErrorItem templateError_ErrorItem0 = TemplateError.ErrorItem.TAG;
      InterpretException interpretException0 = new InterpretException("com.hubspot.jinjava.interpret.FatalTemplateErrorsException", (Throwable) null);
      TemplateError templateError0 = new TemplateError(templateError_ErrorType0, templateError_ErrorReason0, templateError_ErrorItem0, "MdX^'", "MdX^'", (-246), interpretException0);
      linkedList0.add(templateError0);
      FatalTemplateErrorsException fatalTemplateErrorsException0 = new FatalTemplateErrorsException("BH`C`/U?5b=4n%]02", linkedList0);
      String string0 = fatalTemplateErrorsException0.getTemplate();
      assertEquals("BH`C`/U?5b=4n%]02", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<TemplateError> linkedList0 = new LinkedList<TemplateError>();
      TemplateError.ErrorType templateError_ErrorType0 = TemplateError.ErrorType.FATAL;
      TemplateError.ErrorReason templateError_ErrorReason0 = TemplateError.ErrorReason.INVALID_ARGUMENT;
      InterpretException interpretException0 = new InterpretException("", (Throwable) null);
      TemplateError templateError0 = new TemplateError(templateError_ErrorType0, templateError_ErrorReason0, "", "vr*l*~vc~Hv4,JM", 37, 3041, interpretException0);
      linkedList0.add(templateError0);
      FatalTemplateErrorsException fatalTemplateErrorsException0 = new FatalTemplateErrorsException("", linkedList0);
      String string0 = fatalTemplateErrorsException0.getTemplate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<TemplateError> linkedList0 = new LinkedList<TemplateError>();
      linkedList0.add((TemplateError) null);
      FatalTemplateErrorsException fatalTemplateErrorsException0 = null;
      try {
        fatalTemplateErrorsException0 = new FatalTemplateErrorsException("pkH$0[", linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.interpret.FatalTemplateErrorsException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<TemplateError> linkedList0 = new LinkedList<TemplateError>();
      TemplateError.ErrorType templateError_ErrorType0 = TemplateError.ErrorType.WARNING;
      TemplateError.ErrorReason templateError_ErrorReason0 = TemplateError.ErrorReason.MISSING;
      TemplateError.ErrorItem templateError_ErrorItem0 = TemplateError.ErrorItem.EXPRESSION_TEST;
      InterpretException interpretException0 = new InterpretException((String) null, 2147483645, 2147483645);
      TemplateError templateError0 = new TemplateError(templateError_ErrorType0, templateError_ErrorReason0, templateError_ErrorItem0, "", (String) null, 2147483645, interpretException0);
      linkedList0.add(templateError0);
      FatalTemplateErrorsException fatalTemplateErrorsException0 = new FatalTemplateErrorsException((String) null, linkedList0);
      String string0 = fatalTemplateErrorsException0.getTemplate();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<TemplateError> linkedList0 = new LinkedList<TemplateError>();
      FatalTemplateErrorsException fatalTemplateErrorsException0 = null;
      try {
        fatalTemplateErrorsException0 = new FatalTemplateErrorsException("", linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // FatalTemplateErrorsException should have at least one error
         //
         verifyException("com.hubspot.jinjava.interpret.FatalTemplateErrorsException", e);
      }
  }
}
