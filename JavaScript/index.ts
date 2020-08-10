const addTheIndex = (arr: number[]): number[] => {
  arr.forEach((i, index) => {
    arr[index] = i += index;
  });

  return arr;
};

const main = () => {
  const arr: number[] = [1, 2, 3, 4, 5];
  console.log(addTheIndex(arr));
};

main();
