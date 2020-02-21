package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        private TableInterface elment;

        public TableInterfaceWrapper(TableInterface elment){
            this.elment = elment;
        }

        @Override
        public void setModel(List rows){
            System.out.println(rows.size());
            elment.setModel(rows);
        }
        @Override
        public String getHeaderText(){
            return elment.getHeaderText().toUpperCase();
        }
        public void setHeaderText(String newHeaderText){
            elment.setHeaderText(newHeaderText);

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}