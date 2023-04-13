func isHappy(n int) bool {
     	for i := 0; i < 10; i++ {
		sum := 0
		for n > 0 {
			sum += (n % 10) * (n % 10)
			n /= 10
		}
		n = sum
	}
	return n == 1
}