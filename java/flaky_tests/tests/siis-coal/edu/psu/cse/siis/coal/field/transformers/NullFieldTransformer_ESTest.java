/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 02:34:18 GMT 2022
 */

package edu.psu.cse.siis.coal.field.transformers;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.psu.cse.siis.coal.field.transformers.FieldTransformer;
import edu.psu.cse.siis.coal.field.transformers.NullFieldTransformer;
import edu.psu.cse.siis.coal.field.values.FieldValue;
import edu.psu.cse.siis.coal.field.values.NullFieldValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NullFieldTransformer_ESTest extends NullFieldTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullFieldTransformer nullFieldTransformer0 = NullFieldTransformer.v();
      FieldTransformer fieldTransformer0 = nullFieldTransformer0.compose((FieldTransformer) null);
      assertNull(fieldTransformer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NullFieldTransformer nullFieldTransformer0 = NullFieldTransformer.v();
      NullFieldValue nullFieldValue0 = NullFieldValue.v();
      FieldValue fieldValue0 = nullFieldTransformer0.apply(nullFieldValue0);
      assertFalse(fieldValue0.hasTransformerSequence());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NullFieldTransformer nullFieldTransformer0 = NullFieldTransformer.v();
      FieldTransformer fieldTransformer0 = nullFieldTransformer0.compose(nullFieldTransformer0);
      assertSame(nullFieldTransformer0, fieldTransformer0);
  }
}
