/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 17:59:03 GMT 2022
 */

package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.digest.MurmurHash3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MurmurHash3_ESTest extends MurmurHash3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 1, 1);
      byte[] byteArray1 = new byte[4];
      byteArray1[3] = (byte)1;
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray1, 1, 2289);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4 out of bounds for length 4
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 1, 1);
      byte[] byteArray1 = new byte[4];
      byteArray1[2] = (byte)4;
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray1, 1, 2289);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4 out of bounds for length 4
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 1, 1);
      byte[] byteArray1 = new byte[4];
      byteArray1[1] = (byte) (-40);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray1, 1, 2289);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4 out of bounds for length 4
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-109);
      murmurHash3_IncrementalHash32x86_0.finalise((-814), 3, byteArray0, 48);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)53;
      murmurHash3_IncrementalHash32x86_0.finalise((-814), 3, byteArray0, 48);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add((byte[]) null, (-1736), 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[5];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte) (-1), 0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      MurmurHash3.hash128("org.apache.commons.codec.binary.StringUtils");
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)25;
      MurmurHash3.hash64(byteArray0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-46);
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 0, 10, (-14));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 9 out of bounds for length 8
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      MurmurHash3.hash64((short) (-3488));
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-8);
      MurmurHash3.hash32x86(byteArray0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-1);
      MurmurHash3.hash32x86(byteArray0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-53);
      byteArray0[1] = (byte) (-53);
      MurmurHash3.hash32(byteArray0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)60;
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals(2122872448, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      int int0 = MurmurHash3.hash32("Kd= Vas`Oq(,|0t");
      assertEquals((-608803245), int0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("Nm`Ll@GFmG=!oVgE|m");
      assertArrayEquals(new long[] {2561261956884633131L, (-7082368563969832955L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)78, (int) (byte)0, (int) (byte)69);
      assertEquals(520233683044657131L, long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long long0 = MurmurHash3.hash64(byteArray0, 1654, 0, (int) (byte)11);
      assertEquals((-1169037589280886076L), long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(8404154273843829576L, long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long long0 = MurmurHash3.hash64(byteArray0, 2549, (-16));
      assertEquals((-3671528601273818556L), long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      long long0 = MurmurHash3.hash64((short)925);
      assertEquals(6121880000589182801L, long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      long long0 = MurmurHash3.hash64(1487L);
      assertEquals((-5992155295660408703L), long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      long long0 = MurmurHash3.hash64((-612));
      assertEquals((-4254093076321084790L), long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = MurmurHash3.hash32x86(byteArray0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash3.hash32x86(byteArray0, 2858, 0, (-1028477387));
      assertEquals(208060452, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)58, 0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash3.hash32(byteArray0, (-1437), 0, 27);
      assertEquals(1159698088, int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = MurmurHash3.hash32(byteArray0, 6, (-229235619));
      assertEquals(554330421, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = MurmurHash3.hash32(byteArray0, (-1272), (int) (short)10);
      assertEquals((-1632218740), int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = MurmurHash3.hash32(byteArray0, 1);
      assertEquals(500407381, int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0);
      assertEquals((-965378730), int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      int int0 = MurmurHash3.hash32("Kd= VasOq(|0");
      assertEquals(1544384350, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      int int0 = MurmurHash3.hash32(113L, 142L, (-21));
      assertEquals((-1470136388), int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L, 1003L);
      assertEquals((-1738583743), int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) (-1501883176), (-665));
      assertEquals(76127611, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int int0 = MurmurHash3.hash32(5L);
      assertEquals((-199868261), int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0, (int) (byte) (-84), 0, (int) (byte) (-84));
      assertArrayEquals(new long[] {(-4021666103087751753L), 1534562645477756621L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long[] longArray0 = MurmurHash3.hash128(byteArray0, (-1083), (int) (byte)0, (int) (byte)0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-720425247), (-720425247));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1440850495 out of bounds for length 7
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, (-72922542), (-72922542), (-72922542));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (short)2293, (int) (short)2293);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (-111685489));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -111685490 out of bounds for length 9
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64(byteArray0, (-1162), (-1162), (-1162));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2325 out of bounds for length 7
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128(byteArray0, (int) (byte) (-121), (-260), (int) (byte)51);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -382 out of bounds for length 5
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-8134343811225465012L), 4068162993924431541L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 56, (-2978), (-391));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2923 out of bounds for length 0
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)0, (int) (byte)0, (int) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-720425247), (-720425247), (-720425247));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1440850495 out of bounds for length 7
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 125, (int) (byte) (-121), 2719);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 9
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 16320, (-693), (int) (byte)69);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 15626 out of bounds for length 6
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-1470136388), (-140), (int) (byte)58);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1470136529 out of bounds for length 5
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, 0, (int) (byte) (-121), (-1028477387));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -122 out of bounds for length 5
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, (-1162), (-1739), (int) (byte)78);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2902 out of bounds for length 8
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, (-1028477387), (int) (byte) (-46), (-1500));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1028477434 out of bounds for length 4
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null, 2088, 2088, 2088);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, 561, 1, (int) (byte) (-73));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 561 out of bounds for length 6
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash3.hash32(byteArray0, 0, 4, (int) (byte) (-82));
      assertEquals((-1421528775), int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-1L), 0L, 961);
      assertEquals(1556013166, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise(2, 2, byteArray0, 2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise(1754797035, 1, byteArray0, (-1160));
      assertEquals(2059653799, int0);
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 7, 7);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 7, 7);
      assertEquals(1096975535, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (-1150), (-2288));
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("UsGw&stmYE_>}o!");
      assertArrayEquals(new long[] {(-8598533467361431394L), 5434788028209751367L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("v%ZtG#Rs<hU %r");
      assertArrayEquals(new long[] {2658917948353152257L, (-8245387565637979821L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {6574525721897061910L, 1992345785333911878L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-2026853825940356636L), (-5807855487305494056L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-6740669540557935164L), 6418926938960070244L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {(-863911184844273265L), 3307197894665247746L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("DO[#");
      assertArrayEquals(new long[] {(-1981839847832444535L), (-1258782796153023986L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-4654978917449141626L), 4100248936650863565L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals((-4879355010014097355L), long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, (-923), (-923), (-923));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals(1187580377513868106L, long0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash3.hash32x86(byteArray0, (-139), 0, (-430675100));
      assertEquals((-15128758), int0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals((-720425247), int0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (short) (-3488), (int) (short) (-3488));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (-2199), (-1), (-1816));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2201 out of bounds for length 6
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.start((byte)1);
      assertEquals(1364076727, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 6, 6);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 6, 6);
      assertEquals((-650046389), murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.end();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-953437469044763373L), (-311759995312951250L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64((byte[]) null, 2215, 2215, 2215);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      long long0 = MurmurHash3.hash64((-1911L));
      assertEquals(4551317406073922866L, long0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, (-862048943));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      long long0 = MurmurHash3.hash64((-1143));
      assertEquals(5554649838345481794L, long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((byte[]) null, (-923), (-923), (-923));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, (int) (short)2, (int) (short)2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L);
      assertEquals(1754797035, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int int0 = MurmurHash3.hash32(98L, 98L);
      assertEquals(65380704, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals((-111685489), int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) 3, 9);
      assertEquals((-314364779), int0);
  }
}
