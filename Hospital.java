class Hospital { // 병원
   private int bedNum = 1125; // 총 병상
   private int useNum = 0; // 사용 중인 병상
   
   Hospital(String s) { // 생성자(병원 이름)
      System.out.println(s + "병원이 생성되었습니다.");
   }

   int getCanNum() { // 남은 병상
      return bedNum - useNum;
   }

   void hospitalization(int h) { // 입원
      useNum += h;
   }
   
   void cure(int n, Patient p) {  // 치료 후 퇴원
      p.cureSe(n); // 메시지 패싱 - 치료 : 해당 지역의 환자 수 줄이고 누적 치료자 수 늘림
      useNum -= n;
      System.out.println(n+"명이 치료 후 퇴원하였습니다.");
   }
   
   void show() {
      if((double)useNum / (double)bedNum >= 0.75) {
         System.out.print("현재 사용중인 중환자실 병상 수는 "+ useNum +"이고, 사용가능 병상 수는 ");
         System.out.print(bedNum-useNum);
         System.out.println("입니다. 병상 사용률이 75%를 넘었으므로 단계적 일상회복 시행을 중단합니다.");
      }
      else {
         System.out.print("현재 사용중인 중환자실 병상 수는 "+ useNum +"이고, 사용가능 병상 수는 ");
         System.out.print(bedNum-useNum);
         System.out.println("입니다.");
      }
   }
}