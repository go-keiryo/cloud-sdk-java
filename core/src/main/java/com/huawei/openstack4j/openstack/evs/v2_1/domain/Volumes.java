 /*******************************************************************************
 * 	Copyright 2018 Huawei Technologies Co.,Ltd.                                         
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
package com.huawei.openstack4j.openstack.evs.v2_1.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.openstack4j.openstack.evs.v2.domain.CloudVolumes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Volumes {
	
	/**
	 * 待创建的云硬盘信息。
	 */
	@JsonProperty("volume")
	private CloudVolumes cloudVolumes;
	
	/**
	 * 按需和包周期的扩展参数。
	 */
	@JsonProperty("bssParam")
	private BssParam bssParam;
	
	
}
