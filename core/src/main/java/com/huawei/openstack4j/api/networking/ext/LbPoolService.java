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
package com.huawei.openstack4j.api.networking.ext;

import java.util.List;
import java.util.Map;

import com.huawei.openstack4j.common.RestService;
import com.huawei.openstack4j.model.common.ActionResponse;
import com.huawei.openstack4j.model.network.ext.HealthMonitor;
import com.huawei.openstack4j.model.network.ext.HealthMonitorAssociate;
import com.huawei.openstack4j.model.network.ext.LbPool;
import com.huawei.openstack4j.model.network.ext.LbPoolStats;
import com.huawei.openstack4j.model.network.ext.LbPoolUpdate;

/**
 * Networking (Neutron) Lbaas pool Extension API
 * 
 * @author liujunpeng
 *
 */
public interface LbPoolService extends RestService {
	/**
	 * List all lb pools that the current tenant has access to
	 *
	 * @return list of all lb pools
	 */
	List<? extends LbPool> list();

	/**
	 * Returns list of lb pools filtered by parameters.
	 * 
	 * @param filteringParams
	 *            map (name, value) of filtering parameters
	 * @return List
	 */
	List<? extends LbPool> list(Map<String, String> filteringParams);

	/**
	 * Get the specified lb pool by ID
	 *
	 * @param lbPoolId
	 *            the lb pool identifier
	 * @return the lbPool or null if not found
	 */
	LbPool get(String lbPoolId);

	/**
	 * Delete the specified lb Pool by ID
	 * 
	 * @param lbPoolId
	 *            the lb pool identifier
	 * @return the action response
	 */
	ActionResponse delete(String lbPoolId);

	/**
	 * Create a lb Pool
	 * 
	 * @param lbPool
	 *            LbPool
	 * @return Member
	 */
	LbPool create(LbPool lbPool);

	/**
	 * Update a lb pool
	 * 
	 * @param lbPoolId
	 *            the lb pool identifier
	 * @param lbPool
	 *            LbPoolUpdate
	 * @return LbPool
	 */
	LbPool update(String lbPoolId, LbPoolUpdate lbPool);

	/**
	 * Get the LbPool Stats by ID
	 *
	 * @param lbPoolId, the lb pool identifier
	 */
	LbPoolStats stats(String lbPoolId);

	/**
	 * Associates a health monitor with a specified pool.
	 * 
	 * @param lbPoolId
	 *            the lb pool identifier
	 * @param associate
	 *            HealthMonitorAssociate
	 * @return HealthMonitor
	 */
	HealthMonitor associateHealthMonitor(String lbPoolId,
			HealthMonitorAssociate associate);
	
	/**
     * Associates a health monitor with a specified pool.
     * 
     * @param lbPoolId
     *            the lb pool identifier
     * @param associate
     *            HealthMonitorAssociate
     * @return HealthMonitor
     */
    HealthMonitor associateHealthMonitor(String lbPoolId, String healthMonitorId);

	/**
	 * Disassociates a specified health monitor from a pool.
	 * 
	 * @param lbPoolId
	 *            the lb pool identifier
	 * @param healthMonitorId
	 *            the healthMonitor identifier
	 * @return ActionResponse
	 */
	ActionResponse disAssociateHealthMonitor(String lbPoolId,
			String healthMonitorId);
}
