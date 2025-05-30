/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 23:27:25 GMT 2022
 */

package de.timroes.axmlrpc.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.timroes.axmlrpc.serializer.DateTimeSerializer;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateTimeSerializer_ESTest extends DateTimeSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(true);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      try { 
        dateTimeSerializer0.deserialize((Element) iIOMetadataNode0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Element must contain only text elements.
         //
         verifyException("de.timroes.axmlrpc.XMLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(true);
      // Undeclared exception!
      try { 
        dateTimeSerializer0.deserialize((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.timroes.axmlrpc.serializer.DateTimeSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(false);
      // Undeclared exception!
      try { 
        dateTimeSerializer0.deserialize("Zl*baFv");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // fr/turri/jiso8601/Iso8601Deserializer
         //
         verifyException("de.timroes.axmlrpc.serializer.DateTimeSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(true);
      Object object0 = dateTimeSerializer0.deserialize("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(true);
      // Undeclared exception!
      try { 
        dateTimeSerializer0.deserialize(">");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // fr/turri/jiso8601/Iso8601Deserializer
         //
         verifyException("de.timroes.axmlrpc.serializer.DateTimeSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(true);
      Object object0 = dateTimeSerializer0.deserialize((String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(false);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try { 
        dateTimeSerializer0.deserialize((Element) iIOMetadataNode0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // fr/turri/jiso8601/Iso8601Deserializer
         //
         verifyException("de.timroes.axmlrpc.serializer.DateTimeSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(true);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateTimeSerializer0.serialize(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Date
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeSerializer dateTimeSerializer0 = new DateTimeSerializer(true);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Object object0 = dateTimeSerializer0.deserialize((Element) iIOMetadataNode0);
      assertNull(object0);
  }
}
