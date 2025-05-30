/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 04:12:52 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.tigerbrokers.stock.openapi.client.https.domain.contract.model.BaseContractModel;
import com.tigerbrokers.stock.openapi.client.https.domain.contract.model.ContractModel;
import com.tigerbrokers.stock.openapi.client.https.domain.contract.model.ContractsModel;
import com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContractRequestValidator_ESTest extends ContractRequestValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      BaseContractModel baseContractModel0 = new BaseContractModel();
      baseContractModel0.setAccount("sec_type");
      baseContractModel0.setSecType("(O-okra6vU9LK");
      try { 
        contractRequestValidator0.validate(baseContractModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10102:client biz param error(sec_type is incorrect)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      // Undeclared exception!
      try { 
        contractRequestValidator0.validate((BaseContractModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      BaseContractModel baseContractModel0 = new BaseContractModel();
      Double double0 = Double.valueOf((-1.0));
      baseContractModel0.setRight("IOPT");
      baseContractModel0.setStrike(double0);
      baseContractModel0.setExpiry("IOPT");
      baseContractModel0.setAccount("IOPT");
      baseContractModel0.setSecType("IOPT");
      contractRequestValidator0.validate(baseContractModel0);
      assertEquals("IOPT", baseContractModel0.getRight());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      BaseContractModel baseContractModel0 = new BaseContractModel();
      Double double0 = Double.valueOf((-1.0));
      baseContractModel0.setStrike(double0);
      baseContractModel0.setExpiry("IOPT");
      baseContractModel0.setAccount("IOPT");
      baseContractModel0.setSecType("IOPT");
      try { 
        contractRequestValidator0.validate(baseContractModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(right is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      BaseContractModel baseContractModel0 = new BaseContractModel();
      baseContractModel0.setExpiry("IOPT");
      baseContractModel0.setAccount("IOPT");
      baseContractModel0.setSecType("IOPT");
      try { 
        contractRequestValidator0.validate(baseContractModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(strike is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContractsModel contractsModel0 = new ContractsModel();
      contractsModel0.setAccount("IOPT");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("?SQP");
      contractsModel0.setSymbols(linkedList0);
      contractsModel0.setSecType("STK");
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      contractRequestValidator0.validate((BaseContractModel) contractsModel0);
      assertEquals("IOPT", contractsModel0.getAccount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContractsModel contractsModel0 = new ContractsModel();
      contractsModel0.setAccount("FOP");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("FOP");
      contractsModel0.setSymbols(linkedList0);
      contractsModel0.setSecType("FOP");
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      try { 
        contractRequestValidator0.validate((BaseContractModel) contractsModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(expiry is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      BaseContractModel baseContractModel0 = new BaseContractModel();
      baseContractModel0.setAccount("OPT");
      baseContractModel0.setSecType("OPT");
      try { 
        contractRequestValidator0.validate(baseContractModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(expiry is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContractsModel contractsModel0 = new ContractsModel();
      contractsModel0.setAccount("IOPT");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("IOPT");
      contractsModel0.setSymbols(linkedList0);
      contractsModel0.setSecType("WAR");
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      try { 
        contractRequestValidator0.validate((BaseContractModel) contractsModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(expiry is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContractsModel contractsModel0 = new ContractsModel();
      contractsModel0.setAccount("IOPT");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      contractsModel0.setSymbols(linkedList0);
      contractsModel0.setSecType("WAR");
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      try { 
        contractRequestValidator0.validate((BaseContractModel) contractsModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(symbols is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      ContractModel contractModel0 = new ContractModel();
      contractModel0.setAccount("IOPT");
      contractModel0.setSymbol("IOPT");
      contractModel0.setSecType("IOPT");
      try { 
        contractRequestValidator0.validate((BaseContractModel) contractModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(expiry is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      ContractModel contractModel0 = new ContractModel();
      contractModel0.setAccount("IOPT");
      contractModel0.setSecType("IOPT");
      try { 
        contractRequestValidator0.validate((BaseContractModel) contractModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(symbol is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContractsModel contractsModel0 = new ContractsModel();
      contractsModel0.setAccount("IOPT");
      contractsModel0.setSecType("WAR");
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      try { 
        contractRequestValidator0.validate((BaseContractModel) contractsModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(symbols is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContractsModel contractsModel0 = new ContractsModel();
      contractsModel0.setAccount("IOPT");
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      try { 
        contractRequestValidator0.validate((BaseContractModel) contractsModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(sec_type is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ContractRequestValidator contractRequestValidator0 = new ContractRequestValidator();
      ContractsModel contractsModel0 = new ContractsModel();
      try { 
        contractRequestValidator0.validate((BaseContractModel) contractsModel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 10101:client biz param error(account is requried)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.validator.ContractRequestValidator", e);
      }
  }
}
