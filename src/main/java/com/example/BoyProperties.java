package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by linke on 2016/12/31.
 */
@Component
@ConfigurationProperties(prefix = "boy")
public class BoyProperties {
    private Integer weight;
    private Integer tops;


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getTops() {
        return tops;
    }

    public void setTops(Integer tops) {
        this.tops = tops;
    }
}
