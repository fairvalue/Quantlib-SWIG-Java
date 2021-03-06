/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class CPISwap extends Instrument {
  private transient long swigCPtr;

  protected CPISwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CPISwap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CPISwap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CPISwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CPISwap(_CPISwap.Type type, double nominal, boolean subtractInflationNominal, double spread, DayCounter floatDayCount, Schedule floatSchedule, BusinessDayConvention floatRoll, long fixingDays, IborIndex floatIndexPtr, double fixedRate, double baseCPI, DayCounter fixedDayCount, Schedule fixedSchedule, BusinessDayConvention fixedRoll, Period observationLag, ZeroInflationIndex fixedIndexPtr, CPI.InterpolationType observationInterpolation, double inflationNominal) {
    this(QuantLibJNI.new_CPISwap__SWIG_0(type.swigValue(), nominal, subtractInflationNominal, spread, DayCounter.getCPtr(floatDayCount), floatDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, floatRoll.swigValue(), fixingDays, IborIndex.getCPtr(floatIndexPtr), floatIndexPtr, fixedRate, baseCPI, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRoll.swigValue(), Period.getCPtr(observationLag), observationLag, ZeroInflationIndex.getCPtr(fixedIndexPtr), fixedIndexPtr, observationInterpolation.swigValue(), inflationNominal), true);
  }

  public CPISwap(_CPISwap.Type type, double nominal, boolean subtractInflationNominal, double spread, DayCounter floatDayCount, Schedule floatSchedule, BusinessDayConvention floatRoll, long fixingDays, IborIndex floatIndexPtr, double fixedRate, double baseCPI, DayCounter fixedDayCount, Schedule fixedSchedule, BusinessDayConvention fixedRoll, Period observationLag, ZeroInflationIndex fixedIndexPtr, CPI.InterpolationType observationInterpolation) {
    this(QuantLibJNI.new_CPISwap__SWIG_1(type.swigValue(), nominal, subtractInflationNominal, spread, DayCounter.getCPtr(floatDayCount), floatDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, floatRoll.swigValue(), fixingDays, IborIndex.getCPtr(floatIndexPtr), floatIndexPtr, fixedRate, baseCPI, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRoll.swigValue(), Period.getCPtr(observationLag), observationLag, ZeroInflationIndex.getCPtr(fixedIndexPtr), fixedIndexPtr, observationInterpolation.swigValue()), true);
  }

  public CPISwap(_CPISwap.Type type, double nominal, boolean subtractInflationNominal, double spread, DayCounter floatDayCount, Schedule floatSchedule, BusinessDayConvention floatRoll, long fixingDays, IborIndex floatIndexPtr, double fixedRate, double baseCPI, DayCounter fixedDayCount, Schedule fixedSchedule, BusinessDayConvention fixedRoll, Period observationLag, ZeroInflationIndex fixedIndexPtr) {
    this(QuantLibJNI.new_CPISwap__SWIG_2(type.swigValue(), nominal, subtractInflationNominal, spread, DayCounter.getCPtr(floatDayCount), floatDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, floatRoll.swigValue(), fixingDays, IborIndex.getCPtr(floatIndexPtr), floatIndexPtr, fixedRate, baseCPI, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRoll.swigValue(), Period.getCPtr(observationLag), observationLag, ZeroInflationIndex.getCPtr(fixedIndexPtr), fixedIndexPtr), true);
  }

  public double fairRate() {
    return QuantLibJNI.CPISwap_fairRate(swigCPtr, this);
  }

  public double floatLegNPV() {
    return QuantLibJNI.CPISwap_floatLegNPV(swigCPtr, this);
  }

  public double fairSpread() {
    return QuantLibJNI.CPISwap_fairSpread(swigCPtr, this);
  }

  public double fixedLegNPV() {
    return QuantLibJNI.CPISwap_fixedLegNPV(swigCPtr, this);
  }

  public Leg cpiLeg() {
    return new Leg(QuantLibJNI.CPISwap_cpiLeg(swigCPtr, this), false);
  }

  public Leg floatLeg() {
    return new Leg(QuantLibJNI.CPISwap_floatLeg(swigCPtr, this), false);
  }

  public final static _CPISwap.Type Receiver = _CPISwap.Type.swigToEnum(QuantLibJNI.CPISwap_Receiver_get());
  public final static _CPISwap.Type Payer = _CPISwap.Type.swigToEnum(QuantLibJNI.CPISwap_Payer_get());
}
