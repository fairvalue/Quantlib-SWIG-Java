/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class DoublePairVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DoublePairVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DoublePairVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DoublePairVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoublePairVector() {
    this(QuantLibJNI.new_DoublePairVector__SWIG_0(), true);
  }

  public DoublePairVector(long n) {
    this(QuantLibJNI.new_DoublePairVector__SWIG_1(n), true);
  }

  public long size() {
    return QuantLibJNI.DoublePairVector_size(swigCPtr, this);
  }

  public long capacity() {
    return QuantLibJNI.DoublePairVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.DoublePairVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.DoublePairVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.DoublePairVector_clear(swigCPtr, this);
  }

  public void add(DoublePair x) {
    QuantLibJNI.DoublePairVector_add(swigCPtr, this, DoublePair.getCPtr(x), x);
  }

  public DoublePair get(int i) {
    return new DoublePair(QuantLibJNI.DoublePairVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, DoublePair val) {
    QuantLibJNI.DoublePairVector_set(swigCPtr, this, i, DoublePair.getCPtr(val), val);
  }

}
