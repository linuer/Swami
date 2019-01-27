/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 21:55:44 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.ScriptableObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeBoolean_ESTest extends NativeBoolean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initSafeStandardObjects();
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Context context0 = Context.enter();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeBoolean0.exportAsJSClass(13, nativeIterator_StopIteration0, true);
      idFunctionObject0.defineOwnProperty(context0, nativeBoolean0, nativeIterator_StopIteration0);
      assertEquals(1, idFunctionObject0.getLength());
  }
}
