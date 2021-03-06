/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.famous.client.ui;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.famous.client.transitions.Easing;
import com.ait.toolkit.famous.client.transitions.FamoAnimation;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * A collection of visual changes to be applied to another renderable component. This collection includes a transform matrix, an opacity constant, a size, an origin specifier.
 * Modifier objects can be added to any RenderNode or object capable of displaying renderables. The Modifier's children and descendants are transformed by the amounts specified in
 * the Modifier's properties.
 */
public class Modifier extends FamoUsNode {

	public Modifier() {
		jsObj = createPeer();
	}

	public Modifier(JavaScriptObject peer) {
		jsObj = peer;
	}

	/**
	 * Affine transformation matrix
	 */
	public native void setTransform(Transform transform)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setTransform(transform.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void setTransform(TransformFunction transformFn)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var functionName = @com.ait.toolkit.core.client.Util::randomString()();
		functionName = "transformFn" + functionName;
		$wnd[functionName] = function() {
			var transform = transformFn.@com.ait.toolkit.famous.client.ui.TransformFunction::createTransform()();
			var transformPeer = transform.@com.ait.toolkit.core.client.JsObject::getJsObj()();
			return transformPeer;
		}
		var fn = new $wnd.Function("return " + functionName + "();");
		peer.setTransform(fn);
	}-*/;

	/**
	 * Affine transformation matrix
	 */
	public native Modifier setTransform(Transform transform, FamoAnimation animation)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTransform(
				transform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Modifier setTransform(Transform transform, int animationDuration)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		o = new $wnd.Object();
		o.duration = animationDuration;
		peer.setTransform(
				transform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				o);
		return this;
	}-*/;

	public native Modifier setTransform(Transform transform, int animationDuration, String animationCurve)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		o = new $wnd.Object();
		o.duration = animationDuration;
		o.curve = animationCurve;
		peer.setTransform(
				transform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				o);
		return this;
	}-*/;

	public native Modifier setTransform(Transform transform, int animationDuration, Easing animationCurve)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		o = new $wnd.Object();
		o.duration = animationDuration;
		o.curve = animationCurve.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTransform(
				transform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				o);
		return this;
	}-*/;

	public native Modifier setTransform(Transform transform, int animationDuration, Easing animationCurve, Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		o = new $wnd.Object();
		o.duration = animationDuration;
		o.curve = animationCurve.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setTransform(
						transform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						o,
						function() {
							callback.@com.ait.toolkit.core.client.Function::execute()();
						});
		return this;
	}-*/;

	/**
	 * Affine transformation matrix
	 */
	public native Modifier setTransform(Transform transform, FamoAnimation animation, Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setTransform(
						transform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						animation.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function() {
							callback.@com.ait.toolkit.core.client.Function::execute()();
						});
		return this;
	}-*/;

	public native void setOpacity(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setOpacity(value);
	}-*/;

	public void setOrigin(double... values) {
		JsArrayNumber numbers = JsArrayNumber.createArray().cast();
		for (double d : values) {
			numbers.push(d);
		}
		setOrigin(numbers);
	}

	public void setAlign(double... values) {
		JsArrayNumber numbers = JsArrayNumber.createArray().cast();
		for (double d : values) {
			numbers.push(d);
		}
		setAlign(numbers);
	}

	public native void setOrigin(JsArrayNumber values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var array = [];
		for (key in values) {
			if (key != '__gwt_ObjectId') {
				$wnd.console.log(key + "," + values[key]);
				array.push(values[key]);
			}
		}
		peer.setOrigin(array);
	}-*/;

	public native void setAlign(JsArrayNumber values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var array = [];
		for (key in values) {
			if (key != '__gwt_ObjectId') {
				$wnd.console.log(key + "," + values[key]);
				array.push(values[key]);
			}
		}
		peer.setAlign(array);
	}-*/;

	public void setSize(double... values) {
		JsArrayNumber numbers = JsArrayNumber.createArray().cast();
		for (double d : values) {
			numbers.push(d);
		}
		setSize(numbers);
	}

	public native void setSize(JsArrayNumber value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSize(value);
	}-*/;

	public native Modifier transformFrom(Transform transform)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.transformFrom(transform.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	/**
	 * Set function, object, or number to provide opacity, in range [0,1].
	 */
	public native Modifier opacityFrom(JavaScriptObject obj)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.opacityFrom(obj);
		return this;
	}-*/;

	/**
	 * Set function, object, or numerical array to provide origin, as [x,y], where x and y are in the range [0,1].
	 */
	public native Modifier originFrom(JavaScriptObject obj)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.originFrom(obj);
		return this;
	}-*/;

	/**
	 * Set function, object, or numerical array to provide size, as [width, height].
	 */
	public native Modifier sizeFrom(JavaScriptObject obj)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sizeFrom(obj);
		return this;
	}-*/;

	@Override
	public native JavaScriptObject createPeer()/*-{
		return new $wnd.famous.core.Modifier();
	}-*/;

}
