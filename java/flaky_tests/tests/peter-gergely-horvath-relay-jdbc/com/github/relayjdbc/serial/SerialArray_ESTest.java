/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 15:57:13 GMT 2022
 */

package com.github.relayjdbc.serial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.relayjdbc.serial.SerialArray;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.sql.rowset.serial.SerialException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SerialArray_ESTest extends SerialArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray(3712, "ow4q", (Object) null);
      SerialArray serialArray1 = new SerialArray(serialArray0);
      assertEquals(3712, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("^19rEI'VD7*");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      serialArray0.writeExternal(objectOutputStream0);
      assertNull(serialArray0.getBaseTypeName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray();
      String string0 = serialArray0.getBaseTypeName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      SerialArray serialArray0 = new SerialArray("clob", objectArray0);
      serialArray0.getBaseTypeName();
      assertEquals(2005, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      SerialArray serialArray0 = new SerialArray("", objectArray0);
      serialArray0.getBaseTypeName();
      assertEquals(0, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray();
      int int0 = serialArray0.getBaseType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      SerialArray serialArray0 = new SerialArray("smallint", objectArray0);
      int int0 = serialArray0.getBaseType();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      SerialArray serialArray0 = new SerialArray((-1844176926), "3d", objectArray0[0]);
      int int0 = serialArray0.getBaseType();
      assertEquals((-1844176926), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray();
      Object object0 = serialArray0.getArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      SerialArray serialArray0 = new SerialArray("", objectArray0);
      serialArray0.getArray();
      assertEquals(0, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      SerialArray serialArray0 = new SerialArray((-3), "ref", object0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("ref");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      try { 
        serialArray0.writeExternal(objectOutputStream0);
        fail("Expecting exception: NotSerializableException");
      
      } catch(NotSerializableException e) {
         //
         // java.lang.Object
         //
         verifyException("java.io.ObjectOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "struct";
      SerialArray serialArray0 = new SerialArray("struct", objectArray0);
      SerialArray serialArray1 = null;
      try {
        serialArray1 = new SerialArray(serialArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.sql.Struct (java.lang.String is in module java.base of loader 'bootstrap'; java.sql.Struct is in module java.sql of loader 'platform')
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      SerialArray serialArray0 = new SerialArray("clob", objectArray0);
      serialArray0.free();
      assertEquals(2005, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      SerialArray serialArray0 = new SerialArray("QaX", objectArray0);
      javax.sql.rowset.serial.SerialArray serialArray1 = new javax.sql.rowset.serial.SerialArray(serialArray0);
      SerialArray serialArray2 = new SerialArray(serialArray1);
      SerialArray serialArray3 = null;
      try {
        serialArray3 = new SerialArray(serialArray1);
        fail("Expecting exception: SerialException");
      
      } catch(Throwable e) {
         //
         // Error: You cannot call a method on a SerialArray instance once free() has been called.
         //
         verifyException("javax.sql.rowset.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("varbinary", (Object[]) null);
      assertEquals((-3), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      SerialArray serialArray0 = new SerialArray("tinyint", objectArray0);
      assertEquals((-6), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      SerialArray serialArray0 = new SerialArray("timestamp", objectArray0);
      assertEquals(93, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      SerialArray serialArray0 = new SerialArray("time", objectArray0);
      assertEquals(92, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("sqlxml", (Object[]) null);
      assertEquals(2009, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("rowid", (Object[]) null);
      assertEquals((-8), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("ref", (Object[]) null);
      assertEquals(2006, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      SerialArray serialArray0 = new SerialArray("real", objectArray0);
      assertEquals(7, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("other", (Object[]) null);
      assertEquals(1111, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      SerialArray serialArray0 = new SerialArray("nvarchar", objectArray0);
      assertEquals((-9), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      SerialArray serialArray0 = new SerialArray("numeric", objectArray0);
      assertEquals(2, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("null", (Object[]) null);
      assertEquals(0, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("nchar", (Object[]) null);
      assertEquals((-15), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("longvarchar", (Object[]) null);
      assertEquals((-1), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("longvarbinary", (Object[]) null);
      assertEquals((-4), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("longnvarchar", (Object[]) null);
      assertEquals((-16), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      SerialArray serialArray0 = new SerialArray("java_object", objectArray0);
      assertEquals(2000, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("integer", (Object[]) null);
      assertEquals(4, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("float", (Object[]) null);
      assertEquals(6, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      SerialArray serialArray0 = new SerialArray("distinct", objectArray0);
      assertEquals(2001, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("decimal", (Object[]) null);
      assertEquals(3, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      SerialArray serialArray0 = new SerialArray("date", objectArray0);
      assertEquals(91, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("datalink", (Object[]) null);
      assertEquals(70, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("char", (Object[]) null);
      assertEquals(1, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      SerialArray serialArray0 = new SerialArray("boolean", objectArray0);
      assertEquals(16, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      SerialArray serialArray0 = new SerialArray("blob", objectArray0);
      assertEquals(2004, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("bit", (Object[]) null);
      assertEquals((-7), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      SerialArray serialArray0 = new SerialArray("binary", objectArray0);
      assertEquals((-2), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      SerialArray serialArray0 = new SerialArray("bigint", objectArray0);
      assertEquals((-5), serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray("array", (Object[]) null);
      assertEquals(2003, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      SerialArray serialArray0 = new SerialArray("smallint", objectArray0);
      HashMap<javax.sql.rowset.serial.SerialStruct, javax.sql.rowset.serial.SerialStruct> hashMap0 = new HashMap<javax.sql.rowset.serial.SerialStruct, javax.sql.rowset.serial.SerialStruct>();
      // Undeclared exception!
      try { 
        serialArray0.getResultSet((long) (-1), (-1), (Map) hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // getResultSet(index, count, Map) not supported
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      SerialArray serialArray0 = new SerialArray("clob", objectArray0);
      // Undeclared exception!
      try { 
        serialArray0.writeExternal((ObjectOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      SerialArray serialArray0 = new SerialArray("uJ>_NUReI", objectArray0);
      // Undeclared exception!
      try { 
        serialArray0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray();
      // Undeclared exception!
      try { 
        serialArray0.getResultSet(1L, (-2314));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // getResultSet(index, count) not supported
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      SerialArray serialArray0 = new SerialArray("double", objectArray0);
      SerialArray serialArray1 = new SerialArray(serialArray0);
      assertEquals(8, serialArray0.getBaseType());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      SerialArray serialArray0 = new SerialArray("varchar", objectArray0);
      // Undeclared exception!
      try { 
        serialArray0.getArray(0L, (-3238));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // getArray(index, count) not supported
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      SerialArray serialArray0 = new SerialArray("struct", objectArray0);
      SerialArray serialArray1 = null;
      try {
        serialArray1 = new SerialArray(serialArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.relayjdbc.serial.SerialStruct", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray();
      // Undeclared exception!
      try { 
        serialArray0.getResultSet((Map) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // getResultSet(Map) not supported
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray();
      HashMap<javax.sql.rowset.serial.SerialStruct, javax.sql.rowset.serial.SerialStruct> hashMap0 = new HashMap<javax.sql.rowset.serial.SerialStruct, javax.sql.rowset.serial.SerialStruct>();
      // Undeclared exception!
      try { 
        serialArray0.getArray(0L, 93, (Map) hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // getArray(index, count, Map) not supported
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SerialArray serialArray0 = new SerialArray((-3115), "OT$?eI_A]E", "OT$?eI_A]E");
      // Undeclared exception!
      try { 
        serialArray0.getResultSet();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // getResultSet() not supported
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      HashMap<BufferedInputStream, javax.sql.rowset.serial.SerialStruct> hashMap0 = new HashMap<BufferedInputStream, javax.sql.rowset.serial.SerialStruct>();
      SerialArray serialArray0 = new SerialArray("nclob", objectArray0);
      // Undeclared exception!
      try { 
        serialArray0.getArray((Map) hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // getArray(Map) not supported
         //
         verifyException("com.github.relayjdbc.serial.SerialArray", e);
      }
  }
}
