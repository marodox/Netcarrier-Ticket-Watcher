/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.cocoa;

public class NSValue extends NSObject {

public NSValue() {
	super();
}

public NSValue(long /*int*/ id) {
	super(id);
}

public NSValue(id id) {
	super(id);
}

public long /*int*/ objCType() {
	return OS.objc_msgSend(this.id, OS.sel_objCType);
}

public NSPoint pointValue() {
	NSPoint result = new NSPoint();
	OS.objc_msgSend_stret(result, this.id, OS.sel_pointValue);
	return result;
}

public NSRange rangeValue() {
	NSRange result = new NSRange();
	OS.objc_msgSend_stret(result, this.id, OS.sel_rangeValue);
	return result;
}

public NSRect rectValue() {
	NSRect result = new NSRect();
	OS.objc_msgSend_stret(result, this.id, OS.sel_rectValue);
	return result;
}

public NSSize sizeValue() {
	NSSize result = new NSSize();
	OS.objc_msgSend_stret(result, this.id, OS.sel_sizeValue);
	return result;
}

public static NSValue valueWithPoint(NSPoint point) {
	long /*int*/ result = OS.objc_msgSend(OS.class_NSValue, OS.sel_valueWithPoint_, point);
	return result != 0 ? new NSValue(result) : null;
}

public static NSValue valueWithRange(NSRange range) {
	long /*int*/ result = OS.objc_msgSend(OS.class_NSValue, OS.sel_valueWithRange_, range);
	return result != 0 ? new NSValue(result) : null;
}

public static NSValue valueWithRect(NSRect rect) {
	long /*int*/ result = OS.objc_msgSend(OS.class_NSValue, OS.sel_valueWithRect_, rect);
	return result != 0 ? new NSValue(result) : null;
}

public static NSValue valueWithSize(NSSize size) {
	long /*int*/ result = OS.objc_msgSend(OS.class_NSValue, OS.sel_valueWithSize_, size);
	return result != 0 ? new NSValue(result) : null;
}

}
