/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class RelinkableQuoteHandleVectorVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RelinkableQuoteHandleVectorVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableQuoteHandleVectorVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RelinkableQuoteHandleVectorVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RelinkableQuoteHandleVectorVector() {
    this(QuantLibJNI.new_RelinkableQuoteHandleVectorVector__SWIG_0(), true);
  }

  public RelinkableQuoteHandleVectorVector(long n) {
    this(QuantLibJNI.new_RelinkableQuoteHandleVectorVector__SWIG_1(n), true);
  }

  public long size() {
    return QuantLibJNI.RelinkableQuoteHandleVectorVector_size(swigCPtr, this);
  }

  public long capacity() {
    return QuantLibJNI.RelinkableQuoteHandleVectorVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.RelinkableQuoteHandleVectorVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_clear(swigCPtr, this);
  }

  public void add(RelinkableQuoteHandleVector x) {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_add(swigCPtr, this, RelinkableQuoteHandleVector.getCPtr(x), x);
  }

  public RelinkableQuoteHandleVector get(int i) {
    return new RelinkableQuoteHandleVector(QuantLibJNI.RelinkableQuoteHandleVectorVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, RelinkableQuoteHandleVector val) {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_set(swigCPtr, this, i, RelinkableQuoteHandleVector.getCPtr(val), val);
  }

}
