/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 17:59:02 GMT 2022
 */

package de.chrlembeck.util.swing.icon;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.chrlembeck.util.swing.icon.NavigationIcon;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import javax.swing.DebugGraphics;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StringContent;
import javax.swing.text.StyleContext;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NavigationIcon_ESTest extends NavigationIcon_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FAST_BACKWARD;
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      Color color1 = color0.darker();
      NavigationIcon navigationIcon0 = new NavigationIcon((-3153), navigationIcon_Direction0, color1, 0.0F, color0);
      assertEquals((-3153), navigationIcon0.getIconWidth());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.SECTION_END;
      Color color0 = Color.WHITE;
      NavigationIcon navigationIcon0 = new NavigationIcon(0, navigationIcon_Direction0, color0, 0, color0);
      int int0 = navigationIcon0.getIconWidth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.SECTION_START;
      Color color0 = Color.gray;
      NavigationIcon navigationIcon0 = new NavigationIcon((-556), navigationIcon_Direction0, color0, (-556), color0);
      int int0 = navigationIcon0.getIconWidth();
      assertEquals((-556), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FAST_FORWARD;
      SystemColor systemColor0 = SystemColor.controlHighlight;
      NavigationIcon navigationIcon0 = new NavigationIcon(0, navigationIcon_Direction0, systemColor0, 0, systemColor0);
      int int0 = navigationIcon0.getIconHeight();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.SECTION_END;
      Object[][] objectArray0 = new Object[0][6];
      Object[] objectArray1 = new Object[6];
      objectArray1[0] = (Object) navigationIcon_Direction0;
      objectArray1[1] = (Object) navigationIcon_Direction0;
      objectArray1[2] = (Object) navigationIcon_Direction0;
      objectArray1[3] = (Object) navigationIcon_Direction0;
      objectArray1[4] = (Object) navigationIcon_Direction0;
      objectArray1[5] = (Object) navigationIcon_Direction0;
      JTable jTable0 = new JTable(objectArray0, objectArray1);
      Color color0 = jTable0.getGridColor();
      NavigationIcon navigationIcon0 = new NavigationIcon(1, navigationIcon_Direction0, color0, 1, color0);
      int int0 = navigationIcon0.getIconHeight();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.BACKWARD;
      JList<Object> jList0 = new JList<Object>();
      Color color0 = jList0.getSelectionBackground();
      NavigationIcon navigationIcon0 = new NavigationIcon((-1), navigationIcon_Direction0, color0, (-1), color0);
      // Undeclared exception!
      try { 
        navigationIcon0.paintIcon(jList0, (Graphics) null, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.chrlembeck.util.swing.icon.NavigationIcon", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JList<Object> jList0 = new JList<Object>();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(2, 50, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FAST_FORWARD;
      NavigationIcon navigationIcon0 = new NavigationIcon(50, navigationIcon_Direction0, systemColor0, (-1.0F), systemColor0);
      // Undeclared exception!
      try { 
        navigationIcon0.paintIcon(jList0, graphics0, 493, 493);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // negative width
         //
         verifyException("java.awt.BasicStroke", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JList<Object> jList0 = new JList<Object>();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(2, 50, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FAST_FORWARD;
      NavigationIcon navigationIcon0 = new NavigationIcon((-1176), navigationIcon_Direction0, systemColor0, 5493.8F, systemColor0);
      DebugGraphics debugGraphics0 = new DebugGraphics(graphics0, jList0);
      // Undeclared exception!
      try { 
        navigationIcon0.paintIcon(jList0, debugGraphics0, 50, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class javax.swing.DebugGraphics cannot be cast to class java.awt.Graphics2D (javax.swing.DebugGraphics and java.awt.Graphics2D are in module java.desktop of loader 'bootstrap')
         //
         verifyException("de.chrlembeck.util.swing.icon.NavigationIcon", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JList<Object> jList0 = new JList<Object>();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(2, 50, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FORWARD;
      NavigationIcon navigationIcon0 = new NavigationIcon(50, navigationIcon_Direction0, systemColor0, 2, systemColor0);
      navigationIcon0.paintIcon(jList0, graphics0, 2, 1082);
      assertEquals(50, navigationIcon0.getIconWidth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.textHighlightText;
      JInternalFrame jInternalFrame0 = new JInternalFrame("", true, true, true, true);
      Container container0 = jInternalFrame0.getContentPane();
      BufferedImage bufferedImage0 = new BufferedImage(3846, 3846, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.SECTION_END;
      NavigationIcon navigationIcon0 = new NavigationIcon((-1176), navigationIcon_Direction0, systemColor0, 50, systemColor0);
      navigationIcon0.paintIcon(container0, graphics0, 50, 2);
      assertEquals((-1176), navigationIcon0.getIconHeight());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JList<Object> jList0 = new JList<Object>();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(3, 50, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.BACKWARD;
      NavigationIcon navigationIcon0 = new NavigationIcon(0, navigationIcon_Direction0, systemColor0, 2, systemColor0);
      navigationIcon0.paintIcon(jList0, graphics0, 4038, 3);
      assertEquals(0, navigationIcon0.getIconWidth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JList<Object> jList0 = new JList<Object>();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(2, 50, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.SECTION_START;
      NavigationIcon navigationIcon0 = new NavigationIcon(50, navigationIcon_Direction0, systemColor0, 78.2255F, systemColor0);
      navigationIcon0.paintIcon(jList0, graphics0, (-3486), 0);
      assertEquals(50, navigationIcon0.getIconHeight());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(2, 50, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.DOCUMENT_END;
      NavigationIcon navigationIcon0 = new NavigationIcon(0, navigationIcon_Direction0, systemColor0, 2, systemColor0);
      StringContent stringContent0 = new StringContent((-1));
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(stringContent0, styleContext0);
      JTextField jTextField0 = new JTextField(defaultStyledDocument0, "", 50);
      navigationIcon0.paintIcon(jTextField0, graphics0, (-103), 0);
      assertEquals(0, navigationIcon0.getIconHeight());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JList<Object> jList0 = new JList<Object>();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(2, 1, 1);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FAST_BACKWARD;
      NavigationIcon navigationIcon0 = new NavigationIcon(0, navigationIcon_Direction0, systemColor0, 2, systemColor0);
      navigationIcon0.paintIcon(jList0, graphics0, 2, 357);
      assertEquals(0, navigationIcon0.getIconWidth());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JList<Object> jList0 = new JList<Object>();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(2, 50, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FAST_FORWARD;
      NavigationIcon navigationIcon0 = new NavigationIcon((-1176), navigationIcon_Direction0, systemColor0, 5493.8F, systemColor0);
      navigationIcon0.paintIcon(jList0, graphics0, 50, 50);
      assertEquals((-1176), navigationIcon0.getIconWidth());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JList<Object> jList0 = new JList<Object>();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BufferedImage bufferedImage0 = new BufferedImage(50, 50, 2);
      Graphics graphics0 = bufferedImage0.getGraphics();
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.DOCUMENT_START;
      NavigationIcon navigationIcon0 = new NavigationIcon(1051, navigationIcon_Direction0, systemColor0, 0.0F, systemColor0);
      navigationIcon0.paintIcon(jList0, graphics0, 3010, 50);
      assertEquals(1051, navigationIcon0.getIconWidth());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FAST_BACKWARD;
      Color color0 = Color.yellow;
      NavigationIcon navigationIcon0 = new NavigationIcon(7, navigationIcon_Direction0, color0, (-163.1F), color0);
      int int0 = navigationIcon0.getIconWidth();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NavigationIcon.Direction navigationIcon_Direction0 = NavigationIcon.Direction.FAST_BACKWARD;
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      NavigationIcon navigationIcon0 = new NavigationIcon((-3153), navigationIcon_Direction0, color0, 0.0F, color0);
      int int0 = navigationIcon0.getIconHeight();
      assertEquals((-3153), int0);
  }
}
