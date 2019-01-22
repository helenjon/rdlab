package lesson6.part2;


public class Person {

//Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон.
   private String firstName, secondName, oName, address;
   private Integer phone;
   private Integer dateOfBirth;

   @Override
   public String toString() {
      return "Person{" +
              "firstName='" + firstName + '\'' +
              ", secondName='" + secondName + '\'' +
              ", oName='" + oName + '\'' +
              ", address='" + address + '\'' +
              ", phone=" + phone +
              ", dateOfBirth=" + dateOfBirth +
              '}';
   }

   public Person(String firstName, String secondName) {
      this.firstName = firstName;
      this.secondName = secondName;
   }

   public String getSecondName() {
      return secondName;
   }

   public void setSecondName(String secondName) {
      this.secondName = secondName;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getoName() {
      return oName;
   }

   public void setoName(String oName) {
      this.oName = oName;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public Integer getPhone() {
      return phone;
   }

   public void setPhone(Integer phone) {
      this.phone = phone;
   }

   public Integer getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(Integer dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }
}
