/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.model.manila;

import com.huawei.openstack4j.model.ModelEntity;

/**
 * Represents an availability zone.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface AvailabilityZone extends ModelEntity {
    /**
     * @return the name of the availability zone
     */
    String getName();

    /**
     * @return the availability zone ID
     */
    String getId();

    /**
     * @return the date and time stamp when the availability zone was created
     */
    String getCreatedAt();

    /**
     * @return the date and time stamp when the availability zone was updated
     */
    String getUpdatedAt();
}
