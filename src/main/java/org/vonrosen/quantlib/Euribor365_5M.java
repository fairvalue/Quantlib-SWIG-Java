/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Euribor365_5M extends Euribor365 {
  private transient long swigCPtr;

  protected Euribor365_5M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Euribor365_5M_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Euribor365_5M obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Euribor365_5M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Euribor365_5M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Euribor365_5M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Euribor365_5M() {
    this(QuantLibJNI.new_Euribor365_5M__SWIG_1(), true);
  }

}
