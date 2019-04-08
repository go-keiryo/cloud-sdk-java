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
package com.huawei.openstack4j.openstack.kms.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 * @author SuperStone
 * @date   2018-08-31 15:33:40
 */
public enum PartitionType {
	
	Basic("0"), Advanced("1"), Enterprise("2");

	String value;

	PartitionType(String value) {
		this.value = value;
	}
	
	@JsonValue
	String value() {
		return value;
	}

	@JsonCreator
	public static PartitionType forValue(String value) {
		if (value != null) {
			for (PartitionType state : PartitionType.values()) {
				if (value.equals(state.value)) {
					return state;
				} 
			}
		}
		return null;
	}
}