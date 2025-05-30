/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 17:55:08 GMT 2022
 */

package ciir.umass.edu.learning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ciir.umass.edu.learning.CoorAscent;
import ciir.umass.edu.learning.RankList;
import ciir.umass.edu.learning.Ranker;
import ciir.umass.edu.learning.RankerFactory;
import ciir.umass.edu.learning.RankerType;
import ciir.umass.edu.learning.boosting.RankBoost;
import ciir.umass.edu.metric.APScorer;
import ciir.umass.edu.metric.BestAtKScorer;
import ciir.umass.edu.metric.DCGScorer;
import ciir.umass.edu.metric.MetricScorer;
import ciir.umass.edu.metric.PrecisionScorer;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RankerFactory_ESTest extends RankerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      rankerFactory0.register("gv5^\rd{^M", "");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker("ciir.umass.edu.learning.Ranker");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create objects from the class \"ciir.umass.edu.learning.Ranker\" you specified.
         //
         verifyException("ciir.umass.edu.utilities.RankLibError", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      LinkedList<RankList> linkedList0 = new LinkedList<RankList>();
      int[] intArray0 = new int[9];
      BestAtKScorer bestAtKScorer0 = new BestAtKScorer();
      Ranker ranker0 = rankerFactory0.createRanker("LINEAR_REGRESSION", (List<RankList>) linkedList0, intArray0, (MetricScorer) bestAtKScorer0);
      assertEquals(0.0, ranker0.getScoreOnValidationData(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      rankerFactory0.map = null;
      // Undeclared exception!
      try { 
        rankerFactory0.register("\n", "\n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ciir.umass.edu.learning.RankerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      // Undeclared exception!
      try { 
        rankerFactory0.loadRankerFromString("Could find the class \"");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("PwsR");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "[&(?");
      // Undeclared exception!
      try { 
        rankerFactory0.loadRankerFromFile("PwsR");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      LinkedList<RankList> linkedList0 = new LinkedList<RankList>();
      int[] intArray0 = new int[0];
      PrecisionScorer precisionScorer0 = new PrecisionScorer();
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker((String) null, (List<RankList>) linkedList0, intArray0, (MetricScorer) precisionScorer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      LinkedList<RankList> linkedList0 = new LinkedList<RankList>();
      int[] intArray0 = new int[4];
      APScorer aPScorer0 = new APScorer();
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker("ciir.umass.edu.metric.DCGScorer", (List<RankList>) linkedList0, intArray0, (MetricScorer) aPScorer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class ciir.umass.edu.metric.DCGScorer cannot be cast to class ciir.umass.edu.learning.Ranker (ciir.umass.edu.metric.DCGScorer and ciir.umass.edu.learning.Ranker are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @7e35f626)
         //
         verifyException("ciir.umass.edu.learning.RankerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker("C.E. Loss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could find the class \"C.E. Loss\" you specified. Make sure the jar library is in your classpath.
         //
         verifyException("ciir.umass.edu.utilities.RankLibError", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker("ciir.umass.edu.learning.RankerFactory");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class ciir.umass.edu.learning.RankerFactory cannot be cast to class ciir.umass.edu.learning.Ranker (ciir.umass.edu.learning.RankerFactory and ciir.umass.edu.learning.Ranker are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @7e35f626)
         //
         verifyException("ciir.umass.edu.learning.RankerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      RankerType rankerType0 = RankerType.MART;
      LinkedList<RankList> linkedList0 = new LinkedList<RankList>();
      int[] intArray0 = new int[2];
      PrecisionScorer precisionScorer0 = new PrecisionScorer(0);
      Ranker[] rankerArray0 = new Ranker[0];
      rankerFactory0.rFactory = rankerArray0;
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker(rankerType0, (List<RankList>) linkedList0, intArray0, (MetricScorer) precisionScorer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("ciir.umass.edu.learning.RankerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker((RankerType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ciir.umass.edu.learning.RankerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      Ranker[] rankerArray0 = new Ranker[0];
      rankerFactory0.rFactory = rankerArray0;
      RankerType rankerType0 = RankerType.LISTNET;
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker(rankerType0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 0
         //
         verifyException("ciir.umass.edu.learning.RankerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      RankBoost rankBoost0 = (RankBoost)rankerFactory0.createRanker("ciir.umass.edu.learning.boosting.RankBoost");
      assertEquals(300, RankBoost.nIteration);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      RankerType rankerType0 = RankerType.COOR_ASCENT;
      CoorAscent coorAscent0 = (CoorAscent)rankerFactory0.createRanker(rankerType0);
      assertEquals(0.05, CoorAscent.stepBase, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      // Undeclared exception!
      try { 
        rankerFactory0.loadRankerFromFile("H");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.FileNotFoundException
         //
         verifyException("ciir.umass.edu.utilities.RankLibError", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      // Undeclared exception!
      try { 
        rankerFactory0.loadRankerFromString("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("ciir.umass.edu.utilities.RankLibError", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      LinkedList<RankList> linkedList0 = new LinkedList<RankList>();
      int[] intArray0 = new int[9];
      APScorer aPScorer0 = new APScorer();
      // Undeclared exception!
      try { 
        rankerFactory0.createRanker("ciir.umass.edu.utilities.SimpleMath", (List<RankList>) linkedList0, intArray0, (MetricScorer) aPScorer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The class \"ciir.umass.edu.utilities.SimpleMath\" does not implement the Ranker interface.
         //
         verifyException("ciir.umass.edu.utilities.RankLibError", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RankerFactory rankerFactory0 = new RankerFactory();
      RankerType rankerType0 = RankerType.ADARANK;
      int[] intArray0 = new int[0];
      DCGScorer dCGScorer0 = new DCGScorer();
      Ranker ranker0 = rankerFactory0.createRanker(rankerType0, (List<RankList>) null, intArray0, (MetricScorer) dCGScorer0);
      assertEquals(0.0, ranker0.getScoreOnTrainingData(), 0.01);
  }
}
