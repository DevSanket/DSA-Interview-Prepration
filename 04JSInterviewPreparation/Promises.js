const cart = ["shoes", "pant", "kurta"];
// createOrder(cart, function () {
//   proceedToPayment(orderId);
// });

const promise = await createOrder(cart);

promise.then(function (orderId) {
  proceedToPayment(orderId);
});
