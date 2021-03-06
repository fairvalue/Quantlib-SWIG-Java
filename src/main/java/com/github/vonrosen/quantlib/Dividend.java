/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Dividend {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Dividend(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Dividend obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Dividend(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_Dividend __deref__() {
    long cPtr = QuantLibJNI.Dividend___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Dividend(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.Dividend_isNull(swigCPtr, this);
  }

  public Dividend() {
    this(QuantLibJNI.new_Dividend(), true);
  }

  public double amount() {
    return QuantLibJNI.Dividend_amount(swigCPtr, this);
  }

  public Date date() {
    return new Date(QuantLibJNI.Dividend_date(swigCPtr, this), true);
  }

}
