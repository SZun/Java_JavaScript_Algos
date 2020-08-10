const isPalindrome = (str: string): boolean =>
  str.toLowerCase() == str.toLowerCase().split("").reverse().join("");

const main = () => {
  let arr = [
    "Anna",
    "Civic",
    "Kayak",
    "Level",
    "Madam",
    "Mom",
    "Noon",
    "Racecar",
  ];
  arr.forEach((i) => console.log(`${i} is a Palindrome ?: ${isPalindrome(i)}`));

  console.log("====================");

  arr = [
    "scrape",
    "minimum",
    "circle",
    "eject",
    "glacier",
    "cover",
    "digital",
    "pull",
    "bark",
    "fair",
  ];

  arr.forEach((i) => console.log(`${i} is a Palindrome ?: ${isPalindrome(i)}`));
};

main();
