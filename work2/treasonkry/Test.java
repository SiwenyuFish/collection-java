import java.time.LocalDate;

public class Test {


    public static void main(String[] args) {
        //宠物店的测试
        MyAnimalShop myAnimalShop = new MyAnimalShop();
        myAnimalShop.money = 300;
        myAnimalShop.isOpened = true;
        myAnimalShop.dayEarning = 0;
        //动物的实例
        Dog dog1 = new Dog();
        dog1.setName("a");
        dog1.setSex('公');
        dog1.getPrice();
        dog1.setAge(2);
        Animal cat1 = new Cat();
        cat1.setName("aa");
        cat1.setAge(1);
        cat1.getPrice();
        cat1.setSex('母');

        //测试买入
        myAnimalShop.purchase(dog1);
        myAnimalShop.purchase(cat1);
        System.out.println(myAnimalShop.animalList);
        System.out.println(myAnimalShop.toString());

        //测试招待顾客
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        customer1.setName("A");
        customer1.setBuyAnimal(dog1);
        customer1.setLatestTime(LocalDate.now());
        customer1.setTime(2);
        customer2.setLatestTime(LocalDate.now());
        customer2.setTime(1);
        customer2.setName("B");
        customer2.setBuyAnimal(cat1);
        myAnimalShop.treatCustomer(customer1);
        System.out.println(myAnimalShop.customers);
        System.out.println(myAnimalShop.animalList);
        myAnimalShop.treatCustomer(customer2);
        System.out.println(myAnimalShop.customers);
        //测试歇业
        myAnimalShop.close();
        System.out.println(myAnimalShop.toString());




    }
}
