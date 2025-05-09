/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:30:24 GMT 2022
 */

package jp.co.yahoo.yosegi.inmemory;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary;
import jp.co.yahoo.yosegi.message.objects.PrimitiveObject;
import jp.co.yahoo.yosegi.message.objects.PrimitiveType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IDictionary_ESTest extends IDictionary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(4445);
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setString(0, charArray0, (-2250), 4445);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(656);
      primitiveObjectDictionary0.setDouble(465, 656);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[1];
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(32767);
      primitiveObjectDictionary0.setString((int) (byte)0, charArray0, 0, 0);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(656);
      char[] charArray0 = new char[3];
      primitiveObjectDictionary0.setString(1, charArray0);
      assertEquals(3, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(1681);
      byte[] byteArray0 = new byte[1];
      primitiveObjectDictionary0.setBytes(362, byteArray0);
      PrimitiveObject primitiveObject0 = primitiveObjectDictionary0.getPrimitiveObject(362);
      assertEquals(PrimitiveType.BYTES, primitiveObject0.getPrimitiveType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(248);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setString(248, (char[]) null, 248, 248);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setString(0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(9);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setString(9, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 9 out of bounds for length 9
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(2);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setShort((byte)85, (byte)85);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 85 out of bounds for length 2
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(1681);
      PrimitiveObject primitiveObject0 = primitiveObjectDictionary0.getPrimitiveObject(362);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setPrimitiveObject(1681, primitiveObject0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1681 out of bounds for length 1681
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(0);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setLong(32767, 32767);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 32767 out of bounds for length 0
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(248);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setFloat(248, 248);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 248 out of bounds for length 248
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(1112);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setDouble(1112, 1112);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1112 out of bounds for length 1112
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(362);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setBytes(2733, byteArray0, (int) (byte)80, (-1072));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1072
         //
         verifyException("jp.co.yahoo.yosegi.message.objects.BytesObj", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(248);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setBytes(248, byteArray0, 248, 248);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(248);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setBytes(248, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.IDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(248);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setBytes(248, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 248 out of bounds for length 248
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(248);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setByte(248, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 248 out of bounds for length 248
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(1299);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setBoolean((byte) (-2), false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2 out of bounds for length 1299
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(0);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.getPrimitiveObject(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setString(0, charArray0, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("jp.co.yahoo.yosegi.inmemory.PrimitiveObjectDictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrimitiveObjectDictionary primitiveObjectDictionary0 = new PrimitiveObjectDictionary(252);
      // Undeclared exception!
      try { 
        primitiveObjectDictionary0.setString(252, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
