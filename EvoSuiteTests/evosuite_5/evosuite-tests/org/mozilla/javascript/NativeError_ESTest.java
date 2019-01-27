/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 03:13:59 GMT 2018
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
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeError_ESTest extends NativeError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        nativeError0.exportAsJSClass(13, nativeInt32Array0, false);
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
      NativeError nativeError0 = new NativeError();
      nativeError0.setStackProvider((RhinoException) null);
      assertEquals("Error", nativeError0.getClassName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      BaseFunction baseFunction0 = new BaseFunction(nativeError0, nativeError0);
      nativeError0.setStackDelegated(baseFunction0, baseFunction0);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeError nativeError0 = new NativeError();
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        nativeError0.exportAsJSClass(13, nativeInt32Array0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        nativeError0.initPrototypeId(13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.NativeError", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        nativeError0.initPrototypeId(3);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        NativeError.init(nativeError0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeError nativeError0 = new NativeError();
      Object object0 = nativeError0.getStackDelegated(nativeInt32Array0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeError0, "Error: ", 13, "Error: ", 0, nativeError0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeError0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=13 MASTER=Error: 
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeError0, "Error", 0, "Error", 8, nativeError0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeError0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.NativeError", e);
      }
  }
}
