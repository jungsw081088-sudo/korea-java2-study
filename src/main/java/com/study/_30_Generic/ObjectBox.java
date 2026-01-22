package com.study._30_Generic;

public class ObjectBox {
    // 최상위 부모타입 Object
    private Object item;

    public ObjectBox(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return this.item;
    }
}
