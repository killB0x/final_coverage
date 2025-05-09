/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 03:17:03 GMT 2022
 */

package com.contentful.java.cda;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.contentful.java.cda.CDAResource;
import com.contentful.java.cda.CDAType;
import com.contentful.java.cda.DeletedResource;
import com.contentful.java.cda.Util;
import java.util.FormatFlagsConversionMismatchException;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatFlagsException;
import java.util.IllegalFormatPrecisionException;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.MissingFormatWidthException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.queryParam("entries", "entries");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // okhttp3/HttpUrl
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, DeletedResource> hashMap0 = new HashMap<Object, DeletedResource>();
      HashMap<DeletedResource, Object> hashMap1 = new HashMap<DeletedResource, Object>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>(hashMap1);
      Object[] objectArray0 = new Object[6];
      hashMap2.put(objectArray0[0], hashMap0);
      Object object0 = Util.extractNested((Map<?, ?>) hashMap2, objectArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<DeletedResource> class0 = DeletedResource.class;
      HashMap<Object, DeletedResource> hashMap0 = new HashMap<Object, DeletedResource>();
      Object[] objectArray0 = new Object[1];
      DeletedResource deletedResource0 = new DeletedResource();
      hashMap0.put(class0, deletedResource0);
      objectArray0[0] = (Object) class0;
      Object object0 = Util.extractNested((Map<?, ?>) hashMap0, objectArray0);
      assertSame(object0, deletedResource0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<DeletedResource> class0 = DeletedResource.class;
      // Undeclared exception!
      try { 
        Util.typeForClass(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class provided: com.contentful.java.cda.DeletedResource
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.resourcePath((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) hashMap0;
      hashMap0.put(objectArray0[0], "");
      // Undeclared exception!
      try { 
        Util.extractNested((Map<?, ?>) hashMap0, objectArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        Util.extractNested((Map<?, ?>) hashMap0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, DeletedResource> hashMap0 = new HashMap<Object, DeletedResource>();
      DeletedResource deletedResource0 = new DeletedResource();
      hashMap0.put((Object) null, deletedResource0);
      Object[] objectArray0 = new Object[14];
      // Undeclared exception!
      try { 
        Util.extractNested((Map<?, ?>) hashMap0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.contentful.java.cda.DeletedResource cannot be cast to class java.util.Map (com.contentful.java.cda.DeletedResource is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @e3d5917; java.util.Map is in module java.base of loader 'bootstrap')
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        Util.checkNotNull((Object) null, "<\"6/0*6%5VvG", objectArray0);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'V'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        Util.checkNotNull((Object) null, "21rs%e{*J)/xZB", objectArray0);
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%e'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<DeletedResource, Object> hashMap0 = new HashMap<DeletedResource, Object>();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) hashMap0;
      // Undeclared exception!
      try { 
        Util.checkNotNull((Object) null, "P|DIcC7wUsX)<meQ%G", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // g != java.util.HashMap
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        Util.checkNotNull((Object) null, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        Util.checkNotNull(objectArray0[0], "PRF~*bvZ:3\"UV*c(", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // PRF~*bvZ:3\"UV*c(
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.checkNotEmpty("", "t5%|[\"FC?z~mz`}YVY", (Object[]) null);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = '|'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.checkNotEmpty("", "%0XK", (Object[]) null);
        fail("Expecting exception: MissingFormatWidthException");
      
      } catch(MissingFormatWidthException e) {
         //
         // %0X
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        Util.checkNotEmpty((CharSequence) null, ")!v>#Jn9%E=^|0e ", objectArray0);
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%E'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "%E|hd";
      // Undeclared exception!
      try { 
        Util.checkNotEmpty("", "%E|hd", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // e != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.checkNotEmpty("", "qpM8R{5%0TsjdKqF:;_", (Object[]) null);
        fail("Expecting exception: FormatFlagsConversionMismatchException");
      
      } catch(FormatFlagsConversionMismatchException e) {
         //
         // Conversion = s, Flags = 0
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.checkNotEmpty((CharSequence) null, (String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      hashMap1.put(hashMap0, hashMap0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) hashMap0;
      Object object0 = Util.extractNested((Map<?, ?>) hashMap1, objectArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<DeletedResource, Object> hashMap0 = new HashMap<DeletedResource, Object>();
      Object[] objectArray0 = new Object[0];
      Object object0 = Util.extractNested((Map<?, ?>) hashMap0, objectArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.typeForClass((Class<? extends CDAResource>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CDAType cDAType0 = CDAType.TAG;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      CDAType cDAType1 = Util.typeForClass(class0);
      assertEquals(CDAType.TAG, cDAType1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CDAType cDAType0 = CDAType.SPACE;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      CDAType cDAType1 = Util.typeForClass(class0);
      assertSame(cDAType0, cDAType1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CDAType cDAType0 = CDAType.ENTRY;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      CDAType cDAType1 = Util.typeForClass(class0);
      assertEquals(CDAType.ENTRY, cDAType1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CDAType cDAType0 = CDAType.CONTENTTYPE;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      CDAType cDAType1 = Util.typeForClass(class0);
      assertSame(cDAType0, cDAType1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CDAType cDAType0 = CDAType.ASSET;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      CDAType cDAType1 = Util.typeForClass(class0);
      assertEquals(CDAType.ASSET, cDAType1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CDAType cDAType0 = CDAType.LOCALE;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      CDAType cDAType1 = Util.typeForClass(class0);
      assertEquals(CDAType.LOCALE, cDAType1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CDAType cDAType0 = CDAType.ARRAY;
      // Undeclared exception!
      try { 
        Util.classForType(cDAType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid type provided: ARRAY
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CDAType cDAType0 = CDAType.DELETEDENTRY;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CDAType cDAType0 = CDAType.DELETEDASSET;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CDAType cDAType0 = CDAType.TAG;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      assertEquals("class com.contentful.java.cda.CDATag", class0.toString());
      
      String string0 = Util.resourcePath(class0);
      assertEquals("tags", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CDAType cDAType0 = CDAType.SPACE;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      // Undeclared exception!
      try { 
        Util.resourcePath(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid type specified: com.contentful.java.cda.CDASpace
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CDAType cDAType0 = CDAType.ENTRY;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      String string0 = Util.resourcePath(class0);
      assertEquals("entries", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CDAType cDAType0 = CDAType.CONTENTTYPE;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      String string0 = Util.resourcePath(class0);
      assertEquals("content_types", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CDAType cDAType0 = CDAType.ASSET;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      String string0 = Util.resourcePath(class0);
      assertEquals("assets", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CDAType cDAType0 = CDAType.LOCALE;
      Class<? extends CDAResource> class0 = Util.classForType(cDAType0);
      String string0 = Util.resourcePath(class0);
      assertEquals("class com.contentful.java.cda.CDALocale", class0.toString());
      assertEquals("locales", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Util.checkNotEmpty("", ")>OFY4%<nzPn3", objectArray0);
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = '<'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        Util.checkNotEmpty((CharSequence) null, ".", objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // .
         //
         verifyException("com.contentful.java.cda.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      CharSequence charSequence0 = Util.checkNotEmpty("obU'G55p%0DUS]B", "obU'G55p%0DUS]B", objectArray0);
      assertEquals("obU'G55p%0DUS]B", charSequence0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        Util.checkNotNull((Object) null, "@+r%.2x.2AbOb#Z+^", objectArray0);
        fail("Expecting exception: IllegalFormatPrecisionException");
      
      } catch(IllegalFormatPrecisionException e) {
         //
         // 2
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object[] objectArray0 = new Object[4];
      HashMap hashMap1 = (HashMap)Util.checkNotNull((Object) hashMap0, "Y>en`YR7y-`iht", objectArray0);
      assertEquals(0, hashMap1.size());
  }
}
