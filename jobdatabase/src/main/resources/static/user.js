class User{
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    showUser(){
        return "User's name is " + this.name + ". Age: " + this.age;
    }
}