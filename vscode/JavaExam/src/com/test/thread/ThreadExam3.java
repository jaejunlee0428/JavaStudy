/* 클래스 변수 명 또는 메소드 이름이 없는 타입의 프로그래밍을 
 anonymous 무기명 함수형 프로그래밍*/
package com.test.thread;

public class ThreadExam3 {

    public static void main(String[] args) {
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i =0; i < 30; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Thead1이 실행");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thead1이 실행");
                }
            }
            

        }).start();
        for(int i =0; i<30; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread2이 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
