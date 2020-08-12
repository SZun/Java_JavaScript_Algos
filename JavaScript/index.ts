const isEnoughChange = (arr: number[], price: number): boolean => {
  const total: number =
    arr[0] * 0.25 + arr[1] * 0.1 + arr[2] * 0.05 + arr[3] * 0.01;
  return total >= price;
};

const main = () => {
  const prompt = "I have enough change?: ";

  console.log(prompt + isEnoughChange([2, 100, 0, 0], 14.11));
  console.log(prompt + isEnoughChange([0, 0, 20, 5], 0.75));
  console.log(prompt + isEnoughChange([30, 40, 20, 5], 12.55));
  console.log(prompt + isEnoughChange([10, 0, 0, 50], 3.85));
  console.log(prompt + isEnoughChange([1, 0, 5, 219], 19.99));
};

main();
