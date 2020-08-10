const stutter = (str: string): void => {
  const firstTwoLetters: string = str.substring(0, 2);
  console.log(firstTwoLetters + "..");
  console.log(firstTwoLetters + "..");
  console.log(str);
};

const main = () => {
  stutter("banan");
};

main();
