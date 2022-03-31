public class Main {

   public static void main(String[] args) {
      
      Hospital byungwon = new Hospital("한국"); // 한국 병원 생성
      System.out.println();
      
      Patient Seoul = new Patient(132, "서울"); // 서울에 환자 132명 발생
      Seoul.cureSe(123); //치료 시도(입원 되어있는지 확인)
      Seoul.hospi(132, byungwon); // 서울 환자 132명 입원
      byungwon.cure(100, Seoul); // 서울 환자 100명 치료 및 퇴원
      byungwon.show();
      Seoul.show();
      byungwon.cure(2, Seoul); // 서울 환자 2명 치료 및 퇴원
      byungwon.show();
      Seoul.show();
      System.out.println();
      
      Patient Incheon = new Patient(1200, "인천"); // 인천에 환자 1200명 발생
      Incheon.hospi(1200, byungwon); // 인천 환자 1200명 입원 시도 - 병상 모자람
      Incheon.hospi(1000, byungwon); // 인천 환자 1000명 입원
      byungwon.cure(100, Incheon); // 인천 환자 100명 치료 및 퇴원
      Incheon.show();
      byungwon.show();
      Incheon.hospi(100, byungwon); // 인천 환자 100명 입원
      byungwon.show();
      System.out.println();
      
      Patient Busan = new Patient(500, "부산"); // 부산에 환자 500명 발생
      Busan.hospi(25, byungwon); // 부산 환자 25명 입원
      byungwon.show();
      byungwon.cure(900, Incheon); // 인천 환자 900명 치료 및 퇴원
      byungwon.show();
      byungwon.cure(25, Busan); // 부산 환자 25명 치료 및 퇴원
      byungwon.cure(100, Incheon); // 인천 환자 100명 치료 및 퇴원 
      byungwon.show();
      Busan.show();
      Busan.hospi(475, byungwon); // 부산 환자 475명 입원
      byungwon.cure(475, Busan); // 부산 환자 475명 치료 및 퇴원
      Busan.show();
      System.out.println();
      
      Seoul.newPa(200, "서울"); // 서울에 환자 200명 새로 발생
      Seoul.show();
      Seoul.hospi(200, byungwon); // 서울 환자 200명 입원
      byungwon.cure(230, Seoul); // 서울 환자 230명 치료 및 퇴원
      System.out.println();
      
      Seoul.show();
      Incheon.show();
      Busan.show();
      byungwon.show();
      System.out.println();
      
      Incheon.hospi(100, byungwon);  // 인천 환자 100명 입원
      byungwon.show();
      Incheon.show();
      byungwon.cure(100, Incheon); // 인천 환자 100명 치료 및 퇴원
      byungwon.show();
      Incheon.show();
   }

}