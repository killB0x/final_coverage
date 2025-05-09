/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 14:04:48 GMT 2022
 */

package net.spy.memcached.protocol.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.spy.memcached.ops.MultiGetOperationCallback;
import net.spy.memcached.ops.MultiGetsOperationCallback;
import net.spy.memcached.ops.MultiReplicaGetOperationCallback;
import net.spy.memcached.ops.Mutator;
import net.spy.memcached.ops.OperationCallback;
import net.spy.memcached.protocol.binary.MutatorOperationImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MutatorOperationImpl_ESTest extends MutatorOperationImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(operationCallback0, 702);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetsOperationCallback0, (-127));
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(multiReplicaGetOperationCallback0, (-1175));
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "Couldn't find node connected to ", 2591L, 1L, 702, multiGetOperationCallback0);
      byte[] byteArray0 = new byte[8];
      mutatorOperationImpl0.decodePayload(byteArray0);
      assertEquals(702, mutatorOperationImpl0.getExpiration());
      assertEquals(1L, mutatorOperationImpl0.getDefault());
      assertEquals(2591L, mutatorOperationImpl0.getBy());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(operationCallback0, 0);
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(multiGetsOperationCallback0, 1000);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetOperationCallback0, 1041);
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "", 0L, 0L, 654, multiReplicaGetOperationCallback0);
      mutatorOperationImpl0.getType();
      assertEquals(654, mutatorOperationImpl0.getExpiration());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(operationCallback0, 0);
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(multiGetsOperationCallback0, 1000);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetOperationCallback0, 1041);
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "", 0L, 0L, 654, multiReplicaGetOperationCallback0);
      int int0 = mutatorOperationImpl0.getExpiration();
      assertEquals(654, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Mutator mutator0 = Mutator.decr;
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(operationCallback0, (-1437));
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(multiGetsOperationCallback0, (-1586));
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetOperationCallback0, (-1437));
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "PjZvPV", 2585L, 0L, (-1591), multiReplicaGetOperationCallback0);
      int int0 = mutatorOperationImpl0.getExpiration();
      assertEquals(2585L, mutatorOperationImpl0.getBy());
      assertEquals((-1591), int0);
      assertEquals(0L, mutatorOperationImpl0.getDefault());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "", 4096, 4096, 4096, (OperationCallback) null);
      long long0 = mutatorOperationImpl0.getDefault();
      assertEquals(4096, mutatorOperationImpl0.getExpiration());
      assertEquals(4096L, long0);
      assertEquals(4096L, mutatorOperationImpl0.getBy());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(operationCallback0, 702);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetsOperationCallback0, (-127));
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(multiReplicaGetOperationCallback0, (-1175));
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "Couldn't find node connected to ", 2591L, 1L, 702, multiGetOperationCallback0);
      long long0 = mutatorOperationImpl0.getBy();
      assertEquals(2591L, long0);
      assertEquals(1L, mutatorOperationImpl0.getDefault());
      assertEquals(702, mutatorOperationImpl0.getExpiration());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(operationCallback0, 0);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetsOperationCallback0, 580);
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(multiReplicaGetOperationCallback0, 580);
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "<r4F,VO&FdpfE8B~Z", (-699L), 5000L, 56, multiGetOperationCallback0);
      long long0 = mutatorOperationImpl0.getBy();
      assertEquals(56, mutatorOperationImpl0.getExpiration());
      assertEquals(5000L, mutatorOperationImpl0.getDefault());
      assertEquals((-699L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, (String) null, 4075, 4075, 4075, (OperationCallback) null);
      // Undeclared exception!
      try { 
        mutatorOperationImpl0.initialize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.spy.memcached.KeyUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Mutator mutator0 = Mutator.decr;
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "}[vL+})tL", 0, 0, 0, (OperationCallback) null);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        mutatorOperationImpl0.decodePayload(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.spy.memcached.protocol.binary.OperationImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Mutator mutator0 = Mutator.decr;
      MutatorOperationImpl mutatorOperationImpl0 = null;
      try {
        mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "?", (-17), (-17), (-17), (OperationCallback) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Default value is below zero
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(operationCallback0, 0);
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(multiGetsOperationCallback0, 1000);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetOperationCallback0, 1041);
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "", 0L, 0L, 654, multiReplicaGetOperationCallback0);
      mutatorOperationImpl0.getDefault();
      assertEquals(654, mutatorOperationImpl0.getExpiration());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Mutator mutator0 = Mutator.incr;
      OperationCallback operationCallback0 = mock(OperationCallback.class, new ViolatedAssumptionAnswer());
      MultiGetsOperationCallback multiGetsOperationCallback0 = new MultiGetsOperationCallback(operationCallback0, 0);
      MultiReplicaGetOperationCallback multiReplicaGetOperationCallback0 = new MultiReplicaGetOperationCallback(multiGetsOperationCallback0, 580);
      MultiGetOperationCallback multiGetOperationCallback0 = new MultiGetOperationCallback(multiReplicaGetOperationCallback0, 580);
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "<r4F,VO&FdpfE8B~Z", (-699L), 5000L, 56, multiGetOperationCallback0);
      String string0 = mutatorOperationImpl0.toString();
      assertEquals("Cmd: 5 Opaque: 277 Key: <r4F,VO&FdpfE8B~Z Amount: -699 Default: 5000 Exp: 56", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mutator mutator0 = Mutator.decr;
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "-%4so(vBB-o}~", 0, 0, 0, (OperationCallback) null);
      mutatorOperationImpl0.getBy();
      assertEquals(0, mutatorOperationImpl0.getExpiration());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Mutator mutator0 = Mutator.decr;
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "-%4so(vBB-o}~", 0, 0, 0, (OperationCallback) null);
      int int0 = mutatorOperationImpl0.getExpiration();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Mutator mutator0 = Mutator.decr;
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "}[vL+})tL", 0, 0, 0, (OperationCallback) null);
      // Undeclared exception!
      try { 
        mutatorOperationImpl0.decodePayload((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.spy.memcached.protocol.binary.OperationImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl((Mutator) null, "niw<CsNxgL(I", 833L, 833L, 0, (OperationCallback) null);
      mutatorOperationImpl0.getType();
      assertEquals(833L, mutatorOperationImpl0.getBy());
      assertEquals(833L, mutatorOperationImpl0.getDefault());
      assertEquals(0, mutatorOperationImpl0.getExpiration());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Mutator mutator0 = Mutator.decr;
      MutatorOperationImpl mutatorOperationImpl0 = new MutatorOperationImpl(mutator0, "-%4so(vBB-o}~", 0, 0, 0, (OperationCallback) null);
      mutatorOperationImpl0.initialize();
      assertEquals(0, mutatorOperationImpl0.getExpiration());
  }
}
