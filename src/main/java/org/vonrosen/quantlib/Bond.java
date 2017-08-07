/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Bond extends Instrument {
  private transient long swigCPtr;

  protected Bond(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Bond_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bond obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Bond(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Bond(long settlementDays, Calendar calendar, double faceAmount, Date maturityDate, Date issueDate, Leg cashflows) {
    this(QuantLibJNI.new_Bond__SWIG_0(settlementDays, Calendar.getCPtr(calendar), calendar, faceAmount, Date.getCPtr(maturityDate), maturityDate, Date.getCPtr(issueDate), issueDate, Leg.getCPtr(cashflows), cashflows), true);
  }

  public Bond(long settlementDays, Calendar calendar, double faceAmount, Date maturityDate, Date issueDate) {
    this(QuantLibJNI.new_Bond__SWIG_1(settlementDays, Calendar.getCPtr(calendar), calendar, faceAmount, Date.getCPtr(maturityDate), maturityDate, Date.getCPtr(issueDate), issueDate), true);
  }

  public Bond(long settlementDays, Calendar calendar, double faceAmount, Date maturityDate) {
    this(QuantLibJNI.new_Bond__SWIG_2(settlementDays, Calendar.getCPtr(calendar), calendar, faceAmount, Date.getCPtr(maturityDate), maturityDate), true);
  }

  public double nextCouponRate(Date d) {
    return QuantLibJNI.Bond_nextCouponRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d);
  }

  public double nextCouponRate() {
    return QuantLibJNI.Bond_nextCouponRate__SWIG_1(swigCPtr, this);
  }

  public double previousCouponRate(Date d) {
    return QuantLibJNI.Bond_previousCouponRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d);
  }

  public double previousCouponRate() {
    return QuantLibJNI.Bond_previousCouponRate__SWIG_1(swigCPtr, this);
  }

  public long settlementDays() {
    return QuantLibJNI.Bond_settlementDays(swigCPtr, this);
  }

  public Date settlementDate(Date d) {
    return new Date(QuantLibJNI.Bond_settlementDate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d), true);
  }

  public Date settlementDate() {
    return new Date(QuantLibJNI.Bond_settlementDate__SWIG_1(swigCPtr, this), true);
  }

  public Date startDate() {
    return new Date(QuantLibJNI.Bond_startDate(swigCPtr, this), true);
  }

  public Date maturityDate() {
    return new Date(QuantLibJNI.Bond_maturityDate(swigCPtr, this), true);
  }

  public Date issueDate() {
    return new Date(QuantLibJNI.Bond_issueDate(swigCPtr, this), true);
  }

  public Leg cashflows() {
    return new Leg(QuantLibJNI.Bond_cashflows(swigCPtr, this), true);
  }

  public Leg redemptions() {
    return new Leg(QuantLibJNI.Bond_redemptions(swigCPtr, this), true);
  }

  public CashFlow redemption() {
    return new CashFlow(QuantLibJNI.Bond_redemption(swigCPtr, this), true);
  }

  public Calendar calendar() {
    return new Calendar(QuantLibJNI.Bond_calendar(swigCPtr, this), true);
  }

  public DoubleVector notionals() {
    return new DoubleVector(QuantLibJNI.Bond_notionals(swigCPtr, this), true);
  }

  public double notional(Date d) {
    return QuantLibJNI.Bond_notional__SWIG_0(swigCPtr, this, Date.getCPtr(d), d);
  }

  public double notional() {
    return QuantLibJNI.Bond_notional__SWIG_1(swigCPtr, this);
  }

  public double cleanPrice() {
    return QuantLibJNI.Bond_cleanPrice__SWIG_0(swigCPtr, this);
  }

  public double cleanPrice(double yield, DayCounter dc, Compounding compounding, Frequency frequency, Date settlement) {
    return QuantLibJNI.Bond_cleanPrice__SWIG_1(swigCPtr, this, yield, DayCounter.getCPtr(dc), dc, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlement), settlement);
  }

  public double cleanPrice(double yield, DayCounter dc, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.Bond_cleanPrice__SWIG_2(swigCPtr, this, yield, DayCounter.getCPtr(dc), dc, compounding.swigValue(), frequency.swigValue());
  }

  public double dirtyPrice() {
    return QuantLibJNI.Bond_dirtyPrice__SWIG_0(swigCPtr, this);
  }

  public double dirtyPrice(double yield, DayCounter dc, Compounding compounding, Frequency frequency, Date settlement) {
    return QuantLibJNI.Bond_dirtyPrice__SWIG_1(swigCPtr, this, yield, DayCounter.getCPtr(dc), dc, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlement), settlement);
  }

  public double dirtyPrice(double yield, DayCounter dc, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.Bond_dirtyPrice__SWIG_2(swigCPtr, this, yield, DayCounter.getCPtr(dc), dc, compounding.swigValue(), frequency.swigValue());
  }

  public double yield(DayCounter dc, Compounding compounding, Frequency freq, double accuracy, long maxEvaluations) {
    return QuantLibJNI.Bond_yield__SWIG_0(swigCPtr, this, DayCounter.getCPtr(dc), dc, compounding.swigValue(), freq.swigValue(), accuracy, maxEvaluations);
  }

  public double yield(DayCounter dc, Compounding compounding, Frequency freq, double accuracy) {
    return QuantLibJNI.Bond_yield__SWIG_1(swigCPtr, this, DayCounter.getCPtr(dc), dc, compounding.swigValue(), freq.swigValue(), accuracy);
  }

  public double yield(DayCounter dc, Compounding compounding, Frequency freq) {
    return QuantLibJNI.Bond_yield__SWIG_2(swigCPtr, this, DayCounter.getCPtr(dc), dc, compounding.swigValue(), freq.swigValue());
  }

  public double yield(double cleanPrice, DayCounter dc, Compounding compounding, Frequency freq, Date settlement, double accuracy, long maxEvaluations) {
    return QuantLibJNI.Bond_yield__SWIG_3(swigCPtr, this, cleanPrice, DayCounter.getCPtr(dc), dc, compounding.swigValue(), freq.swigValue(), Date.getCPtr(settlement), settlement, accuracy, maxEvaluations);
  }

  public double yield(double cleanPrice, DayCounter dc, Compounding compounding, Frequency freq, Date settlement, double accuracy) {
    return QuantLibJNI.Bond_yield__SWIG_4(swigCPtr, this, cleanPrice, DayCounter.getCPtr(dc), dc, compounding.swigValue(), freq.swigValue(), Date.getCPtr(settlement), settlement, accuracy);
  }

  public double yield(double cleanPrice, DayCounter dc, Compounding compounding, Frequency freq, Date settlement) {
    return QuantLibJNI.Bond_yield__SWIG_5(swigCPtr, this, cleanPrice, DayCounter.getCPtr(dc), dc, compounding.swigValue(), freq.swigValue(), Date.getCPtr(settlement), settlement);
  }

  public double yield(double cleanPrice, DayCounter dc, Compounding compounding, Frequency freq) {
    return QuantLibJNI.Bond_yield__SWIG_6(swigCPtr, this, cleanPrice, DayCounter.getCPtr(dc), dc, compounding.swigValue(), freq.swigValue());
  }

  public double accruedAmount(Date settlement) {
    return QuantLibJNI.Bond_accruedAmount__SWIG_0(swigCPtr, this, Date.getCPtr(settlement), settlement);
  }

  public double accruedAmount() {
    return QuantLibJNI.Bond_accruedAmount__SWIG_1(swigCPtr, this);
  }

  public double settlementValue() {
    return QuantLibJNI.Bond_settlementValue__SWIG_0(swigCPtr, this);
  }

  public double settlementValue(double cleanPrice) {
    return QuantLibJNI.Bond_settlementValue__SWIG_1(swigCPtr, this, cleanPrice);
  }

}
