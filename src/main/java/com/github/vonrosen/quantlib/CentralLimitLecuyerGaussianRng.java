/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class CentralLimitLecuyerGaussianRng {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CentralLimitLecuyerGaussianRng(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CentralLimitLecuyerGaussianRng obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CentralLimitLecuyerGaussianRng(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CentralLimitLecuyerGaussianRng(LecuyerUniformRng rng) {
    this(QuantLibJNI.new_CentralLimitLecuyerGaussianRng(LecuyerUniformRng.getCPtr(rng), rng), true);
  }

  public SampleNumber next() {
    return new SampleNumber(QuantLibJNI.CentralLimitLecuyerGaussianRng_next(swigCPtr, this), true);
  }

}