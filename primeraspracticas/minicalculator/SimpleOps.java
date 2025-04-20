package minicalculator;

//import java.util.*;

public class SimpleOps {

	public static int add(int... nums) {
		int	total = 0;
		for (int num : nums)
			total += num;
		return (total);
	}
	public static int substract(int... nums) {
		int	result = 0;
		for (int num : nums)
			result -= num;
		return (result);
	}
	public static int multiply(int... nums) {
		int	result = 0;
		for (int num : nums)
			result *= num;
		return (result);
	}
	public static int divide(int... nums) {
		int	result = 0;
		for (int num : nums)
			result /= num;
		return (result);
	}
}
