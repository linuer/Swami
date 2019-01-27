/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 01:12:01 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.UintMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UintMap_ESTest extends UintMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UintMap uintMap0 = new UintMap(2350);
      int int0 = uintMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(0, (Object) null);
      uintMap0.put(3097, 3097);
      assertEquals(2, uintMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      boolean boolean0 = uintMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      uintMap0.put(4080, 3);
      uintMap0.put(2592, 3);
      uintMap0.put(3, (Object) "FAILED ASSERTION");
      uintMap0.put(32, 2592);
      assertFalse(uintMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      boolean boolean0 = uintMap0.has(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(0, (Object) null);
      uintMap0.getObject(0);
      assertFalse(uintMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(0, (Object) null);
      uintMap0.getObject(1);
      assertEquals(1, uintMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(0, (Object) null);
      uintMap0.getKeys();
      assertFalse(uintMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      uintMap0.put(4080, 3);
      uintMap0.put(3, (Object) "FAILED ASSERTION");
      int int0 = uintMap0.getInt(3, 2592);
      assertEquals(2, uintMap0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      uintMap0.put(3, (Object) "FAILED ASSERTION");
      int int0 = uintMap0.getInt(3, 2592);
      assertEquals(1, uintMap0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(0, (Object) "Jw");
      uintMap0.getExistingInt(0);
      assertEquals(1, uintMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      uintMap0.put(32, 2592);
      int int0 = uintMap0.getExistingInt(32);
      assertFalse(uintMap0.isEmpty());
      assertEquals(2592, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      // Undeclared exception!
      try { 
        uintMap0.getExistingInt(32);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(3097, 3097);
      uintMap0.put(0, (Object) null);
      int int0 = uintMap0.getInt(4094, 3097);
      assertEquals(2, uintMap0.size());
      assertEquals(3097, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UintMap uintMap0 = new UintMap(4073);
      Object object0 = new Object();
      uintMap0.put(4073, object0);
      uintMap0.remove(4073);
      uintMap0.put(4073, object0);
      assertEquals(1, uintMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UintMap uintMap0 = new UintMap(4073);
      Object object0 = new Object();
      uintMap0.put(4073, object0);
      assertFalse(uintMap0.isEmpty());
      
      uintMap0.clear();
      assertTrue(uintMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      uintMap0.put(3097, 3097);
      uintMap0.put(0, (Object) null);
      uintMap0.remove(0);
      uintMap0.put(0, 0);
      assertEquals(2, uintMap0.size());
  }
}
