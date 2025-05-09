/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 18:45:15 GMT 2022
 */

package com.inspiring.pugtsdb.repository.h2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.inspiring.pugtsdb.repository.h2.H2Repositories;
import com.inspiring.pugtsdb.repository.h2.TagH2Repository;
import com.inspiring.pugtsdb.sql.PugConnection;
import com.inspiring.pugtsdb.util.DummySqlConnection;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class H2Repository_ESTest extends H2Repository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DummySqlConnection dummySqlConnection0 = new DummySqlConnection();
      PugConnection pugConnection0 = new PugConnection(dummySqlConnection0);
      Supplier<PugConnection> supplier0 = (Supplier<PugConnection>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(pugConnection0).when(supplier0).get();
      TagH2Repository tagH2Repository0 = new TagH2Repository(supplier0);
      PugConnection pugConnection1 = tagH2Repository0.getConnection();
      assertSame(pugConnection0, pugConnection1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TagH2Repository tagH2Repository0 = new TagH2Repository((Supplier<PugConnection>) null);
      // Undeclared exception!
      try { 
        tagH2Repository0.getConnection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.inspiring.pugtsdb.repository.h2.H2Repository", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Supplier<PugConnection> supplier0 = (Supplier<PugConnection>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      TagH2Repository tagH2Repository0 = new TagH2Repository(supplier0);
      PugConnection pugConnection0 = tagH2Repository0.getConnection();
      assertNull(pugConnection0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      H2Repositories h2Repositories0 = new H2Repositories();
      Supplier<PugConnection> supplier0 = (Supplier<PugConnection>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      h2Repositories0.setConnectionSupplier(supplier0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TagH2Repository tagH2Repository0 = new TagH2Repository();
      tagH2Repository0.setConnectionSupplier((Supplier<PugConnection>) null);
  }
}
