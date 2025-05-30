/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 17:08:38 GMT 2022
 */

package com.github.relayjdbc.parameters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.relayjdbc.parameters.RefParameter;
import com.github.relayjdbc.serial.SerialRef;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.sql.PreparedStatement;
import java.sql.Ref;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RefParameter_ESTest extends RefParameter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RefParameter refParameter0 = new RefParameter();
      // Undeclared exception!
      try { 
        refParameter0.setParameter((PreparedStatement) null, (-1249));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.parameters.RefParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RefParameter refParameter0 = new RefParameter();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      refParameter0.setParameter(preparedStatement0, 13);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RefParameter refParameter0 = new RefParameter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      refParameter0.writeExternal(objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RefParameter refParameter0 = new RefParameter();
      SerialRef serialRef0 = refParameter0.getValue();
      assertNull(serialRef0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RefParameter refParameter0 = null;
      try {
        refParameter0 = new RefParameter((Ref) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.serial.SerialRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RefParameter refParameter0 = new RefParameter();
      String string0 = refParameter0.toString();
      assertEquals("Ref: null", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RefParameter refParameter0 = new RefParameter();
      // Undeclared exception!
      try { 
        refParameter0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.parameters.RefParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RefParameter refParameter0 = new RefParameter((SerialRef) null);
      // Undeclared exception!
      try { 
        refParameter0.writeExternal((ObjectOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.parameters.RefParameter", e);
      }
  }
}
