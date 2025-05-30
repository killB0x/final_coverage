/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 13:59:31 GMT 2022
 */

package org.mk300.marshal.minimum.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.atomic.AtomicStampedReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mk300.marshal.minimum.handler.AtomicStampedReferenceHandler;
import org.mk300.marshal.minimum.io.OInput;
import org.mk300.marshal.minimum.io.OInputImpl;
import org.mk300.marshal.minimum.io.OOutput;
import org.mk300.marshal.minimum.io.OOutputImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AtomicStampedReferenceHandler_ESTest extends AtomicStampedReferenceHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AtomicStampedReferenceHandler atomicStampedReferenceHandler0 = new AtomicStampedReferenceHandler();
      OOutputImpl oOutputImpl0 = new OOutputImpl(2055);
      AtomicStampedReference<Object> atomicStampedReference0 = new AtomicStampedReference<Object>(atomicStampedReferenceHandler0, 2055);
      // Undeclared exception!
      try { 
        atomicStampedReferenceHandler0.writeObject((OOutput) oOutputImpl0, (AtomicStampedReference) atomicStampedReference0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.mk300.marshal.minimum.registry.HandlerRegistry
         //
         verifyException("org.mk300.marshal.minimum.io.OOutputImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AtomicStampedReferenceHandler atomicStampedReferenceHandler0 = new AtomicStampedReferenceHandler();
      Class<AtomicStampedReference> class0 = AtomicStampedReference.class;
      // Undeclared exception!
      try { 
        atomicStampedReferenceHandler0.readObject((OInput) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mk300.marshal.minimum.handler.AtomicStampedReferenceHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AtomicStampedReferenceHandler atomicStampedReferenceHandler0 = new AtomicStampedReferenceHandler();
      byte[] byteArray0 = new byte[4];
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<AtomicStampedReference> class0 = AtomicStampedReference.class;
      // Undeclared exception!
      try { 
        atomicStampedReferenceHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.mk300.marshal.minimum.registry.HandlerRegistry
         //
         verifyException("org.mk300.marshal.minimum.io.OInputImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AtomicStampedReferenceHandler atomicStampedReferenceHandler0 = new AtomicStampedReferenceHandler();
      // Undeclared exception!
      try { 
        atomicStampedReferenceHandler0.writeObject((OOutput) null, (AtomicStampedReference) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mk300.marshal.minimum.handler.AtomicStampedReferenceHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AtomicStampedReferenceHandler atomicStampedReferenceHandler0 = new AtomicStampedReferenceHandler();
      byte[] byteArray0 = new byte[0];
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<AtomicStampedReference> class0 = AtomicStampedReference.class;
      // Undeclared exception!
      try { 
        atomicStampedReferenceHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.mk300.marshal.minimum.io.OInputImpl", e);
      }
  }
}
