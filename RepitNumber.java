// class RepitNumber
// {
// 	public static void main(String[] args) {
		
// 		int seen[10]={0};
// 		int num=2143;

// 		int rem;
// 		while(num>0)
// 		{
// 			rem=num%10;
// 			if (seen[rem]==1)
// 				break;
// 			seen[rem]==1;
// 			num=num/10;
// 		}
// 		if (num>0)
// 			System.out.println("Repeted number");
// 			else
// 				System.out.println("not Repetade");
// 	}
// }
class RepitNumber {
    public static void main(String[] args) {
        int[] seen = new int[10];
        int num = 2142;

        boolean hasRepeated = false;
        while (num > 0) {
            int rem = num % 10;
            if (seen[rem] == 1) {
                hasRepeated = true;
                break;
            }
            seen[rem] = 1;
            num = num / 10;
        }

        if (hasRepeated) {
            System.out.println("Repeated number");
        } else {
            System.out.println("No repeated number");
        }
    }
}
