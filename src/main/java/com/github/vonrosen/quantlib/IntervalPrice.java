/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class IntervalPrice {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntervalPrice(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntervalPrice obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_IntervalPrice(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntervalPrice(double arg0, double arg1, double arg2, double arg3) {
    this(QuantLibJNI.new_IntervalPrice(arg0, arg1, arg2, arg3), true);
  }

  public void setValue(double arg0, IntervalPrice.Type arg1) {
    QuantLibJNI.IntervalPrice_setValue(swigCPtr, this, arg0, arg1.swigValue());
  }

  public void setValues(double arg0, double arg1, double arg2, double arg3) {
    QuantLibJNI.IntervalPrice_setValues(swigCPtr, this, arg0, arg1, arg2, arg3);
  }

  public double value(IntervalPrice.Type t) {
    return QuantLibJNI.IntervalPrice_value(swigCPtr, this, t.swigValue());
  }

  public double open() {
    return QuantLibJNI.IntervalPrice_open(swigCPtr, this);
  }

  public double close() {
    return QuantLibJNI.IntervalPrice_close(swigCPtr, this);
  }

  public double high() {
    return QuantLibJNI.IntervalPrice_high(swigCPtr, this);
  }

  public double low() {
    return QuantLibJNI.IntervalPrice_low(swigCPtr, this);
  }

  public static IntervalPriceTimeSeries makeSeries(DateVector d, DoubleVector open, DoubleVector close, DoubleVector high, DoubleVector low) {
    return new IntervalPriceTimeSeries(QuantLibJNI.IntervalPrice_makeSeries(DateVector.getCPtr(d), d, DoubleVector.getCPtr(open), open, DoubleVector.getCPtr(close), close, DoubleVector.getCPtr(high), high, DoubleVector.getCPtr(low), low), true);
  }

  public static DoubleVector extractValues(IntervalPriceTimeSeries arg0, IntervalPrice.Type t) {
    return new DoubleVector(QuantLibJNI.IntervalPrice_extractValues(IntervalPriceTimeSeries.getCPtr(arg0), arg0, t.swigValue()), true);
  }

  public static RealTimeSeries extractComponent(IntervalPriceTimeSeries arg0, IntervalPrice.Type t) {
    return new RealTimeSeries(QuantLibJNI.IntervalPrice_extractComponent(IntervalPriceTimeSeries.getCPtr(arg0), arg0, t.swigValue()), true);
  }

  public final static class Type {
    public final static IntervalPrice.Type Open = new IntervalPrice.Type("Open");
    public final static IntervalPrice.Type Close = new IntervalPrice.Type("Close");
    public final static IntervalPrice.Type High = new IntervalPrice.Type("High");
    public final static IntervalPrice.Type Low = new IntervalPrice.Type("Low");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { Open, Close, High, Low };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}