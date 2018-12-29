/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:13:46 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.PolicySecurityController;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SecurityController_ESTest extends SecurityController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      SecurityController.initGlobal(policySecurityController0);
      // Undeclared exception!
      try { 
        SecurityController.initGlobal(policySecurityController0);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Cannot overwrite already installed global SecurityController
         //
         verifyException("org.mozilla.javascript.SecurityController", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = SecurityController.hasGlobal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        SecurityController.getStaticSecurityDomainClass();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      Context context0 = Context.getCurrentContext();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(18);
      // Undeclared exception!
      try { 
        policySecurityController0.execWithDomain(context0, nativeInt32Array0, (Script) null, context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // callWithDomain should be overridden
         //
         verifyException("org.mozilla.javascript.SecurityController", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        SecurityController.createLoader((ClassLoader) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      SecurityController.initGlobal(policySecurityController0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Integer integer0 = new Integer((-642));
      // Undeclared exception!
      try { 
        SecurityController.createLoader(classLoader0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}