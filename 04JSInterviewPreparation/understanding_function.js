//Invocing the function
var x = 1;
a();
b();

function a() {
  x = 10;
  console.log(x);
}

function b() {
  x = 100;
  console.log(x);
}

//undefined vs not defined

console.log(a);
var a = 7;

console.log(x); // it will give an error
