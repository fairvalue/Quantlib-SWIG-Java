/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class ConvertibleFixedCouponBond extends Bond {
  private transient long swigCPtr;

  protected ConvertibleFixedCouponBond(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ConvertibleFixedCouponBond_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConvertibleFixedCouponBond obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ConvertibleFixedCouponBond(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ConvertibleFixedCouponBond(Exercise exercise, double conversionRatio, DividendSchedule dividends, CallabilitySchedule callability, QuoteHandle creditSpread, Date issueDate, int settlementDays, DoubleVector coupons, DayCounter dayCounter, Schedule schedule, double redemption) {
    this(QuantLibJNI.new_ConvertibleFixedCouponBond__SWIG_0(Exercise.getCPtr(exercise), exercise, conversionRatio, DividendSchedule.getCPtr(dividends), dividends, CallabilitySchedule.getCPtr(callability), callability, QuoteHandle.getCPtr(creditSpread), creditSpread, Date.getCPtr(issueDate), issueDate, settlementDays, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(dayCounter), dayCounter, Schedule.getCPtr(schedule), schedule, redemption), true);
  }

  public ConvertibleFixedCouponBond(Exercise exercise, double conversionRatio, DividendSchedule dividends, CallabilitySchedule callability, QuoteHandle creditSpread, Date issueDate, int settlementDays, DoubleVector coupons, DayCounter dayCounter, Schedule schedule) {
    this(QuantLibJNI.new_ConvertibleFixedCouponBond__SWIG_1(Exercise.getCPtr(exercise), exercise, conversionRatio, DividendSchedule.getCPtr(dividends), dividends, CallabilitySchedule.getCPtr(callability), callability, QuoteHandle.getCPtr(creditSpread), creditSpread, Date.getCPtr(issueDate), issueDate, settlementDays, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(dayCounter), dayCounter, Schedule.getCPtr(schedule), schedule), true);
  }

}
