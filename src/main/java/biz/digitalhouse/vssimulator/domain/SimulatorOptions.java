package biz.digitalhouse.vssimulator.domain;

/**
 * Created by Vall on 29.11.2015.
 *
 */
public class SimulatorOptions {
    private double coinPrice;

    private int payLines;

    private long spinToPlay;

    private long simulatorId;

    public double getCoinPrice() {
        return coinPrice;
    }

    public void setCoinPrice(double coinPrice) {
        this.coinPrice = coinPrice;
    }

    public int getPayLines() {
        return payLines;
    }

    public void setPayLines(int payLines) {
        this.payLines = payLines;
    }

    public long getSpinToPlay() {
        return spinToPlay;
    }

    public void setSpinToPlay(long spinToPlay) {
        this.spinToPlay = spinToPlay;
    }

    public long getSimulatorId() {
        return simulatorId;
    }

    public void setSimulatorId(long simulatorId) {
        this.simulatorId = simulatorId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimulatorOptions)) return false;

        SimulatorOptions that = (SimulatorOptions) o;

        if (Double.compare(that.coinPrice, coinPrice) != 0) return false;
        if (payLines != that.payLines) return false;
        if (simulatorId != that.simulatorId) return false;
        if (spinToPlay != that.spinToPlay) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(coinPrice);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + payLines;
        result = 31 * result + (int) (spinToPlay ^ (spinToPlay >>> 32));
        result = 31 * result + (int) (simulatorId ^ (simulatorId >>> 32));
        return result;
    }
}
