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
package com.huawei.openstack4j.model.map.reduce;

import java.util.Date;

import com.huawei.openstack4j.model.ModelEntity;

/**
 * An Action of map reduce Job Execution
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobExecutionAction extends ModelEntity {

    String getStatus();

    int getRetries();

    String getTransition();

    String getStats();

    Date getStartTime();
    
    Date getEndTime();

    String getCred();

    String getErrorMessage();

    String getExternalId();

    String getErrorCode();

    String getConsoleUrl();

    String getToString();

    String getExternalStatus();

    String getConf();

    String getType();

    String getTrackerUri();

    String getExternalChildIds();

    String getData();

    String getId();

    String getName();
}
