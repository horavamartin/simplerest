package net.horava.spring.guides.simplerest.bitstamp.controller.dto;

/**
 * @author Martin Horava
 */
public class BitStampTickerImportDto {

    private Double last;

    private Double high;

    private Double low;

    private Double vwap;

    private Double bid;

    private Double ask;

    private Long timestamp;

    private Double open;

    /**
     * @return the last
     * @see #last
     */
    public Double getLast() {
        return last;
    }

    public BitStampTickerImportDto withLast(Double last) {
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

    public BitStampTickerImportDto withHigh(Double high) {
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

    public BitStampTickerImportDto withLow(Double low) {
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

    public BitStampTickerImportDto withVwap(Double vwap) {
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

    public BitStampTickerImportDto withBig(Double big) {
        this.bid = big;
        return this;
    }

    /**
     * @return the ask
     * @see #ask
     */
    public Double getAsk() {
        return ask;
    }

    public BitStampTickerImportDto withAsk(Double ask) {
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

    public BitStampTickerImportDto withTimestamp(Long timestamp) {
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

    public BitStampTickerImportDto withOpen(Double open) {
        this.open = open;
        return this;
    }
}
