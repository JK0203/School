// adds text in current location inside Document
document.write("<p>Hello World</p>");



function generateMessage(){
    document.getElementById("output").innerHTML = "Hello you";
}

function generateUsers(){
    var user1 = new User("Marcus", 32);
    var user2 = new User("Sandra", 35);

    user1.favoriteColor = "Green";

    document.getElementById("output").innerHTML = user2.showUser();

}