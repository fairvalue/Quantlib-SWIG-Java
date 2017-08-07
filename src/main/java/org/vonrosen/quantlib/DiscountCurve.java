/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class DiscountCurve extends YieldTermStructure {
  private transient long swigCPtr;

  protected DiscountCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DiscountCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DiscountCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DiscountCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DiscountCurve(DateVector dates, DoubleVector discounts, DayCounter dayCounter, Calendar calendar, LogLinear i) {
    this(QuantLibJNI.new_DiscountCurve__SWIG_0(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(discounts), discounts, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, LogLinear.getCPtr(i), i), true);
  }

  public DiscountCurve(DateVector dates, DoubleVector discounts, DayCounter dayCounter, Calendar calendar) {
    this(QuantLibJNI.new_DiscountCurve__SWIG_1(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(discounts), discounts, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar), true);
  }

  public DiscountCurve(DateVector dates, DoubleVector discounts, DayCounter dayCounter) {
    this(QuantLibJNI.new_DiscountCurve__SWIG_2(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(discounts), discounts, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.DiscountCurve_times(swigCPtr, this), false);
  }

  public DoubleVector data() {
    return new DoubleVector(QuantLibJNI.DiscountCurve_data(swigCPtr, this), false);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.DiscountCurve_dates(swigCPtr, this), false);
  }

  public DoubleVector discounts() {
    return new DoubleVector(QuantLibJNI.DiscountCurve_discounts(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.DiscountCurve_nodes(swigCPtr, this), true);
  }

}
