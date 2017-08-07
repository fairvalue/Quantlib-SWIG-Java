/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class DiscreteAveragingAsianOption extends Instrument {
  private transient long swigCPtr;

  protected DiscreteAveragingAsianOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DiscreteAveragingAsianOption_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DiscreteAveragingAsianOption obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DiscreteAveragingAsianOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DiscreteAveragingAsianOption(Average.Type averageType, double runningAccumulator, long pastFixings, DateVector fixingDates, Payoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_DiscreteAveragingAsianOption(averageType.swigValue(), runningAccumulator, pastFixings, DateVector.getCPtr(fixingDates), fixingDates, Payoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

  public double delta() {
    return QuantLibJNI.DiscreteAveragingAsianOption_delta(swigCPtr, this);
  }

  public double gamma() {
    return QuantLibJNI.DiscreteAveragingAsianOption_gamma(swigCPtr, this);
  }

  public double theta() {
    return QuantLibJNI.DiscreteAveragingAsianOption_theta(swigCPtr, this);
  }

  public double thetaPerDay() {
    return QuantLibJNI.DiscreteAveragingAsianOption_thetaPerDay(swigCPtr, this);
  }

  public double vega() {
    return QuantLibJNI.DiscreteAveragingAsianOption_vega(swigCPtr, this);
  }

  public double rho() {
    return QuantLibJNI.DiscreteAveragingAsianOption_rho(swigCPtr, this);
  }

  public double dividendRho() {
    return QuantLibJNI.DiscreteAveragingAsianOption_dividendRho(swigCPtr, this);
  }

  public double strikeSensitivity() {
    return QuantLibJNI.DiscreteAveragingAsianOption_strikeSensitivity(swigCPtr, this);
  }

}
