const standInLine = (arr: number[], final: number): number[] | string => {
  arr.push(final);
  arr.shift();

  return arr.length > 0 ? arr : "No list has been selected";
};

const main = () => {
  console.log(standInLine([5, 6, 7, 8, 9], 1));
  console.log(standInLine([7, 6, 3, 23, 17], 10));
  console.log(standInLine([1, 10, 20, 42], 6));
  console.log(standInLine([], 6));
};

main();
