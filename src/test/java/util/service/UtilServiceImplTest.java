package util.service;


import com.example.demo.util.service.LambdaUtils;


public class UtilServiceImplTest extends LambdaUtils {
    public static void main(String[] args){
        String result = "";
        for(int i=0; i<4; i++){
            result += (int) (Math.random() * 10);
        }
        print.accept(result);
    }
}


