/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.bpmn2;

import com.founder.fix.fixflow.core.runtime.ExecutionContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.bpmn2.Bpmn2Package#getEventDefinition()
 * @model extendedMetaData="name='tEventDefinition' kind='elementOnly' abstract='true'"
 * @generated
 */
public interface EventDefinition extends RootElement {
	
	
	/**
	 * 事件定义的执行事件
	 * @param executionContext 流程内容上下文
	 */
	public abstract  boolean execute(ExecutionContext executionContext,Event event);
} // EventDefinition
