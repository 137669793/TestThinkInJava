package testextends;



public class F {
    public static void main(String[] args) {
        Faculty a=new Faculty();
        a.setName("����");
        a.setTelphone("123456788");
        a.setDegree("����");
        a.setLevel("һ��");
        a.setEmail("12345877@qq.com");
        System.out.println("Ա��������"+a.getName()+" �绰"+a.getTelphone()+
                " ѧλ"+a.getDegree()+" ����"+a.getLevel()+" ����"+a.getEmail());
        Employee b=new Employee();
        b.setName("����");
        b.setTelphone("123456788");
        b.setEmail("12345877@qq.com");
        b.setOffice("A��407");
        b.setWage(20000);
        System.out.println("Ա��������"+b.getName()+" �绰"+b.getTelphone()+
                " ����"+a.getEmail()+" �칫��"+b.getOffice()+" ����"+b.getWage());
    }
}