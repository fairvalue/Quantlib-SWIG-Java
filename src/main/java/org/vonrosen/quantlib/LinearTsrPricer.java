/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class LinearTsrPricer extends CmsCouponPricer {
  private transient long swigCPtr;

  protected LinearTsrPricer(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.LinearTsrPricer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LinearTsrPricer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_LinearTsrPricer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LinearTsrPricer(SwaptionVolatilityStructureHandle swaptionVol, QuoteHandle meanReversion, YieldTermStructureHandle couponDiscountCurve, SWIGTYPE_p_LinearTsrPricer__Settings settings) {
    this(QuantLibJNI.new_LinearTsrPricer__SWIG_0(SwaptionVolatilityStructureHandle.getCPtr(swaptionVol), swaptionVol, QuoteHandle.getCPtr(meanReversion), meanReversion, YieldTermStructureHandle.getCPtr(couponDiscountCurve), couponDiscountCurve, SWIGTYPE_p_LinearTsrPricer__Settings.getCPtr(settings)), true);
  }

  public LinearTsrPricer(SwaptionVolatilityStructureHandle swaptionVol, QuoteHandle meanReversion, YieldTermStructureHandle couponDiscountCurve) {
    this(QuantLibJNI.new_LinearTsrPricer__SWIG_1(SwaptionVolatilityStructureHandle.getCPtr(swaptionVol), swaptionVol, QuoteHandle.getCPtr(meanReversion), meanReversion, YieldTermStructureHandle.getCPtr(couponDiscountCurve), couponDiscountCurve), true);
  }

  public LinearTsrPricer(SwaptionVolatilityStructureHandle swaptionVol, QuoteHandle meanReversion) {
    this(QuantLibJNI.new_LinearTsrPricer__SWIG_2(SwaptionVolatilityStructureHandle.getCPtr(swaptionVol), swaptionVol, QuoteHandle.getCPtr(meanReversion), meanReversion), true);
  }

}
