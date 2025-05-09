/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 20:25:57 GMT 2022
 */

package com.contrastsecurity.cassandra.migration.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.contrastsecurity.cassandra.migration.config.MigrationConfigs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MigrationConfigs_ESTest extends MigrationConfigs_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      migrationConfigs0.setTargetAsString((String) null);
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
      
      migrationConfigs0.setAllowOutOfOrder(true);
      boolean boolean0 = migrationConfigs0.isAllowOutOfOrder();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      migrationConfigs0.setScriptsLocations((String[]) null);
      migrationConfigs0.getScriptsLocations();
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
      
      migrationConfigs0.setEncoding("");
      String string0 = migrationConfigs0.getEncoding();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MigrationConfigs.MigrationProperty migrationConfigs_MigrationProperty0 = MigrationConfigs.MigrationProperty.SCRIPTS_ENCODING;
      String string0 = migrationConfigs_MigrationProperty0.getName();
      assertEquals("cassandra.migration.scripts.encoding", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MigrationConfigs.MigrationProperty migrationConfigs_MigrationProperty0 = MigrationConfigs.MigrationProperty.SCRIPTS_ENCODING;
      String string0 = migrationConfigs_MigrationProperty0.getEnvName();
      assertEquals("CASSANDRA_MIGRATION_SCRIPTS_ENCODING", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MigrationConfigs.MigrationProperty migrationConfigs_MigrationProperty0 = MigrationConfigs.MigrationProperty.SCRIPTS_LOCATIONS;
      String string0 = migrationConfigs_MigrationProperty0.getDescription();
      assertEquals("Locations of the migration scripts in CSV format", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      migrationConfigs0.getTarget();
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      boolean boolean0 = migrationConfigs0.isAllowOutOfOrder();
      assertFalse(boolean0);
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      // Undeclared exception!
      try { 
        migrationConfigs0.setTargetAsString("5");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid version containing non-numeric characters. Only 0..9 and . are allowed. Invalid version: 5
         //
         verifyException("com.contrastsecurity.cassandra.migration.info.MigrationVersion", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      migrationConfigs0.getScriptsLocations();
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      String string0 = migrationConfigs0.getEncoding();
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
      
      migrationConfigs0.setEncoding((String) null);
      migrationConfigs0.getEncoding();
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
      
      migrationConfigs0.setAllowOutOfOrder("cassandra.migration.scripts.allowoutoforder");
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MigrationConfigs migrationConfigs0 = new MigrationConfigs();
      String[] stringArray0 = new String[0];
      migrationConfigs0.setScriptsLocations(stringArray0);
      migrationConfigs0.getScriptsLocations();
      assertEquals("UTF-8", migrationConfigs0.getEncoding());
      assertFalse(migrationConfigs0.isAllowOutOfOrder());
  }
}
