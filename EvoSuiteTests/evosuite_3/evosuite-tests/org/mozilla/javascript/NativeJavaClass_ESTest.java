/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:00:47 GMT 2018
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
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.TopLevel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJavaClass_ESTest extends NativeJavaClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      Class<Delegator> class0 = Delegator.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(baseFunction0, class0, true);
      boolean boolean0 = nativeJavaClass0.has("error reporter", (Scriptable) baseFunction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeJavaClass0.getIds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<Delegator> class0 = Delegator.class;
      Object object0 = nativeJavaClass0.getDefaultValue(class0);
      assertSame(object0, nativeJavaClass0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      double double0 = Context.toNumber(nativeJavaClass0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeJavaClass0.getDefaultValue((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      Class<Delegator> class0 = Delegator.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(baseFunction0, class0, true);
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.ReferenceError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      Class<String> class0 = String.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(baseFunction0, class0);
      // Undeclared exception!
      try { 
        nativeJavaClass0.get("error reporter", (Scriptable) baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Java class \"java.lang.String\" has no public instance field or method named \"error reporter\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.ReferenceError;
      BaseFunction baseFunction0 = importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      Class<String> class0 = String.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(baseFunction0, class0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) nativeJavaClass0;
      NativeJavaObject nativeJavaObject0 = (NativeJavaObject)nativeJavaClass0.call(context0, nativeJavaClass0, nativeJavaClass0, objectArray0);
      assertEquals("JavaObject", nativeJavaObject0.getClassName());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      String string0 = nativeJavaClass0.getClassName();
      assertEquals("JavaClass", string0);
  }
}