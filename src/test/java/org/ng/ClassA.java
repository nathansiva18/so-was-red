package org.ng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ClassA {
	private void johnwick() {
		System.out.println("keanu reevs");
	}

	private void matrix() {
		System.out.println("siva");
	}

	private void parabellum() {
		System.out.println("matrix");
	}

	private void ronin() {
		System.out.println("47");
	}

	private void constantine() {
		System.out.println("devil");
	}

	private String constatine2(String path, String key) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(path));
		return (String) prop.get(key);
	}

	private void naanthaan() {
		System.out.println("sjhfjksj.k");
	}

}
