/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 13:04:47 GMT 2022
 */

package io.github.joseerodrigues.utils.dbutil.mapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResultSetMap_ESTest extends ResultSetMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      resultSetMap0.put("", "$7,VR\";WDk3#2Jv]^x");
      String string0 = resultSetMap0.getString("");
      assertEquals("$7,VR\";WDk3#2Jv]^x", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      BiFunction<Object, Object, Date> biFunction0 = (BiFunction<Object, Object, Date>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      resultSetMap0.merge("", "", biFunction0);
      String string0 = resultSetMap0.getString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      ResultSetMap resultSetMap0 = new ResultSetMap(comparator0);
      MockDate mockDate0 = new MockDate(255L);
      BiFunction<Object, Object, Date> biFunction0 = (BiFunction<Object, Object, Date>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(mockDate0).when(biFunction0).apply(any() , any());
      Object object0 = resultSetMap0.compute("", biFunction0);
      Date date0 = resultSetMap0.getDate("");
      assertSame(date0, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      ResultSetMap resultSetMap0 = new ResultSetMap(treeMap0);
      Byte byte0 = resultSetMap0.getByte("&pn");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      // Undeclared exception!
      try { 
        resultSetMap0.getString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyString() , anyString());
      ResultSetMap resultSetMap0 = new ResultSetMap(comparator0);
      Object object0 = new Object();
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      resultSetMap0.merge("Ell_|1/x{M{e", object0, biFunction0);
      // Undeclared exception!
      try { 
        resultSetMap0.getString("~p8HNte*w+&5GCB10");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      // Undeclared exception!
      try { 
        resultSetMap0.getLong((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      resultSetMap0.put("", "");
      // Undeclared exception!
      try { 
        resultSetMap0.getLong("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Long (java.lang.String and java.lang.Long are in module java.base of loader 'bootstrap')
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      ResultSetMap resultSetMap0 = new ResultSetMap(treeMap0);
      // Undeclared exception!
      try { 
        resultSetMap0.getInt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      resultSetMap0.putIfAbsent("", "");
      // Undeclared exception!
      try { 
        resultSetMap0.getInt("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      // Undeclared exception!
      try { 
        resultSetMap0.getFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      resultSetMap0.putIfAbsent("", "");
      // Undeclared exception!
      try { 
        resultSetMap0.getFloat("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Float (java.lang.String and java.lang.Float are in module java.base of loader 'bootstrap')
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      // Undeclared exception!
      try { 
        resultSetMap0.getDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      resultSetMap0.putIfAbsent("M", "M");
      // Undeclared exception!
      try { 
        resultSetMap0.getDouble("M");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Double (java.lang.String and java.lang.Double are in module java.base of loader 'bootstrap')
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      // Undeclared exception!
      try { 
        resultSetMap0.getDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyString() , anyString());
      ResultSetMap resultSetMap0 = new ResultSetMap(comparator0);
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      resultSetMap0.merge("", "", biFunction0);
      // Undeclared exception!
      try { 
        resultSetMap0.getDate("u$");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.util.Date (java.lang.String and java.util.Date are in module java.base of loader 'bootstrap')
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      resultSetMap0.putIfAbsent("", "");
      // Undeclared exception!
      try { 
        resultSetMap0.getByte("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Byte (java.lang.String and java.lang.Byte are in module java.base of loader 'bootstrap')
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      // Undeclared exception!
      try { 
        resultSetMap0.getBigDecimal((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyString() , anyString());
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>(comparator0);
      treeMap0.put((String) null, "");
      ResultSetMap resultSetMap0 = null;
      try {
        resultSetMap0 = new ResultSetMap(treeMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      resultSetMap0.put("", "");
      // Undeclared exception!
      try { 
        resultSetMap0.getBigDecimal("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.math.BigDecimal (java.lang.String and java.math.BigDecimal are in module java.base of loader 'bootstrap')
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      Long long0 = resultSetMap0.getLong("");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      ResultSetMap resultSetMap0 = new ResultSetMap(treeMap0);
      Float float0 = resultSetMap0.getFloat("");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ResultSetMap resultSetMap0 = new ResultSetMap(comparator0);
      Double double0 = resultSetMap0.getDouble("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      String string0 = resultSetMap0.getString("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      Date date0 = resultSetMap0.getDate("");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      Integer integer0 = resultSetMap0.getInt("");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      ResultSetMap resultSetMap1 = new ResultSetMap(resultSetMap0);
      assertTrue(resultSetMap1.equals((Object)resultSetMap0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      BigDecimal bigDecimal0 = resultSetMap0.getBigDecimal("");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResultSetMap resultSetMap0 = new ResultSetMap();
      // Undeclared exception!
      try { 
        resultSetMap0.getByte((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key
         //
         verifyException("io.github.joseerodrigues.utils.dbutil.mapper.ResultSetMap", e);
      }
  }
}
