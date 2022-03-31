class Patient { // 지역 별 환자
   private int severe = 0; // 환자 수
   private int notSe = 0;  // 누적 치료 환자 수
   private boolean isHos = false;  // 입원 여부

   Patient(int severe, String s) { // 생성자(환자 수, 지역 이름)
      this.severe += severe;
      System.out.println(s+" 지역에 "+severe+ "명의 환자가 발생했습니다.");
   }
   
   void newPa(int n, String s) { // 새로운 환자 발생(환자 수, 지역 이름)
      this.severe += n;
      System.out.println(s+" 지역에 "+ n + "명의 환자가 추가적으로 발생했습니다.");
   }
   
   void cureSe(int c) { // 치료
      if(isHos == true) { // 입원이 되어 있다면 환자 수 줄이고 누적 치료자 수 늘림
         severe -= c;
         notSe += c;
         if(severe == 0) // 환자 수가 0이면 입원한 사람 없다고 판단
            isHos = false;
      }
      else
         System.out.println("환자를 입원부터 시켜야 합니다.");
   }
   
   void hospi(int n, Hospital h) { // 입원 시도
      if(n > severe) 
         System.out.println("환자 수 보다 작은 수를 입력해주세요.");
      if(n <= severe && n > h.getCanNum())
         System.out.println("병상이 모자랍니다.");
      else if(n <= severe && n <= h.getCanNum()) {
         h.hospitalization(n); // 메시지 패싱 - 병원의 남은 병상 사용
         isHos = true; // 입원 중임을 알림
         System.out.println(n+"명 입원되었습니다.");
      }   
   }
   
   void show() {
      System.out.println("현재 해당 지역 중환자 수는 "+ severe +"명 이고, 지역 누적 치료자 수는 " + notSe +"명 입니다.");
   }
}