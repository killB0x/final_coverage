/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:31:15 GMT 2022
 */

package io.github.project.openubl.xmlsenderws.webservices.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import io.github.project.openubl.xmlsenderws.webservices.xml.DocumentType;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DocumentType_ESTest extends DocumentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentType[] documentTypeArray0 = DocumentType.values();
      assertEquals(8, documentTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DocumentType documentType0 = DocumentType.valueOf("DESPATCH_ADVICE");
      assertEquals("DespatchAdvice", documentType0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DocumentType documentType0 = DocumentType.VOIDED_DOCUMENT;
      String string0 = documentType0.getType();
      assertEquals("VoidedDocuments", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Optional<DocumentType> optional0 = DocumentType.valueFromDocumentType("");
      assertNotNull(optional0);
  }
}
