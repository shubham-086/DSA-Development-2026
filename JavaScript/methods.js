// forEach, map, filter, reduce

const nums = [10, 15, 20, 25, 30];

// nums.forEach((n) => {
//   console.log(n);
// });

const nums_double = nums.map((n) => {
  return n * 2;
});

const nums_even = nums.filter((n) => n % 2 == 0);

const sum = nums.reduce((total, n) => total + n);

// console.log(sum);
