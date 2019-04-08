/*******************************************************************************
 * 	Copyright 2017 HuaWei Tld                                     
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
package com.huawei.openstack4j.openstack.loadbalance.internal;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.common.base.Strings;

import com.huawei.openstack4j.api.loadbalance.AsyncJobService;
import com.huawei.openstack4j.openstack.loadbalance.domain.AsyncJob;

public class AsyncJobServiceImpl extends BaseELBServices implements AsyncJobService {

	@Override
	public AsyncJob get(String jobId) {
		checkArgument(!Strings.isNullOrEmpty(jobId), "jobId is required");
		return get(AsyncJob.class, uri("/jobs/%s", jobId)).execute();
	}
}
