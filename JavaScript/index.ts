const uniqueSort = (arr: number[]): number[] => Array.from(new Set(arr)).sort();

const main = () => {
  console.log(uniqueSort([1, 2, 4, 3]));
  console.log(uniqueSort([1, 4, 4, 4, 4, 4, 3, 2, 1, 2]));
  console.log(uniqueSort([6, 7, 3, 2, 1]));
};

main();
