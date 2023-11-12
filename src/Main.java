import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Client> clientArrayList = new ArrayList<>();
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        Client client1 = new Client();
        client1.setDni("05309480E");
        client1.setName("Mª TERESA");
        client1.setSurnames("ALVAREZ SANCHEZ");
        client1.setDirection("CALLE LEONARDO PRIETO CASTRO 8, 28040 MADRID");
        clientArrayList.add(client1);


        Client client2 = new Client();
        client2.setDni("71453503R");
        client2.setName("SHEILA");
        client2.setSurnames("BORRAJO GUTIERREZ");
        client2.setDirection("CALLE MONTALBAN 1, 28014 MADRID");
        clientArrayList.add(client1);


        Client client3 = new Client();
        client3.setDni("71451203R");
        client3.setName("MARÍA");
        client3.setSurnames("CALOCA DE LA RIVA");
        client3.setDirection("CARRETERA M-607 2100, 28049 MADRID");
        clientArrayList.add(client1);


        Client client4 = new Client();
        client4.setDni("72099723J");
        client4.setName("MARCOS");
        client4.setSurnames("CARO NARANJO");
        client4.setDirection("PASEO FERNAN NUÑEZ 10, 28009 MADRID");
        clientArrayList.add(client4);

        Client client5 = new Client();
        client5.setDni("");
        client5.setName("");
        client5.setSurnames("");
        client5.setDirection("");
        clientArrayList.add(client5);


        Vehicle vehicle1 = new Vehicle();
        vehicle1.setBrand("Toyota");
        vehicle1.setColor("Blue");
        vehicle1.setEngine("2.0L");
        vehicle1.setFuel("Gasoline");
        vehicle1.setHorser("180");
        vehicle1.setVehicleRegistration("ABC123");


        Vehicle vehicle2 = new Vehicle();
        vehicle2.setBrand("Honda");
        vehicle2.setColor("Red");
        vehicle2.setEngine("1.8L");
        vehicle2.setFuel("Diesel");
        vehicle2.setHorser("150");
        vehicle2.setVehicleRegistration("XYZ789");

        Vehicle vehicle3 = new Vehicle();
        vehicle3.setBrand("Ford");
        vehicle3.setColor("Silver");
        vehicle3.setEngine(" Electric Motor");
        vehicle3.setFuel("Electric");
        vehicle3.setHorser("200");
        vehicle3.setVehicleRegistration("DEF456");

        Vehicle vehicle4 = new Vehicle();
        vehicle4.setBrand("BMW");
        vehicle4.setColor("Black");
        vehicle4.setEngine("3.0L");
        vehicle4.setFuel("Gasoline");
        vehicle4.setHorser("250");
        vehicle4.setVehicleRegistration("GHI789");

        Vehicle vehicle5 = new Vehicle();
        vehicle5.setBrand("Mercedes-Benz");
        vehicle5.setColor("White");
        vehicle5.setEngine("2.5L Hybrid");
        vehicle5.setFuel("Hybrid");
        vehicle5.setHorser("220");
        vehicle5.setVehicleRegistration("JKL012");

        Vehicle vehicle6 = new Vehicle();
        vehicle6.setBrand("Chevrolet");
        vehicle6.setColor("Green");
        vehicle6.setEngine("2.2L");
        vehicle6.setFuel("Ethanol");
        vehicle6.setHorser("170");
        vehicle6.setVehicleRegistration("MNO345");

        Vehicle vehicle7 = new Vehicle();
        vehicle7.setBrand("Nissan");
        vehicle7.setColor("Yellow");
        vehicle7.setEngine("1.6L");
        vehicle7.setFuel("Gasoline");
        vehicle7.setHorser("160");
        vehicle7.setVehicleRegistration("PQR678");

        Vehicle vehicle8 = new Vehicle();
        vehicle8.setBrand("Volkswagen");
        vehicle8.setColor("Orange");
        vehicle8.setEngine("2.5L");
        vehicle8.setFuel("Diesel");
        vehicle8.setHorser("180");
        vehicle8.setVehicleRegistration("STU901");

        Vehicle vehicle9 = new Vehicle();
        vehicle9.setBrand("Audi");
        vehicle9.setColor("Purple");
        vehicle9.setEngine("2.8L");
        vehicle9.setFuel("Gasoline");
        vehicle9.setHorser("200");
        vehicle9.setVehicleRegistration("VWX234");


        Sale sale1 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");

        Sale sale2 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");

        Sale sale3 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");

        Sale sale4 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");

        Sale sale5 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");

        Sale sale6 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");

        Sale sale7 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");



        System.out.println(sale1.toString());
        System.out.println(sale2.toString());
        System.out.println(sale3.toString());
        System.out.println(sale4.toString());
        System.out.println(sale5.toString());

















    }
}