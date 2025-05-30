/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:23:54 GMT 2022
 */

package jaskell.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.script.Directive;
import jaskell.script.Parameter;
import jaskell.sql.Count;
import jaskell.sql.Delete;
import jaskell.sql.Func;
import jaskell.sql.Literal;
import jaskell.sql.Name;
import jaskell.sql.Offset;
import jaskell.sql.Quot;
import jaskell.sql.Update;
import jaskell.sql.Using;
import jaskell.sql.Where;
import java.sql.Connection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Update_ESTest extends Update_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Name name0 = new Name("");
      Quot quot0 = new Quot("");
      Literal.Alias literal_Alias0 = name0.as((Name) quot0);
      Update.Set update_Set0 = new Update.Set("", literal_Alias0);
      Update.Set update_Set1 = update_Set0.set((Directive) name0, (Directive) literal_Alias0);
      assertSame(update_Set0, update_Set1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Update update0 = new Update("E{.}@jAnZ");
      Update.Equation update_Equation0 = new Update.Equation("E{.}@jAnZ", update0);
      Update.Set update_Set0 = update0.set("Sz5A>0NE0eG", (Directive) update_Equation0);
      Count count0 = new Count();
      Where where0 = update_Set0.where(count0);
      Update.Set update_Set1 = update0.set((Directive) where0, (Directive) update_Equation0);
      assertNotSame(update_Set0, update_Set1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Update update0 = new Update("E{.}@jAnZ");
      Update.Equation update_Equation0 = new Update.Equation("E{.}@jAnZ", update0);
      String string0 = update_Equation0.script();
      assertEquals("E{.}@jAnZ=UPDATE E{.}@jAnZ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Update update0 = new Update("E{.}@jAnZ");
      Update.Equation update_Equation0 = new Update.Equation("E{.}@jAnZ", update0);
      List<Parameter<?>> list0 = update_Equation0.parameters();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Update update0 = new Update("E{.}@jAnZ");
      Update.Equation update_Equation0 = new Update.Equation("E{.}@jAnZ", update0);
      Update.Set update_Set0 = update0.set("Sz5A>0NE0eG", (Directive) update_Equation0);
      String string0 = update_Set0.script();
      assertEquals("UPDATE E{.}@jAnZ set Sz5A>0NE0eG=E{.}@jAnZ=UPDATE E{.}@jAnZ", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Update update0 = new Update("");
      Update.Set update_Set0 = new Update.Set(update0, update0);
      // Undeclared exception!
      try { 
        update_Set0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Update$Set", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Update update0 = new Update("jG,)^9AJ)p'^8");
      Directive[] directiveArray0 = new Directive[9];
      Func func0 = new Func("Us6|", directiveArray0);
      Delete.Where delete_Where0 = new Delete.Where(update0, func0);
      Offset offset0 = delete_Where0.offset((Directive) null);
      Update.Set update_Set0 = update0.set("jG,)^9AJ)p'^8", (Directive) offset0);
      Using using0 = update_Set0.using(directiveArray0);
      assertNotNull(using0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Quot quot0 = new Quot("LK", "\"S) \"R<|vD9Ivq.qh", "TuwSS'PRDxodK");
      Update update0 = new Update(quot0);
      Update.Set update_Set0 = update0.set("", (Directive) quot0);
      // Undeclared exception!
      try { 
        update_Set0.prepare((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Statement", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Update update0 = new Update((Name) null);
      // Undeclared exception!
      try { 
        update0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Update", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Update update0 = new Update((Name) null);
      // Undeclared exception!
      try { 
        update0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Update", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Name name0 = new Name();
      Update update0 = new Update(name0);
      Update.Set update_Set0 = update0.set("YRY#<(GSuW:T|$mb-F", (Directive) name0);
      Using using0 = update_Set0.using("YRY#<(GSuW:T|$mb-F");
      assertNotNull(using0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Update update0 = new Update("(7aFvw\"[HeJ:bl7Hk.");
      Update.Set update_Set0 = new Update.Set(update0, update0);
      String[] stringArray0 = new String[1];
      Using using0 = update_Set0.using(stringArray0);
      assertNotNull(using0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Update update0 = new Update("R");
      String string0 = update0.script();
      assertEquals("UPDATE R", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Update update0 = new Update("jaskell.sql.Select$From");
      List<Parameter<?>> list0 = update0.parameters();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Name name0 = new Name();
      Update update0 = new Update(name0);
      Update.Set update_Set0 = update0.set("YRY#<(GSuW:T|$mb-F", (Directive) name0);
      Object object0 = new Object();
      try { 
        update_Set0.setParameter(object0, (Object) update0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parameter named java.lang.Object@df150ae not found
         //
         verifyException("jaskell.sql.Statement", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Name name0 = new Name("#cq&'iW$u7*=Zf");
      Update update0 = new Update(name0);
      Update.Set update_Set0 = update0.set("#cq&'iW$u7*=Zf", (Directive) name0);
      Update.Set update_Set1 = update_Set0.set("#cq&'iW$u7*=Zf", (Directive) name0);
      assertSame(update_Set1, update_Set0);
  }
}
