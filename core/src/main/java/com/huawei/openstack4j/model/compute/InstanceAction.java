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
package com.huawei.openstack4j.model.compute;

import java.util.Date;

/**
 * An action executed on an instance
 * 
 * @author Christian Banse
 */
public interface InstanceAction {

    /**
     * @return the action
     */
    String getAction();

    /**
     * @return the instance uuid
     */
    String getInstanceUuid();

    /**
     * @return the message
     */
    String getMessage();

    /**
     * @return the project id
     */
    String getProjectId();

    /**
     * @return the request id
     */
    String getRequestId();

    /**
     * @return the start time
     */
    Date getStartTime();

    /**
     * @return the user id
     */
    String getUserId();
}
