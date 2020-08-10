const findNumVowels = (str: string): number => {
  const vowelsArr = ["a", "e", "i", "o", "u"];
  let count = 0;

  for (var i = 0; i < str.length; i++) {
    if (vowelsArr.indexOf(str[i]) !== -1) count++;
  }

  return count;
};

const main = (): void => {
  console.log(findNumVowels("hello"));
  console.log(findNumVowels("why"));
};

main();
