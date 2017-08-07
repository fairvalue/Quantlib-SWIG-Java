/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class CentralLimitKnuthGaussianRng {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CentralLimitKnuthGaussianRng(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CentralLimitKnuthGaussianRng obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CentralLimitKnuthGaussianRng(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CentralLimitKnuthGaussianRng(KnuthUniformRng rng) {
    this(QuantLibJNI.new_CentralLimitKnuthGaussianRng(KnuthUniformRng.getCPtr(rng), rng), true);
  }

  public SampleNumber next() {
    return new SampleNumber(QuantLibJNI.CentralLimitKnuthGaussianRng_next(swigCPtr, this), true);
  }

}