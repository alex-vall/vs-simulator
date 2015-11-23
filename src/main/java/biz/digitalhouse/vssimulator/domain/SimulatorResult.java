package biz.digitalhouse.vssimulator.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Vall on 23.11.2015.
 *
 */
@XmlRootElement
public class SimulatorResult implements Serializable {

    private long playSessionCount = 0;

    public long getPlaySessionCount() {
        return playSessionCount;
    }

    public void setPlaySessionCount(long playSessionCount) {
        this.playSessionCount = playSessionCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimulatorResult)) return false;

        SimulatorResult that = (SimulatorResult) o;

        if (playSessionCount != that.playSessionCount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (playSessionCount ^ (playSessionCount >>> 32));
    }
}
