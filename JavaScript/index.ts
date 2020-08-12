const sortByLength = (arr: string[]): string[] => {
  // simple bubble sort
  for (var i = 0; i < arr.length - 1; i++) {
    for (var j = 0; j < arr.length - i - 1; j++) {
      if (arr[j].length > arr[j + 1].length) {
        const temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
  return arr;
};

const main = () => {
  console.log(sortByLength(["Google", "Apple", "Microsoft"]));
  console.log(
    sortByLength(["Leonardo", "Michelangelo", "Raphael", "Donatello"])
  );
  console.log(sortByLength(["Turing", "Einstein", "Jung"]));
};

main();
