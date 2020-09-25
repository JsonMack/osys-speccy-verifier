package com.jsonmack.speccyverifier.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason MacKeigan
 */
public class SpeccyAttribute {

    private final String key;

    private final String value;

    private final List<SpeccyAttribute> children;

    public SpeccyAttribute(String key, String value, List<SpeccyAttribute> children) {
        this.key = key;
        this.value = value;
        this.children = children;
    }

    public SpeccyAttribute(String key, String value) {
        this(key, value, new ArrayList<>());
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public List<SpeccyAttribute> getChildren() {
        return children;
    }
}
