class Calculator {
  private num1: number;
  private num2: number;

  constructor(num1, num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  add(): number {
    return this.num1 + this.num2;
  }
  subtract(): number {
    return this.num1 - this.num2;
  }
  divide(): number {
    return this.num1 / this.num2;
  }
  multiply(): number {
    return this.num1 * this.num2;
  }
}

const main = () => {
  var calc = new Calculator(10, 5);
  console.log(calc.add());
  console.log(calc.subtract());
  console.log(calc.divide());
  console.log(calc.multiply());
};

main();
