# CheckIfPointLiesOnPlane
checks if a given point lies on a plane described by a point and its normal vector

The plane is given by a point on the plane and a normal vector.
The function should return true if the point is on the plane andfalse otherwise.

Implements a custom Vector3 class which has functionality to minus two vectors and calcualte the dot product.

Works by calcualting the plane between the given point and the point to be checked. If the point lies on the plane this new calcualted plane and the given plane should be equivalent. This is true if the dot product between the new plane and the normal vector is equal to zero. This is because the dot product gives a cosine angle between the two vectors, if the cosine is 90 it is equal to zero.
