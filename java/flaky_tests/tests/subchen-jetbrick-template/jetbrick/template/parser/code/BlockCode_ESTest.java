/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 11:35:22 GMT 2022
 */

package jetbrick.template.parser.code;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jetbrick.template.parser.code.BlockCode;
import jetbrick.template.parser.code.Code;
import jetbrick.template.parser.code.MacroCode;
import jetbrick.template.parser.code.MethodCode;
import jetbrick.template.parser.code.ScopeCode;
import jetbrick.template.parser.code.SegmentListCode;
import jetbrick.template.parser.code.TagCode;
import jetbrick.template.parser.code.TemplateClassCode;
import jetbrick.template.parser.support.TypedKlass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BlockCode_ESTest extends BlockCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockCode blockCode0 = new BlockCode(60, (String) null);
      blockCode0.addLine((String) null);
      BlockCode blockCode1 = new BlockCode(60, (String) null);
      blockCode0.addChild(blockCode1);
      blockCode1.addChild(blockCode0);
      blockCode0.addChild(blockCode1);
      // Undeclared exception!
      try { 
        blockCode0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "JcC~E7w{Q~,$Mw";
      BlockCode blockCode0 = new BlockCode(0, "JcC~E7w{Q~,$Mw");
      blockCode0.addLine("JcC~E7w{Q~,$Mw");
      blockCode0.toString();
      TemplateClassCode templateClassCode0 = new TemplateClassCode();
      MethodCode methodCode0 = templateClassCode0.getMethodCode();
      TagCode tagCode0 = new TagCode(methodCode0, "'9J9+|9");
      blockCode0.addChild(tagCode0);
      // Undeclared exception!
      try { 
        blockCode0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.parser.code.ScopeCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BlockCode blockCode0 = null;
      try {
        blockCode0 = new BlockCode((-1674), "c4j5Az=q/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1674
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TemplateClassCode templateClassCode0 = new TemplateClassCode();
      MethodCode methodCode0 = templateClassCode0.getMethodCode();
      BlockCode blockCode0 = methodCode0.createBlockCode(8);
      blockCode0.addChild(methodCode0);
      // Undeclared exception!
      try { 
        blockCode0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.parser.code.ScopeCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BlockCode blockCode0 = new BlockCode(2727, "");
      SegmentListCode segmentListCode0 = new SegmentListCode(2727);
      blockCode0.addChild(segmentListCode0);
      assertEquals(0, segmentListCode0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BlockCode blockCode0 = new BlockCode(756, "");
      blockCode0.addLine("");
      String string0 = blockCode0.toString();
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BlockCode blockCode0 = new BlockCode(0, "((o");
      String string0 = blockCode0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BlockCode blockCode0 = new BlockCode(2, (String) null);
      blockCode0.addLine((String) null);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MethodCode methodCode0 = new MethodCode((ScopeCode) null, "", true);
      BlockCode blockCode0 = methodCode0.createBlockCode(8);
      blockCode0.toString();
      blockCode0.toString();
      TypedKlass typedKlass0 = TypedKlass.Object;
      typedKlass0.asUnboxedTypedKlass();
      typedKlass0.asUnboxedTypedKlass();
      blockCode0.addLine("");
      methodCode0.addContext("context", typedKlass0);
      methodCode0.setBodyCode((Code) null);
      blockCode0.addLine("k!cRdEK.6~iAx$3");
      blockCode0.addChild(methodCode0);
      // Undeclared exception!
      try { 
        blockCode0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.parser.code.ScopeCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int int0 = 0;
      BlockCode blockCode0 = new BlockCode(0, "72<-{?L'X%VSs4");
      blockCode0.toString();
      String string0 = null;
      blockCode0.addLine((String) null);
      TemplateClassCode templateClassCode0 = new TemplateClassCode();
      MethodCode methodCode0 = templateClassCode0.getMethodCode();
      MacroCode macroCode0 = new MacroCode(methodCode0);
      SegmentListCode segmentListCode0 = new SegmentListCode(0);
      // Undeclared exception!
      try { 
        segmentListCode0.getChild((-1333));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1333
         //
         verifyException("java.util.Collections$EmptyList", e);
      }
  }
}
