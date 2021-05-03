var myJSobj = {
    firstName : "Jakub",
    lastName : "Klys",
    age: 33,
    songs: ["Numb", "Somewhere I Belong", "Gangstas Paradise"]

};

myJSobj.age = 40;

var myJSONobj = JSON.stringify(myJSobj);

myJSONobj.age = "55";


document.write(myJSONobj);

var newJSONobj = '{"firstName":"Marcus","lastName":"Henriksson","age":32,"likes":["Computer Science","Strategy Games","Drawing","Playing the Piano"],"faveColor":"Green","faveSuperHero":{"firstName":"Bruce","lastName":"Wayne","age":56,"alterEgo":"Batman"}}'


//Konverterar JSON stringen till ett JS objekt
var obj = JSON.parse(newJSONobj);



//En For In loop för att gå igenom fälten i objektet.
var strOutput = '';
for (i in obj) {
    strOutput += i + ": " + obj[i] + "<br>";
}
for (i in obj.faveSuperHero) {
    strOutput += i + ": " + obj.faveSuperHero[i] + "<br>";
}



//Resultatet skrivs ut till en output tag.
document.getElementById("output").innerHTML = strOutput;