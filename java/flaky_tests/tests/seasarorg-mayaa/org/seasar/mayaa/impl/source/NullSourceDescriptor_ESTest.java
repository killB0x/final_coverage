/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 02:32:06 GMT 2022
 */

package org.seasar.mayaa.impl.source;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.seasar.mayaa.impl.source.NullSourceDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NullSourceDescriptor_ESTest extends NullSourceDescriptor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullSourceDescriptor nullSourceDescriptor0 = new NullSourceDescriptor();
      String string0 = nullSourceDescriptor0.getSystemID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NullSourceDescriptor nullSourceDescriptor0 = new NullSourceDescriptor();
      nullSourceDescriptor0.setSystemID((String) null);
      assertEquals("", nullSourceDescriptor0.getSystemID());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NullSourceDescriptor nullSourceDescriptor0 = new NullSourceDescriptor();
      boolean boolean0 = nullSourceDescriptor0.exists();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NullSourceDescriptor nullSourceDescriptor0 = new NullSourceDescriptor();
      InputStream inputStream0 = nullSourceDescriptor0.getInputStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NullSourceDescriptor nullSourceDescriptor0 = NullSourceDescriptor.getInstance();
      Date date0 = nullSourceDescriptor0.getTimestamp();
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }
}
