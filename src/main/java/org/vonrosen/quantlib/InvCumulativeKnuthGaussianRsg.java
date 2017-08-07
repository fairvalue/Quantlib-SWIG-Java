/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class InvCumulativeKnuthGaussianRsg {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InvCumulativeKnuthGaussianRsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InvCumulativeKnuthGaussianRsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_InvCumulativeKnuthGaussianRsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InvCumulativeKnuthGaussianRsg(KnuthUniformRsg uniformSequenceGenerator) {
    this(QuantLibJNI.new_InvCumulativeKnuthGaussianRsg(KnuthUniformRsg.getCPtr(uniformSequenceGenerator), uniformSequenceGenerator), true);
  }

  public SampleRealVector nextSequence() {
    return new SampleRealVector(QuantLibJNI.InvCumulativeKnuthGaussianRsg_nextSequence(swigCPtr, this), false);
  }

  public long dimension() {
    return QuantLibJNI.InvCumulativeKnuthGaussianRsg_dimension(swigCPtr, this);
  }

}
