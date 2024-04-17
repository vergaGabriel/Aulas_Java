class fibonacci {
    public static void main(String[] args) {
        int numMax = 20;
        fibonacci(numMax);
    }

    public static void fibonacci(int numMax) {

		int num1 = 0;
		int num2 = 1;
		int interm;

		System.out.println(num1 + " ");
		System.out.println(num2 + " ");

		for (int i = 2; i < numMax; i++) {

			interm = num1 + num2;
            
			System.out.print(interm + " ");
            		if ((interm%2)==0) {
                		System.out.println("- par " );
            		} else {
                		System.out.println("- impar ");
            		}

			num1 = num2;
			num2 = interm;
		}
	}
}
