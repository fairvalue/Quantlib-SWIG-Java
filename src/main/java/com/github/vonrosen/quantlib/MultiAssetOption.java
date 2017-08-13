/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class MultiAssetOption extends Instrument {
  private transient long swigCPtr;

  protected MultiAssetOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MultiAssetOption_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MultiAssetOption obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MultiAssetOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double delta() {
    return QuantLibJNI.MultiAssetOption_delta(swigCPtr, this);
  }

  public double gamma() {
    return QuantLibJNI.MultiAssetOption_gamma(swigCPtr, this);
  }

  public double theta() {
    return QuantLibJNI.MultiAssetOption_theta(swigCPtr, this);
  }

  public double vega() {
    return QuantLibJNI.MultiAssetOption_vega(swigCPtr, this);
  }

  public double rho() {
    return QuantLibJNI.MultiAssetOption_rho(swigCPtr, this);
  }

  public double dividendRho() {
    return QuantLibJNI.MultiAssetOption_dividendRho(swigCPtr, this);
  }

  public MultiAssetOption() {
    this(QuantLibJNI.new_MultiAssetOption(), true);
  }

}