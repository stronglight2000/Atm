import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void printInformation(){
        String username = "techmaster";
        String password = "hoclacoviec";
        int balance = 1000000;
        System.out.println("Username:" + username);
        System.out.println("Password:" + password);
        System.out.println("Balance:" + balance);
    }
    public static void withdrawMoney(){
        int balance = 1000000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền mà bạn muốn rút:");
        float money = Float.parseFloat(scanner.nextLine());
        if(money<=balance){
            System.out.println("Bạn đã rút"+"\t"+ money+"vào lúc"+"\t"+ LocalDateTime.now());

        }

        else{
            System.out.println("Số tiền bạn nhập không hợp lệ, vui lòng nhập lại:");
            System.out.println("Nhập số tiền mà bạn muốn rút:");
            money = Float.parseFloat(scanner.nextLine());
            if(money<=balance){
                System.out.println("Bạn đã rút"+"\t"+ money+"vào lúc"+"\t"+ LocalDateTime.now());

            }
            while (money>balance){
                System.out.println("Số tiền bạn nhập không hợp lệ, vui lòng nhập lại:");
            }
        }




    }
    public static void reEnter(){
        Scanner scanner = new Scanner(System.in);
        String Yes = "Y"; //So sánh chuỗi nếu người nhập đồng ý nhập tiếp
        System.out.println("Bạn có muốn tiếp tục không Y/N");
        String reply = scanner.nextLine();
        if(reply.equals(Yes)){
            System.out.println("Mời bạn lựa chọn các tính năng sau:");
            System.out.println("1. Xem thông tin tài khoản"+ "\n"+"2. Rút tiền");
            int viewInformation = Integer.parseInt(scanner.nextLine());
            if (viewInformation == 1){
                printInformation();
            }
            else if( viewInformation == 2){
                withdrawMoney();
            }
            else{
                System.out.println("Chức năng không hợp lệ mời bạn chọn lại");
                System.out.println("Mời bạn lựa chọn các tính năng sau:");
                System.out.println("1. Xem thông tin tài khoản"+ "\n"+"2. Rút tiền");
                viewInformation = Integer.parseInt(scanner.nextLine());

            }


        }
        else{
            System.exit(0);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "techmaster";
        String password = "hoclacoviec";
        String Yes = "Y"; //Tạo một biến chứa kí tự Y( tượng trưng yes) để so sánh với câu trả lời ng dùng nhập vào
        String reply = scanner.nextLine(); // Tạo một biến chuỗi chứa câu trả lời của ng dùng nhập vào
        System.out.println("Mời bạn nhập username:");
        String username1 = scanner.nextLine();
        System.out.println("Mời bạn nhập password");
        String password1 = scanner.nextLine();
        if(username1.equals(username) && password1.equals(password)){
            System.out.println("Mời bạn lựa chọn các tính năng sau:");
            System.out.println("1. Xem thông tin tài khoản"+ "\n"+"2. Rút tiền");
            int viewInformation = Integer.parseInt(scanner.nextLine());
            if(viewInformation == 1){
                printInformation();
                reEnter();

            }else if(viewInformation == 2){
                withdrawMoney();
                reEnter();

            }
            else{
                System.out.println("Chức năng không hợp lệ mời bạn chọn lại");
                System.out.println("Mời bạn lựa chọn các tính năng sau:");
                System.out.println("1. Xem thông tin tài khoản"+ "\n"+"2. Rút tiền");
                viewInformation = Integer.parseInt(scanner.nextLine());
            }

        }
        else{
            System.out.println("Bạn đã nhập sai thông tin, bạn có muốn nhập lại không? Y/N");
            reply = scanner.nextLine();
            if(reply.equals(Yes)){

                System.out.println("Mời bạn nhập username:");
                username1 = scanner.nextLine();
                System.out.println("Mời bạn nhập password");
                password1 = scanner.nextLine();
                if(username1.equals(username) && password1.equals(password)){
                    System.out.println("Mời bạn lựa chọn các tính năng sau:");
                    System.out.println("1. Xem thông tin tài khoản"+ "\n"+"2. Rút tiền");
                    int viewInformation = Integer.parseInt(scanner.nextLine());
                    if(viewInformation == 1){
                        printInformation();
                        reEnter();

                    }else if(viewInformation == 2){
                        withdrawMoney();
                        reEnter();

                    }
                    else{
                        System.out.println("Chức năng không hợp lệ mời bạn chọn lại");
                        System.out.println("Mời bạn lựa chọn các tính năng sau:");
                        System.out.println("1. Xem thông tin tài khoản"+ "\n"+"2. Rút tiền");
                        viewInformation = Integer.parseInt(scanner.nextLine());
                        if (viewInformation == 1){
                            printInformation();
                        }
                        else if(viewInformation == 2){
                            withdrawMoney();
                        }
                        else{
                            System.out.println("Chức năng không hợp lệ mời bạn chọn lại");}
                    }

                }
            }
            else{
                System.exit(0);
            }



        }





    }
}
