/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class FaceValueAccrualClaim extends Claim {
  private transient long swigCPtr;

  protected FaceValueAccrualClaim(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FaceValueAccrualClaim_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FaceValueAccrualClaim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FaceValueAccrualClaim(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FaceValueAccrualClaim(Bond referenceSecurity) {
    this(QuantLibJNI.new_FaceValueAccrualClaim(Bond.getCPtr(referenceSecurity), referenceSecurity), true);
  }

}
