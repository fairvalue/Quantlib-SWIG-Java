/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class MonotonicCubicZeroCurve extends YieldTermStructure {
  private transient long swigCPtr;

  protected MonotonicCubicZeroCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MonotonicCubicZeroCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MonotonicCubicZeroCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MonotonicCubicZeroCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MonotonicCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, MonotonicCubic i, Compounding compounding, Frequency frequency) {
    this(QuantLibJNI.new_MonotonicCubicZeroCurve__SWIG_0(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, MonotonicCubic.getCPtr(i), i, compounding.swigValue(), frequency.swigValue()), true);
  }

  public MonotonicCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, MonotonicCubic i, Compounding compounding) {
    this(QuantLibJNI.new_MonotonicCubicZeroCurve__SWIG_1(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, MonotonicCubic.getCPtr(i), i, compounding.swigValue()), true);
  }

  public MonotonicCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, MonotonicCubic i) {
    this(QuantLibJNI.new_MonotonicCubicZeroCurve__SWIG_2(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, MonotonicCubic.getCPtr(i), i), true);
  }

  public MonotonicCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar) {
    this(QuantLibJNI.new_MonotonicCubicZeroCurve__SWIG_3(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar), true);
  }

  public MonotonicCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter) {
    this(QuantLibJNI.new_MonotonicCubicZeroCurve__SWIG_4(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.MonotonicCubicZeroCurve_times(swigCPtr, this), false);
  }

  public DoubleVector data() {
    return new DoubleVector(QuantLibJNI.MonotonicCubicZeroCurve_data(swigCPtr, this), false);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.MonotonicCubicZeroCurve_dates(swigCPtr, this), false);
  }

  public DoubleVector zeroRates() {
    return new DoubleVector(QuantLibJNI.MonotonicCubicZeroCurve_zeroRates(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.MonotonicCubicZeroCurve_nodes(swigCPtr, this), true);
  }

}
