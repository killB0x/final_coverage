/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 20:41:55 GMT 2022
 */

package info.michaelwittig.javaq.query.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import info.michaelwittig.javaq.query.TableResult;
import info.michaelwittig.javaq.query.TableRow;
import info.michaelwittig.javaq.query.impl.TableIterator;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TableIterator_ESTest extends TableIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TableIterator tableIterator0 = new TableIterator((TableResult) null);
      TableRow tableRow0 = tableIterator0.next();
      TableRow tableRow1 = tableIterator0.next();
      assertNotSame(tableRow1, tableRow0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TableIterator tableIterator0 = new TableIterator((TableResult) null);
      // Undeclared exception!
      try { 
        tableIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.michaelwittig.javaq.query.impl.TableIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TableIterator tableIterator0 = new TableIterator((TableResult) null);
      // Undeclared exception!
      try { 
        tableIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.michaelwittig.javaq.query.impl.TableIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TableIterator tableIterator0 = new TableIterator((TableResult) null);
      tableIterator0.next();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tableIterator0.forEachRemaining(consumer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.michaelwittig.javaq.query.impl.TableIterator", e);
      }
  }
}
