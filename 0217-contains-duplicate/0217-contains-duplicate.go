func containsDuplicate(nums []int) bool {
gomap := make(map[int]int)
	for i, num := range nums{
		if _ , ok := gomap[num]; ok{
			return true
		}
		gomap[num] = i
	}
	return false
}