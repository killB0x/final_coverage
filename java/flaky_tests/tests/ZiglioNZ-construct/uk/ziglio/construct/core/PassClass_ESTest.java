/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 22:21:34 GMT 2022
 */

package uk.ziglio.construct.core;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ziglio.construct.core.Construct;
import uk.ziglio.construct.core.PassClass;
import uk.ziglio.construct.lib.ByteBufferWrapper;
import uk.ziglio.construct.lib.Containers;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PassClass_ESTest extends PassClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PassClass passClass0 = PassClass.getInstance();
      Integer[] integerArray0 = new Integer[4];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1932);
      passClass0._build(containers_Container0, byteArrayOutputStream0, containers_Container0);
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PassClass.getInstance();
      PassClass passClass0 = PassClass.getInstance();
      assertEquals(2, Construct.FLAG_DYNAMIC);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PassClass passClass0 = PassClass.getInstance();
      Integer[] integerArray0 = new Integer[4];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      ByteBufferWrapper byteBufferWrapper0 = new ByteBufferWrapper();
      Object object0 = passClass0._parse(byteBufferWrapper0, containers_Container0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PassClass passClass0 = PassClass.getInstance();
      assertNotNull(passClass0);
      
      Integer[] integerArray0 = new Integer[4];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      int int0 = passClass0._sizeof(containers_Container0);
      assertEquals(0, int0);
  }
}
