package biz.digitalhouse.vssimulator.service;

import biz.digitalhouse.vssimulator.domain.SimulatorOptions;
import biz.digitalhouse.vssimulator.domain.SimulatorResult;
import biz.digitalhouse.vssimulator.exception.InvalidActionException;

/**
 * Created by Vall on 29.11.2015.
 *
 */
public interface VsSimulatorSerivce {

    SimulatorOptions createSimulator();

    SimulatorResult clearStatistic(long simulatorId);

    SimulatorResult simulate(SimulatorOptions simulatorOptions) throws InvalidActionException;

    SimulatorResult getResult(long simulatorId);
}
