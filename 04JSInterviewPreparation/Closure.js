// function x(y) {
//    var a = 7;
//   y(a);
// }

// x(function y(a) {
//     console.log(a);
//   });

//Ex.

// function x() {
//   var a = 7;
//   function y() {
//     console.log(a);
//   }
//   return y;
// }

// var z = x();
// console.log(z);
// z();

//Ex.

function x() {
  var a = 7;
  return function () {
    console.log(a);
  };
}

var z = x();
