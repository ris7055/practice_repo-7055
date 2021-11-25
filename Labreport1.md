# Fundamentals of Programming(WIX1002)
#### Occ 02
## Lab Report 01

>Pseudocodes of Lab Report 01

>Write a program to check whether a triangle is valid or invalid. If the triangle is valid, 
check whether a triangle is Equilateral, Isosceles or Scalene
```
int a, b, c;
Enter length of each side of triangle:
while((a + b > c)&&(a + c > b)&&(b + c > a)){
Print "Valid Triangle"
if((a==b)&&(b==c)&&(c==a))
Print "Equilateral Triangle"
else if((a==b)||(b==c)||(c==a))
Print "Isosceles Triangle"
else Print "Scalene Triangle"; break;}
Enter length of each side of triangle:
//If the result is invalid then program will terminate;
if(!((a + b > c)&&(a + c > b)&&(b + c > a))
Print"Invalid Triangle"
```

>Write a program to generate two cards randomly and display the bigger card between 
them. The cards contain of two characteristic, color (Red, Blue, Green and Yellow) 
and value (1-10). The rules to identify the bigger card as below:

>a. The bigger the value, the bigger the card is, except 1 is bigger than 10.

>b. If the card is the same value, the color will be used to get the bigger card. 
Red > Blue > Green > Yellow
```
Generate random color_1, color_2 , value_1, value_2 ;
int num_1 = 0, num_2=0 ;
String COLOUR_1 = null, COLOUR_2 = null;
switch(color_1){
     case 0:
  COLOUR_1 = "Red";
  num_1 = 3;
  break; case 1:
  COLOUR_1 = "Blue";
  num_1 = 2;
  break; case 2:
  COLOUR_1 = "Green";
  num_1 = 1;
  break;case 3:
  COLOUR_1 = "Yellow";
  num_1 = 0 ;
  break;}
 Again,
 {switch(color_2){
     case 0:
  COLOUR_2 = "Red";
  num_2 = 3;
  break;case 1:
  COLOUR_2 = "Blue";
  num_2 = 2;
  break;case 2:
  COLOUR_2 = "Green";
  num_2 = 1;
  break; case 3:
  COLOUR_2 = "Yellow";
  num_2 = 0; 
  break;}
Print "Card 1 : colour_1"
Print "Card 2: colour_2"
if((value_1 == 10) && (value_2 ==1))      
     value_1 = 0;
 if((value_2 == 10) && (value_1 == 1))      
     value_2 = 0;
 if(value_1 > value_2)
Print "Card 1 is bigger"
Print "Card 2 is bigger"
```




