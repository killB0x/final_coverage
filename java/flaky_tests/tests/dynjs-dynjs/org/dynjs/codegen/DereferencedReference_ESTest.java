/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:26:10 GMT 2022
 */

package org.dynjs.codegen;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.dynjs.codegen.DereferencedReference;
import org.dynjs.runtime.DynObject;
import org.dynjs.runtime.ExecutionContext;
import org.dynjs.runtime.JSObject;
import org.dynjs.runtime.LexicalEnvironment;
import org.dynjs.runtime.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DereferencedReference_ESTest extends DereferencedReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DereferencedReference dereferencedReference0 = new DereferencedReference((Reference) null, (Object) null);
      Object object0 = DereferencedReference.create((Object) null, dereferencedReference0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DereferencedReference dereferencedReference0 = new DereferencedReference((Reference) null, (Object) null);
      String string0 = dereferencedReference0.toString();
      assertEquals("[DerefRef: value=null; ref=null]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Reference reference0 = new Reference("", (Object) null, true);
      Object object0 = new Object();
      DereferencedReference dereferencedReference0 = (DereferencedReference)DereferencedReference.create(reference0, object0);
      Object object1 = dereferencedReference0.getValue();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DereferencedReference dereferencedReference0 = new DereferencedReference((Reference) null, (Object) null);
      Reference reference0 = dereferencedReference0.getReference();
      assertNull(reference0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      Reference reference0 = new Reference("r11N:v:ylT%Zfar", object0, false);
      DereferencedReference dereferencedReference0 = new DereferencedReference(reference0, (Object) null);
      Reference reference1 = dereferencedReference0.getReference();
      assertSame(reference1, reference0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DynObject dynObject0 = new DynObject();
      LexicalEnvironment lexicalEnvironment0 = LexicalEnvironment.newGlobalEnvironment((JSObject) dynObject0);
      Reference reference0 = lexicalEnvironment0.getIdentifierReference((ExecutionContext) null, "org.dynjs.runtime.Completion", true);
      DereferencedReference dereferencedReference0 = new DereferencedReference(reference0, (Object) null);
      Reference reference1 = dereferencedReference0.getReference();
      assertEquals("org.dynjs.runtime.Completion", reference1.getReferencedName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Reference reference0 = new Reference("", "", true);
      DereferencedReference dereferencedReference0 = new DereferencedReference(reference0, (Object) null);
      Reference reference1 = dereferencedReference0.getReference();
      assertTrue(reference1.isStrictReference());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Reference reference0 = new Reference((String) null, (Object) null, true);
      DereferencedReference dereferencedReference0 = new DereferencedReference(reference0, reference0);
      // Undeclared exception!
      try { 
        dereferencedReference0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dynjs.runtime.Reference", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DereferencedReference dereferencedReference0 = new DereferencedReference((Reference) null, (Object) null);
      Object object0 = dereferencedReference0.getValue();
      assertNull(object0);
  }
}
