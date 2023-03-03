package com.example.listview;

public class Utilizador {
        String username;
        String password;

        public Utilizador() {
            username = " ";
            password = " ";
        }

        public Utilizador(String username, String password){
            this.username = username;
            this.password = password;
        }

        public Utilizador(Utilizador u){
            this.username = u.username;
            this.password = u.password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassord() {
            return password;
        }

        public void setPassord(String passord) {
            this.password = passord;
        }

        @Override
        public String toString() {
            return username+ " -->" +password;
        }
}
