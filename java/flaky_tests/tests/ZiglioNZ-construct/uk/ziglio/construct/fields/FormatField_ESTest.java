/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 22:18:45 GMT 2022
 */

package uk.ziglio.construct.fields;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ziglio.construct.fields.FormatField;
import uk.ziglio.construct.fields.Packer;
import uk.ziglio.construct.lib.BitStream;
import uk.ziglio.construct.lib.ByteBufferWrapper;
import uk.ziglio.construct.lib.Containers;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FormatField_ESTest extends FormatField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FormatField<Integer> formatField0 = null;
      try {
        formatField0 = new FormatField<Integer>("", '6', '6');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endianity must be be '=', '<', or '>' 6
         //
         verifyException("uk.ziglio.construct.fields.FormatField", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormatField<Integer> formatField0 = new FormatField<Integer>("", '<', 'b');
      BitStream.BitStreamReader bitStream_BitStreamReader0 = new BitStream.BitStreamReader();
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      bitStream_BitStreamReader0.bb = byteBuffer0;
      Integer integer0 = formatField0._parse(bitStream_BitStreamReader0, (Containers.Container) null);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormatField<Integer> formatField0 = new FormatField<Integer>("5c_s[#t@2OQKEN", '<', 'I');
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(910);
      FormatField<Integer>[] formatFieldArray0 = (FormatField<Integer>[]) Array.newInstance(FormatField.class, 2);
      Containers.Container containers_Container0 = new Containers.Container(formatFieldArray0);
      formatField0._build(formatField0.FLAG_COPY_CONTEXT, byteArrayOutputStream0, containers_Container0);
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("\u0001\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FormatField<Integer> formatField0 = new FormatField<Integer>("5c_s[#t@2OQKEN", '<', 'I');
      Packer<Integer> packer0 = new Packer<Integer>('t', ';');
      formatField0.packer = packer0;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        formatField0._build((Object) null, byteArrayOutputStream0, (Containers.Container) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unrecognized fmt ;
         //
         verifyException("uk.ziglio.construct.fields.Packer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FormatField<Integer> formatField0 = new FormatField<Integer>("5c_s[#t@2OQKEN", '<', 'I');
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        formatField0._build((Object) null, byteArrayOutputStream0, (Containers.Container) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // type not supported null
         //
         verifyException("uk.ziglio.construct.fields.Packer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FormatField<Integer> formatField0 = null;
      try {
        formatField0 = new FormatField<Integer>("5c_s[#t@2OQKEN", 'I', '');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // endianity must be be '=', '<', or '>' I
         //
         verifyException("uk.ziglio.construct.fields.FormatField", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FormatField<Integer> formatField0 = null;
      try {
        formatField0 = new FormatField<Integer>("uk5ziVlio.construct.lib.ContainPr{", '=', '=');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unrecognized fmt =
         //
         verifyException("uk.ziglio.construct.fields.Packer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FormatField<Integer> formatField0 = null;
      try {
        formatField0 = new FormatField<Integer>("", '>', '>');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unrecognized fmt >
         //
         verifyException("uk.ziglio.construct.fields.Packer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FormatField<Integer> formatField0 = new FormatField<Integer>("5c_s[#t@2OQKEN", '<', 'I');
      formatField0.get();
      assertEquals(4, formatField0.getLength());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FormatField<Integer> formatField0 = new FormatField<Integer>("", '<', 'l');
      Object[] objectArray0 = new Object[0];
      Containers.Container containers_Container0 = new Containers.Container(objectArray0);
      // Undeclared exception!
      try { 
        formatField0._parse((ByteBufferWrapper) null, containers_Container0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ziglio.construct.fields.FormatField", e);
      }
  }
}
