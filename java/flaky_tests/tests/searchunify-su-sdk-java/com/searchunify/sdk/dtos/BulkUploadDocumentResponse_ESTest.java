/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 20:02:12 GMT 2022
 */

package com.searchunify.sdk.dtos;

import org.junit.Test;
import static org.junit.Assert.*;
import com.searchunify.sdk.dtos.BulkUploadDocumentResponse;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BulkUploadDocumentResponse_ESTest extends BulkUploadDocumentResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BulkUploadDocumentResponse bulkUploadDocumentResponse0 = new BulkUploadDocumentResponse();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      bulkUploadDocumentResponse0.setData(hashMap0);
      Map<String, Object> map0 = bulkUploadDocumentResponse0.getData();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BulkUploadDocumentResponse bulkUploadDocumentResponse0 = new BulkUploadDocumentResponse();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put((String) null, (Object) null);
      bulkUploadDocumentResponse0.setData(hashMap0);
      Map<String, Object> map0 = bulkUploadDocumentResponse0.getData();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BulkUploadDocumentResponse bulkUploadDocumentResponse0 = new BulkUploadDocumentResponse();
      Map<String, Object> map0 = bulkUploadDocumentResponse0.getData();
      assertNull(map0);
  }
}
