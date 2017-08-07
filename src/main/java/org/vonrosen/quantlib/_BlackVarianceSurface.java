/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class _BlackVarianceSurface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _BlackVarianceSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_BlackVarianceSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete__BlackVarianceSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public final static class Extrapolation {
    public final static _BlackVarianceSurface.Extrapolation ConstantExtrapolation = new _BlackVarianceSurface.Extrapolation("ConstantExtrapolation");
    public final static _BlackVarianceSurface.Extrapolation InterpolatorDefaultExtrapolation = new _BlackVarianceSurface.Extrapolation("InterpolatorDefaultExtrapolation");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Extrapolation swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Extrapolation.class + " with value " + swigValue);
    }

    private Extrapolation(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Extrapolation(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Extrapolation(String swigName, Extrapolation swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Extrapolation[] swigValues = { ConstantExtrapolation, InterpolatorDefaultExtrapolation };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
