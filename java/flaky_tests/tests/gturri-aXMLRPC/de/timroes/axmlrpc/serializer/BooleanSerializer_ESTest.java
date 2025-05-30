/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 09:26:02 GMT 2022
 */

package de.timroes.axmlrpc.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.timroes.axmlrpc.serializer.BooleanSerializer;
import de.timroes.axmlrpc.xmlcreator.XmlElement;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BooleanSerializer_ESTest extends BooleanSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanSerializer booleanSerializer0 = new BooleanSerializer();
      // Undeclared exception!
      try { 
        booleanSerializer0.serialize((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.timroes.axmlrpc.serializer.BooleanSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanSerializer booleanSerializer0 = new BooleanSerializer();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        booleanSerializer0.serialize(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Boolean (java.lang.Object and java.lang.Boolean are in module java.base of loader 'bootstrap')
         //
         verifyException("de.timroes.axmlrpc.serializer.BooleanSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      BooleanSerializer booleanSerializer0 = new BooleanSerializer();
      try { 
        booleanSerializer0.deserialize(iIOMetadataNode0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Element must contain only text elements.
         //
         verifyException("de.timroes.axmlrpc.XMLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanSerializer booleanSerializer0 = new BooleanSerializer();
      // Undeclared exception!
      try { 
        booleanSerializer0.deserialize((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.timroes.axmlrpc.serializer.BooleanSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BooleanSerializer booleanSerializer0 = new BooleanSerializer();
      Boolean boolean0 = Boolean.TRUE;
      XmlElement xmlElement0 = booleanSerializer0.serialize(boolean0);
      assertNotNull(xmlElement0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      BooleanSerializer booleanSerializer0 = new BooleanSerializer();
      Object object0 = booleanSerializer0.deserialize(iIOMetadataNode0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BooleanSerializer booleanSerializer0 = new BooleanSerializer();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Object object0 = booleanSerializer0.deserialize(iIOMetadataNode0);
      XmlElement xmlElement0 = booleanSerializer0.serialize(object0);
      assertNotNull(xmlElement0);
  }
}
