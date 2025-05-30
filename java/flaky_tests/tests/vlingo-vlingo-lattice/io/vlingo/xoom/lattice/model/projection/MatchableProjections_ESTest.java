/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 12:02:32 GMT 2022
 */

package io.vlingo.xoom.lattice.model.projection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.vlingo.xoom.lattice.model.projection.MatchableProjections;
import io.vlingo.xoom.lattice.model.projection.Projection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MatchableProjections_ESTest extends MatchableProjections_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      String[] stringArray0 = new String[1];
      String[] stringArray1 = new String[1];
      stringArray1[0] = "*ISO+*OY'";
      matchableProjections0.mayDispatchTo((Projection) null, stringArray1);
      // Undeclared exception!
      try { 
        matchableProjections0.matchProjections(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      String[] stringArray0 = new String[4];
      stringArray0[0] = ".";
      stringArray0[1] = "*";
      stringArray0[2] = "*qv{qH23*";
      stringArray0[3] = ".";
      matchableProjections0.mayDispatchTo((Projection) null, stringArray0);
      String[] stringArray1 = new String[0];
      List<Projection> list0 = matchableProjections0.matchProjections(stringArray1);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      Projection projection0 = mock(Projection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(projection0).toString();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "d ";
      stringArray0[1] = "d ";
      stringArray0[2] = "*jonqI)0bFus}U~*;";
      stringArray0[3] = "MatchableProjections[{}]";
      matchableProjections0.mayDispatchTo(projection0, stringArray0);
      List<Projection> list0 = matchableProjections0.matchProjections(stringArray0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      Projection projection0 = mock(Projection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(projection0).toString();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "*9 1't{X[j'";
      stringArray0[1] = "*qv{qH23*";
      stringArray0[2] = ".";
      stringArray0[3] = "*";
      stringArray0[4] = "e_+";
      stringArray0[5] = ".";
      stringArray0[6] = "S";
      stringArray0[7] = "io.vlingo.xoom.lattice.model.projection.TextProjectable";
      stringArray0[8] = "io.vlingo.xoom.lattice.model.projection.TextProjectable";
      matchableProjections0.mayDispatchTo(projection0, stringArray0);
      List<Projection> list0 = matchableProjections0.matchProjections(stringArray0);
      assertEquals(9, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "[*";
      stringArray0[1] = "*";
      matchableProjections0.mayDispatchTo((Projection) null, stringArray0);
      List<Projection> list0 = matchableProjections0.matchProjections(stringArray0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "[*";
      stringArray0[1] = "[*";
      stringArray0[2] = "[*";
      stringArray0[3] = "[*";
      stringArray0[4] = "[*";
      stringArray0[5] = "[*";
      stringArray0[6] = "[*";
      stringArray0[7] = "*";
      matchableProjections0.mayDispatchTo((Projection) null, stringArray0);
      String[] stringArray1 = new String[0];
      List<Projection> list0 = matchableProjections0.matchProjections(stringArray1);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*";
      stringArray0[1] = "*";
      stringArray0[2] = "";
      matchableProjections0.mayDispatchTo((Projection) null, stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "[*";
      // Undeclared exception!
      try { 
        matchableProjections0.mayDispatchTo((Projection) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MatchableProjections matchableProjections0 = new MatchableProjections();
      Projection projection0 = mock(Projection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(projection0).toString();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "*9 1't{X[j'";
      stringArray0[1] = "*qv{qH23*";
      stringArray0[2] = ".";
      stringArray0[3] = "*";
      stringArray0[4] = "e_+";
      stringArray0[5] = ".";
      stringArray0[6] = "S";
      stringArray0[7] = "io.vlingo.xoom.lattice.model.projection.TextProjectable";
      stringArray0[8] = "io.vlingo.xoom.lattice.model.projection.TextProjectable";
      matchableProjections0.mayDispatchTo(projection0, stringArray0);
      String string0 = matchableProjections0.toString();
      assertEquals("MatchableProjections[{ContainsCause[value=qv{qH23]=[null], ContainsCause[value=]=[null], EntireCause[value=e_+]=[null], EntireCause[value=.]=[null, null], EndsWithCause[value=9 1't{X[j']=[null], EntireCause[value=io.vlingo.xoom.lattice.model.projection.TextProjectable]=[null, null], EntireCause[value=S]=[null]}]", string0);
  }
}
