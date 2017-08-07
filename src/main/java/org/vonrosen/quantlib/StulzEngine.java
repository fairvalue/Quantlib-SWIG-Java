/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class StulzEngine extends PricingEngine {
  private transient long swigCPtr;

  protected StulzEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.StulzEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StulzEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_StulzEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StulzEngine(GeneralizedBlackScholesProcess process1, GeneralizedBlackScholesProcess process2, double correlation) {
    this(QuantLibJNI.new_StulzEngine(GeneralizedBlackScholesProcess.getCPtr(process1), process1, GeneralizedBlackScholesProcess.getCPtr(process2), process2, correlation), true);
  }

}
