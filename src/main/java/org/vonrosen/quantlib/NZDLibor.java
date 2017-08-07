/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class NZDLibor extends IborIndex {
  private transient long swigCPtr;

  protected NZDLibor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NZDLibor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NZDLibor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_NZDLibor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NZDLibor(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_NZDLibor__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public NZDLibor(Period tenor) {
    this(QuantLibJNI.new_NZDLibor__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

}
