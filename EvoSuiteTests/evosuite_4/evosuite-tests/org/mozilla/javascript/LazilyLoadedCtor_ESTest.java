/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:22:16 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.LazilyLoadedCtor;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LazilyLoadedCtor_ESTest extends LazilyLoadedCtor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeInt16Array0, "org.mozilla.javascript.NativeContinuation", "org.mozilla.javascript.NativeContinuation", true, true);
      // Undeclared exception!
      try { 
        lazilyLoadedCtor0.init();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeUint8Array0, nativeUint8Array0, 13, "S[McFq j;??)+G", 8, nativeInt32Array0);
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(idFunctionObject0, "", "org.mozilla.javascript.xml.XMLLib", false, false);
      lazilyLoadedCtor0.init();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      Delegator delegator0 = new Delegator();
      nativeInt16Array0.setParentScope(delegator0);
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeInt16Array0, "org.mozilla.javascript.NativeContinuation", "org.mozilla.javascript.NativeContinuation", true, true);
      // Undeclared exception!
      try { 
        lazilyLoadedCtor0.init();
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
  public void test4()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(baseFunction0, "org.mozilla.javascript.tools.shell.Environment", "org.mozilla.javascript.tools.shell.Environment", false);
      lazilyLoadedCtor0.init();
  }
}
