/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 06:44:59 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ConstantEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantEntry_ESTest extends ConstantEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantEntry constantEntry0 = new ConstantEntry(4, 150, ">FaiA!z1HSsT5d[AVoo", ">FaiA!z1HSsT5d[AVoo");
      constantEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstantEntry constantEntry0 = new ConstantEntry(7, 7, "<5z6", "<5z6");
      // Undeclared exception!
      try { 
        constantEntry0.equals(constantEntry0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unsupported constant type
         //
         verifyException("org.mozilla.classfile.ConstantEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstantEntry constantEntry0 = new ConstantEntry(18, 1697, "uq>I/_7[7cq@cf8r=k", "");
      boolean boolean0 = constantEntry0.equals(constantEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstantEntry constantEntry0 = new ConstantEntry(5, 5, "^00bd6%6", "^00bd6%6");
      boolean boolean0 = constantEntry0.equals(constantEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstantEntry constantEntry0 = new ConstantEntry(3, 3, "(C5%", "(C5%");
      boolean boolean0 = constantEntry0.equals(constantEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConstantEntry constantEntry0 = new ConstantEntry(1697, 18, "uq>I/_7[7cq@cf8r=k", "uq>I/_7[7cq@cf8r=k");
      ConstantEntry constantEntry1 = new ConstantEntry(18, 1697, "uq>I/_7[7cq@cf8r=k", "uq>I/_7[7cq@cf8r=k");
      boolean boolean0 = constantEntry1.equals(constantEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConstantEntry constantEntry0 = new ConstantEntry(12, 12, "%zcUL^7XpUz$uLBS", "%zcUL^7XpUz$uLBS");
      boolean boolean0 = constantEntry0.equals(constantEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ConstantEntry constantEntry0 = new ConstantEntry(12, 12, "%zcUL^7XpUz$uLBS", "%zcUL^7XpUz$uLBS");
      boolean boolean0 = constantEntry0.equals("%zcUL^7XpUz$uLBS");
      assertFalse(boolean0);
  }
}
