/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 18:13:25 GMT 2022
 */

package de.chrlembeck.util.swing.icon;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.chrlembeck.util.swing.icon.ZoomIcon;
import java.awt.Color;
import java.awt.Paint;
import java.awt.SystemColor;
import javax.swing.DebugGraphics;
import javax.swing.JPopupMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ZoomIcon_ESTest extends ZoomIcon_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.FIT;
      Color color0 = Color.pink;
      ZoomIcon zoomIcon0 = new ZoomIcon(4295, zoomIcon_Sign0, color0, 0.0F, color0, (Paint) null, (-103.93241F));
      assertEquals(4295, zoomIcon0.getIconWidth());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Color color0 = Color.YELLOW;
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.ORIGINAL;
      Color color1 = Color.black;
      ZoomIcon zoomIcon0 = new ZoomIcon(0, zoomIcon_Sign0, color0, 0, color1, color1, 0);
      assertEquals(0, zoomIcon0.getIconWidth());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.PLUS;
      SystemColor systemColor0 = SystemColor.textHighlight;
      ZoomIcon zoomIcon0 = new ZoomIcon(1787, zoomIcon_Sign0, systemColor0, 1787, systemColor0, systemColor0, 1787);
      int int0 = zoomIcon0.getIconWidth();
      assertEquals(1787, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.PLUS;
      ZoomIcon zoomIcon0 = new ZoomIcon((-176), zoomIcon_Sign0, (Paint) null, 2730.3264F, (Paint) null, (Paint) null, 2730.3264F);
      int int0 = zoomIcon0.getIconWidth();
      assertEquals((-176), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.NONE;
      Color color0 = Color.LIGHT_GRAY;
      ZoomIcon zoomIcon0 = new ZoomIcon(0, zoomIcon_Sign0, color0, 0, color0, color0, 1629.682F);
      int int0 = zoomIcon0.getIconHeight();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.MINUS;
      Color color0 = Color.RED;
      ZoomIcon zoomIcon0 = new ZoomIcon(1, zoomIcon_Sign0, color0, 452.3611F, color0, color0, 1);
      int int0 = zoomIcon0.getIconHeight();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.FIT;
      Color color0 = Color.blue;
      ZoomIcon zoomIcon0 = new ZoomIcon((-254), zoomIcon_Sign0, color0, (-254), color0, color0, (-254));
      JPopupMenu jPopupMenu0 = new JPopupMenu();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        zoomIcon0.paintIcon(jPopupMenu0, debugGraphics0, (-254), (-254));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Color color0 = Color.YELLOW;
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.ORIGINAL;
      ZoomIcon zoomIcon0 = new ZoomIcon(0, zoomIcon_Sign0, color0, 0, color0, color0, 0);
      int int0 = zoomIcon0.getIconWidth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ZoomIcon.Sign zoomIcon_Sign0 = ZoomIcon.Sign.MINUS;
      ZoomIcon zoomIcon0 = new ZoomIcon((-338), zoomIcon_Sign0, (Paint) null, 0.0F, (Paint) null, (Paint) null, (-338));
      int int0 = zoomIcon0.getIconHeight();
      assertEquals((-338), int0);
  }
}
