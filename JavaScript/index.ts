const XO = (str: string): boolean => {
  let xCount = 0;
  let oCount = 0;

  for (var i = 0; i < str.length; i++) {
    if (str[i].toLowerCase() == "x") xCount++;
    if (str[i].toLowerCase() == "o") oCount++;
  }

  return xCount == oCount;
};

const main = () => {
  console.log(XO("ooxx"));
  console.log(XO("xooxx"));
  console.log(XO("ooxXm"));
  console.log(XO("zpzpzpp"));
  console.log(XO("zzoo"));
};

main();
