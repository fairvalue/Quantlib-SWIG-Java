/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class ConstantParameter extends Parameter {
  private transient long swigCPtr;

  protected ConstantParameter(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ConstantParameter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConstantParameter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ConstantParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ConstantParameter(Constraint constraint) {
    this(QuantLibJNI.new_ConstantParameter__SWIG_0(Constraint.getCPtr(constraint), constraint), true);
  }

  public ConstantParameter(double value, Constraint constraint) {
    this(QuantLibJNI.new_ConstantParameter__SWIG_1(value, Constraint.getCPtr(constraint), constraint), true);
  }

}
