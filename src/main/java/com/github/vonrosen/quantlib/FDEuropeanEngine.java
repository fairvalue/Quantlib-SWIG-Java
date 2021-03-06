/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class FDEuropeanEngine extends PricingEngine {
  private transient long swigCPtr;

  protected FDEuropeanEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FDEuropeanEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FDEuropeanEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FDEuropeanEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FDEuropeanEngine(GeneralizedBlackScholesProcess process, long timeSteps, long gridPoints, boolean timeDependent) {
    this(QuantLibJNI.new_FDEuropeanEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, gridPoints, timeDependent), true);
  }

  public FDEuropeanEngine(GeneralizedBlackScholesProcess process, long timeSteps, long gridPoints) {
    this(QuantLibJNI.new_FDEuropeanEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, gridPoints), true);
  }

  public FDEuropeanEngine(GeneralizedBlackScholesProcess process, long timeSteps) {
    this(QuantLibJNI.new_FDEuropeanEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps), true);
  }

  public FDEuropeanEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_FDEuropeanEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}
