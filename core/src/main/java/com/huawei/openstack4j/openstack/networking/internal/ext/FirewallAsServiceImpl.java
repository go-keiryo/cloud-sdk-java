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
package com.huawei.openstack4j.openstack.networking.internal.ext;

import com.huawei.openstack4j.api.Apis;
import com.huawei.openstack4j.api.networking.ext.FirewallAsService;
import com.huawei.openstack4j.api.networking.ext.FirewallPolicyService;
import com.huawei.openstack4j.api.networking.ext.FirewallRuleService;
import com.huawei.openstack4j.api.networking.ext.FirewallService;

/**
 * <p>OpenStack Firewall As a Service (FwaaS) Operations API.</p>
 * 
 * <p>
	 * The FWaaS extension provides OpenStack users with the ability to deploy firewalls to protect their networks. The FWaaS extension enables you to:
	 * <ul>
	 * 		<li>Apply firewall rules on traffic entering and leaving tenant networks.</li>
	 * 		<li>Support for applying tcp, udp, icmp, or protocol agnostic rules.</li>
	 * 		<li>Creation and sharing of firewall policies which hold an ordered collection of the firewall rules.</li>
	 * 		<li>Audit firewall rules and policies.</li>
	 * </ul>
 * </p>
 * 
 * <p>
 	* This extension introduces these resources:
 	* <ul>
 	* 		<li><strong>Firewall:</strong> represents a logical firewall resource that a tenant can instantiate and manage.
 	* 			A firewall is associated with one firewall policy.
 	* 		</li>
 	* 		<li><strong>Firewall Policy:</strong> is an ordered collection of firewall_rules. 
 	* 			A firewall policy can be shared across tenants. Thus it can also be made part of an audit workflow wherein the 
 	* 			firewall policy can be audited by the relevant entity that is authorized (and can be different from the tenants 
 	* 			which create or use the firewall policy).
 	* 		</li>
 	* 		<li><strong>Firewall Rule:</strong> represents a collection of attributes like ports, 
 	* 			ip addresses which define match criteria and action (allow, or deny) that needs to be taken on the matched data traffic.
 	* 		</li>
 	* </ul>
 * </p>
 * 
 * @author Vishvesh Deshmukh
 */
public class FirewallAsServiceImpl implements FirewallAsService {

	/**
     * {@inheritDoc}
     */
	@Override
	public FirewallService firewall() {
		return Apis.get(FirewallService.class);
	}
	
	/**
     * {@inheritDoc}
     */
	@Override
	public FirewallRuleService firewallrule() {
		return Apis.get(FirewallRuleService.class);
	}
    
	/**
     * {@inheritDoc}
     */
	@Override
	public FirewallPolicyService firewallpolicy() {
		return Apis.get(FirewallPolicyService.class);
	}
}
