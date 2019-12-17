package com.qubevo.sip;

import java.util.ArrayList;

public interface ReadableArray {
    int size();

    boolean isNull(int index);

    boolean getBoolean(int index);

    double getDouble(int index);

    int getInt(int index);

    String getString(int index);

    ReadableArray getArray(int index);

    ReadableMap getMap(int index);

    Dynamic getDynamic(int index);

    ReadableType getType(int index);

    ArrayList<Object> toArrayList();


}
