/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class VanillaOption extends Instrument {
  private transient long swigCPtr;

  protected VanillaOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.VanillaOption_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VanillaOption obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_VanillaOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VanillaOption(Payoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_VanillaOption(Payoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

  public SampledCurve priceCurve() {
    return new SampledCurve(QuantLibJNI.VanillaOption_priceCurve(swigCPtr, this), true);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process, double accuracy, long maxEvaluations, double minVol, double maxVol) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_0(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process, accuracy, maxEvaluations, minVol, maxVol);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process, double accuracy, long maxEvaluations, double minVol) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_1(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process, accuracy, maxEvaluations, minVol);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process, double accuracy, long maxEvaluations) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_2(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process, accuracy, maxEvaluations);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process, double accuracy) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_3(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process, accuracy);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_4(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process);
  }

  public double delta() {
    return QuantLibJNI.VanillaOption_delta(swigCPtr, this);
  }

  public double gamma() {
    return QuantLibJNI.VanillaOption_gamma(swigCPtr, this);
  }

  public double theta() {
    return QuantLibJNI.VanillaOption_theta(swigCPtr, this);
  }

  public double thetaPerDay() {
    return QuantLibJNI.VanillaOption_thetaPerDay(swigCPtr, this);
  }

  public double vega() {
    return QuantLibJNI.VanillaOption_vega(swigCPtr, this);
  }

  public double rho() {
    return QuantLibJNI.VanillaOption_rho(swigCPtr, this);
  }

  public double dividendRho() {
    return QuantLibJNI.VanillaOption_dividendRho(swigCPtr, this);
  }

  public double strikeSensitivity() {
    return QuantLibJNI.VanillaOption_strikeSensitivity(swigCPtr, this);
  }

}