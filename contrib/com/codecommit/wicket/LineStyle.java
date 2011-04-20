/*
 * Created on Dec 11, 2007
 */
package com.codecommit.wicket;

import java.io.Serializable;

/**
 * @author Daniel Spiewak
 */
public class LineStyle implements ILineStyle, Serializable {

	private static final long serialVersionUID = 1L;
	
	private int blankLength = -1;
	private int segmentLength = -1;
	private int thickness = -1;
	
	public LineStyle(int thickness, int segmentLength, int blankLength) {
		this.thickness = thickness;
		this.segmentLength = segmentLength;
		this.blankLength = blankLength;
	}
	
	public int getBlankLength() {
		return blankLength;
	}

	public int getSegmentLength() {
		return segmentLength;
	}

	public int getThickness() {
		return thickness;
	}

	public void setBlankLength(int blankLength) {
		this.blankLength = blankLength;
	}

	public void setSegmentLength(int segmentLength) {
		this.segmentLength = segmentLength;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
}
