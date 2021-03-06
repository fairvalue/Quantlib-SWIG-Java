/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Exercise {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Exercise(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Exercise obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Exercise(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public _Exercise __deref__() {
    long cPtr = QuantLibJNI.Exercise___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new _Exercise(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.Exercise_isNull(swigCPtr, this);
  }

  public _Exercise.Type exerciseType() {
    return _Exercise.Type.swigToEnum(QuantLibJNI.Exercise_exerciseType(swigCPtr, this));
  }

  public Exercise() {
    this(QuantLibJNI.new_Exercise(), true);
  }

  public _Exercise.Type type() {
    return _Exercise.Type.swigToEnum(QuantLibJNI.Exercise_type(swigCPtr, this));
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.Exercise_dates(swigCPtr, this), false);
  }

  public Date lastDate() {
    return new Date(QuantLibJNI.Exercise_lastDate(swigCPtr, this), true);
  }

  public final static _Exercise.Type American = _Exercise.Type.swigToEnum(QuantLibJNI.Exercise_American_get());
  public final static _Exercise.Type Bermudan = _Exercise.Type.swigToEnum(QuantLibJNI.Exercise_Bermudan_get());
  public final static _Exercise.Type European = _Exercise.Type.swigToEnum(QuantLibJNI.Exercise_European_get());
}
