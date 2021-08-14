class TargetNumber {
    public static int solution(int[] numbers, int target) {
        int answer;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }

    public static int dfs(int[] numbers, int count, int result, int target) {
        if (count == numbers.length) {
            if (result == target)
                return 1;
            else
                return 0;
        }

        return dfs(numbers, count+1, result + numbers[count], target) + dfs(numbers, count+1, result - numbers[count], target);
    }
}
