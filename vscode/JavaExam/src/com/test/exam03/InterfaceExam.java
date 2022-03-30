// 인터페이스(Interface) 상속과 오버라이딩(Overriding)
package com.test.exam03;

interface Sales {

    public void manager();  //메소드 정의
    public void goal();
    public void product();
    
}
    class ATeam implements Sales {

        @Override
        public void manager() {
            System.out.println("A팀장입니다. 열심히 하겠습니다.");
        
        }

        @Override
        public void goal() {
            System.out.println("A팀은 올해 70억을 달성해 보겠습니다.");
            
        }

        @Override
        public void product() {
            System.out.println("A팀은 TV를 판매하겠습니다.");
            
        }
    }   
        class BTeam implements Sales{

            @Override
            public void manager() {
               System.out.println("B팀 팀장 입니다.");
                
            }

            @Override
            public void goal() {
                System.out.println("B팀은 올해 100억을 달성하겠습니다.");
                
            }

            @Override
            public void product() {
                System.out.println("B팀은 냉장고를 판매하겠습니다.");
                
            }
            
        }
public class InterfaceExam {
    
    public static void main(String[] args) {

        ATeam aSalePlan = new ATeam();
        aSalePlan.manager();
        aSalePlan.goal();
        aSalePlan.product();

        BTeam bSalePlan = new BTeam();
        bSalePlan.manager();
        bSalePlan.goal();
        bSalePlan.product();
    }
}
