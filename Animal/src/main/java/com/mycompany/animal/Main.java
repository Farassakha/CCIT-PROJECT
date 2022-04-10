// POLYMORPHISM
//ONLY RUN ANIMALS
package com.mycompany.animal;


public class Main {
     public static void main(String[] args) {
  Cat cat = new Cat();
  Dog dog = new Dog();
  Lion lion = new Lion();
  
  Animal[]mammals = {cat,dog,lion};
          for(Animal a : mammals){
              a.voice();
          }
          }
          
     }
