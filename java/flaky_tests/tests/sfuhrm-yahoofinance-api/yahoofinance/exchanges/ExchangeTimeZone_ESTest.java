/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 17:36:03 GMT 2022
 */

package yahoofinance.exchanges;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.exchanges.ExchangeTimeZone;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExchangeTimeZone_ESTest extends ExchangeTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExchangeTimeZone.getStockTimeZone((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("yahoofinance.exchanges.ExchangeTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExchangeTimeZone.getStockTimeZone(".");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 0
         //
         verifyException("yahoofinance.exchanges.ExchangeTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeZone timeZone0 = ExchangeTimeZone.get("");
      assertEquals("America/New_York", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeZone timeZone0 = ExchangeTimeZone.getStockTimeZone("w.#W#I$EHxh!:Dkm#1@");
      assertEquals("America/New_York", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TimeZone timeZone0 = ExchangeTimeZone.getStockTimeZone("^SOX");
      assertEquals("America/New_York", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TimeZone timeZone0 = ExchangeTimeZone.getStockTimeZone("VRDQ31");
      assertEquals("America/New_York", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TimeZone timeZone0 = ExchangeTimeZone.get("kg@{%ZRn");
      assertEquals("America/New_York", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ExchangeTimeZone exchangeTimeZone0 = new ExchangeTimeZone();
  }
}
