package com.onesime;

import lombok.Data;

@Data
public class Main {
	
	private String name;

	public static void main(String[] args) {
		OnesimeConsole.print("Hello from test-lib");
	}

}
