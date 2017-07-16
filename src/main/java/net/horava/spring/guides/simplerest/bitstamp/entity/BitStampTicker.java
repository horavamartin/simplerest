package net.horava.spring.guides.simplerest.bitstamp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Martin Horava
 */
@Entity(name = "TICKER")
public class BitStampTicker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double last;

    private Double high;

    private Double low;

    private Double vwap;

    private Double bid;

    private Double ask;

    private Long timestamp;

    private Double open;

    public BitStampTicker() {
    }

    /**
     * @return the id
     * @see #id
     */
    public Long getId() {
        return id;
    }

    public BitStampTicker withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * @return the last
     * @see #last
     */
    public Double getLast() {
        return last;
    }

    public BitStampTicker withLast(Double last) {
        this.last = last;
        return this;
    }

    /**
     * @return the high
     * @see #high
     */
    public Double getHigh() {
        return high;
    }

    public BitStampTicker withHigh(Double high) {
        this.high = high;
        return this;
    }

    /**
     * @return the low
     * @see #low
     */
    public Double getLow() {
        return low;
    }

    public BitStampTicker withLow(Double low) {
        this.low = low;
        return this;
    }

    /**
     * @return the vwap
     * @see #vwap
     */
    public Double getVwap() {
        return vwap;
    }

    public BitStampTicker withVwap(Double vwap) {
        this.vwap = vwap;
        return this;
    }

    /**
     * @return the bid
     * @see #bid
     */
    public Double getBid() {
        return bid;
    }

    public BitStampTicker withBid(Double bid) {
        this.bid = bid;
        return this;
    }

    /**
     * @return the ask
     * @see #ask
     */
    public Double getAsk() {
        return ask;
    }

    public BitStampTicker withAsk(Double ask) {
        this.ask = ask;
        return this;
    }

    /**
     * @return the timestamp
     * @see #timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public BitStampTicker withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * @return the open
     * @see #open
     */
    public Double getOpen() {
        return open;
    }

    public BitStampTicker withOpen(Double open) {
        this.open = open;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        BitStampTicker that = (BitStampTicker) o;

        if (last != null ? !last.equals(that.last) : that.last != null)
            return false;
        if (high != null ? !high.equals(that.high) : that.high != null)
            return false;
        if (low != null ? !low.equals(that.low) : that.low != null)
            return false;
        if (vwap != null ? !vwap.equals(that.vwap) : that.vwap != null)
            return false;
        if (bid != null ? !bid.equals(that.bid) : that.bid != null)
            return false;
        if (ask != null ? !ask.equals(that.ask) : that.ask != null)
            return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null)
            return false;
        return open != null ? open.equals(that.open) : that.open == null;
    }

    @Override
    public int hashCode() {
        int result = last != null ? last.hashCode() : 0;
        result = 31 * result + (high != null ? high.hashCode() : 0);
        result = 31 * result + (low != null ? low.hashCode() : 0);
        result = 31 * result + (vwap != null ? vwap.hashCode() : 0);
        result = 31 * result + (bid != null ? bid.hashCode() : 0);
        result = 31 * result + (ask != null ? ask.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (open != null ? open.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BitStampTicker{" +
            "id=" + id +
            "last=" + last +
            ", high=" + high +
            ", low=" + low +
            ", vwap=" + vwap +
            ", bid=" + bid +
            ", ask=" + ask +
            ", timestamp=" + timestamp +
            ", open=" + open +
            '}';
    }
}
