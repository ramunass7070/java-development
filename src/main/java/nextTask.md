## Basics
1. Enter any value with several digits after the decimal point and assign it to variable
of type double. Display the given value rounded to two decimal places.
2. Enter two values of type int. Display their division casted to the double type and rounded to
the third decimal point.
3. Sum two integer variables initialized with maximal values for that type.
### Flow control, loops and arrays
1. Write an application that will show if entered value is greater, equal or lower than 30.
2. As above but compare two values at the same time. Verify if first value is greater than 30 and
second value is greater than 30, and so on.
3. As above but only one of the values has to be greater, equal or lower than 30.
4. Write an application that for any entered number between 0 and 9 will provide it's name. For
example for "3" program should print "three".
7. Write a "divide by" application. User should be able to enter initial value that will be divided
in a loop by a new value entered by a user. Division should occur as long, as entered value
will be different than 0. Result of division should be rounded to the fourth decimal point and
printed to the console.
8. Write a simple "echo" application, that will:
    - print back entered string,
    - go to the beginning of a loop if user will enter "continue",
    - break the loop with a "good bye!" message, if user will enter "quit".
9. Write an application that will find biggest value within array of int variables.
    - check your application using randomly generated array (use Random class),
    - check your application at least 5 times in a loop (generate random array -> print
array to the console -> find biggest value -> print biggest value -> manually verify
results).
10. Write an application that will find the longest char sequence within an array of type String.
Test it in the same way as you have done in the previous exercise. How will you generate
random char sequences?
### Object oriented programming
1. Grocery Shopping
    - Create class Product, it should contain at least two fields – name and price.
    - Create an empty array of Products – it's size should be at least 5.
    - Fill it within while loop. Simulate the process of doing shopping:
        - ask for a product,
        - add it to the cart (array),
        - change index,
        - if index will be greater than 5 – finish shopping,
        - *pay for the products.
2. Petrol Station
    - Simulate the process of refueling. Within the while loop ask user if you should
    continue or finish. For every entered "continue" command you should add a specific
    amount of petrol and money (both of type double) and view it on the console.
    - At the end user should pay for petrol. Consider multiple possibilities, like:
        - The user paid exactly as much as required.
        - The user paid too much (cashier should return the rest of the money).
        - The user paid too little – should be asked for the rest.
3. *Tic Tac Toe. Remember – keep it simple. You may use two-dimensional array to store the
results and empty fields. Prepare a method to view present state of the "board".
4. Parašyti programą, kuri pasakytų ar žodis yra palindromas ar ne. Palindromas yra žodis ar raidžių kratinys, kuris
    skaitomas vienodai tiek apsukus, tiek neapsukus žodžio. Pvz.: `abcba` - palindromas.
5. Cezario šifras yra pagrindinė šifravimo techniką, kurią naudojo Julijius Cezaris, komunikuojant su savo generolais. 
    Kiekviena raidė yra pakeista kita, kuri yra per N pozicijų į priekį abėcėlėje. 
    Pavyzdžiui, jei raidės poslinkis būtų 5, tai raidė `c` būtų pakeista raide `h`, raidė `k` pakeista į `p` ir t.t.
    * Suprogramuokite Cezario šifravimo mašiną, kai raidės poslinkis N = 5.
6. Ilgiausio palindromo radimas:
    * Programa turi skaityti raidžių kratinį/žodį iš failo ir rasti ilgiausią palindromą;
    * Visų žodių ilgiausią palindromą įrašyti į failą.
7. Fibonači seka:
    * Parašyti programą kuri, įrašius sekos numerį, išvestų rezultatą į ekraną;
    * Naudoti rekursyvią funkciją.
---

### Namų darbams:
Vėjai:
Sukurti Wind objektą, kuris turės parametrą speed;
  2. Nuskaitomas įvestas vejo greitis iš kliaviaturos km/h;
  3. Paverciamas vėjo greitis iš km/h -> greitis mazgais;
  4. Paversti vėjo greitį į Beuforto skalės matmeniu,naudojantis funkciją -> Math.pow(greitis, laipsnis) Beuforto skales formule = ((vejo greitis / 3.01) ^ 0.75);
  5. Beuforto skales matmuo negali buti didesnis nei 12 (12 yra maksimali reikšmė, kuri gali būti išvesta naudotojui į ekraną);
  6. Parašyti vėjo stiprumą, jei vejo greitis didesnis nei 20km -> stiprus.
Susikurti `Tractor` objektą, kuris turės laukus: TractorMaker (enum), model, tankSize, make (LocalDate), price
 1. Rasti brangiausią traktorių;
 2. Rasti naujausią traktorių;
 3. Rasti traktorius, kurių degalų bako dydis didesnis nei 300 litrų;
 4. Rasti modelius, kurie prasideda raide M.
Sukurti objektą `Computer`, kuris turės laukus: ComputerMaker (enum), price, Color (enum), madeYear (LocalDate)
  1. Surasti pigiausią kompiuterį;
  2. Surasti seniausiai pagamintą kompiuterį;
  3. Surasti kompiuterius, kurių gamintojo pavadinimas baigiasi raide 'L';
  4. Surasti kiek kompiuterių turi 'juodą' spalvą.
Parašyti programą, kuri pasakytų ar žodis yra palindromas ar ne. Palindromas yra žodis ar raidžių kratinys, kuris skaitomas vienodai tiek apsukus, tiek neapsukus žodžio. Pvz.: `abcba` - palindromas.
Cezario šifras yra pagrindinė šifravimo techniką, kurią naudojo Julijius Cezaris, komunikuojant su savo generolais. Kiekviena raidė yra pakeista kita, kuri yra per N pozicijų į priekį abėcėlėje. Pavyzdžiui, jei raidės poslinkis būtų 5, tai raidė `c` būtų pakeista raide `h`, raidė `k` pakeista į `p` ir t.t.
  Suprogramuokite Cezario šifravimo mašiną, kai raidės poslinkis N = 5.
  
  ---
###2020-07-11 darbas klaseje:

   ####Vehicle klase
    /*
     * Sukurti Vehicle klasę, kuri privalo turėti: 
    * vehycleType(AUTOMOBILE, MOTORCYCLE, TRACTOR, EXCAVATOR), 
    * model, 
     * weight, 
     * maxSpeed, 
    * price, 
     * makeYear
     *   Atspausdinti transporto priemonės objektą, jei modelio pavadinimas prasideda raide 'A';
     *   Atspausdinti visų AUTOMOBILE TP objektų pagaminimo metus;
     *   Atspausdinti visų MOTORCYCLE TP objektų maksimalų greitį;
     *   Atspausdinti visų TRACTOR TP objektų kainą;
     *   Atspausdinti visų EXCAVATOR TP objektų svorį;
     *   Atspausdinti TP gamintoją, kurių pagaminimo metai vėlesni nei 2018 ir maksimalus greitis mažesnis už 150 myliu per valandą;
     *  */
  
  ####Country klase
     /*
       *   Sukurti Country klasę, kuri turėst ypatybes (name, co2Emission, PollutionFactor - ANIMAL_HUSBANDRY, TRANSPORTATION, FACTORIES)
       *   Sukurti Continent klasę, kuri turės ypatybes (name, masyvą Country objektų);
       *       Inicializuoti 3 continent objektus, kiekvienam po 3 country objektus;
       *       Surasti labiausiai užterštą valstybę;
       *       Surasti mažiausiai užterštą žemyną;
       *       Apskaičiuoti visų žemynų bendrą užterštumą
       *   Pastaba: Jei didžiausias užterštumo faktorius šalyje yra:
       *      'ANIMAL_HUSBANDRY', tuomet šalies co2 kiekį dauginkite iš 1.2,
       *      'TRANSPORTATION', tuomet šalies co2 kiekį dauginkite iš 0.9,
       *      'FACTORIES', tuomet šalies co2 kiekį dauginkite iš 1.4
       * */
   ####City klase
       /*
        * Susikurti City klasę, kuri turės ypatybes (name, sizeInSquareKilometers, population), taip pat susikurti Country klasę,
        * kuri turės ypatybes (name, masyvą City objektų);
        *   Inicializuoti 3 šalis po 3 miestus kiekvienoje;
        *   Surasti didžiausią miestą kiekvienoje šalyje;
        *   Surasti didžiausią miestą iš visų šalių;
        *   Surasti mažiausią miestą pagal žmonių skaičių;
        *   Gauti visose šalyse gyvenančių žmonių bendrą skaičių;
        *   Surasti šalį, kurioje gyvena daugiausiai žmonių.
        * */
        
   ######Namų darbų užduotėlės:
        Parašyti programą, kuri skaitytų vieną žodį iš naudotojo įvesties, kurį naudotojas turi atspėti, t.y.: (nuskaitytas žodis: rytas)
                 Nuskaitomas žodis ir ekrane išspausdinama tiek apatinių pabraukimo ženklų: _, kiek žodis turi raidžių;
                 Žaidėjas gali įvesti arba 1 raidę, arba visą žodį;
                 Jei įvedama raidė ir ji yra žodyje, tuomet visos raidės atitinkančios įvestą yra atidengiamos, pvz: įvesta yra raidė s, ekrane naudotojas turi matyti: ____s ;
                 Jei įvedamas žodis ir jis atspėjamas - žaidimas baigiamas;
                 Kiekvieno spėjimo metu žaidėjui yra parodomas ėjimas ir paslėptas žodis.
         2. Tic Tac Toe. Remember – keep it simple. You may use two-dimensional array to store the results and empty fields. Prepare a method to view present state of the “board”. 