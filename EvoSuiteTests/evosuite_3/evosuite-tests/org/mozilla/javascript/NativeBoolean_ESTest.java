/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 21:55:19 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeBoolean_ESTest extends NativeBoolean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      // Undeclared exception!
      try { 
        nativeBoolean0.exportAsJSClass(13, nativeBoolean0, false);
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
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, (-470), 1);
      // Undeclared exception!
      try { 
        NativeBoolean.init(nativeUint16Array0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeBoolean0, "Boolean", 8, "Boolean", 2, nativeBoolean0);
      Object[] objectArray0 = new Object[20];
      // Undeclared exception!
      try { 
        nativeBoolean0.execIdCall(idFunctionObjectES6_0, (Context) null, nativeBoolean0, nativeBoolean0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8
         //
         verifyException("org.mozilla.javascript.NativeBoolean", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeBoolean0, "Boolean", 4, "Boolean", 0, nativeBoolean0);
      Object[] objectArray0 = new Object[19];
      Object object0 = idFunctionObjectES6_0.call((Context) null, nativeBoolean0, nativeBoolean0, objectArray0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeBoolean0, "Boolean", 4, "Boolean", 0, nativeBoolean0);
      Object[] objectArray0 = new Object[11];
      // Undeclared exception!
      try { 
        nativeBoolean0.execIdCall(idFunctionObjectES6_0, (Context) null, idFunctionObjectES6_0, idFunctionObjectES6_0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"Boolean\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeBoolean0, nativeBoolean0, 8, "R7giw^\"\"I9>xoPjj]u4", 2, nativeBoolean0);
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}