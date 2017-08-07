/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class GarmanKlassSigma5 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GarmanKlassSigma5(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GarmanKlassSigma5 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GarmanKlassSigma5(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GarmanKlassSigma5(double yearFraction) {
    this(QuantLibJNI.new_GarmanKlassSigma5(yearFraction), true);
  }

  public RealTimeSeries calculate(IntervalPriceTimeSeries arg0) {
    return new RealTimeSeries(QuantLibJNI.GarmanKlassSigma5_calculate(swigCPtr, this, IntervalPriceTimeSeries.getCPtr(arg0), arg0), true);
  }

}
