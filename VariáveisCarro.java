import  java.util.Scanner;

        class VariáveisCarro {
            public static void main(String[] args) {

                Scanner scanner = new Scanner (System.in);
                System.out.println("Volkswagen");
                String marca = scanner.nextLine();
   
                System.out.println("Gol");
                String modelo = scanner.nextLine();
        
                System.out.println("2017");
                int Anodefabricação = scanner.nextInt();

                System.out.println("30km");
                int Velocidadeatual = scanner.nextInt();
                
                Carro carro = new Carro (marca, modelo, Anodefabricação, Velocidadeatual);
                System.out.println("Volkswagen"+ marca);
                System.out.println("Gol"+ modelo);
                System.out.println("2017"+ Anodefabricação);
                System.out.println("30km" + Velocidadeatual);

                scanner.close();
            }  
        }
