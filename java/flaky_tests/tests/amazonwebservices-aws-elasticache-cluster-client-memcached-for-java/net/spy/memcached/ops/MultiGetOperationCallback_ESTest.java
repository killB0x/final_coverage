/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 14:57:18 GMT 2022
 */

package net.spy.memcached.ops;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.spy.memcached.ops.MultiGetOperationCallback;
import net.spy.memcached.ops.OperationCallback;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultiGetOperationCallback_ESTest extends MultiGetOperationCallback_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(operationCallback0, 2748);
      // Undeclared exception!
      try { 
        multiGetOperationCallback0.gotData("I4]", 2748, (byte[]) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.spy.memcached.ops.OperationCallback$MockitoMock$1764417071 cannot be cast to class net.spy.memcached.ops.GetOperation$Callback (net.spy.memcached.ops.OperationCallback$MockitoMock$1764417071 and net.spy.memcached.ops.GetOperation$Callback are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @434deb6d)
         //
         verifyException("net.spy.memcached.ops.MultiGetOperationCallback", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback((OperationCallback) null, 21);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        multiGetOperationCallback0.gotData("net.spy.memcached.ops.MultiGetOperationCallback", 21, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.spy.memcached.ops.MultiGetOperationCallback", e);
      }
  }
}
