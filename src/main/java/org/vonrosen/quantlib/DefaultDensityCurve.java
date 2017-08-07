/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class DefaultDensityCurve extends DefaultProbabilityTermStructure {
  private transient long swigCPtr;

  protected DefaultDensityCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DefaultDensityCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DefaultDensityCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DefaultDensityCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DefaultDensityCurve(DateVector dates, DoubleVector densities, DayCounter dayCounter, Calendar calendar, Linear i) {
    this(QuantLibJNI.new_DefaultDensityCurve__SWIG_0(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(densities), densities, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, Linear.getCPtr(i), i), true);
  }

  public DefaultDensityCurve(DateVector dates, DoubleVector densities, DayCounter dayCounter, Calendar calendar) {
    this(QuantLibJNI.new_DefaultDensityCurve__SWIG_1(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(densities), densities, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar), true);
  }

  public DefaultDensityCurve(DateVector dates, DoubleVector densities, DayCounter dayCounter) {
    this(QuantLibJNI.new_DefaultDensityCurve__SWIG_2(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(densities), densities, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.DefaultDensityCurve_dates(swigCPtr, this), false);
  }

  public DoubleVector defaultDensities() {
    return new DoubleVector(QuantLibJNI.DefaultDensityCurve_defaultDensities(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.DefaultDensityCurve_nodes(swigCPtr, this), true);
  }

}
