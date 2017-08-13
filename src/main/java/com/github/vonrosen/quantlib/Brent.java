/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Brent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Brent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Brent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Brent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMaxEvaluations(long evaluations) {
    QuantLibJNI.Brent_setMaxEvaluations(swigCPtr, this, evaluations);
  }

  public void setLowerBound(double lowerBound) {
    QuantLibJNI.Brent_setLowerBound(swigCPtr, this, lowerBound);
  }

  public void setUpperBound(double upperBound) {
    QuantLibJNI.Brent_setUpperBound(swigCPtr, this, upperBound);
  }

  public double solve(UnaryFunctionDelegate function, double xAccuracy, double guess, double step) {
    return QuantLibJNI.Brent_solve__SWIG_0(swigCPtr, this, UnaryFunctionDelegate.getCPtr(function), function, xAccuracy, guess, step);
  }

  public double solve(UnaryFunctionDelegate function, double xAccuracy, double guess, double xMin, double xMax) {
    return QuantLibJNI.Brent_solve__SWIG_1(swigCPtr, this, UnaryFunctionDelegate.getCPtr(function), function, xAccuracy, guess, xMin, xMax);
  }

  public Brent() {
    this(QuantLibJNI.new_Brent(), true);
  }

}