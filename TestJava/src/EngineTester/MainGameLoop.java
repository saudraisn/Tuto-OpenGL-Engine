package EngineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;

public class MainGameLoop {

	public static void main(String[] args) {
		
		DisplayManager.createDisplay();
		
		Loader loader = new Loader();
		Renderer renderer = new Renderer();
		
		//Will render a rectangle using 2 triangles
		float[] vertices = { -0.5f, 0.5f, 0f, -0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f, 0.5f, 0.5f, 0f, -0.5f, 0.5f, 0f
		};
		
		RawModel model =  loader.loadToVAO(vertices);
		
		int a=0;
		a+=2;
		System.out.println(a);
		
		while(!Display.isCloseRequested()) {
			
			renderer.prepare();
			//game logic
			renderer.render(model);
			DisplayManager.updateDisplay();
			
		}
		
		//This is a useless comment for testing git repo and merge
		loader.cleanUp();
		DisplayManager.closeDisplay();

	}

}
