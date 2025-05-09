/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 23:42:38 GMT 2022
 */

package jp.co.yahoo.yosegi.message.formatter.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import jp.co.yahoo.yosegi.message.design.ArrayContainerField;
import jp.co.yahoo.yosegi.message.design.LongField;
import jp.co.yahoo.yosegi.message.design.Properties;
import jp.co.yahoo.yosegi.message.design.StructContainerField;
import jp.co.yahoo.yosegi.message.formatter.text.TextStructFormatter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TextStructFormatter_ESTest extends TextStructFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StructContainerField structContainerField0 = new StructContainerField(".#/n7u3");
      ArrayContainerField arrayContainerField0 = new ArrayContainerField(".#/n7u3", structContainerField0);
      structContainerField0.set(arrayContainerField0);
      TextStructFormatter textStructFormatter0 = null;
      try {
        textStructFormatter0 = new TextStructFormatter(structContainerField0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextStructFormatter textStructFormatter0 = null;
      try {
        textStructFormatter0 = new TextStructFormatter((StructContainerField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.message.formatter.text.TextStructFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.set("delimiter", "delimiter");
      StructContainerField structContainerField0 = new StructContainerField("delimiter", properties0);
      TextStructFormatter textStructFormatter0 = null;
      try {
        textStructFormatter0 = new TextStructFormatter(structContainerField0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"delimiter\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StructContainerField structContainerField0 = new StructContainerField("^e\"GbpBR`!.D,.7");
      LongField longField0 = new LongField("^e\"GbpBR`!.D,.7");
      structContainerField0.set(longField0);
      TextStructFormatter textStructFormatter0 = null;
      try {
        textStructFormatter0 = new TextStructFormatter(structContainerField0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Delimiter property is not found. Please set delimiter. Example 0x2c
         //
         verifyException("jp.co.yahoo.yosegi.message.formatter.text.TextStructFormatter", e);
      }
  }
}
