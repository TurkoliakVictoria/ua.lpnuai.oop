package com.company;
import java.util.Scanner;
public class MenuTool {
        private static final MenuTool INSTANCE;
        private StringHelper manager = new StringHelper();
        private Scanner scanner = new Scanner(System.in);
        static {
            System.out.println("FINAL");
            INSTANCE = new MenuTool();
        }

        private MenuTool(){
        }

        public static MenuTool getInstance(){
            return INSTANCE;
        }

        public void run() {
            System.out.println("Hello ");
            while (true) {
                showMenu();
                int act = scanner.nextInt();
                Menu menu = Menu.getMenu(act);
                switch (menu) {
                    case ADD_TEXT: {

                        manager.add();
                        break;
                    }
                    case ORDER_TEXT: {
                        System.out.println("How do you want to order 1-letter 2-length");
                        int k=scanner.nextInt();
                        if(k==1){
                        manager.orderByLetter();
                        }else if(k==2){
                            manager.orderByLength();
                        }
                        else System.out.println("try again");
                        break;
                    }
                    case DISPLAY_TEXT: {
                        manager.displayText();
                        manager.order();
                        break;
                    }
                    case HELP:{
                        System.out.println("The program is done by " +
                                " VictoriaTurkolyak " +
                                " KN-110 " +
                                " Variant 2 ");

                        System.out.println("1-Enter strings to work with");
                        System.out.println("2-Work with them");
                        System.out.println("3-See result");
                        System.out.println("4-exit from system");
                    break;}
                    case DEBUG:{
                        System.out.println("Debug is active");
                        manager.debugmod(true);
                        break;
                    }
                    case EXIT: {
                        System.out.println("Good bye");
                        return;

                    }
                    case DEFAULT: {
                    }
                    default: {
                        System.out.println("Unknown command !!!");
                    }
                }
            }

        }

        private void showMenu() {
            System.out.println("Choose your act");
            System.out.println("1) Add text");
            System.out.println("2) Order by letter/length");
            System.out.println("3) Display all students");
            System.out.println("4) Help");
            System.out.println("5) Debug mode");
            System.out.println("6)Exit");
        }

    }
