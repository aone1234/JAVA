package kr.co.kihd.string2;

import java.util.ArrayList;
import java.util.Collections;
 
/**
 * Collections.shuffle, Collections.sort를 이용한 Lotto 번호추출
 * 
 * @author callor
 * @since 2017-02-10
 * @see
 *   랜덤함수를 이용한 Lotto 번호를 추출 할 수도 있으나
 *   Collections 객체의 shuffle() method와 sort() method를 이용하여 만들어 본다.
 *
 */
public class dd {
 
    public static void main(String[] args) {
 
        // 1부터 45까지 일련의 숫자를 ArrayList에 add 한다.
        // 당연히 순서대로 숫자들이 추가될 것이다.
        ArrayList<Integer> arrInteger = new ArrayList<Integer>();
        for(int i = 1; i <= 45;i++){
            arrInteger.add(i) ;
        }
        
        // 10개의 번호를 추출하기 위한 반복문
        for(int i = 0 ; i < 10; i ++) {
            
            // shuffle() method를 이용하여 ArrayList를 무작위로 뒤 섞는다.
            Collections.shuffle(arrInteger);
            
            // 뒤 섞인 ArrayList로 부터 0 부터 4까지 5개를 순서대로 추출하여
            // 별도의 ArryaList에 담는다
            ArrayList<Integer> arrLotto = new ArrayList<Integer>();
            for(int j = 0 ; j < 6 ; j++) {
                arrLotto.add(arrInteger.get(j));
            }
            
            // sort() method를 이용하여 오름차순 정렬한다.
            Collections.sort(arrLotto);
            
            // 생성된 로또 번호를 console에 보인다
            System.out.printf( "%2d 번째 로또번호 : ",i+1);
            System.out.println(arrLotto);
        }
    }
}