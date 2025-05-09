/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 18:15:08 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonObject_ESTest extends JsonObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("kRl5_ElTv Hv)L8^", "com.google.gson.internal.Streams$AppendableWriter");
      int int0 = jsonObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "[Iu^v?QbAV};B32}{(");
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonObject0.remove("");
      assertFalse(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add(" >_=u<e=xN", jsonObject0);
      JsonElement jsonElement0 = jsonObject0.remove(" >_=u<e=xN");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = new JsonArray();
      jsonObject0.add("Expected a double but was ", jsonArray0);
      JsonElement jsonElement0 = jsonObject0.remove("Expected a double but was ");
      assertTrue(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      jsonObject0.add("", jsonNull0);
      JsonElement jsonElement0 = jsonObject0.remove("");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Float float0 = new Float(0.0F);
      jsonObject0.addProperty("e{ktQhzK$AU3y1I", (Number) float0);
      boolean boolean0 = jsonObject0.has("e{ktQhzK$AU3y1I");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("-l#vDz>f3.]R.9{E_", jsonObject0);
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("-l#vDz>f3.]R.9{E_");
      assertTrue(jsonObject1.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = new JsonArray();
      jsonObject0.add("Expected a double but was ", jsonArray0);
      JsonArray jsonArray1 = jsonObject0.getAsJsonArray("Expected a double but was ");
      assertEquals(0, jsonArray1.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add(" >_=u<e=xN", jsonObject0);
      JsonElement jsonElement0 = jsonObject0.get(" >_=u<e=xN");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('#');
      jsonObject0.addProperty("", character0);
      JsonElement jsonElement0 = jsonObject0.get("");
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("-l#vDz>f3.]R.9{E_", jsonObject0);
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonPrimitive("-l#vDz>f3.]R.9{E_");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonObject cannot be cast to com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonObject("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonPrimitive cannot be cast to com.google.gson.JsonObject
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonArray("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonPrimitive cannot be cast to com.google.gson.JsonArray
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('#');
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, character0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = new Boolean((String) null);
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      jsonObject0.add("", jsonNull0);
      JsonElement jsonElement0 = jsonObject0.get("");
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      JsonObject jsonObject2 = jsonObject1.getAsJsonObject();
      Double double0 = new Double((-4566.1));
      jsonObject1.addProperty("Dangling name: ", (Number) double0);
      boolean boolean0 = jsonObject2.equals(jsonObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Object object0 = new Object();
      boolean boolean0 = jsonObject0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.equals(jsonObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", (Character) null);
      assertTrue(jsonObject0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('(');
      jsonObject0.addProperty("", character0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertTrue(jsonPrimitive0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", (Boolean) null);
      assertTrue(jsonObject0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = new Boolean("");
      jsonObject0.addProperty("", boolean0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertFalse(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, (Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Byte byte0 = new Byte((byte) (-112));
      jsonObject0.addProperty("", (Number) byte0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertFalse(jsonPrimitive0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.add((String) null, (JsonElement) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      assertNotSame(jsonObject1, jsonObject0);
      assertTrue(jsonObject1.equals((Object)jsonObject0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      boolean boolean0 = jsonObject1.equals(jsonObject0);
      assertTrue(boolean0);
      assertNotSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("-l#vDz>f3.]R.9{E_");
      assertNull(jsonObject1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("-l#vDz>f3.]R.9{E_");
      assertNull(jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.get("");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = jsonObject0.getAsJsonArray("");
      assertNull(jsonArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.has("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.remove("");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      int int0 = jsonObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<Map.Entry<String, JsonElement>> set0 = (Set<Map.Entry<String, JsonElement>>)jsonObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<String> set0 = jsonObject0.keySet();
      assertTrue(set0.isEmpty());
  }
}
