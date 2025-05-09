/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 21:03:15 GMT 2022
 */

package com.hubspot.jinjava.lib.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.filter.LengthFilter;
import com.hubspot.jinjava.objects.SafeString;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LengthFilter_ESTest extends LengthFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LengthFilter lengthFilter0 = new LengthFilter();
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException();
      SQLException sQLException0 = new SQLException("7:XL", "7:XL", sQLNonTransientConnectionException0);
      sQLNonTransientConnectionException0.initCause(sQLException0);
      // Undeclared exception!
      lengthFilter0.filter((Object) sQLNonTransientConnectionException0, (JinjavaInterpreter) null, (String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LengthFilter lengthFilter0 = new LengthFilter();
      Object object0 = lengthFilter0.filter((Object) lengthFilter0, (JinjavaInterpreter) null, (String[]) null);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LengthFilter lengthFilter0 = new LengthFilter();
      String[] stringArray0 = new String[5];
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException("No random number generator with strategy ", "Rendering cycle detected: '", (Throwable) null);
      Object object0 = lengthFilter0.filter((Object) sQLNonTransientConnectionException0, (JinjavaInterpreter) null, stringArray0);
      assertEquals(1, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LengthFilter lengthFilter0 = new LengthFilter();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = lengthFilter0.filter((Object) hashMap0, (JinjavaInterpreter) null, (String[]) null);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LengthFilter lengthFilter0 = new LengthFilter();
      Object object0 = lengthFilter0.filter((Object) null, (JinjavaInterpreter) null, (String[]) null);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LengthFilter lengthFilter0 = new LengthFilter();
      SafeString safeString0 = new SafeString("'&>F/>`b$3*n;oq1");
      String[] stringArray0 = new String[5];
      Object object0 = lengthFilter0.filter(safeString0, (JinjavaInterpreter) null, stringArray0);
      assertEquals(16, object0);
      assertFalse(lengthFilter0.preserveSafeString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LengthFilter lengthFilter0 = new LengthFilter();
      boolean boolean0 = lengthFilter0.preserveSafeString();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LengthFilter lengthFilter0 = new LengthFilter();
      String string0 = lengthFilter0.getName();
      assertEquals("length", string0);
  }
}
