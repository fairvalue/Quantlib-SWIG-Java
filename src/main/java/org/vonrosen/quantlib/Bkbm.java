/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Bkbm extends IborIndex {
  private transient long swigCPtr;

  protected Bkbm(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Bkbm_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bkbm obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Bkbm(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Bkbm(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Bkbm__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Bkbm(Period tenor) {
    this(QuantLibJNI.new_Bkbm__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

}
