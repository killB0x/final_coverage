/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:06:44 GMT 2022
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
import org.xson.tangyuan.cache.LocalCache;
import org.xson.tangyuan.cache.MemcachedCache;
import org.xson.tangyuan.cache.RedisCache;
import org.xson.tangyuan.cache.ScheduledCache;
import org.xson.tangyuan.cache.SynchronizedCache;
import org.xson.tangyuan.cache.WeakCache;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ScheduledCache_ESTest extends ScheduledCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      Object object0 = new Object();
      Integer integer0 = new Integer(1004);
      scheduledCache0.putObject(object0, (Object) "", integer0);
      Object object1 = scheduledCache0.getObject(object0);
      assertEquals("", object1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      Integer integer0 = Integer.valueOf(0);
      localCache0.putObject((Object) integer0, (Object) scheduledCache0);
      Object object0 = scheduledCache0.removeObject(integer0);
      assertSame(scheduledCache0, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      int int0 = scheduledCache0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("'k");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 10);
      Object object0 = scheduledCache0.removeObject("'k");
      Long long0 = new Long(10);
      Integer integer0 = new Integer(0);
      scheduledCache0.putObject(object0, (Object) long0, integer0);
      int int0 = scheduledCache0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MemcachedCache memcachedCache0 = new MemcachedCache();
      ScheduledCache scheduledCache0 = new ScheduledCache(memcachedCache0, 49);
      int int0 = scheduledCache0.getSize();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      ScheduledCache scheduledCache0 = new ScheduledCache(ehCacheCache0, 0);
      String string0 = scheduledCache0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("'k");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 10);
      String string0 = scheduledCache0.getId();
      assertEquals("'k", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      boolean boolean0 = scheduledCache0.equals(localCache0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RedisCache redisCache0 = new RedisCache();
      ScheduledCache scheduledCache0 = new ScheduledCache(redisCache0, (-2147463763));
      // Undeclared exception!
      try { 
        scheduledCache0.removeObject(redisCache0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoClassDefFoundError: org/xson/thirdparty/redis/JedisClient
         //
         verifyException("org.xson.tangyuan.cache.RedisCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScheduledCache scheduledCache0 = new ScheduledCache((ICache) null, 1);
      // Undeclared exception!
      try { 
        scheduledCache0.removeObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.ScheduledCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SynchronizedCache synchronizedCache0 = new SynchronizedCache((ICache) null);
      ScheduledCache scheduledCache0 = new ScheduledCache(synchronizedCache0, (-2145338261));
      // Undeclared exception!
      try { 
        scheduledCache0.removeObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.SynchronizedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MemcachedCache memcachedCache0 = new MemcachedCache();
      ScheduledCache scheduledCache0 = new ScheduledCache(memcachedCache0, 0);
      // Undeclared exception!
      try { 
        scheduledCache0.removeObject(memcachedCache0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/whalin/MemCached/MemCachedClient
         //
         verifyException("org.xson.tangyuan.cache.MemcachedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(ehCacheCache0);
      ScheduledCache scheduledCache0 = new ScheduledCache(synchronizedCache0, 841);
      // Undeclared exception!
      try { 
        scheduledCache0.removeObject(ehCacheCache0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Cache
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MemcachedCache memcachedCache0 = new MemcachedCache();
      ScheduledCache scheduledCache0 = new ScheduledCache(memcachedCache0, 2147304705);
      Integer integer0 = new Integer(2147304705);
      // Undeclared exception!
      try { 
        scheduledCache0.putObject((Object) null, (Object) null, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cache key does not allow null
         //
         verifyException("org.xson.tangyuan.cache.AbstractCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScheduledCache scheduledCache0 = new ScheduledCache((ICache) null, 12);
      Integer integer0 = Integer.valueOf(12);
      // Undeclared exception!
      try { 
        scheduledCache0.putObject((Object) null, (Object) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.ScheduledCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SynchronizedCache synchronizedCache0 = new SynchronizedCache((ICache) null);
      WeakCache weakCache0 = new WeakCache(synchronizedCache0, 2006);
      ScheduledCache scheduledCache0 = new ScheduledCache(weakCache0, 2006);
      Integer integer0 = new Integer(2006);
      // Undeclared exception!
      try { 
        scheduledCache0.putObject((Object) weakCache0, (Object) "C6#|'9QQ<&xdn", integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.SynchronizedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MemcachedCache memcachedCache0 = new MemcachedCache();
      ScheduledCache scheduledCache0 = new ScheduledCache(memcachedCache0, 339);
      Integer integer0 = new Integer(339);
      // Undeclared exception!
      try { 
        scheduledCache0.putObject((Object) memcachedCache0, (Object) memcachedCache0, integer0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/whalin/MemCached/MemCachedClient
         //
         verifyException("org.xson.tangyuan.cache.MemcachedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MemcachedCache memcachedCache0 = new MemcachedCache();
      SynchronizedCache synchronizedCache0 = new SynchronizedCache(memcachedCache0);
      ScheduledCache scheduledCache0 = new ScheduledCache(synchronizedCache0, 1360);
      Long long0 = new Long(2096L);
      // Undeclared exception!
      try { 
        scheduledCache0.putObject((Object) long0, (Object) "", (Integer) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/whalin/MemCached/MemCachedClient
         //
         verifyException("org.xson.tangyuan.cache.MemcachedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      ScheduledCache scheduledCache0 = new ScheduledCache(ehCacheCache0, 0);
      // Undeclared exception!
      try { 
        scheduledCache0.getSize();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Cache
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalCache localCache0 = new LocalCache((String) null);
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 218);
      // Undeclared exception!
      try { 
        scheduledCache0.getObject(localCache0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cache instances require an ID.
         //
         verifyException("org.xson.tangyuan.cache.LocalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ScheduledCache scheduledCache0 = new ScheduledCache((ICache) null, (-1015));
      // Undeclared exception!
      try { 
        scheduledCache0.getId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.ScheduledCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalCache localCache0 = new LocalCache((String) null);
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, (-1));
      // Undeclared exception!
      try { 
        scheduledCache0.equals((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cache instances require an ID.
         //
         verifyException("org.xson.tangyuan.cache.LocalCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScheduledCache scheduledCache0 = new ScheduledCache((ICache) null, 314);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        scheduledCache0.equals(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.ScheduledCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ScheduledCache scheduledCache0 = new ScheduledCache((ICache) null, 12);
      // Undeclared exception!
      try { 
        scheduledCache0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.ScheduledCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SynchronizedCache synchronizedCache0 = new SynchronizedCache((ICache) null);
      FIFOCache fIFOCache0 = new FIFOCache(synchronizedCache0, 1);
      WeakCache weakCache0 = new WeakCache(fIFOCache0, 1);
      ScheduledCache scheduledCache0 = new ScheduledCache(weakCache0, 3252);
      // Undeclared exception!
      try { 
        scheduledCache0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.SynchronizedCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EhCacheCache ehCacheCache0 = new EhCacheCache();
      ScheduledCache scheduledCache0 = new ScheduledCache(ehCacheCache0, 0);
      // Undeclared exception!
      try { 
        scheduledCache0.clear();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // net/sf/ehcache/Cache
         //
         verifyException("org.xson.tangyuan.cache.EhCacheCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("'k");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 10);
      Object object0 = scheduledCache0.removeObject("'k");
      Long long0 = new Long(10);
      Integer integer0 = new Integer((-1481));
      scheduledCache0.putObject((Object) long0, object0, integer0);
      Object object1 = scheduledCache0.getObject(long0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      Object object0 = scheduledCache0.getObject("Cache Hit Ratio [");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      Object object0 = new Object();
      Integer integer0 = Integer.valueOf(0);
      scheduledCache0.putObject(object0, (Object) "", integer0);
      Object object1 = scheduledCache0.getObject(object0);
      assertEquals("", object1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      String string0 = scheduledCache0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      scheduledCache0.hashCode();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      boolean boolean0 = scheduledCache0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalCache localCache0 = new LocalCache("");
      ScheduledCache scheduledCache0 = new ScheduledCache(localCache0, 0);
      scheduledCache0.clear();
      assertEquals("", scheduledCache0.getId());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ScheduledCache scheduledCache0 = new ScheduledCache((ICache) null, 1);
      // Undeclared exception!
      try { 
        scheduledCache0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.cache.ScheduledCache", e);
      }
  }
}
