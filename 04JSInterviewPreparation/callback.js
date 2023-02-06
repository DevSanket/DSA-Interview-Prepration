//Higher order function
// function x() {
//   console.log("Namaste");
// }

// function y(x) {
//   x();
// }

const radius = [3, 1, 2, 4];

//Repeatation bad practice
// const calculatedArea = function (radius) {
//   const output = [];
//   for (let i = 0; i < radius.length; i++) {
//     output.push(Math.PI * radius[i] * radius[i]);
//   }
//   return output;
// };

// const calculateCircurmference = function (radius) {
//   const output = [];
//   for (let i = 0; i < radius.length; i++) {
//     output.push(2 * Math.PI * radius[i]);
//   }

//   return output;
// };

// const calculateDiameter = function (radius) {
//   const output = [];
//   for (let i = 0; i < radius.length; i++) {
//     output.push(2 * radius[i]);
//   }
//   return output;
// };

const area = (radius) => {
  return Math.PI * radius * radius;
};

const circumference = (radius) => {
  return 2 * Math.PI * radius;
};

const diameter = (radius) => {
  return 2 * radius;
};

const calculate = (radius, logic) => {
  const output = [];
  for (let i = 0; i < radius.length; i++) {
    output.push(logic(radius[i]));
  }
  return output;
};

//find the area
console.log(calculate(radius, area));

//find the circumference
console.log(calculate(radius, circumference));

// for diameter
console.log(calculate(radius, diameter));
