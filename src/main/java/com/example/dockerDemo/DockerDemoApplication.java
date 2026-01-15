package com.example.dockerDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
		// Get the Java Runtime Environment version
		String javaVersion = System.getProperty("java.version");
		// Get the directory where the Java runtime is installed
		String javaHome = System.getProperty("java.home");
		// Get the specification version (usually matches the major version number)
		String javaSpecificationVersion = System.getProperty("java.specification.version");
		// Get the vendor name
		String javaVendor = System.getProperty("java.vendor");

		System.out.println("----------------------------------------");
		System.out.println("JDK/JRE Information:");
		System.out.println("----------------------------------------");
		System.out.println("java.version:                  " + javaVersion);
		System.out.println("java.specification.version:    " + javaSpecificationVersion);
		System.out.println("java.vendor:                   " + javaVendor);
		System.out.println("java.home (Installation Path): " + javaHome);
		System.out.println("----------------------------------------");
	}

}

// class JDKVersionCheck implements CommandLineRunner {
//	public static void main(String[] args) {
//		// Get the Java Runtime Environment version
//		String javaVersion = System.getProperty("java.version");
//		// Get the directory where the Java runtime is installed
//		String javaHome = System.getProperty("java.home");
//		// Get the specification version (usually matches the major version number)
//		String javaSpecificationVersion = System.getProperty("java.specification.version");
//		// Get the vendor name
//		String javaVendor = System.getProperty("java.vendor");
//
//		System.out.println("----------------------------------------");
//		System.out.println("JDK/JRE Information:");
//		System.out.println("----------------------------------------");
//		System.out.println("java.version:                  " + javaVersion);
//		System.out.println("java.specification.version:    " + javaSpecificationVersion);
//		System.out.println("java.vendor:                   " + javaVendor);
//		System.out.println("java.home (Installation Path): " + javaHome);
//		System.out.println("----------------------------------------");
//	}
//
//	 @Override
//	 public void run(String... args) throws Exception {
//		  String arr[]={"asdf","asdf"};
//		 main(arr);
//	 }
// }
