/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 14:53:36 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonTreeWriter_ESTest extends JsonTreeWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.endObject();
      assertSame(jsonWriter1, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(true);
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(false);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(true);
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(">L795Ztw`&{");
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Boolean) null);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      Boolean boolean0 = Boolean.valueOf(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(boolean0);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      Boolean boolean0 = Boolean.valueOf(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(boolean0);
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(0L);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((-221L));
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(0L);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((double) 0L);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(0.0);
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.name("5[8Z>&QWSirH<z1^8");
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.value(">L795Ztw`&{");
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonTreeWriter0.get();
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonElement jsonElement0 = jsonTreeWriter0.get();
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      JsonTreeWriter jsonTreeWriter1 = (JsonTreeWriter)jsonTreeWriter0.endArray();
      JsonArray jsonArray0 = (JsonArray)jsonTreeWriter1.get();
      assertEquals(0, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.setHtmlSafe(true);
      jsonTreeWriter0.name("~o 7s%FGW66G#Iw e,");
      jsonTreeWriter0.value("]MbY>y!lMRUy;z<zZ");
      JsonWriter jsonWriter0 = jsonTreeWriter0.endObject();
      Long long0 = new Long((-199L));
      JsonWriter jsonWriter1 = jsonTreeWriter0.value((Number) long0);
      assertSame(jsonWriter1, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("~o 7s%FGW66G#Iw e,");
      jsonTreeWriter0.value("]MbY>y!lMRUy;z<zZ");
      jsonTreeWriter0.endObject();
      Long long0 = new Long((-199L));
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) long0);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      jsonWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter1 = jsonTreeWriter0.endArray();
      assertSame(jsonWriter1, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endArray();
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.endObject();
      assertSame(jsonTreeWriter0, jsonWriter1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.endArray();
      assertTrue(jsonWriter1.isLenient());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      jsonTreeWriter0.setHtmlSafe(true);
      jsonTreeWriter0.name("~o 7s%FGW66G#Iw e,");
      jsonTreeWriter0.value("]MbY>y!lMRUy;z<zZ");
      jsonTreeWriter0.name("Incomplete document");
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      assertTrue(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value((Number) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      Boolean boolean0 = Boolean.FALSE;
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(0L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.nullValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      try { 
        jsonTreeWriter0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      Integer integer0 = new Integer(1);
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) integer0);
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((-3760.925761974347));
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((String) null);
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.name("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.name("m?");
      // Undeclared exception!
      try { 
        jsonWriter0.name("m?");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      jsonTreeWriter0.endArray();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.name("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.name("wbFzRI~5L``niojYv");
      // Undeclared exception!
      try { 
        jsonWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      jsonTreeWriter0.endArray();
      // Undeclared exception!
      try { 
        jsonWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.beginArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("wbFzRI~5L``niojYv");
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("wbFzRI~5L``niojYv");
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      assertSame(jsonWriter0, jsonWriter1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("wbF{zRI~5L``niojYv");
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.endArray();
      assertFalse(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      jsonWriter0.endObject();
      JsonElement jsonElement0 = jsonTreeWriter0.get();
      assertTrue(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.get();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected one JSON element but was [{}]
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.flush();
      assertTrue(jsonTreeWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      jsonWriter0.name("Factory[typeHierarchy=");
      // Undeclared exception!
      try { 
        jsonWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.jsonValue("Unterminated escape sequence");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
