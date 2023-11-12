public class Main {
    public static void main(String[] args) {
        client1.setSurnames("ALVAREZ SANCHEZ");
        client1.setDirection("CALLE LEONARDO PRIETO CASTRO 8, 28040 MADRID");
        clientArrayList.add(client1);
        client1.getDni();
        client1.getName();
        client1.getSurnames();
        client1.getDirection();


        Client client2 = new Client();
        client2.setDni("71453503R");
        client2.setName("SHEILA");
        client2.setSurnames("BORRAJO GUTIERREZ");
        client2.setDirection("CALLE MONTALBAN 1, 28014 MADRID");
        clientArrayList.add(client2);
        client2.getDni();
        client2.getName();
        client2.getSurnames();
        client2.getDirection();


        Client client3 = new Client();
        client3.setDni("71451203R");
        client3.setName("MARÍA");
        client3.setSurnames("CALOCA DE LA RIVA");
        client3.setDirection("CARRETERA M-607 2100, 28049 MADRID");
        clientArrayList.add(client3);
        client3.getDni();
        client3.getName();
        client3.getSurnames();
        client3.getDirection();


        Client client4 = new Client();

        client4.setSurnames("CARO NARANJO");
        client4.setDirection("PASEO FERNAN NUÑEZ 10, 28009 MADRID");
        clientArrayList.add(client4);
        client4.getDni();
        client4.getName();
        client4.getSurnames();
        client4.getDirection();

        Client client5 = new Client();
        client5.setDni("");
        client5.setName("");
        client5.setSurnames("");
        client5.setDirection("");
        clientArrayList.add(client5);
        client5.getDni();
        client5.getName();
        client5.getSurnames();
        client5.getDirection();


        Vehicle vehicle1 = new Vehicle();

        vehicle1.setEngine("2.0L");
        vehicle1.setFuel("Gasoline");
        vehicle1.setHorser("180");
        vehicle1.setVehicleRegistration("314223FD");
        vehicleArrayList.add(vehicle1);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();


        Vehicle vehicle2 = new Vehicle();

        vehicle2.setFuel("Diesel");
        vehicle2.setHorser("150");
        vehicle2.setVehicleRegistration("XYZ789");
        vehicleArrayList.add(vehicle2);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();

        Vehicle vehicle3 = new Vehicle();
        vehicle3.setBrand("Ford");

        vehicle3.setFuel("Electric");
        vehicle3.setHorser("200");
        vehicle3.setVehicleRegistration("DEF456");
        vehicleArrayList.add(vehicle3);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();

        Vehicle vehicle4 = new Vehicle();
        vehicle4.setBrand("BMW");

        vehicle4.setFuel("Gasoline");
        vehicle4.setHorser("250");
        vehicle4.setVehicleRegistration("GHI789");
        vehicleArrayList.add(vehicle4);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();

        Vehicle vehicle5 = new Vehicle();
        vehicle5.setBrand("Mercedes-Benz");

        vehicle5.setFuel("Hybrid");
        vehicle5.setHorser("220");
        vehicle5.setVehicleRegistration("JKL012");
        vehicleArrayList.add(vehicle5);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();

        Vehicle vehicle6 = new Vehicle();
        vehicle6.setBrand("Chevrolet");

        vehicle6.setFuel("Ethanol");
        vehicle6.setHorser("170");
        vehicle6.setVehicleRegistration("MNO345");
        vehicleArrayList.add(vehicle6);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();

        Vehicle vehicle7 = new Vehicle();
        vehicle7.setBrand("Nissan");

        vehicle7.setFuel("Gasoline");
        vehicle7.setHorser("160");
        vehicle7.setVehicleRegistration("PQR678");
        vehicleArrayList.add(vehicle7);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();

        Vehicle vehicle8 = new Vehicle();
        vehicle8.setBrand("Volkswagen");

        vehicle8.setFuel("Diesel");
        vehicle8.setHorser("180");
        vehicle8.setVehicleRegistration("STU901");
        vehicleArrayList.add(vehicle8);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();

        Vehicle vehicle9 = new Vehicle();
        vehicle9.setBrand("Audi");

        vehicle9.setFuel("Gasoline");
        vehicle9.setHorser("200");
        vehicle9.setVehicleRegistration("VWX234");
        vehicleArrayList.add(vehicle9);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();


        Sale sale1 = new Sale();

        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");
        sale1.setCost(33.2);
        sale1.getDataSale();
        sale1.getCostumerData();
        sale1.getVehiculeData();
        sale1.getId();

        Sale sale2 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");
        sale1.getDataSale();
        sale1.getCostumerData();
        sale1.getVehiculeData();
        sale1.getId();

        Sale sale3 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");
        sale1.getDataSale();
        sale1.getCostumerData();
        sale1.getVehiculeData();
        sale1.getId();

        Sale sale4 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");
        sale1.getDataSale();
        sale1.getCostumerData();
        sale1.getVehiculeData();
        sale1.getId();

        Sale sale5 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");
        sale1.getDataSale();
        sale1.getCostumerData();
        sale1.getVehiculeData();
        sale1.getId();

        Sale sale6 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");
        sale1.getDataSale();
        sale1.getCostumerData();
        sale1.getVehiculeData();
        sale1.getId();

        Sale sale7 = new Sale();
        sale1.setCost(33.2);
        sale1.setDataSale("");
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("");
        sale1.getDataSale();
        sale1.getCostumerData();
        sale1.getVehiculeData();
        sale1.getId();


        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú del Concesionario:");
            System.out.println("1. Ver coches no vendidos");
            System.out.println("2. Ver coches vendidos");
            System.out.println("3. Ver lista de clientes");
            System.out.println("4. Ver lista de facturas");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Procesar la opción
            switch (opcion) {
                case 1:
                    System.out.println("Coches No Vendidos");
                    System.out.println(vehicleArrayList.toString());
                    break;
                case 2:
                    System.out.println("Coches Vendidos");
                    System.out.println(vehicleArrayList.toString());
                    break;
                case 3:
                    System.out.println("Clientes");
                    System.out.println(clientArrayList.toString());
                    break;
                case 4:
                    System.out.println("Facturas");
                    System.out.println(sale1.toString());
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();


    }
}