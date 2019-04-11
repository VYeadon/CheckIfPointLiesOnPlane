package com.mouldbox.logic;

import com.mouldbox.vector.Vector3;

public class IsPointOnPlane {

	public static void main(String[] args) {
		
		Vector3 point = new Vector3(1,1,1);
		Vector3 normal = new Vector3(3,4,3);
		Vector3 testPoint = new Vector3(2,1,1);
		
		IsPointOnPlane runner = new IsPointOnPlane();
		
		// Should be false
		System.out.println(runner.isOnPlane(point, normal, testPoint));
		
		point = new Vector3(1,1,1);
		normal = new Vector3(3,4,3);
		testPoint = new Vector3(1,1,1);
		
		// should be true
		System.out.println(runner.isOnPlane(point, normal, testPoint));

	}
	
	public boolean isOnPlane(Vector3 point, Vector3 normal, Vector3 testPoint) {
		
		Vector3 pointToTestPointPlane = point.minusVector(testPoint);
		
		double pointToTestPointPlaneNormalAngle = pointToTestPointPlane.dotProduct(normal);
		
		if(pointToTestPointPlaneNormalAngle == 0) {
			return true;
		}
		
		return false;	
	}
	

}
