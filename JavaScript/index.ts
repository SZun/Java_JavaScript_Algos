const getMap = (arr: string[]): any => {
  const obj = {};

  arr.forEach((i) => (obj[i] = i.toUpperCase()));

  return obj;
};

const main = () => {
  const arr: string[] = [
    "a",
    "b",
    "c",
    "d",
    "e",
    "f",
    "g",
    "h",
    "i",
    "j",
    "k",
    "l",
    "m",
    "n",
    "o",
    "p",
    "q",
    "r",
    "s",
    "t",
    "u",
    "v",
    "w",
    "x",
    "y",
    "z",
  ];
  console.log(getMap(arr));
};

main();
