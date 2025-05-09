/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 02:18:46 GMT 2022
 */

package org.jomni;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jomni.JomniBuilder;
import org.jomni.JomniMapper;
import org.jomni.TypeConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JomniBuilder_ESTest extends JomniBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JomniBuilder jomniBuilder0 = new JomniBuilder();
      jomniBuilder0.convertersOverride = null;
      // Undeclared exception!
      try { 
        jomniBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jomni.JomniMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JomniBuilder jomniBuilder0 = new JomniBuilder();
      Class<Integer> class0 = Integer.class;
      jomniBuilder0.convertersOverride = null;
      // Undeclared exception!
      try { 
        jomniBuilder0.addTypeConverter(class0, class0, (TypeConverter<Integer, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jomni.JomniBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JomniBuilder jomniBuilder0 = new JomniBuilder();
      JomniMapper jomniMapper0 = jomniBuilder0.build();
      assertNotNull(jomniMapper0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JomniBuilder jomniBuilder0 = new JomniBuilder();
      TypeConverter<Integer, Integer> typeConverter0 = (TypeConverter<Integer, Integer>) mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      Class<Integer> class0 = Integer.class;
      jomniBuilder0.addTypeConverter(class0, (Class<Integer>) null, typeConverter0);
  }
}
