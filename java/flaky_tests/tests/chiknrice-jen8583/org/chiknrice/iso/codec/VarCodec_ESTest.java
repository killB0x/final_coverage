/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 01:51:01 GMT 2022
 */

package org.chiknrice.iso.codec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.DuplicateFormatFlagsException;
import java.util.IllegalFormatFlagsException;
import org.chiknrice.iso.codec.Codec;
import org.chiknrice.iso.codec.CustomCodec;
import org.chiknrice.iso.codec.CustomCodecAdapter;
import org.chiknrice.iso.codec.NumericCodec;
import org.chiknrice.iso.codec.VarCodec;
import org.chiknrice.iso.config.ComponentDef;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VarCodec_ESTest extends VarCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.CHAR;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      Codec<Integer> codec0 = (Codec<Integer>) mock(Codec.class, new ViolatedAssumptionAnswer());
      doReturn((ComponentDef.Encoding) null).when(codec0).getEncoding();
      VarCodec<Integer> varCodec0 = new VarCodec<Integer>(numericCodec0, codec0);
      varCodec0.getEncoding();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      Codec<Integer> codec0 = (Codec<Integer>) mock(Codec.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(codec0).decode(any(java.nio.ByteBuffer.class));
      doReturn((ComponentDef.Encoding) null).when(codec0).getEncoding();
      VarCodec<Integer> varCodec0 = new VarCodec<Integer>(numericCodec0, codec0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(46);
      varCodec0.decode(byteBuffer0);
      assertEquals("java.nio.DirectByteBuffer[pos=46 lim=46 cap=46]", byteBuffer0.toString());
      assertFalse(byteBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      VarCodec<Object> varCodec0 = new VarCodec<Object>(numericCodec0, (Codec<Object>) null);
      // Undeclared exception!
      try { 
        varCodec0.getEncoding();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.chiknrice.iso.codec.VarCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(438);
      VarCodec<Number> varCodec0 = new VarCodec<Number>(numericCodec0, numericCodec0);
      // Undeclared exception!
      try { 
        varCodec0.encode(byteBuffer0, (Number) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid numeric value [java.lang.Integer@0000000003]
         //
         verifyException("org.chiknrice.iso.util.Bcd", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      Integer integer0 = new Integer((-2030));
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0, integer0);
      VarCodec<Integer> varCodec0 = new VarCodec<Integer>(numericCodec0, (Codec<Integer>) null);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("");
      // Undeclared exception!
      try { 
        varCodec0.encode(byteBuffer0, (Integer) null);
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = '-0'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      Integer integer0 = new Integer(0);
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0, integer0);
      VarCodec<Object> varCodec0 = new VarCodec<Object>(numericCodec0, (Codec<Object>) null);
      // Undeclared exception!
      try { 
        varCodec0.encode(byteBuffer0, integer0);
        fail("Expecting exception: DuplicateFormatFlagsException");
      
      } catch(DuplicateFormatFlagsException e) {
         //
         // Flags = '0'
         //
         verifyException("java.util.Formatter$Flags", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.CHAR;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      byte[] byteArray0 = new byte[6];
      CustomCodec<Object> customCodec0 = (CustomCodec<Object>) mock(CustomCodec.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(customCodec0).encode(any());
      Integer integer0 = new Integer((-1171));
      CustomCodecAdapter customCodecAdapter0 = new CustomCodecAdapter(customCodec0, integer0);
      VarCodec<Object> varCodec0 = new VarCodec<Object>(numericCodec0, customCodecAdapter0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(46);
      varCodec0.encode(byteBuffer0, integer0);
      // Undeclared exception!
      try { 
        varCodec0.encode(byteBuffer0, integer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.DirectByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BINARY;
      Integer integer0 = new Integer((-1));
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0, integer0);
      VarCodec<Integer> varCodec0 = new VarCodec<Integer>(numericCodec0, (Codec<Integer>) null);
      // Undeclared exception!
      try { 
        varCodec0.encode(byteBuffer0, integer0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("org.chiknrice.iso.util.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      VarCodec<Number> varCodec0 = new VarCodec<Number>(numericCodec0, numericCodec0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(6862);
      // Undeclared exception!
      varCodec0.decode(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(158);
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      Integer integer0 = new Integer(158);
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0, integer0);
      CustomCodecAdapter customCodecAdapter0 = new CustomCodecAdapter((CustomCodec) null, integer0);
      VarCodec<Object> varCodec0 = new VarCodec<Object>(numericCodec0, customCodecAdapter0);
      // Undeclared exception!
      try { 
        varCodec0.decode(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.CHAR;
      Integer integer0 = new Integer((-1));
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0, integer0);
      VarCodec<Number> varCodec0 = new VarCodec<Number>(numericCodec0, numericCodec0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        varCodec0.decode(byteBuffer0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("org.chiknrice.iso.codec.NumericCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      VarCodec<Number> varCodec0 = new VarCodec<Number>(numericCodec0, numericCodec0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("``ptS");
      // Undeclared exception!
      try { 
        varCodec0.decode(byteBuffer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // newLimit > capacity: (882870079 > 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer((-1171));
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(46);
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.CHAR;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      Codec<Integer> codec0 = (Codec<Integer>) mock(Codec.class, new ViolatedAssumptionAnswer());
      doReturn((ComponentDef.Encoding) null).when(codec0).getEncoding();
      VarCodec<Integer> varCodec0 = new VarCodec<Integer>(numericCodec0, codec0);
      varCodec0.encode(byteBuffer0, integer0);
      assertEquals("java.nio.DirectByteBuffer[pos=28 lim=46 cap=46]", byteBuffer0.toString());
      assertEquals(28, byteBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.CHAR;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      CustomCodec<Object> customCodec0 = (CustomCodec<Object>) mock(CustomCodec.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-1171));
      CustomCodecAdapter customCodecAdapter0 = new CustomCodecAdapter(customCodec0, integer0);
      VarCodec<Object> varCodec0 = new VarCodec<Object>(numericCodec0, customCodecAdapter0);
      ComponentDef.Encoding componentDef_Encoding1 = varCodec0.getEncoding();
      assertEquals(ComponentDef.Encoding.BINARY, componentDef_Encoding1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.CHAR;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      VarCodec<Number> varCodec0 = new VarCodec<Number>(numericCodec0, numericCodec0);
      Integer integer0 = new Integer(364);
      CustomCodecAdapter customCodecAdapter0 = new CustomCodecAdapter((CustomCodec) null, integer0);
      VarCodec<Object> varCodec1 = new VarCodec<Object>(varCodec0, customCodecAdapter0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(364);
      // Undeclared exception!
      try { 
        varCodec1.encode(byteBuffer0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.chiknrice.iso.codec.CustomCodecAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(3260);
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      Integer integer0 = Integer.valueOf(2743);
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0, integer0);
      VarCodec<Number> varCodec0 = new VarCodec<Number>((Codec<Number>) null, numericCodec0);
      varCodec0.encode(byteBuffer0, integer0);
      assertEquals(1888, byteBuffer0.remaining());
      assertEquals(1372, byteBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4);
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BINARY;
      Integer integer0 = new Integer(4);
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0, integer0);
      VarCodec<Number> varCodec0 = new VarCodec<Number>(numericCodec0, numericCodec0);
      // Undeclared exception!
      try { 
        varCodec0.decode(byteBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting 4 bytes, only 0 remaining
         //
         verifyException("org.chiknrice.iso.codec.NumericCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VarCodec<Number> varCodec0 = new VarCodec<Number>((Codec<Number>) null, (Codec<Number>) null);
      // Undeclared exception!
      try { 
        varCodec0.decode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.chiknrice.iso.codec.VarCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ComponentDef.Encoding componentDef_Encoding0 = ComponentDef.Encoding.BCD;
      NumericCodec numericCodec0 = new NumericCodec(componentDef_Encoding0);
      VarCodec<Number> varCodec0 = new VarCodec<Number>(numericCodec0, numericCodec0);
      VarCodec<Number> varCodec1 = new VarCodec<Number>(numericCodec0, varCodec0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      // Undeclared exception!
      try { 
        varCodec1.decode(byteBuffer0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}
