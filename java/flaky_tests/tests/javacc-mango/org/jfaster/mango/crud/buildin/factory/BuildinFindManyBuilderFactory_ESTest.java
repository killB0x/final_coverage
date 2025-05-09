/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:39:07 GMT 2022
 */

package org.jfaster.mango.crud.buildin.factory;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Type;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.crud.CrudMeta;
import org.jfaster.mango.crud.buildin.factory.BuildinFindManyBuilderFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BuildinFindManyBuilderFactory_ESTest extends BuildinFindManyBuilderFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuildinFindManyBuilderFactory buildinFindManyBuilderFactory0 = new BuildinFindManyBuilderFactory();
      String string0 = buildinFindManyBuilderFactory0.expectedMethodName();
      assertEquals("findMany", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuildinFindManyBuilderFactory buildinFindManyBuilderFactory0 = new BuildinFindManyBuilderFactory();
      Class<Integer> class0 = Integer.class;
      CrudMeta crudMeta0 = new CrudMeta(class0);
      // Undeclared exception!
      try { 
        buildinFindManyBuilderFactory0.createInternalBuilder(crudMeta0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // error column id [null]
         //
         verifyException("org.jfaster.mango.crud.buildin.builder.BuildinGetBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuildinFindManyBuilderFactory buildinFindManyBuilderFactory0 = new BuildinFindManyBuilderFactory();
      // Undeclared exception!
      try { 
        buildinFindManyBuilderFactory0.createInternalBuilder((CrudMeta) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.crud.buildin.factory.BuildinFindManyBuilderFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BuildinFindManyBuilderFactory buildinFindManyBuilderFactory0 = new BuildinFindManyBuilderFactory();
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      List<Type> list0 = buildinFindManyBuilderFactory0.expectedParameterType(class0, class1);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BuildinFindManyBuilderFactory buildinFindManyBuilderFactory0 = new BuildinFindManyBuilderFactory();
      Class<Object> class0 = Object.class;
      Type type0 = buildinFindManyBuilderFactory0.expectedReturnType(class0);
      assertNotNull(type0);
  }
}
