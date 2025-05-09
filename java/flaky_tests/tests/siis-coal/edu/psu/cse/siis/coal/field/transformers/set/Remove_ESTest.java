/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 02:29:20 GMT 2022
 */

package edu.psu.cse.siis.coal.field.transformers.set;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.psu.cse.siis.coal.field.SequenceElement;
import edu.psu.cse.siis.coal.field.TransformerSequence;
import edu.psu.cse.siis.coal.field.transformers.FieldTransformer;
import edu.psu.cse.siis.coal.field.transformers.set.Remove;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Remove_ESTest extends Remove_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      Remove remove0 = new Remove(object0);
      Remove remove1 = new Remove(remove0, remove0);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSet0.add(remove1);
      remove1.remove = (Set<Object>) linkedHashSet0;
      // Undeclared exception!
      try { 
        remove0.compose(remove1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      Remove remove0 = new Remove(object0);
      LinkedList<SequenceElement> linkedList0 = new LinkedList<SequenceElement>();
      TransformerSequence transformerSequence0 = new TransformerSequence(linkedList0);
      remove0.transformerSequence = transformerSequence0;
      FieldTransformer fieldTransformer0 = remove0.makeNonComposedFieldTransformer();
      // Undeclared exception!
      try { 
        remove0.compose(fieldTransformer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      Remove remove0 = new Remove(object0);
      FieldTransformer fieldTransformer0 = remove0.makeNonComposedFieldTransformer();
      // Undeclared exception!
      try { 
        fieldTransformer0.compose(fieldTransformer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      Remove remove0 = new Remove(object0);
      Remove remove1 = new Remove(remove0, remove0);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSet0.add(remove1);
      remove1.remove = (Set<Object>) linkedHashSet0;
      Remove remove2 = null;
      try {
        remove2 = new Remove(remove1.remove);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      Remove remove0 = new Remove(object0);
      Remove remove1 = new Remove(remove0, remove0);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      linkedHashSet0.add(remove1);
      remove1.remove = (Set<Object>) linkedHashSet0;
      Remove remove2 = null;
      try {
        remove2 = new Remove(remove0, remove1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Remove remove0 = new Remove((Object) null);
      // Undeclared exception!
      try { 
        remove0.compose((FieldTransformer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.psu.cse.siis.coal.field.transformers.set.SetFieldTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = new Object();
      Remove remove0 = new Remove(object0);
      FieldTransformer fieldTransformer0 = remove0.compose(remove0);
      assertTrue(fieldTransformer0.equals((Object)remove0));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Remove remove0 = null;
      try {
        remove0 = new Remove((Remove) null, (Remove) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.psu.cse.siis.coal.field.transformers.set.Remove", e);
      }
  }
}
