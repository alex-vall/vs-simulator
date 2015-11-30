package biz.digitalhouse.vssimulator.controller;

import biz.digitalhouse.vssimulator.domain.SimulatorResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vall on 26.11.2015.
 *
 */
@Controller
@RequestMapping(value = "rest/simulator")
public class SimulatorRestController {
    private static final Logger log = LogManager.getLogger(SimulatorRestController.class);


    @RequestMapping(value = "/getResult", method = RequestMethod.GET)
    public @ResponseBody SimulatorResult getSimulatorResult() {
        log.debug("/getResult called");
        SimulatorResult simulatorResult = new SimulatorResult();
        simulatorResult.setPlaySessionCount(50);
        return simulatorResult;
    }
}
