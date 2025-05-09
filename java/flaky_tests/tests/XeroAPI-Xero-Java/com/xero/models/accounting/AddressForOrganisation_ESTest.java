/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 12:46:22 GMT 2022
 */

package com.xero.models.accounting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.accounting.AddressForOrganisation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AddressForOrganisation_ESTest extends AddressForOrganisation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AddressForOrganisation.AddressTypeEnum addressForOrganisation_AddressTypeEnum0 = AddressForOrganisation.AddressTypeEnum.fromValue("STREET");
      assertEquals(AddressForOrganisation.AddressTypeEnum.STREET, addressForOrganisation_AddressTypeEnum0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AddressForOrganisation.AddressTypeEnum addressForOrganisation_AddressTypeEnum0 = AddressForOrganisation.AddressTypeEnum.fromValue("POBOX");
      assertEquals(AddressForOrganisation.AddressTypeEnum.POBOX, addressForOrganisation_AddressTypeEnum0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        AddressForOrganisation.AddressTypeEnum.fromValue("m|0c92`VD+$M!K:O+o;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'm|0c92`VD+$M!K:O+o;'
         //
         verifyException("com.xero.models.accounting.AddressForOrganisation$AddressTypeEnum", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AddressForOrganisation addressForOrganisation0 = null;
      try {
        addressForOrganisation0 = new AddressForOrganisation();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.accounting.AddressForOrganisation", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AddressForOrganisation.AddressTypeEnum addressForOrganisation_AddressTypeEnum0 = AddressForOrganisation.AddressTypeEnum.DELIVERY;
      String string0 = addressForOrganisation_AddressTypeEnum0.toString();
      assertEquals("DELIVERY", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AddressForOrganisation.AddressTypeEnum addressForOrganisation_AddressTypeEnum0 = AddressForOrganisation.AddressTypeEnum.DELIVERY;
      String string0 = addressForOrganisation_AddressTypeEnum0.getValue();
      assertEquals("DELIVERY", string0);
  }
}
