package com.thanos.springboot.common.core.condition;

import com.thanos.springboot.common.core.operator.MathOperator;

import java.util.concurrent.TimeUnit;

/**
 * @author peiheng.zph created on 2017/1/18 21:18
 * @version 1.0
 */
public interface TimerMonitorCondition extends MonitorCondition<Double> {

    MathOperator operator();

    double threshold();
}
