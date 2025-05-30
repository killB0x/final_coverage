/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 21:40:29 GMT 2022
 */

package cn.wxrwcz.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import cn.wxrwcz.utils.WxrEmptyUtils;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WxrEmptyUtils_ESTest extends WxrEmptyUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = Integer.valueOf(2);
      boolean boolean0 = WxrEmptyUtils.isNotEmptyOrZeroNumber(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Boolean boolean0 = WxrEmptyUtils.isEmptyCharSequence(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = WxrEmptyUtils.isEmptyOrZeroNumber((Number) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Short short0 = Short.valueOf((short) (-1560));
      boolean boolean0 = WxrEmptyUtils.isEmptyOrZeroNumber(short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = WxrEmptyUtils.isEmptyArrays(objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = WxrEmptyUtils.isEmptyArrays((Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      boolean boolean0 = WxrEmptyUtils.isEmptyArrays(objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Array, Array> hashMap0 = new HashMap<Array, Array>();
      boolean boolean0 = WxrEmptyUtils.isEmptyMap(hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = WxrEmptyUtils.isEmptyCollection((Collection<?>) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Array> linkedList0 = new LinkedList<Array>();
      boolean boolean0 = WxrEmptyUtils.isEmptyCollection(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Array> linkedList0 = new LinkedList<Array>();
      boolean boolean0 = WxrEmptyUtils.isEmpty(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(4);
      Boolean boolean0 = WxrEmptyUtils.isNotEmptyCharSequence(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Boolean boolean0 = WxrEmptyUtils.isNotEmptyCharSequence((CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Boolean boolean0 = WxrEmptyUtils.isEmptyCharSequence("g2dUY");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Boolean boolean0 = WxrEmptyUtils.isEmptyCharSequence((CharSequence) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Long long0 = Long.valueOf(0L);
      boolean boolean0 = WxrEmptyUtils.isEmptyOrZeroNumber(long0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = WxrEmptyUtils.isNotEmptyOrZeroNumber((Number) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = WxrEmptyUtils.isNotEmptyArrays((Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      boolean boolean0 = WxrEmptyUtils.isNotEmptyArrays(objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Array, Array> hashMap0 = new HashMap<Array, Array>();
      hashMap0.put((Array) null, (Array) null);
      boolean boolean0 = WxrEmptyUtils.isNotEmptyMap(hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Array, Array> hashMap0 = new HashMap<Array, Array>();
      boolean boolean0 = WxrEmptyUtils.isNotEmptyMap(hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Array, Array> hashMap0 = new HashMap<Array, Array>();
      hashMap0.put((Array) null, (Array) null);
      boolean boolean0 = WxrEmptyUtils.isEmptyMap(hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = WxrEmptyUtils.isEmptyMap((Map<?, ?>) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Array> linkedList0 = new LinkedList<Array>();
      linkedList0.push((Array) null);
      boolean boolean0 = WxrEmptyUtils.isNotEmptyCollection(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<Array> linkedList0 = new LinkedList<Array>();
      linkedList0.push((Array) null);
      boolean boolean0 = WxrEmptyUtils.isEmptyCollection(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = WxrEmptyUtils.isNotEmptyCollection((Collection<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = WxrEmptyUtils.isNotEmpty(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<Array, Array> hashMap0 = new HashMap<Array, Array>();
      boolean boolean0 = WxrEmptyUtils.isEmpty(hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "";
      boolean boolean0 = WxrEmptyUtils.isEmpty(objectArray0[0]);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<Array> linkedList0 = new LinkedList<Array>();
      boolean boolean0 = WxrEmptyUtils.isNotEmpty(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = WxrEmptyUtils.isEmpty((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = WxrEmptyUtils.isEmpty(object0);
      assertFalse(boolean0);
  }
}
