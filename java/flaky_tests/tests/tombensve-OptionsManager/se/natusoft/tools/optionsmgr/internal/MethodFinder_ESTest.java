/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 15:01:02 GMT 2022
 */

package se.natusoft.tools.optionsmgr.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import se.natusoft.tools.optionsmgr.internal.MethodFinder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MethodFinder_ESTest extends MethodFinder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      MethodFinder.MethodDesc methodFinder_MethodDesc0 = new MethodFinder.MethodDesc("]", classArray0);
      // Undeclared exception!
      try { 
        methodFinder_MethodDesc0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.natusoft.tools.optionsmgr.internal.MethodFinder$MethodDesc", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        MethodFinder.findMethod(class0, (MethodFinder.MethodDesc[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.natusoft.tools.optionsmgr.internal.MethodFinder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      MethodFinder.MethodDesc methodFinder_MethodDesc0 = new MethodFinder.MethodDesc("", classArray0);
      Class[] classArray1 = methodFinder_MethodDesc0.getArgTypes();
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      MethodFinder.MethodDesc methodFinder_MethodDesc0 = new MethodFinder.MethodDesc("", classArray0);
      String string0 = methodFinder_MethodDesc0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      MethodFinder.MethodDesc methodFinder_MethodDesc0 = new MethodFinder.MethodDesc("", classArray0);
      String string0 = methodFinder_MethodDesc0.toString();
      assertEquals("name='', argTypes=[]", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 9);
      Class<Object> class0 = Object.class;
      MethodFinder.MethodDesc[] methodFinder_MethodDescArray0 = new MethodFinder.MethodDesc[1];
      MethodFinder.MethodDesc methodFinder_MethodDesc0 = new MethodFinder.MethodDesc("v`-U", classArray0);
      methodFinder_MethodDescArray0[0] = methodFinder_MethodDesc0;
      try { 
        MethodFinder.findMethod(class0, methodFinder_MethodDescArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // None of the tested methods were found!
         //
         verifyException("se.natusoft.tools.optionsmgr.internal.MethodFinder", e);
      }
  }
}
