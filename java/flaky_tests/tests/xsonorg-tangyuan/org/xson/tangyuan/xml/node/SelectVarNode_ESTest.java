/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:00:14 GMT 2022
 */

package org.xson.tangyuan.xml.node;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xson.tangyuan.cache.LocalCache;
import org.xson.tangyuan.cache.MemcachedCache;
import org.xson.tangyuan.cache.RedisCache;
import org.xson.tangyuan.cache.WeakCache;
import org.xson.tangyuan.cache.vo.CacheUseVo;
import org.xson.tangyuan.cache.vo.CacheVo;
import org.xson.tangyuan.executor.ServiceContext;
import org.xson.tangyuan.transaction.XTransactionDefinition;
import org.xson.tangyuan.xml.node.ProcedureNode;
import org.xson.tangyuan.xml.node.SelectVarNode;
import org.xson.tangyuan.xml.node.SqlNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SelectVarNode_ESTest extends SelectVarNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XTransactionDefinition xTransactionDefinition0 = new XTransactionDefinition("org.xson.tangyuan.cache.SoftCache$SoftEntry");
      ProcedureNode procedureNode0 = new ProcedureNode();
      CacheUseVo cacheUseVo0 = new CacheUseVo((CacheVo) null, "org.xson.tangyuan.cache.SoftCache$SoftEntry", (Integer) null, (String[]) null, "");
      SelectVarNode selectVarNode0 = new SelectVarNode("", "", "", "org.xson.tangyuan.cache.SoftCache$SoftEntry", xTransactionDefinition0, procedureNode0, cacheUseVo0);
      assertTrue(selectVarNode0.isSimple());
      assertEquals("org.xson.tangyuan.cache.SoftCache$SoftEntry", selectVarNode0.getDsKey());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CacheVo.CacheType cacheVo_CacheType0 = CacheVo.CacheType.MEMCACHE;
      RedisCache redisCache0 = new RedisCache();
      CacheVo cacheVo0 = new CacheVo("E*s/", cacheVo_CacheType0, redisCache0, false, "E*s/", (Map<String, String>) null);
      CacheUseVo cacheUseVo0 = new CacheUseVo(cacheVo0, "E*s/", (Integer) null, (String[]) null, "");
      SelectVarNode selectVarNode0 = new SelectVarNode("", "", "", "", (XTransactionDefinition) null, (SqlNode) null, cacheUseVo0);
      try { 
        selectVarNode0.execute((ServiceContext) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoClassDefFoundError: org/xson/thirdparty/redis/JedisClient
         //
         verifyException("org.xson.tangyuan.cache.RedisCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XTransactionDefinition xTransactionDefinition0 = new XTransactionDefinition("");
      CacheVo.CacheType cacheVo_CacheType0 = CacheVo.CacheType.REDIS;
      MemcachedCache memcachedCache0 = new MemcachedCache();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      CacheVo cacheVo0 = new CacheVo("*>nv`=*|#s&sMf~>d80", cacheVo_CacheType0, memcachedCache0, true, "", hashMap0);
      CacheUseVo cacheUseVo0 = new CacheUseVo(cacheVo0, "", (Integer) 2, (String[]) null, "*>nv`=*|#s&sMf~>d80");
      SelectVarNode selectVarNode0 = new SelectVarNode("", "", "*>nv`=*|#s&sMf~>d80", "*>nv`=*|#s&sMf~>d80", xTransactionDefinition0, (SqlNode) null, cacheUseVo0);
      try { 
        selectVarNode0.execute((ServiceContext) null, (Object) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/whalin/MemCached/MemCachedClient
         //
         verifyException("org.xson.tangyuan.cache.MemcachedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("RJj=\"D:Cq>@tq40");
      localCache0.putObject((Object) "RJj=\"D:Cq>@tq40", (Object) "RJj=\"D:Cq>@tq40", (Integer) null);
      CacheVo.CacheType cacheVo_CacheType0 = CacheVo.CacheType.REDIS;
      WeakCache weakCache0 = new WeakCache(localCache0, (-1469));
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      CacheVo cacheVo0 = new CacheVo("N\"jN#Pb'dK;/o5E~", cacheVo_CacheType0, weakCache0, true, "sql execution time: ", hashMap0);
      Integer integer0 = new Integer((-1469));
      CacheUseVo cacheUseVo0 = new CacheUseVo(cacheVo0, "RJj=\"D:Cq>@tq40", integer0, (String[]) null, (String) null);
      SelectVarNode selectVarNode0 = new SelectVarNode((String) null, "sql execution time: ", (String) null, (String) null, (XTransactionDefinition) null, (SqlNode) null, cacheUseVo0);
      try { 
        selectVarNode0.execute((ServiceContext) null, cacheVo0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.ref.WeakReference (java.lang.String and java.lang.ref.WeakReference are in module java.base of loader 'bootstrap')
         //
         verifyException("org.xson.tangyuan.cache.WeakCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CacheVo.CacheType cacheVo_CacheType0 = CacheVo.CacheType.LOCAL;
      LocalCache localCache0 = new LocalCache("RJj=\"D:Cq>@tq40");
      CacheVo cacheVo0 = new CacheVo("RJj=\"D:Cq>@tq40", cacheVo_CacheType0, localCache0, true, "RJj=\"D:Cq>@tq40", (Map<String, String>) null);
      localCache0.putObject((Object) "RJj=\"D:Cq>@tq40", (Object) "RJj=\"D:Cq>@tq40", (Integer) null);
      CacheUseVo cacheUseVo0 = new CacheUseVo(cacheVo0, "RJj=\"D:Cq>@tq40", (Integer) null, (String[]) null, "RJj=\"D:Cq>@tq40");
      SelectVarNode selectVarNode0 = new SelectVarNode("RJj=\"D:Cq>@tq40", "RJj=\"D:Cq>@tq40", "RJj=\"D:Cq>@tq40", "RJj=\"D:Cq>@tq40", (XTransactionDefinition) null, (SqlNode) null, cacheUseVo0);
      try { 
        selectVarNode0.execute((ServiceContext) null, "RJj=\"D:Cq>@tq40");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.xml.node.SelectVarNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CacheVo.CacheType cacheVo_CacheType0 = CacheVo.CacheType.LOCAL;
      LocalCache localCache0 = new LocalCache("E*s/");
      CacheVo cacheVo0 = new CacheVo("E*s/", cacheVo_CacheType0, localCache0, true, "E*s/", (Map<String, String>) null);
      CacheUseVo cacheUseVo0 = new CacheUseVo(cacheVo0, "E*s/", (Integer) null, (String[]) null, "E*s/");
      SelectVarNode selectVarNode0 = new SelectVarNode("E*s/", "E*s/", "E*s/", "E*s/", (XTransactionDefinition) null, (SqlNode) null, cacheUseVo0);
      try { 
        selectVarNode0.execute((ServiceContext) null, "E*s/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.xml.node.SelectVarNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XTransactionDefinition xTransactionDefinition0 = new XTransactionDefinition("Wb9dGiH;q_qnO\"$1");
      SelectVarNode selectVarNode0 = new SelectVarNode((String) null, "sql execution time: ", (String) null, "sql execution time: ", xTransactionDefinition0, (SqlNode) null, (CacheUseVo) null);
      try { 
        selectVarNode0.execute((ServiceContext) null, "sql execution time: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.xml.node.SelectVarNode", e);
      }
  }
}
