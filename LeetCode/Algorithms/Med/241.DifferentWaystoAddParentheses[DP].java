class Solution {
    
    public List<Integer> diffWaysToCompute(String expression) {        
        int n = expression.length();

        // 전체 식 계산
        return dfs(expression, 0, n - 1);
    }

    public static List<Integer> dfs(String exp, int s, int e) {

        // 가능한 결과 저장
        List<Integer> result = new ArrayList<>();

        // 연산자를 하나씩 확인
        for (int i = s; i <= e; i++) {

            String op = exp.substring(i, i + 1);

            if (op.equals("+") ||
                op.equals("-") ||
                op.equals("*")) {

                // 연산자를 기준으로 분할
                List<Integer> left = dfs(exp, s, i - 1);
                List<Integer> right = dfs(exp, i + 1, e);

                // 왼쪽 × 오른쪽 모든 경우 계산
                for (int l : left) {
                    for (int r : right) {

                        if (op.equals("+")) result.add(l + r);
                        if (op.equals("-")) result.add(l - r);
                        if (op.equals("*")) result.add(l * r);
                    }
                }
            }
        }

        // 연산자가 없으면 숫자
        if (result.isEmpty()) {
            result.add(Integer.parseInt(exp.substring(s, e + 1)));
        }

        return result;
    }
}
