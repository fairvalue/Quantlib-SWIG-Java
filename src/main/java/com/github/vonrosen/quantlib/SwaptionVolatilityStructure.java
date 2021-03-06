/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class SwaptionVolatilityStructure {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SwaptionVolatilityStructure(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SwaptionVolatilityStructure obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SwaptionVolatilityStructure(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_SwaptionVolatilityStructure __deref__() {
    long cPtr = QuantLibJNI.SwaptionVolatilityStructure___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SwaptionVolatilityStructure(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.SwaptionVolatilityStructure_isNull(swigCPtr, this);
  }

  public Observable asObservable() {
    return new Observable(QuantLibJNI.SwaptionVolatilityStructure_asObservable(swigCPtr, this), true);
  }

  public SwaptionVolatilityStructure() {
    this(QuantLibJNI.new_SwaptionVolatilityStructure(), true);
  }

  public Date referenceDate() {
    return new Date(QuantLibJNI.SwaptionVolatilityStructure_referenceDate(swigCPtr, this), true);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.SwaptionVolatilityStructure_dayCounter(swigCPtr, this), true);
  }

  public Calendar calendar() {
    return new Calendar(QuantLibJNI.SwaptionVolatilityStructure_calendar(swigCPtr, this), true);
  }

  public Period maxSwapTenor() {
    return new Period(QuantLibJNI.SwaptionVolatilityStructure_maxSwapTenor(swigCPtr, this), true);
  }

  public double maxSwapLength() {
    return QuantLibJNI.SwaptionVolatilityStructure_maxSwapLength(swigCPtr, this);
  }

  public double minStrike() {
    return QuantLibJNI.SwaptionVolatilityStructure_minStrike(swigCPtr, this);
  }

  public double maxStrike() {
    return QuantLibJNI.SwaptionVolatilityStructure_maxStrike(swigCPtr, this);
  }

  public double volatility(Date start, Period length, double strike, boolean extrapolate) {
    return QuantLibJNI.SwaptionVolatilityStructure_volatility__SWIG_0(swigCPtr, this, Date.getCPtr(start), start, Period.getCPtr(length), length, strike, extrapolate);
  }

  public double volatility(Date start, Period length, double strike) {
    return QuantLibJNI.SwaptionVolatilityStructure_volatility__SWIG_1(swigCPtr, this, Date.getCPtr(start), start, Period.getCPtr(length), length, strike);
  }

  public double volatility(double start, double length, double strike, boolean extrapolate) {
    return QuantLibJNI.SwaptionVolatilityStructure_volatility__SWIG_2(swigCPtr, this, start, length, strike, extrapolate);
  }

  public double volatility(double start, double length, double strike) {
    return QuantLibJNI.SwaptionVolatilityStructure_volatility__SWIG_3(swigCPtr, this, start, length, strike);
  }

  public double blackVariance(Date start, Period length, double strike, boolean extrapolate) {
    return QuantLibJNI.SwaptionVolatilityStructure_blackVariance__SWIG_0(swigCPtr, this, Date.getCPtr(start), start, Period.getCPtr(length), length, strike, extrapolate);
  }

  public double blackVariance(Date start, Period length, double strike) {
    return QuantLibJNI.SwaptionVolatilityStructure_blackVariance__SWIG_1(swigCPtr, this, Date.getCPtr(start), start, Period.getCPtr(length), length, strike);
  }

  public double blackVariance(double start, double length, double strike, boolean extrapolate) {
    return QuantLibJNI.SwaptionVolatilityStructure_blackVariance__SWIG_2(swigCPtr, this, start, length, strike, extrapolate);
  }

  public double blackVariance(double start, double length, double strike) {
    return QuantLibJNI.SwaptionVolatilityStructure_blackVariance__SWIG_3(swigCPtr, this, start, length, strike);
  }

  public Date optionDateFromTenor(Period p) {
    return new Date(QuantLibJNI.SwaptionVolatilityStructure_optionDateFromTenor(swigCPtr, this, Period.getCPtr(p), p), true);
  }

  public void enableExtrapolation() {
    QuantLibJNI.SwaptionVolatilityStructure_enableExtrapolation(swigCPtr, this);
  }

  public void disableExtrapolation() {
    QuantLibJNI.SwaptionVolatilityStructure_disableExtrapolation(swigCPtr, this);
  }

  public boolean allowsExtrapolation() {
    return QuantLibJNI.SwaptionVolatilityStructure_allowsExtrapolation(swigCPtr, this);
  }

}
