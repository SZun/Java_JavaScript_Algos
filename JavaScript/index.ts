const revArr = (arr: any[]) => arr.reverse();

const main = () => {
  const arr = [1, 2, 3, 4, 5];
  const arr2 = ["1", "2", "3", "4", "5"];
  console.log(revArr(arr));
  console.log(revArr(arr2));
};

main();
