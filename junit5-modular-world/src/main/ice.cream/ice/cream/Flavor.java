/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package ice.cream;

enum Flavor {

	Chocolate,

	Stracciatella,

	Vanilla;

	static Flavor random() {
		Flavor[] flavors = values();
		return flavors[(int) (Math.random() * flavors.length)];
	}
}
