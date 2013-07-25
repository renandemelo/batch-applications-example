/**
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.batch.phonebilling;

import java.util.Properties;

import javax.batch.api.partition.PartitionMapper;
import javax.batch.api.partition.PartitionPlan;
import javax.batch.api.partition.PartitionPlanImpl;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/* Partition mapper artifact.
 * Determines the number of partitions (2) for the bill processing step
 * and the range of bills each partition should work on.
 */
@Dependent
@Named("BillPartitionMapper")
public class BillPartitionMapper implements PartitionMapper {
    
    @Override
    public PartitionPlan mapPartitions() throws Exception {
        /* Create a new partition plan */
        return new PartitionPlanImpl() {
            
            /* Auxiliary method - get the number of bills */
            public long getBillCount() {   
                return 2;
            }
            
            /* The number of partitions could be dynamically calculated based on
             * many parameters. In this particular example, we are setting it to
             * a fixed value for simplicity.
             */
            @Override
            public int getPartitions() {
                return 2;
            }
            
            /* Obtaint the parameters for each partition. In this case,
             * the parameters represent the range of items each partition
             * of the step should work on.
             */
            @Override
            public Properties[] getPartitionProperties() {                
                return null;
            }
        };
    }
    
}
