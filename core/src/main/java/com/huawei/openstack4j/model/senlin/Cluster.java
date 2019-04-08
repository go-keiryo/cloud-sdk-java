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
package com.huawei.openstack4j.model.senlin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.huawei.openstack4j.model.ResourceEntity;

/**
 * This interface describes the getter-methods (and thus components) of a Cluster.
 * All getters map to the possible return values of
 * <code> GET /v1/clusters/​{cluster_id}​</code>
 * 
 * @see http://developer.openstack.org/api-ref-clustering-v1.html
 * 
 * @author lion
 * 
 */
public interface Cluster extends ResourceEntity {

    /**
     * Returns the created at time of the cluster
     *
     * @return the created at time of the cluster
     */
    Date getCreatedAt();

    /**
     * Returns the data of the cluster
     *
     * @return the data of the cluster
     */
    Map<String, Object> getData();

    /**
     * Returns the desired capacity of the cluster
     *
     * @return the desired capacity of the cluster
     */
    Integer getDesiredCapacity();

    /**
     * Returns the domain of the cluster
     *
     * @return the domain of the cluster
     */
    String getDomain();

    /**
     * Returns the init at time of the cluster
     *
     * @return the init at time of the cluster
     */
    Date getInitAt();

    /**
     * Returns the max size of the cluster
     *
     * @return the max size time of the cluster
     */
    Integer getMaxSize();

    /**
     * Returns the metadata of the cluster
     *
     * @return the metadata of the cluster
     */
    Map<String, Object> getMetadata();

    /**
     * Returns the min size of the cluster
     *
     * @return the min size of the cluster
     */
    Integer getMinSize();

    /**
     * Returns the nodes of the cluster
     *
     * @return the nodes of the cluster
     */
    List<String> getNodes();

    /**
     * Returns the policies of the cluster
     *
     * @return the policies of the cluster
     */
    List<String> getPolicies();

    /**
     * Returns the profile id of the cluster
     *
     * @return the profile id of the cluster
     */
    String getProfileID();

    /**
     * Returns the profile name of the cluster
     *
     * @return the profile name of the cluster
     */
    String getProfileName();

    /**
     * Returns the project of the cluster
     *
     * @return the project of the cluster
     */
    String getProject();

    /**
     * Returns the status of the cluster
     *
     * @return the status of the cluster
     */
    ClusterStatus getStatus();

    /**
     * Returns the status reason of the cluster
     *
     * @return the status reason of the cluster
     */
    String getStatusReason();

    /**
     * Returns the timeout value of the cluster
     *
     * @return the timeout value of the cluster
     */
    Integer getTimeout();

    /**
     * Returns the updated at time of the cluster
     *
     * @return the updated at time of the cluster
     */
    Date getUpdatedAt();

    /**
     * Returns the user of the cluster
     *
     * @return the user of the cluster
     */
    String getUser();
}
