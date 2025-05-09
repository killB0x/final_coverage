/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:08:20 GMT 2022
 */

package net.named_data.jndn.security.pib.detail;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import net.named_data.jndn.Name;
import net.named_data.jndn.security.pib.PibImpl;
import net.named_data.jndn.security.pib.PibMemory;
import net.named_data.jndn.security.pib.detail.PibKeyImpl;
import net.named_data.jndn.security.v2.CertificateV2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PibKeyImpl_ESTest extends PibKeyImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Name.Component[] name_ComponentArray0 = new Name.Component[7];
      byte[] byteArray0 = new byte[2];
      Name.Component name_Component0 = CertificateV2.KEY_COMPONENT;
      name_ComponentArray0[4] = name_Component0;
      name_ComponentArray0[5] = name_ComponentArray0[4];
      Name name0 = new Name(name_ComponentArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, byteBuffer0, pibMemory0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid key encoding
         //
         verifyException("net.named_data.jndn.security.pib.detail.PibKeyImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Name.Component name_Component0 = CertificateV2.KEY_COMPONENT;
      Name.Component[] name_ComponentArray0 = new Name.Component[3];
      name_ComponentArray0[0] = name_Component0;
      name_ComponentArray0[1] = name_Component0;
      name_ComponentArray0[2] = name_Component0;
      Name name0 = new Name(name_ComponentArray0);
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, pibMemory0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Key `/KEY/KEY/KEY` not found
         //
         verifyException("net.named_data.jndn.security.pib.PibMemory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Name name0 = new Name();
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, pibMemory0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key name `/` does not follow the naming conventions
         //
         verifyException("net.named_data.jndn.security.pib.PibKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) pibMemory0);
      Name name0 = new Name(arrayList0);
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, pibMemory0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.named_data.jndn.security.pib.PibMemory cannot be cast to class net.named_data.jndn.Name$Component (net.named_data.jndn.security.pib.PibMemory and net.named_data.jndn.Name$Component are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4666df7)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Name.Component name_Component0 = CertificateV2.KEY_COMPONENT;
      Name.Component[] name_ComponentArray0 = new Name.Component[3];
      name_ComponentArray0[1] = name_Component0;
      Name name0 = new Name(name_ComponentArray0);
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, (PibImpl) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // The pibImpl is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Name.Component name_Component0 = CertificateV2.KEY_COMPONENT;
      Name.Component[] name_ComponentArray0 = new Name.Component[3];
      name_ComponentArray0[1] = name_Component0;
      Name name0 = new Name(name_ComponentArray0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, byteBuffer0, pibMemory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Name.Component name_Component0 = CertificateV2.KEY_COMPONENT;
      Name.Component[] name_ComponentArray0 = new Name.Component[3];
      name_ComponentArray0[1] = name_Component0;
      Name name0 = new Name(name_ComponentArray0);
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, (ByteBuffer) null, (PibImpl) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // The pibImpl is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Name.Component name_Component0 = CertificateV2.KEY_COMPONENT;
      Name.Component[] name_ComponentArray0 = new Name.Component[3];
      name_ComponentArray0[1] = name_Component0;
      Name name0 = new Name(name_ComponentArray0);
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, pibMemory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Name.Component name_Component0 = CertificateV2.KEY_COMPONENT;
      Name.Component[] name_ComponentArray0 = new Name.Component[3];
      name_ComponentArray0[1] = name_Component0;
      Name name0 = new Name(name_ComponentArray0);
      PibKeyImpl pibKeyImpl0 = null;
      try {
        pibKeyImpl0 = new PibKeyImpl(name0, (ByteBuffer) null, pibMemory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.encoding.der.DerNode", e);
      }
  }
}
