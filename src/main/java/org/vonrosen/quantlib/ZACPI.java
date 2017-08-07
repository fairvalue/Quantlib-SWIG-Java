/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class ZACPI extends ZeroInflationIndex {
  private transient long swigCPtr;

  protected ZACPI(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZACPI_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZACPI obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ZACPI(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZACPI(boolean interpolated, ZeroInflationTermStructureHandle h) {
    this(QuantLibJNI.new_ZACPI__SWIG_0(interpolated, ZeroInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public ZACPI(boolean interpolated) {
    this(QuantLibJNI.new_ZACPI__SWIG_1(interpolated), true);
  }

}