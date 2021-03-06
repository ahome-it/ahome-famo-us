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
package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.Color;
import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Configuration object for the properties of a surface
 */
public class Properties extends JsObject {

	public Properties() {
		jsObj = JsoHelper.createObject();
	}

	public static Properties create() {
		return new Properties();
	}

	public void setProperty(String propertyName, double value) {
		JsoHelper.setAttribute(jsObj, propertyName, value);
	}

	public void setProperty(String propertyName, String value) {
		JsoHelper.setAttribute(jsObj, propertyName, value);
	}

	// CSS properties

	public void setBackground(String value) {
		setProperty("background", value);
	}

	public void setBackgroundAttachement(String value) {
		setProperty("backgroundAttachement", value);
	}

	public void setBackgroundColor(String value) {
		setProperty("backgroundColor", value);
	}

	public void setBackgroundColor(Color color) {
		setBackgroundColor(color.getValue());
	}

	public void setBackgroundImage(String value) {
		setProperty("backgroundImage", value);
	}

	public void setBackgroundPosition(String value) {
		setProperty("backgroundPosition", value);
	}

	public void setBackgroundRepeat(String value) {
		setProperty("backgroundRepeat", value);
	}

	public void setBorder(String value) {
		setProperty("border", value);
	}

	public void setBorderBottom(String value) {
		setProperty("borderBottom", value);
	}

	public void setBorderBottomColor(String value) {
		setProperty("borderBottomColor", value);
	}

	public void setBorderBottomColor(Color value) {
		setProperty("borderBottomColor", value.getValue());
	}

	public void setBorderBottomStyle(String value) {
		setProperty("borderBottomStyle", value);
	}

	public void setBorderBottomWidth(String value) {
		setProperty("borderBottomWidth", value);
	}

	public void setBorderColor(String value) {
		setProperty("borderColor", value);
	}

	public void setBorderColor(Color value) {
		setProperty("borderColor", value.getValue());
	}

	public void setBorderLeft(String value) {
		setProperty("borderLeft", value);
	}

	public void setBorderLeftColor(String value) {
		setProperty("borderLeftColor", value);
	}

	public void setBorderLeftColor(Color value) {
		setProperty("borderLeftColor", value.getValue());
	}

	public void setBorderLeftStyle(String value) {
		setProperty("borderLeftStyle", value);
	}

	public void setBorderLeftWidth(String value) {
		setProperty("borderLeftWidth", value);
	}

	public void setBorderRight(String value) {
		setProperty("borderRight", value);
	}

	public void setBorderRightColor(String value) {
		setProperty("borderRightColor", value);
	}

	public void setBorderRightColor(Color value) {
		setProperty("borderRightColor", value.getValue());
	}

	public void setBorderRightStyle(String value) {
		setProperty("borderRightStyle", value);
	}

	public void setBorderRightWidth(String value) {
		setProperty("borderRightWidth", value);
	}

	public void setBorderStyle(String value) {
		setProperty("borderStyle", value);
	}

	public void setBorderTop(String value) {
		setProperty("borderTop", value);
	}

	public void setBorderTopColor(String value) {
		setProperty("borderTopColor", value);
	}

	public void setBorderTopColor(Color value) {
		setProperty("borderTopColor", value.getValue());
	}

	public void setBorderTopStyle(String value) {
		setProperty("borderTopStyle", value);
	}

	public void setBorderTopWidth(String value) {
		setProperty("borderTopWidth", value);
	}

	public void setOutline(String value) {
		setProperty("outline", value);
	}

	public void setOutlineColor(String value) {
		setProperty("outlineColor", value);
	}

	public void setOutlineColor(Color color) {
		setOutlineColor(color.getValue());
	}

	public void setOutlineStyle(String value) {
		setProperty("outlineStyle", value);
	}

	public void setOutlineWidth(String value) {
		setProperty("outlineWidth", value);
	}

	public void setListStyle(String value) {
		setProperty("listStyle", value);
	}

	public void setListImage(String value) {
		setProperty("listStyleImage", value);
	}

	public void setListStylePosition(String value) {
		setProperty("listStylePosition", value);
	}

	public void setListStyleType(String value) {
		setProperty("listStyleType", value);
	}

	public void setMargin(String value) {
		setProperty("margin", value);
	}

	public void setMargin(double value) {
		setProperty("margin", value);
	}

	public void setMarginBottom(String value) {
		setProperty("marginBottom", value);
	}

	public void setMarginBottom(double value) {
		setProperty("marginBottom", value);
	}

	public void setMarginLeft(String value) {
		setProperty("marginLeft", value);
	}

	public void setMarginLeft(double value) {
		setProperty("marginLeft", value);
	}

	public void setMarginRight(String value) {
		setProperty("marginRight", value);
	}

	public void setMarginRight(double value) {
		setProperty("marginRight", value);
	}

	public void setMarginTop(String value) {
		setProperty("marginTop", value);
	}

	public void setMarginTop(double value) {
		setProperty("marginTop", value);
	}

	public void setPadding(String value) {
		setProperty("padding", value);
	}

	public void setPadding(double value) {
		setProperty("padding", value);
	}

	public void setPaddingBottom(String value) {
		setProperty("paddingBottom", value);
	}

	public void setPaddingBottom(double value) {
		setProperty("paddingBottom", value);
	}

	public void setPaddingLeft(String value) {
		setProperty("paddingLeft", value);
	}

	public void setPaddingLeft(double value) {
		setProperty("paddingLeft", value);
	}

	public void setPaddingRight(String value) {
		setProperty("paddingRight", value);
	}

	public void setPaddingRight(double value) {
		setProperty("paddingRight", value);
	}

	public void setPaddingTop(String value) {
		setProperty("paddingTop", value);
	}

	public void setPaddingTop(double value) {
		setProperty("paddingTop", value);
	}

	public void setBottom(double value) {
		setProperty("bottom", value);
	}

	public void setBottom(String value) {
		setProperty("bottom", value);
	}

	public void setClear(String value) {
		setProperty("clear", value);
	}

	public void setClip(String value) {
		setProperty("clip", value);
	}

	public void setCssFloat(String value) {
		setProperty("cssFloat", value);
	}

	public void setCursor(String value) {
		setProperty("cursor", value);
	}

	public void setDisplay(String value) {
		setProperty("display", value);
	}

	public void setColor(String value) {
		setProperty("color", value);
	}

	public void setColor(Color color) {
		setColor(color.getValue());
	}

	public void setWidth(double value) {
		setProperty("width", value);
	}

	public void setWidth(String value) {
		setProperty("width", value);
	}

	public void setHeight(double value) {
		setProperty("height", value);
	}

	public void setHeight(String value) {
		setProperty("height", value);
	}

	public void setLeft(double value) {
		setProperty("left", value);
	}

	public void setLeft(String value) {
		setProperty("left", value);
	}

	public void setMaxHeight(double value) {
		setProperty("maxHeight", value);
	}

	public void setMaxHeight(String value) {
		setProperty("maxHeight", value);
	}

	public void setMaxWidth(double value) {
		setProperty("maxWidth", value);
	}

	public void setMaxWidth(String value) {
		setProperty("maxWidth", value);
	}

	public void setMinHeight(double value) {
		setProperty("minHeight", value);
	}

	public void setMinHeight(String value) {
		setProperty("minHeight", value);
	}

	public void setMinWidth(double value) {
		setProperty("minWidth", value);
	}

	public void setMinWidth(String value) {
		setProperty("minWidth", value);
	}

	public void setPosition(String value) {
		setProperty("position", value);
	}

	public void setTop(String value) {
		setProperty("top", value);
	}

	public void setTop(double value) {
		setProperty("top", value);
	}

	public void setVerticalAlign(String value) {
		setProperty("verticalAlign", value);
	}

	public void setVisibility(String value) {
		setProperty("visibility", value);
	}

	public void setZIndex(int value) {
		setProperty("zIndex", value);
	}

	public void setOpacity(double value) {
		setProperty("opacity", value);
	}

	public void setBoxShadow(String value) {
		setProperty("boxShadow", value);
	}

	public void setAutoAlpha(double value) {
		setProperty("autoAlpha", value);
	}

	public void setPerspective(double value) {
		setProperty("perspective", value);
	}

	public void setTransformPerspective(double value) {
		setProperty("transformPerspective", value);
	}

	public void setScrollTo(ScrollToConfig scrollTo) {
		JsoHelper.setAttribute(jsObj, "scrollTo", scrollTo.getJsObj());
	}

	public void setOpacity(String value) {
		setProperty("opacity", value);
	}

	public void setDirection(String value) {
		setProperty("direction", value);
	}

	public void setClassName(String value) {
		setProperty("className", value);
	}

	public void setFont(String value) {
		setProperty("font", value);
	}

	public void sePaused(boolean value) {
		JsoHelper.setAttribute(jsObj, "paused", value);
	}

	public void setFontFamily(String value) {
		setProperty("fontFamily", value);
	}

	public void setFontSize(String value) {
		setProperty("fontSize", value);
	}

	public void setFontSize(double value) {
		setProperty("fontSize", value);
	}

	public void setFontSizeAdjust(String value) {
		setProperty("fontSizeAdjust", value);
	}

	public void setFontStyle(String value) {
		setProperty("fontStyle", value);
	}

	public void setFontVarient(String value) {
		setProperty("fontVarient", value);
	}

	public void setLetterSpacing(String value) {
		setProperty("letterSpacing", value);
	}

	public Properties setLineHeight(String value) {
		setProperty("lineHeight", value);
		return this;
	}

	public Properties setQuotes(String value) {
		setProperty("quotes", value);
		return this;
	}

	public void setBorderCollapse(String value) {
		setProperty("borderCollapse", value);
	}

	public void setBorderSpacing(String value) {
		setProperty("borderSpacing", value);
	}

	public void setBorderSpacing(double value) {
		setProperty("borderSpacing", value);
	}

	public void setCaptionSide(String value) {
		setProperty("captionSide", value);
	}

	public void setEmptyCells(String value) {
		setProperty("emptyCells", value);
	}

	public void setTableLayout(String value) {
		setProperty("tableLayout", value);
	}

	public Properties setTextAlign(String value) {
		setProperty("textAlign", value);
		return this;
	}

	public void setTextDecoration(String value) {
		setProperty("textDecoration", value);
	}

	public void setTextIndent(String value) {
		setProperty("textIndent", value);
	}

	public void setTextShadow(String value) {
		setProperty("textShadow", value);
	}

	public void setWhiteSpace(String value) {
		setProperty("whiteSpace", value);
	}

	public void setWordSpacing(String value) {
		setProperty("wordSpacing", value);
	}

	public void setRotation(double value) {
		setProperty("rotation", value);
	}

	public void setRotation(String value) {
		setProperty("rotation", value);
	}

	public void setTranslateX(double value) {
		setProperty("translateX", value);
	}

	public void setTranslateX(String value) {
		setProperty("translateX", value);
	}

	public void setTranslateY(double value) {
		setProperty("translateY", value);
	}

	public void setTranslateY(String value) {
		setProperty("translateY", value);
	}

	public void setTranslate(double translateX, double translateY) {
		setTranslateX(translateX);
		setTranslateY(translateY);
	}

	public void setTranslate(String translateX, String translateY) {
		setTranslateX(translateX);
		setTranslateY(translateY);
	}

	public void setScaleX(double value) {
		setProperty("scaleX", value);
	}

	public void setScaleX(String value) {
		setProperty("scaleX", value);
	}

	public void setScaleY(double value) {
		setProperty("scaleY", value);
	}

	public void setScaleY(String value) {
		setProperty("scaleY", value);
	}

	public void setScale(String value) {
		setProperty("scale", value);
	}

	public void setScale(double value) {
		setProperty("scale", value);
	}

	public void setScale(double scaleX, double scaleY) {
		setScaleX(scaleX);
		setScaleY(scaleY);
	}

	public void setSkewX(double value) {
		setProperty("skewX", value);
	}

	public void setSkewX(String value) {
		setProperty("skewX", value);
	}

	public void setSkewY(double value) {
		setProperty("skewY", value);
	}

	public void setSkewY(String value) {
		setProperty("skewY", value);
	}

	public void setSkew(String skewX, String skewY) {
		this.setSkewX(skewX);
		this.setSkewY(skewY);
	}

	public void setSkew(double scaleX, double scaleY) {
		setScaleX(scaleX);
		setScaleY(scaleY);
	}

	public void setX(double value) {
		setProperty("x", value);
	}

	public void setX(String value) {
		setProperty("x", value);
	}

	public void setY(double value) {
		setProperty("y", value);
	}

	public void setY(String value) {
		setProperty("y", value);
	}

	public void setZ(double value) {
		setProperty("z", value);
	}

	public void setZ(String value) {
		setProperty("z", value);
	}

	public void setXY(double x, double y) {
		setX(x);
		setY(y);
	}

	public void setXY(String x, String y) {
		setX(x);
		setY(y);
	}

	public void setTransformOrigin(String value) {
		setProperty("transformOrigin", value);
	}

	protected native JavaScriptObject fromFunction(Function fn)/*-{
		return function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

}
