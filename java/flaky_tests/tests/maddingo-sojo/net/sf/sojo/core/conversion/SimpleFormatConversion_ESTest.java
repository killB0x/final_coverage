/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 02:10:22 GMT 2022
 */

package net.sf.sojo.core.conversion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import net.sf.sojo.core.conversion.SimpleFormatConversion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleFormatConversion_ESTest extends SimpleFormatConversion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Class<Object> class0 = Object.class;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      NumberFormat numberFormat0 = mockSimpleDateFormat0.getNumberFormat();
      simpleFormatConversion0.addFormatter(class0, numberFormat0);
      int int0 = simpleFormatConversion0.getFormatterSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        simpleFormatConversion0.convert((Object) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.sojo.core.conversion.SimpleFormatConversion", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Class<Object> class0 = Object.class;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      simpleFormatConversion0.addFormatter(class0, mockSimpleDateFormat0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        simpleFormatConversion0.convert(object0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Date
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      MessageFormat messageFormat0 = new MessageFormat("(#<PGf,.8I3(c");
      Class<MessageFormat> class0 = MessageFormat.class;
      simpleFormatConversion0.addFormatter(class0, messageFormat0);
      Class<Object> class1 = Object.class;
      // Undeclared exception!
      try { 
        simpleFormatConversion0.convert(messageFormat0, class1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.text.MessageFormat cannot be cast to class [Ljava.lang.Object; (java.text.MessageFormat and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Class<MessageFormat> class0 = MessageFormat.class;
      Object object0 = simpleFormatConversion0.convert("", class0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      MessageFormat messageFormat0 = new MessageFormat("(#<PGf,.8I3(c");
      Class<Object> class0 = Object.class;
      Object object0 = simpleFormatConversion0.convert(messageFormat0, class0);
      assertSame(messageFormat0, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Class<Object> class0 = Object.class;
      DateFormat dateFormat0 = DateFormat.getDateInstance();
      simpleFormatConversion0.addFormatter(class0, dateFormat0);
      boolean boolean0 = simpleFormatConversion0.isAssignableTo(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Class<Object> class0 = Object.class;
      boolean boolean0 = simpleFormatConversion0.isAssignableTo(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Locale locale0 = Locale.CANADA;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      simpleFormatConversion0.addFormatter(class0, numberFormat0);
      boolean boolean0 = simpleFormatConversion0.isAssignableFrom(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      boolean boolean0 = simpleFormatConversion0.isAssignableFrom("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      boolean boolean0 = simpleFormatConversion0.isAssignableFrom((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      boolean boolean0 = simpleFormatConversion0.isAssignableFrom(simpleFormatConversion0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      int int0 = simpleFormatConversion0.getFormatterSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Class<Object> class0 = Object.class;
      simpleFormatConversion0.removeFormatterByType(class0);
      assertEquals(0, simpleFormatConversion0.getFormatterSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      SimpleFormatConversion simpleFormatConversion0 = new SimpleFormatConversion();
      Class<MessageFormat> class0 = MessageFormat.class;
      simpleFormatConversion0.addFormatter(class0, mockSimpleDateFormat0);
      // Undeclared exception!
      try { 
        simpleFormatConversion0.convert("", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't convert value:  to: java.text.MessageFormat
         //
         verifyException("net.sf.sojo.core.conversion.SimpleFormatConversion", e);
      }
  }
}
