/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class CapFloorTermVolatilityStructureHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CapFloorTermVolatilityStructureHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CapFloorTermVolatilityStructureHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CapFloorTermVolatilityStructureHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CapFloorTermVolatilityStructureHandle(CapFloorTermVolatilityStructure arg0) {
    this(QuantLibJNI.new_CapFloorTermVolatilityStructureHandle__SWIG_0(CapFloorTermVolatilityStructure.getCPtr(arg0), arg0), true);
  }

  public CapFloorTermVolatilityStructureHandle() {
    this(QuantLibJNI.new_CapFloorTermVolatilityStructureHandle__SWIG_1(), true);
  }

  public CapFloorTermVolatilityStructure __deref__() {
    return new CapFloorTermVolatilityStructure(QuantLibJNI.CapFloorTermVolatilityStructureHandle___deref__(swigCPtr, this), true);
  }

  public boolean empty() {
    return QuantLibJNI.CapFloorTermVolatilityStructureHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    return new Observable(QuantLibJNI.CapFloorTermVolatilityStructureHandle_asObservable(swigCPtr, this), true);
  }

  public double volatility(Period length, double strike, boolean extrapolate) {
    return QuantLibJNI.CapFloorTermVolatilityStructureHandle_volatility__SWIG_0(swigCPtr, this, Period.getCPtr(length), length, strike, extrapolate);
  }

  public double volatility(Period length, double strike) {
    return QuantLibJNI.CapFloorTermVolatilityStructureHandle_volatility__SWIG_1(swigCPtr, this, Period.getCPtr(length), length, strike);
  }

  public double volatility(Date end, double strike, boolean extrapolate) {
    return QuantLibJNI.CapFloorTermVolatilityStructureHandle_volatility__SWIG_2(swigCPtr, this, Date.getCPtr(end), end, strike, extrapolate);
  }

  public double volatility(Date end, double strike) {
    return QuantLibJNI.CapFloorTermVolatilityStructureHandle_volatility__SWIG_3(swigCPtr, this, Date.getCPtr(end), end, strike);
  }

  public double volatility(double end, double strike, boolean extrapolate) {
    return QuantLibJNI.CapFloorTermVolatilityStructureHandle_volatility__SWIG_4(swigCPtr, this, end, strike, extrapolate);
  }

  public double volatility(double end, double strike) {
    return QuantLibJNI.CapFloorTermVolatilityStructureHandle_volatility__SWIG_5(swigCPtr, this, end, strike);
  }

  public void enableExtrapolation() {
    QuantLibJNI.CapFloorTermVolatilityStructureHandle_enableExtrapolation(swigCPtr, this);
  }

  public void disableExtrapolation() {
    QuantLibJNI.CapFloorTermVolatilityStructureHandle_disableExtrapolation(swigCPtr, this);
  }

  public boolean allowsExtrapolation() {
    return QuantLibJNI.CapFloorTermVolatilityStructureHandle_allowsExtrapolation(swigCPtr, this);
  }

}