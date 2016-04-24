package com.swifty.rajawali3d;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

/**
 * Created by Swifty on 4/24/2016.
 */
public abstract class BaseRender implements GLSurfaceView.Renderer {
    public static int loadShader(int type, String shaderCode){

        // create a vertex shader type (GLES20.GL_VERTEX_SHADER)
        // or a fragment shader type (GLES20.GL_FRAGMENT_SHADER)
        int shader = GLES20.glCreateShader(type);

        // add the source code to the shader and compile it
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);

        return shader;
    }
}
