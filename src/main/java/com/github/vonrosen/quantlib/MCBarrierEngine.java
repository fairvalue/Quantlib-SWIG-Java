/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class MCBarrierEngine extends PricingEngine {
  private transient long swigCPtr;

  protected MCBarrierEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCBarrierEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCBarrierEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MCBarrierEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, boolean isBiased, int seed) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, isBiased, seed), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, boolean isBiased) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, isBiased), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps, long timeStepsPerYear) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_7(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits, long timeSteps) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_8(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps), true);
  }

  public MCBarrierEngine(GeneralizedBlackScholesProcess process, String traits) {
    this(QuantLibJNI.new_MCBarrierEngine__SWIG_9(GeneralizedBlackScholesProcess.getCPtr(process), process, traits), true);
  }

}
