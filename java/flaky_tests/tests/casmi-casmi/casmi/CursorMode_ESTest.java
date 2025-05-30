/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:17:09 GMT 2022
 */

package casmi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import casmi.CursorMode;
import java.awt.Cursor;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CursorMode_ESTest extends CursorMode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CursorMode[] cursorModeArray0 = CursorMode.values();
      assertEquals(15, cursorModeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.valueOf("DEFAULT");
      assertEquals(CursorMode.DEFAULT, cursorMode0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        CursorMode.getCursorMode((Cursor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("casmi.CursorMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        CursorMode.getAWTCursor((CursorMode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("casmi.CursorMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.NONE;
      // Undeclared exception!
      try { 
        CursorMode.getAWTCursor(cursorMode0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.DEFAULT;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      assertEquals("Default Cursor", cursor0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.MOVE;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.MOVE, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.HAND;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.HAND, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.RESIZE_EAST;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.RESIZE_EAST, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.RESIZE_WEST;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.RESIZE_WEST, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.RESIZE_SOUTH;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.RESIZE_SOUTH, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.RESIZE_NORTH;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.RESIZE_NORTH, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.RESIZE_NORTH_EAST;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.RESIZE_NORTH_EAST, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.RESIZE_NORTH_WEST;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.RESIZE_NORTH_WEST, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.RESIZE_SOUTH_EAST;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.RESIZE_SOUTH_EAST, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.WAIT;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.WAIT, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.TEXT;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.TEXT, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.CROSS;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.CROSS, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CursorMode cursorMode0 = CursorMode.RESIZE_SOUTH_WEST;
      Cursor cursor0 = CursorMode.getAWTCursor(cursorMode0);
      CursorMode cursorMode1 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.RESIZE_SOUTH_WEST, cursorMode1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Cursor cursor0 = new Cursor(0);
      CursorMode cursorMode0 = CursorMode.getCursorMode(cursor0);
      assertEquals(CursorMode.DEFAULT, cursorMode0);
  }
}
