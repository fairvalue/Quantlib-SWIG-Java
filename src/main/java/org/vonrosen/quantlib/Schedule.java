/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Schedule {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Schedule(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Schedule obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Schedule(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Schedule(DateVector arg0, Calendar calendar, BusinessDayConvention rollingConvention) {
    this(QuantLibJNI.new_Schedule__SWIG_0(DateVector.getCPtr(arg0), arg0, Calendar.getCPtr(calendar), calendar, rollingConvention.swigValue()), true);
  }

  public Schedule(Date effectiveDate, Date terminationDate, Period tenor, Calendar calendar, BusinessDayConvention convention, BusinessDayConvention terminationDateConvention, DateGeneration.Rule rule, boolean endOfMonth, Date firstDate, Date nextToLastDate) {
    this(QuantLibJNI.new_Schedule__SWIG_1(Date.getCPtr(effectiveDate), effectiveDate, Date.getCPtr(terminationDate), terminationDate, Period.getCPtr(tenor), tenor, Calendar.getCPtr(calendar), calendar, convention.swigValue(), terminationDateConvention.swigValue(), rule.swigValue(), endOfMonth, Date.getCPtr(firstDate), firstDate, Date.getCPtr(nextToLastDate), nextToLastDate), true);
  }

  public Schedule(Date effectiveDate, Date terminationDate, Period tenor, Calendar calendar, BusinessDayConvention convention, BusinessDayConvention terminationDateConvention, DateGeneration.Rule rule, boolean endOfMonth, Date firstDate) {
    this(QuantLibJNI.new_Schedule__SWIG_2(Date.getCPtr(effectiveDate), effectiveDate, Date.getCPtr(terminationDate), terminationDate, Period.getCPtr(tenor), tenor, Calendar.getCPtr(calendar), calendar, convention.swigValue(), terminationDateConvention.swigValue(), rule.swigValue(), endOfMonth, Date.getCPtr(firstDate), firstDate), true);
  }

  public Schedule(Date effectiveDate, Date terminationDate, Period tenor, Calendar calendar, BusinessDayConvention convention, BusinessDayConvention terminationDateConvention, DateGeneration.Rule rule, boolean endOfMonth) {
    this(QuantLibJNI.new_Schedule__SWIG_3(Date.getCPtr(effectiveDate), effectiveDate, Date.getCPtr(terminationDate), terminationDate, Period.getCPtr(tenor), tenor, Calendar.getCPtr(calendar), calendar, convention.swigValue(), terminationDateConvention.swigValue(), rule.swigValue(), endOfMonth), true);
  }

  public Schedule() {
    this(QuantLibJNI.new_Schedule__SWIG_4(), true);
  }

  public long size() {
    return QuantLibJNI.Schedule_size(swigCPtr, this);
  }

  public Date date(long i) {
    return new Date(QuantLibJNI.Schedule_date(swigCPtr, this, i), true);
  }

  public boolean isRegular(long i) {
    return QuantLibJNI.Schedule_isRegular(swigCPtr, this, i);
  }

  public Schedule until(Date truncationDate) {
    return new Schedule(QuantLibJNI.Schedule_until(swigCPtr, this, Date.getCPtr(truncationDate), truncationDate), true);
  }

}
