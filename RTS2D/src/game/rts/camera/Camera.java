package game.rts.camera;

import static org.lwjgl.glfw.GLFW.*;

import game.rts.input.KeyboardInput;
import game.rts.maths.Vector3f;

public class Camera {
	
	private Vector3f position = new Vector3f(0, 0, 0);
	private float pitch;
	private float yaw;
	private float roll;

	public Camera() {
	}
	
	public void move(){
		if(KeyboardInput.keys[GLFW_KEY_W]){
			position.z -= 0.2f;	
		}
		if(KeyboardInput.keys[GLFW_KEY_S]){
			position.z += 0.2f;	
		}
		if(KeyboardInput.keys[GLFW_KEY_A]){
			position.x -= 0.02f;	
		}
		if(KeyboardInput.keys[GLFW_KEY_D]){
			position.x += 0.02f;	
		}
	}

	public Vector3f getPosition() {
		return position;
	}

	public float getPitch() {
		return pitch;
	}

	public float getYaw() {
		return yaw;
	}

	public float getRoll() {
		return roll;
	}

}
