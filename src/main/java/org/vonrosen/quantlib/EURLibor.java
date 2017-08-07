/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class EURLibor extends IborIndex {
  private transient long swigCPtr;

  protected EURLibor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EURLibor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EURLibor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_EURLibor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EURLibor(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_EURLibor__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public EURLibor(Period tenor) {
    this(QuantLibJNI.new_EURLibor__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

}
