/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:37:55 GMT 2022
 */

package casmi.graphics.object;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import casmi.graphics.Graphics;
import casmi.graphics.object.Frustum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Frustum_ESTest extends Frustum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frustum frustum0 = new Frustum(0.0, 0.0, (-1525.2384804974856), (-1525.2384804974856), (-1525.2384804974856), (-1.0));
      frustum0.set((-1525.2384804974856), (-1525.2384804974856), 1.0, (-1.0E10), (-453.60780479), (-684.955));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Frustum frustum0 = new Frustum(0.0, 0.0, (-1525.2384804974856), (-1525.2384804974856), (-1525.2384804974856), (-1.0));
      frustum0.set(1520.7014918, 0.0, 0.0, (-1525.2384804974856), (-1525.2384804974856), (-1.0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Frustum frustum0 = new Frustum(0.0, 0.0, 0.0, (-2494.6315737), (-2494.6315737), 0.0);
      frustum0.set(0.0, (-2494.6315737), (-2494.6315737), 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Frustum frustum0 = new Frustum(1968.8202796938, 10.0, (-1.0E10), 1968.8202796938, 2.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Frustum frustum0 = new Frustum();
      // Undeclared exception!
      try { 
        frustum0.projectForSelection((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("casmi.graphics.object.Frustum", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Frustum frustum0 = new Frustum((-1877.6073), (-1877.6073), (-1877.6073), (-1877.6073), (-1877.6073), (-1877.6073));
      // Undeclared exception!
      try { 
        frustum0.projectForSelection((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("casmi.graphics.object.Frustum", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Frustum frustum0 = new Frustum();
      // Undeclared exception!
      try { 
        frustum0.project((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("casmi.graphics.object.Frustum", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Frustum frustum0 = new Frustum((-1353.69073096), (-1353.69073096), (-1353.69073096), (-1353.69073096), (-1353.69073096), (-1353.69073096));
      // Undeclared exception!
      try { 
        frustum0.project((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("casmi.graphics.object.Frustum", e);
      }
  }
}
