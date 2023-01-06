package mesh.render;

import math.Color;

public class Material {

	/**
	 * Ka: specifies ambient color, to account for light that is scattered about the
	 * entire scene using values between 0 and 1 for the RGB components.
	 * 
	 * @see https://en.wikipedia.org/wiki/Phong_reflection_model
	 */
	public Color ambient;

	/**
	 * Kd: specifies diffuse color, which typically contributes most of the color to
	 * an object.
	 * 
	 * @see https://en.wikipedia.org/wiki/Diffuse_reflection
	 */
	public Color diffuse;

	/**
	 * Ks: specifies specular color, the color seen where the surface is shiny and
	 * mirror-like.
	 * 
	 * @see https://en.wikipedia.org/wiki/Specular_reflection
	 */
	public Color specular;

	public float illum;

	public Material() {
		ambient = new Color(1, 1, 1, 1);
		diffuse = new Color(0.454414f, 0.800000f, 0.148562f);
		specular = new Color(0.545455f, 0.545455f, 0.545455f);
		illum = 2;
	}

}
