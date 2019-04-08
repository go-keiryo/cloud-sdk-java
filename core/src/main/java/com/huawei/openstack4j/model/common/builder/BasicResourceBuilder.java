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
package com.huawei.openstack4j.model.common.builder;

import com.huawei.openstack4j.model.common.BasicResource;

/**
 * Abstract Basic Resource Builder
 *
 * @param <M> the model type
 * @param <T> the builder type
 */
public abstract class BasicResourceBuilder<M extends BasicResource, T extends BasicResourceBuilder<M,T>> {

	/**
	 * Sets the name on the resource
	 *
	 * @param name the name
	 * @return the builder
	 */
	public T name(String name) {
		reference().setName(name);
		return self();
	}
	
	/**
	 * Sets the Id.
	 *
	 * @param id the identifier
	 * @return the builder
	 */
	public T id(String id) {
		reference().setId(id);
		return self();
	}
	
	@SuppressWarnings("unchecked")
	protected T self() {
		return (T) this;
	}
	
	protected abstract M reference();
	
}
