/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 03:58:46 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeCall_ESTest extends NativeCall_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeCall0.initPrototypeId(13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.NativeCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCall0, 4, 1, 8);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeCall0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1 MASTER=org.mozilla.javascript.NativeCall@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeCall0, "Call", 13, "Call", 13, nativeCall0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        nativeCall0.execIdCall(idFunctionObjectES6_0, context0, idFunctionObjectES6_0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.NativeCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeCall nativeCall0 = null;
      try {
        nativeCall0 = new NativeCall((NativeFunction) null, (Scriptable) null, (Object[]) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      nativeCall0.defineAttributesForArguments();
      assertEquals(13, ScriptableObject.CONST);
  }
}