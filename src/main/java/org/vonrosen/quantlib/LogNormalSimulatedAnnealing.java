/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class LogNormalSimulatedAnnealing extends OptimizationMethod {
  private transient long swigCPtr;

  protected LogNormalSimulatedAnnealing(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.LogNormalSimulatedAnnealing_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LogNormalSimulatedAnnealing obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_LogNormalSimulatedAnnealing(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps, LogNormalSimulatedAnnealing.ResetScheme resetScheme, long resetSteps) {
    this(QuantLibJNI.new_LogNormalSimulatedAnnealing__SWIG_0(SamplerLogNormal.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps, resetScheme.swigValue(), resetSteps), true);
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps, LogNormalSimulatedAnnealing.ResetScheme resetScheme) {
    this(QuantLibJNI.new_LogNormalSimulatedAnnealing__SWIG_1(SamplerLogNormal.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps, resetScheme.swigValue()), true);
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps) {
    this(QuantLibJNI.new_LogNormalSimulatedAnnealing__SWIG_2(SamplerLogNormal.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps), true);
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature) {
    this(QuantLibJNI.new_LogNormalSimulatedAnnealing__SWIG_3(SamplerLogNormal.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature), true);
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature) {
    this(QuantLibJNI.new_LogNormalSimulatedAnnealing__SWIG_4(SamplerLogNormal.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature), true);
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing) {
    this(QuantLibJNI.new_LogNormalSimulatedAnnealing__SWIG_5(SamplerLogNormal.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing), true);
  }

  public LogNormalSimulatedAnnealing(SamplerLogNormal sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature) {
    this(QuantLibJNI.new_LogNormalSimulatedAnnealing__SWIG_6(SamplerLogNormal.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature), true);
  }

  public final static class ResetScheme {
    public final static LogNormalSimulatedAnnealing.ResetScheme NoResetScheme = new LogNormalSimulatedAnnealing.ResetScheme("NoResetScheme");
    public final static LogNormalSimulatedAnnealing.ResetScheme ResetToBestPoint = new LogNormalSimulatedAnnealing.ResetScheme("ResetToBestPoint");
    public final static LogNormalSimulatedAnnealing.ResetScheme ResetToOrigin = new LogNormalSimulatedAnnealing.ResetScheme("ResetToOrigin");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ResetScheme swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ResetScheme.class + " with value " + swigValue);
    }

    private ResetScheme(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ResetScheme(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ResetScheme(String swigName, ResetScheme swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ResetScheme[] swigValues = { NoResetScheme, ResetToBestPoint, ResetToOrigin };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
