/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 08:49:22 GMT 2022
 */

package com.acidmanic.consoletools.rendering.sizing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.acidmanic.consoletools.drawing.AsciiBorder;
import com.acidmanic.consoletools.drawing.Padding;
import com.acidmanic.consoletools.drawing.Size;
import com.acidmanic.consoletools.rendering.Box;
import com.acidmanic.consoletools.rendering.RenderingContext;
import com.acidmanic.consoletools.rendering.StringRenderable;
import com.acidmanic.consoletools.rendering.componentfeatures.Renderable;
import com.acidmanic.consoletools.rendering.sizing.SizeAutomation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SizeAutomation_ESTest extends SizeAutomation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      assertEquals((-1), sizeAutomation0.getLines());
      assertEquals((-1), sizeAutomation0.getColumns());
      
      sizeAutomation0.setColumns(3602);
      sizeAutomation0.setColumns(1762);
      StringRenderable stringRenderable0 = new StringRenderable("");
      stringRenderable0.measure();
      sizeAutomation0.setColumns(3602);
      sizeAutomation0.measure(stringRenderable0);
      stringRenderable0.measure();
      sizeAutomation0.measure(stringRenderable0);
      Box box0 = new Box(stringRenderable0);
      sizeAutomation0.measure(box0);
      Box box1 = new Box(box0);
      box0.measure();
      box0.setContent(box1);
      // Undeclared exception!
      try { 
        sizeAutomation0.measure(box1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      StringRenderable stringRenderable0 = new StringRenderable("W%L>,FP");
      RenderingContext<Integer, Integer> renderingContext0 = (RenderingContext<Integer, Integer>) mock(RenderingContext.class, new ViolatedAssumptionAnswer());
      stringRenderable0.render(renderingContext0);
      RenderingContext<Object, Object> renderingContext1 = (RenderingContext<Object, Object>) mock(RenderingContext.class, new ViolatedAssumptionAnswer());
      RenderingContext<Integer, Object> renderingContext2 = (RenderingContext<Integer, Object>) mock(RenderingContext.class, new ViolatedAssumptionAnswer());
      sizeAutomation0.setLines((-5463));
      stringRenderable0.render(renderingContext2);
      stringRenderable0.render(renderingContext1);
      sizeAutomation0.measure(stringRenderable0);
      sizeAutomation0.measure(stringRenderable0);
      StringRenderable stringRenderable1 = new StringRenderable("");
      int int0 = 0;
      stringRenderable0.measure();
      sizeAutomation0.setLines(0);
      stringRenderable1.setContent("");
      stringRenderable0.setContent("");
      Box box0 = new Box(stringRenderable1);
      // Undeclared exception!
      try { 
        box0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.acidmanic.consoletools.drawing.AsciiBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      sizeAutomation0.setLines(0);
      sizeAutomation0.getLines();
      sizeAutomation0.setColumns(1);
      StringRenderable stringRenderable0 = new StringRenderable("j8R$=S33olW{");
      Box box0 = new Box(stringRenderable0);
      sizeAutomation0.measure(box0);
      RenderingContext<Object, Object> renderingContext0 = (RenderingContext<Object, Object>) mock(RenderingContext.class, new ViolatedAssumptionAnswer());
      stringRenderable0.render(renderingContext0);
      Box box1 = new Box(box0);
      box1.getBorder();
      box0.setBorder((AsciiBorder) null);
      Padding padding0 = box0.getMargins();
      box0.setBorder((AsciiBorder) null);
      padding0.setLeft(0);
      box0.setPadding(padding0);
      sizeAutomation0.setLines(0);
      sizeAutomation0.measure(box0);
      sizeAutomation0.measure(box1);
      int int0 = sizeAutomation0.getColumns();
      assertEquals(0, sizeAutomation0.getLines());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      assertEquals((-1), sizeAutomation0.getLines());
      
      sizeAutomation0.setLines(0);
      StringRenderable stringRenderable0 = new StringRenderable("3>c49Bwp#Zqap(`[v");
      Size size0 = sizeAutomation0.measure(stringRenderable0);
      assertEquals(17, size0.getColumns());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      sizeAutomation0.setLines(32);
      sizeAutomation0.getLines();
      sizeAutomation0.setColumns(32);
      StringRenderable stringRenderable0 = new StringRenderable("'[SqR`IYJ>Fd{");
      sizeAutomation0.measure(stringRenderable0);
      sizeAutomation0.setColumns(0);
      StringRenderable stringRenderable1 = new StringRenderable("");
      sizeAutomation0.measure(stringRenderable1);
      sizeAutomation0.measure((Renderable) null);
      sizeAutomation0.measure((Renderable) null);
      sizeAutomation0.getColumns();
      sizeAutomation0.getColumns();
      sizeAutomation0.setLines(1495);
      sizeAutomation0.measure((Renderable) null);
      sizeAutomation0.measure((Renderable) null);
      sizeAutomation0.setLines(0);
      sizeAutomation0.setColumns(1495);
      sizeAutomation0.measure((Renderable) null);
      sizeAutomation0.setLines(32);
      sizeAutomation0.getLines();
      sizeAutomation0.setColumns(32);
      sizeAutomation0.setLines((-1396));
      sizeAutomation0.getLines();
      sizeAutomation0.getColumns();
      sizeAutomation0.measure((Renderable) null);
      assertEquals((-1396), sizeAutomation0.getLines());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      // Undeclared exception!
      try { 
        sizeAutomation0.measure((Renderable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.acidmanic.consoletools.rendering.sizing.SizeAutomation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      int int0 = sizeAutomation0.getColumns();
      assertEquals((-1), int0);
      assertEquals((-1), sizeAutomation0.getLines());
      
      sizeAutomation0.setLines((-1));
      assertEquals((-1), sizeAutomation0.getLines());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      StringRenderable stringRenderable0 = new StringRenderable("com.acidmanic.consoletools.drawing.Padding");
      stringRenderable0.measure();
      Box box0 = new Box(stringRenderable0);
      sizeAutomation0.measure(box0);
      int int0 = 1;
      sizeAutomation0.setLines(1);
      sizeAutomation0.getLines();
      int int1 = 3746;
      sizeAutomation0.setLines(3746);
      String string0 = "F%4B7wX7*m(km7olYF:";
      StringRenderable stringRenderable1 = new StringRenderable("F%4B7wX7*m(km7olYF:");
      sizeAutomation0.setColumns(1);
      sizeAutomation0.setLines(1);
      int int2 = 1;
      // Undeclared exception!
      try { 
        stringRenderable1.render((RenderingContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.acidmanic.consoletools.rendering.StringRenderable", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      StringRenderable stringRenderable0 = new StringRenderable("");
      Size size0 = sizeAutomation0.measure(stringRenderable0);
      assertEquals((-1), sizeAutomation0.getColumns());
      assertEquals(1, size0.getLines());
      assertEquals(0, size0.getColumns());
      assertEquals((-1), sizeAutomation0.getLines());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      sizeAutomation0.setColumns((-1090));
      StringRenderable stringRenderable0 = new StringRenderable("");
      sizeAutomation0.measure(stringRenderable0);
      assertEquals((-1090), sizeAutomation0.getColumns());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      sizeAutomation0.setColumns((-645));
      sizeAutomation0.setLines((-645));
      sizeAutomation0.measure((Renderable) null);
      assertEquals((-645), sizeAutomation0.getLines());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      sizeAutomation0.setColumns(1184);
      // Undeclared exception!
      try { 
        sizeAutomation0.measure((Renderable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.acidmanic.consoletools.rendering.sizing.SizeAutomation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      sizeAutomation0.setLines((-1));
      assertEquals((-1), sizeAutomation0.getColumns());
      assertEquals((-1), sizeAutomation0.getLines());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Box box0 = new Box((Renderable) null);
      int int0 = box0.getHeight();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      StringRenderable stringRenderable0 = new StringRenderable("");
      stringRenderable0.measure();
      stringRenderable0.setContent("KyPoBr!:c&l%1K$usf");
      sizeAutomation0.setLines(1217);
      sizeAutomation0.measure(stringRenderable0);
      sizeAutomation0.measure(stringRenderable0);
      int int0 = sizeAutomation0.getLines();
      assertEquals(1217, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      sizeAutomation0.setColumns((-1));
      assertEquals((-1), sizeAutomation0.getLines());
      assertEquals((-1), sizeAutomation0.getColumns());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SizeAutomation sizeAutomation0 = new SizeAutomation();
      sizeAutomation0.setColumns(2047);
      StringRenderable stringRenderable0 = new StringRenderable("wc]:esrZ7");
      sizeAutomation0.measure(stringRenderable0);
      RenderingContext<Object, Object> renderingContext0 = (RenderingContext<Object, Object>) mock(RenderingContext.class, new ViolatedAssumptionAnswer());
      stringRenderable0.render(renderingContext0);
      sizeAutomation0.measure(stringRenderable0);
      stringRenderable0.measure();
      sizeAutomation0.setLines(32);
      sizeAutomation0.measure(stringRenderable0);
      sizeAutomation0.getColumns();
      sizeAutomation0.measure(stringRenderable0);
      sizeAutomation0.measure(stringRenderable0);
      RenderingContext<Object, Object> renderingContext1 = (RenderingContext<Object, Object>) mock(RenderingContext.class, new ViolatedAssumptionAnswer());
      sizeAutomation0.setColumns((-192));
      stringRenderable0.render(renderingContext1);
      sizeAutomation0.setLines((-1));
      sizeAutomation0.measure(stringRenderable0);
      sizeAutomation0.setColumns(2047);
      sizeAutomation0.getLines();
      sizeAutomation0.measure(stringRenderable0);
      int int0 = sizeAutomation0.getColumns();
      assertEquals(2047, int0);
  }
}
