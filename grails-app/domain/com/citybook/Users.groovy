package com.citybook

class Users {
    String login
    String password
    String name
    String email

    static constraints = {
        login(unique:true)
        password(password:true)
        name()
    }
}
