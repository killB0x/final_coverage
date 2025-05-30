/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 12:15:50 GMT 2022
 */

package com.j256.simplemagic.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.j256.simplemagic.endian.EndianType;
import com.j256.simplemagic.entries.MagicFormatter;
import com.j256.simplemagic.entries.MagicMatcher;
import com.j256.simplemagic.types.ByteType;
import com.j256.simplemagic.types.DoubleType;
import com.j256.simplemagic.types.FloatType;
import com.j256.simplemagic.types.Id3LengthType;
import com.j256.simplemagic.types.LocalLongDateType;
import com.j256.simplemagic.types.LongType;
import com.j256.simplemagic.types.ShortType;
import com.j256.simplemagic.types.UtcDateType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NumberType_ESTest extends NumberType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EndianType endianType0 = EndianType.LITTLE;
      LongType longType0 = new LongType(endianType0);
      // Undeclared exception!
      try { 
        longType0.convertTestString("k2z~O77<s#<}@r09fb", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.j256.simplemagic.types.TestOperator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      StringBuilder stringBuilder0 = new StringBuilder();
      MagicFormatter magicFormatter0 = new MagicFormatter("com.j256.simplemagic.types.LongType");
      byteType0.renderValue(stringBuilder0, stringBuilder0, magicFormatter0);
      assertEquals("com.j256.simplemagic.types.LongType", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EndianType endianType0 = EndianType.LITTLE;
      Id3LengthType id3LengthType0 = new Id3LengthType(endianType0);
      long long0 = id3LengthType0.maskValue(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EndianType endianType0 = EndianType.LITTLE;
      ShortType shortType0 = new ShortType(endianType0);
      long long0 = shortType0.maskValue(191L);
      assertEquals(191L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      FloatType floatType0 = new FloatType(endianType0);
      long long0 = floatType0.maskValue((-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      int int0 = byteType0.getBytesPerType();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      Object object0 = byteType0.extractValueFromBytes((-3637), (byte[]) null, true);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      ShortType shortType0 = new ShortType(endianType0);
      int int0 = shortType0.compare(true, 8, 8);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      Long long0 = new Long((-1927L));
      LongType longType0 = new LongType(endianType0);
      int int0 = longType0.compare(false, 2704, long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EndianType endianType0 = EndianType.BIG;
      LongType longType0 = new LongType(endianType0);
      Long long0 = new Long((-1836L));
      int int0 = longType0.compare(false, long0, (-10));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EndianType endianType0 = EndianType.NATIVE;
      UtcDateType utcDateType0 = new UtcDateType(endianType0);
      MagicFormatter magicFormatter0 = new MagicFormatter("EQUALS");
      // Undeclared exception!
      try { 
        utcDateType0.renderValue((StringBuilder) null, endianType0, magicFormatter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.j256.simplemagic.endian.EndianType cannot be cast to class java.lang.Long (com.j256.simplemagic.endian.EndianType is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @64479d4; java.lang.Long is in module java.base of loader 'bootstrap')
         //
         verifyException("com.j256.simplemagic.types.LocalDateType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      MagicMatcher.MutableOffset magicMatcher_MutableOffset0 = new MagicMatcher.MutableOffset(0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        byteType0.isMatch((Object) null, (Long) null, true, (Object) null, magicMatcher_MutableOffset0, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.j256.simplemagic.types.NumberType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EndianType endianType0 = EndianType.BIG;
      LongType longType0 = new LongType(endianType0);
      Long long0 = new Long((-1));
      MagicMatcher.MutableOffset magicMatcher_MutableOffset0 = new MagicMatcher.MutableOffset((-1));
      byte[] byteArray0 = new byte[17];
      // Undeclared exception!
      try { 
        longType0.isMatch(long0, long0, true, long0, magicMatcher_MutableOffset0, byteArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Long cannot be cast to class com.j256.simplemagic.types.NumberComparison (java.lang.Long is in module java.base of loader 'bootstrap'; com.j256.simplemagic.types.NumberComparison is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @64479d4)
         //
         verifyException("com.j256.simplemagic.types.NumberType", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      LocalLongDateType localLongDateType0 = new LocalLongDateType(endianType0);
      // Undeclared exception!
      try { 
        localLongDateType0.extractValueFromBytes(1897, (byte[]) null, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Middle-endian only supports 4-byte integers
         //
         verifyException("com.j256.simplemagic.endian.MiddleEndianConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EndianType endianType0 = EndianType.LITTLE;
      Id3LengthType id3LengthType0 = new Id3LengthType(endianType0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        id3LengthType0.extractValueFromBytes((-1), byteArray0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 6
         //
         verifyException("com.j256.simplemagic.types.Id3LengthType", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      try { 
        byteType0.decodeValueString("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Zero length string
         //
         verifyException("java.lang.Long", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      // Undeclared exception!
      try { 
        byteType0.decodeValueString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Long", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      // Undeclared exception!
      try { 
        byteType0.convertTestString("0.###E0", "0.###E0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not parse number from: '0.###E0'
         //
         verifyException("com.j256.simplemagic.types.NumberComparison", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      // Undeclared exception!
      try { 
        byteType0.compare(false, (Number) null, (Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.j256.simplemagic.types.ByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      UtcDateType utcDateType0 = new UtcDateType(endianType0);
      DoubleType doubleType0 = new DoubleType(endianType0);
      Object object0 = doubleType0.convertTestString("0", "0");
      Long long0 = new Long((-1927L));
      MagicMatcher.MutableOffset magicMatcher_MutableOffset0 = new MagicMatcher.MutableOffset(2700);
      byte[] byteArray0 = new byte[4];
      FloatType floatType0 = new FloatType(endianType0);
      Object object1 = floatType0.longToObject(long0);
      utcDateType0.isMatch(object0, long0, true, object1, magicMatcher_MutableOffset0, byteArray0);
      assertEquals(2704, magicMatcher_MutableOffset0.offset);
      assertEquals("2704", magicMatcher_MutableOffset0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      UtcDateType utcDateType0 = new UtcDateType(endianType0);
      DoubleType doubleType0 = new DoubleType(endianType0);
      Object object0 = doubleType0.convertTestString("0", "0");
      Long long0 = new Long((-1927L));
      MagicMatcher.MutableOffset magicMatcher_MutableOffset0 = new MagicMatcher.MutableOffset(1866);
      byte[] byteArray0 = new byte[4];
      Object object1 = utcDateType0.isMatch(object0, long0, true, long0, magicMatcher_MutableOffset0, byteArray0);
      assertNull(object1);
      assertEquals("1866", magicMatcher_MutableOffset0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      // Undeclared exception!
      try { 
        byteType0.extractValueFromBytes(1, (byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.j256.simplemagic.endian.LittleEndianConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteType byteType0 = new ByteType();
      MagicFormatter magicFormatter0 = new MagicFormatter("EZWNKiZz_SN");
      // Undeclared exception!
      try { 
        byteType0.renderValue((StringBuilder) null, (Object) null, magicFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.j256.simplemagic.entries.MagicFormatter", e);
      }
  }
}
