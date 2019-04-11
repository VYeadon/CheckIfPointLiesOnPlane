package com.mouldbox.vector;

public class Vector3 {
    private double x, y, z; 

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
	public double dotProduct(Vector3 secondVector) {

		x *= secondVector.x;
		y *= secondVector.y;
		z *= secondVector.z;
		
		return x + y + z;
	}
	
	public Vector3 minusVector(Vector3 secondVector) {
		
		x -= secondVector.x;
		y -= secondVector.y;
		z -= secondVector.z;
		
		return this;
	}
}
