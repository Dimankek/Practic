package test.demo.test;

import test.demo.controller.CarService;
import test.demo.model.Car;
import java.util.List;

public class CarServiceTest {

    CarService service = new CarService();


    public void testSaveRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Car car1 = new Car();
        car1.setName("BMW");
        car1.setModel("kjqwdksbj");

        //Записали в БД
        Car car = service.add(car1);

        //Вывели записанную в БД запись
        System.out.println(car);
    }


    public void testDeleteRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Car car1 = new Car();
        car1.setName("Ferrari");
        car1.setModel("jhqjkdh");

        //Записуем его в БД
        Car car = service.add(car1);

        //Удвлем его с БД
        service.delete(car.getId());
    }


    public void testSelect() throws Exception {
        //Создаем автомобиль для записи в БД
        Car car1 = new Car();
        car1.setName("Citroen‎");
        car1.setModel("ghyry");

        //Записываем в БД
        Car car = service.add(car1);

        //Получние с БД Citroen‎
        Car carFromDB = service.get(car.getId());
        System.out.println(carFromDB);
    }


    public void testUpdate() throws Exception {
        //Создаем автомобиль для записи в БД
        Car car1 = new Car();
        car1.setName("Lambordshini");
        car1.setModel("sasdqdq");

        //Записываем в БД
        car1 = service.add(car1);


        //Обновляем
        service.update(car1);

        //Получаем обновленую запись
        Car car2 = service.get(car1.getId());
        System.out.println(car2);
    }

    public void testGetAll(){
        //Создаем автомобиль для записи в БД
        Car car1 = new Car();
        car1.setName("Lexus");
        car1.setModel("cwcdwdc");

        //Создаем автомобиль для записи в БД
        Car car2 = new Car();
        car2.setName("Fiat");
        car2.setModel("ccddc");

        //Создаем автомобиль для записи в БД
        Car car3 = new Car();
        car3.setName("Porsche");
        car3.setModel("mce");

        //Сохраняем все авто
        service.add(car1);
        service.add(car2);
        service.add(car3);

        //Получаем все авто с БД
        List<Car> cars = service.getAll();

        //Выводим полученый список авто
        for(Car c : cars){
            System.out.println(c);
        }
    }

}