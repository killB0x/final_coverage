/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 02:33:18 GMT 2022
 */

package simplenlg.syntax.english;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplenlg.features.Tense;
import simplenlg.framework.CoordinatedPhraseElement;
import simplenlg.framework.DocumentElement;
import simplenlg.framework.NLGElement;
import simplenlg.framework.NLGFactory;
import simplenlg.framework.WordElement;
import simplenlg.lexicon.MultipleLexicon;
import simplenlg.phrasespec.NPPhraseSpec;
import simplenlg.phrasespec.SPhraseSpec;
import simplenlg.syntax.english.CoordinatedPhraseHelper;
import simplenlg.syntax.english.SyntaxProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CoordinatedPhraseHelper_ESTest extends CoordinatedPhraseHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CoordinatedPhraseElement coordinatedPhraseElement0 = new CoordinatedPhraseElement();
      coordinatedPhraseElement0.addCoordinate(coordinatedPhraseElement0);
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      // Undeclared exception!
      try { 
        CoordinatedPhraseHelper.realise(syntaxProcessor0, coordinatedPhraseElement0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CoordinatedPhraseElement coordinatedPhraseElement0 = new CoordinatedPhraseElement();
      CoordinatedPhraseElement coordinatedPhraseElement1 = new CoordinatedPhraseElement(coordinatedPhraseElement0, coordinatedPhraseElement0);
      // Undeclared exception!
      try { 
        CoordinatedPhraseHelper.realise((SyntaxProcessor) null, coordinatedPhraseElement1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("simplenlg.syntax.english.CoordinatedPhraseHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CoordinatedPhraseElement coordinatedPhraseElement0 = new CoordinatedPhraseElement();
      CoordinatedPhraseElement coordinatedPhraseElement1 = new CoordinatedPhraseElement(coordinatedPhraseElement0, coordinatedPhraseElement0);
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      NLGFactory nLGFactory0 = new NLGFactory();
      MultipleLexicon multipleLexicon0 = new MultipleLexicon();
      WordElement wordElement0 = multipleLexicon0.lookupWord("aGf?.9Ij)qU2_}M@r(0");
      nLGFactory0.createClause((Object) null, (Object) wordElement0, (Object) coordinatedPhraseElement1);
      NLGElement nLGElement0 = CoordinatedPhraseHelper.realise(syntaxProcessor0, coordinatedPhraseElement1);
      assertEquals(Tense.PRESENT, nLGElement0.getTense());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CoordinatedPhraseElement coordinatedPhraseElement0 = new CoordinatedPhraseElement();
      CoordinatedPhraseElement coordinatedPhraseElement1 = new CoordinatedPhraseElement(coordinatedPhraseElement0, coordinatedPhraseElement0);
      coordinatedPhraseElement1.setFeature("modal", 2263);
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      NLGElement nLGElement0 = CoordinatedPhraseHelper.realise(syntaxProcessor0, coordinatedPhraseElement1);
      assertFalse(nLGElement0.isNegated());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      NLGFactory nLGFactory0 = new NLGFactory();
      DocumentElement documentElement0 = nLGFactory0.createDocument();
      CoordinatedPhraseElement coordinatedPhraseElement0 = nLGFactory0.createCoordinatedPhrase((Object) documentElement0, (Object) syntaxProcessor0);
      coordinatedPhraseElement0.setFeature("tense", (-302L));
      NLGElement nLGElement0 = CoordinatedPhraseHelper.realise(syntaxProcessor0, coordinatedPhraseElement0);
      assertEquals(Tense.PRESENT, nLGElement0.getTense());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CoordinatedPhraseElement coordinatedPhraseElement0 = new CoordinatedPhraseElement();
      CoordinatedPhraseElement coordinatedPhraseElement1 = new CoordinatedPhraseElement(coordinatedPhraseElement0, coordinatedPhraseElement0);
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      NLGFactory nLGFactory0 = new NLGFactory();
      NPPhraseSpec nPPhraseSpec0 = nLGFactory0.createNounPhrase((Object) coordinatedPhraseElement1, (Object) coordinatedPhraseElement1);
      NLGElement nLGElement0 = syntaxProcessor0.realise((NLGElement) nPPhraseSpec0);
      assertEquals(Tense.PRESENT, nLGElement0.getTense());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      NLGFactory nLGFactory0 = new NLGFactory();
      DocumentElement documentElement0 = nLGFactory0.createDocument();
      CoordinatedPhraseElement coordinatedPhraseElement0 = nLGFactory0.createCoordinatedPhrase((Object) "h3T6Ns7*2", (Object) documentElement0);
      coordinatedPhraseElement0.setFeature("progressive", 660.0F);
      NLGElement nLGElement0 = CoordinatedPhraseHelper.realise(syntaxProcessor0, coordinatedPhraseElement0);
      assertFalse(nLGElement0.isNegated());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CoordinatedPhraseElement coordinatedPhraseElement0 = new CoordinatedPhraseElement();
      CoordinatedPhraseElement coordinatedPhraseElement1 = new CoordinatedPhraseElement(coordinatedPhraseElement0, coordinatedPhraseElement0);
      coordinatedPhraseElement1.setConjunction((String) null);
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      NLGElement nLGElement0 = CoordinatedPhraseHelper.realise(syntaxProcessor0, coordinatedPhraseElement1);
      assertFalse(nLGElement0.isNegated());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CoordinatedPhraseElement coordinatedPhraseElement0 = new CoordinatedPhraseElement();
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      MultipleLexicon multipleLexicon0 = new MultipleLexicon();
      NLGFactory nLGFactory0 = new NLGFactory(multipleLexicon0);
      WordElement wordElement0 = multipleLexicon0.getWordFromVariant("");
      SPhraseSpec sPhraseSpec0 = nLGFactory0.createClause((Object) coordinatedPhraseElement0, (Object) null, (Object) wordElement0);
      CoordinatedPhraseElement coordinatedPhraseElement1 = nLGFactory0.createCoordinatedPhrase((Object) coordinatedPhraseElement0, (Object) sPhraseSpec0);
      NLGElement nLGElement0 = CoordinatedPhraseHelper.realise(syntaxProcessor0, coordinatedPhraseElement1);
      assertFalse(nLGElement0.isNegated());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CoordinatedPhraseElement coordinatedPhraseElement0 = new CoordinatedPhraseElement();
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      NLGElement nLGElement0 = CoordinatedPhraseHelper.realise(syntaxProcessor0, coordinatedPhraseElement0);
      assertEquals(Tense.PRESENT, nLGElement0.getTense());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SyntaxProcessor syntaxProcessor0 = new SyntaxProcessor();
      NLGElement nLGElement0 = CoordinatedPhraseHelper.realise(syntaxProcessor0, (CoordinatedPhraseElement) null);
      assertNull(nLGElement0);
  }
}
