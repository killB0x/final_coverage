/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 02:56:44 GMT 2022
 */

package simplenlg.features;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplenlg.features.LexicalFeature;
import simplenlg.framework.LexicalCategory;
import simplenlg.framework.PhraseCategory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LexicalFeature_ESTest extends LexicalFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LexicalCategory lexicalCategory0 = LexicalCategory.SYMBOL;
      String[] stringArray0 = LexicalFeature.getInflectionalFeatures(lexicalCategory0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LexicalCategory lexicalCategory0 = LexicalCategory.ADJECTIVE;
      String[] stringArray0 = LexicalFeature.getInflectionalFeatures(lexicalCategory0);
      assertNotNull(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PhraseCategory phraseCategory0 = PhraseCategory.ADJECTIVE_PHRASE;
      String[] stringArray0 = LexicalFeature.getInflectionalFeatures(phraseCategory0);
      assertNotNull(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PhraseCategory phraseCategory0 = PhraseCategory.VERB_PHRASE;
      String[] stringArray0 = LexicalFeature.getInflectionalFeatures(phraseCategory0);
      assertEquals(4, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LexicalCategory lexicalCategory0 = LexicalCategory.NOUN;
      String[] stringArray0 = LexicalFeature.getInflectionalFeatures(lexicalCategory0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LexicalCategory lexicalCategory0 = LexicalCategory.VERB;
      String[] stringArray0 = LexicalFeature.getInflectionalFeatures(lexicalCategory0);
      assertNotNull(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PhraseCategory phraseCategory0 = PhraseCategory.NOUN_PHRASE;
      String[] stringArray0 = LexicalFeature.getInflectionalFeatures(phraseCategory0);
      assertEquals(1, stringArray0.length);
  }
}
