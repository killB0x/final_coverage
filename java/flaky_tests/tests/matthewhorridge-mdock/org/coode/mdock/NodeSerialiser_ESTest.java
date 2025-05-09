/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 04:58:44 GMT 2022
 */

package org.coode.mdock;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;
import javax.xml.transform.TransformerException;
import org.coode.mdock.ComponentNode;
import org.coode.mdock.ComponentPropertiesFactory;
import org.coode.mdock.Node;
import org.coode.mdock.NodeSerialiser;
import org.coode.mdock.SplitterNode;
import org.coode.mdock.VerticalSplitterNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NodeSerialiser_ESTest extends NodeSerialiser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComponentNode componentNode0 = new ComponentNode();
      StringWriter stringWriter0 = new StringWriter(2);
      NodeSerialiser nodeSerialiser0 = new NodeSerialiser(componentNode0, (ComponentPropertiesFactory) null, stringWriter0);
      nodeSerialiser0.serialise();
      assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<layout>\n    <CNode/>\n</layout>\n", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      LinkedList<Double> linkedList1 = new LinkedList<Double>();
      VerticalSplitterNode verticalSplitterNode0 = new VerticalSplitterNode(linkedList0, linkedList1);
      SplitterNode splitterNode0 = verticalSplitterNode0.createPerpendicularSplitterNode(linkedList0, linkedList1);
      ComponentPropertiesFactory componentPropertiesFactory0 = mock(ComponentPropertiesFactory.class, new ViolatedAssumptionAnswer());
      NodeSerialiser nodeSerialiser0 = new NodeSerialiser(splitterNode0, componentPropertiesFactory0, (Writer) null);
      try { 
        nodeSerialiser0.serialise();
        fail("Expecting exception: TransformerException");
      
      } catch(TransformerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ComponentPropertiesFactory componentPropertiesFactory0 = mock(ComponentPropertiesFactory.class, new ViolatedAssumptionAnswer());
      StringWriter stringWriter0 = new StringWriter(0);
      NodeSerialiser nodeSerialiser0 = new NodeSerialiser((Node) null, componentPropertiesFactory0, stringWriter0);
      // Undeclared exception!
      try { 
        nodeSerialiser0.serialise();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.coode.mdock.NodeSerialiser", e);
      }
  }
}
