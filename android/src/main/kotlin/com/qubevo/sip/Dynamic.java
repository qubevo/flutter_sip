package com.qubevo.sip;

public interface Dynamic {
    boolean isNull();

    boolean asBoolean();

    double asDouble();

    int asInt();

    String asString();

    ReadableArray asArray();

    ReadableMap asMap();

    ReadableType getType();

    void recycle();
}
