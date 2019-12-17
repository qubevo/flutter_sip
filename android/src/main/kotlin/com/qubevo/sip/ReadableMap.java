package com.qubevo.sip;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public interface ReadableMap {

    boolean hasKey(String name);

    boolean isNull(String name);

    boolean getBoolean(String name);

    double getDouble(String name);

    int getInt(String name);


    String getString(String name);


    ReadableArray getArray(String name);


    ReadableMap getMap(String name);

    Dynamic getDynamic(String name);


    ReadableType getType(String name);


    Iterator<Map.Entry<String, Object>> getEntryIterator();

    ReadableMapKeySetIterator keySetIterator();

    HashMap<String, Object> toHashMap();

}
