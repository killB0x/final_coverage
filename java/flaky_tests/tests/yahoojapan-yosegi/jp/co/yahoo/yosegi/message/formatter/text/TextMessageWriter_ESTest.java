/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:17:08 GMT 2022
 */

package jp.co.yahoo.yosegi.message.formatter.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jp.co.yahoo.yosegi.message.design.ArrayContainerField;
import jp.co.yahoo.yosegi.message.design.BooleanField;
import jp.co.yahoo.yosegi.message.design.BytesField;
import jp.co.yahoo.yosegi.message.design.DoubleField;
import jp.co.yahoo.yosegi.message.design.IField;
import jp.co.yahoo.yosegi.message.design.IntegerField;
import jp.co.yahoo.yosegi.message.design.LongField;
import jp.co.yahoo.yosegi.message.design.Properties;
import jp.co.yahoo.yosegi.message.design.ShortField;
import jp.co.yahoo.yosegi.message.design.StringField;
import jp.co.yahoo.yosegi.message.design.StructContainerField;
import jp.co.yahoo.yosegi.message.design.UnionField;
import jp.co.yahoo.yosegi.message.formatter.text.TextMessageWriter;
import jp.co.yahoo.yosegi.message.objects.BytesStringObj;
import jp.co.yahoo.yosegi.message.objects.FloatObj;
import jp.co.yahoo.yosegi.message.objects.NullObj;
import jp.co.yahoo.yosegi.message.objects.PrimitiveObject;
import jp.co.yahoo.yosegi.message.objects.StringObj;
import jp.co.yahoo.yosegi.message.objects.Utf8BytesLinkObj;
import jp.co.yahoo.yosegi.message.parser.IParser;
import jp.co.yahoo.yosegi.message.parser.json.JacksonNullParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TextMessageWriter_ESTest extends TextMessageWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DoubleField doubleField0 = new DoubleField("LP$4^nzxeEWeq:");
      TextMessageWriter textMessageWriter0 = new TextMessageWriter(doubleField0);
      FloatObj floatObj0 = new FloatObj(0.0F);
      byte[] byteArray0 = textMessageWriter0.create((PrimitiveObject) floatObj0);
      assertArrayEquals(new byte[] {(byte)48, (byte)46, (byte)48}, byteArray0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BooleanField booleanField0 = new BooleanField((String) null, (Properties) null);
      TextMessageWriter textMessageWriter0 = new TextMessageWriter(booleanField0);
      UnionField unionField0 = new UnionField("vsrd=v;");
      Map<Object, Object> map0 = unionField0.toJavaObject();
      byte[] byteArray0 = textMessageWriter0.create(map0);
      Utf8BytesLinkObj utf8BytesLinkObj0 = new Utf8BytesLinkObj(byteArray0, 3, 0);
      // Undeclared exception!
      try { 
        textMessageWriter0.create((PrimitiveObject) utf8BytesLinkObj0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Properties properties0 = new Properties();
      IntegerField integerField0 = new IntegerField("", properties0);
      TextMessageWriter textMessageWriter0 = new TextMessageWriter(integerField0);
      StringObj stringObj0 = new StringObj();
      // Undeclared exception!
      try { 
        textMessageWriter0.create((PrimitiveObject) stringObj0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Properties properties0 = new Properties();
      ShortField shortField0 = new ShortField("", properties0);
      TextMessageWriter textMessageWriter0 = new TextMessageWriter(shortField0);
      JacksonNullParser jacksonNullParser0 = new JacksonNullParser();
      PrimitiveObject primitiveObject0 = jacksonNullParser0.get(3814);
      // Undeclared exception!
      try { 
        textMessageWriter0.create(primitiveObject0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // NullObj is not support getShort()
         //
         verifyException("jp.co.yahoo.yosegi.message.objects.NullObj", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BytesField bytesField0 = new BytesField("name");
      TextMessageWriter textMessageWriter0 = new TextMessageWriter(bytesField0);
      PrimitiveObject primitiveObject0 = NullObj.getInstance();
      // Undeclared exception!
      try { 
        textMessageWriter0.create(primitiveObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.util.ByteArrayData", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BooleanField booleanField0 = new BooleanField("");
      TextMessageWriter textMessageWriter0 = new TextMessageWriter(booleanField0);
      JacksonNullParser jacksonNullParser0 = new JacksonNullParser();
      PrimitiveObject primitiveObject0 = jacksonNullParser0.get(0);
      // Undeclared exception!
      try { 
        textMessageWriter0.create(primitiveObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // NullObj is not support getBoolean()
         //
         verifyException("jp.co.yahoo.yosegi.message.objects.NullObj", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringField stringField0 = new StringField("B");
      TextMessageWriter textMessageWriter0 = new TextMessageWriter(stringField0);
      byte[] byteArray0 = new byte[2];
      Utf8BytesLinkObj utf8BytesLinkObj0 = new Utf8BytesLinkObj(byteArray0, (byte) (-13), (byte) (-13));
      // Undeclared exception!
      try { 
        textMessageWriter0.create((PrimitiveObject) utf8BytesLinkObj0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -13
         //
         verifyException("jp.co.yahoo.yosegi.message.objects.Utf8BytesLinkObj", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StructContainerField structContainerField0 = new StructContainerField("-Q,{BeEb`jbFsh");
      ArrayContainerField arrayContainerField0 = new ArrayContainerField("-Q,{BeEb`jbFsh", structContainerField0);
      structContainerField0.set(arrayContainerField0);
      TextMessageWriter textMessageWriter0 = null;
      try {
        textMessageWriter0 = new TextMessageWriter(structContainerField0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StructContainerField structContainerField0 = new StructContainerField((String) null, (Properties) null);
      TextMessageWriter textMessageWriter0 = null;
      try {
        textMessageWriter0 = new TextMessageWriter(structContainerField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.message.formatter.text.TextStructFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StructContainerField structContainerField0 = new StructContainerField("SOOTDFb!-Qo|j2*~");
      TextMessageWriter textMessageWriter0 = null;
      try {
        textMessageWriter0 = new TextMessageWriter(structContainerField0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Delimiter property is not found. Please set delimiter. Example 0x2c
         //
         verifyException("jp.co.yahoo.yosegi.message.formatter.text.TextStructFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LongField longField0 = new LongField("msyi&j: }4}Mm|;");
      TextMessageWriter textMessageWriter0 = new TextMessageWriter(longField0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      byte[] byteArray0 = textMessageWriter0.create((List<Object>) linkedList0);
      BytesStringObj bytesStringObj0 = new BytesStringObj(byteArray0, "msyi&j: }4}Mm|;");
      try { 
        textMessageWriter0.create((PrimitiveObject) bytesStringObj0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextMessageWriter textMessageWriter0 = new TextMessageWriter((IField) null);
      textMessageWriter0.close();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextMessageWriter textMessageWriter0 = new TextMessageWriter((IField) null);
      PrimitiveObject primitiveObject0 = NullObj.getInstance();
      byte[] byteArray0 = textMessageWriter0.create(primitiveObject0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextMessageWriter textMessageWriter0 = new TextMessageWriter((IField) null);
      JacksonNullParser jacksonNullParser0 = new JacksonNullParser();
      byte[] byteArray0 = textMessageWriter0.create((IParser) jacksonNullParser0);
      assertEquals(0, byteArray0.length);
  }
}
