/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 14:41:41 GMT 2022
 */

package net.spy.memcached.protocol.ascii;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import net.spy.memcached.ops.MultiGetOperationCallback;
import net.spy.memcached.ops.MultiGetsOperationCallback;
import net.spy.memcached.ops.MultiReplicaGetOperationCallback;
import net.spy.memcached.ops.OperationCallback;
import net.spy.memcached.protocol.ascii.DeleteOperationImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DeleteOperationImpl_ESTest extends DeleteOperationImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeleteOperationImpl deleteOperationImpl0 = new DeleteOperationImpl((String) null, (OperationCallback) null);
      // Undeclared exception!
      try { 
        deleteOperationImpl0.initialize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.spy.memcached.KeyUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeleteOperationImpl deleteOperationImpl0 = new DeleteOperationImpl((String) null, (OperationCallback) null);
      // Undeclared exception!
      try { 
        deleteOperationImpl0.handleLine((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.spy.memcached.protocol.ascii.OperationImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(operationCallback0, (-494));
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(multiGetOperationCallback0, 0);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetsOperationCallback0, (-494));
      DeleteOperationImpl deleteOperationImpl0 = new DeleteOperationImpl("", multiReplicaGetOperationCallback0);
      Collection<String> collection0 = deleteOperationImpl0.getKeys();
      assertTrue(collection0.contains(""));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(operationCallback0, (-494));
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(multiGetOperationCallback0, 0);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetsOperationCallback0, (-494));
      DeleteOperationImpl deleteOperationImpl0 = new DeleteOperationImpl("", multiReplicaGetOperationCallback0);
      String string0 = deleteOperationImpl0.toString();
      assertEquals("Cmd: delete Key: ", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(operationCallback0, (-494));
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(multiGetOperationCallback0, 0);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetsOperationCallback0, (-494));
      DeleteOperationImpl deleteOperationImpl0 = new DeleteOperationImpl("", multiReplicaGetOperationCallback0);
      deleteOperationImpl0.handleLine("qj");
      assertFalse(deleteOperationImpl0.isTimedOut());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DeleteOperationImpl deleteOperationImpl0 = new DeleteOperationImpl("},gph", (OperationCallback) null);
      deleteOperationImpl0.initialize();
      assertEquals(0L, deleteOperationImpl0.getWriteCompleteTimestamp());
  }
}
