/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class NonhomogeneousBoundaryConstraint extends Constraint {
  private transient long swigCPtr;

  protected NonhomogeneousBoundaryConstraint(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NonhomogeneousBoundaryConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NonhomogeneousBoundaryConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_NonhomogeneousBoundaryConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NonhomogeneousBoundaryConstraint(Array l, Array u) {
    this(QuantLibJNI.new_NonhomogeneousBoundaryConstraint(Array.getCPtr(l), l, Array.getCPtr(u), u), true);
  }

}
