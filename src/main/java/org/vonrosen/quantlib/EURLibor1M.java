/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class EURLibor1M extends EURLibor {
  private transient long swigCPtr;

  protected EURLibor1M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EURLibor1M_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EURLibor1M obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_EURLibor1M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EURLibor1M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_EURLibor1M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public EURLibor1M() {
    this(QuantLibJNI.new_EURLibor1M__SWIG_1(), true);
  }

}
