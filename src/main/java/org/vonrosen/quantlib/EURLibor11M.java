/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class EURLibor11M extends EURLibor {
  private transient long swigCPtr;

  protected EURLibor11M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EURLibor11M_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EURLibor11M obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_EURLibor11M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EURLibor11M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_EURLibor11M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public EURLibor11M() {
    this(QuantLibJNI.new_EURLibor11M__SWIG_1(), true);
  }

}
