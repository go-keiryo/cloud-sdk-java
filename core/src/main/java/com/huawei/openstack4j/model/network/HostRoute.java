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
package com.huawei.openstack4j.model.network;

import com.huawei.openstack4j.model.ModelEntity;

/**
 * A Network Host based Routing Entry
 * 
 * @author Jeremy Unruh
 */
public interface HostRoute extends ModelEntity {

	/**
	 * Gets the destination for the route
	 *
	 * @return the destination host for this host route
	 */
	String getDestination();

	/**
	 * Gets the NextHop for this route
	 *
	 * @return the NextHop for this host route
	 */
	String getNexthop();
}
