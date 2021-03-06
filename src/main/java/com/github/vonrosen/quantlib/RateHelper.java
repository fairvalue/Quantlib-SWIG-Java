/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class RateHelper {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RateHelper(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RateHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RateHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_RateHelper __deref__() {
    long cPtr = QuantLibJNI.RateHelper___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_RateHelper(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.RateHelper_isNull(swigCPtr, this);
  }

  public RateHelper() {
    this(QuantLibJNI.new_RateHelper(), true);
  }

  public QuoteHandle quote() {
    return new QuoteHandle(QuantLibJNI.RateHelper_quote(swigCPtr, this), true);
  }

  public Date latestDate() {
    return new Date(QuantLibJNI.RateHelper_latestDate(swigCPtr, this), true);
  }

  public Date earliestDate() {
    return new Date(QuantLibJNI.RateHelper_earliestDate(swigCPtr, this), true);
  }

  public Date maturityDate() {
    return new Date(QuantLibJNI.RateHelper_maturityDate(swigCPtr, this), true);
  }

  public Date latestRelevantDate() {
    return new Date(QuantLibJNI.RateHelper_latestRelevantDate(swigCPtr, this), true);
  }

  public Date pillarDate() {
    return new Date(QuantLibJNI.RateHelper_pillarDate(swigCPtr, this), true);
  }

  public double impliedQuote() {
    return QuantLibJNI.RateHelper_impliedQuote(swigCPtr, this);
  }

  public double quoteError() {
    return QuantLibJNI.RateHelper_quoteError(swigCPtr, this);
  }

}
