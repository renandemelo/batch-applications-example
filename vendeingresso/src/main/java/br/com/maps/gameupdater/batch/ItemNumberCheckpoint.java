/**
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package br.com.maps.gameupdater.batch;

import java.io.Serializable;

/* Checkpoint class for the chunk batch artifacts */
public class ItemNumberCheckpoint implements Serializable {
    
    private long itemNumber;
    private long numItems;
    
    public ItemNumberCheckpoint() {
        itemNumber = 0;
    }
    
    public ItemNumberCheckpoint(int numItems) {
        this();
        this.numItems = numItems;
    }
    
    public long getItemNumber() {
        return itemNumber;
    }
    
    public void setNumItems(long numItems) {
        this.numItems = numItems;
    }
    
    public long getNumItems() {
        return numItems;
    }
    
    public void nextItem() {
        itemNumber++;
    }
    
    public void setItemNumber(long item) {
        itemNumber = item;
    }
}
