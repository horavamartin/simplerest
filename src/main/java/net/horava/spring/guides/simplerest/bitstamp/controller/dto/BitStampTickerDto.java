package net.horava.spring.guides.simplerest.bitstamp.controller.dto;

import java.time.LocalDateTime;

/**
 * @author Martin Horava
 */
public class BitStampTickerDto {

    private Long id;

    private Double last;

    private Double high;

    private Double low;

    private Double vwap;

    private Double bid;

    private Double ask;

    private LocalDateTime timestamp;

    private Double open;

    /**
     * @return the id
     * @see #id
     */
    public Long getId() {
        return id;
    }

    public BitStampTickerDto withId(Long id) {
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

    public BitStampTickerDto withLast(Double last) {
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

    public BitStampTickerDto withHigh(Double high) {
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

    public BitStampTickerDto withLow(Double low) {
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

    public BitStampTickerDto withVwap(Double vwap) {
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

    public BitStampTickerDto withBig(Double big) {
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

    public BitStampTickerDto withAsk(Double ask) {
        this.ask = ask;
        return this;
    }

    /**
     * @return the timestamp
     * @see #timestamp
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public BitStampTickerDto withTimestamp(LocalDateTime timestamp) {
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

    public BitStampTickerDto withOpen(Double open) {
        this.open = open;
        return this;
    }
}
