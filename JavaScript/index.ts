const getArr = (): number[] => {
  let arr: number[] = [];
  for (var i = 1; i < 31; i++) {
    arr.push(i);
  }
  return arr;
};

const fizzBuzz = (arr: number[]) => {
  arr.forEach((i) => {
    switch (true) {
      case i % 5 == 0 && i % 3 == 0:
        console.log("fizzbuzz");
        break;
      case i % 5 == 0:
        console.log("fizz");
        break;
      case i % 3 == 0:
        console.log("buzz");
        break;
      default:
        console.log(i);
    }
  });
};

const main = () => {
  fizzBuzz(getArr());
};

main();
