package com.company;

public enum Menu {
    ADD_TEXT(1, ""),
    ORDER_TEXT(2, ""),
    DISPLAY_TEXT(3, ""),
    HELP(4,""),
    DEBUG(5,""),
    EXIT(6,""),
    DEFAULT(-1);

    private int index;

    Menu(int index, String str){
        this.index = index;
    }

    Menu(int index) {

    }

    public static Menu getMenu(int index) {
        Menu[] values = values();

        for(Menu menu : values) {
            if(menu.index == index) {
                return menu;
            }
        }

        return DEFAULT;
    }
}
