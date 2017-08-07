/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class GammaFunction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GammaFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GammaFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GammaFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double logValue(double x) {
    return QuantLibJNI.GammaFunction_logValue(swigCPtr, this, x);
  }

  public GammaFunction() {
    this(QuantLibJNI.new_GammaFunction(), true);
  }

}
