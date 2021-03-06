/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class EuropeanOption extends VanillaOption {
  private transient long swigCPtr;

  protected EuropeanOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EuropeanOption_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EuropeanOption obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_EuropeanOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EuropeanOption(Payoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_EuropeanOption(Payoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

}
