/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 07:40:54 GMT 2018
 */

package org.mozilla.javascript.jdk15;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.sql.DataTruncation;
import java.sql.SQLRecoverableException;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.InterfaceAdapter;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.jdk15.VMBridge_jdk15;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

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
      InterfaceAdapter interfaceAdapter0 = mock(InterfaceAdapter.class, new ViolatedAssumptionAnswer());
      SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException("Proxy[", "Proxy[", (-823));
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        vMBridge_jdk15_0.newInterfaceProxy((Object) null, (ContextFactory) null, interfaceAdapter0, sQLRecoverableException0, nativeObject0);
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
      Context context0 = Context.enter();
      vMBridge_jdk15_0.setContext(object0, context0);
      assertFalse(context0.isGeneratingDebugChanged());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Iterator<?> iterator0 = vMBridge_jdk15_0.getJavaIterator(context0, nativeJavaClass0, (Object) null);
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      Context context0 = Context.getCurrentContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(0);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Iterator<?> iterator0 = vMBridge_jdk15_0.getJavaIterator(context0, nativeArrayBuffer0, nativeJavaClass0);
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VMBridge_jdk15 vMBridge_jdk15_0 = new VMBridge_jdk15();
      ContextFactory contextFactory0 = new ContextFactory();
      Class<DataTruncation>[] classArray0 = (Class<DataTruncation>[]) Array.newInstance(Class.class, 8);
      Class<DataTruncation> class0 = DataTruncation.class;
      classArray0[0] = class0;
      // Undeclared exception!
      try { 
        vMBridge_jdk15_0.getInterfaceProxyHelper(contextFactory0, classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}