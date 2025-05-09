/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:25:24 GMT 2022
 */

package org.xson.tangyuan.cache;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xson.tangyuan.cache.EhCacheCache;
import org.xson.tangyuan.cache.FIFOCache;
import org.xson.tangyuan.cache.ICache;
import org.xson.tangyuan.cache.LRUCache;
import org.xson.tangyuan.cache.LocalCache;
import org.xson.tangyuan.cache.LoggingCache;
import org.xson.tangyuan.cache.MemcachedCache;
import org.xson.tangyuan.cache.RedisCache;
import org.xson.tangyuan.cache.ScheduledCache;
import org.xson.tangyuan.cache.SoftCache;
import org.xson.tangyuan.cache.SynchronizedCache;
import org.xson.tangyuan.cache.WeakCache;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LRUCache_ESTest extends LRUCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("pS");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 2);
      Integer integer0 = new Integer(1162);
      lRUCache0.putObject((Object) integer0, (Object) localCache0, integer0);
      lRUCache0.putObject((Object) "pS", (Object) "pS", integer0);
      assertEquals(2, localCache0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 2);
      Integer integer0 = new Integer(1162);
      lRUCache0.putObject((Object) "", (Object) "", integer0);
      Object object0 = lRUCache0.removeObject("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MemcachedCache memcachedCache0 = new MemcachedCache();
      SoftCache softCache0 = new SoftCache(memcachedCache0, (-38));
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(softCache0);
      LRUCache lRUCache0 = new LRUCache(synchronizedCache0, 1);
      int int0 = lRUCache0.getSize();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 2);
      Object object0 = lRUCache0.getObject("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 2);
      Integer integer0 = new Integer(1162);
      lRUCache0.putObject((Object) "", (Object) "", integer0);
      lRUCache0.getObject("");
      assertEquals(1, localCache0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      LRUCache lRUCache0 = new LRUCache(ehCacheCache0, 543);
      String string0 = lRUCache0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      WeakCache weakCache0 = new WeakCache(localCache0, (-589));
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(weakCache0);
      SoftCache softCache0 = new SoftCache(synchronizedCache0, 4269);
      LRUCache lRUCache0 = new LRUCache(softCache0, 4269);
      String string0 = lRUCache0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      RedisCache redisCache0 = new RedisCache();
      LRUCache lRUCache0 = new LRUCache(redisCache0, 1000);
      // Undeclared exception!
      try { 
        lRUCache0.removeObject(ehCacheCache0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoClassDefFoundError: org/xson/thirdparty/redis/JedisClient
         //
         verifyException("org.xson.tangyuan.cache.RedisCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LRUCache lRUCache0 = new LRUCache((ICache) null, 5);
      // Undeclared exception!
      try { 
        lRUCache0.removeObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.LRUCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      LRUCache lRUCache0 = new LRUCache(ehCacheCache0, 2091);
      // Undeclared exception!
      try { 
        lRUCache0.removeObject(ehCacheCache0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Cache
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(ehCacheCache0);
      LRUCache lRUCache0 = new LRUCache(synchronizedCache0, 1079);
      // Undeclared exception!
      try { 
        lRUCache0.removeObject(ehCacheCache0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Cache
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RedisCache redisCache0 = new RedisCache();
      FIFOCache fIFOCache0 = new FIFOCache(redisCache0, (-5));
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(fIFOCache0);
      LoggingCache loggingCache0 = new LoggingCache(synchronizedCache0);
      LRUCache lRUCache0 = new LRUCache(loggingCache0, 1029);
      Integer integer0 = new Integer((-5));
      // Undeclared exception!
      try { 
        lRUCache0.putObject((Object) redisCache0, (Object) integer0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoClassDefFoundError: org/xson/thirdparty/redis/JedisClient
         //
         verifyException("org.xson.tangyuan.cache.RedisCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LRUCache lRUCache0 = new LRUCache((ICache) null, 1);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        lRUCache0.putObject((Object) "", (Object) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.LRUCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WeakCache weakCache0 = new WeakCache((ICache) null, 0);
      ScheduledCache scheduledCache0 = new ScheduledCache(weakCache0, 0);
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(scheduledCache0);
      LRUCache lRUCache0 = new LRUCache(synchronizedCache0, 2435);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        lRUCache0.putObject((Object) "s~|,N8Qn", (Object) scheduledCache0, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.WeakCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      LRUCache lRUCache0 = new LRUCache(ehCacheCache0, 38);
      // Undeclared exception!
      try { 
        lRUCache0.putObject((Object) ehCacheCache0, (Object) ehCacheCache0, (Integer) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Element
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MemcachedCache memcachedCache0 = new MemcachedCache();
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(memcachedCache0);
      LRUCache lRUCache0 = new LRUCache(synchronizedCache0, 142);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        lRUCache0.putObject((Object) memcachedCache0, (Object) memcachedCache0, integer0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/whalin/MemCached/MemCachedClient
         //
         verifyException("org.xson.tangyuan.cache.MemcachedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LRUCache lRUCache0 = new LRUCache((ICache) null, 1);
      // Undeclared exception!
      try { 
        lRUCache0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.LRUCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      LRUCache lRUCache0 = new LRUCache(ehCacheCache0, 1033);
      // Undeclared exception!
      try { 
        lRUCache0.getSize();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Cache
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RedisCache redisCache0 = new RedisCache();
      LRUCache lRUCache0 = new LRUCache(redisCache0, 0);
      // Undeclared exception!
      try { 
        lRUCache0.getObject("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoClassDefFoundError: org/xson/thirdparty/redis/JedisClient
         //
         verifyException("org.xson.tangyuan.cache.RedisCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LRUCache lRUCache0 = new LRUCache((ICache) null, 10);
      Integer integer0 = new Integer(10);
      // Undeclared exception!
      try { 
        lRUCache0.getObject(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.LRUCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MemcachedCache memcachedCache0 = new MemcachedCache();
      SoftCache softCache0 = new SoftCache(memcachedCache0, (-32));
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(softCache0);
      LRUCache lRUCache0 = new LRUCache(synchronizedCache0, 1);
      // Undeclared exception!
      try { 
        lRUCache0.getObject(memcachedCache0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/whalin/MemCached/MemCachedClient
         //
         verifyException("org.xson.tangyuan.cache.MemcachedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      WeakCache weakCache0 = new WeakCache(localCache0, (-589));
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(weakCache0);
      SoftCache softCache0 = new SoftCache(synchronizedCache0, 4269);
      LRUCache lRUCache0 = new LRUCache(softCache0, 4269);
      Integer integer0 = new Integer(2101);
      weakCache0.putObject((Object) "", (Object) softCache0, integer0);
      // Undeclared exception!
      try { 
        lRUCache0.getObject("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.xson.tangyuan.cache.SoftCache cannot be cast to class java.lang.ref.SoftReference (org.xson.tangyuan.cache.SoftCache is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @28004e56; java.lang.ref.SoftReference is in module java.base of loader 'bootstrap')
         //
         verifyException("org.xson.tangyuan.cache.SoftCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LoggingCache loggingCache0 = new LoggingCache((ICache) null);
      LRUCache lRUCache0 = new LRUCache(loggingCache0, 511);
      // Undeclared exception!
      try { 
        lRUCache0.getId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.LoggingCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LRUCache lRUCache0 = new LRUCache((ICache) null, 1);
      // Undeclared exception!
      try { 
        lRUCache0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.LRUCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      LRUCache lRUCache0 = new LRUCache(ehCacheCache0, 1);
      // Undeclared exception!
      try { 
        lRUCache0.clear();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Cache
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      LRUCache lRUCache0 = new LRUCache(localCache0, 0);
      LRUCache lRUCache1 = null;
      try {
        lRUCache1 = new LRUCache(lRUCache0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("pS");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 0);
      Integer integer0 = new Integer(0);
      lRUCache0.putObject((Object) scheduledCache0, (Object) integer0, integer0);
      assertEquals(0, localCache0.getSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("pS");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 2);
      Integer integer0 = new Integer(1162);
      lRUCache0.putObject((Object) integer0, (Object) localCache0, integer0);
      int int0 = lRUCache0.getSize();
      assertEquals(1, localCache0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("pS");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 2);
      int int0 = lRUCache0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("pS");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 0);
      lRUCache0.clear();
      assertEquals("pS", lRUCache0.getId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      LRUCache lRUCache0 = new LRUCache(ehCacheCache0, 1);
      // Undeclared exception!
      try { 
        lRUCache0.getObject(ehCacheCache0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Cache
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("pS");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 0);
      Object object0 = new Object();
      Object object1 = lRUCache0.removeObject(object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("pS");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      LRUCache lRUCache0 = new LRUCache(scheduledCache0, 0);
      String string0 = lRUCache0.getId();
      assertEquals("pS", string0);
  }
}
