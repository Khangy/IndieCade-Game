/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/gpu_shader5.txt">NV_gpu_shader5</a> extension.
 * 
 * <p>This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new GPUs. Shaders using the
 * new functionality provided by this extension should enable this functionality via the construct</p>
 * 
 * <pre><code>\#extension GL_NV_gpu_shader5 : require (or enable)</code></pre>
 * 
 * <p>This extension was developed concurrently with the ARB_gpu_shader5 extension, and provides a superset of the features provided there. The features
 * common to both extensions are documented in the ARB_gpu_shader5 specification; this document describes only the addition language features not
 * available via ARB_gpu_shader5. A shader that enables this extension via an \#extension directive also implicitly enables the common capabilities
 * provided by ARB_gpu_shader5.</p>
 * 
 * <p>In addition to the capabilities of ARB_gpu_shader5, this extension provides a variety of new features for all shader types, including:</p>
 * 
 * <ul>
 * <li>support for a full set of 8-, 16-, 32-, and 64-bit scalar and vector data types, including uniform API, uniform buffer object, and shader input and
 * output support;</li>
 * <li>the ability to aggregate samplers into arrays, index these arrays with arbitrary expressions, and not require that non-constant indices be uniform
 * across all shader invocations;</li>
 * <li>new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;</li>
 * <li>new built-in functions to pack and unpack 32-bit unsigned integer types into a two-component 16-bit floating-point vector;</li>
 * <li>new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;</li>
 * <li>new built-in functions to compute the composite of a set of boolean conditions a group of shader threads;</li>
 * <li>vector relational functions supporting comparisons of vectors of 8-, 16-, and 64-bit integer types or 16-bit floating-point types; and</li>
 * <li>extending texel offset support to allow loading texel offsets from regular integer operands computed at run-time, except for lookups with gradients
 * (textureGrad*).</li>
 * </ul>
 * 
 * <p>This extension also provides additional support for processing patch primitives (introduced by ARB_tessellation_shader). ARB_tessellation_shader
 * requires the use of a tessellation evaluation shader when processing patches, which means that patches will never survive past the tessellation
 * pipeline stage. This extension lifts that restriction, and allows patches to proceed further in the pipeline and be used</p>
 * 
 * <ul>
 * <li>as input to a geometry shader, using a new "patches" layout qualifier;</li>
 * <li>as input to transform feedback;</li>
 * <li>by fixed-function rasterization stages, in which case the patches are drawn as independent points.</li>
 * </ul>
 * 
 * <p>Additionally, it allows geometry shaders to read per-patch attributes written by a tessellation control shader using input variables declared with
 * "patch in".</p>
 * 
 * <p>Requires {@link GL32 OpenGL 3.2}, GLSL 1.50 and {@link ARBGPUShader5 ARB_gpu_shader5}.</p>
 */
public class NVGPUShader5 {

	/** Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying. */
	public static final int
		GL_INT64_NV               = 0x140E,
		GL_UNSIGNED_INT64_NV      = 0x140F,
		GL_INT8_NV                = 0x8FE0,
		GL_INT8_VEC2_NV           = 0x8FE1,
		GL_INT8_VEC3_NV           = 0x8FE2,
		GL_INT8_VEC4_NV           = 0x8FE3,
		GL_INT16_NV               = 0x8FE4,
		GL_INT16_VEC2_NV          = 0x8FE5,
		GL_INT16_VEC3_NV          = 0x8FE6,
		GL_INT16_VEC4_NV          = 0x8FE7,
		GL_INT64_VEC2_NV          = 0x8FE9,
		GL_INT64_VEC3_NV          = 0x8FEA,
		GL_INT64_VEC4_NV          = 0x8FEB,
		GL_UNSIGNED_INT8_NV       = 0x8FEC,
		GL_UNSIGNED_INT8_VEC2_NV  = 0x8FED,
		GL_UNSIGNED_INT8_VEC3_NV  = 0x8FEE,
		GL_UNSIGNED_INT8_VEC4_NV  = 0x8FEF,
		GL_UNSIGNED_INT16_NV      = 0x8FF0,
		GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1,
		GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2,
		GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3,
		GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5,
		GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6,
		GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7,
		GL_FLOAT16_NV             = 0x8FF8,
		GL_FLOAT16_VEC2_NV        = 0x8FF9,
		GL_FLOAT16_VEC3_NV        = 0x8FFA,
		GL_FLOAT16_VEC4_NV        = 0x8FFB;

	protected NVGPUShader5() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glUniform1i64NV, caps.glUniform2i64NV, caps.glUniform3i64NV, caps.glUniform4i64NV, caps.glUniform1i64vNV, caps.glUniform2i64vNV, 
			caps.glUniform3i64vNV, caps.glUniform4i64vNV, caps.glUniform1ui64NV, caps.glUniform2ui64NV, caps.glUniform3ui64NV, caps.glUniform4ui64NV, 
			caps.glUniform1ui64vNV, caps.glUniform2ui64vNV, caps.glUniform3ui64vNV, caps.glUniform4ui64vNV, caps.glGetUniformi64vNV, caps.glGetUniformui64vNV, 
			caps.glProgramUniform1i64NV, caps.glProgramUniform2i64NV, caps.glProgramUniform3i64NV, caps.glProgramUniform4i64NV, caps.glProgramUniform1i64vNV, 
			caps.glProgramUniform2i64vNV, caps.glProgramUniform3i64vNV, caps.glProgramUniform4i64vNV, caps.glProgramUniform1ui64NV, 
			caps.glProgramUniform2ui64NV, caps.glProgramUniform3ui64NV, caps.glProgramUniform4ui64NV, caps.glProgramUniform1ui64vNV, 
			caps.glProgramUniform2ui64vNV, caps.glProgramUniform3ui64vNV, caps.glProgramUniform4ui64vNV
		);
	}

	// --- [ glUniform1i64NV ] ---

	public static void glUniform1i64NV(int location, long x) {
		long __functionAddress = GL.getCapabilities().glUniform1i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIJV(__functionAddress, location, x);
	}

	// --- [ glUniform2i64NV ] ---

	public static void glUniform2i64NV(int location, long x, long y) {
		long __functionAddress = GL.getCapabilities().glUniform2i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIJJV(__functionAddress, location, x, y);
	}

	// --- [ glUniform3i64NV ] ---

	public static void glUniform3i64NV(int location, long x, long y, long z) {
		long __functionAddress = GL.getCapabilities().glUniform3i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIJJJV(__functionAddress, location, x, y, z);
	}

	// --- [ glUniform4i64NV ] ---

	public static void glUniform4i64NV(int location, long x, long y, long z, long w) {
		long __functionAddress = GL.getCapabilities().glUniform4i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIJJJJV(__functionAddress, location, x, y, z, w);
	}

	// --- [ glUniform1i64vNV ] ---

	public static void nglUniform1i64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform1i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform1i64vNV(int location, LongBuffer value) {
		nglUniform1i64vNV(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2i64vNV ] ---

	public static void nglUniform2i64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform2i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform2i64vNV(int location, LongBuffer value) {
		nglUniform2i64vNV(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3i64vNV ] ---

	public static void nglUniform3i64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform3i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform3i64vNV(int location, LongBuffer value) {
		nglUniform3i64vNV(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4i64vNV ] ---

	public static void nglUniform4i64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform4i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform4i64vNV(int location, LongBuffer value) {
		nglUniform4i64vNV(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniform1ui64NV ] ---

	public static void glUniform1ui64NV(int location, long x) {
		long __functionAddress = GL.getCapabilities().glUniform1ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIJV(__functionAddress, location, x);
	}

	// --- [ glUniform2ui64NV ] ---

	public static void glUniform2ui64NV(int location, long x, long y) {
		long __functionAddress = GL.getCapabilities().glUniform2ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIJJV(__functionAddress, location, x, y);
	}

	// --- [ glUniform3ui64NV ] ---

	public static void glUniform3ui64NV(int location, long x, long y, long z) {
		long __functionAddress = GL.getCapabilities().glUniform3ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIJJJV(__functionAddress, location, x, y, z);
	}

	// --- [ glUniform4ui64NV ] ---

	public static void glUniform4ui64NV(int location, long x, long y, long z, long w) {
		long __functionAddress = GL.getCapabilities().glUniform4ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIJJJJV(__functionAddress, location, x, y, z, w);
	}

	// --- [ glUniform1ui64vNV ] ---

	public static void nglUniform1ui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform1ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform1ui64vNV(int location, LongBuffer value) {
		nglUniform1ui64vNV(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2ui64vNV ] ---

	public static void nglUniform2ui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform2ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform2ui64vNV(int location, LongBuffer value) {
		nglUniform2ui64vNV(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3ui64vNV ] ---

	public static void nglUniform3ui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform3ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform3ui64vNV(int location, LongBuffer value) {
		nglUniform3ui64vNV(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4ui64vNV ] ---

	public static void nglUniform4ui64vNV(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform4ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform4ui64vNV(int location, LongBuffer value) {
		nglUniform4ui64vNV(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glGetUniformi64vNV ] ---

	public static void nglGetUniformi64vNV(int program, int location, long params) {
		long __functionAddress = GL.getCapabilities().glGetUniformi64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformi64vNV(int program, int location, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformi64vNV(program, location, memAddress(params));
	}

	public static long glGetUniformi64NV(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetUniformi64vNV(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformui64vNV ] ---

	public static void nglGetUniformui64vNV(int program, int location, long params) {
		long __functionAddress = GL.getCapabilities().glGetUniformui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformui64vNV(int program, int location, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformui64vNV(program, location, memAddress(params));
	}

	public static long glGetUniformui64NV(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetUniformui64vNV(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glProgramUniform1i64NV ] ---

	public static void glProgramUniform1i64NV(int program, int location, long x) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIJV(__functionAddress, program, location, x);
	}

	// --- [ glProgramUniform2i64NV ] ---

	public static void glProgramUniform2i64NV(int program, int location, long x, long y) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIJJV(__functionAddress, program, location, x, y);
	}

	// --- [ glProgramUniform3i64NV ] ---

	public static void glProgramUniform3i64NV(int program, int location, long x, long y, long z) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIJJJV(__functionAddress, program, location, x, y, z);
	}

	// --- [ glProgramUniform4i64NV ] ---

	public static void glProgramUniform4i64NV(int program, int location, long x, long y, long z, long w) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4i64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIJJJJV(__functionAddress, program, location, x, y, z, w);
	}

	// --- [ glProgramUniform1i64vNV ] ---

	public static void nglProgramUniform1i64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform1i64vNV(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2i64vNV ] ---

	public static void nglProgramUniform2i64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform2i64vNV(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3i64vNV ] ---

	public static void nglProgramUniform3i64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform3i64vNV(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4i64vNV ] ---

	public static void nglProgramUniform4i64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4i64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4i64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform4i64vNV(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1ui64NV ] ---

	public static void glProgramUniform1ui64NV(int program, int location, long x) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIJV(__functionAddress, program, location, x);
	}

	// --- [ glProgramUniform2ui64NV ] ---

	public static void glProgramUniform2ui64NV(int program, int location, long x, long y) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIJJV(__functionAddress, program, location, x, y);
	}

	// --- [ glProgramUniform3ui64NV ] ---

	public static void glProgramUniform3ui64NV(int program, int location, long x, long y, long z) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIJJJV(__functionAddress, program, location, x, y, z);
	}

	// --- [ glProgramUniform4ui64NV ] ---

	public static void glProgramUniform4ui64NV(int program, int location, long x, long y, long z, long w) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4ui64NV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIJJJJV(__functionAddress, program, location, x, y, z, w);
	}

	// --- [ glProgramUniform1ui64vNV ] ---

	public static void nglProgramUniform1ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform1ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform1ui64vNV(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2ui64vNV ] ---

	public static void nglProgramUniform2ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform2ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform2ui64vNV(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3ui64vNV ] ---

	public static void nglProgramUniform3ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform3ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform3ui64vNV(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4ui64vNV ] ---

	public static void nglProgramUniform4ui64vNV(int program, int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniform4ui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4ui64vNV(int program, int location, LongBuffer value) {
		nglProgramUniform4ui64vNV(program, location, value.remaining() >> 2, memAddress(value));
	}

}