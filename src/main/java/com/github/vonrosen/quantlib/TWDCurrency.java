/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class TWDCurrency extends Currency {
  private transient long swigCPtr;

  protected TWDCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.TWDCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TWDCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_TWDCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TWDCurrency() {
    this(QuantLibJNI.new_TWDCurrency(), true);
  }

}