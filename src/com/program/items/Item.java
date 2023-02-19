package com.program.items;

import java.io.Serializable;
import java.util.List;

public interface Item {
    List<? extends Serializable> createItem();
}
