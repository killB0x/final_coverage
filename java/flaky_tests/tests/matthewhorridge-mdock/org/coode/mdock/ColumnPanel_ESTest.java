/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 04:45:29 GMT 2022
 */

package org.coode.mdock;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import org.coode.mdock.ColumnPanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ColumnPanel_ESTest extends ColumnPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem((Icon) null);
      ColumnPanel columnPanel0 = new ColumnPanel(jRadioButtonMenuItem0);
      // Undeclared exception!
      try { 
        columnPanel0.ensureVisible((JComponent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.coode.mdock.ColumnPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColumnPanel columnPanel0 = null;
      try {
        columnPanel0 = new ColumnPanel((JComponent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JMenu jMenu0 = new JMenu("");
      JMenuItem jMenuItem0 = jMenu0.add((Action) null);
      ColumnPanel columnPanel0 = new ColumnPanel(jMenu0);
      columnPanel0.removeColumnsAfter(jMenuItem0);
      assertFalse(columnPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JButton jButton0 = new JButton((Action) null);
      JMenuBar jMenuBar0 = new JMenuBar();
      JMenu jMenu0 = new JMenu("");
      ColumnPanel columnPanel0 = new ColumnPanel(jMenu0);
      columnPanel0.addColumn(jButton0, jMenuBar0);
      columnPanel0.removeColumnsAfter(jMenu0);
      assertFalse(columnPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCheckBox jCheckBox0 = new JCheckBox();
      ColumnPanel columnPanel0 = new ColumnPanel(jCheckBox0);
      ColumnPanel columnPanel1 = new ColumnPanel(jCheckBox0);
      columnPanel0.addColumn(jCheckBox0, jCheckBox0);
      assertFalse(jCheckBox0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JRadioButton jRadioButton0 = new JRadioButton();
      ColumnPanel columnPanel0 = new ColumnPanel(jRadioButton0);
      JToolBar jToolBar0 = new JToolBar();
      columnPanel0.addColumn(jToolBar0, jToolBar0);
      // Undeclared exception!
      try { 
        columnPanel0.addColumn(jRadioButton0, jRadioButton0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.coode.mdock.SplitterNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JOptionPane jOptionPane0 = new JOptionPane();
      ColumnPanel columnPanel0 = new ColumnPanel(jOptionPane0);
      // Undeclared exception!
      try { 
        columnPanel0.addColumn(columnPanel0, jOptionPane0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // adding container's parent to itself
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JCheckBox jCheckBox0 = new JCheckBox();
      ColumnPanel columnPanel0 = new ColumnPanel(jCheckBox0);
      ColumnPanel columnPanel1 = new ColumnPanel(jCheckBox0);
      columnPanel1.addNotify();
      columnPanel1.addColumn(columnPanel0, columnPanel0);
      assertFalse(columnPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JOptionPane jOptionPane0 = new JOptionPane();
      ColumnPanel columnPanel0 = new ColumnPanel(jOptionPane0);
      columnPanel0.ensureVisible(jOptionPane0);
      assertFalse(columnPanel0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        ColumnPanel.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
