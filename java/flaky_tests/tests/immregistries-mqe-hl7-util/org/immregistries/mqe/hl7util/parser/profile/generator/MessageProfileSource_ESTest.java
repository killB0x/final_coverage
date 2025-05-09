/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 10:42:42 GMT 2022
 */

package org.immregistries.mqe.hl7util.parser.profile.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.immregistries.mqe.hl7util.parser.profile.generator.FieldComplexity;
import org.immregistries.mqe.hl7util.parser.profile.generator.MessageProfileSource;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MessageProfileSource_ESTest extends MessageProfileSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource();
      // Undeclared exception!
      try { 
        messageProfileSource0.populateVXUProfileMap((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = null;
      try {
        messageProfileSource0 = new MessageProfileSource((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.immregistries.mqe.hl7util.parser.profile.generator.MessageProfileSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource(";!gjR{Q");
      messageProfileSource0.populateVXUProfileMap("org.immregistries.mqe.hl7util.parser.profile.ack.generated.AckConformanceProfile$Messages$Message");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource("X;");
      messageProfileSource0.populateAckProfileMap("org.immregistries.mqe.hl7util.parser.profile.ack.generated.AckConformanceProfile$Datatypes");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource(";!gjR{Q");
      messageProfileSource0.populateVXUProfileMap("");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource(";!gjR{Q");
      messageProfileSource0.populateAckProfileMap("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource("QBP");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource("ACK");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource();
      // Undeclared exception!
      try { 
        messageProfileSource0.populateAckProfileMap((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource("org.immregistries.mqe.hl7util.parser.profile.ack.generated.AckConformanceProfile$Datatypes$Datatype$DataTypeComponent");
      Map<String, FieldComplexity> map0 = messageProfileSource0.getDataTypeComplexityMap();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource("org.immregistries.mqe.hl7util.parser.profile.ack.generated.AckConformanceProfile$Datatypes$Datatype$DataTypeComponent");
      Map<String, String> map0 = messageProfileSource0.getFieldDescriptionMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource("org.immregistries.mqe.hl7util.parser.profile.ack.generated.AckConformanceProfile$Datatypes$Datatype$DataTypeComponent");
      messageProfileSource0.populateProfileMap();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageProfileSource messageProfileSource0 = new MessageProfileSource("org.immregistries.mqe.hl7util.parser.profile.ack.generated.AckConformanceProfile$Datatypes$Datatype$DataTypeComponent");
      Map<String, String> map0 = messageProfileSource0.getFieldDataTypeMap();
      assertFalse(map0.isEmpty());
  }
}
