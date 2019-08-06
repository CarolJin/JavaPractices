class BasicCalculator2 {

    public int calculate(String str) {
    
        Stack<Integer> parenLevelNumsAndSigns = new Stack<>();
        int num = 0, sum = 0, sign = 1; //Please note num and sign always stand for those from previous round
        
        for(char c : str.toCharArray()){
            if(c >= '0' && c <= '9'){
                num = num * 10 + c - '0';
            }else if(c == '('){
                parenLevelNumsAndSigns.push(sum);
                parenLevelNumsAndSigns.push(sign);
                sum = 0;
                sign = 1;
            }else if(c == '+' || c == '-'){
                sum += sign * num;
                num = 0;
                sign = c == '+' ? 1 : -1;
            }else if(c == ')'){
                sum += num * sign;
                num = 0;
                sum *= parenLevelNumsAndSigns.pop();
                sum += parenLevelNumsAndSigns.pop();
            }
        }
        if(num != 0)    sum += num * sign;
        return sum;
    }
    
}

//4ms
