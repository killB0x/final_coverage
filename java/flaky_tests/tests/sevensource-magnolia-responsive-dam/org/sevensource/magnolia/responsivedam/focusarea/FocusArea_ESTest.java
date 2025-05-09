/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 19:42:42 GMT 2022
 */

package org.sevensource.magnolia.responsivedam.focusarea;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sevensource.magnolia.responsivedam.focusarea.FocusArea;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FocusArea_ESTest extends FocusArea_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer1, integer1);
      focusArea0.setY(integer1);
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      assertEquals(0, (int)focusArea1.getX());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(31);
      FocusArea focusArea0 = new FocusArea("x`8:(", integer0, integer0, integer0, integer0);
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      assertTrue(focusArea1.equals((Object)focusArea0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("q>9v", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getY();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(31);
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getY();
      assertEquals(31, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = new Integer((-2987));
      focusArea0.setY(integer0);
      Integer integer1 = focusArea0.getY();
      assertEquals((-2987), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getX();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(2760);
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getX();
      assertEquals(2760, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = new Integer((-1));
      focusArea0.setX(integer0);
      Integer integer1 = focusArea0.getX();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getWidth();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(2583);
      FocusArea focusArea0 = new FocusArea("`", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getWidth();
      assertEquals(2583, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      FocusArea focusArea0 = new FocusArea("bzu)G=?@", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getWidth();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      String string0 = focusArea0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer((-551));
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      focusArea0.setName("x>TgW#cM<K#Yd[T*K E");
      String string0 = focusArea0.getName();
      assertEquals("x>TgW#cM<K#Yd[T*K E", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("VOB]ankXAut!h8nIj", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getHeight();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = focusArea0.getHeight();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getHeight();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FocusArea.of((FocusArea) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sevensource.magnolia.responsivedam.focusarea.FocusArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      String string0 = focusArea0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = focusArea0.getX();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = focusArea0.getWidth();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = focusArea0.getY();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", 5022);
      FocusArea focusArea0 = new FocusArea("/~>s:Mv!;-`_#w", integer0, integer0, integer0, integer0);
      Integer integer1 = focusArea0.getHeight();
      assertEquals(5022, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      assertTrue(focusArea1.equals((Object)focusArea0));
      
      Integer integer0 = new Integer(1990);
      focusArea1.setY(integer0);
      boolean boolean0 = focusArea1.equals(focusArea0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      assertTrue(focusArea1.equals((Object)focusArea0));
      
      Integer integer0 = new Integer(4512);
      focusArea1.setY(integer0);
      boolean boolean0 = focusArea0.equals(focusArea1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea();
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      assertTrue(focusArea1.equals((Object)focusArea0));
      
      focusArea1.setX(integer0);
      boolean boolean0 = focusArea1.equals(focusArea0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = new Integer(1);
      focusArea0.setX(integer0);
      FocusArea focusArea1 = new FocusArea();
      boolean boolean0 = focusArea1.equals(focusArea0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = new Integer(1);
      focusArea0.setWidth(integer0);
      FocusArea focusArea1 = new FocusArea();
      boolean boolean0 = focusArea0.equals(focusArea1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      assertTrue(focusArea1.equals((Object)focusArea0));
      
      Integer integer0 = new Integer(3867);
      focusArea1.setWidth(integer0);
      boolean boolean0 = focusArea0.equals(focusArea1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      focusArea0.setName("9lqmV_% M+lNHhms S");
      FocusArea focusArea1 = new FocusArea();
      boolean boolean0 = focusArea0.equals(focusArea1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      assertTrue(focusArea1.equals((Object)focusArea0));
      
      focusArea0.setName("f47<l");
      boolean boolean0 = focusArea1.equals(focusArea0);
      assertFalse(focusArea1.equals((Object)focusArea0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("VOB]ankXAut!h8nIj", integer0, integer0, integer0, integer0);
      FocusArea focusArea1 = new FocusArea();
      boolean boolean0 = focusArea0.equals(focusArea1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = new Integer(1448);
      FocusArea focusArea1 = new FocusArea("1jX/\"o*m,^=lSN", integer0, integer0, integer0, integer0);
      boolean boolean0 = focusArea0.equals(focusArea1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("VOB]ankXAut!h8nIj", integer0, integer0, integer0, integer0);
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      boolean boolean0 = focusArea1.equals(focusArea0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      boolean boolean0 = focusArea0.equals("VOB]ankXAut!h8nIj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      boolean boolean0 = focusArea0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      boolean boolean0 = focusArea0.equals(focusArea0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      focusArea0.hashCode();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Integer integer0 = new Integer(1287);
      FocusArea focusArea0 = new FocusArea("i-U%9UZ42.tU+`", integer0, integer0, integer0, integer0);
      focusArea0.hashCode();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = new Integer(2);
      FocusArea focusArea0 = new FocusArea("A-T$1qQzfJ8|f=", integer0, integer0, integer0, (Integer) null);
      boolean boolean0 = focusArea0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = new Integer(1);
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      boolean boolean0 = focusArea0.isValid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer(0);
      FocusArea focusArea0 = new FocusArea("", integer0, integer0, integer0, integer0);
      boolean boolean0 = focusArea0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      boolean boolean0 = focusArea0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = new Integer(1);
      focusArea0.setX(integer0);
      boolean boolean0 = focusArea0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      // Undeclared exception!
      try { 
        focusArea0.toString();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/builder/ToStringBuilder
         //
         verifyException("org.sevensource.magnolia.responsivedam.focusarea.FocusArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      Integer integer0 = new Integer(2760);
      focusArea0.setHeight(integer0);
      assertEquals(2760, (int)focusArea0.getHeight());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FocusArea focusArea0 = new FocusArea();
      FocusArea focusArea1 = FocusArea.of(focusArea0);
      boolean boolean0 = focusArea1.equals(focusArea0);
      assertTrue(boolean0);
  }
}
