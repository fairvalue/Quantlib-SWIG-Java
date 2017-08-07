/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class AnalyticDoubleBarrierEngine extends PricingEngine {
  private transient long swigCPtr;

  protected AnalyticDoubleBarrierEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AnalyticDoubleBarrierEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnalyticDoubleBarrierEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_AnalyticDoubleBarrierEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AnalyticDoubleBarrierEngine(GeneralizedBlackScholesProcess process, int series) {
    this(QuantLibJNI.new_AnalyticDoubleBarrierEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, series), true);
  }

  public AnalyticDoubleBarrierEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_AnalyticDoubleBarrierEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}
