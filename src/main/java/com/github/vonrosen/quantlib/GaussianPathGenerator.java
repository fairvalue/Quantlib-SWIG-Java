/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class GaussianPathGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussianPathGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussianPathGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussianPathGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussianPathGenerator(StochasticProcess1D process, double length, long steps, GaussianRandomSequenceGenerator rsg, boolean brownianBridge) {
    this(QuantLibJNI.new_GaussianPathGenerator(StochasticProcess1D.getCPtr(process), process, length, steps, GaussianRandomSequenceGenerator.getCPtr(rsg), rsg, brownianBridge), true);
  }

  public SamplePath next() {
    return new SamplePath(QuantLibJNI.GaussianPathGenerator_next(swigCPtr, this), true);
  }

  public SamplePath antithetic() {
    return new SamplePath(QuantLibJNI.GaussianPathGenerator_antithetic(swigCPtr, this), true);
  }

}
