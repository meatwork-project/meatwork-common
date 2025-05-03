package com.meatwork.common;


/*
 * Copyright (c) 2025 Taliro.
 * All rights reserved.
 */
public final class Preconditions {

	public static void checkNotNull(Object object, String message) {
		if (object == null) {
			throw new IllegalArgumentException(message);
		}
	}

}
