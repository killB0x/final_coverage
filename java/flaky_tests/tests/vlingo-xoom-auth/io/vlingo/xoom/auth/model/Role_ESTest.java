/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 22:07:30 GMT 2022
 */

package io.vlingo.xoom.auth.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.vlingo.xoom.auth.infra.persistence.InMemoryGroupRepository;
import io.vlingo.xoom.auth.infra.persistence.InMemoryLoader;
import io.vlingo.xoom.auth.infra.persistence.InMemoryPermissionRepository;
import io.vlingo.xoom.auth.infra.persistence.InMemoryRoleRepository;
import io.vlingo.xoom.auth.model.Credential;
import io.vlingo.xoom.auth.model.EmailAddress;
import io.vlingo.xoom.auth.model.Group;
import io.vlingo.xoom.auth.model.Loader;
import io.vlingo.xoom.auth.model.Permission;
import io.vlingo.xoom.auth.model.PersonName;
import io.vlingo.xoom.auth.model.Phone;
import io.vlingo.xoom.auth.model.Profile;
import io.vlingo.xoom.auth.model.Role;
import io.vlingo.xoom.auth.model.TenantId;
import io.vlingo.xoom.auth.model.User;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Role_ESTest extends Role_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TenantId tenantId0 = TenantId.fromExisting("");
      Role role0 = Role.with(tenantId0, "", "vF`;vuQ");
      Group group0 = Group.forRole(tenantId0, "G_f?d-MX!9:\"gl.cE^", "b5w");
      role0.unassign(group0);
      assertEquals("", role0.name());
      assertEquals("vF`;vuQ", role0.description());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      TenantId tenantId0 = TenantId.fromExisting("io.vlingo.xoom.auth.model.EmailAddress");
      Role role0 = inMemoryRoleRepository0.roleOf(tenantId0, "OAUTH");
      Group group0 = Group.forRole(tenantId0, "p*%Vb5`cP", "OAUTH");
      // Undeclared exception!
      try { 
        role0.unassign(group0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.EncodedMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Role role0 = Role.NonExisting;
      TenantId tenantId0 = TenantId.unique();
      Permission permission0 = Permission.with(tenantId0, "*Ifi09i4k", "00000000-0100-4000-8200-000003000000");
      role0.NonExisting.detach(permission0);
      assertEquals("00000000-0100-4000-8200-000003000000", permission0.description());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TenantId tenantId0 = TenantId.unique();
      Role role0 = Role.with(tenantId0, "00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000");
      PersonName personName0 = PersonName.of("^{g=BMRv", "/\"Et95wFP2RkjNn[!", "00000000-0100-4000-8200-000003000000");
      EmailAddress emailAddress0 = new EmailAddress("00000000-0100-4000-8200-000003000000");
      Phone phone0 = new Phone("/\"Et95wFP2RkjNn[!");
      Profile profile0 = Profile.with(personName0, emailAddress0, phone0);
      Credential credential0 = Credential.oauthCredentialFrom("/\"Et95wFP2RkjNn[!", "00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000");
      User user0 = User.of(tenantId0, "00000000-0100-4000-8200-000003000000", profile0, credential0, false);
      role0.assign(user0);
      assertFalse(role0.doesNotExist());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TenantId tenantId0 = TenantId.unique();
      Role role0 = Role.with(tenantId0, "", "");
      Group group0 = Group.with(tenantId0, "", "y-|Tl q[Z{&C<9UI");
      role0.assign(group0);
      assertEquals("y-|Tl q[Z{&C<9UI", group0.description());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      TenantId tenantId0 = TenantId.unique();
      Role role0 = inMemoryRoleRepository0.roleOf(tenantId0, "~_F_6|t?.");
      Group group0 = Group.with(tenantId0, "`CBGO(0Y", "$=o8J![NB5d>S\"EF$");
      // Undeclared exception!
      try { 
        role0.assign(group0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.EncodedMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InMemoryGroupRepository inMemoryGroupRepository0 = new InMemoryGroupRepository();
      InMemoryPermissionRepository inMemoryPermissionRepository0 = new InMemoryPermissionRepository();
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      InMemoryLoader inMemoryLoader0 = new InMemoryLoader(inMemoryGroupRepository0, inMemoryPermissionRepository0, inMemoryRoleRepository0);
      TenantId tenantId0 = TenantId.unique();
      Role role0 = inMemoryLoader0.loadRole(tenantId0, "00000000-0100-4000-8200-000003000000");
      TenantId tenantId1 = role0.tenantId();
      assertNull(tenantId1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InMemoryGroupRepository inMemoryGroupRepository0 = new InMemoryGroupRepository();
      InMemoryPermissionRepository inMemoryPermissionRepository0 = new InMemoryPermissionRepository();
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      InMemoryLoader inMemoryLoader0 = new InMemoryLoader(inMemoryGroupRepository0, inMemoryPermissionRepository0, inMemoryRoleRepository0);
      TenantId tenantId0 = TenantId.unique();
      Role role0 = inMemoryLoader0.loadRole(tenantId0, "00000000-0100-4000-8200-000003000000");
      String string0 = role0.name();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TenantId tenantId0 = TenantId.fromExisting("$;TJr}Uj.m");
      Role role0 = Role.with(tenantId0, "$;TJr}Uj.m", "$;TJr}Uj.m");
      String string0 = role0.name();
      assertEquals("$;TJr}Uj.m", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TenantId tenantId0 = TenantId.fromExisting("");
      Role role0 = Role.with(tenantId0, "", "vF`;vuQ");
      String string0 = role0.name();
      assertEquals("vF`;vuQ", role0.description());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Role role0 = Role.NonExisting;
      String string0 = role0.description();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TenantId tenantId0 = TenantId.fromExisting(" description=");
      Role role0 = Role.with(tenantId0, " description=", "]");
      String string0 = role0.description();
      assertEquals(" description=", role0.name());
      assertEquals("]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Role role0 = Role.NonExisting;
      User user0 = User.NonExisting;
      // Undeclared exception!
      try { 
        role0.isInRole(user0, (Loader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.EncodedMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TenantId tenantId0 = TenantId.fromExisting("");
      Role role0 = Role.with(tenantId0, "", "vF`;vuQ");
      InMemoryGroupRepository inMemoryGroupRepository0 = new InMemoryGroupRepository();
      InMemoryPermissionRepository inMemoryPermissionRepository0 = new InMemoryPermissionRepository();
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      InMemoryLoader inMemoryLoader0 = new InMemoryLoader(inMemoryGroupRepository0, inMemoryPermissionRepository0, inMemoryRoleRepository0);
      Group group0 = inMemoryLoader0.loadGroup(tenantId0, "");
      // Undeclared exception!
      try { 
        role0.isInRole(group0, (Loader) inMemoryLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.EncodedMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Role role0 = Role.NonExisting;
      Permission permission0 = Permission.NonExisting;
      // Undeclared exception!
      try { 
        role0.NonExisting.attach(permission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.EncodedMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      TenantId tenantId0 = TenantId.unique();
      Role role0 = Role.NonExisting;
      InMemoryGroupRepository inMemoryGroupRepository0 = new InMemoryGroupRepository();
      PersonName personName0 = PersonName.of("00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000");
      EmailAddress emailAddress0 = new EmailAddress("00000000-0100-4000-8200-000003000000");
      Phone phone0 = new Phone("00000000-0100-4000-8200-000003000000");
      Profile profile0 = Profile.with(personName0, emailAddress0, phone0);
      Credential credential0 = Credential.oauthCredentialFrom("00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000");
      User user0 = User.of(tenantId0, "00000000-0100-4000-8200-000003000000", profile0, credential0, false);
      InMemoryPermissionRepository inMemoryPermissionRepository0 = new InMemoryPermissionRepository();
      InMemoryLoader inMemoryLoader0 = new InMemoryLoader(inMemoryGroupRepository0, inMemoryPermissionRepository0, inMemoryRoleRepository0);
      // Undeclared exception!
      try { 
        role0.isInRole(user0, (Loader) inMemoryLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.infra.persistence.BaseRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Role role0 = Role.NonExisting;
      InMemoryGroupRepository inMemoryGroupRepository0 = new InMemoryGroupRepository();
      InMemoryPermissionRepository inMemoryPermissionRepository0 = new InMemoryPermissionRepository();
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      InMemoryLoader inMemoryLoader0 = new InMemoryLoader(inMemoryGroupRepository0, inMemoryPermissionRepository0, inMemoryRoleRepository0);
      PersonName personName0 = PersonName.of("pF!~Ei6c9<", "5|/RW?$OQ)dL:FpW", "cLyQQg&c~Q0rwT");
      EmailAddress emailAddress0 = new EmailAddress("A/ObJ");
      Phone phone0 = new Phone("Wem@:bQ]qW");
      Profile profile0 = Profile.with(personName0, emailAddress0, phone0);
      Credential credential0 = Credential.vlingoCredentialFrom("A/ObJ", "q(a", ".");
      TenantId tenantId0 = TenantId.unique();
      User user0 = User.of(tenantId0, "00000000-0100-4000-8200-000003000000", profile0, credential0, false);
      // Undeclared exception!
      try { 
        role0.isInRole(user0, (Loader) inMemoryLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.infra.persistence.BaseRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      TenantId tenantId0 = TenantId.unique();
      Role role0 = inMemoryRoleRepository0.roleOf(tenantId0, "00000000-0100-4000-8200-000003000000");
      Group group0 = Group.with(tenantId0, "pF!~Ei6c9<", "00000000-0100-4000-8200-000003000000");
      // Undeclared exception!
      try { 
        role0.NonExisting.isInRole(group0, (Loader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.Group", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Role role0 = Role.NonExisting;
      Set<Permission> set0 = role0.permissions((Loader) null);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Role role0 = Role.NonExisting;
      role0.permissionOf(".", (Loader) null);
      Set<Permission> set0 = role0.permissions((Loader) null);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Role role0 = Role.NonExisting;
      TenantId tenantId0 = TenantId.fromExisting("3");
      Permission.with(tenantId0, "3", "3");
      boolean boolean0 = role0.hasPermissionOf("3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Role role0 = Role.NonExisting;
      TenantId tenantId0 = TenantId.unique();
      Permission permission0 = Permission.with(tenantId0, "", "");
      role0.attach(permission0);
      boolean boolean0 = role0.hasPermissionOf("io.vlingo.xoom.auth.model.EncodedMember$GroupMember");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TenantId tenantId0 = TenantId.fromExisting((String) null);
      Role role0 = Role.with(tenantId0, (String) null, (String) null);
      boolean boolean0 = role0.doesNotExist();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TenantId tenantId0 = TenantId.unique();
      Role role0 = Role.with(tenantId0, "00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000");
      boolean boolean0 = role0.doesNotExist();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Role role0 = Role.NonExisting;
      boolean boolean0 = role0.doesNotExist();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TenantId tenantId0 = TenantId.unique();
      Role role0 = Role.with(tenantId0, "00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000");
      TenantId tenantId1 = role0.tenantId();
      assertSame(tenantId0, tenantId1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TenantId tenantId0 = TenantId.unique();
      Role role0 = Role.with(tenantId0, "6f0a0000-700a-4000-b10a-0000720a0000", "6f0a0000-700a-4000-b10a-0000720a0000");
      String string0 = role0.toString();
      assertEquals("Role[tenantId=TenantId[value=00000000-0100-4000-8200-000003000000] name=6f0a0000-700a-4000-b10a-0000720a0000 description=6f0a0000-700a-4000-b10a-0000720a0000]", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Role role0 = Role.NonExisting;
      role0.NonExisting.changeDescription(".");
      assertTrue(role0.doesNotExist());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TenantId tenantId0 = TenantId.unique();
      Role role0 = Role.with(tenantId0, "00000000-0100-4000-8200-000003000000", "00000000-0100-4000-8200-000003000000");
      PersonName personName0 = PersonName.of("5|/RW?$OQ)dL:FpW", "5|/RW?$OQ)dL:FpW", "pF!~Ei6c9<");
      EmailAddress emailAddress0 = new EmailAddress("00000000-0100-4000-8200-000003000000");
      Phone phone0 = new Phone("00000000-0100-4000-8200-000003000000");
      Profile profile0 = Profile.with(personName0, emailAddress0, phone0);
      Credential credential0 = Credential.vlingoCredentialFrom("$6qAWC%KUf&qC", "OLjb$dGra4<_", "Missing previous constraint.");
      User user0 = User.of(tenantId0, "pF!~Ei6c9<", profile0, credential0, true);
      role0.unassign(user0);
      assertEquals("pF!~Ei6c9<", user0.username());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TenantId tenantId0 = TenantId.fromExisting("08000000-0900-4000-8a00-00000b000000");
      Role role0 = Role.with(tenantId0, "<Z", "");
      String string0 = role0.description();
      assertEquals("<Z", role0.name());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Role role0 = Role.NonExisting;
      User user0 = User.NonExisting;
      // Undeclared exception!
      try { 
        role0.NonExisting.unassign(user0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.EncodedMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Role role0 = Role.NonExisting;
      Permission permission0 = Permission.NonExisting;
      // Undeclared exception!
      try { 
        role0.detach(permission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.EncodedMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TenantId tenantId0 = TenantId.unique();
      Role role0 = Role.with(tenantId0, "6f0a0000-700a-4000-b10a-0000720a0000", "6f0a0000-700a-4000-b10a-0000720a0000");
      Permission permission0 = Permission.with(tenantId0, "LG&@9F6K]j?iRc0", "Qc5A o*h_C#!$");
      role0.attach(permission0);
      InMemoryGroupRepository inMemoryGroupRepository0 = new InMemoryGroupRepository();
      InMemoryPermissionRepository inMemoryPermissionRepository0 = new InMemoryPermissionRepository();
      InMemoryRoleRepository inMemoryRoleRepository0 = new InMemoryRoleRepository();
      InMemoryLoader inMemoryLoader0 = new InMemoryLoader(inMemoryGroupRepository0, inMemoryPermissionRepository0, inMemoryRoleRepository0);
      Permission permission1 = role0.permissionOf("LG&@9F6K]j?iRc0", inMemoryLoader0);
      assertNotSame(permission1, permission0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Role role0 = Role.NonExisting;
      User user0 = User.NonExisting;
      // Undeclared exception!
      try { 
        role0.assign(user0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.vlingo.xoom.auth.model.EncodedMember", e);
      }
  }
}
