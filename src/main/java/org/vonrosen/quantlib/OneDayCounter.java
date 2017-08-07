/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class OneDayCounter extends DayCounter {
  private transient long swigCPtr;

  protected OneDayCounter(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.OneDayCounter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OneDayCounter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_OneDayCounter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OneDayCounter() {
    this(QuantLibJNI.new_OneDayCounter(), true);
  }

}
