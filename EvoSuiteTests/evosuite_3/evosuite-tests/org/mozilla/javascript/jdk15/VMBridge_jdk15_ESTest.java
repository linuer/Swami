/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:48:41 GMT 2018
 */

package org.mozilla.javascript.jdk15;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.InterfaceAdapter;
import org.mozilla.javascript.jdk15.VMBridge_jdk15;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VMBridge_jdk15_ESTest extends VMBridge_jdk15_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      AccessibleObject accessibleObject0 = mock(AccessibleObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(accessibleObject0).isAccessible();
      boolean boolean0 = vMBridge_jdk15_0.tryToMakeAccessible(accessibleObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      AccessibleObject accessibleObject0 = mock(AccessibleObject.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(accessibleObject0).isAccessible();
      boolean boolean0 = vMBridge_jdk15_0.tryToMakeAccessible(accessibleObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(2);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      InterfaceAdapter interfaceAdapter0 = mock(InterfaceAdapter.class, new ViolatedAssumptionAnswer());
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("error reporter", "language version");
      // Undeclared exception!
      try { 
        vMBridge_jdk15_0.newInterfaceProxy((Object) null, contextFactory0, interfaceAdapter0, sQLIntegrityConstraintViolationException0, nativeUint32Array0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.jdk15.VMBridge_jdk15", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      boolean boolean0 = vMBridge_jdk15_0.isDefaultMethod((Method) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      Object object0 = vMBridge_jdk15_0.getThreadContextHelper();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Class<SQLSyntaxErrorException>[] classArray0 = (Class<SQLSyntaxErrorException>[]) Array.newInstance(Class.class, 1);
      Class<SQLSyntaxErrorException> class0 = SQLSyntaxErrorException.class;
      classArray0[0] = class0;
      // Undeclared exception!
      try { 
        vMBridge_jdk15_0.getInterfaceProxyHelper(contextFactory0, classArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.sql.SQLSyntaxErrorException is not an interface
         //
         verifyException("java.lang.reflect.Proxy$ProxyClassFactory", e);
      }
  }
}