package com.example.demo.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Askyi
 */
public class KlinePic {

    private String minute;

    @JSONField(ordinal = 1)
    private String open;

    @JSONField(ordinal = 2)
    private String close;

    @JSONField(ordinal = 3)
    private String min;

    @JSONField(ordinal = 4)
    private String max;

    public KlinePic() {
    }

    public KlinePic(String minute, String open, String close, String min, String max) {
        this.minute = minute;
        this.open = open;
        this.close = close;
        this.min = min;
        this.max = max;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

}
