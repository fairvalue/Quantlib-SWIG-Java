/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class StochasticProcessVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StochasticProcessVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StochasticProcessVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_StochasticProcessVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StochasticProcessVector() {
    this(QuantLibJNI.new_StochasticProcessVector__SWIG_0(), true);
  }

  public StochasticProcessVector(long n) {
    this(QuantLibJNI.new_StochasticProcessVector__SWIG_1(n), true);
  }

  public long size() {
    return QuantLibJNI.StochasticProcessVector_size(swigCPtr, this);
  }

  public long capacity() {
    return QuantLibJNI.StochasticProcessVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.StochasticProcessVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.StochasticProcessVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.StochasticProcessVector_clear(swigCPtr, this);
  }

  public void add(StochasticProcess x) {
    QuantLibJNI.StochasticProcessVector_add(swigCPtr, this, StochasticProcess.getCPtr(x), x);
  }

  public StochasticProcess get(int i) {
    return new StochasticProcess(QuantLibJNI.StochasticProcessVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, StochasticProcess val) {
    QuantLibJNI.StochasticProcessVector_set(swigCPtr, this, i, StochasticProcess.getCPtr(val), val);
  }

}
