package workspace;

import mesh.Mesh3D;
import mesh.render.Mesh3DRenderer;
import processing.core.PApplet;
import processing.core.PGraphics;
import workspace.ui.Color;
import workspace.ui.Graphics;

public class GraphicsPImpl implements Graphics {

	private Color color;
	private PGraphics g;
	private Mesh3DRenderer renderer;

	public GraphicsPImpl(PApplet p) {
		this.g = p.g;
		renderer = new Mesh3DRenderer(p);
	}

	@Override
	public void fillFaces(Mesh3D mesh) {
		g.noStroke();
		fill();
		renderer.drawFaces(mesh);
	}

	@Override
	public int getWidth() {
		return g.width;
	}

	@Override
	public int getHeight() {
		return g.height;
	}

	private void stroke() {
		g.stroke(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
	}

	private void fill() {
		g.fill(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
	}

	@Override
	public void pushMatrix() {
		g.pushMatrix();
	}

	@Override
	public void popMatrix() {
		g.popMatrix();
	}

	@Override
	public void translate(float x, float y) {
		g.translate(x, y);
	}

	@Override
	public void strokeWeight(float weight) {
		g.strokeWeight(weight);
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void setColor(int red, int green, int blue) {
		color = new Color(red, green, blue);
	}

	@Override
	public void drawRect(float x, float y, float width, float height) {
		g.pushStyle();
		g.noFill();
		stroke();
		g.rectMode(PApplet.CORNER);
		g.rect(x, y, width, height);
		g.popStyle();
	}

	@Override
	public void fillRect(float x, float y, float width, float height) {
		g.pushStyle();
		g.noStroke();
		fill();
		g.rectMode(PApplet.CORNER);
		g.rect(x, y, width, height);
		g.popStyle();
	}

	@Override
	public void textSize(float size) {
		g.textSize(size);
	}

	@Override
	public float getTextSize() {
		return g.textSize;
	}

	@Override
	public float textWidth(String text) {
		return g.textWidth(text);
	}

	@Override
	public float textAscent() {
		return g.textAscent();
	}

	@Override
	public float textDescent() {
		return g.textDescent();
	}

	@Override
	public void text(String text, float x, float y) {
		fill();
		g.text(text, x, y);
	}

	@Override
	public void enableDepthTest() {
		g.hint(PApplet.ENABLE_DEPTH_TEST);
	}

	@Override
	public void disableDepthTest() {
		g.hint(PApplet.DISABLE_DEPTH_TEST);
	}

	@Override
	public void rotateX(float angle) {
		g.rotateX(angle);
	}

	@Override
	public void rotateY(float angle) {
		g.rotateY(angle);
	}

	@Override
	public void rotateZ(float angle) {
		g.rotate(angle);
	}

}
