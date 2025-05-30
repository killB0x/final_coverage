/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 12:31:55 GMT 2022
 */

package es.bsc.dataclay.dbhandler.sql.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.dbhandler.sql.common.SQLArray;
import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SQLArray_ESTest extends SQLArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray((String) null);
      String string0 = sQLArray0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("ud");
      String string0 = sQLArray0.toString();
      assertEquals("ud", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "varchar";
      objectArray0[1] = (Object) "varchar";
      objectArray0[2] = (Object) "varchar";
      objectArray0[3] = (Object) "varchar";
      objectArray0[4] = (Object) "varchar";
      objectArray0[5] = (Object) "varchar";
      objectArray0[6] = (Object) "varchar";
      objectArray0[7] = (Object) "varchar";
      objectArray0[8] = objectArray0[5];
      SQLArray sQLArray0 = new SQLArray("varchar", objectArray0);
      String string0 = sQLArray0.getBaseTypeName();
      assertEquals("varchar", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("\u0001");
      String string0 = sQLArray0.getBaseTypeName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("uuio");
      // Undeclared exception!
      try { 
        sQLArray0.getBaseTypeName();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("uuio");
      // Undeclared exception!
      try { 
        sQLArray0.getArray();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      SQLArray sQLArray0 = null;
      try {
        sQLArray0 = new SQLArray("varchar", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("uui\u0001java.lang.String@000000001\u0001");
      try { 
        sQLArray0.getArray();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Unsupported
         //
         verifyException("es.bsc.dataclay.dbhandler.sql.common.SQLArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "varchar";
      objectArray0[1] = (Object) "varchar";
      objectArray0[2] = (Object) "varchar";
      objectArray0[3] = (Object) "varchar";
      objectArray0[4] = (Object) "varchar";
      objectArray0[5] = (Object) "varchar";
      objectArray0[6] = (Object) "varchar";
      objectArray0[7] = (Object) "varchar";
      objectArray0[8] = objectArray0[3];
      SQLArray sQLArray0 = new SQLArray("varchar", objectArray0);
      Object object0 = sQLArray0.getArray();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("\u0001");
      Object object0 = sQLArray0.getArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("uuid", (Object[]) null);
      Object object0 = sQLArray0.getArray();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      SQLArray sQLArray0 = new SQLArray("varchar", objectArray0);
      Object object0 = sQLArray0.getArray();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("null");
      // Undeclared exception!
      try { 
        sQLArray0.getBaseTypeName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.dbhandler.sql.common.SQLArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray((String) null);
      Object object0 = sQLArray0.getArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      SQLArray sQLArray0 = null;
      try {
        sQLArray0 = new SQLArray("45T3mmH)=D", objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported
         //
         verifyException("es.bsc.dataclay.dbhandler.sql.common.SQLArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "varchar";
      objectArray0[1] = (Object) "varchar";
      objectArray0[2] = (Object) "varchar";
      objectArray0[3] = (Object) "varchar";
      objectArray0[4] = (Object) "varchar";
      objectArray0[5] = (Object) "varchar";
      objectArray0[6] = (Object) "varchar";
      objectArray0[7] = (Object) "varchar";
      objectArray0[8] = objectArray0[6];
      SQLArray sQLArray0 = new SQLArray("varchar", objectArray0);
      try { 
        sQLArray0.getResultSet();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Unsupported
         //
         verifyException("es.bsc.dataclay.dbhandler.sql.common.SQLArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("uuid", (Object[]) null);
      try { 
        sQLArray0.free();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Unsupported
         //
         verifyException("es.bsc.dataclay.dbhandler.sql.common.SQLArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "varchar";
      objectArray0[1] = (Object) "varchar";
      objectArray0[2] = (Object) "varchar";
      objectArray0[3] = (Object) "varchar";
      objectArray0[4] = (Object) "varchar";
      objectArray0[5] = (Object) "varchar";
      objectArray0[6] = (Object) "varchar";
      objectArray0[7] = (Object) "varchar";
      objectArray0[8] = objectArray0[6];
      SQLArray sQLArray0 = new SQLArray("varchar", objectArray0);
      try { 
        sQLArray0.getArray((-4189L), (-826));
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Unsupported
         //
         verifyException("es.bsc.dataclay.dbhandler.sql.common.SQLArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("eZItDChkKov");
      try { 
        sQLArray0.getResultSet((-2792L), 3649);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Unsupported
         //
         verifyException("es.bsc.dataclay.dbhandler.sql.common.SQLArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      SQLArray sQLArray0 = new SQLArray("varchar", objectArray0);
      try { 
        sQLArray0.getBaseType();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Unsupported
         //
         verifyException("es.bsc.dataclay.dbhandler.sql.common.SQLArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "uuid";
      objectArray0[1] = (Object) "uuid";
      objectArray0[2] = (Object) "uuid";
      objectArray0[3] = (Object) "uuid";
      objectArray0[4] = (Object) "uuid";
      objectArray0[5] = (Object) "uuid";
      objectArray0[6] = (Object) "uuid";
      SQLArray sQLArray0 = new SQLArray("uuid", objectArray0);
      Object object0 = sQLArray0.getArray();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SQLArray sQLArray0 = new SQLArray("");
      String string0 = sQLArray0.toString();
      assertEquals("", string0);
  }
}
