package assignment_1;

import protectedPackage.ProtectedClass;

public class PackageImportClass{
	public static void main(String[] args) {
		new childClass().callShow();
	}
}

class childClass extends ProtectedClass{
	void callShow(){
		super.protectedMethod();
	}
}
