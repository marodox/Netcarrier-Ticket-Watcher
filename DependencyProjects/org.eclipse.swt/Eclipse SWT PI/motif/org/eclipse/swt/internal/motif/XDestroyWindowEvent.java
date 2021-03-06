/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.motif;

 
public class XDestroyWindowEvent extends XEvent {
	public int serial;
	public int send_event;
	/** @field cast=(Display *) */
	public int display;
	/** @field cast=(Window) */
	public int event;
	/** @field cast=(Window) */
	public int window;
	public static final int sizeof = 24;
}
