/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 18:27:38 GMT 2022
 */

package de.chrlembeck.util.swing.action;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.chrlembeck.util.swing.action.DefaultAction;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.KeyStroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultAction_ESTest extends DefaultAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      Integer integer1 = JLayeredPane.MODAL_LAYER;
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(0, (-2474));
      ImageIcon imageIcon0 = new ImageIcon("gY");
      Consumer<ActionEvent> consumer0 = (Consumer<ActionEvent>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      DefaultAction defaultAction0 = new DefaultAction("gY", "gY", "gY", integer0, integer1, keyStroke0, imageIcon0, imageIcon0, consumer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(114, 0, false);
      ImageIcon imageIcon0 = new ImageIcon();
      Consumer<ActionEvent> consumer0 = (Consumer<ActionEvent>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      DefaultAction defaultAction0 = new DefaultAction("Name", "A$", "+tip4", integer0, integer0, keyStroke0, imageIcon0, (Icon) null, consumer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultAction defaultAction0 = null;
      try {
        defaultAction0 = new DefaultAction((Consumer<ActionEvent>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Consumer<ActionEvent> consumer0 = (Consumer<ActionEvent>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      DefaultAction defaultAction0 = new DefaultAction(consumer0);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, (-539), "", (-539));
      defaultAction0.actionPerformed(actionEvent0);
      assertEquals("", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      ImageIcon imageIcon0 = new ImageIcon("'q0b_%#(a+j(i", "");
      DefaultAction defaultAction0 = null;
      try {
        defaultAction0 = new DefaultAction("", "", "", integer0, integer0, (KeyStroke) null, imageIcon0, imageIcon0, (Consumer<ActionEvent>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
